package l;

import android.graphics.Point;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: l.ۧ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C57W */
/* JADX INFO: loaded from: classes3.dex */
public final class C11266 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float f33761;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static float f33765;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Point f33764 = new Point();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Point f33763 = new Point();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f33762 = false;

    static {
        DisplayMetrics displayMetrics = C4925.m14338().getDisplayMetrics();
        f33765 = displayMetrics.density;
        f33761 = displayMetrics.scaledDensity;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27878(float f) {
        return (int) ((f * f33765) + 0.5f);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m27879(float f) {
        return (int) ((f / f33761) + 0.5f);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m27880(float f) {
        return (int) ((f * f33761) + 0.5f);
    }
}
