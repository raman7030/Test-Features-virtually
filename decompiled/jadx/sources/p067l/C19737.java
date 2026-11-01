package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAAW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19737 extends AbstractC18395 {
    /* JADX INFO: renamed from: ֫ */
    public static void m44866(C20066 c20066) throws IOException {
        AbstractC18395.m41869(c20066);
        AbstractC2630 abstractC2630M45436 = c20066.m45436();
        if (abstractC2630M45436 != null) {
            try {
                InputStream inputStreamM4011 = abstractC2630M45436.m4011();
                try {
                    do {
                    } while (inputStreamM4011.read(new byte[1024]) >= 0);
                    inputStreamM4011.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM4011.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    abstractC2630M45436.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (abstractC2630M45436 != null) {
            abstractC2630M45436.close();
        }
    }
}
