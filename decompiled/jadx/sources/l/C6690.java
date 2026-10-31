package l;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.ۜۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6690 implements PluginMenuItem {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PluginContext f20785;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f20786;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f20787;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8807 f20788;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC13827 f20789;

    public C6690(PluginContext pluginContext, String str, String str2, InterfaceMenuItemC13827 interfaceMenuItemC13827, C8807 c8807) {
        this.f20785 = pluginContext;
        this.f20787 = str;
        this.f20786 = str2;
        this.f20789 = interfaceMenuItemC13827;
        this.f20788 = c8807;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final String getItemId() {
        return this.f20787;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final String getGroupId() {
        return this.f20786;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final CharSequence getTitle() {
        CharSequence title = this.f20789.getTitle();
        return title == null ? "" : title;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setIcon(Drawable drawable) {
        this.f20789.setIcon(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final Drawable getIcon() {
        return this.f20789.getIcon();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20789.setIconTintList(colorStateList);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final ColorStateList getIconTintList() {
        return this.f20789.getIconTintList();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setCheckable(boolean z) {
        this.f20789.setCheckable(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isCheckable() {
        return this.f20789.isCheckable();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setChecked(boolean z) {
        this.f20789.setChecked(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isChecked() {
        return this.f20789.isChecked();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setVisible(boolean z) {
        this.f20789.setVisible(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isVisible() {
        return this.f20789.isVisible();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setEnabled(boolean z) {
        this.f20789.setEnabled(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean isEnabled() {
        return this.f20789.isEnabled();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final boolean hasSubMenu() {
        return this.f20788 != null;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginSubMenu getSubMenu() {
        return this.f20788;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final C8807 getSubMenu() {
        return this.f20788;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginMenuItem
    public final PluginMenuItem setTitle(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C7416.m19937(1, str) == '}' && (stringNullable = this.f20785.getStringNullable(str)) != null) {
                charSequence = stringNullable;
            }
        }
        this.f20789.setTitle(charSequence);
        return this;
    }
}
