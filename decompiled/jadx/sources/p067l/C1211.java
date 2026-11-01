package p067l;

import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.۟ۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1211 {
    /* JADX INFO: renamed from: ܽ */
    public static C1459 m21949(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return C1459.m32663(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21947(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public static CharSequence m21948(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21946(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m21950(View view) {
        return view.isImportantForContentCapture();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m21945(View view) {
        return view.getImportantForContentCapture();
    }
}
