package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5SO */
/* JADX INFO: loaded from: classes4.dex */
public class C15136 extends C1525 {
    public C15136(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // l.C1525, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iM35838;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.MT_Protector) {
                    view = childAt;
                } else if (id == R.id.MT_Protector) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.MT_Protector && id != R.id.MT_Protector) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM35838 = m35838(view2);
            measuredHeight = view2.getMeasuredHeight() - iM35838;
            paddingBottom += iM35838;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM35838 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingBottom;
        if (view2 != null) {
            int i5 = paddingBottom - iM35838;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM35838 += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM35838, 1073741824));
            paddingBottom = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    C7560 c7560 = (C7560) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c7560).width == -1) {
                        int i8 = ((LinearLayout.LayoutParams) c7560).height;
                        ((LinearLayout.LayoutParams) c7560).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i2, 0);
                        ((LinearLayout.LayoutParams) c7560).height = i8;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35838(View view) {
        int i = C17648.f53953;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m35838(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    @Override // l.C1525, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int iM19938;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int i9 = gravity & 8388615;
        if (i8 == 16) {
            paddingTop = (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        } else if (i8 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
        } else {
            paddingTop = getPaddingTop();
        }
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C7560 c7560 = (C7560) childAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) c7560).gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    iM19938 = C7416.m19938(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) c7560).leftMargin;
                    i5 = ((LinearLayout.LayoutParams) c7560).rightMargin;
                } else {
                    if (absoluteGravity == 5) {
                        iM19938 = paddingRight - measuredWidth;
                        i5 = ((LinearLayout.LayoutParams) c7560).rightMargin;
                    } else {
                        i6 = ((LinearLayout.LayoutParams) c7560).leftMargin + paddingLeft;
                    }
                    if (hasDividerBeforeChildAt(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((LinearLayout.LayoutParams) c7560).topMargin;
                    childAt.layout(i6, i12, measuredWidth + i6, i12 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c7560).bottomMargin + i12;
                }
                i6 = iM19938 - i5;
                if (hasDividerBeforeChildAt(i10)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + ((LinearLayout.LayoutParams) c7560).topMargin;
                childAt.layout(i6, i13, measuredWidth + i6, i13 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c7560).bottomMargin + i13;
            }
        }
    }
}
