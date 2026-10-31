package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.builder.PluginRootLayoutBuilder;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import bin.mt.plugin.api.ui.menu.PluginPopupMenu;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17979 implements PluginUI {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f56078;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final PluginContext f56079;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PluginUI.Style f56081 = PluginUI.DEFAULT_STYLE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f56080 = true;

    public C17979(PluginContext pluginContext, AbstractActivityC3346 abstractActivityC3346) {
        this.f56079 = pluginContext;
        this.f56078 = abstractActivityC3346;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void cancelToast() {
        this.f56079.cancelToast();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginContext getContext() {
        return this.f56079;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToast(CharSequence charSequence) {
        this.f56079.showToast(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToast(CharSequence charSequence, Object... objArr) {
        this.f56079.showToast(charSequence, objArr);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToastL(CharSequence charSequence) {
        this.f56079.showToastL(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showToastL(CharSequence charSequence, Object... objArr) {
        this.f56079.showToastL(charSequence, objArr);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI disableStrictIdMode() {
        this.f56080 = false;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI setStrictIdModeEnabled(boolean z) {
        this.f56080 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final boolean isStrictIdModeEnabled() {
        return this.f56080;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildHorizontalLayout() {
        return new C23248(this, this.f56078, false, 0);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildVerticalLayout() {
        return new C23248(this, this.f56078, false, 1);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginRootLayoutBuilder buildFrameLayout() {
        return new C23248(this, this.f56078, true, 0);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginDialog.Builder buildDialog() {
        return new C21838(this, this.f56078);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginPopupMenu createPopupMenu(PluginView pluginView) {
        return new C9513(this.f56079, this.f56078, pluginView);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showMessage(CharSequence charSequence, CharSequence charSequence2) {
        C21838 c21838 = (C21838) buildDialog();
        c21838.setTitle(charSequence);
        c21838.setMessage(charSequence2);
        c21838.setPositiveButton(C4925.m14327(R.string.MT_Protector), null);
        c21838.show();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showErrorMessage(Throwable th) {
        this.f56078.m10223(th, (DialogInterface.OnDismissListener) null);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final void showPreference(Class cls) {
        Class cls2 = C6398.f19798;
        AbstractActivityC3346 abstractActivityC3346 = this.f56078;
        Intent intent = new Intent(abstractActivityC3346, (Class<?>) cls2);
        intent.putExtra("pluginId", this.f56079.getPluginId());
        if (cls != null) {
            intent.putExtra("pluginPreference", cls.getName());
        }
        abstractActivityC3346.startActivity(intent);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final boolean isDarkTheme() {
        return C21943.m49431();
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorPrimary() {
        return C21943.f70274;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorAccent() {
        return C21943.f70257;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorDivider() {
        return C21943.f70283;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorError() {
        return C21943.f70293;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorWarning() {
        return C21943.f70263;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorText() {
        return C21943.f70284;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int colorTextSecondary() {
        return C21943.f70269;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final ColorStateList colorTextStateList() {
        return C21943.f70275;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final ColorStateList colorTextSecondaryStateList() {
        return C21943.f70273;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dialogPaddingHorizontal() {
        return C11266.m27878(24.0f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dialogPaddingVertical() {
        return C11266.m27878(18.0f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final Drawable selectableItemBackground() {
        return C19890.m45738(this.f56078);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final Drawable selectableItemBackgroundBorderless() {
        return C19890.m45742(this.f56078);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int dp2px(float f) {
        return C11266.m27878(f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final int sp2px(float f) {
        return C11266.m27880(f);
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI.Style getStyle() {
        return this.f56081;
    }

    @Override // bin.mt.plugin.api.ui.PluginUI
    public final PluginUI defaultStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f56081);
            }
        }
        C11003.requireNonNull(style, "Style cannot be null");
        this.f56081 = style;
        return this;
    }
}
