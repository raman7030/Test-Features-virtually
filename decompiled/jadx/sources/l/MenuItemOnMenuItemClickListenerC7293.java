package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes2.dex */
public final class MenuItemOnMenuItemClickListenerC7293 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final MenuItem.OnMenuItemClickListener f22393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MenuItemC2063 f22394;

    public MenuItemOnMenuItemClickListenerC7293(MenuItemC2063 menuItemC2063, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22394 = menuItemC2063;
        this.f22393 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f22393.onMenuItemClick(this.f22394.m37161(menuItem));
    }
}
