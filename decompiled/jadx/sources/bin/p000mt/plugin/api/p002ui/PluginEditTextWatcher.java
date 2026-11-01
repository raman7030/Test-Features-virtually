package bin.p000mt.plugin.api.p002ui;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public interface PluginEditTextWatcher {

    public abstract class Simple implements PluginEditTextWatcher {
        @Override // bin.p000mt.plugin.api.p002ui.PluginEditTextWatcher
        public void afterTextChanged(PluginEditText pluginEditText, Editable editable) {
        }

        @Override // bin.p000mt.plugin.api.p002ui.PluginEditTextWatcher
        public void beforeTextChanged(PluginEditText pluginEditText, CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // bin.p000mt.plugin.api.p002ui.PluginEditTextWatcher
        public void onTextChanged(PluginEditText pluginEditText, CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    void afterTextChanged(PluginEditText pluginEditText, Editable editable);

    void beforeTextChanged(PluginEditText pluginEditText, CharSequence charSequence, int i, int i2, int i3);

    void onTextChanged(PluginEditText pluginEditText, CharSequence charSequence, int i, int i2, int i3);
}
