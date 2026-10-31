package l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩸ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21560 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C3215 f69272;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Property f69273;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f69272 = new C11682();
        } else if (i >= 23) {
            f69272 = new C6037();
        } else if (i >= 22) {
            f69272 = new C12387();
        } else {
            f69272 = new C3215();
        }
        f69273 = new C8154(Float.class, "translationAlpha");
        new C15208(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48715(View view, float f) {
        f69272.mo28565(view, f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m48713(View view) {
        return f69272.mo28564(view);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48720() {
        f69272.getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48714() {
        f69272.getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48716(View view, int i) {
        f69272.mo16873(view, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48718(View view, Matrix matrix) {
        f69272.mo9857(view, matrix);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48719(ViewGroup viewGroup, Matrix matrix) {
        f69272.mo9858(viewGroup, matrix);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48717(View view, int i, int i2, int i3, int i4) {
        f69272.mo28566(view, i, i2, i3, i4);
    }
}
