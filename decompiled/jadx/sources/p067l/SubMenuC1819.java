package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.᩵᩷ */
/* JADX INFO: compiled from: A53X */
/* JADX INFO: loaded from: classes5.dex */
public class SubMenuC1819 extends C0994 implements SubMenu {
    public C1134 mItem;
    public C0994 mParentMenu;

    public SubMenuC1819(Context context, C0994 c0994, C1134 c1134) {
        super(context);
        this.mParentMenu = c0994;
        this.mItem = c1134;
    }

    @Override // p067l.C0994, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // p067l.C0994
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // p067l.C0994
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    @Override // p067l.C0994
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

    @Override // p067l.C0994
    public void setCallback(InterfaceC1834 interfaceC1834) {
        this.mParentMenu.setCallback(interfaceC1834);
    }

    @Override // p067l.C0994
    public C0994 getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // p067l.C0994
    public boolean dispatchMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(c0994, menuItem) || this.mParentMenu.dispatchMenuItemSelected(c0994, menuItem);
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

    @Override // p067l.C0994
    public boolean expandItemActionView(C1134 c1134) {
        return this.mParentMenu.expandItemActionView(c1134);
    }

    @Override // p067l.C0994
    public boolean collapseItemActionView(C1134 c1134) {
        return this.mParentMenu.collapseItemActionView(c1134);
    }

    @Override // p067l.C0994
    public String getActionViewStatesKey() {
        C1134 c1134 = this.mItem;
        int itemId = c1134 != null ? c1134.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // p067l.C0994, p067l.InterfaceMenuC1983, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // p067l.C0994
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }
}
