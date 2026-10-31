package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8530 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15759 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f48594;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3432 f48595;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3432 f48596;

    public AbstractC15759(Context context) {
        this.f48594 = context;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MenuItem m37161(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC13827)) {
            return menuItem;
        }
        InterfaceMenuItemC13827 interfaceMenuItemC13827 = (InterfaceMenuItemC13827) menuItem;
        if (this.f48595 == null) {
            this.f48595 = new C3432();
        }
        MenuItem menuItem2 = (MenuItem) this.f48595.getOrDefault(interfaceMenuItemC13827, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC2063 menuItemC2063 = new MenuItemC2063(this.f48594, interfaceMenuItemC13827);
        this.f48595.put(interfaceMenuItemC13827, menuItemC2063);
        return menuItemC2063;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SubMenu m37162(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC7478)) {
            return subMenu;
        }
        InterfaceSubMenuC7478 interfaceSubMenuC7478 = (InterfaceSubMenuC7478) subMenu;
        if (this.f48596 == null) {
            this.f48596 = new C3432();
        }
        SubMenu subMenu2 = (SubMenu) this.f48596.getOrDefault(interfaceSubMenuC7478, null);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0651 subMenuC0651 = new SubMenuC0651(this.f48594, interfaceSubMenuC7478);
        this.f48596.put(interfaceSubMenuC7478, subMenuC0651);
        return subMenuC0651;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m37165() {
        C3432 c3432 = this.f48595;
        if (c3432 != null) {
            c3432.clear();
        }
        C3432 c3433 = this.f48596;
        if (c3433 != null) {
            c3433.clear();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37163(int i) {
        if (this.f48595 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f48595.size()) {
            if (((InterfaceMenuItemC13827) this.f48595.m10499(i2)).getGroupId() == i) {
                this.f48595.m10500(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37164(int i) {
        if (this.f48595 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f48595.size(); i2++) {
            if (((InterfaceMenuItemC13827) this.f48595.m10499(i2)).getItemId() == i) {
                this.f48595.m10500(i2);
                return;
            }
        }
    }
}
