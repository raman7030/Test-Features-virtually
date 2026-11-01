package bin.p000mt.plugin.api.p002ui.builder;

import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;

/* JADX INFO: loaded from: classes.dex */
public interface PluginUIBuilder {
    PluginButtonBuilder addButton();

    PluginButtonBuilder addButton(String str);

    PluginCheckBoxBuilder addCheckBox();

    PluginCheckBoxBuilder addCheckBox(String str);

    PluginEditTextBuilder addEditBox();

    PluginEditTextBuilder addEditBox(String str);

    PluginEditTextBuilder addEditText();

    PluginEditTextBuilder addEditText(String str);

    PluginFrameLayoutBuilder addFrameLayout();

    PluginFrameLayoutBuilder addFrameLayout(String str);

    PluginLinearLayoutBuilder addHorizontalLayout();

    PluginLinearLayoutBuilder addHorizontalLayout(String str);

    PluginImageViewBuilder addImageView();

    PluginImageViewBuilder addImageView(String str);

    PluginProgressBarBuilder addProgressBar();

    PluginProgressBarBuilder addProgressBar(String str);

    PluginRadioButtonBuilder addRadioButton();

    PluginRadioButtonBuilder addRadioButton(String str);

    PluginRadioGroupBuilder addRadioGroup(String str, boolean z);

    PluginRadioGroupBuilder addRadioGroup(boolean z);

    PluginSpinnerBuilder addSpinner();

    PluginSpinnerBuilder addSpinner(String str);

    PluginSwitchButtonBuilder addSwitchButton();

    PluginSwitchButtonBuilder addSwitchButton(String str);

    PluginTextViewBuilder addTextView();

    PluginTextViewBuilder addTextView(String str);

    PluginLinearLayoutBuilder addVerticalLayout();

    PluginLinearLayoutBuilder addVerticalLayout(String str);

    PluginViewBuilder addView();

    PluginViewBuilder addView(String str);

    PluginView build();

    PluginUI getPluginUI();
}
