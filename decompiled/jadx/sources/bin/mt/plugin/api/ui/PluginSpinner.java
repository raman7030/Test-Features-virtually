package bin.mt.plugin.api.ui;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface PluginSpinner extends PluginView {

    public interface OnItemSelectedListener {
        void onItemSelected(PluginSpinner pluginSpinner, int i);
    }

    int getCount();

    Object getItem(int i);

    Object getSelectedItem();

    int getSelection();

    void setItems(List list);

    void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener);

    void setSelection(int i);
}
