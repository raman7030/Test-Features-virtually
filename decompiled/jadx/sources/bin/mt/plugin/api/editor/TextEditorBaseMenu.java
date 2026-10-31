package bin.mt.plugin.api.editor;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginUI;

/* JADX INFO: loaded from: classes.dex */
public interface TextEditorBaseMenu {
    boolean checkVisible(TextEditor textEditor);

    PluginContext getContext();

    Drawable icon();

    void init(PluginContext pluginContext);

    boolean isEnabled();

    String name();

    void onMenuClick(PluginUI pluginUI, TextEditor textEditor);

    void onPluginButtonClick(PluginUI pluginUI);
}
