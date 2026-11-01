package p067l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۛۛ */
/* JADX INFO: compiled from: A60Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C1133 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18347(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC1528) {
            ((InterfaceMenuItemC1528) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1343.m27378(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18349(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC1528) {
            ((InterfaceMenuItemC1528) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1343.m27380(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18348(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC1528) {
            ((InterfaceMenuItemC1528) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1343.m27379(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18344(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof InterfaceMenuItemC1528) {
            ((InterfaceMenuItemC1528) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1343.m27375(menuItem, c, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18345(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC1528) {
            ((InterfaceMenuItemC1528) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1343.m27376(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18346(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC1528) {
            ((InterfaceMenuItemC1528) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1343.m27377(menuItem, mode);
        }
    }
}
