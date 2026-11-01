package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۢ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U13V */
/* JADX INFO: loaded from: classes3.dex */
public class C11779 extends ViewGroup {
    public C11779(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C11779(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (getChildCount() != 2) {
            setMeasuredDimension(size, 0);
            return;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0);
        childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0);
        if (childAt2.getMeasuredWidth() + childAt.getMeasuredWidth() > size) {
            setMeasuredDimension(size, childAt2.getMeasuredHeight() + childAt.getMeasuredHeight());
        } else {
            setMeasuredDimension(size, Math.max(childAt.getMeasuredHeight(), childAt2.getMeasuredHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 2) {
            return;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        int i5 = i3 - i;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredWidth2 = childAt2.getMeasuredWidth();
        int measuredHeight2 = childAt2.getMeasuredHeight();
        childAt.layout(0, 0, measuredWidth, measuredHeight);
        if (measuredWidth + measuredWidth2 > i5) {
            childAt2.layout(0, measuredHeight, measuredWidth2, measuredHeight2 + measuredHeight);
        } else {
            childAt2.layout(i5 - measuredWidth2, 0, i5, measuredHeight2);
        }
    }
}
