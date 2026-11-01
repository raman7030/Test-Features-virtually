package p067l;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ۤ */
/* JADX INFO: compiled from: O529 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1804 {
    /* JADX INFO: renamed from: ֫ */
    public static ULocale m46960(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ULocale m46959(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m46961(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
