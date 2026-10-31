package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import l.C3060;
import l.C3200;
import l.C5882;

/* JADX INFO: loaded from: classes.dex */
public final class NavigationBarMenu extends C3060 {
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

    @Override // l.C3060, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    @Override // l.C3060
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof C5882) {
                ((C5882) menuItemAddInternal).m16460(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbM9834 = C3200.m9834("Maximum number of items supported by ", simpleName, " is ");
        sbM9834.append(this.maxItemCount);
        sbM9834.append(". Limit can be checked with ");
        sbM9834.append(simpleName);
        sbM9834.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbM9834.toString());
    }
}
