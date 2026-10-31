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
import l.AbstractC19902;
import l.AbstractC7201;
import l.C0881;
import l.C13132;
import l.C17931;
import l.C18307;
import l.C18637;
import l.C19343;
import l.C21600;
import l.C23575;
import l.C8184;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends AbstractC7201 {
    public static final int DEF_STYLE_RES = C18637.f58767;
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

    public boolean shouldDrawDivider(int i, AbstractC19902 abstractC19902) {
        return true;
    }

    public MaterialDividerItemDecoration(Context context, int i) {
        this(context, null, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, C17931.f54854, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C19343.f61475, i, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f62007).getDefaultColor();
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19343.f62222, context.getResources().getDimensionPixelSize(C23575.f75704));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f61104, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C19343.f60998, 0);
        this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(C19343.f62275, true);
        typedArrayObtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C18307.m42645(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
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
        Drawable drawableM21684 = C8184.m21684(this.dividerDrawable);
        this.dividerDrawable = drawableM21684;
        C8184.m21683(drawableM21684, i);
    }

    public void setDividerColorResource(Context context, int i) {
        setDividerColor(C0881.m3228(context, i));
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

    @Override // l.AbstractC7201
    public void onDraw(Canvas canvas, C13132 c13132, C21600 c21600) {
        if (c13132.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, c13132);
        } else {
            drawForHorizontalOrientation(canvas, c13132);
        }
    }

    private void drawForVerticalOrientation(Canvas canvas, C13132 c13132) {
        int width;
        int paddingLeft;
        canvas.save();
        if (c13132.getClipToPadding()) {
            paddingLeft = c13132.getPaddingLeft();
            width = c13132.getWidth() - c13132.getPaddingRight();
            canvas.clipRect(paddingLeft, c13132.getPaddingTop(), width, c13132.getHeight() - c13132.getPaddingBottom());
        } else {
            width = c13132.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c13132);
        int i = paddingLeft + (zIsLayoutRtl ? this.insetEnd : this.insetStart);
        int i2 = width - (zIsLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = c13132.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = c13132.getChildAt(i3);
            if (shouldDrawDivider(c13132, childAt)) {
                c13132.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationY()) + this.tempRect.bottom;
                this.dividerDrawable.setBounds(i, iRound - this.thickness, i2, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForHorizontalOrientation(Canvas canvas, C13132 c13132) {
        int height;
        int paddingTop;
        int i;
        int i2;
        canvas.save();
        if (c13132.getClipToPadding()) {
            paddingTop = c13132.getPaddingTop();
            height = c13132.getHeight() - c13132.getPaddingBottom();
            canvas.clipRect(c13132.getPaddingLeft(), paddingTop, c13132.getWidth() - c13132.getPaddingRight(), height);
        } else {
            height = c13132.getHeight();
            paddingTop = 0;
        }
        int i3 = paddingTop + this.insetStart;
        int i4 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(c13132);
        int childCount = c13132.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = c13132.getChildAt(i5);
            if (shouldDrawDivider(c13132, childAt)) {
                c13132.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
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

    @Override // l.AbstractC7201
    public void getItemOffsets(Rect rect, View view, C13132 c13132, C21600 c21600) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(c13132, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(c13132)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    private boolean shouldDrawDivider(C13132 c13132, View view) {
        int childAdapterPosition = c13132.getChildAdapterPosition(view);
        AbstractC19902 adapter = c13132.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, adapter);
    }
}
