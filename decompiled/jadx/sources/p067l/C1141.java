package p067l;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1141 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18784(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18781(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m18790(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18787(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m18793(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18788(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m18791(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18783(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static View m18778(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18782(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m18785(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m18792(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m18786(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18780(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m18789(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AutofillId m18779(View view) {
        return view.getAutofillId();
    }
}
