package l;

import android.view.KeyEvent;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C22960 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m51084(View view, int i) {
        return view.requireViewById(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m51083(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51085(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51088(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m51091(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m51092(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51090(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51087(View view, final InterfaceC16942 interfaceC16942) {
        C3432 c3432 = (C3432) view.getTag(R.id.MT_Protector);
        if (c3432 == null) {
            c3432 = new C3432();
            view.setTag(R.id.MT_Protector, c3432);
        }
        C11003.requireNonNull(interfaceC16942);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: l.ۨۨ
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return interfaceC16942.m39776();
            }
        };
        c3432.put(interfaceC16942, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51089(View view, InterfaceC16942 interfaceC16942) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C3432 c3432 = (C3432) view.getTag(R.id.MT_Protector);
        if (c3432 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c3432.getOrDefault(interfaceC16942, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51086(View view, C15074 c15074) {
        view.setAutofillId(null);
    }
}
