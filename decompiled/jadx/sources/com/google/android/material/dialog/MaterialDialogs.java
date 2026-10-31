package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import l.C19343;
import l.C23575;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDialogs {
    public static InsetDrawable insetDrawable(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Rect getDialogBackgroundInsets(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, null, C19343.f62052, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f62479, context.getResources().getDimensionPixelSize(C23575.f76441));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f62532, context.getResources().getDimensionPixelSize(C23575.f75875));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f61999, context.getResources().getDimensionPixelSize(C23575.f76133));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f61467, context.getResources().getDimensionPixelSize(C23575.f76229));
        typedArrayObtainStyledAttributes.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}
