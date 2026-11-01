package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܰ۬ */
/* JADX INFO: compiled from: 94YU */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceMenuItemC1528 extends MenuItem {
    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1528 setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1528 setTooltipText(CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    InterfaceMenuItemC1528 mo18374(AbstractC1693 abstractC1693);

    /* JADX INFO: renamed from: ֫ */
    AbstractC1693 mo18375();

    /* JADX INFO: renamed from: ۧ */
    boolean mo18383();

    /* JADX INFO: renamed from: ܽ */
    boolean mo18387();
}
