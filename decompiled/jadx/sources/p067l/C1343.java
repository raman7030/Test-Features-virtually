package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۤۛ */
/* JADX INFO: compiled from: A60Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1343 {
    /* JADX INFO: renamed from: ֫ */
    public static MenuItem m27378(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    public static CharSequence m27381(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: ۧ */
    public static MenuItem m27380(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: ܳ */
    public static CharSequence m27382(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: ֫ */
    public static MenuItem m27374(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static MenuItem m27379(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m27384(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: ֫ */
    public static MenuItem m27375(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m27373(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: ֫ */
    public static MenuItem m27376(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ܽ */
    public static ColorStateList m27383(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: ֫ */
    public static MenuItem m27377(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static PorterDuff.Mode m27385(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }
}
