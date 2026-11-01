package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܺ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4NO */
/* JADX INFO: loaded from: classes4.dex */
public class C17379 extends ViewGroup {

    /* JADX INFO: renamed from: ᩸ */
    public int f51861;

    public C17379(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C17379(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21133.f66418);
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 8);
        this.f51861 = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39423(int i) {
        if (this.f51861 != i) {
            this.f51861 = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = this.f51861;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredHeight = -1;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (measuredHeight == -1) {
                measuredHeight = childAt.getMeasuredHeight();
            }
            if (i6 != 0 && i6 % i5 == 0) {
                paddingLeft = getPaddingLeft();
                paddingTop += measuredHeight;
            }
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, paddingTop + measuredHeight);
            paddingLeft += childAt.getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft / this.f51861, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
        if (getChildCount() == 0) {
            paddingBottom = getPaddingBottom() + getPaddingTop();
        } else {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            int measuredHeight = getChildAt(0).getMeasuredHeight();
            int i4 = this.f51861;
            int childCount2 = getChildCount();
            int i5 = childCount2 / i4;
            if (childCount2 % i4 != 0) {
                i5++;
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + (measuredHeight * i5);
        }
        setMeasuredDimension(size, paddingBottom);
    }
}
