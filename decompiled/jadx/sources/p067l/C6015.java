package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۘۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAK1 */
/* JADX INFO: loaded from: classes2.dex */
public class C6015 extends ViewGroup {

    /* JADX INFO: renamed from: ۗ */
    public int f15062;

    /* JADX INFO: renamed from: ۙ */
    public int f15063;

    /* JADX INFO: renamed from: ۬ */
    public int f15064;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f15065;

    /* JADX INFO: renamed from: ᩸ */
    public int f15066;

    /* JADX INFO: renamed from: ᩹ */
    public int f15067;

    public C6015(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6015(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21133.f66419);
        this.f15066 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f15067 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f15062 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f15064 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount() / 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        int i3 = 0;
        int measuredWidth = 0;
        int measuredWidth2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5 = i4 * 2;
            View childAt = getChildAt(i5);
            View childAt2 = getChildAt(i5 + 1);
            childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            if (childAt.getMeasuredWidth() > measuredWidth) {
                measuredWidth = childAt.getMeasuredWidth();
            }
            if (childAt2.getMeasuredWidth() > measuredWidth2) {
                measuredWidth2 = childAt2.getMeasuredWidth();
            }
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f15066 + measuredWidth + measuredWidth2 > paddingLeft) {
            this.f15065 = false;
            while (i3 < childCount) {
                int i6 = i3 * 2;
                View childAt3 = getChildAt(i6);
                View childAt4 = getChildAt(i6 + 1);
                if (i3 != 0) {
                    paddingBottom += this.f15064;
                }
                paddingBottom += childAt4.getMeasuredHeight() + childAt3.getMeasuredHeight() + this.f15062;
                i3++;
            }
        } else {
            this.f15065 = true;
            this.f15063 = measuredWidth;
            while (i3 < childCount) {
                int i7 = i3 * 2;
                View childAt5 = getChildAt(i7);
                View childAt6 = getChildAt(i7 + 1);
                if (i3 != 0) {
                    paddingBottom += this.f15067;
                }
                paddingBottom += Math.max(childAt5.getMeasuredHeight(), childAt6.getMeasuredHeight());
                i3++;
            }
        }
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int childCount = getChildCount() / 2;
        if (!this.f15065) {
            int measuredHeight = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                int i9 = i8 * 2;
                View childAt = getChildAt(i9);
                View childAt2 = getChildAt(i9 + 1);
                childAt.layout(0, measuredHeight, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + measuredHeight);
                int measuredHeight2 = childAt.getMeasuredHeight() + measuredHeight + this.f15062;
                childAt2.layout(0, measuredHeight2, i7, childAt2.getMeasuredHeight() + measuredHeight2);
                measuredHeight = childAt2.getMeasuredHeight() + measuredHeight2 + this.f15064;
            }
            return;
        }
        int i10 = this.f15063;
        int iMax = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int i12 = i11 * 2;
            View childAt3 = getChildAt(i12);
            View childAt4 = getChildAt(i12 + 1);
            int measuredHeight3 = childAt3.getMeasuredHeight();
            int measuredHeight4 = childAt4.getMeasuredHeight();
            if (measuredHeight3 > measuredHeight4) {
                i6 = (measuredHeight3 - measuredHeight4) / 2;
                i5 = 0;
            } else {
                i5 = (measuredHeight4 - measuredHeight3) / 2;
                i6 = 0;
            }
            int i13 = i5 + iMax;
            childAt3.layout(0, i13, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight() + i13);
            int i14 = i6 + iMax;
            childAt4.layout(this.f15066 + i10, i14, i7, childAt4.getMeasuredHeight() + i14);
            iMax = this.f15067 + Math.max(measuredHeight3, measuredHeight4) + iMax;
        }
    }
}
