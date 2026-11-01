package bin.p000mt.plugin.api.p002ui.menu;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public interface PluginMenuItem {
    String getGroupId();

    Drawable getIcon();

    ColorStateList getIconTintList();

    String getItemId();

    PluginSubMenu getSubMenu();

    CharSequence getTitle();

    boolean hasSubMenu();

    boolean isCheckable();

    boolean isChecked();

    boolean isEnabled();

    boolean isVisible();

    PluginMenuItem setCheckable(boolean z);

    PluginMenuItem setChecked(boolean z);

    PluginMenuItem setEnabled(boolean z);

    PluginMenuItem setIcon(Drawable drawable);

    PluginMenuItem setIconTintList(ColorStateList colorStateList);

    PluginMenuItem setTitle(CharSequence charSequence);

    PluginMenuItem setVisible(boolean z);
}
