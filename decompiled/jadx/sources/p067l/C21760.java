package p067l;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: l.᩶᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21760 {
    /* JADX INFO: renamed from: ֫ */
    public static C13773 m49053(Reader reader, C22902 c22902, int i, C23771 c23771) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy text length limit");
        }
        C9079 c9079 = new C9079(c22902);
        int iMin = Math.min(1024, c22902.f72072);
        C24501 c24501 = new C24501(c22902, iMin);
        try {
            char[] cArrM54003 = c24501.m54003();
            while (true) {
                int i2 = reader.read(cArrM54003, 0, iMin);
                if (i2 == -1) {
                    C13773 c13773M20995 = c9079.m20995();
                    c24501.close();
                    return c13773M20995;
                }
                if (i2 <= 0 || i2 > iMin) {
                    throw new IOException("Legacy text reader made invalid progress");
                }
                if (((long) c9079.m20997()) + ((long) i2) > i) {
                    throw new IOException("Legacy text exceeds migration coordinate limit");
                }
                if (c23771 != null) {
                    c23771.m52836(cArrM54003, i2);
                }
                c9079.m20996(cArrM54003, i2);
            }
        } catch (Throwable th) {
            try {
                c24501.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
