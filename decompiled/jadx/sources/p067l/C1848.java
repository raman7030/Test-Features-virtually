package p067l;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: l.᩶ܽ */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1848 {

    /* JADX INFO: renamed from: ֫ */
    public static final C1848 f68205 = new C1848();

    /* JADX INFO: renamed from: ֫ */
    public final OnBackInvokedCallback m48862(final InterfaceC4387 interfaceC4387) {
        C13045.m29867(interfaceC4387, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: l.᩹ܽ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                interfaceC4387.mo6293();
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48863(Object obj, int i, Object obj2) {
        C13045.m29867(obj, "dispatcher");
        C13045.m29867(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48864(Object obj, Object obj2) {
        C13045.m29867(obj, "dispatcher");
        C13045.m29867(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
