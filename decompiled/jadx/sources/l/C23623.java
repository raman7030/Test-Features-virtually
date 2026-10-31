package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenu;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U7JF */
/* JADX INFO: loaded from: classes.dex */
public class C23623 implements PluginMenu {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PluginContext f76552;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12600 f76553;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuC23000 f76554;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f76555 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m52111(String str) {
        if (str == null) {
            return 0;
        }
        return this.f76553.mo24838(str, new C14450(this));
    }

    public C23623(PluginContext pluginContext, InterfaceMenuC23000 interfaceMenuC23000, InterfaceC12600 interfaceC12600) {
        this.f76552 = pluginContext;
        this.f76554 = interfaceMenuC23000;
        this.f76553 = interfaceC12600;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem add(CharSequence charSequence) {
        return add(charSequence.toString(), charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem add(String str, CharSequence charSequence) {
        return add(str, charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem add(String str, CharSequence charSequence, String str2) {
        String stringNullable;
        C11003.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C7416.m19937(1, str3) == '}' && (stringNullable = this.f76552.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C6690 c6690 = new C6690(this.f76552, str, str2, (InterfaceMenuItemC13827) this.f76554.add(m52111(str2), m52111(str), 0, charSequence), null);
        this.f76555.add(c6690);
        return c6690;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(charSequence.toString(), charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(String str, CharSequence charSequence) {
        return addSubMenu(str, charSequence, null);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginSubMenu addSubMenu(String str, CharSequence charSequence, String str2) {
        String stringNullable;
        C11003.requireNonNull(charSequence, "title cannot be null");
        if (charSequence instanceof String) {
            String str3 = (String) charSequence;
            if (str3.length() >= 3 && str3.charAt(0) == '{' && C7416.m19937(1, str3) == '}' && (stringNullable = this.f76552.getStringNullable(str3)) != null) {
                charSequence = stringNullable;
            }
        }
        C8807 c8807 = new C8807(this.f76552, str, str2, (SubMenuC19703) this.f76554.addSubMenu(m52111(str2), m52111(str), 0, charSequence), this.f76553);
        this.f76555.add(c8807.getItem());
        return c8807;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final C6690 findItem(String str) {
        for (C6690 c6690 : this.f76555) {
            if (c6690.getItemId().equals(str)) {
                return c6690;
            }
            if (c6690.hasSubMenu()) {
                C8807 subMenu = c6690.getSubMenu();
                C11003.requireNonNull(subMenu);
                C6690 c6690FindItem = subMenu.findItem(str);
                if (c6690FindItem != null) {
                    return c6690FindItem;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6690 m52112(int i) {
        for (C6690 c6690 : this.f76555) {
            if (c6690.f20789.getItemId() == i) {
                return c6690;
            }
            if (c6690.hasSubMenu()) {
                C8807 subMenu = c6690.getSubMenu();
                C11003.requireNonNull(subMenu);
                C6690 c6690M52112 = subMenu.m52112(i);
                if (c6690M52112 != null) {
                    return c6690M52112;
                }
            }
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final PluginMenuItem getItem(int i) {
        return (PluginMenuItem) this.f76555.get(i);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final int size() {
        return this.f76555.size();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupCheckable(String str, boolean z, boolean z2) {
        this.f76554.setGroupCheckable(m52111(str), z, z2);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupVisible(String str, boolean z) {
        this.f76554.setGroupVisible(m52111(str), z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupEnabled(String str, boolean z) {
        this.f76554.setGroupEnabled(m52111(str), z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void setGroupDividerEnabled(boolean z) {
        this.f76554.setGroupDividerEnabled(z);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenu
    public final void clear() {
        this.f76554.clear();
        this.f76555.clear();
    }
}
