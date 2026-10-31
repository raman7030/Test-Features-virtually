package l;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.builder.PluginButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginCheckBoxBuilder;
import bin.mt.plugin.api.ui.builder.PluginEditTextBuilder;
import bin.mt.plugin.api.ui.builder.PluginFrameLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginImageViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder;
import bin.mt.plugin.api.ui.builder.PluginRadioButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder;
import bin.mt.plugin.api.ui.builder.PluginSwitchButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginTextViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.ui.builder.PluginViewBuilder;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9138 implements PluginUIBuilder {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f27667;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16192 f27668;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27666 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PluginUIBuilder f27665 = this;

    public C9138(AbstractC16192 abstractC16192) {
        this.f27668 = abstractC16192;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23506(AbstractC9844 abstractC9844) {
        AbstractC16192 abstractC16192 = this.f27668;
        abstractC16192.f49865.dispatch(abstractC16192.getPluginUI(), abstractC9844);
        this.f27666.add(abstractC9844);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f27668.getPluginUI();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView() {
        C17273 c17273 = new C17273(this.f27665);
        m23506(c17273);
        return c17273;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView(String str) {
        C17273 c17273 = new C17273(this.f27665);
        c17273.id(str);
        m23506(c17273);
        return c17273;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView() {
        C10924 c10924 = new C10924(this.f27665);
        m23506(c10924);
        return c10924;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView(String str) {
        C10924 c10924 = new C10924(this.f27665);
        c10924.id(str);
        m23506(c10924);
        return c10924;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton() {
        C4199 c4199 = new C4199(this.f27665);
        m23506(c4199);
        return c4199;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton(String str) {
        C4199 c4199 = new C4199(this.f27665);
        c4199.id(str);
        m23506(c4199);
        return c4199;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox() {
        C19016 c19016 = new C19016(this.f27665);
        m23506(c19016);
        return c19016;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox(String str) {
        C19016 c19016 = new C19016(this.f27665);
        c19016.id(str);
        m23506(c19016);
        return c19016;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton() {
        C1751 c1751 = new C1751(this.f27665);
        m23506(c1751);
        return c1751;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton(String str) {
        C1751 c1751 = new C1751(this.f27665);
        c1751.id(str);
        m23506(c1751);
        return c1751;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton() {
        C6315 c6315 = new C6315(this.f27665);
        m23506(c6315);
        return c6315;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton(String str) {
        C6315 c6315 = new C6315(this.f27665);
        c6315.id(str);
        m23506(c6315);
        return c6315;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner() {
        C7726 c7726 = new C7726(this.f27665);
        m23506(c7726);
        return c7726;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner(String str) {
        C7726 c7726 = new C7726(this.f27665);
        c7726.id(str);
        m23506(c7726);
        return c7726;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar() {
        C10549 c10549 = new C10549(this.f27665);
        m23506(c10549);
        return c10549;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar(String str) {
        C10549 c10549 = new C10549(this.f27665);
        c10549.id(str);
        m23506(c10549);
        return c10549;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText() {
        C20427 c20427 = new C20427(this.f27665, false);
        m23506(c20427);
        return c20427;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText(String str) {
        C20427 c20427 = new C20427(this.f27665, false);
        c20427.id(str);
        m23506(c20427);
        return c20427;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox() {
        C20427 c20427 = new C20427(this.f27665, true);
        m23506(c20427);
        return c20427;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox(String str) {
        C20427 c20427 = new C20427(this.f27665, true);
        c20427.id(str);
        m23506(c20427);
        return c20427;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView() {
        C3493 c3493 = new C3493(this.f27665);
        m23506(c3493);
        return c3493;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView(String str) {
        C3493 c3493 = new C3493(this.f27665);
        c3493.id(str);
        m23506(c3493);
        return c3493;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout() {
        C13370 c13370 = new C13370(this.f27665, this.f27668.f49865, 0);
        m23506(c13370);
        return c13370;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout(String str) {
        C13370 c13370 = new C13370(this.f27665, this.f27668.f49865, 0);
        c13370.id(str);
        m23506(c13370);
        return c13370;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout() {
        C13370 c13370 = new C13370(this.f27665, this.f27668.f49865, 1);
        m23506(c13370);
        return c13370;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout(String str) {
        C13370 c13370 = new C13370(this.f27665, this.f27668.f49865, 1);
        c13370.id(str);
        m23506(c13370);
        return c13370;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout() {
        C4904 c4904 = new C4904(this.f27665, this.f27668.f49865);
        m23506(c4904);
        return c4904;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout(String str) {
        C4904 c4904 = new C4904(this.f27665, this.f27668.f49865);
        c4904.id(str);
        m23506(c4904);
        return c4904;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(boolean z) {
        C11960 c11960 = new C11960(this.f27665, this.f27668.f49865, z ? 1 : 0);
        m23506(c11960);
        return c11960;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(String str, boolean z) {
        C11960 c11960 = new C11960(this.f27665, this.f27668.f49865, z ? 1 : 0);
        c11960.id(str);
        m23506(c11960);
        return c11960;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginView build() {
        throw new UnsupportedOperationException("Method 'build()' is not supported by this PluginUIBuilder");
    }
}
