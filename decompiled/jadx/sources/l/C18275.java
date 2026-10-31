package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAAW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18275 extends AbstractC16863 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42607(C18621 c18621) throws IOException {
        AbstractC16863.m39633(c18621);
        AbstractC0275 abstractC0275M43170 = c18621.m43170();
        if (abstractC0275M43170 != null) {
            try {
                InputStream inputStreamM1611 = abstractC0275M43170.m1611();
                try {
                    do {
                    } while (inputStreamM1611.read(new byte[1024]) >= 0);
                    inputStreamM1611.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM1611.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    abstractC0275M43170.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (abstractC0275M43170 != null) {
            abstractC0275M43170.close();
        }
    }
}
