package l;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: renamed from: l.ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class ActionProviderVisibilityListenerC11527 extends AbstractC17151 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ActionProvider f34412;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC17857 f34413;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC2063 f34414;

    public ActionProviderVisibilityListenerC11527(MenuItemC2063 menuItemC2063, ActionProvider actionProvider) {
        this.f34414 = menuItemC2063;
        this.f34412 = actionProvider;
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View mo28359(C5882 c5882) {
        return this.f34412.onCreateActionView(c5882);
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo28365() {
        return this.f34412.overridesItemVisibility();
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo28363() {
        return this.f34412.isVisible();
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28360(InterfaceC17857 interfaceC17857) {
        this.f34413 = interfaceC17857;
        this.f34412.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        InterfaceC17857 interfaceC17857 = this.f34413;
        if (interfaceC17857 != null) {
            C5882 c5882 = ((C10116) interfaceC17857).f30456;
            c5882.f18032.onItemVisibleChanged(c5882);
        }
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo28366() {
        return this.f34412.onPerformDefaultAction();
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View mo28364() {
        return this.f34412.onCreateActionView();
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo28362() {
        return this.f34412.hasSubMenu();
    }

    @Override // l.AbstractC17151
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28361(SubMenuC19703 subMenuC19703) {
        this.f34412.onPrepareSubMenu(this.f34414.m37162(subMenuC19703));
    }
}
