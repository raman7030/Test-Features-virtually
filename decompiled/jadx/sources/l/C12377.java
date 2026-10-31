package l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12377 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21610 m30085(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C21610 c21610M48814 = C21610.m48814(null, rootWindowInsets);
        c21610M48814.m48820(c21610M48814);
        c21610M48814.m48818(view.getRootView());
        return c21610M48814;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30086(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30087(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30088(View view) {
        return view.getScrollIndicators();
    }
}
