package p067l;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB8Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C17575 extends C10871 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩶ */
    public int f52530;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f52531;

    public C17575(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f52530 = -1;
        this.f52531 = (byte[]) bArr.clone();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        byte[] bArr = this.f52531;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (this.f52530 == -1) {
            try {
                this.f52530 = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.f52530 = 0;
            }
        }
        return this.f52530;
    }
}
