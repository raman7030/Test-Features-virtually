package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p067l.C0994;
import p067l.C1134;
import p067l.C5410;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationBarMenu extends C0994 {
    public final int maxItemCount;
    public final Class viewClass;

    public NavigationBarMenu(Context context, Class cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }

    @Override // p067l.C0994, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    @Override // p067l.C0994
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof C1134) {
                ((C1134) menuItemAddInternal).m18386(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbM11879 = C5410.m11879("Maximum number of items supported by ", simpleName, " is ");
        sbM11879.append(this.maxItemCount);
        sbM11879.append(". Limit can be checked with ");
        sbM11879.append(simpleName);
        sbM11879.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbM11879.toString());
    }
}
