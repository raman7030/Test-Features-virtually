package bin.mt.plugin.api.editor;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;

/* JADX INFO: loaded from: classes.dex */
public interface TextEditorFunction {
    public static final JSONObject VALIDATION_FAILED = JSONObject.unmodifiableObject(new JSONObject());

    PluginView buildOptionsView(PluginUI pluginUI, JSONObject jSONObject);

    void doFunction(PluginUI pluginUI, TextEditor textEditor, JSONObject jSONObject);

    PluginContext getContext();

    JSONObject getOptionsData(PluginUI pluginUI, PluginView pluginView);

    void init(PluginContext pluginContext);

    boolean isEnabled();

    String name();

    boolean supportEditTextView();

    boolean supportRepeat();
}
