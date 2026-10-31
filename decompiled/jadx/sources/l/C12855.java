package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.slider.BaseSlider;

/* JADX INFO: renamed from: l.۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5IM */
/* JADX INFO: loaded from: classes3.dex */
public final class C12855 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f38620 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f38615 = {-16842910};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f38619 = {R.attr.state_focused};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f38618 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f38614 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f38617 = new int[0];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f38616 = new int[1];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31290(Context context, int i) {
        int[] iArr = f38616;
        iArr[0] = i;
        C22733 c22733M50795 = C22733.m50795(context, (AttributeSet) null, iArr);
        try {
            return c22733M50795.m50798(0);
        } finally {
            c22733M50795.m50813();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m31291(Context context, int i) {
        int[] iArr = f38616;
        iArr[0] = i;
        C22733 c22733M50795 = C22733.m50795(context, (AttributeSet) null, iArr);
        try {
            return c22733M50795.m50804(0);
        } finally {
            c22733M50795.m50813();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31288(Context context, int i) {
        ColorStateList colorStateListM31291 = m31291(context, i);
        if (colorStateListM31291 != null && colorStateListM31291.isStateful()) {
            return colorStateListM31291.getColorForState(f38615, colorStateListM31291.getDefaultColor());
        }
        ThreadLocal threadLocal = f38620;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM31290 = m31290(context, i);
        return C7191.m19276(iM31290, Math.round(Color.alpha(iM31290) * f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31289(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C3390.f10705);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
