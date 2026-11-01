package p067l;

import android.view.Window;

/* JADX INFO: renamed from: l.֡ܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0865 implements InterfaceC1714 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f4802;

    public C0865(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f4802 = layoutInflaterFactory2C1110;
    }

    @Override // p067l.InterfaceC1714
    public final void onCloseMenu(C0994 c0994, boolean z) {
        C0994 rootMenu = c0994.getRootMenu();
        boolean z2 = rootMenu != c0994;
        if (z2) {
            c0994 = rootMenu;
        }
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f4802;
        C1810 c1810M17365 = layoutInflaterFactory2C1110.m17365(c0994);
        if (c1810M17365 != null) {
            if (z2) {
                layoutInflaterFactory2C1110.m17346(c1810M17365.f65689, c1810M17365, rootMenu);
                layoutInflaterFactory2C1110.m17353(c1810M17365, true);
            } else {
                layoutInflaterFactory2C1110.m17353(c1810M17365, z);
            }
        }
    }

    @Override // p067l.InterfaceC1714
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4428(C0994 c0994) {
        Window.Callback callback;
        if (c0994 != c0994.getRootMenu()) {
            return true;
        }
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f4802;
        if (!layoutInflaterFactory2C1110.f19698 || (callback = layoutInflaterFactory2C1110.f19661.getCallback()) == null || layoutInflaterFactory2C1110.f19697) {
            return true;
        }
        callback.onMenuOpened(108, c0994);
        return true;
    }
}
