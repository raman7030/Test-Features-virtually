package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ᩳۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C19424 {
    /* JADX INFO: renamed from: ֫ */
    public static C18082 m44197(AbstractC17043 abstractC17043, long j, int i) {
        InputStream inputStreamMo29987 = abstractC17043.mo29987();
        try {
            C18082 c18082M44196 = m44196(inputStreamMo29987, j, i, C16111.m36666());
            inputStreamMo29987.close();
            return c18082M44196;
        } catch (Throwable th) {
            if (inputStreamMo29987 != null) {
                try {
                    inputStreamMo29987.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C18082 m44196(InputStream inputStream, long j, int i, MessageDigest messageDigest) throws C5276, IOException {
        long jMax;
        long jMin;
        long j2 = j;
        long jM50964 = C22777.m50964("byteOffset", j2, i);
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
                long jM50965 = C22777.m50964("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM50965, jM50964);
                if (jMax < jMin) {
                    int i6 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i6);
                    i3 += i6;
                }
                i2 = 0;
                j2 = j;
                j3 = jM50965;
            } else {
                if (i4 < 0) {
                    break;
                }
                long jM50966 = C22777.m50964("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM50966, jM50964);
                if (jMax < jMin) {
                    int i7 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i7);
                    i3 += i7;
                }
                i2 = 0;
                j2 = j;
                j3 = jM50966;
            }
        }
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr2, i2, bArr3, i2, i3);
        return new C18082(j, j3, C16111.m36665(messageDigest.digest()).substring(i2, 16), bArr3);
    }
}
