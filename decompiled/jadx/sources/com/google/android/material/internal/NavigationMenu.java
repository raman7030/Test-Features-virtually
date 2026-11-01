package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import p067l.C0994;
import p067l.C1134;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenu extends C0994 {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // p067l.C0994, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1134 c1134 = (C1134) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, c1134);
        c1134.m18377(navigationSubMenu);
        return navigationSubMenu;
    }
}
