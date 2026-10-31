package l;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: l.ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3348 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C3348 f10609 = new C3348();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OnBackInvokedCallback m10247(InterfaceC16233 interfaceC16233, InterfaceC16233 interfaceC16234, InterfaceC2123 interfaceC2123, InterfaceC2123 interfaceC2124) {
        C11233.m27805(interfaceC16233, "onBackStarted");
        C11233.m27805(interfaceC16234, "onBackProgressed");
        C11233.m27805(interfaceC2123, "onBackInvoked");
        C11233.m27805(interfaceC2124, "onBackCancelled");
        return new C4759(interfaceC16233, interfaceC16234, interfaceC2123, interfaceC2124);
    }
}
