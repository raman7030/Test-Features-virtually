package p067l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩸ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22859 {

    /* JADX INFO: renamed from: ֫ */
    public static final C5424 f71974;

    /* JADX INFO: renamed from: ۧ */
    public static final Property f71975;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f71974 = new C13471();
        } else if (i >= 23) {
            f71974 = new C8106();
        } else if (i >= 22) {
            f71974 = new C14141();
        } else {
            f71974 = new C5424();
        }
        f71975 = new C10118(Float.class, "translationAlpha");
        new C16822(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51060(View view, float f) {
        f71974.mo30613(view, f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m51058(View view) {
        return f71974.mo30612(view);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m51065() {
        f71974.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51059() {
        f71974.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51061(View view, int i) {
        f71974.mo18801(view, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51063(View view, Matrix matrix) {
        f71974.mo11904(view, matrix);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51064(ViewGroup viewGroup, Matrix matrix) {
        f71974.mo11905(viewGroup, matrix);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51062(View view, int i, int i2, int i3, int i4) {
        f71974.mo30614(view, i, i2, i3, i4);
    }
}
