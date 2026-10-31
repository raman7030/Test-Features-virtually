package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import l.C17931;
import l.C19343;
import l.C23575;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f54993);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C23575.f75840);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C23575.f75746);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C19343.f62303, i, i2, new int[0]);
        this.indicatorSize = Math.max(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C19343.f60919, dimensionPixelSize), this.trackThickness * 2);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C19343.f61238, dimensionPixelSize2);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C19343.f60866, 0);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
    }

    public int getIndicatorTrackGapSizeDegree() {
        int i = this.indicatorTrackGapSize;
        if (i == 0) {
            return 0;
        }
        return (int) Math.round(360.0d / ((((double) ((this.indicatorSize - (this.indicatorInset * 2)) - this.trackThickness)) * 3.141592653589793d) / ((double) (i + this.trackCornerRadius))));
    }
}
