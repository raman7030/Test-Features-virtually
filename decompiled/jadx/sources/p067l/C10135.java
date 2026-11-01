package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10135 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m23615(String str) {
        InputStream resourceAsStream = C10135.class.getResourceAsStream(str);
        try {
            byte[] bArr = new byte[4];
            C23461.m52184(resourceAsStream, bArr, 4);
            if (C17548.m39928(0, bArr) != -1201511941) {
                throw new IOException("Bad magic");
            }
            byte[] bArrM4194 = C2700.m4194(resourceAsStream, 0);
            for (int i = 0; i < bArrM4194.length; i++) {
                bArrM4194[i] = (byte) (bArrM4194[i] ^ (bArrM4194.length / 2));
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return bArrM4194;
        } catch (Throwable th) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
