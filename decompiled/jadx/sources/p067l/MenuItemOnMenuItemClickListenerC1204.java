package p067l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.۟ۜ */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes2.dex */
public final class MenuItemOnMenuItemClickListenerC1204 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final MenuItem.OnMenuItemClickListener f25284;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ MenuItemC0944 f25285;

    public MenuItemOnMenuItemClickListenerC1204(MenuItemC0944 menuItemC0944, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f25285 = menuItemC0944;
        this.f25284 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f25284.onMenuItemClick(this.f25285.m39331(menuItem));
    }
}
