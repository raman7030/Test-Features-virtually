package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import p067l.C14849;
import p067l.C21953;
import p067l.C22897;
import p067l.C8541;

/* JADX INFO: loaded from: classes.dex */
public class SmoothCalendarLayoutManager extends C8541 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;

    public SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // p067l.C8541, p067l.AbstractC18873
    public void smoothScrollToPosition(C14849 c14849, C22897 c22897, int i) {
        C21953 c21953 = new C21953(c14849.getContext()) { // from class: com.google.android.material.datepicker.SmoothCalendarLayoutManager.1
            @Override // p067l.C21953
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
        c21953.setTargetPosition(i);
        startSmoothScroll(c21953);
    }
}
