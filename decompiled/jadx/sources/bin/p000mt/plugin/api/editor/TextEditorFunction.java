package bin.p000mt.plugin.api.editor;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;

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
