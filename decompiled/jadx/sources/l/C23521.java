package l;

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

/* JADX INFO: renamed from: l.᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S51M */
/* JADX INFO: loaded from: classes.dex */
public final class C23521 implements InterfaceMenuItemC13827 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f75490;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public CharSequence f75492;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public char f75495;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Context f75496;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Drawable f75497;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char f75498;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f75502;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public CharSequence f75503;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Intent f75504;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f75491 = 4096;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f75494 = 4096;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ColorStateList f75505 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f75493 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f75501 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f75500 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75499 = 16;

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

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17151 mo16449() {
        return null;
    }

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16457() {
        return true;
    }

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16461() {
        return false;
    }

    public C23521(Context context, CharSequence charSequence) {
        this.f75496 = context;
        this.f75492 = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f75495;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f75494;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f75497;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f75504;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f75498;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f75491;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f75492;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f75502;
        return charSequence != null ? charSequence : this.f75492;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f75499 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f75499 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f75499 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f75499 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f75495 = Character.toLowerCase(c);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f75495 = Character.toLowerCase(c);
        this.f75494 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f75499 = (z ? 1 : 0) | (this.f75499 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f75499 = (z ? 2 : 0) | (this.f75499 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f75499 = (z ? 16 : 0) | (this.f75499 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f75497 = drawable;
        m51949();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f75497 = C0881.m3234(this.f75496, i);
        m51949();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f75504 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f75498 = c;
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f75498 = c;
        this.f75491 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f75498 = c;
        this.f75495 = Character.toLowerCase(c2);
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f75498 = c;
        this.f75491 = KeyEvent.normalizeMetaState(i);
        this.f75495 = Character.toLowerCase(c2);
        this.f75494 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f75492 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f75492 = this.f75496.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f75502 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f75499 = (this.f75499 & 8) | (z ? 0 : 8);
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

    @Override // l.InterfaceMenuItemC13827
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceMenuItemC13827 mo16448(AbstractC17151 abstractC17151) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f75490 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final InterfaceMenuItemC13827 setContentDescription(CharSequence charSequence) {
        this.f75490 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f75490;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f75503 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final InterfaceMenuItemC13827 setTooltipText(CharSequence charSequence) {
        this.f75503 = charSequence;
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f75503;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f75505 = colorStateList;
        this.f75501 = true;
        m51949();
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f75505;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f75493 = mode;
        this.f75500 = true;
        m51949();
        return this;
    }

    @Override // l.InterfaceMenuItemC13827, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f75493;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m51949() {
        Drawable drawable = this.f75497;
        if (drawable != null) {
            if (this.f75501 || this.f75500) {
                Drawable drawableM21684 = C8184.m21684(drawable);
                this.f75497 = drawableM21684;
                Drawable drawableMutate = drawableM21684.mutate();
                this.f75497 = drawableMutate;
                if (this.f75501) {
                    C8184.m21676(drawableMutate, this.f75505);
                }
                if (this.f75500) {
                    C8184.m21679(this.f75497, this.f75493);
                }
            }
        }
    }
}
