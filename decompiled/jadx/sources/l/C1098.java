package l;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֨ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5UQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1098 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f3998 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3770(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C5332.m15278(viewGroup, z);
        } else if (f3998) {
            try {
                C5332.m15278(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f3998 = false;
            }
        }
    }
}
