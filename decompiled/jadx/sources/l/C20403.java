package l;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: l.᩶᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20403 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11999 m46730(Reader reader, C21605 c21605, int i, C22519 c22519) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy text length limit");
        }
        C7060 c7060 = new C7060(c21605);
        int iMin = Math.min(1024, c21605.f69369);
        C23287 c23287 = new C23287(c21605, iMin);
        try {
            char[] cArrM51607 = c23287.m51607();
            while (true) {
                int i2 = reader.read(cArrM51607, 0, iMin);
                if (i2 == -1) {
                    C11999 c11999M19038 = c7060.m19038();
                    c23287.close();
                    return c11999M19038;
                }
                if (i2 <= 0 || i2 > iMin) {
                    throw new IOException("Legacy text reader made invalid progress");
                }
                if (((long) c7060.m19040()) + ((long) i2) > i) {
                    throw new IOException("Legacy text exceeds migration coordinate limit");
                }
                if (c22519 != null) {
                    c22519.m50494(cArrM51607, i2);
                }
                c7060.m19039(cArrM51607, i2);
            }
        } catch (Throwable th) {
            try {
                c23287.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
