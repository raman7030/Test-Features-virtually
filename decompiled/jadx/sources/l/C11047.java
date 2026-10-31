package l;

import android.view.Window;

/* JADX INFO: renamed from: l.ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C11047 implements InterfaceC17585 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f33220;

    public C11047(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f33220 = layoutInflaterFactory2C5402;
    }

    @Override // l.InterfaceC17585
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2048(C3060 c3060) {
        Window.Callback callback = this.f33220.f16823.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, c3060);
        return true;
    }

    @Override // l.InterfaceC17585
    public final void onCloseMenu(C3060 c3060, boolean z) {
        this.f33220.m15440(c3060);
    }
}
