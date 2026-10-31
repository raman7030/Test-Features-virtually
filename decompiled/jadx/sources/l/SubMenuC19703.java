package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A53X */
/* JADX INFO: loaded from: classes5.dex */
public class SubMenuC19703 extends C3060 implements SubMenu {
    public C5882 mItem;
    public C3060 mParentMenu;

    public SubMenuC19703(Context context, C3060 c3060, C5882 c5882) {
        super(context);
        this.mParentMenu = c3060;
        this.mItem = c5882;
    }

    @Override // l.C3060, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // l.C3060
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // l.C3060
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    @Override // l.C3060
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    @Override // l.C3060
    public void setCallback(InterfaceC19994 interfaceC19994) {
        this.mParentMenu.setCallback(interfaceC19994);
    }

    @Override // l.C3060
    public C3060 getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // l.C3060
    public boolean dispatchMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(c3060, menuItem) || this.mParentMenu.dispatchMenuItemSelected(c3060, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setHeaderIconInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.setHeaderTitleInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // l.C3060
    public boolean expandItemActionView(C5882 c5882) {
        return this.mParentMenu.expandItemActionView(c5882);
    }

    @Override // l.C3060
    public boolean collapseItemActionView(C5882 c5882) {
        return this.mParentMenu.collapseItemActionView(c5882);
    }

    @Override // l.C3060
    public String getActionViewStatesKey() {
        C5882 c5882 = this.mItem;
        int itemId = c5882 != null ? c5882.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // l.C3060, l.InterfaceMenuC23000, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // l.C3060
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }
}
