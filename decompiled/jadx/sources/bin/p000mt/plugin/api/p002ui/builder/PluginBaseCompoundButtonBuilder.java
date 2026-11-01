package bin.p000mt.plugin.api.p002ui.builder;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginCompoundButton;

/* JADX INFO: loaded from: classes2.dex */
public interface PluginBaseCompoundButtonBuilder extends PluginBaseButtonBuilder {
    PluginUIBuilder check();

    PluginUIBuilder checked(JSONObject jSONObject);

    PluginUIBuilder checked(JSONObject jSONObject, boolean z);

    PluginUIBuilder checked(boolean z);

    PluginUIBuilder onCheckedChange(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    PluginUIBuilder uncheck();
}
