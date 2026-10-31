package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import l.C13847;
import l.C14369;
import l.C16445;

/* JADX INFO: loaded from: classes.dex */
public class ClickActionDelegate extends C16445 {
    public final C13847 clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new C13847(16, context.getString(i));
    }

    @Override // l.C16445
    public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(view, c14369);
        c14369.m34283(this.clickAction);
    }
}
