package bin.p000mt.plugin.api.editor;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import p067l.C12826;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTextEditorFunction implements TextEditorFunction {
    public PluginContext context;

    @Override // bin.p000mt.plugin.api.editor.TextEditorFunction
    public PluginView buildOptionsView(PluginUI pluginUI, JSONObject jSONObject) {
        return null;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorFunction
    public JSONObject getOptionsData(PluginUI pluginUI, PluginView pluginView) {
        return null;
    }

    public void init() {
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorFunction
    public boolean isEnabled() {
        return true;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorFunction
    public final void init(PluginContext pluginContext) {
        this.context = pluginContext;
        init();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorFunction
    public PluginContext getContext() {
        PluginContext pluginContext = this.context;
        C12826.requireNonNull(pluginContext);
        return pluginContext;
    }
}
