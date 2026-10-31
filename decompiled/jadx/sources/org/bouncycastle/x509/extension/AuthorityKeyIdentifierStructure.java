package org.bouncycastle.x509.extension;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.jce.PrincipalUtil;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorityKeyIdentifierStructure extends AuthorityKeyIdentifier {
    public AuthorityKeyIdentifierStructure(PublicKey publicKey) {
        super(fromKey(publicKey));
    }

    public AuthorityKeyIdentifierStructure(X509Certificate x509Certificate) {
        super(fromCertificate(x509Certificate));
    }

    public AuthorityKeyIdentifierStructure(Extension extension) {
        super((ASN1Sequence) extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(X509Extension x509Extension) {
        super((ASN1Sequence) x509Extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(byte[] bArr) {
        super((ASN1Sequence) X509ExtensionUtil.fromExtensionValue(bArr));
    }

    public static ASN1Sequence fromKey(PublicKey publicKey) throws InvalidKeyException {
        try {
            return (ASN1Sequence) new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())).toASN1Primitive();
        } catch (Exception e) {
            throw new InvalidKeyException("can't process key: " + e);
        }
    }

    public static ASN1Sequence fromCertificate(X509Certificate x509Certificate) throws CertificateParsingException {
        byte[] extensionValue;
        try {
            GeneralNames generalNames = new GeneralNames(new GeneralName(PrincipalUtil.getIssuerX509Principal(x509Certificate)));
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            return (ASN1Sequence) ((x509Certificate.getVersion() != 3 || (extensionValue = x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId())) == null) ? new AuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()), generalNames, serialNumber) : new AuthorityKeyIdentifier(((ASN1OctetString) X509ExtensionUtil.fromExtensionValue(extensionValue)).getOctets(), generalNames, serialNumber)).toASN1Primitive();
        } catch (Exception e) {
            throw new CertificateParsingException(ASN1BMPString$$ExternalSyntheticOutline0.m(e, new StringBuilder("Exception extracting certificate details: ")));
        }
    }
}
