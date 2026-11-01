package p067l;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: l.᩹ܿ */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1954 {
    /* JADX INFO: renamed from: ֫ */
    public static void m52687(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static LocaleList m52686(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
