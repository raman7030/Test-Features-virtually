package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes3.dex */
public final class MenuItemOnActionExpandListenerC13642 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MenuItem.OnActionExpandListener f40681;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC2063 f40682;

    public MenuItemOnActionExpandListenerC13642(MenuItemC2063 menuItemC2063, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f40682 = menuItemC2063;
        this.f40681 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f40681.onMenuItemActionExpand(this.f40682.m37161(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f40681.onMenuItemActionCollapse(this.f40682.m37161(menuItem));
    }
}
