package p067l;

import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
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
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11054 implements PluginUIBuilder {

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f30607;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractC17758 f30608;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f30606 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public PluginUIBuilder f30605 = this;

    public C11054(AbstractC17758 abstractC17758) {
        this.f30608 = abstractC17758;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25457(AbstractC11725 abstractC11725) {
        AbstractC17758 abstractC17758 = this.f30608;
        abstractC17758.f53031.dispatch(abstractC17758.getPluginUI(), abstractC11725);
        this.f30606.add(abstractC11725);
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f30608.getPluginUI();
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView() {
        C18785 c18785 = new C18785(this.f30605);
        m25457(c18785);
        return c18785;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView(String str) {
        C18785 c18785 = new C18785(this.f30605);
        c18785.mo52id(str);
        m25457(c18785);
        return c18785;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView() {
        C12751 c12751 = new C12751(this.f30605);
        m25457(c12751);
        return c12751;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView(String str) {
        C12751 c12751 = new C12751(this.f30605);
        c12751.mo52id(str);
        m25457(c12751);
        return c12751;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton() {
        C6360 c6360 = new C6360(this.f30605);
        m25457(c6360);
        return c6360;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton(String str) {
        C6360 c6360 = new C6360(this.f30605);
        c6360.mo52id(str);
        m25457(c6360);
        return c6360;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox() {
        C20442 c20442 = new C20442(this.f30605);
        m25457(c20442);
        return c20442;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox(String str) {
        C20442 c20442 = new C20442(this.f30605);
        c20442.mo52id(str);
        m25457(c20442);
        return c20442;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton() {
        C4033 c4033 = new C4033(this.f30605);
        m25457(c4033);
        return c4033;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton(String str) {
        C4033 c4033 = new C4033(this.f30605);
        c4033.mo52id(str);
        m25457(c4033);
        return c4033;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton() {
        C8371 c8371 = new C8371(this.f30605);
        m25457(c8371);
        return c8371;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton(String str) {
        C8371 c8371 = new C8371(this.f30605);
        c8371.mo52id(str);
        m25457(c8371);
        return c8371;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner() {
        C9712 c9712 = new C9712(this.f30605);
        m25457(c9712);
        return c9712;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner(String str) {
        C9712 c9712 = new C9712(this.f30605);
        c9712.mo52id(str);
        m25457(c9712);
        return c9712;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar() {
        C12395 c12395 = new C12395(this.f30605);
        m25457(c12395);
        return c12395;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar(String str) {
        C12395 c12395 = new C12395(this.f30605);
        c12395.mo52id(str);
        m25457(c12395);
        return c12395;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText() {
        C21783 c21783 = new C21783(this.f30605, false);
        m25457(c21783);
        return c21783;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText(String str) {
        C21783 c21783 = new C21783(this.f30605, false);
        c21783.mo52id(str);
        m25457(c21783);
        return c21783;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox() {
        C21783 c21783 = new C21783(this.f30605, true);
        m25457(c21783);
        return c21783;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox(String str) {
        C21783 c21783 = new C21783(this.f30605, true);
        c21783.mo52id(str);
        m25457(c21783);
        return c21783;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView() {
        C5689 c5689 = new C5689(this.f30605);
        m25457(c5689);
        return c5689;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView(String str) {
        C5689 c5689 = new C5689(this.f30605);
        c5689.mo52id(str);
        m25457(c5689);
        return c5689;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout() {
        C15076 c15076 = new C15076(this.f30605, this.f30608.f53031, 0);
        m25457(c15076);
        return c15076;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout(String str) {
        C15076 c15076 = new C15076(this.f30605, this.f30608.f53031, 0);
        c15076.mo52id(str);
        m25457(c15076);
        return c15076;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout() {
        C15076 c15076 = new C15076(this.f30605, this.f30608.f53031, 1);
        m25457(c15076);
        return c15076;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout(String str) {
        C15076 c15076 = new C15076(this.f30605, this.f30608.f53031, 1);
        c15076.mo52id(str);
        m25457(c15076);
        return c15076;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout() {
        C7030 c7030 = new C7030(this.f30605, this.f30608.f53031);
        m25457(c7030);
        return c7030;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout(String str) {
        C7030 c7030 = new C7030(this.f30605, this.f30608.f53031);
        c7030.mo52id(str);
        m25457(c7030);
        return c7030;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(boolean z) {
        C13736 c13736 = new C13736(this.f30605, this.f30608.f53031, z ? 1 : 0);
        m25457(c13736);
        return c13736;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(String str, boolean z) {
        C13736 c13736 = new C13736(this.f30605, this.f30608.f53031, z ? 1 : 0);
        c13736.mo52id(str);
        m25457(c13736);
        return c13736;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder
    public final PluginView build() {
        throw new UnsupportedOperationException("Method 'build()' is not supported by this PluginUIBuilder");
    }
}
