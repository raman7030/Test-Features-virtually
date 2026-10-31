package bin.mt.plugin.api.ui.menu;

/* JADX INFO: loaded from: classes.dex */
public interface PluginMenu {

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(PluginMenuItem pluginMenuItem);
    }

    PluginMenuItem add(CharSequence charSequence);

    PluginMenuItem add(String str, CharSequence charSequence);

    PluginMenuItem add(String str, CharSequence charSequence, String str2);

    PluginSubMenu addSubMenu(CharSequence charSequence);

    PluginSubMenu addSubMenu(String str, CharSequence charSequence);

    PluginSubMenu addSubMenu(String str, CharSequence charSequence, String str2);

    void clear();

    PluginMenuItem findItem(String str);

    PluginMenuItem getItem(int i);

    void setGroupCheckable(String str, boolean z, boolean z2);

    void setGroupDividerEnabled(boolean z);

    void setGroupEnabled(String str, boolean z);

    void setGroupVisible(String str, boolean z);

    int size();
}
