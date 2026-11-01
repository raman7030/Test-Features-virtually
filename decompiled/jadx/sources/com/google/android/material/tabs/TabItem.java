package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p067l.C1970;
import p067l.C20752;

/* JADX INFO: loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1970 c1970M53128 = C1970.m53128(context, attributeSet, C20752.f82647);
        this.text = c1970M53128.m53150(C20752.f82629);
        this.icon = c1970M53128.m53148(C20752.f82592);
        this.customLayout = c1970M53128.m53139(C20752.f82484, 0);
        c1970M53128.m53146();
    }
}
