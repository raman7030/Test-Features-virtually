package l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ܽᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16799 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC23107 m39531(String str) {
        try {
            C17175 c17175 = new C17175(new StringReader(str));
            AbstractC23107 abstractC23107M39532 = m39532(c17175);
            abstractC23107M39532.getClass();
            if (!(abstractC23107M39532 instanceof C7585) && c17175.m40398() != EnumC14352.END_DOCUMENT) {
                throw new C14682("Did not consume the entire document.");
            }
            return abstractC23107M39532;
        } catch (C6592 e) {
            e = e;
            throw new C14682(e);
        } catch (IOException e2) {
            throw new C13934(e2);
        } catch (NumberFormatException e3) {
            e = e3;
            throw new C14682(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC23107 m39532(C17175 c17175) {
        EnumC16093 enumC16093M40395 = c17175.m40395();
        if (enumC16093M40395 == EnumC16093.LEGACY_STRICT) {
            c17175.m40392(EnumC16093.LENIENT);
        }
        try {
            try {
                AbstractC23107 abstractC23107M45043 = C19602.m45043(c17175);
                c17175.m40392(enumC16093M40395);
                return abstractC23107M45043;
            } catch (Throwable th) {
                c17175.m40392(enumC16093M40395);
                throw th;
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new C11156("Failed parsing JSON source: " + c17175 + " to Json", e);
        }
    }
}
