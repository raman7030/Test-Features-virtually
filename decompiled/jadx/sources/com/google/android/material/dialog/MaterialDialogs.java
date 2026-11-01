package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import p067l.C20752;
import p067l.C24774;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDialogs {
    public static InsetDrawable insetDrawable(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Rect getDialogBackgroundInsets(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, null, C20752.f64868, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C20752.f65148, context.getResources().getDimensionPixelSize(C24774.f79187));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C20752.f65183, context.getResources().getDimensionPixelSize(C24774.f78621));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C20752.f64833, context.getResources().getDimensionPixelSize(C24774.f78879));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C20752.f64483, context.getResources().getDimensionPixelSize(C24774.f78975));
        typedArrayObtainStyledAttributes.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }
}
