package l;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6027 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16856(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16853(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m16862(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16859(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m16865(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16860(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m16863(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16855(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m16850(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16854(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m16857(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m16864(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m16858(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16852(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m16861(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AutofillId m16851(View view) {
        return view.getAutofillId();
    }
}
