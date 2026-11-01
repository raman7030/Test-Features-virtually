package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰܿ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C1534 extends C3395 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f44718;

    public C1534(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f44718 = layoutInflaterFactory2C1110;
    }

    @Override // p067l.C3395, p067l.InterfaceC1927
    /* JADX INFO: renamed from: ֫ */
    public final void mo5940() {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f44718;
        layoutInflaterFactory2C1110.f19678.setVisibility(0);
        if (layoutInflaterFactory2C1110.f19678.getParent() instanceof View) {
            C1717.m43585((View) layoutInflaterFactory2C1110.f19678.getParent());
        }
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f44718;
        layoutInflaterFactory2C1110.f19678.setAlpha(1.0f);
        layoutInflaterFactory2C1110.f19672.m38762((InterfaceC1927) null);
        layoutInflaterFactory2C1110.f19672 = null;
    }
}
