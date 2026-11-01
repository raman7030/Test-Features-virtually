package p067l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ܽᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18334 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24329 m41767(String str) {
        try {
            C18691 c18691 = new C18691(new StringReader(str));
            AbstractC24329 abstractC24329M41768 = m41768(c18691);
            abstractC24329M41768.getClass();
            if (!(abstractC24329M41768 instanceof C9577) && c18691.m42643() != EnumC16008.END_DOCUMENT) {
                throw new C16322("Did not consume the entire document.");
            }
            return abstractC24329M41768;
        } catch (C8633 e) {
            e = e;
            throw new C16322(e);
        } catch (IOException e2) {
            throw new C15611(e2);
        } catch (NumberFormatException e3) {
            e = e3;
            throw new C16322(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24329 m41768(C18691 c18691) {
        EnumC17663 enumC17663M42640 = c18691.m42640();
        if (enumC17663M42640 == EnumC17663.LEGACY_STRICT) {
            c18691.m42637(EnumC17663.LENIENT);
        }
        try {
            try {
                AbstractC24329 abstractC24329M47338 = C20998.m47338(c18691);
                c18691.m42637(enumC17663M42640);
                return abstractC24329M47338;
            } catch (Throwable th) {
                c18691.m42637(enumC17663M42640);
                throw th;
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new C12971("Failed parsing JSON source: " + c18691 + " to Json", e);
        }
    }
}
