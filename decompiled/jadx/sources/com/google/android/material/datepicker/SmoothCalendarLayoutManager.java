package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import l.C13132;
import l.C20607;
import l.C21600;
import l.C6495;

/* JADX INFO: loaded from: classes.dex */
public class SmoothCalendarLayoutManager extends C6495 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;

    public SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // l.C6495, l.AbstractC17366
    public void smoothScrollToPosition(C13132 c13132, C21600 c21600, int i) {
        C20607 c20607 = new C20607(c13132.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            @Override // l.C20607
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        c20607.setTargetPosition(i);
        startSmoothScroll(c20607);
    }
}
