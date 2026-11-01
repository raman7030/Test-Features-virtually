package p067l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܽܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C1670 extends C3395 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1740 f54408;

    public C1670(C1740 c1740) {
        this.f54408 = c1740;
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f54408.f59567;
        layoutInflaterFactory2C1110.f19678.setVisibility(8);
        PopupWindow popupWindow = layoutInflaterFactory2C1110.f19658;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflaterFactory2C1110.f19678.getParent() instanceof View) {
            C1717.m43585((View) layoutInflaterFactory2C1110.f19678.getParent());
        }
        layoutInflaterFactory2C1110.f19678.m52860();
        layoutInflaterFactory2C1110.f19672.m38762((InterfaceC1927) null);
        layoutInflaterFactory2C1110.f19672 = null;
        C1717.m43585(layoutInflaterFactory2C1110.f19686);
    }
}
