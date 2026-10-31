package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13082 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C21610 m31716(View view) {
        return C14553.m34742(view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21610 m31694(View view, C21610 c21610, Rect rect) {
        WindowInsets windowInsetsM48823 = c21610.m48823();
        if (windowInsetsM48823 != null) {
            return C21610.m48814(view, view.computeSystemWindowInsets(windowInsetsM48823, rect));
        }
        rect.setEmpty();
        return c21610;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31699(View view, InterfaceC16610 interfaceC16610) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.MT_Protector, interfaceC16610);
        }
        if (interfaceC16610 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Protector));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC3205(view, interfaceC16610));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31701(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Protector);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31703(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31702(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static float m31718(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m31714(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31695(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31711(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static float m31712(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31698(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m31717(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m31713(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m31715(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31696(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ColorStateList m31693(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m31710(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31697(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31700(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m31709(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31704(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m31708(View view) {
        view.stopNestedScroll();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m31707(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31705(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31706(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }
}
