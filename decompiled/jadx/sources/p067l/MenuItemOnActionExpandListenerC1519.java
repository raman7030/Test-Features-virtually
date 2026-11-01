package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܰۜ */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes3.dex */
public final class MenuItemOnActionExpandListenerC1519 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: ֫ */
    public final MenuItem.OnActionExpandListener f43762;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ MenuItemC0944 f43763;

    public MenuItemOnActionExpandListenerC1519(MenuItemC0944 menuItemC0944, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f43763 = menuItemC0944;
        this.f43762 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f43762.onMenuItemActionExpand(this.f43763.m39331(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f43762.onMenuItemActionCollapse(this.f43763.m39331(menuItem));
    }
}
