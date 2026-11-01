package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.builder.PluginRootLayoutBuilder;
import bin.p000mt.plugin.api.p002ui.dialog.PluginDialog;
import bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19456 implements PluginUI {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f59275;

    /* JADX INFO: renamed from: ۧ */
    public final PluginContext f59276;

    /* JADX INFO: renamed from: ᩳ */
    public PluginUI.Style f59278 = PluginUI.DEFAULT_STYLE;

    /* JADX INFO: renamed from: ܽ */
    public boolean f59277 = true;

    public C19456(PluginContext pluginContext, AbstractActivityC5549 abstractActivityC5549) {
        this.f59276 = pluginContext;
        this.f59275 = abstractActivityC5549;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void cancelToast() {
        this.f59276.cancelToast();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginContext getContext() {
        return this.f59276;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void showToast(CharSequence charSequence) {
        this.f59276.showToast(charSequence);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void showToast(CharSequence charSequence, Object... objArr) {
        this.f59276.showToast(charSequence, objArr);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void showToastL(CharSequence charSequence) {
        this.f59276.showToastL(charSequence);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void showToastL(CharSequence charSequence, Object... objArr) {
        this.f59276.showToastL(charSequence, objArr);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginUI disableStrictIdMode() {
        this.f59277 = false;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginUI setStrictIdModeEnabled(boolean z) {
        this.f59277 = z;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final boolean isStrictIdModeEnabled() {
        return this.f59277;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginRootLayoutBuilder buildHorizontalLayout() {
        return new C24464(this, this.f59275, false, 0);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginRootLayoutBuilder buildVerticalLayout() {
        return new C24464(this, this.f59275, false, 1);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginRootLayoutBuilder buildFrameLayout() {
        return new C24464(this, this.f59275, true, 0);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginDialog.Builder buildDialog() {
        return new C23124(this, this.f59275);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginPopupMenu createPopupMenu(PluginView pluginView) {
        return new C11410(this.f59276, this.f59275, pluginView);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void showMessage(CharSequence charSequence, CharSequence charSequence2) {
        C23124 c23124 = (C23124) buildDialog();
        c23124.setTitle(charSequence);
        c23124.setMessage(charSequence2);
        c23124.setPositiveButton(C7050.m16224(R.string.MT_Protector), null);
        c23124.show();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void showErrorMessage(Throwable th) {
        this.f59275.m12259(th, (DialogInterface.OnDismissListener) null);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final void showPreference(Class cls) {
        Class cls2 = C8450.f22671;
        AbstractActivityC5549 abstractActivityC5549 = this.f59275;
        Intent intent = new Intent(abstractActivityC5549, (Class<?>) cls2);
        intent.putExtra("pluginId", this.f59276.getPluginId());
        if (cls != null) {
            intent.putExtra("pluginPreference", cls.getName());
        }
        abstractActivityC5549.startActivity(intent);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final boolean isDarkTheme() {
        return C23223.m51768();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int colorPrimary() {
        return C23223.f72985;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int colorAccent() {
        return C23223.f72969;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int colorDivider() {
        return C23223.f72994;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int colorError() {
        return C23223.f73004;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int colorWarning() {
        return C23223.f72975;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int colorText() {
        return C23223.f72995;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int colorTextSecondary() {
        return C23223.f72980;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final ColorStateList colorTextStateList() {
        return C23223.f72986;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final ColorStateList colorTextSecondaryStateList() {
        return C23223.f72984;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int dialogPaddingHorizontal() {
        return C13076.m29939(24.0f);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int dialogPaddingVertical() {
        return C13076.m29939(18.0f);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final Drawable selectableItemBackground() {
        return C21272.m48049(this.f59275);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final Drawable selectableItemBackgroundBorderless() {
        return C21272.m48053(this.f59275);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int dp2px(float f) {
        return C13076.m29939(f);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final int sp2px(float f) {
        return C13076.m29941(f);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginUI.Style getStyle() {
        return this.f59278;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginUI
    public final PluginUI defaultStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f59278);
            }
        }
        C12826.requireNonNull(style, "Style cannot be null");
        this.f59278 = style;
        return this;
    }
}
