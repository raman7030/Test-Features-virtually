package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import l.C14077;
import l.C17648;
import l.C1814;
import l.C18333;
import l.C21610;

/* JADX INFO: loaded from: classes.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int overlayTop;
    public final Rect tempRect1;
    public final Rect tempRect2;
    public int verticalLayoutGap;

    public static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    public abstract View findFirstDependency(List list);

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    @Override // l.AbstractC6317
    public boolean onMeasureChild(C18333 c18333, View view, int i, int i2, int i3, int i4) {
        View viewFindFirstDependency;
        C21610 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewFindFirstDependency = findFirstDependency(c18333.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            int i6 = C17648.f53953;
            if (viewFindFirstDependency.getFitsSystemWindows() && (lastWindowInsets = c18333.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m48835() + lastWindowInsets.m48826();
            }
        } else {
            size = c18333.getHeight();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        c18333.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(C18333 c18333, View view, int i) {
        View viewFindFirstDependency = findFirstDependency(c18333.getDependencies(view));
        if (viewFindFirstDependency != null) {
            C14077 c14077 = (C14077) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(c18333.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c14077).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c14077).topMargin, (c18333.getWidth() - c18333.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c14077).rightMargin, ((viewFindFirstDependency.getBottom() + c18333.getHeight()) - c18333.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c14077).bottomMargin);
            C21610 lastWindowInsets = c18333.getLastWindowInsets();
            if (lastWindowInsets != null) {
                int i2 = C17648.f53953;
                if (c18333.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.m48824() + rect.left;
                    rect.right -= lastWindowInsets.m48834();
                }
            }
            Rect rect2 = this.tempRect2;
            Gravity.apply(resolveGravity(c14077.f42518), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
            return;
        }
        super.layoutChild(c18333, view, i);
        this.verticalLayoutGap = 0;
    }

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return C1814.m6036((int) (overlapRatioForOffset * i), 0, i);
    }

    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }
}
