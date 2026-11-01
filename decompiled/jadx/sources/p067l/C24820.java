package p067l;

import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.menu.PluginMenu;
import bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem;
import bin.p000mt.plugin.api.p002ui.menu.PluginSubMenu;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes.dex */
public class C24820 implements PluginMenu {

    /* JADX INFO: renamed from: ֫ */
    public final PluginContext f79296;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14344 f79297;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceMenuC1983 f79298;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f79299 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m54514(String str) {
        if (str == null) {
            return 0;
        }
        return this.f79297.mo26853(str, new C16102(this));
    }

    public C24820(PluginContext pluginContext, InterfaceMenuC1983 interfaceMenuC1983, InterfaceC14344 interfaceC14344) {
        this.f79296 = pluginContext;
        this.f79298 = interfaceMenuC1983;
        this.f79297 = interfaceC14344;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final PluginMenuItem add(CharSequence charSequence) {
        return add(charSequence.toString(), charSequence, null);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final PluginMenuItem add(String str, CharSequence charSequence) {
        return add(str, charSequence, null);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final PluginMenuItem add(String str, CharSequence charSequence, String str2) {
        String stringNullable;
        C12826.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C9417.m21911(1, str3) == '}' && (stringNullable = this.f79296.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C8727 c8727 = new C8727(this.f79296, str, str2, (InterfaceMenuItemC1528) this.f79298.add(m54514(str2), m54514(str), 0, charSequence), null);
        this.f79299.add(c8727);
        return c8727;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(charSequence.toString(), charSequence, null);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(String str, CharSequence charSequence) {
        return addSubMenu(str, charSequence, null);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(String str, CharSequence charSequence, String str2) {
        String stringNullable;
        C12826.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C9417.m21911(1, str3) == '}' && (stringNullable = this.f79296.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C10739 c10739 = new C10739(this.f79296, str, str2, (SubMenuC1819) this.f79298.addSubMenu(m54514(str2), m54514(str), 0, charSequence), this.f79297);
        this.f79299.add(c10739.getItem());
        return c10739;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final C8727 findItem(String str) {
        for (C8727 c8727 : this.f79299) {
            if (c8727.getItemId().equals(str)) {
                return c8727;
            }
            if (c8727.hasSubMenu()) {
                C10739 subMenu = c8727.getSubMenu();
                C12826.requireNonNull(subMenu);
                C8727 c8727FindItem = subMenu.findItem(str);
                if (c8727FindItem != null) {
                    return c8727FindItem;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8727 m54515(int i) {
        for (C8727 c8727 : this.f79299) {
            if (c8727.f23664.getItemId() == i) {
                return c8727;
            }
            if (c8727.hasSubMenu()) {
                C10739 subMenu = c8727.getSubMenu();
                C12826.requireNonNull(subMenu);
                C8727 c8727M54515 = subMenu.m54515(i);
                if (c8727M54515 != null) {
                    return c8727M54515;
                }
            }
        }
        return null;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final PluginMenuItem getItem(int i) {
        return (PluginMenuItem) this.f79299.get(i);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final int size() {
        return this.f79299.size();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final void setGroupCheckable(String str, boolean z, boolean z2) {
        this.f79298.setGroupCheckable(m54514(str), z, z2);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final void setGroupVisible(String str, boolean z) {
        this.f79298.setGroupVisible(m54514(str), z);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final void setGroupEnabled(String str, boolean z) {
        this.f79298.setGroupEnabled(m54514(str), z);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final void setGroupDividerEnabled(boolean z) {
        this.f79298.setGroupDividerEnabled(z);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenu
    public final void clear() {
        this.f79298.clear();
        this.f79299.clear();
    }
}
