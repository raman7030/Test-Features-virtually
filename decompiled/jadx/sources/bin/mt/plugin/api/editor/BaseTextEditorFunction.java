package bin.mt.plugin.api.editor;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import l.C11003;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTextEditorFunction implements TextEditorFunction {
    public PluginContext context;

    @Override // bin.mt.plugin.api.editor.TextEditorFunction
    public PluginView buildOptionsView(PluginUI pluginUI, JSONObject jSONObject) {
        return null;
    }

    @Override // bin.mt.plugin.api.editor.TextEditorFunction
    public JSONObject getOptionsData(PluginUI pluginUI, PluginView pluginView) {
        return null;
    }

    public void init() {
    }

    @Override // bin.mt.plugin.api.editor.TextEditorFunction
    public boolean isEnabled() {
        return true;
    }

    @Override // bin.mt.plugin.api.editor.TextEditorFunction
    public final void init(PluginContext pluginContext) {
        this.context = pluginContext;
        init();
    }

    @Override // bin.mt.plugin.api.editor.TextEditorFunction
    public PluginContext getContext() {
        PluginContext pluginContext = this.context;
        C11003.requireNonNull(pluginContext);
        return pluginContext;
    }
}
