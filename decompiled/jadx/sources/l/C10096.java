package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A60Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10096 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25359(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m25362(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m25361(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static CharSequence m25363(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25355(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m25360(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m25365(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25356(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25354(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25357(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m25364(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25358(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m25366(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }
}
