package l;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginEditTextBuilder;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginTextViewBuilder;

/* JADX INFO: renamed from: l.ۨܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O7RX */
/* JADX INFO: loaded from: classes4.dex */
public class C11771 extends PluginUI.Style {
    @Override // bin.mt.plugin.api.ui.PluginUI.Style
    public void handleRootLayout(PluginUI pluginUI, PluginRootLayoutBuilder pluginRootLayoutBuilder) {
        pluginRootLayoutBuilder.paddingHorizontal(pluginUI.dialogPaddingHorizontal());
    }

    @Override // bin.mt.plugin.api.ui.PluginUI.Style
    public void handleTextView(PluginUI pluginUI, PluginTextViewBuilder pluginTextViewBuilder) {
        pluginTextViewBuilder.textColor(pluginUI.colorTextStateList());
        pluginTextViewBuilder.textSize(16.0f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI.Style
    public void handleEditText(PluginUI pluginUI, PluginEditTextBuilder pluginEditTextBuilder) {
        pluginEditTextBuilder.widthMatchParent();
        if (pluginEditTextBuilder.isBoxStyle()) {
            pluginEditTextBuilder.inputTypeMultiline();
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginUI.Style
    public void handleLinearLayout(PluginUI pluginUI, PluginLinearLayoutBuilder pluginLinearLayoutBuilder) {
        if (pluginLinearLayoutBuilder.isHorizontal()) {
            pluginLinearLayoutBuilder.widthMatchParent();
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginUI.Style
    public void handleRadioGroup(PluginUI pluginUI, PluginRadioGroupBuilder pluginRadioGroupBuilder) {
        if (pluginRadioGroupBuilder.isHorizontal()) {
            pluginRadioGroupBuilder.widthMatchParent();
        }
    }
}
