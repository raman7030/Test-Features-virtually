package p067l;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: l.ۙܽ */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1078 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC4387 f17944;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC4387 f17945;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC17797 f17946;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ InterfaceC17797 f17947;

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        C13045.m29867(backEvent, "backEvent");
        this.f17946.invoke(new C1840(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        C13045.m29867(backEvent, "backEvent");
        this.f17947.invoke(new C1840(backEvent));
    }

    public C1078(InterfaceC17797 interfaceC17797, InterfaceC17797 interfaceC17798, InterfaceC4387 interfaceC4387, InterfaceC4387 interfaceC4388) {
        this.f17947 = interfaceC17797;
        this.f17946 = interfaceC17798;
        this.f17945 = interfaceC4387;
        this.f17944 = interfaceC4388;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f17945.mo6293();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f17944.mo6293();
    }
}
