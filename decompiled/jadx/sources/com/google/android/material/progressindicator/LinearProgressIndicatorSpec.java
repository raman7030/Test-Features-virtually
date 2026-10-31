package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.ThemeEnforcement;
import l.C17931;
import l.C19343;

/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public boolean drawHorizontallyInverse;
    public int indeterminateAnimationType;
    public int indicatorDirection;
    public int trackStopIndicatorSize;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f54869);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C19343.f62160, C17931.f54869, LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = typedArrayObtainStyledAttributes.getInt(C19343.f61946, 1);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C19343.f62638, 0);
        this.trackStopIndicatorSize = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f61361, 0), this.trackThickness);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        super.validateSpec();
        if (this.trackStopIndicatorSize < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.indeterminateAnimationType == 0) {
            if (this.trackCornerRadius > 0 && this.indicatorTrackGapSize == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.indicatorColors.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
