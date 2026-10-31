package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5DB */
/* JADX INFO: loaded from: classes2.dex */
public class C1525 extends ViewGroup {
    public static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    public static final int INDEX_BOTTOM = 2;
    public static final int INDEX_CENTER_VERTICAL = 0;
    public static final int INDEX_FILL = 3;
    public static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GRAVITY_COUNT = 4;
    public boolean mBaselineAligned;
    public int mBaselineAlignedChildIndex;
    public int mBaselineChildTop;
    public Drawable mDivider;
    public int mDividerHeight;
    public int mDividerPadding;
    public int mDividerWidth;
    public int mGravity;
    public int[] mMaxAscent;
    public int[] mMaxDescent;
    public int mOrientation;
    public int mShowDividers;
    public int mTotalLength;
    public boolean mUseLargestChild;
    public float mWeightSum;

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int measureNullChild(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C1525(Context context) {
        this(context, null);
    }

    public C1525(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1525(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = C3390.f10718;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, c22733M50796.m50810(), i);
        int iM50809 = c22733M50796.m50809(1, -1);
        if (iM50809 >= 0) {
            setOrientation(iM50809);
        }
        int iM508010 = c22733M50796.m50809(0, -1);
        if (iM508010 >= 0) {
            setGravity(iM508010);
        }
        boolean zM50801 = c22733M50796.m50801(2, true);
        if (!zM50801) {
            setBaselineAligned(zM50801);
        }
        this.mWeightSum = c22733M50796.m50797();
        this.mBaselineAlignedChildIndex = c22733M50796.m50809(3, -1);
        this.mUseLargestChild = c22733M50796.m50801(7, false);
        setDividerDrawable(c22733M50796.m50815(5));
        this.mShowDividers = c22733M50796.m50809(8, 0);
        this.mDividerPadding = c22733M50796.m50803(6, 0);
        c22733M50796.m50813();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((C7560) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((C7560) virtualChildAt2.getLayoutParams())).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        int i2 = C22461.f72738;
        boolean z = getLayoutDirection() == 1;
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i3)) {
                C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                if (z) {
                    left2 = virtualChildAt.getRight() + ((LinearLayout.LayoutParams) c7560).rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) c7560).leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                C7560 c7561 = (C7560) virtualChildAt2.getLayoutParams();
                if (z) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) c7561).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) c7561).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iM19938 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != 48) {
            if (i == 16) {
                iM19938 = C7416.m19938(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, iM19938);
            } else if (i == 80) {
                iM19938 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return iM19938 + ((LinearLayout.LayoutParams) ((C7560) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0334  */
    public void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int iMax;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int childrenSkipCount;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C7560 c7560;
        boolean z2;
        int iMax2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i17 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        float f = 0.0f;
        int i18 = 0;
        int iMax3 = 0;
        int i19 = 0;
        int iMax4 = 0;
        int i20 = 0;
        int childrenSkipCount2 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (childrenSkipCount2 < virtualChildCount) {
            int i21 = i18;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount2);
                i9 = iMax3;
            } else {
                i9 = iMax3;
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount2)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    C7560 c7561 = (C7560) virtualChildAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) c7561).weight;
                    float f3 = f + f2;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) c7561).height == 0 && f2 > 0.0f) {
                        int i22 = this.mTotalLength;
                        this.mTotalLength = Math.max(i22, ((LinearLayout.LayoutParams) c7561).topMargin + i22 + ((LinearLayout.LayoutParams) c7561).bottomMargin);
                        z4 = true;
                        c7560 = c7561;
                        i12 = i19;
                        i11 = i9;
                        i15 = virtualChildCount;
                        i13 = mode2;
                        i14 = i21;
                        i16 = i20;
                    } else {
                        int i23 = i19;
                        if (((LinearLayout.LayoutParams) c7561).height != 0 || f2 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c7561).height = -2;
                            i10 = 0;
                        }
                        i11 = i9;
                        int i24 = i10;
                        i12 = i23;
                        i13 = mode2;
                        i14 = i21;
                        int i25 = iMax4;
                        i15 = virtualChildCount;
                        i16 = i20;
                        measureChildBeforeLayout(virtualChildAt, childrenSkipCount2, i, 0, i2, f3 == 0.0f ? this.mTotalLength : 0);
                        c7560 = c7561;
                        if (i24 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c7560).height = i24;
                        }
                        int measuredHeight = virtualChildAt.getMeasuredHeight();
                        int i26 = this.mTotalLength;
                        virtualChildAt = virtualChildAt;
                        this.mTotalLength = Math.max(i26, i26 + measuredHeight + ((LinearLayout.LayoutParams) c7560).topMargin + ((LinearLayout.LayoutParams) c7560).bottomMargin + getNextLocationOffset(virtualChildAt));
                        iMax4 = z3 ? Math.max(measuredHeight, i25) : i25;
                    }
                    if (i17 >= 0 && i17 == childrenSkipCount2 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (childrenSkipCount2 < i17 && ((LinearLayout.LayoutParams) c7560).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) c7560).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z6 = true;
                    }
                    int i27 = ((LinearLayout.LayoutParams) c7560).leftMargin + ((LinearLayout.LayoutParams) c7560).rightMargin;
                    int measuredWidth = virtualChildAt.getMeasuredWidth() + i27;
                    int iMax5 = Math.max(i14, measuredWidth);
                    int iCombineMeasuredStates = View.combineMeasuredStates(i12, virtualChildAt.getMeasuredState());
                    boolean z7 = z5 && ((LinearLayout.LayoutParams) c7560).width == -1;
                    if (((LinearLayout.LayoutParams) c7560).weight > 0.0f) {
                        if (!z2) {
                            i27 = measuredWidth;
                        }
                        iMax2 = Math.max(i16, i27);
                        iMax3 = i11;
                    } else {
                        if (!z2) {
                            i27 = measuredWidth;
                        }
                        iMax3 = Math.max(i11, i27);
                        iMax2 = i16;
                    }
                    childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                    i18 = iMax5;
                    i19 = iCombineMeasuredStates;
                    z5 = z7;
                    i20 = iMax2;
                    f = f3;
                }
                childrenSkipCount2++;
                mode2 = i13;
                virtualChildCount = i15;
            }
            i13 = mode2;
            i18 = i21;
            iMax3 = i9;
            i15 = virtualChildCount;
            childrenSkipCount2++;
            mode2 = i13;
            virtualChildCount = i15;
        }
        int i28 = iMax3;
        int iCombineMeasuredStates2 = i19;
        int i29 = iMax4;
        int i30 = virtualChildCount;
        int i31 = mode2;
        int i32 = 8;
        int iMax6 = i18;
        int i33 = i20;
        if (this.mTotalLength > 0) {
            i3 = i30;
            if (hasDividerBeforeChildAt(i3)) {
                this.mTotalLength += this.mDividerHeight;
            }
        } else {
            i3 = i30;
        }
        if (z3) {
            i4 = i31;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i34 = 0;
                this.mTotalLength = 0;
                while (i34 < i3) {
                    View virtualChildAt2 = getVirtualChildAt(i34);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(i34);
                    } else {
                        if (virtualChildAt2.getVisibility() == i32) {
                            childrenSkipCount = i34 + getChildrenSkipCount(virtualChildAt2, i34);
                        } else {
                            C7560 c7562 = (C7560) virtualChildAt2.getLayoutParams();
                            int i35 = this.mTotalLength;
                            this.mTotalLength = Math.max(i35, i35 + i29 + ((LinearLayout.LayoutParams) c7562).topMargin + ((LinearLayout.LayoutParams) c7562).bottomMargin + getNextLocationOffset(virtualChildAt2));
                        }
                        i34 = childrenSkipCount + 1;
                        i32 = 8;
                    }
                    childrenSkipCount = i34;
                    i34 = childrenSkipCount + 1;
                    i32 = 8;
                }
            }
        } else {
            i4 = i31;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
        this.mTotalLength = paddingBottom;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
        int i36 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z4 || (i36 != 0 && f > 0.0f)) {
            float f4 = this.mWeightSum;
            if (f4 > 0.0f) {
                f = f4;
            }
            this.mTotalLength = 0;
            int i37 = 0;
            while (i37 < i3) {
                View virtualChildAt3 = getVirtualChildAt(i37);
                if (virtualChildAt3.getVisibility() == 8) {
                    i5 = i36;
                    i6 = i4;
                } else {
                    C7560 c7563 = (C7560) virtualChildAt3.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) c7563).weight;
                    if (f5 > 0.0f) {
                        int i38 = (int) ((i36 * f5) / f);
                        float f6 = f - f5;
                        int i39 = i36 - i38;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c7563).leftMargin + ((LinearLayout.LayoutParams) c7563).rightMargin, ((LinearLayout.LayoutParams) c7563).width);
                        if (((LinearLayout.LayoutParams) c7563).height == 0) {
                            i8 = 1073741824;
                            if (i4 == 1073741824) {
                                if (i38 <= 0) {
                                    i38 = 0;
                                }
                                virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-256));
                            f = f6;
                            i5 = i39;
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i38;
                        virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2 < 0 ? 0 : measuredHeight2, i8));
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-256));
                        f = f6;
                        i5 = i39;
                    } else {
                        i5 = i36;
                    }
                    float f7 = f;
                    int i40 = ((LinearLayout.LayoutParams) c7563).leftMargin + ((LinearLayout.LayoutParams) c7563).rightMargin;
                    int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i40;
                    iMax6 = Math.max(iMax6, measuredWidth2);
                    if (mode != 1073741824) {
                        i6 = i4;
                        i7 = -1;
                        if (((LinearLayout.LayoutParams) c7563).width != -1) {
                        }
                        int iMax7 = Math.max(i28, i40);
                        if (z5 || ((LinearLayout.LayoutParams) c7563).width != i7) {
                            z = false;
                        } else {
                            z = true;
                        }
                        int i41 = this.mTotalLength;
                        this.mTotalLength = Math.max(i41, virtualChildAt3.getMeasuredHeight() + i41 + ((LinearLayout.LayoutParams) c7563).topMargin + ((LinearLayout.LayoutParams) c7563).bottomMargin + getNextLocationOffset(virtualChildAt3));
                        z5 = z;
                        f = f7;
                        i28 = iMax7;
                    } else {
                        i6 = i4;
                        i7 = -1;
                    }
                    i40 = measuredWidth2;
                    int iMax8 = Math.max(i28, i40);
                    if (z5) {
                        z = false;
                    } else {
                        z = false;
                    }
                    int i42 = this.mTotalLength;
                    this.mTotalLength = Math.max(i42, virtualChildAt3.getMeasuredHeight() + i42 + ((LinearLayout.LayoutParams) c7563).topMargin + ((LinearLayout.LayoutParams) c7563).bottomMargin + getNextLocationOffset(virtualChildAt3));
                    z5 = z;
                    f = f7;
                    i28 = iMax8;
                }
                i37++;
                i36 = i5;
                i4 = i6;
            }
            this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
            iMax = i28;
        } else {
            iMax = Math.max(i28, i33);
            if (z3 && i4 != 1073741824) {
                for (int i43 = 0; i43 < i3; i43++) {
                    View virtualChildAt4 = getVirtualChildAt(i43);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C7560) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                    }
                }
            }
        }
        int i44 = iCombineMeasuredStates2;
        if (z5 || mode == 1073741824) {
            iMax = iMax6;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax, getSuggestedMinimumWidth()), i, i44), iResolveSizeAndState);
        if (z6) {
            m5209(i3, i2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5209(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c7560).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c7560).height;
                    ((LinearLayout.LayoutParams) c7560).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c7560).height = i4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0459  */
    public void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        boolean z2;
        C7560 c7560;
        View view;
        int i13;
        boolean z3;
        int iMax;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z4 = this.mBaselineAligned;
        boolean z5 = this.mUseLargestChild;
        int i14 = 1073741824;
        boolean z6 = mode == 1073741824;
        float f = 0.0f;
        int i15 = 0;
        boolean z7 = false;
        boolean z8 = true;
        boolean z9 = false;
        int childrenSkipCount = 0;
        int i16 = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int i17 = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
                i11 = i15;
                z = z5;
            } else {
                i11 = i15;
                z = z5;
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    C7560 c7561 = (C7560) virtualChildAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) c7561).weight;
                    float f3 = f + f2;
                    if (mode == i14 && ((LinearLayout.LayoutParams) c7561).width == 0 && f2 > 0.0f) {
                        if (z6) {
                            this.mTotalLength = ((LinearLayout.LayoutParams) c7561).leftMargin + ((LinearLayout.LayoutParams) c7561).rightMargin + this.mTotalLength;
                        } else {
                            int i18 = this.mTotalLength;
                            this.mTotalLength = Math.max(i18, ((LinearLayout.LayoutParams) c7561).leftMargin + i18 + ((LinearLayout.LayoutParams) c7561).rightMargin);
                        }
                        if (z4) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i13 = 1073741824;
                        } else {
                            i13 = 1073741824;
                            z7 = true;
                        }
                        view = virtualChildAt;
                        z2 = z;
                        c7560 = c7561;
                    } else {
                        if (((LinearLayout.LayoutParams) c7561).width != 0 || f2 <= 0.0f) {
                            i12 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c7561).width = -2;
                            i12 = 0;
                        }
                        int i19 = i12;
                        z2 = z;
                        c7560 = c7561;
                        measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i, f3 == 0.0f ? this.mTotalLength : 0, i2, 0);
                        if (i19 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c7560).width = i19;
                        }
                        int measuredWidth = virtualChildAt.getMeasuredWidth();
                        if (z6) {
                            view = virtualChildAt;
                            this.mTotalLength = ((LinearLayout.LayoutParams) c7560).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c7560).rightMargin + getNextLocationOffset(view) + this.mTotalLength;
                        } else {
                            view = virtualChildAt;
                            int i20 = this.mTotalLength;
                            this.mTotalLength = Math.max(i20, i20 + measuredWidth + ((LinearLayout.LayoutParams) c7560).leftMargin + ((LinearLayout.LayoutParams) c7560).rightMargin + getNextLocationOffset(view));
                        }
                        if (z2) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                        i13 = 1073741824;
                    }
                    if (mode2 == i13 || ((LinearLayout.LayoutParams) c7560).height != -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                        z9 = true;
                    }
                    int i21 = ((LinearLayout.LayoutParams) c7560).topMargin + ((LinearLayout.LayoutParams) c7560).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i21;
                    int iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                    if (z4 != 0 && (baseline2 = view.getBaseline()) != -1) {
                        int i22 = ((LinearLayout.LayoutParams) c7560).gravity;
                        if (i22 < 0) {
                            i22 = this.mGravity;
                        }
                        int i23 = (((i22 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) >> 4) & (-2)) >> 1;
                        iArr[i23] = Math.max(iArr[i23], baseline2);
                        iArr2[i23] = Math.max(iArr2[i23], measuredHeight - baseline2);
                    }
                    int iMax4 = Math.max(i11, measuredHeight);
                    boolean z10 = z8 && ((LinearLayout.LayoutParams) c7560).height == -1;
                    if (((LinearLayout.LayoutParams) c7560).weight > 0.0f) {
                        if (!z3) {
                            i21 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i21);
                        iMax = i17;
                    } else {
                        if (!z3) {
                            i21 = measuredHeight;
                        }
                        iMax = Math.max(i17, i21);
                    }
                    int i24 = childrenSkipCount;
                    int childrenSkipCount2 = i24 + getChildrenSkipCount(view, i24);
                    i17 = iMax;
                    i16 = iCombineMeasuredStates;
                    i15 = iMax4;
                    z8 = z10;
                    f = f3;
                    childrenSkipCount = childrenSkipCount2;
                }
                childrenSkipCount++;
                i14 = 1073741824;
                z5 = z2;
                mode = mode;
                z4 = z4;
            }
            z4 = z4;
            i15 = i11;
            z2 = z;
            mode = mode;
            childrenSkipCount++;
            i14 = 1073741824;
            z5 = z2;
            mode = mode;
            z4 = z4;
        }
        boolean z11 = z5;
        boolean z12 = z4;
        int i25 = mode;
        int iMax5 = i17;
        int i26 = i15;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i27 = iArr[1];
        int iMax6 = (i27 == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i26 : Math.max(i26, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(i27, iArr[2]))));
        if (z11) {
            i3 = i25;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                this.mTotalLength = 0;
                int childrenSkipCount3 = 0;
                while (childrenSkipCount3 < virtualChildCount) {
                    View virtualChildAt2 = getVirtualChildAt(childrenSkipCount3);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(childrenSkipCount3);
                    } else if (virtualChildAt2.getVisibility() == 8) {
                        childrenSkipCount3 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount3);
                    } else {
                        C7560 c7562 = (C7560) virtualChildAt2.getLayoutParams();
                        if (z6) {
                            this.mTotalLength = ((LinearLayout.LayoutParams) c7562).leftMargin + iMax2 + ((LinearLayout.LayoutParams) c7562).rightMargin + getNextLocationOffset(virtualChildAt2) + this.mTotalLength;
                        } else {
                            int i28 = this.mTotalLength;
                            this.mTotalLength = Math.max(i28, i28 + iMax2 + ((LinearLayout.LayoutParams) c7562).leftMargin + ((LinearLayout.LayoutParams) c7562).rightMargin + getNextLocationOffset(virtualChildAt2));
                            childrenSkipCount3 = childrenSkipCount3;
                        }
                    }
                    childrenSkipCount3++;
                }
            }
        } else {
            i3 = i25;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int iCombineMeasuredStates2 = i16;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
        int i29 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z7 || (i29 != 0 && f > 0.0f)) {
            float f4 = this.mWeightSum;
            if (f4 > 0.0f) {
                f = f4;
            }
            iMax6 = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.mTotalLength = 0;
            int i30 = 0;
            while (i30 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i30);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i3 = i3;
                    virtualChildCount = virtualChildCount;
                    i7 = i29;
                } else {
                    C7560 c7563 = (C7560) virtualChildAt3.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) c7563).weight;
                    if (f5 > 0.0f) {
                        int i31 = (int) ((i29 * f5) / f);
                        float f6 = f - f5;
                        int i32 = i29 - i31;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c7563).topMargin + ((LinearLayout.LayoutParams) c7563).bottomMargin, ((LinearLayout.LayoutParams) c7563).height);
                        if (((LinearLayout.LayoutParams) c7563).width == 0) {
                            i10 = 1073741824;
                            if (i3 == 1073741824) {
                                if (i31 <= 0) {
                                    i31 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i31, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                            f = f6;
                            i7 = i32;
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i31;
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 < 0 ? 0 : measuredWidth2, i10), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                        f = f6;
                        i7 = i32;
                    } else {
                        i7 = i29;
                    }
                    if (z6) {
                        this.mTotalLength = virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) c7563).leftMargin + ((LinearLayout.LayoutParams) c7563).rightMargin + getNextLocationOffset(virtualChildAt3) + this.mTotalLength;
                    } else {
                        int i33 = this.mTotalLength;
                        this.mTotalLength = Math.max(i33, virtualChildAt3.getMeasuredWidth() + i33 + ((LinearLayout.LayoutParams) c7563).leftMargin + ((LinearLayout.LayoutParams) c7563).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z13 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) c7563).height == -1;
                    int i34 = ((LinearLayout.LayoutParams) c7563).topMargin + ((LinearLayout.LayoutParams) c7563).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i34;
                    iMax6 = Math.max(iMax6, measuredHeight2);
                    if (!z13) {
                        i34 = measuredHeight2;
                    }
                    iMax5 = Math.max(iMax5, i34);
                    if (z8) {
                        i8 = -1;
                        boolean z14 = ((LinearLayout.LayoutParams) c7563).height == -1;
                        if (z12 && (baseline = virtualChildAt3.getBaseline()) != i8) {
                            i9 = ((LinearLayout.LayoutParams) c7563).gravity;
                            if (i9 < 0) {
                                i9 = this.mGravity;
                            }
                            int i35 = (((i9 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) >> 4) & (-2)) >> 1;
                            iArr[i35] = Math.max(iArr[i35], baseline);
                            iArr2[i35] = Math.max(iArr2[i35], measuredHeight2 - baseline);
                        }
                        z8 = z14;
                        f = f;
                    } else {
                        i8 = -1;
                    }
                    if (z12) {
                        i9 = ((LinearLayout.LayoutParams) c7563).gravity;
                        if (i9 < 0) {
                            i9 = this.mGravity;
                        }
                        int i36 = (((i9 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) >> 4) & (-2)) >> 1;
                        iArr[i36] = Math.max(iArr[i36], baseline);
                        iArr2[i36] = Math.max(iArr2[i36], measuredHeight2 - baseline);
                    }
                    z8 = z14;
                    f = f;
                }
                i30++;
                i29 = i7;
                virtualChildCount = virtualChildCount;
                i3 = i3;
            }
            i4 = i2;
            i5 = virtualChildCount;
            i6 = -16777216;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i37 = iArr[1];
            if (i37 != -1 || iArr[0] != -1 || iArr[2] != -1 || iArr[3] != -1) {
                iMax6 = Math.max(iMax6, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(i37, iArr[2]))));
            }
        } else {
            iMax5 = Math.max(iMax5, iMax3);
            if (z11 && i3 != 1073741824) {
                for (int i38 = 0; i38 < virtualChildCount; i38++) {
                    View virtualChildAt4 = getVirtualChildAt(i38);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C7560) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = -16777216;
            i4 = i2;
            i5 = virtualChildCount;
        }
        if (z8 || mode2 == 1073741824) {
            iMax5 = iMax6;
        }
        setMeasuredDimension(iResolveSizeAndState | (i6 & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax5, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16));
        if (z9) {
            m5207(i5, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5207(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c7560).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c7560).width;
                    ((LinearLayout.LayoutParams) c7560).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) c7560).width = i4;
                }
            }
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int iM19938;
        int iM19939;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity;
        int i9 = i8 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int i10 = i8 & 8388615;
        int i11 = 2;
        if (i9 == 16) {
            iM19938 = C7416.m19938(i4 - i2, this.mTotalLength, 2, getPaddingTop());
        } else if (i9 == 80) {
            iM19938 = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        } else {
            iM19938 = getPaddingTop();
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                iM19938 = measureNullChild(childrenSkipCount) + iM19938;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) c7560).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    iM19939 = C7416.m19938(paddingRight2, measuredWidth, i11, paddingLeft) + ((LinearLayout.LayoutParams) c7560).leftMargin;
                    i5 = ((LinearLayout.LayoutParams) c7560).rightMargin;
                } else {
                    if (absoluteGravity == 5) {
                        iM19939 = paddingRight - measuredWidth;
                        i5 = ((LinearLayout.LayoutParams) c7560).rightMargin;
                    } else {
                        i6 = ((LinearLayout.LayoutParams) c7560).leftMargin + paddingLeft;
                    }
                    int i13 = i6;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        iM19938 += this.mDividerHeight;
                    }
                    int i14 = ((LinearLayout.LayoutParams) c7560).topMargin + iM19938;
                    m5208(virtualChildAt, i13, getLocationOffset(virtualChildAt) + i14, measuredWidth, measuredHeight);
                    int nextLocationOffset = measuredHeight + ((LinearLayout.LayoutParams) c7560).bottomMargin + getNextLocationOffset(virtualChildAt) + i14;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    iM19938 = nextLocationOffset;
                }
                i6 = iM19939 - i5;
                int i15 = i6;
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    iM19938 += this.mDividerHeight;
                }
                int i16 = ((LinearLayout.LayoutParams) c7560).topMargin + iM19938;
                m5208(virtualChildAt, i15, getLocationOffset(virtualChildAt) + i16, measuredWidth, measuredHeight);
                int nextLocationOffset2 = measuredHeight + ((LinearLayout.LayoutParams) c7560).bottomMargin + getNextLocationOffset(virtualChildAt) + i16;
                childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                iM19938 = nextLocationOffset2;
            }
            childrenSkipCount++;
            i11 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int iM19938;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int iM19939;
        int i11;
        int measuredHeight;
        int i12 = C22461.f72738;
        boolean z = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i13 = i4 - i2;
        int paddingBottom = i13 - getPaddingBottom();
        int paddingBottom2 = (i13 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i14 = this.mGravity;
        int i15 = i14 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        boolean z2 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(8388615 & i14, getLayoutDirection());
        if (absoluteGravity == 1) {
            iM19938 = C7416.m19938(i3 - i, this.mTotalLength, 2, getPaddingLeft());
        } else if (absoluteGravity == 5) {
            iM19938 = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
        } else {
            iM19938 = getPaddingLeft();
        }
        if (z) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            int i16 = (i6 * childrenSkipCount) + i5;
            View virtualChildAt = getVirtualChildAt(i16);
            if (virtualChildAt == null) {
                iM19938 += measureNullChild(i16);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    C7560 c7560 = (C7560) virtualChildAt.getLayoutParams();
                    if (z2) {
                        i7 = childrenSkipCount;
                        i8 = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) c7560).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) c7560).gravity;
                        if (i9 < 0) {
                            i9 = i15;
                        }
                        i10 = i9 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = ((LinearLayout.LayoutParams) c7560).topMargin + paddingTop;
                                if (baseline != -1) {
                                    measuredHeight = (iArr[1] - baseline) + i11;
                                } else {
                                    measuredHeight = i11;
                                }
                            } else if (i10 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c7560).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            iM19939 = measuredHeight;
                        } else {
                            iM19939 = (C7416.m19938(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) c7560).topMargin) - ((LinearLayout.LayoutParams) c7560).bottomMargin;
                        }
                        if (hasDividerBeforeChildAt(i16)) {
                            iM19938 += this.mDividerWidth;
                        }
                        int i17 = ((LinearLayout.LayoutParams) c7560).leftMargin + iM19938;
                        m5208(virtualChildAt, getLocationOffset(virtualChildAt) + i17, iM19939, measuredWidth, measuredHeight2);
                        int nextLocationOffset = ((LinearLayout.LayoutParams) c7560).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt) + i17;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i16) + i7;
                        iM19938 = nextLocationOffset;
                    } else {
                        i7 = childrenSkipCount;
                        i8 = virtualChildCount;
                    }
                    i9 = ((LinearLayout.LayoutParams) c7560).gravity;
                    if (i9 < 0) {
                        i9 = i15;
                    }
                    i10 = i9 & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = ((LinearLayout.LayoutParams) c7560).topMargin + paddingTop;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + i11;
                            } else {
                                measuredHeight = i11;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c7560).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        iM19939 = measuredHeight;
                    } else {
                        iM19939 = (C7416.m19938(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) c7560).topMargin) - ((LinearLayout.LayoutParams) c7560).bottomMargin;
                    }
                    if (hasDividerBeforeChildAt(i16)) {
                        iM19938 += this.mDividerWidth;
                    }
                    int i18 = ((LinearLayout.LayoutParams) c7560).leftMargin + iM19938;
                    m5208(virtualChildAt, getLocationOffset(virtualChildAt) + i18, iM19939, measuredWidth, measuredHeight2);
                    int nextLocationOffset2 = ((LinearLayout.LayoutParams) c7560).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt) + i18;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i16) + i7;
                    iM19938 = nextLocationOffset2;
                }
                childrenSkipCount++;
                paddingBottom = paddingBottom;
                virtualChildCount = i8;
                paddingTop = paddingTop;
                i15 = i15;
            }
            i8 = virtualChildCount;
            childrenSkipCount++;
            paddingBottom = paddingBottom;
            virtualChildCount = i8;
            paddingTop = paddingTop;
            i15 = i15;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5208(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        int i3 = this.mGravity;
        if ((i3 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public C7560 generateLayoutParams(AttributeSet attributeSet) {
        return new C7560(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C7560 generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new C7560(-2, -2);
        }
        if (i == 1) {
            return new C7560(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public C7560 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C7560)) {
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return new C7560(layoutParams);
            }
            return new C7560((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C7560((C7560) layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7560;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }
}
