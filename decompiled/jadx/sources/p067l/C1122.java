package p067l;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۚ᩺ */
/* JADX INFO: compiled from: X6B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1122 {
    /* JADX INFO: renamed from: ۧ */
    public static boolean m17877(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17874(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17871(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17872(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17873(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17876(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17875(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }
}
