package l;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X6B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5654 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m15949(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15946(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15943(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15944(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15945(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15948(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15947(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }
}
