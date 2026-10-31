package l;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: l.ۖܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: GB8B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2596 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f8207 = "-----BEGIN CERTIFICATE-----".getBytes();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f8208 = "-----END CERTIFICATE-----".getBytes();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static CertificateFactory f8209;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static X509Certificate m8223(byte[] bArr) throws CertificateException {
        CertificateFactory certificateFactory = f8209;
        if (certificateFactory == null && certificateFactory == null) {
            try {
                f8209 = CertificateFactory.getInstance("X.509");
            } catch (CertificateException e) {
                throw new RuntimeException("Failed to create X.509 CertificateFactory", e);
            }
        }
        CertificateFactory certificateFactory2 = f8209;
        try {
            try {
                return (X509Certificate) certificateFactory2.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (CertificateException unused) {
                ByteBuffer byteBufferM8222 = m8222(ByteBuffer.wrap(bArr));
                int iPosition = byteBufferM8222.position();
                X509Certificate x509Certificate = (X509Certificate) certificateFactory2.generateCertificate(new ByteArrayInputStream(C10462.m26341((Certificate) C15399.m36436(byteBufferM8222, Certificate.class))));
                byte[] bArr2 = new byte[byteBufferM8222.position() - iPosition];
                byteBufferM8222.position(iPosition);
                byteBufferM8222.get(bArr2);
                return new C16000(x509Certificate, bArr2);
            }
        } catch (CertificateException | C6228 | C22456 e2) {
            throw new CertificateException("Failed to parse certificate", e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m8222(ByteBuffer byteBuffer) throws CertificateException {
        char c;
        if (byteBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = f8207;
        if (iRemaining < bArr.length) {
            return byteBuffer;
        }
        byteBuffer.mark();
        for (byte b : bArr) {
            if (byteBuffer.get() != b) {
                byteBuffer.reset();
                return byteBuffer;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining() && (c = (char) byteBuffer.get()) != '-') {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        int i = 1;
        while (true) {
            byte[] bArr2 = f8208;
            if (i < bArr2.length) {
                if (!byteBuffer.hasRemaining()) {
                    throw new CertificateException("The provided input contains the PEM certificate header but does not contain sufficient data for the footer");
                }
                if (byteBuffer.get() != bArr2[i]) {
                    throw new CertificateException("The provided input contains the PEM certificate header without a valid certificate footer");
                }
                i++;
            } else {
                byte[] bArrDecode = Base64.decode(sb.toString(), 2);
                int iPosition = byteBuffer.position();
                while (byteBuffer.hasRemaining() && Character.isWhitespace((char) byteBuffer.get())) {
                    iPosition++;
                }
                byteBuffer.position(iPosition);
                return ByteBuffer.wrap(bArrDecode);
            }
        }
    }
}
