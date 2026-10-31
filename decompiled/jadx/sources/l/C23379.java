package l;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.᩻֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5IZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23379 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EdgeEffect f75118;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m51830(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C14206.m33870(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51831(EdgeEffect edgeEffect, float f, float f2) {
        C17029.m39991(edgeEffect, f, f2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m51832(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT < 31) {
            C17029.m39991(edgeEffect, f, f2);
            return f;
        }
        return C14206.m33871(edgeEffect, f, f2);
    }
}
