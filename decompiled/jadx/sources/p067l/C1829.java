package p067l;

import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶ۗ */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C1829 {
    /* JADX INFO: renamed from: ֫ */
    public static void m48057(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C1934.m51865(theme);
        } else if (i >= 23) {
            C1899.m50667(theme);
        }
    }
}
