package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import l.C3060;
import l.C5882;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenu extends C3060 {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // l.C3060, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C5882 c5882 = (C5882) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, c5882);
        c5882.m16451(navigationSubMenu);
        return navigationSubMenu;
    }
}
