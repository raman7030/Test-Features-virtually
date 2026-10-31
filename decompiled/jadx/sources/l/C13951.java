package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C13951 extends C1080 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f41637;

    public C13951(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f41637 = layoutInflaterFactory2C5402;
    }

    @Override // l.C1080, l.InterfaceC21882
    /* JADX INFO: renamed from: ֫ */
    public final void mo3669() {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f41637;
        layoutInflaterFactory2C5402.f16840.setVisibility(0);
        if (layoutInflaterFactory2C5402.f16840.getParent() instanceof View) {
            C17648.m41339((View) layoutInflaterFactory2C5402.f16840.getParent());
        }
    }

    @Override // l.InterfaceC21882
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f41637;
        layoutInflaterFactory2C5402.f16840.setAlpha(1.0f);
        layoutInflaterFactory2C5402.f16834.m36602((InterfaceC21882) null);
        layoutInflaterFactory2C5402.f16834 = null;
    }
}
