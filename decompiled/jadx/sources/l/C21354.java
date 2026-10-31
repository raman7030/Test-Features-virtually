package l;

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
public class C21354 extends C6495 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f68791;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C0892 f68792;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Rect f68793;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View[] f68794;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f68795;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f68796;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f68797;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f68798;

    public C21354(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f68795 = false;
        this.f68798 = -1;
        this.f68796 = new SparseIntArray();
        this.f68797 = new SparseIntArray();
        this.f68792 = new C0892();
        this.f68793 = new Rect();
        m48393(AbstractC17366.m40694(context, attributeSet, i, i2).f56292);
    }

    public C21354(Context context, int i) {
        super(context);
        this.f68795 = false;
        this.f68798 = -1;
        this.f68796 = new SparseIntArray();
        this.f68797 = new SparseIntArray();
        this.f68792 = new C0892();
        this.f68793 = new Rect();
        m48393(i);
    }

    public C21354(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, 1, false);
        this.f68795 = false;
        this.f68798 = -1;
        this.f68796 = new SparseIntArray();
        this.f68797 = new SparseIntArray();
        this.f68792 = new C0892();
        this.f68793 = new Rect();
        m48393(i);
    }

    @Override // l.C6495
    public final void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // l.AbstractC17366
    public final int getRowCountForAccessibility(C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 0) {
            return this.f68798;
        }
        if (c21600.m48777() < 1) {
            return 0;
        }
        return m48384(c21600.m48777() - 1, c2550, c21600) + 1;
    }

    @Override // l.AbstractC17366
    public final int getColumnCountForAccessibility(C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 1) {
            return this.f68798;
        }
        if (c21600.m48777() < 1) {
            return 0;
        }
        return m48384(c21600.m48777() - 1, c2550, c21600) + 1;
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityNodeInfoForItem(C2550 c2550, C21600 c21600, View view, C14369 c14369) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C7948)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c14369);
            return;
        }
        C7948 c7948 = (C7948) layoutParams;
        int iM48384 = m48384(c7948.f44554.getLayoutPosition(), c2550, c21600);
        if (this.mOrientation == 0) {
            c14369.m34286(C17898.m41877(c7948.f24586, c7948.f24585, iM48384, 1, false, false));
        } else {
            c14369.m34286(C17898.m41877(iM48384, 1, c7948.f24586, c7948.f24585, false, false));
        }
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityNodeInfo(C2550 c2550, C21600 c21600, C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(c2550, c21600, c14369);
        c14369.m34281((CharSequence) GridView.class.getName());
    }

    @Override // l.C6495, l.AbstractC17366
    public final void onLayoutCompleted(C21600 c21600) {
        super.onLayoutCompleted(c21600);
        this.f68795 = false;
    }

    @Override // l.AbstractC17366
    public final void onItemsAdded(C13132 c13132, int i, int i2) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsChanged(C13132 c13132) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsRemoved(C13132 c13132, int i, int i2) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsUpdated(C13132 c13132, int i, int i2, Object obj) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.AbstractC17366
    public final void onItemsMoved(C13132 c13132, int i, int i2, int i3) {
        C0892 c0892 = this.f68792;
        c0892.m35539();
        c0892.f45756.clear();
    }

    @Override // l.C6495, l.AbstractC17366
    public final C14543 generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new C7948(-2, -1);
        }
        return new C7948(-1, -2);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C7948(context, attributeSet);
    }

    @Override // l.AbstractC17366
    public final C14543 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C7948 c7948;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c7948 = new C7948((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c7948 = new C7948(layoutParams);
        }
        c7948.f24586 = -1;
        c7948.f24585 = 0;
        return c7948;
    }

    @Override // l.AbstractC17366
    public final boolean checkLayoutParams(C14543 c14543) {
        return c14543 instanceof C7948;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48390() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m48388(height - paddingTop);
    }

    @Override // l.AbstractC17366
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iM40691;
        int iM40692;
        if (this.f68791 == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iM40692 = AbstractC17366.m40691(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f68791;
            iM40691 = AbstractC17366.m40691(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iM40691 = AbstractC17366.m40691(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f68791;
            iM40692 = AbstractC17366.m40691(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iM40691, iM40692);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48388(int i) {
        int i2;
        int[] iArr = this.f68791;
        int i3 = this.f68798;
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
        this.f68791 = iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48392(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.f68791;
            int i3 = this.f68798;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f68791;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // l.C6495
    public final void onAnchorReady(C2550 c2550, C21600 c21600, C16372 c16372, int i) {
        super.onAnchorReady(c2550, c21600, c16372, i);
        m48390();
        if (c21600.m48777() > 0 && !c21600.f69359) {
            boolean z = i == 1;
            int iM48386 = m48386(c16372.f50367, c2550, c21600);
            if (z) {
                while (iM48386 > 0) {
                    int i2 = c16372.f50367;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c16372.f50367 = i3;
                    iM48386 = m48386(i3, c2550, c21600);
                }
            } else {
                int iM48777 = c21600.m48777() - 1;
                int i4 = c16372.f50367;
                while (i4 < iM48777) {
                    int i5 = i4 + 1;
                    int iM48387 = m48386(i5, c2550, c21600);
                    if (iM48387 <= iM48386) {
                        break;
                    }
                    i4 = i5;
                    iM48386 = iM48387;
                }
                c16372.f50367 = i4;
            }
        }
        m48387();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48387() {
        View[] viewArr = this.f68794;
        if (viewArr == null || viewArr.length != this.f68798) {
            this.f68794 = new View[this.f68798];
        }
    }

    @Override // l.C6495, l.AbstractC17366
    public final int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        m48390();
        m48387();
        return super.scrollHorizontallyBy(i, c2550, c21600);
    }

    @Override // l.C6495, l.AbstractC17366
    public final int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        m48390();
        m48387();
        return super.scrollVerticallyBy(i, c2550, c21600);
    }

    @Override // l.C6495
    public final View findReferenceChild(C2550 c2550, C21600 c21600, boolean z, boolean z2) {
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
        int iM48777 = c21600.m48777();
        ensureLayoutState();
        int iMo7478 = this.mOrientationHelper.mo7478();
        int iMo7476 = this.mOrientationHelper.mo7476();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM48777 && m48386(position, c2550, c21600) == 0) {
                if (((C14543) childAt.getLayoutParams()).f44554.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo7485(childAt) < iMo7476 && this.mOrientationHelper.mo7473(childAt) >= iMo7478) {
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

    @Override // l.C6495
    public final void collectPrefetchPositionsForLayoutState(C21600 c21600, C17078 c17078, InterfaceC16660 interfaceC16660) {
        int i;
        int i2 = this.f68798;
        for (int i3 = 0; i3 < this.f68798 && (i = c17078.f52359) >= 0 && i < c21600.m48777() && i2 > 0; i3++) {
            ((C19238) interfaceC16660).m44373(c17078.f52359, Math.max(0, c17078.f52361));
            this.f68792.getClass();
            i2--;
            c17078.f52359 += c17078.f52363;
        }
    }

    @Override // l.C6495
    public final void layoutChunk(C2550 c2550, C21600 c21600, C17078 c17078, C17784 c17784) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iMo7481;
        int i9;
        int i10;
        int paddingLeft;
        int iMo7482;
        int iM40692;
        int iM40693;
        boolean z;
        int i11;
        View viewM40078;
        int iMo7483 = this.mOrientationHelper.mo7482();
        boolean z2 = iMo7483 != 1073741824;
        int i12 = getChildCount() > 0 ? this.f68791[this.f68798] : 0;
        if (z2) {
            m48390();
        }
        boolean z3 = c17078.f52363 == 1;
        int iM48386 = this.f68798;
        if (!z3) {
            iM48386 = m48386(c17078.f52359, c2550, c21600) + m48389(c17078.f52359, c2550, c21600);
        }
        int i13 = 0;
        while (i13 < this.f68798 && (i11 = c17078.f52359) >= 0 && i11 < c21600.m48777() && iM48386 > 0) {
            int i14 = c17078.f52359;
            int iM48389 = m48389(i14, c2550, c21600);
            if (iM48389 > this.f68798) {
                throw new IllegalArgumentException(C3200.m9831(this.f68798, " spans.", C20361.m46682("Item at position ", i14, " requires ", " spans but GridLayoutManager has only ", iM48389)));
            }
            iM48386 -= iM48389;
            if (iM48386 < 0 || (viewM40078 = c17078.m40078(c2550)) == null) {
                break;
            }
            this.f68794[i13] = viewM40078;
            i13++;
        }
        if (i13 == 0) {
            c17784.f54395 = true;
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
            View view = this.f68794[i];
            C7948 c7948 = (C7948) view.getLayoutParams();
            int iM483810 = m48389(getPosition(view), c2550, c21600);
            c7948.f24585 = iM483810;
            c7948.f24586 = i15;
            i15 += iM483810;
            i += i3;
        }
        float f = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            View view2 = this.f68794[i17];
            if (c17078.f52357 != null) {
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
            calculateItemDecorationsForChild(view2, this.f68793);
            m48385(view2, iMo7483, z);
            int iMo7477 = this.mOrientationHelper.mo7477(view2);
            if (iMo7477 > i16) {
                i16 = iMo7477;
            }
            float fMo7481 = (this.mOrientationHelper.mo7481(view2) * 1.0f) / ((C7948) view2.getLayoutParams()).f24585;
            if (fMo7481 > f) {
                f = fMo7481;
            }
        }
        if (z2) {
            m48388(Math.max(Math.round(f * this.f68798), i12));
            i16 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                View view3 = this.f68794[i18];
                m48385(view3, 1073741824, true);
                int iMo7478 = this.mOrientationHelper.mo7477(view3);
                if (iMo7478 > i16) {
                    i16 = iMo7478;
                }
            }
        }
        for (int i19 = 0; i19 < i13; i19++) {
            View view4 = this.f68794[i19];
            if (this.mOrientationHelper.mo7477(view4) != i16) {
                C7948 c7949 = (C7948) view4.getLayoutParams();
                Rect rect = c7949.f44551;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c7949).topMargin + ((ViewGroup.MarginLayoutParams) c7949).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c7949).leftMargin + ((ViewGroup.MarginLayoutParams) c7949).rightMargin;
                int iM48392 = m48392(c7949.f24586, c7949.f24585);
                if (this.mOrientation == 1) {
                    iM40693 = AbstractC17366.m40692(iM48392, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c7949).width, false);
                    iM40692 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iM40692 = AbstractC17366.m40692(iM48392, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c7949).height, false);
                    iM40693 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, iM40693, iM40692, (C14543) view4.getLayoutParams())) {
                    view4.measure(iM40693, iM40692);
                }
            }
        }
        c17784.f54394 = i16;
        if (this.mOrientation != 1) {
            if (c17078.f52366 == -1) {
                int i22 = c17078.f52365;
                int i23 = i22 - i16;
                i4 = i22;
                i5 = i23;
            } else {
                int i24 = c17078.f52365;
                i4 = i16 + i24;
                i5 = i24;
            }
            i6 = 0;
            i7 = 0;
        } else if (c17078.f52366 == -1) {
            i7 = c17078.f52365;
            i6 = i7 - i16;
            i5 = 0;
            i4 = 0;
        } else {
            i6 = c17078.f52365;
            i7 = i6 + i16;
            i4 = 0;
            i5 = 0;
        }
        int i25 = 0;
        while (i25 < i13) {
            View view5 = this.f68794[i25];
            C7948 c79410 = (C7948) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    iMo7482 = this.f68791[this.f68798 - c79410.f24586] + getPaddingLeft();
                    paddingLeft = iMo7482 - this.mOrientationHelper.mo7481(view5);
                } else {
                    paddingLeft = getPaddingLeft() + this.f68791[c79410.f24586];
                    iMo7482 = this.mOrientationHelper.mo7481(view5) + paddingLeft;
                }
                i9 = paddingLeft;
                iMo7481 = i7;
                i8 = i6;
                i10 = iMo7482;
            } else {
                int paddingTop = getPaddingTop() + this.f68791[c79410.f24586];
                i8 = paddingTop;
                iMo7481 = this.mOrientationHelper.mo7481(view5) + paddingTop;
                i9 = i5;
                i10 = i4;
            }
            layoutDecoratedWithMargins(view5, i9, i8, i10, iMo7481);
            if (c79410.f44554.isRemoved() || c79410.f44554.isUpdated()) {
                c17784.f54397 = true;
            }
            c17784.f54396 |= view5.hasFocusable();
            i25++;
            i7 = iMo7481;
            i6 = i8;
            i5 = i9;
            i4 = i10;
        }
        Arrays.fill(this.f68794, (Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48385(View view, int i, boolean z) {
        int iM40692;
        int iM40693;
        boolean zShouldMeasureChild;
        C7948 c7948 = (C7948) view.getLayoutParams();
        Rect rect = c7948.f44551;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c7948).topMargin + ((ViewGroup.MarginLayoutParams) c7948).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c7948).leftMargin + ((ViewGroup.MarginLayoutParams) c7948).rightMargin;
        int iM48392 = m48392(c7948.f24586, c7948.f24585);
        if (this.mOrientation == 1) {
            iM40693 = AbstractC17366.m40692(iM48392, i, i3, ((ViewGroup.MarginLayoutParams) c7948).width, false);
            iM40692 = AbstractC17366.m40692(this.mOrientationHelper.mo7487(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c7948).height, true);
        } else {
            int iM40694 = AbstractC17366.m40692(iM48392, i, i2, ((ViewGroup.MarginLayoutParams) c7948).height, false);
            int iM40695 = AbstractC17366.m40692(this.mOrientationHelper.mo7487(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c7948).width, true);
            iM40692 = iM40694;
            iM40693 = iM40695;
        }
        C14543 c14543 = (C14543) view.getLayoutParams();
        if (z) {
            zShouldMeasureChild = shouldReMeasureChild(view, iM40693, iM40692, c14543);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, iM40693, iM40692, c14543);
        }
        if (zShouldMeasureChild) {
            view.measure(iM40693, iM40692);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48391() {
        return this.f68798;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48393(int i) {
        if (i == this.f68798) {
            return;
        }
        this.f68795 = true;
        if (i < 1) {
            throw new IllegalArgumentException(C19370.m44628(i, "Span count should be at least 1. Provided "));
        }
        this.f68798 = i;
        this.f68792.m35539();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[PHI: r17 r18 r19
      0x00e8: PHI (r17v6 int) = (r17v5 int), (r17v5 int), (r17v7 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r18v2 int) = (r18v1 int), (r18v1 int), (r18v3 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r19v1 int) = (r19v0 int), (r19v0 int), (r19v2 int) binds: [B:59:0x00dd, B:65:0x00e6, B:55:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    @Override // l.C6495, l.AbstractC17366
    public final View onFocusSearchFailed(View view, int i, C2550 c2550, C21600 c21600) {
        int childCount;
        int childCount2;
        int i2;
        View view2;
        int i3;
        int i4;
        int i5;
        C2550 c2551 = c2550;
        C21600 c21601 = c21600;
        View viewFindContainingItemView = findContainingItemView(view);
        View view3 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        C7948 c7948 = (C7948) viewFindContainingItemView.getLayoutParams();
        int i6 = c7948.f24586;
        int i7 = c7948.f24585 + i6;
        if (super.onFocusSearchFailed(view, i, c2550, c21600) == null) {
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
        int iM48384 = m48384(childCount2, c2551, c21601);
        int i8 = childCount2;
        int i9 = i2;
        int iMin = 0;
        int iMin2 = 0;
        int i10 = -1;
        int i11 = -1;
        View view4 = null;
        while (i8 != childCount) {
            int i12 = childCount;
            int iM48385 = m48384(i8, c2551, c21601);
            View childAt = getChildAt(i8);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iM48385 == iM48384) {
                C7948 c7949 = (C7948) childAt.getLayoutParams();
                int i13 = c7949.f24586;
                view2 = viewFindContainingItemView;
                int i14 = c7949.f24585 + i13;
                if (childAt.hasFocusable() && i13 == i6 && i14 == i7) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view3 == null) && (childAt.hasFocusable() || view4 != null)) {
                    i3 = iM48384;
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
                                                int i15 = c7949.f24586;
                                                iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                                i10 = i15;
                                                view3 = childAt;
                                            } else {
                                                i11 = c7949.f24586;
                                                iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                                view4 = childAt;
                                            }
                                        }
                                    }
                                } else if (childAt.hasFocusable()) {
                                    int i16 = c7949.f24586;
                                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                                    i10 = i16;
                                    view3 = childAt;
                                } else {
                                    i11 = c7949.f24586;
                                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                                    view4 = childAt;
                                }
                                i8 += i9;
                                childCount = i12;
                                c2551 = c2550;
                                c21601 = c21600;
                                viewFindContainingItemView = view2;
                                iM48384 = i3;
                            }
                        }
                        iMin2 = i4;
                        i10 = i5;
                        i8 += i9;
                        childCount = i12;
                        c2551 = c2550;
                        c21601 = c21600;
                        viewFindContainingItemView = view2;
                        iM48384 = i3;
                    } else if (iMin3 <= iMin2) {
                        if (iMin3 == iMin2) {
                            if (z == (i13 > i10)) {
                            }
                            iMin2 = i4;
                            i10 = i5;
                            i8 += i9;
                            childCount = i12;
                            c2551 = c2550;
                            c21601 = c21600;
                            viewFindContainingItemView = view2;
                            iM48384 = i3;
                        }
                    }
                } else {
                    i3 = iM48384;
                }
                i4 = iMin2;
                i5 = i10;
                if (childAt.hasFocusable()) {
                    int i17 = c7949.f24586;
                    iMin2 = Math.min(i14, i7) - Math.max(i13, i6);
                    i10 = i17;
                    view3 = childAt;
                } else {
                    i11 = c7949.f24586;
                    iMin = Math.min(i14, i7) - Math.max(i13, i6);
                    view4 = childAt;
                    iMin2 = i4;
                    i10 = i5;
                }
                i8 += i9;
                childCount = i12;
                c2551 = c2550;
                c21601 = c21600;
                viewFindContainingItemView = view2;
                iM48384 = i3;
            } else {
                if (view3 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                i3 = iM48384;
            }
            i4 = iMin2;
            i5 = i10;
            iMin2 = i4;
            i10 = i5;
            i8 += i9;
            childCount = i12;
            c2551 = c2550;
            c21601 = c21600;
            viewFindContainingItemView = view2;
            iM48384 = i3;
        }
        return view3 != null ? view3 : view4;
    }

    @Override // l.C6495, l.AbstractC17366
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f68795;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48384(int i, C2550 c2550, C21600 c21600) {
        boolean z = c21600.f69359;
        C0892 c0892 = this.f68792;
        if (z && (i = c2550.m8067(i)) == -1) {
            return 0;
        }
        int i2 = this.f68798;
        c0892.getClass();
        return AbstractC15002.m35538(i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m48386(int i, C2550 c2550, C21600 c21600) {
        int i2;
        boolean z = c21600.f69359;
        C0892 c0892 = this.f68792;
        if (!z) {
            i2 = this.f68798;
            c0892.getClass();
        } else {
            int i3 = this.f68797.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i = c2550.m8067(i);
            if (i == -1) {
                return 0;
            }
            i2 = this.f68798;
            c0892.getClass();
        }
        return i % i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m48389(int i, C2550 c2550, C21600 c21600) {
        boolean z = c21600.f69359;
        C0892 c0892 = this.f68792;
        if (!z) {
            c0892.getClass();
            return 1;
        }
        int i2 = this.f68796.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c2550.m8067(i) == -1) {
            return 1;
        }
        c0892.getClass();
        return 1;
    }

    @Override // l.C6495, l.AbstractC17366
    public final void onLayoutChildren(C2550 c2550, C21600 c21600) {
        boolean z = c21600.f69359;
        SparseIntArray sparseIntArray = this.f68797;
        SparseIntArray sparseIntArray2 = this.f68796;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C7948 c7948 = (C7948) getChildAt(i).getLayoutParams();
                int layoutPosition = c7948.f44554.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c7948.f24585);
                sparseIntArray.put(layoutPosition, c7948.f24586);
            }
        }
        super.onLayoutChildren(c2550, c21600);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }
}
