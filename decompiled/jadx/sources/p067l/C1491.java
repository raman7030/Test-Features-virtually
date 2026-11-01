package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1491 {
    /* JADX INFO: renamed from: ᩳ */
    public static C1914 m33806(View view) {
        return C1564.m36891(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1914 m33784(View view, C1914 c1914, Rect rect) {
        WindowInsets windowInsetsM51171 = c1914.m51171();
        if (windowInsetsM51171 != null) {
            return C1914.m51162(view, view.computeSystemWindowInsets(windowInsetsM51171, rect));
        }
        rect.setEmpty();
        return c1914;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33789(View view, InterfaceC1666 interfaceC1666) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.MT_Protector, interfaceC1666);
        }
        if (interfaceC1666 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Protector));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1001(view, interfaceC1666));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33791(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Protector);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33793(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33792(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static float m33808(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m33804(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33785(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33801(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: ܳ */
    public static float m33802(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33788(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m33807(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: ܽ */
    public static float m33803(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m33805(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33786(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ColorStateList m33783(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: ۧ */
    public static PorterDuff.Mode m33800(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33787(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33790(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: ۢ */
    public static boolean m33799(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33794(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m33798(View view) {
        view.stopNestedScroll();
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m33797(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33795(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33796(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }
}
