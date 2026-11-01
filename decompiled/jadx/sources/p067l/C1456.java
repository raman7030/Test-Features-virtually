package p067l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.۫ۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1456 {
    /* JADX INFO: renamed from: ֫ */
    public static C1914 m32149(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1914 c1914M51162 = C1914.m51162(null, rootWindowInsets);
        c1914M51162.m51168(c1914M51162);
        c1914M51162.m51166(view.getRootView());
        return c1914M51162;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32150(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32151(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m32152(View view) {
        return view.getScrollIndicators();
    }
}
