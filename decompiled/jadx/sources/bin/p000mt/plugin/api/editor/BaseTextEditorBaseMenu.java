package bin.p000mt.plugin.api.editor;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import p067l.C12826;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTextEditorBaseMenu implements TextEditorBaseMenu {
    public PluginContext context;

    public void init() {
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorBaseMenu
    public boolean isEnabled() {
        return true;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorBaseMenu
    public final void init(PluginContext pluginContext) {
        this.context = pluginContext;
        init();
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorBaseMenu
    public PluginContext getContext() {
        PluginContext pluginContext = this.context;
        C12826.requireNonNull(pluginContext);
        return pluginContext;
    }

    @Override // bin.p000mt.plugin.api.editor.TextEditorBaseMenu
    public void onPluginButtonClick(PluginUI pluginUI) {
        PluginContext context = getContext();
        String pluginId = context.getPluginId();
        int length = pluginId.length();
        StringBuilder sbM21133 = C9179.m21133(pluginId, "\n\n");
        sbM21133.append(getClass().getName());
        SpannableString spannableString = new SpannableString(sbM21133.toString());
        int i = length + 1;
        int i2 = length + 2;
        spannableString.setSpan(new RelativeSizeSpan(0.1f), i, i2, 17);
        spannableString.setSpan(new ForegroundColorSpan(pluginUI.colorTextSecondary()), i2, spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.8f), i2, spannableString.length(), 17);
        pluginUI.buildDialog().setTitle(context.getPluginName()).setMessage(spannableString).setPositiveButton("{close}", null).show();
    }
}
