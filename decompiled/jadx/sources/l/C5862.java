package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۛۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A60Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5862 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16422(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC13827) {
            ((InterfaceMenuItemC13827) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C10096.m25359(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16424(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC13827) {
            ((InterfaceMenuItemC13827) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C10096.m25361(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16423(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC13827) {
            ((InterfaceMenuItemC13827) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C10096.m25360(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16419(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC13827) {
            ((InterfaceMenuItemC13827) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C10096.m25356(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16420(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC13827) {
            ((InterfaceMenuItemC13827) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C10096.m25357(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16421(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC13827) {
            ((InterfaceMenuItemC13827) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C10096.m25358(menuItem, mode);
        }
    }
}
