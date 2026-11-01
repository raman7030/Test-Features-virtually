package bin.p000mt.plugin.api.p002ui.builder;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginRadioGroup;

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
