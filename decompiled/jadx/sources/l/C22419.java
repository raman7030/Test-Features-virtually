package l;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: l.᩹ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22419 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50346(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LocaleList m50345(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
