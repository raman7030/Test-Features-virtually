package p067l;

import android.view.KeyEvent;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C1981 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m53475(View view, int i) {
        return view.requireViewById(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m53474(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53476(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53479(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m53482(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m53483(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53481(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53478(View view, final InterfaceC1682 interfaceC1682) {
        C1012 c1012 = (C1012) view.getTag(R.id.MT_Protector);
        if (c1012 == null) {
            c1012 = new C1012();
            view.setTag(R.id.MT_Protector, c1012);
        }
        C12826.requireNonNull(interfaceC1682);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: l.ۨۨ
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return interfaceC1682.m42017();
            }
        };
        c1012.put(interfaceC1682, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53480(View view, InterfaceC1682 interfaceC1682) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1012 c1012 = (C1012) view.getTag(R.id.MT_Protector);
        if (c1012 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1012.getOrDefault(interfaceC1682, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53477(View view, C1590 c1590) {
        view.setAutofillId(null);
    }
}
