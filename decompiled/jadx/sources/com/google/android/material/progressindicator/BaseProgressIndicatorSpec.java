package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import l.C17931;
import l.C19343;
import l.C23575;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public int[] indicatorColors = new int[0];
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public int trackThickness;

    public BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C23575.f76337);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C19343.f62232, i, i2, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C19343.f61167, dimensionPixelSize);
        this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C19343.f62338, 0), this.trackThickness / 2);
        this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C19343.f61964, 0);
        this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C19343.f60848, 0);
        this.indicatorTrackGapSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f60901, 0);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        loadTrackColor(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void loadIndicatorColors(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(C19343.f61220)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C17931.f55686, -1)};
            return;
        }
        if (typedArray.peekValue(C19343.f61220).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(C19343.f61220, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(C19343.f61220, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void loadTrackColor(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(C19343.f62497)) {
            this.trackColor = typedArray.getColor(C19343.f62497, -1);
            return;
        }
        this.trackColor = this.indicatorColors[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public void validateSpec() {
        if (this.indicatorTrackGapSize < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
