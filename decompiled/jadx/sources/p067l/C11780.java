package p067l;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۢ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public final class C11780 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f32909 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final char[] f32910 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27022(C8838 c8838, C19826 c19826, AbstractActivityC5549 abstractActivityC5549) {
        return (abstractActivityC5549 == null || !(abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed())) && c19826.m45074(c8838);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m27020(C11598 c11598, int i, int i2, C12134 c12134) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        if (i2 < 5 && m27019(c11598.length(), i, i2) > 524288) {
            throw new C19155();
        }
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(c12134);
        switch (i2) {
            case 0:
                C25190 c25190 = new C25190(c11598.length(), i, interfaceC18588M40721);
                c11598.m26691(c25190, c11598.length());
                return c25190.finish();
            case 1:
                C16472 c16472 = new C16472(c11598.length(), i, interfaceC18588M40721);
                c11598.m26691(c16472, c11598.length());
                return c16472.finish();
            case 2:
                C4403 c4403 = new C4403(c11598.length(), i, interfaceC18588M40721);
                c11598.m26691(c4403, c11598.length());
                return c4403.finish();
            case 3:
                C9451 c9451 = new C9451(c11598.length(), interfaceC18588M40721);
                c11598.m26691(c9451, c11598.length());
                return c9451.finish();
            case 4:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(524288L, m27019(c11598.length(), 1, 4)));
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                try {
                    c11598.m26691(new C13121(base64OutputStream, interfaceC18588M40721), c11598.length());
                    base64OutputStream.close();
                    return byteArrayOutputStream.toString(StandardCharsets.US_ASCII.name());
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 5:
                MessageDigest messageDigestM36666 = C16111.m36666();
                c11598.m26691(new C24203(interfaceC18588M40721, messageDigestM36666), c11598.length());
                return C16111.m36665(messageDigestM36666.digest()).toUpperCase();
            case 6:
                MessageDigest messageDigestM36660 = C16111.m36660();
                c11598.m26691(new C24203(interfaceC18588M40721, messageDigestM36660), c11598.length());
                return C16111.m36665(messageDigestM36660.digest()).toUpperCase();
            case 7:
                CRC32 crc32 = new CRC32();
                c11598.m26691(new C15485(interfaceC18588M40721, crc32), c11598.length());
                return String.format("%08X", Long.valueOf(crc32.getValue()));
            default:
                throw new IllegalArgumentException(C20778.m46922(i2, "which = "));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m27019(int i, int i2, int i3) {
        long j;
        long j2;
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException("Invalid copy range");
        }
        long j3 = i == 0 ? 0L : (((long) i) - 1) / ((long) i2);
        if (i3 == 0) {
            j = ((long) i) * 3;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    j2 = ((long) i) * 9;
                } else {
                    if (i3 == 3) {
                        return i;
                    }
                    if (i3 != 4) {
                        throw new IllegalArgumentException(C20778.m46922(i3, "which = "));
                    }
                    j3 = 2;
                    long j4 = ((((long) i) + 2) / 3) * 4;
                    j2 = (j4 / 76) + j4;
                }
                return j2 + j3;
            }
            j = ((long) i) * 4;
        }
        return j + j3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27021(StringBuilder sb) {
        if (sb.length() != 0) {
            sb.setCharAt(sb.length() - 1, '\n');
        }
    }
}
