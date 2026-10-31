package bin.mt.plugin.api.ui.menu;

/* JADX INFO: loaded from: classes.dex */
public interface PluginPopupMenu {

    public interface OnDismissListener {
        void onDismiss(PluginPopupMenu pluginPopupMenu);
    }

    void dismiss();

    int getGravity();

    PluginMenu getMenu();

    void setGravity(int i);

    void setOnDismissListener(OnDismissListener onDismissListener);

    void setOnMenuItemClickListener(PluginMenu.OnMenuItemClickListener onMenuItemClickListener);

    void show();
}
