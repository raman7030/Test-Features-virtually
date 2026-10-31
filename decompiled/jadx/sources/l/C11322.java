package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes4.dex */
public class C11322 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC9205 f33889;

    public C11322(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f33889 = componentCallbacksC9205;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        View view;
        if (enumC22901 != EnumC22901.ON_STOP || (view = this.f33889.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
