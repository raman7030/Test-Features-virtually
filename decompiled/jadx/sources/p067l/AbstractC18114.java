package p067l;

import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.builder.PluginButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginCheckBoxBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginEditTextBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginFrameLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginImageViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginLinearLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginProgressBarBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRadioButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginRadioGroupBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginSpinnerBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginSwitchButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginTextViewBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginViewBuilder;

/* JADX INFO: renamed from: l.ܽۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18114 implements PluginUIBuilder {

    /* JADX INFO: renamed from: ֫ */
    public PluginUIBuilder f54108;

    /* JADX INFO: renamed from: ֫ */
    public void m41299(PluginUIBuilder pluginUIBuilder) {
        this.f54108 = pluginUIBuilder;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginUI getPluginUI() {
        return this.f54108.getPluginUI();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginViewBuilder addView() {
        return this.f54108.addView();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginViewBuilder addView(String str) {
        return this.f54108.addView(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginTextViewBuilder addTextView() {
        return this.f54108.addTextView();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginTextViewBuilder addTextView(String str) {
        return this.f54108.addTextView(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginButtonBuilder addButton() {
        return this.f54108.addButton();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginButtonBuilder addButton(String str) {
        return this.f54108.addButton(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginCheckBoxBuilder addCheckBox() {
        return this.f54108.addCheckBox();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginCheckBoxBuilder addCheckBox(String str) {
        return this.f54108.addCheckBox(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginSwitchButtonBuilder addSwitchButton() {
        return this.f54108.addSwitchButton();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginSwitchButtonBuilder addSwitchButton(String str) {
        return this.f54108.addSwitchButton(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginRadioButtonBuilder addRadioButton() {
        return this.f54108.addRadioButton();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginRadioButtonBuilder addRadioButton(String str) {
        return this.f54108.addRadioButton(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginSpinnerBuilder addSpinner() {
        return this.f54108.addSpinner();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginSpinnerBuilder addSpinner(String str) {
        return this.f54108.addSpinner(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginProgressBarBuilder addProgressBar() {
        return this.f54108.addProgressBar();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginProgressBarBuilder addProgressBar(String str) {
        return this.f54108.addProgressBar(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditText() {
        return this.f54108.addEditText();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditText(String str) {
        return this.f54108.addEditText(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditBox() {
        return this.f54108.addEditBox();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditBox(String str) {
        return this.f54108.addEditBox(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginImageViewBuilder addImageView() {
        return this.f54108.addImageView();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginImageViewBuilder addImageView(String str) {
        return this.f54108.addImageView(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addHorizontalLayout() {
        return this.f54108.addHorizontalLayout();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addHorizontalLayout(String str) {
        return this.f54108.addHorizontalLayout(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addVerticalLayout() {
        return this.f54108.addVerticalLayout();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addVerticalLayout(String str) {
        return this.f54108.addVerticalLayout(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginFrameLayoutBuilder addFrameLayout() {
        return this.f54108.addFrameLayout();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginFrameLayoutBuilder addFrameLayout(String str) {
        return this.f54108.addFrameLayout(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginRadioGroupBuilder addRadioGroup(boolean z) {
        return this.f54108.addRadioGroup(z);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public PluginRadioGroupBuilder addRadioGroup(String str, boolean z) {
        return this.f54108.addRadioGroup(str, z);
    }
}
