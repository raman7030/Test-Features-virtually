package l;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes.dex */
public final class C22877 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50975(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LocaleList m50974(String str) {
        return LocaleList.forLanguageTags(str);
    }
}
