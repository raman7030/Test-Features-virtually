package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import l.C13746;
import l.C17648;
import l.C19343;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarItemStyle {
    public final ColorStateList backgroundColor;
    public final Rect insets;
    public final ShapeAppearanceModel itemShape;
    public final ColorStateList strokeColor;
    public final int strokeWidth;
    public final ColorStateList textColor;

    public CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        C13746.m33054(rect.left);
        C13746.m33054(rect.top);
        C13746.m33054(rect.right);
        C13746.m33054(rect.bottom);
        this.insets = rect;
        this.textColor = colorStateList2;
        this.backgroundColor = colorStateList;
        this.strokeColor = colorStateList3;
        this.strokeWidth = i;
        this.itemShape = shapeAppearanceModel;
    }

    public static CalendarItemStyle create(Context context, int i) {
        C13746.m33056("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C19343.f61765);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f61287, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f62564, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f61712, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f61605, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f61871);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f62181);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f61647);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f62073, 0);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f61393, 0), typedArrayObtainStyledAttributes.getResourceId(C19343.f60957, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, shapeAppearanceModelBuild, rect);
    }

    public void styleItem(TextView textView) {
        styleItem(textView, null, null);
    }

    public void styleItem(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.itemShape);
        materialShapeDrawable2.setShapeAppearanceModel(this.itemShape);
        if (colorStateList == null) {
            colorStateList = this.backgroundColor;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        if (colorStateList2 == null) {
            colorStateList2 = this.textColor;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.textColor.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.insets;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        int i = C17648.f53953;
        textView.setBackground(insetDrawable);
    }

    public int getLeftInset() {
        return this.insets.left;
    }

    public int getRightInset() {
        return this.insets.right;
    }

    public int getTopInset() {
        return this.insets.top;
    }

    public int getBottomInset() {
        return this.insets.bottom;
    }
}
