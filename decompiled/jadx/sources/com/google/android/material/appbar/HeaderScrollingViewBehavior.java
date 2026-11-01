package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p067l.C0932;
import p067l.C1540;
import p067l.C1717;
import p067l.C1751;
import p067l.C1914;

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

    @Override // p067l.AbstractC1155
    public boolean onMeasureChild(C1751 c1751, View view, int i, int i2, int i3, int i4) {
        View viewFindFirstDependency;
        C1914 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewFindFirstDependency = findFirstDependency(c1751.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            int i6 = C1717.f57146;
            if (viewFindFirstDependency.getFitsSystemWindows() && (lastWindowInsets = c1751.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m51183() + lastWindowInsets.m51174();
            }
        } else {
            size = c1751.getHeight();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        c1751.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(C1751 c1751, View view, int i) {
        View viewFindFirstDependency = findFirstDependency(c1751.getDependencies(view));
        if (viewFindFirstDependency != null) {
            C1540 c1540 = (C1540) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(c1751.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1540).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c1540).topMargin, (c1751.getWidth() - c1751.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1540).rightMargin, ((viewFindFirstDependency.getBottom() + c1751.getHeight()) - c1751.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1540).bottomMargin);
            C1914 lastWindowInsets = c1751.getLastWindowInsets();
            if (lastWindowInsets != null) {
                int i2 = C1717.f57146;
                if (c1751.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.m51172() + rect.left;
                    rect.right -= lastWindowInsets.m51182();
                }
            }
            Rect rect2 = this.tempRect2;
            Gravity.apply(resolveGravity(c1540.f45604), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
            return;
        }
        super.layoutChild(c1751, view, i);
        this.verticalLayoutGap = 0;
    }

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return C0932.m8234((int) (overlapRatioForOffset * i), 0, i);
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
