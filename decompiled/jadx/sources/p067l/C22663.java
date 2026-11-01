package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5F4 */
/* JADX INFO: loaded from: classes5.dex */
public class C22663 extends C8541 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f71485;

    /* JADX INFO: renamed from: ۜ */
    public C3216 f71486;

    /* JADX INFO: renamed from: ۧ */
    public final Rect f71487;

    /* JADX INFO: renamed from: ܳ */
    public View[] f71488;

    /* JADX INFO: renamed from: ܽ */
    public boolean f71489;

    /* JADX INFO: renamed from: ܿ */
    public final SparseIntArray f71490;

    /* JADX INFO: renamed from: ᩳ */
    public final SparseIntArray f71491;

    /* JADX INFO: renamed from: ᩻ */
    public int f71492;

    public C22663(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f71489 = false;
        this.f71492 = -1;
        this.f71490 = new SparseIntArray();
        this.f71491 = new SparseIntArray();
        this.f71486 = new C3216();
        this.f71487 = new Rect();
        m50728(AbstractC18873.m42945(context, attributeSet, i, i2).f59497);
    }

    public C22663(Context context, int i) {
        super(context);
        this.f71489 = false;
        this.f71492 = -1;
        this.f71490 = new SparseIntArray();
        this.f71491 = new SparseIntArray();
        this.f71486 = new C3216();
        this.f71487 = new Rect();
        m50728(i);
    }

    public C22663(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.f71489 = false;
        this.f71492 = -1;
        this.f71490 = new SparseIntArray();
        this.f71491 = new SparseIntArray();
        this.f71486 = new C3216();
        this.f71487 = new Rect();
        m50728(i);
    }

    @Override // p067l.C8541
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // p067l.AbstractC18873
    public final int getRowCountForAccessibility(C4792 c4792, C22897 c22897) {
        if (this.mOrientation == 0) {
            return this.f71492;
        }
        if (c22897.m51124() < 1) {
            return 0;
        }
        return m50719(c22897.m51124() - 1, c4792, c22897) + 1;
    }

    @Override // p067l.AbstractC18873
    public final int getColumnCountForAccessibility(C4792 c4792, C22897 c22897) {
        if (this.mOrientation == 1) {
            return this.f71492;
        }
        if (c22897.m51124() < 1) {
            return 0;
        }
        return m50719(c22897.m51124() - 1, c4792, c22897) + 1;
    }

    @Override // p067l.AbstractC18873
    public final void onInitializeAccessibilityNodeInfoForItem(C4792 c4792, C22897 c22897, View view, C1555 c1555) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C9922)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1555);
            return;
        }
        C9922 c9922 = (C9922) layoutParams;
        int iM50719 = m50719(c9922.f47660.getLayoutPosition(), c4792, c22897);
        if (this.mOrientation == 0) {
            c1555.m36419(C1730.m44124(c9922.f27499, c9922.f27498, iM50719, 1, false, false));
        } else {
            c1555.m36419(C1730.m44124(iM50719, 1, c9922.f27499, c9922.f27498, false, false));
        }
    }

    @Override // p067l.AbstractC18873
    public final void onInitializeAccessibilityNodeInfo(C4792 c4792, C22897 c22897, C1555 c1555) {
        super.onInitializeAccessibilityNodeInfo(c4792, c22897, c1555);
        c1555.m36414((CharSequence) GridView.class.getName());
    }

    @Override // p067l.C8541, p067l.AbstractC18873
    public final void onLayoutCompleted(C22897 c22897) {
        super.onLayoutCompleted(c22897);
        this.f71489 = false;
    }

    @Override // p067l.AbstractC18873
    public final void onItemsAdded(C14849 c14849, int i, int i2) {
        C3216 c3216 = this.f71486;
        c3216.m37695();
        c3216.f48869.clear();
    }

    @Override // p067l.AbstractC18873
    public final void onItemsChanged(C14849 c14849) {
        C3216 c3216 = this.f71486;
        c3216.m37695();
        c3216.f48869.clear();
    }

    @Override // p067l.AbstractC18873
    public final void onItemsRemoved(C14849 c14849, int i, int i2) {
        C3216 c3216 = this.f71486;
        c3216.m37695();
        c3216.f48869.clear();
    }

    @Override // p067l.AbstractC18873
    public final void onItemsUpdated(C14849 c14849, int i, int i2, Object obj) {
        C3216 c3216 = this.f71486;
        c3216.m37695();
        c3216.f48869.clear();
    }

    @Override // p067l.AbstractC18873
    public final void onItemsMoved(C14849 c14849, int i, int i2, int i3) {
        C3216 c3216 = this.f71486;
        c3216.m37695();
        c3216.f48869.clear();
    }

    @Override // p067l.C8541, p067l.AbstractC18873
    public final C16190 generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C9922(-2, -1);
        }
        return new C9922(-1, -2);
    }

    @Override // p067l.AbstractC18873
    public final C16190 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C9922(context, attributeSet);
    }

    @Override // p067l.AbstractC18873
    public final C16190 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C9922 c9922;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c9922 = new C9922((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c9922 = new C9922(layoutParams);
        }
        c9922.f27499 = -1;
        c9922.f27498 = 0;
        return c9922;
    }

    @Override // p067l.AbstractC18873
    public final boolean checkLayoutParams(C16190 c16190) {
        return c16190 instanceof C9922;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m50725() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m50723(height - paddingTop);
    }

    @Override // p067l.AbstractC18873
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM42942;
        int iM42943;
        if (this.f71485 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iM42943 = AbstractC18873.m42942(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f71485;
            iM42942 = AbstractC18873.m42942(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iM42942 = AbstractC18873.m42942(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f71485;
            iM42943 = AbstractC18873.m42942(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM42942, iM42943);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m50723(int i) {
        int i2;
        int[] iArr = this.f71485;
        int i3 = this.f71492;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f71485 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50727(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.f71485;
            int i3 = this.f71492;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f71485;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // p067l.C8541
    public final void onAnchorReady(C4792 c4792, C22897 c22897, C17928 c17928, int i) {
        super.onAnchorReady(c4792, c22897, c17928, i);
        m50725();
        if (c22897.m51124() > 0 && !c22897.f72063) {
            boolean z = i == 1;
            int iM50721 = m50721(c17928.f53540, c4792, c22897);
            if (z) {
                while (iM50721 > 0) {
                    int i2 = c17928.f53540;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c17928.f53540 = i3;
                    iM50721 = m50721(i3, c4792, c22897);
                }
            } else {
                int iM51124 = c22897.m51124() - 1;
                int i4 = c17928.f53540;
                while (i4 < iM51124) {
                    int i5 = i4 + 1;
                    int iM50722 = m50721(i5, c4792, c22897);
                    if (iM50722 <= iM50721) {
                        break;
                    }
                    i4 = i5;
                    iM50721 = iM50722;
                }
                c17928.f53540 = i4;
            }
        }
        m50722();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m50722() {
        View[] viewArr = this.f71488;
        if (viewArr == null || viewArr.length != this.f71492) {
            this.f71488 = new View[this.f71492];
        }
    }

    @Override // p067l.C8541, p067l.AbstractC18873
    public final int scrollHorizontallyBy(int i, C4792 c4792, C22897 c22897) {
        m50725();
        m50722();
        return super.scrollHorizontallyBy(i, c4792, c22897);
    }

    @Override // p067l.C8541, p067l.AbstractC18873
    public final int scrollVerticallyBy(int i, C4792 c4792, C22897 c22897) {
        m50725();
        m50722();
        return super.scrollVerticallyBy(i, c4792, c22897);
    }

    @Override // p067l.C8541
    public final View findReferenceChild(C4792 c4792, C22897 c22897, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iM51124 = c22897.m51124();
        ensureLayoutState();
        int iMo9560 = this.mOrientationHelper.mo9560();
        int iMo9558 = this.mOrientationHelper.mo9558();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM51124 && m50721(position, c4792, c22897) == 0) {
                if (((C16190) childAt.getLayoutParams()).f47660.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo9567(childAt) < iMo9558 && this.mOrientationHelper.mo9555(childAt) >= iMo9560) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    @Override // p067l.C8541
    public final void collectPrefetchPositionsForLayoutState(C22897 c22897, C18599 c18599, InterfaceC18202 interfaceC18202) {
        int i;
        int i2 = this.f71492;
        for (int i3 = 0; i3 < this.f71492 && (i = c18599.f55541) >= 0 && i < c22897.m51124() && i2 > 0; i3++) {
            ((C20652) interfaceC18202).m46667(c18599.f55541, Math.max(0, c18599.f55543));
            this.f71486.getClass();
            i2--;
            c18599.f55541 += c18599.f55545;
        }
    }

    @Override // p067l.C8541
    public final void layoutChunk(C4792 c4792, C22897 c22897, C18599 c18599, C19270 c19270) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iMo9563;
        int i9;
        int i10;
        int paddingLeft;
        int iMo9564;
        int iM42943;
        int iM42944;
        boolean z;
        int i11;
        View viewM42323;
        int iMo9565 = this.mOrientationHelper.mo9564();
        boolean z2 = iMo9565 != 1073741824;
        int i12 = getChildCount() > 0 ? this.f71485[this.f71492] : 0;
        if (z2) {
            m50725();
        }
        boolean z3 = c18599.f55545 == 1;
        int iM50721 = this.f71492;
        if (!z3) {
            iM50721 = m50721(c18599.f55541, c4792, c22897) + m50724(c18599.f55541, c4792, c22897);
        }
        int i13 = 0;
        while (i13 < this.f71492 && (i11 = c18599.f55541) >= 0 && i11 < c22897.m51124() && iM50721 > 0) {
            int i14 = c18599.f55541;
            int iM50724 = m50724(i14, c4792, c22897);
            if (iM50724 > this.f71492) {
                throw new IllegalArgumentException(C5410.m11876(this.f71492, " spans.", C21720.m49005("Item at position ", i14, " requires ", " spans but GridLayoutManager has only ", iM50724)));
            }
            iM50721 -= iM50724;
            if (iM50721 < 0 || (viewM42323 = c18599.m42323(c4792)) == null) {
                break;
            }
            this.f71488[i13] = viewM42323;
            i13++;
        }
        if (i13 == 0) {
            c19270.f57589 = true;
            return;
        }
        if (z3) {
            i = 0;
            i2 = i13;
            i3 = 1;
        } else {
            i = i13 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i15 = 0;
        while (i != i2) {
            View view = this.f71488[i];
            C9922 c9922 = (C9922) view.getLayoutParams();
            int iM50725 = m50724(getPosition(view), c4792, c22897);
            c9922.f27498 = iM50725;
            c9922.f27499 = i15;
            i15 += iM50725;
            i += i3;
        }
        float f = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            View view2 = this.f71488[i17];
            if (c18599.f55539 != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f71487);
            m50720(view2, iMo9565, z);
            int iMo9559 = this.mOrientationHelper.mo9559(view2);
            if (iMo9559 > i16) {
                i16 = iMo9559;
            }
            float fMo9563 = (this.mOrientationHelper.mo9563(view2) * 1.0f) / ((C9922) view2.getLayoutParams()).f27498;
            if (fMo9563 > f) {
                f = fMo9563;
            }
        }
        if (z2) {
            m50723(Math.max(Math.round(f * this.f71492), i12));
            i16 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                View view3 = this.f71488[i18];
                m50720(view3, 1073741824, true);
                int iMo95510 = this.mOrientationHelper.mo9559(view3);
                if (iMo95510 > i16) {
                    i16 = iMo95510;
                }
            }
        }
        for (int i19 = 0; i19 < i13; i19++) {
            View view4 = this.f71488[i19];
            if (this.mOrientationHelper.mo9559(view4) != i16) {
                C9922 c9923 = (C9922) view4.getLayoutParams();
                Rect rect = c9923.f47657;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c9923).topMargin + ((ViewGroup.MarginLayoutParams) c9923).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c9923).leftMargin + ((ViewGroup.MarginLayoutParams) c9923).rightMargin;
                int iM50727 = m50727(c9923.f27499, c9923.f27498);
                if (this.mOrientation == 1) {
                    iM42944 = AbstractC18873.m42943(iM50727, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c9923).width, false);
                    iM42943 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iM42943 = AbstractC18873.m42943(iM50727, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c9923).height, false);
                    iM42944 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, iM42944, iM42943, (C16190) view4.getLayoutParams())) {
                    view4.measure(iM42944, iM42943);
                }
            }
        }
        c19270.f57588 = i16;
        if (this.mOrientation != 1) {
            if (c18599.f55548 == -1) {
                int i22 = c18599.f55547;
                int i23 = i22 - i16;
                i4 = i22;
                i5 = i23;
            } else {
                int i24 = c18599.f55547;
                i4 = i16 + i24;
                i5 = i24;
            }
            i6 = 0;
            i7 = 0;
        } else if (c18599.f55548 == -1) {
            i7 = c18599.f55547;
            i6 = i7 - i16;
            i5 = 0;
            i4 = 0;
        } else {
            i6 = c18599.f55547;
            i7 = i6 + i16;
            i4 = 0;
            i5 = 0;
        }
        int i25 = 0;
        while (i25 < i13) {
            View view5 = this.f71488[i25];
            C9922 c9924 = (C9922) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    iMo9564 = this.f71485[this.f71492 - c9924.f27499] + getPaddingLeft();
                    paddingLeft = iMo9564 - this.mOrientationHelper.mo9563(view5);
                } else {
                    paddingLeft = getPaddingLeft() + this.f71485[c9924.f27499];
                    iMo9564 = this.mOrientationHelper.mo9563(view5) + paddingLeft;
                }
                i9 = paddingLeft;
                iMo9563 = i7;
                i8 = i6;
                i10 = iMo9564;
            } else {
                int paddingTop = getPaddingTop() + this.f71485[c9924.f27499];
                i8 = paddingTop;
                iMo9563 = this.mOrientationHelper.mo9563(view5) + paddingTop;
                i9 = i5;
                i10 = i4;
            }
            layoutDecoratedWithMargins(view5, i9, i8, i10, iMo9563);
            if (c9924.f47660.isRemoved() || c9924.f47660.isUpdated()) {
                c19270.f57591 = true;
            }
            c19270.f57590 |= view5.hasFocusable();
            i25++;
            i7 = iMo9563;
            i6 = i8;
            i5 = i9;
            i4 = i10;
        }
        Arrays.fill(this.f71488, (Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50720(View view, int i, boolean z) {
        int iM42943;
        int iM42944;
        boolean zShouldMeasureChild;
        C9922 c9922 = (C9922) view.getLayoutParams();
        Rect rect = c9922.f47657;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c9922).topMargin + ((ViewGroup.MarginLayoutParams) c9922).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c9922).leftMargin + ((ViewGroup.MarginLayoutParams) c9922).rightMargin;
        int iM50727 = m50727(c9922.f27499, c9922.f27498);
        if (this.mOrientation == 1) {
            iM42944 = AbstractC18873.m42943(iM50727, i, i3, ((ViewGroup.MarginLayoutParams) c9922).width, false);
            iM42943 = AbstractC18873.m42943(this.mOrientationHelper.mo9569(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c9922).height, true);
        } else {
            int iM42945 = AbstractC18873.m42943(iM50727, i, i2, ((ViewGroup.MarginLayoutParams) c9922).height, false);
            int iM42946 = AbstractC18873.m42943(this.mOrientationHelper.mo9569(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c9922).width, true);
            iM42943 = iM42945;
            iM42944 = iM42946;
        }
        C16190 c16190 = (C16190) view.getLayoutParams();
        if (z) {
            zShouldMeasureChild = shouldReMeasureChild(view, iM42944, iM42943, c16190);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, iM42944, iM42943, c16190);
        }
        if (zShouldMeasureChild) {
            view.measure(iM42944, iM42943);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50726() {
        return this.f71492;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50728(int i) {
        if (i == this.f71492) {
            return;
        }
        this.f71489 = true;
        if (i < 1) {
            throw new IllegalArgumentException(C20778.m46922(i, "Span count should be at least 1. Provided "));
        }
        this.f71492 = i;
        this.f71486.m37695();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[PHI: r17 r18 r19
      0x00e8: PHI (r17v6 int) = (r17v5 int), (r17v5 int), (r17v7 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r18v2 int) = (r18v1 int), (r18v1 int), (r18v3 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r19v1 int) = (r19v0 int), (r19v0 int), (r19v2 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    @Override // p067l.C8541, p067l.AbstractC18873
    public final View onFocusSearchFailed(View view, int i, C4792 c4792, C22897 c22897) {
        int childCount;
        int childCount2;
        int i2;
        View view2;
        int i3;
        int i4;
        int i5;
        C4792 c4793 = c4792;
        C22897 c22898 = c22897;
        View viewFindContainingItemView = findContainingItemView(view);
        View view3 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        C9922 c9922 = (C9922) viewFindContainingItemView.getLayoutParams();
        int i6 = c9922.f27499;
        int i7 = c9922.f27498 + i6;
        if (super.onFocusSearchFailed(view, i, c4792, c22897) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            childCount2 = 0;
            i2 = 1;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int iM50719 = m50719(childCount2, c4793, c22898);
        int i8 = childCount2;
        int i9 = i2;
        int iMin = 0;
        int iMin2 = 0;
        int i10 = -1;
        int i11 = -1;
        View view4 = null;
        while (i8 != childCount) {
            int i12 = childCount;
            int iM507110 = m50719(i8, c4793, c22898);
            View childAt = getChildAt(i8);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iM507110 == iM50719) {
                C9922 c9923 = (C9922) childAt.getLayoutParams();
                int i13 = c9923.f27499;
                view2 = viewFindContainingItemView;
                int i14 = c9923.f27498 + i13;
                if (childAt.hasFocusable() && i13 == i6 && i14 == i7) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view3 == null) && (childAt.hasFocusable() || view4 != null)) {
                    i3 = iM50719;
                    int iMin3 = Math.min(i14, i7) - Math.max(i13, i6);
                    if (!childAt.hasFocusable()) {
                        if (view3 == null) {
                            i4 = iMin2;
                            i5 = i10;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                        if (z == (i13 > i11)) {
                                            if (childAt.hasFocusable()) {
                                                int i15 = c9923.f27499;
                                                iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                                i10 = i15;
                                                view3 = childAt;
                                            } else {
                                                i11 = c9923.f27499;
                                                iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                                view4 = childAt;
                                            }
                                        }
                                    }
                                } else if (childAt.hasFocusable()) {
                                    int i16 = c9923.f27499;
                                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                    i10 = i16;
                                    view3 = childAt;
                                } else {
                                    i11 = c9923.f27499;
                                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                    view4 = childAt;
                                }
                                i8 += i9;
                                childCount = i12;
                                c4793 = c4792;
                                c22898 = c22897;
                                viewFindContainingItemView = view2;
                                iM50719 = i3;
                            }
                        }
                        iMin2 = i4;
                        i10 = i5;
                        i8 += i9;
                        childCount = i12;
                        c4793 = c4792;
                        c22898 = c22897;
                        viewFindContainingItemView = view2;
                        iM50719 = i3;
                    } else if (iMin3 <= iMin2) {
                        if (iMin3 == iMin2) {
                            if (z == (i13 > i10)) {
                            }
                            iMin2 = i4;
                            i10 = i5;
                            i8 += i9;
                            childCount = i12;
                            c4793 = c4792;
                            c22898 = c22897;
                            viewFindContainingItemView = view2;
                            iM50719 = i3;
                        }
                    }
                } else {
                    i3 = iM50719;
                }
                i4 = iMin2;
                i5 = i10;
                if (childAt.hasFocusable()) {
                    int i17 = c9923.f27499;
                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                    i10 = i17;
                    view3 = childAt;
                } else {
                    i11 = c9923.f27499;
                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                    view4 = childAt;
                    iMin2 = i4;
                    i10 = i5;
                }
                i8 += i9;
                childCount = i12;
                c4793 = c4792;
                c22898 = c22897;
                viewFindContainingItemView = view2;
                iM50719 = i3;
            } else {
                if (view3 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                i3 = iM50719;
            }
            i4 = iMin2;
            i5 = i10;
            iMin2 = i4;
            i10 = i5;
            i8 += i9;
            childCount = i12;
            c4793 = c4792;
            c22898 = c22897;
            viewFindContainingItemView = view2;
            iM50719 = i3;
        }
        return view3 != null ? view3 : view4;
    }

    @Override // p067l.C8541, p067l.AbstractC18873
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f71489;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m50719(int i, C4792 c4792, C22897 c22897) {
        boolean z = c22897.f72063;
        C3216 c3216 = this.f71486;
        if (z && (i = c4792.m10098(i)) == -1) {
            return 0;
        }
        int i2 = this.f71492;
        c3216.getClass();
        return AbstractC16626.m37694(i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m50721(int i, C4792 c4792, C22897 c22897) {
        int i2;
        boolean z = c22897.f72063;
        C3216 c3216 = this.f71486;
        if (!z) {
            i2 = this.f71492;
            c3216.getClass();
        } else {
            int i3 = this.f71491.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i = c4792.m10098(i);
            if (i == -1) {
                return 0;
            }
            i2 = this.f71492;
            c3216.getClass();
        }
        return i % i2;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m50724(int i, C4792 c4792, C22897 c22897) {
        boolean z = c22897.f72063;
        C3216 c3216 = this.f71486;
        if (!z) {
            c3216.getClass();
            return 1;
        }
        int i2 = this.f71490.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c4792.m10098(i) == -1) {
            return 1;
        }
        c3216.getClass();
        return 1;
    }

    @Override // p067l.C8541, p067l.AbstractC18873
    public final void onLayoutChildren(C4792 c4792, C22897 c22897) {
        boolean z = c22897.f72063;
        SparseIntArray sparseIntArray = this.f71491;
        SparseIntArray sparseIntArray2 = this.f71490;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C9922 c9922 = (C9922) getChildAt(i).getLayoutParams();
                int layoutPosition = c9922.f47660.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c9922.f27498);
                sparseIntArray.put(layoutPosition, c9922.f27499);
            }
        }
        super.onLayoutChildren(c4792, c22897);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }
}
