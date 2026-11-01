package p067l;

import android.graphics.Point;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: l.ۧ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C57W */
/* JADX INFO: loaded from: classes3.dex */
public final class C13076 {

    /* JADX INFO: renamed from: ֫ */
    public static float f36761;

    /* JADX INFO: renamed from: ᩳ */
    public static float f36765;

    /* JADX INFO: renamed from: ܿ */
    public static final Point f36764 = new Point();

    /* JADX INFO: renamed from: ܽ */
    public static final Point f36763 = new Point();

    /* JADX INFO: renamed from: ۧ */
    public static boolean f36762 = false;

    static {
        DisplayMetrics displayMetrics = C7050.m16235().getDisplayMetrics();
        f36765 = displayMetrics.density;
        f36761 = displayMetrics.scaledDensity;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m29939(float f) {
        return (int) ((f * f36765) + 0.5f);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m29940(float f) {
        return (int) ((f / f36761) + 0.5f);
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m29941(float f) {
        return (int) ((f * f36761) + 0.5f);
    }
}
