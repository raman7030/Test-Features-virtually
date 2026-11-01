package p067l;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: l.ܶܺ */
/* JADX INFO: compiled from: J62F */
/* JADX INFO: loaded from: classes4.dex */
public final class C1602 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f50097 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f50098 = new int[0];

    /* JADX INFO: renamed from: ܽ */
    public static final Rect f50099 = new Rect();

    /* JADX INFO: renamed from: ۧ */
    public static Rect m38506(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets insetsM23834 = C1252.m23834(drawable);
            return new Rect(insetsM23834.left, insetsM23834.top, insetsM23834.right, insetsM23834.bottom);
        }
        return C0902.m6294(C1248.m23655(drawable));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38505(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f50097;
        int[] iArr2 = f50098;
        if (i != 21 || !"android.graphics.drawable.VectorDrawable".equals(name)) {
            if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                return;
            }
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr);
        } else {
            drawable.setState(iArr2);
        }
        drawable.setState(state2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static PorterDuff.Mode m38504(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
