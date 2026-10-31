package l;

import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7438 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12437 m19974(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return C12437.m30598(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19972(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m19973(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19971(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m19975(View view) {
        return view.isImportantForContentCapture();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19970(View view) {
        return view.getImportantForContentCapture();
    }
}
