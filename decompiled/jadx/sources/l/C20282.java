package l;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: l.᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20282 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C20282 f65530 = new C20282();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OnBackInvokedCallback m46540(final InterfaceC2123 interfaceC2123) {
        C11233.m27805(interfaceC2123, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: l.᩹ܽ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                interfaceC2123.mo4049();
            }
        };
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46541(Object obj, int i, Object obj2) {
        C11233.m27805(obj, "dispatcher");
        C11233.m27805(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46542(Object obj, Object obj2) {
        C11233.m27805(obj, "dispatcher");
        C11233.m27805(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
