package bin.mt.plugin.api.ui.builder;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginSpinner;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface PluginSpinnerBuilder extends PluginBaseViewBuilder {
    PluginSpinnerBuilder items(List list);

    PluginSpinnerBuilder onItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener);

    PluginSpinnerBuilder postOnItemSelected(PluginSpinner.OnItemSelectedListener onItemSelectedListener);

    PluginSpinnerBuilder selection(int i);

    PluginSpinnerBuilder selection(JSONObject jSONObject);

    PluginSpinnerBuilder selection(JSONObject jSONObject, int i);
}
