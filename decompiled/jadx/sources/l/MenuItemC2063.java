package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes2.dex */
public final class MenuItemC2063 extends AbstractC15759 implements MenuItem {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuItemC13827 f6881;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Method f6882;

    public MenuItemC2063(Context context, InterfaceMenuItemC13827 interfaceMenuItemC13827) {
        super(context);
        if (interfaceMenuItemC13827 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f6881 = interfaceMenuItemC13827;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6881.getItemId();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6881.getGroupId();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6881.getOrder();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6881.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f6881.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6881.getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6881.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f6881.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6881.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f6881.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f6881.getIcon();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6881.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6881.getIntent();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f6881.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f6881.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f6881.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f6881.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6881.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6881.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f6881.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f6881.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6881.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6881.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f6881.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f6881.isCheckable();
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f6881.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f6881.isChecked();
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f6881.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f6881.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f6881.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f6881.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6881.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m37162(this.f6881.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6881.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC7293(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f6881.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f6881.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f6881.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C22815(view);
        }
        this.f6881.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        InterfaceMenuItemC13827 interfaceMenuItemC13827 = this.f6881;
        interfaceMenuItemC13827.setActionView(i);
        View actionView = interfaceMenuItemC13827.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC13827.setActionView(new C22815(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f6881.getActionView();
        return actionView instanceof C22815 ? (View) ((C22815) actionView).f73663 : actionView;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC11527 actionProviderVisibilityListenerC11527 = new ActionProviderVisibilityListenerC11527(this, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC11527 = null;
        }
        this.f6881.mo16448(actionProviderVisibilityListenerC11527);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC17151 abstractC17151Mo16449 = this.f6881.mo16449();
        if (abstractC17151Mo16449 instanceof ActionProviderVisibilityListenerC11527) {
            return ((ActionProviderVisibilityListenerC11527) abstractC17151Mo16449).f34412;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f6881.expandActionView();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f6881.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6881.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6881.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC13642(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f6881.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6881.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f6881.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6881.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6881.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6881.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6881.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6881.getIconTintMode();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6747() {
        try {
            Method method = this.f6882;
            InterfaceMenuItemC13827 interfaceMenuItemC13827 = this.f6881;
            if (method == null) {
                this.f6882 = interfaceMenuItemC13827.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f6882.invoke(interfaceMenuItemC13827, Boolean.TRUE);
        } catch (Exception unused) {
        }
    }
}
