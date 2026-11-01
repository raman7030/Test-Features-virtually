package p067l;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: l.᩵ۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C1802 {
    /* JADX INFO: renamed from: ֫ */
    public static void m46867(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (C12826.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
