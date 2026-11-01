package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import p067l.C0994;
import p067l.C14849;
import p067l.C8541;
import p067l.InterfaceC1189;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends C14849 implements InterfaceC1189 {
    public int getWindowAnimations() {
        return 0;
    }

    @Override // p067l.InterfaceC1189
    public void initialize(C0994 c0994) {
    }

    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new C8541(context, 1, false));
    }
}
