package p067l;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.᩻֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5IZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24587 {

    /* JADX INFO: renamed from: ֫ */
    public final EdgeEffect f77864;

    /* JADX INFO: renamed from: ֫ */
    public static float m54227(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C15869.m36002(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54228(EdgeEffect edgeEffect, float f, float f2) {
        C18552.m42236(edgeEffect, f, f2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static float m54229(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT < 31) {
            C18552.m42236(edgeEffect, f, f2);
            return f;
        }
        return C15869.m36003(edgeEffect, f, f2);
    }
}
