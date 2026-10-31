package l;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: l.ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62F */
/* JADX INFO: loaded from: classes4.dex */
public final class C15320 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f46971 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f46972 = new int[0];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Rect f46973 = new Rect();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Rect m36348(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets insetsM21864 = C8266.m21864(drawable);
            return new Rect(insetsM21864.left, insetsM21864.top, insetsM21864.right, insetsM21864.bottom);
        }
        return C1210.m4050(C8184.m21686(drawable));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36347(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f46971;
        int[] iArr2 = f46972;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m36346(int i, PorterDuff.Mode mode) {
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
