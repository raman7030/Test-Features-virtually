package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import l.C13132;
import l.C3060;
import l.C6495;
import l.InterfaceC7002;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends C13132 implements InterfaceC7002 {
    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.InterfaceC7002
    public void initialize(C3060 c3060) {
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new C6495(context, 1, false));
    }
}
