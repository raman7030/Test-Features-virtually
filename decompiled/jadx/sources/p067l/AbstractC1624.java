package p067l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.ܺۜ */
/* JADX INFO: compiled from: 8530 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1624 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f51733;

    /* JADX INFO: renamed from: ۧ */
    public C1012 f51734;

    /* JADX INFO: renamed from: ܽ */
    public C1012 f51735;

    public AbstractC1624(Context context) {
        this.f51733 = context;
    }

    /* JADX INFO: renamed from: ֫ */
    public final MenuItem m39331(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC1528)) {
            return menuItem;
        }
        InterfaceMenuItemC1528 interfaceMenuItemC1528 = (InterfaceMenuItemC1528) menuItem;
        if (this.f51734 == null) {
            this.f51734 = new C1012();
        }
        MenuItem menuItem2 = (MenuItem) this.f51734.getOrDefault(interfaceMenuItemC1528, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0944 menuItemC0944 = new MenuItemC0944(this.f51733, interfaceMenuItemC1528);
        this.f51734.put(interfaceMenuItemC1528, menuItemC0944);
        return menuItemC0944;
    }

    /* JADX INFO: renamed from: ֫ */
    public final SubMenu m39332(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC1213)) {
            return subMenu;
        }
        InterfaceSubMenuC1213 interfaceSubMenuC1213 = (InterfaceSubMenuC1213) subMenu;
        if (this.f51735 == null) {
            this.f51735 = new C1012();
        }
        SubMenu subMenu2 = (SubMenu) this.f51735.getOrDefault(interfaceSubMenuC1213, null);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0874 subMenuC0874 = new SubMenuC0874(this.f51733, interfaceSubMenuC1213);
        this.f51735.put(interfaceSubMenuC1213, subMenuC0874);
        return subMenuC0874;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39335() {
        C1012 c1012 = this.f51734;
        if (c1012 != null) {
            c1012.clear();
        }
        C1012 c1013 = this.f51735;
        if (c1013 != null) {
            c1013.clear();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39333(int i) {
        if (this.f51734 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f51734.size()) {
            if (((InterfaceMenuItemC1528) this.f51734.m12522(i2)).getGroupId() == i) {
                this.f51734.m12523(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39334(int i) {
        if (this.f51734 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f51734.size(); i2++) {
            if (((InterfaceMenuItemC1528) this.f51734.m12522(i2)).getItemId() == i) {
                this.f51734.m12523(i2);
                return;
            }
        }
    }
}
