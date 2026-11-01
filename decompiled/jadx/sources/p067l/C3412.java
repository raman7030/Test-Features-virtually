package p067l;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֨ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5UQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3412 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f6769 = true;

    /* JADX INFO: renamed from: ֫ */
    public static void m6043(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C7436.m17185(viewGroup, z);
        } else if (f6769) {
            try {
                C7436.m17185(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f6769 = false;
            }
        }
    }
}
