package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import l.C14615;
import l.C17931;
import l.C19343;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends C14615 {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        initialize(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        initialize(attributeSet, i, i2);
    }

    @Override // l.C14615, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i);
        }
    }

    private void initialize(AttributeSet attributeSet, int i, int i2) {
        int iFindViewAppearanceResourceId;
        Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            Resources.Theme theme = context.getTheme();
            if (viewAttrsHasLineHeight(context, theme, attributeSet, i, i2) || (iFindViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, iFindViewAppearanceResourceId);
        }
    }

    private void applyLineHeightFromViewAppearance(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, C19343.f61688);
        int firstAvailableDimension = readFirstAvailableDimension(getContext(), typedArrayObtainStyledAttributes, C19343.f61847, C19343.f61369);
        typedArrayObtainStyledAttributes.recycle();
        if (firstAvailableDimension >= 0) {
            setLineHeight(firstAvailableDimension);
        }
    }

    public static boolean canApplyTextAppearanceLineHeight(Context context) {
        return MaterialAttributes.resolveBoolean(context, C17931.f55900, true);
    }

    public static int readFirstAvailableDimension(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            dimensionPixelSize = MaterialResources.getDimensionPixelSize(context, typedArray, iArr[i], -1);
        }
        return dimensionPixelSize;
    }

    public static boolean viewAttrsHasLineHeight(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C19343.f60965, i, i2);
        int firstAvailableDimension = readFirstAvailableDimension(context, typedArrayObtainStyledAttributes, C19343.f61655, C19343.f62189);
        typedArrayObtainStyledAttributes.recycle();
        return firstAvailableDimension != -1;
    }

    public static int findViewAppearanceResourceId(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C19343.f60965, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C19343.f62081, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
