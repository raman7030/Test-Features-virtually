package p067l;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: renamed from: l.ۨۜ */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class ActionProviderVisibilityListenerC1414 extends AbstractC1693 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: ֫ */
    public final ActionProvider f37409;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC1728 f37410;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ MenuItemC0944 f37411;

    public ActionProviderVisibilityListenerC1414(MenuItemC0944 menuItemC0944, ActionProvider actionProvider) {
        this.f37411 = menuItemC0944;
        this.f37409 = actionProvider;
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ֫ */
    public final View mo30405(C1134 c1134) {
        return this.f37409.onCreateActionView(c1134);
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo30411() {
        return this.f37409.overridesItemVisibility();
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo30409() {
        return this.f37409.isVisible();
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ֫ */
    public final void mo30406(InterfaceC1728 interfaceC1728) {
        this.f37410 = interfaceC1728;
        this.f37409.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        InterfaceC1728 interfaceC1728 = this.f37410;
        if (interfaceC1728 != null) {
            C1134 c1134 = ((C1344) interfaceC1728).f33418;
            c1134.f20887.onItemVisibleChanged(c1134);
        }
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo30412() {
        return this.f37409.onPerformDefaultAction();
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ܽ */
    public final View mo30410() {
        return this.f37409.onCreateActionView();
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30408() {
        return this.f37409.hasSubMenu();
    }

    @Override // p067l.AbstractC1693
    /* JADX INFO: renamed from: ֫ */
    public final void mo30407(SubMenuC1819 subMenuC1819) {
        this.f37409.onPrepareSubMenu(this.f37411.m39332(subMenuC1819));
    }
}
