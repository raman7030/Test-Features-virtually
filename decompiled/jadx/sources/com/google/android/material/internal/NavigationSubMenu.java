package com.google.android.material.internal;

import android.content.Context;
import p067l.C0994;
import p067l.C1134;
import p067l.SubMenuC1819;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationSubMenu extends SubMenuC1819 {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, C1134 c1134) {
        super(context, navigationMenu, c1134);
    }

    @Override // p067l.C0994
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((C0994) getParentMenu()).onItemsChanged(z);
    }
}
