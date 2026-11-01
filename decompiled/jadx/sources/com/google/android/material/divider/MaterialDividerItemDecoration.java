package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import p067l.AbstractC21283;
import p067l.AbstractC9212;
import p067l.C0886;
import p067l.C1248;
import p067l.C14849;
import p067l.C19410;
import p067l.C19768;
import p067l.C20081;
import p067l.C20752;
import p067l.C22897;
import p067l.C24774;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends AbstractC9212 {
    public static final int DEF_STYLE_RES = C20081.f61990;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public int color;
    public Drawable dividerDrawable;
    public int insetEnd;
    public int insetStart;
    public boolean lastItemDecorated;
    public int orientation;
    public final Rect tempRect;
    public int thickness;

    public boolean shouldDrawDivider(int i, AbstractC21283 abstractC21283) {
        return true;
    }

    public MaterialDividerItemDecoration(Context context, int i) {
        this(context, null, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, C19410.f58051, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C20752.f82547, i, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C20752.f82729).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C20752.f82804, context.getResources().getDimensionPixelSize(C24774.f78450));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C20752.f82421, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C20752.f82385, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(C20752.f82822, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C19768.m44906(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setDividerThickness(int i) {
        this.thickness = i;
    }

    public void setDividerThicknessResource(Context context, int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerColor(int i) {
        this.color = i;
        Drawable drawableM23653 = C1248.m23653(this.dividerDrawable);
        this.dividerDrawable = drawableM23653;
        C1248.m23652(drawableM23653, i);
    }

    public void setDividerColorResource(Context context, int i) {
        setDividerColor(C0886.m5542(context, i));
    }

    public int getDividerColor() {
        return this.color;
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(Context context, int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(Context context, int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public void setLastItemDecorated(boolean z) {
        this.lastItemDecorated = z;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // p067l.AbstractC9212
    public void onDraw(Canvas canvas, C14849 c14849, C22897 c22897) {
        if (c14849.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, c14849);
        } else {
            drawForHorizontalOrientation(canvas, c14849);
        }
    }

    private void drawForVerticalOrientation(Canvas canvas, C14849 c14849) {
        int width;
        int paddingLeft;
        canvas.save();
        if (c14849.getClipToPadding()) {
            paddingLeft = c14849.getPaddingLeft();
            width = c14849.getWidth() - c14849.getPaddingRight();
            canvas.clipRect(paddingLeft, c14849.getPaddingTop(), width, c14849.getHeight() - c14849.getPaddingBottom());
        } else {
            width = c14849.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c14849);
        int i = paddingLeft + (zIsLayoutRtl ? this.insetEnd : this.insetStart);
        int i2 = width - (zIsLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = c14849.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = c14849.getChildAt(i3);
            if (shouldDrawDivider(c14849, childAt)) {
                c14849.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationY()) + this.tempRect.bottom;
                this.dividerDrawable.setBounds(i, iRound - this.thickness, i2, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForHorizontalOrientation(Canvas canvas, C14849 c14849) {
        int height;
        int paddingTop;
        int i;
        int i2;
        canvas.save();
        if (c14849.getClipToPadding()) {
            paddingTop = c14849.getPaddingTop();
            height = c14849.getHeight() - c14849.getPaddingBottom();
            canvas.clipRect(c14849.getPaddingLeft(), paddingTop, c14849.getWidth() - c14849.getPaddingRight(), height);
        } else {
            height = c14849.getHeight();
            paddingTop = 0;
        }
        int i3 = paddingTop + this.insetStart;
        int i4 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c14849);
        int childCount = c14849.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = c14849.getChildAt(i5);
            if (shouldDrawDivider(c14849, childAt)) {
                c14849.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationX());
                if (zIsLayoutRtl) {
                    i2 = this.tempRect.left + iRound;
                    i = this.thickness + i2;
                } else {
                    i = iRound + this.tempRect.right;
                    i2 = i - this.thickness;
                }
                this.dividerDrawable.setBounds(i2, i3, i, i4);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // p067l.AbstractC9212
    public void getItemOffsets(Rect rect, View view, C14849 c14849, C22897 c22897) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(c14849, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(c14849)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    private boolean shouldDrawDivider(C14849 c14849, View view) {
        int childAdapterPosition = c14849.getChildAdapterPosition(view);
        AbstractC21283 adapter = c14849.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, adapter);
    }
}
