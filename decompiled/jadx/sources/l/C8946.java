package l;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: l.ۡܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB8N */
/* JADX INFO: loaded from: classes3.dex */
public class C8946 extends X509Certificate {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final X509Certificate f27190;

    public C8946(X509Certificate x509Certificate) {
        this.f27190 = x509Certificate;
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return this.f27190.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        return this.f27190.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return this.f27190.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.f27190.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        this.f27190.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        this.f27190.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.f27190.getVersion();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.f27190.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return this.f27190.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return this.f27190.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.f27190.getNotBefore();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.f27190.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.f27190.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.f27190.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.f27190.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.f27190.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return this.f27190.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.f27190.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.f27190.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.f27190.getKeyUsage();
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.f27190.getBasicConstraints();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f27190.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f27190.verify(publicKey, str);
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        return this.f27190.toString();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        return this.f27190.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        return this.f27190.getIssuerX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        return this.f27190.getSubjectX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() {
        return this.f27190.getExtendedKeyUsage();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return this.f27190.getSubjectAlternativeNames();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return this.f27190.getIssuerAlternativeNames();
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        this.f27190.verify(publicKey, provider);
    }
}
