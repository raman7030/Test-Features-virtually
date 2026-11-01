package p067l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.slider.BaseSlider;

/* JADX INFO: renamed from: l.۬ۘ */
/* JADX INFO: compiled from: H5IM */
/* JADX INFO: loaded from: classes3.dex */
public final class C1480 {

    /* JADX INFO: renamed from: ᩻ */
    public static final ThreadLocal f41664 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f41659 = {-16842910};

    /* JADX INFO: renamed from: ᩳ */
    public static final int[] f41663 = {R.attr.state_focused};

    /* JADX INFO: renamed from: ܿ */
    public static final int[] f41662 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f41658 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f41661 = new int[0];

    /* JADX INFO: renamed from: ܳ */
    public static final int[] f41660 = new int[1];

    /* JADX INFO: renamed from: ۧ */
    public static int m33376(Context context, int i) {
        int[] iArr = f41660;
        iArr[0] = i;
        C1970 c1970M53128 = C1970.m53128(context, (AttributeSet) null, iArr);
        try {
            return c1970M53128.m53131(0);
        } finally {
            c1970M53128.m53146();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static ColorStateList m33377(Context context, int i) {
        int[] iArr = f41660;
        iArr[0] = i;
        C1970 c1970M53128 = C1970.m53128(context, (AttributeSet) null, iArr);
        try {
            return c1970M53128.m53137(0);
        } finally {
            c1970M53128.m53146();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33374(Context context, int i) {
        ColorStateList colorStateListM33377 = m33377(context, i);
        if (colorStateListM33377 != null && colorStateListM33377.isStateful()) {
            return colorStateListM33377.getColorForState(f41659, colorStateListM33377.getDefaultColor());
        }
        ThreadLocal threadLocal = f41664;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM33376 = m33376(context, i);
        return C1199.m21223(iM33376, Math.round(Color.alpha(iM33376) * f));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33375(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C1010.f13512);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
