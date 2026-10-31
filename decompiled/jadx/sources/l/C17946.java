package l;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩳۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17946 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16534 m41948(AbstractC15440 abstractC15440, long j, int i) {
        InputStream inputStreamMo27926 = abstractC15440.mo27926();
        try {
            C16534 c16534M41947 = m41947(inputStreamMo27926, j, i, C14460.m34532());
            inputStreamMo27926.close();
            return c16534M41947;
        } catch (Throwable th) {
            if (inputStreamMo27926 != null) {
                try {
                    inputStreamMo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16534 m41947(InputStream inputStream, long j, int i, MessageDigest messageDigest) throws C3059, IOException {
        long jMax;
        long jMin;
        long j2 = j;
        long jM48627 = C21474.m48627("byteOffset", j2, i);
        byte[] bArr = new byte[65536];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 == 0) {
                int i5 = inputStream.read();
                if (i5 < 0) {
                    break;
                }
                bArr[i2] = (byte) i5;
                i4 = 1;
                long jM48628 = C21474.m48627("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM48628, jM48627);
                if (jMax < jMin) {
                    int i6 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i6);
                    i3 += i6;
                }
                i2 = 0;
                j2 = j;
                j3 = jM48628;
            } else {
                if (i4 < 0) {
                    break;
                }
                long jM48629 = C21474.m48627("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM48629, jM48627);
                if (jMax < jMin) {
                    int i7 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i7);
                    i3 += i7;
                }
                i2 = 0;
                j2 = j;
                j3 = jM48629;
            }
        }
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr2, i2, bArr3, i2, i3);
        return new C16534(j, j3, C14460.m34531(messageDigest.digest()).substring(i2, 16), bArr3);
    }
}
