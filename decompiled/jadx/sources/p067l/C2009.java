package p067l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.᩻ۜ */
/* JADX INFO: compiled from: S51M */
/* JADX INFO: loaded from: classes.dex */
public final class C2009 implements InterfaceMenuItemC1528 {

    /* JADX INFO: renamed from: ֫ */
    public CharSequence f78236;

    /* JADX INFO: renamed from: ۘ */
    public CharSequence f78238;

    /* JADX INFO: renamed from: ۢ */
    public char f78241;

    /* JADX INFO: renamed from: ۧ */
    public Context f78242;

    /* JADX INFO: renamed from: ܳ */
    public Drawable f78243;

    /* JADX INFO: renamed from: ܺ */
    public char f78244;

    /* JADX INFO: renamed from: ᩴ */
    public CharSequence f78248;

    /* JADX INFO: renamed from: ᩵ */
    public CharSequence f78249;

    /* JADX INFO: renamed from: ᩷ */
    public Intent f78250;

    /* JADX INFO: renamed from: ۖ */
    public int f78237 = 4096;

    /* JADX INFO: renamed from: ۡ */
    public int f78240 = 4096;

    /* JADX INFO: renamed from: ᩻ */
    public ColorStateList f78251 = null;

    /* JADX INFO: renamed from: ۜ */
    public PorterDuff.Mode f78239 = null;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f78247 = false;

    /* JADX INFO: renamed from: ܿ */
    public boolean f78246 = false;

    /* JADX INFO: renamed from: ܽ */
    public int f78245 = 16;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1693 mo18375() {
        return null;
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18383() {
        return true;
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo18387() {
        return false;
    }

    public C2009(Context context, CharSequence charSequence) {
        this.f78242 = context;
        this.f78238 = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f78241;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f78240;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f78243;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f78250;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f78244;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f78237;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f78238;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f78248;
        return charSequence != null ? charSequence : this.f78238;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f78245 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f78245 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f78245 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f78245 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f78241 = Character.toLowerCase(c);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f78241 = Character.toLowerCase(c);
        this.f78240 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f78245 = (z ? 1 : 0) | (this.f78245 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f78245 = (z ? 2 : 0) | (this.f78245 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f78245 = (z ? 16 : 0) | (this.f78245 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f78243 = drawable;
        m54351();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f78243 = C0886.m5548(this.f78242, i);
        m54351();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f78250 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f78244 = c;
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f78244 = c;
        this.f78237 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f78244 = c;
        this.f78241 = Character.toLowerCase(c2);
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f78244 = c;
        this.f78237 = KeyEvent.normalizeMetaState(i);
        this.f78241 = Character.toLowerCase(c2);
        this.f78240 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f78238 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f78238 = this.f78242.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f78248 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f78245 = (this.f78245 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceMenuItemC1528
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceMenuItemC1528 mo18374(AbstractC1693 abstractC1693) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f78236 = charSequence;
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final InterfaceMenuItemC1528 setContentDescription(CharSequence charSequence) {
        this.f78236 = charSequence;
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f78236;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f78249 = charSequence;
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final InterfaceMenuItemC1528 setTooltipText(CharSequence charSequence) {
        this.f78249 = charSequence;
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f78249;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f78251 = colorStateList;
        this.f78247 = true;
        m54351();
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f78251;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f78239 = mode;
        this.f78246 = true;
        m54351();
        return this;
    }

    @Override // p067l.InterfaceMenuItemC1528, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f78239;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m54351() {
        Drawable drawable = this.f78243;
        if (drawable != null) {
            if (this.f78247 || this.f78246) {
                Drawable drawableM23653 = C1248.m23653(drawable);
                this.f78243 = drawableM23653;
                Drawable drawableMutate = drawableM23653.mutate();
                this.f78243 = drawableMutate;
                if (this.f78247) {
                    C1248.m23645(drawableMutate, this.f78251);
                }
                if (this.f78246) {
                    C1248.m23648(this.f78243, this.f78239);
                }
            }
        }
    }
}
