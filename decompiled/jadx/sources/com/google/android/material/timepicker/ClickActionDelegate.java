package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import p067l.C1529;
import p067l.C1555;
import p067l.C1658;

/* JADX INFO: loaded from: classes.dex */
public class ClickActionDelegate extends C1658 {
    public final C1529 clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new C1529(16, context.getString(i));
    }

    @Override // p067l.C1658
    public void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
        super.onInitializeAccessibilityNodeInfo(view, c1555);
        c1555.m36416(this.clickAction);
    }
}
