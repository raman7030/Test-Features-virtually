package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import l.C20195;
import l.C5127;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class X509CRLImpl extends X509CRL {
    public JcaJceHelper bcHelper;
    public CertificateList c;
    public boolean isIndirect;
    public String sigAlgName;
    public byte[] sigAlgParams;

    public X509CRLImpl(JcaJceHelper jcaJceHelper, CertificateList certificateList, String str, byte[] bArr, boolean z) {
        this.bcHelper = jcaJceHelper;
        this.c = certificateList;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
        this.isIndirect = z;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        if (!X509SignatureUtil.areEquivalentAlgorithms(this.c.getSignatureAlgorithm(), this.c.getTBSCertList().getSignature())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TbsCertList.");
        }
        X509SignatureUtil.setSignatureParameters(signature, aSN1Encodable);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(OutputStreamFactory.createStream(signature), 512);
            this.c.getTBSCertList().encodeTo(bufferedOutputStream, ASN1Encoding.DER);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private Set getExtensionOIDs(boolean z) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.c.getExtensions()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (z == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    public static byte[] getExtensionOctets(CertificateList certificateList, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ASN1OctetString extensionValue = Extensions.getExtensionValue(certificateList.getExtensions(), aSN1ObjectIdentifier);
        if (extensionValue == null) {
            return null;
        }
        return extensionValue.getOctets();
    }

    private Set loadCRLEntries() {
        Extension extension;
        HashSet hashSet = new HashSet();
        Enumeration revokedCertificateEnumeration = this.c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            hashSet.add(new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name));
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return X509SignatureUtil.getExtensionValue(this.c.getExtensions(), str);
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new X509Principal(X500Name.getInstance(this.c.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.c.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        Time nextUpdate = this.c.getNextUpdate();
        if (nextUpdate == null) {
            return null;
        }
        return nextUpdate.getDate();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        Enumeration revokedCertificateEnumeration = this.c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().hasValue(bigInteger)) {
                return new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name);
            }
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set setLoadCRLEntries = loadCRLEntries();
        if (setLoadCRLEntries.isEmpty()) {
            return null;
        }
        return C20195.unmodifiableSet(setLoadCRLEntries);
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return Arrays.clone(this.sigAlgParams);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.c.getTBSCertList().getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.c.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.c.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.c.getExtensions()) == null) {
            return false;
        }
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (!Extension.issuingDistributionPoint.equals((ASN1Primitive) aSN1ObjectIdentifier) && !Extension.deltaCRLIndicator.equals((ASN1Primitive) aSN1ObjectIdentifier) && extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        X500Name issuer;
        Extension extension;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        Enumeration revokedCertificateEnumeration = this.c.getRevokedCertificateEnumeration();
        X500Name issuer2 = this.c.getIssuer();
        if (revokedCertificateEnumeration.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                TBSCertList.CRLEntry cRLEntry = TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                    issuer2 = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                }
                if (cRLEntry.getUserCertificate().hasValue(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        issuer = X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            issuer = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: " + e.getMessage());
                        }
                    }
                    return issuer2.equals(issuer);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x007b  */
    /* JADX WARN: Code duplicated, block: B:12:0x008b  */
    /* JADX WARN: Code duplicated, block: B:15:0x00b1 A[Catch: Exception -> 0x0137, TryCatch #0 {Exception -> 0x0137, blocks: (B:13:0x00a9, B:15:0x00b1, B:28:0x0119, B:31:0x0132, B:16:0x00c3, B:18:0x00cb, B:30:0x012f, B:19:0x00ee, B:21:0x00f6, B:22:0x00ff, B:24:0x0107, B:25:0x0110, B:29:0x011d), top: B:45:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x00c3 A[Catch: Exception -> 0x0137, TryCatch #0 {Exception -> 0x0137, blocks: (B:13:0x00a9, B:15:0x00b1, B:28:0x0119, B:31:0x0132, B:16:0x00c3, B:18:0x00cb, B:30:0x012f, B:19:0x00ee, B:21:0x00f6, B:22:0x00ff, B:24:0x0107, B:25:0x0110, B:29:0x011d), top: B:45:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00cb A[Catch: Exception -> 0x0137, TryCatch #0 {Exception -> 0x0137, blocks: (B:13:0x00a9, B:15:0x00b1, B:28:0x0119, B:31:0x0132, B:16:0x00c3, B:18:0x00cb, B:30:0x012f, B:19:0x00ee, B:21:0x00f6, B:22:0x00ff, B:24:0x0107, B:25:0x0110, B:29:0x011d), top: B:45:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00ee A[Catch: Exception -> 0x0137, TryCatch #0 {Exception -> 0x0137, blocks: (B:13:0x00a9, B:15:0x00b1, B:28:0x0119, B:31:0x0132, B:16:0x00c3, B:18:0x00cb, B:30:0x012f, B:19:0x00ee, B:21:0x00f6, B:22:0x00ff, B:24:0x0107, B:25:0x0110, B:29:0x011d), top: B:45:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00f6 A[Catch: Exception -> 0x0137, TryCatch #0 {Exception -> 0x0137, blocks: (B:13:0x00a9, B:15:0x00b1, B:28:0x0119, B:31:0x0132, B:16:0x00c3, B:18:0x00cb, B:30:0x012f, B:19:0x00ee, B:21:0x00f6, B:22:0x00ff, B:24:0x0107, B:25:0x0110, B:29:0x011d), top: B:45:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00ff A[Catch: Exception -> 0x0137, TryCatch #0 {Exception -> 0x0137, blocks: (B:13:0x00a9, B:15:0x00b1, B:28:0x0119, B:31:0x0132, B:16:0x00c3, B:18:0x00cb, B:30:0x012f, B:19:0x00ee, B:21:0x00f6, B:22:0x00ff, B:24:0x0107, B:25:0x0110, B:29:0x011d), top: B:45:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0110 A[Catch: Exception -> 0x0137, TryCatch #0 {Exception -> 0x0137, blocks: (B:13:0x00a9, B:15:0x00b1, B:28:0x0119, B:31:0x0132, B:16:0x00c3, B:18:0x00cb, B:30:0x012f, B:19:0x00ee, B:21:0x00f6, B:22:0x00ff, B:24:0x0107, B:25:0x0110, B:29:0x011d), top: B:45:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x014a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0089 -> B:35:0x014a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x008b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.toString():java.lang.String");
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CRLImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        doVerify(publicKey, new SignatureCreator(this) { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.2
            public final /* synthetic */ X509CRLImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        try {
            doVerify(publicKey, new SignatureCreator(this) { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.3
                public final /* synthetic */ X509CRLImpl this$0;

                {
                    this.this$0 = this;
                }

                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    return provider != null ? Signature.getInstance(this.this$0.getSigAlgName(), provider) : Signature.getInstance(this.this$0.getSigAlgName());
                }
            });
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: " + e.getMessage());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        if (!this.c.getSignatureAlgorithm().equals(this.c.getTBSCertList().getSignature())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        int i = 0;
        if ((publicKey instanceof CompositePublicKey) && X509SignatureUtil.isCompositeAlgorithm(this.c.getSignatureAlgorithm())) {
            List publicKeys = ((CompositePublicKey) publicKey).getPublicKeys();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.c.getSignatureAlgorithm().getParameters());
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(this.c.getSignature().getOctets());
            boolean z = false;
            while (i != publicKeys.size()) {
                if (publicKeys.get(i) != null) {
                    AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
                    try {
                        checkSignature((PublicKey) publicKeys.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(algorithmIdentifier)), algorithmIdentifier.getParameters(), ASN1BitString.getInstance(aSN1Sequence2.getObjectAt(i)).getOctets());
                        z = true;
                        e = null;
                    } catch (SignatureException e) {
                        e = e;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (!z) {
                throw new InvalidKeyException("no matching key found");
            }
            return;
        }
        if (!X509SignatureUtil.isCompositeAlgorithm(this.c.getSignatureAlgorithm())) {
            Signature signatureCreateSignature = signatureCreator.createSignature(getSigAlgName());
            byte[] bArr = this.sigAlgParams;
            if (bArr == null) {
                checkSignature(publicKey, signatureCreateSignature, null, getSignature());
                return;
            }
            try {
                checkSignature(publicKey, signatureCreateSignature, ASN1Primitive.fromByteArray(bArr), getSignature());
                return;
            } catch (IOException e2) {
                throw new SignatureException(C5127.m14678(e2, new StringBuilder("cannot decode signature parameters: ")));
            }
        }
        ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(this.c.getSignatureAlgorithm().getParameters());
        ASN1Sequence aSN1Sequence4 = ASN1Sequence.getInstance(this.c.getSignature().getOctets());
        boolean z2 = false;
        while (i != aSN1Sequence4.size()) {
            AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(aSN1Sequence3.getObjectAt(i));
            try {
                checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(algorithmIdentifier2)), algorithmIdentifier2.getParameters(), ASN1BitString.getInstance(aSN1Sequence4.getObjectAt(i)).getOctets());
                z2 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            } catch (SignatureException e3) {
                e = e3;
            }
            e = null;
            if (e != null) {
                throw e;
            }
            i++;
        }
        if (!z2) {
            throw new InvalidKeyException("no matching key found");
        }
    }
}
