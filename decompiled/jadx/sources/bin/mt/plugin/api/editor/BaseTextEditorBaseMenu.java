package bin.mt.plugin.api.editor;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginUI;
import l.C11003;
import l.C7166;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTextEditorBaseMenu implements TextEditorBaseMenu {
    public PluginContext context;

    public void init() {
    }

    @Override // bin.mt.plugin.api.editor.TextEditorBaseMenu
    public boolean isEnabled() {
        return true;
    }

    @Override // bin.mt.plugin.api.editor.TextEditorBaseMenu
    public final void init(PluginContext pluginContext) {
        this.context = pluginContext;
        init();
    }

    @Override // bin.mt.plugin.api.editor.TextEditorBaseMenu
    public PluginContext getContext() {
        PluginContext pluginContext = this.context;
        C11003.requireNonNull(pluginContext);
        return pluginContext;
    }

    @Override // bin.mt.plugin.api.editor.TextEditorBaseMenu
    public void onPluginButtonClick(PluginUI pluginUI) {
        PluginContext context = getContext();
        String pluginId = context.getPluginId();
        int length = pluginId.length();
        StringBuilder sbM19190 = C7166.m19190(pluginId, "\n\n");
        sbM19190.append(getClass().getName());
        SpannableString spannableString = new SpannableString(sbM19190.toString());
        int i = length + 1;
        int i2 = length + 2;
        spannableString.setSpan(new RelativeSizeSpan(0.1f), i, i2, 17);
        spannableString.setSpan(new ForegroundColorSpan(pluginUI.colorTextSecondary()), i2, spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), i2, spannableString.length(), 17);
        pluginUI.buildDialog().setTitle(context.getPluginName()).setMessage(spannableString).setPositiveButton("{close}", null).show();
    }
}
