package p067l;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: l.ۗܽ */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1008 {

    /* JADX INFO: renamed from: ֫ */
    public static final C1008 f13417 = new C1008();

    /* JADX INFO: renamed from: ֫ */
    public final OnBackInvokedCallback m12283(InterfaceC17797 interfaceC17797, InterfaceC17797 interfaceC17798, InterfaceC4387 interfaceC4387, InterfaceC4387 interfaceC4388) {
        C13045.m29867(interfaceC17797, "onBackStarted");
        C13045.m29867(interfaceC17798, "onBackProgressed");
        C13045.m29867(interfaceC4387, "onBackInvoked");
        C13045.m29867(interfaceC4388, "onBackCancelled");
        return new C1078(interfaceC17797, interfaceC17798, interfaceC4387, interfaceC4388);
    }
}
