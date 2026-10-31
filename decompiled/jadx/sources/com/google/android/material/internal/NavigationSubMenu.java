package com.google.android.material.internal;

import android.content.Context;
import l.C3060;
import l.C5882;
import l.SubMenuC19703;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationSubMenu extends SubMenuC19703 {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, C5882 c5882) {
        super(context, navigationMenu, c5882);
    }

    @Override // l.C3060
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((C3060) getParentMenu()).onItemsChanged(z);
    }
}
