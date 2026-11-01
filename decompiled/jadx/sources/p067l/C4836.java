package p067l;

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
public final class C4836 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f10999 = "-----BEGIN CERTIFICATE-----".getBytes();

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f11000 = "-----END CERTIFICATE-----".getBytes();

    /* JADX INFO: renamed from: ܽ */
    public static CertificateFactory f11001;

    /* JADX INFO: renamed from: ֫ */
    public static X509Certificate m10262(byte[] bArr) throws CertificateException {
        CertificateFactory certificateFactory = f11001;
        if (certificateFactory == null && certificateFactory == null) {
            try {
                f11001 = CertificateFactory.getInstance("X.509");
            } catch (CertificateException e) {
                throw new RuntimeException("Failed to create X.509 CertificateFactory", e);
            }
        }
        CertificateFactory certificateFactory2 = f11001;
        try {
            try {
                return (X509Certificate) certificateFactory2.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (CertificateException unused) {
                ByteBuffer byteBufferM10261 = m10261(ByteBuffer.wrap(bArr));
                int iPosition = byteBufferM10261.position();
                X509Certificate x509Certificate = (X509Certificate) certificateFactory2.generateCertificate(new ByteArrayInputStream(C12312.m28371((Certificate) C17004.m38594(byteBufferM10261, Certificate.class))));
                byte[] bArr2 = new byte[byteBufferM10261.position() - iPosition];
                byteBufferM10261.position(iPosition);
                byteBufferM10261.get(bArr2);
                return new C17575(x509Certificate, bArr2);
            }
        } catch (CertificateException | C8288 | C23711 e2) {
            throw new CertificateException("Failed to parse certificate", e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ByteBuffer m10261(ByteBuffer byteBuffer) throws CertificateException {
        char c;
        if (byteBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = f10999;
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
            byte[] bArr2 = f11000;
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
