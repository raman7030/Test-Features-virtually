package p067l;

import android.view.Window;

/* JADX INFO: renamed from: l.ۧܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C1390 implements InterfaceC1714 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f36221;

    public C1390(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f36221 = layoutInflaterFactory2C1110;
    }

    @Override // p067l.InterfaceC1714
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4428(C0994 c0994) {
        Window.Callback callback = this.f36221.f19661.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, c0994);
        return true;
    }

    @Override // p067l.InterfaceC1714
    public final void onCloseMenu(C0994 c0994, boolean z) {
        this.f36221.m17351(c0994);
    }
}
