package bin.mt.plugin.api.ui.builder;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginCompoundButton;

/* JADX INFO: loaded from: classes2.dex */
public interface PluginBaseCompoundButtonBuilder extends PluginBaseButtonBuilder {
    PluginUIBuilder check();

    PluginUIBuilder checked(JSONObject jSONObject);

    PluginUIBuilder checked(JSONObject jSONObject, boolean z);

    PluginUIBuilder checked(boolean z);

    PluginUIBuilder onCheckedChange(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    PluginUIBuilder uncheck();
}
