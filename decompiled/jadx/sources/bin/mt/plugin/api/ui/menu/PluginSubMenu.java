package bin.mt.plugin.api.ui.menu;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public interface PluginSubMenu extends PluginMenu {
    PluginMenuItem getItem();

    PluginSubMenu setIcon(Drawable drawable);
}
