package p067l;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem;
import bin.p000mt.plugin.api.p002ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.ۜۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8727 implements PluginMenuItem {

    /* JADX INFO: renamed from: ֫ */
    public final PluginContext f23660;

    /* JADX INFO: renamed from: ۧ */
    public final String f23661;

    /* JADX INFO: renamed from: ܽ */
    public final String f23662;

    /* JADX INFO: renamed from: ܿ */
    public final C10739 f23663;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceMenuItemC1528 f23664;

    public C8727(PluginContext pluginContext, String str, String str2, InterfaceMenuItemC1528 interfaceMenuItemC1528, C10739 c10739) {
        this.f23660 = pluginContext;
        this.f23662 = str;
        this.f23661 = str2;
        this.f23664 = interfaceMenuItemC1528;
        this.f23663 = c10739;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final String getItemId() {
        return this.f23662;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final String getGroupId() {
        return this.f23661;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final CharSequence getTitle() {
        CharSequence title = this.f23664.getTitle();
        return title == null ? "" : title;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginMenuItem setIcon(Drawable drawable) {
        this.f23664.setIcon(drawable);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final Drawable getIcon() {
        return this.f23664.getIcon();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginMenuItem setIconTintList(ColorStateList colorStateList) {
        this.f23664.setIconTintList(colorStateList);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final ColorStateList getIconTintList() {
        return this.f23664.getIconTintList();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginMenuItem setCheckable(boolean z) {
        this.f23664.setCheckable(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final boolean isCheckable() {
        return this.f23664.isCheckable();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginMenuItem setChecked(boolean z) {
        this.f23664.setChecked(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final boolean isChecked() {
        return this.f23664.isChecked();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginMenuItem setVisible(boolean z) {
        this.f23664.setVisible(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final boolean isVisible() {
        return this.f23664.isVisible();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginMenuItem setEnabled(boolean z) {
        this.f23664.setEnabled(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final boolean isEnabled() {
        return this.f23664.isEnabled();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final boolean hasSubMenu() {
        return this.f23663 != null;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginSubMenu getSubMenu() {
        return this.f23663;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final C10739 getSubMenu() {
        return this.f23663;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem
    public final PluginMenuItem setTitle(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C9417.m21911(1, str) == '}' && (stringNullable = this.f23660.getStringNullable(str)) != null) {
                charSequence = stringNullable;
            }
        }
        this.f23664.setTitle(charSequence);
        return this;
    }
}
