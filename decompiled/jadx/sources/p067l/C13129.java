package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public class C13129 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ComponentCallbacksC11117 f36888;

    public C13129(ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f36888 = componentCallbacksC11117;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        View view;
        if (enumC24133 != EnumC24133.ON_STOP || (view = this.f36888.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
