package l;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: l.᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C19351 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44573(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (C11003.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
