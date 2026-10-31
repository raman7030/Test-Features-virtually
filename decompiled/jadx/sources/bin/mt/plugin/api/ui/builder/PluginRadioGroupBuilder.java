package bin.mt.plugin.api.ui.builder;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginRadioGroup;

/* JADX INFO: loaded from: classes2.dex */
public interface PluginRadioGroupBuilder extends PluginBaseLinearLayoutBuilder {
    PluginRadioGroupBuilder check(int i);

    PluginRadioGroupBuilder check(String str);

    PluginRadioGroupBuilder checkedId(JSONObject jSONObject);

    PluginRadioGroupBuilder checkedId(JSONObject jSONObject, String str);

    PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject);

    PluginRadioGroupBuilder checkedPosition(JSONObject jSONObject, int i);

    PluginRadioGroupBuilder onCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener);

    PluginRadioGroupBuilder postOnCheckedChanged(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener);
}
