package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.o;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes3.dex */
public class C6495 extends AbstractC17366 implements InterfaceC7242, InterfaceC8194 {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final float MAX_SCROLL_FACTOR = 0.33333334f;
    public static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final C16372 mAnchorInfo;
    public int mInitialPrefetchItemCount;
    public boolean mLastStackFromEnd;
    public final C17784 mLayoutChunkResult;
    public C17078 mLayoutState;
    public int mOrientation;
    public AbstractC2262 mOrientationHelper;
    public C23428 mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public boolean mRecycleChildrenOnDetach;
    public int[] mReusableIntPair;
    public boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    public boolean mSmoothScrollbarEnabled;
    public boolean mStackFromEnd;

    @Override // l.AbstractC17366
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(C2550 c2550, C21600 c21600, C16372 c16372, int i) {
    }

    public C6495(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    public C6495(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C16372();
        this.mLayoutChunkResult = new C17784();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public C6495(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C16372();
        this.mLayoutChunkResult = new C17784();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C18072 c18072M40694 = AbstractC17366.m40694(context, attributeSet, i, i2);
        setOrientation(c18072M40694.f56290);
        setReverseLayout(c18072M40694.f56291);
        setStackFromEnd(c18072M40694.f56293);
    }

    @Override // l.AbstractC17366
    public C14543 generateDefaultLayoutParams() {
        return new C14543(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    @Override // l.AbstractC17366
    public void onDetachedFromWindow(C13132 c13132, C2550 c2550) {
        super.onDetachedFromWindow(c13132, c2550);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c2550);
            c2550.f8075.clear();
            c2550.m8082();
        }
    }

    @Override // l.AbstractC17366
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // l.AbstractC17366
    public Parcelable onSaveInstanceState() {
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 == null) {
            C23428 c23429 = new C23428();
            if (getChildCount() > 0) {
                ensureLayoutState();
                boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
                c23429.f75229 = z;
                if (z) {
                    View childClosestToEnd = getChildClosestToEnd();
                    c23429.f75230 = this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(childClosestToEnd);
                    c23429.f75228 = getPosition(childClosestToEnd);
                    return c23429;
                }
                View childClosestToStart = getChildClosestToStart();
                c23429.f75228 = getPosition(childClosestToStart);
                c23429.f75230 = this.mOrientationHelper.mo7485(childClosestToStart) - this.mOrientationHelper.mo7478();
                return c23429;
            }
            c23429.f75228 = -1;
            return c23429;
        }
        C23428 c234210 = new C23428();
        c234210.f75228 = c23428.f75228;
        c234210.f75230 = c23428.f75230;
        c234210.f75229 = c23428.f75229;
        return c234210;
    }

    @Override // l.AbstractC17366
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C23428) {
            C23428 c23428 = (C23428) parcelable;
            this.mPendingSavedState = c23428;
            if (this.mPendingScrollPosition != -1) {
                c23428.f75228 = -1;
            }
            requestLayout();
        }
    }

    @Override // l.AbstractC17366
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // l.AbstractC17366
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C19370.m44628(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC2262 abstractC2262M7471 = AbstractC2262.m7471(this, i);
            this.mOrientationHelper = abstractC2262M7471;
            this.mAnchorInfo.f50365 = abstractC2262M7471;
            this.mOrientation = i;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m17938() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    @Override // l.AbstractC17366
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public void calculateExtraLayoutSpace(C21600 c21600, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c21600);
        if (this.mLayoutState.f52366 == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // l.AbstractC17366
    public void smoothScrollToPosition(C13132 c13132, C21600 c21600, int i) {
        C20607 c20607 = new C20607(c13132.getContext());
        c20607.setTargetPosition(i);
        startSmoothScroll(c20607);
    }

    @Override // l.InterfaceC8194
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        if (this.mOrientation == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // l.AbstractC17366
    public void onLayoutChildren(C2550 c2550, C21600 c21600) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM17920;
        int i5;
        View viewFindViewByPosition;
        int iMo7485;
        int iMo7476;
        int i6;
        int i7 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && c21600.m48777() == 0) {
            removeAndRecycleAllViews(c2550);
            return;
        }
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null && (i6 = c23428.f75228) >= 0) {
            this.mPendingScrollPosition = i6;
        }
        ensureLayoutState();
        this.mLayoutState.f52358 = false;
        m17938();
        View focusedChild = getFocusedChild();
        C16372 c16372 = this.mAnchorInfo;
        if (!c16372.f50366 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c16372.m38536();
            C16372 c16373 = this.mAnchorInfo;
            c16373.f50364 = this.mShouldReverseLayout ^ this.mStackFromEnd;
            m17936(c2550, c21600, c16373);
            this.mAnchorInfo.f50366 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo7485(focusedChild) >= this.mOrientationHelper.mo7476() || this.mOrientationHelper.mo7473(focusedChild) <= this.mOrientationHelper.mo7478())) {
            this.mAnchorInfo.m38537(getPosition(focusedChild), focusedChild);
        }
        C17078 c17078 = this.mLayoutState;
        c17078.f52366 = c17078.f52360 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c21600, iArr);
        int iMo7478 = this.mOrientationHelper.mo7478() + Math.max(0, this.mReusableIntPair[0]);
        int iMo7480 = this.mOrientationHelper.mo7480() + Math.max(0, this.mReusableIntPair[1]);
        if (c21600.f69359 && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                iMo7476 = this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(viewFindViewByPosition);
                iMo7485 = this.mPendingScrollPositionOffset;
            } else {
                iMo7485 = this.mOrientationHelper.mo7485(viewFindViewByPosition) - this.mOrientationHelper.mo7478();
                iMo7476 = this.mPendingScrollPositionOffset;
            }
            int i8 = iMo7476 - iMo7485;
            if (i8 > 0) {
                iMo7478 += i8;
            } else {
                iMo7480 -= i8;
            }
        }
        C16372 c16374 = this.mAnchorInfo;
        if (!c16374.f50364 ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(c2550, c21600, c16374, i7);
        detachAndScrapAttachedViews(c2550);
        this.mLayoutState.f52364 = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f52356 = 0;
        C16372 c16375 = this.mAnchorInfo;
        if (c16375.f50364) {
            m17937(c16375);
            C17078 c17079 = this.mLayoutState;
            c17079.f52362 = iMo7478;
            fill(c2550, c17079, c21600, false);
            C17078 c170710 = this.mLayoutState;
            i2 = c170710.f52365;
            int i9 = c170710.f52359;
            int i10 = c170710.f52355;
            if (i10 > 0) {
                iMo7480 += i10;
            }
            m17928(this.mAnchorInfo);
            C17078 c170711 = this.mLayoutState;
            c170711.f52362 = iMo7480;
            c170711.f52359 += c170711.f52363;
            fill(c2550, c170711, c21600, false);
            C17078 c170712 = this.mLayoutState;
            i = c170712.f52365;
            int i11 = c170712.f52355;
            if (i11 > 0) {
                m17934(i9, i2);
                C17078 c170713 = this.mLayoutState;
                c170713.f52362 = i11;
                fill(c2550, c170713, c21600, false);
                i2 = this.mLayoutState.f52365;
            }
        } else {
            m17928(c16375);
            C17078 c170714 = this.mLayoutState;
            c170714.f52362 = iMo7480;
            fill(c2550, c170714, c21600, false);
            C17078 c170715 = this.mLayoutState;
            int i12 = c170715.f52365;
            int i13 = c170715.f52359;
            int i14 = c170715.f52355;
            if (i14 > 0) {
                iMo7478 += i14;
            }
            m17937(this.mAnchorInfo);
            C17078 c170716 = this.mLayoutState;
            c170716.f52362 = iMo7478;
            c170716.f52359 += c170716.f52363;
            fill(c2550, c170716, c21600, false);
            C17078 c170717 = this.mLayoutState;
            int i15 = c170717.f52365;
            int i16 = c170717.f52355;
            if (i16 > 0) {
                m17923(i13, i12);
                C17078 c170718 = this.mLayoutState;
                c170718.f52362 = i16;
                fill(c2550, c170718, c21600, false);
                i = this.mLayoutState.f52365;
            } else {
                i = i12;
            }
            i2 = i15;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM17921 = m17920(i, c2550, c21600, true);
                i3 = i2 + iM17921;
                i4 = i + iM17921;
                iM17920 = m17931(i3, c2550, c21600, false);
            } else {
                int iM17931 = m17931(i2, c2550, c21600, true);
                i3 = i2 + iM17931;
                i4 = i + iM17931;
                iM17920 = m17920(i4, c2550, c21600, false);
            }
            i2 = i3 + iM17920;
            i = i4 + iM17920;
        }
        m17927(c2550, c21600, i2, i);
        if (!c21600.f69359) {
            this.mOrientationHelper.m7486();
        } else {
            this.mAnchorInfo.m38536();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // l.AbstractC17366
    public void onLayoutCompleted(C21600 c21600) {
        super.onLayoutCompleted(c21600);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m38536();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17936(C2550 c2550, C21600 c21600, C16372 c16372) {
        if (m17930(c21600, c16372) || m17929(c2550, c21600, c16372)) {
            return;
        }
        c16372.m38534();
        c16372.f50367 = this.mStackFromEnd ? c21600.m48777() - 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17929(C2550 c2550, C21600 c21600, C16372 c16372) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                c16372.getClass();
                C14543 c14543 = (C14543) focusedChild.getLayoutParams();
                if (!c14543.f44554.isRemoved() && c14543.f44554.getLayoutPosition() >= 0 && c14543.f44554.getLayoutPosition() < c21600.m48777()) {
                    c16372.m38537(getPosition(focusedChild), focusedChild);
                    return true;
                }
            }
            boolean z2 = this.mLastStackFromEnd;
            boolean z3 = this.mStackFromEnd;
            if (z2 == z3 && (viewFindReferenceChild = findReferenceChild(c2550, c21600, c16372.f50364, z3)) != null) {
                c16372.m38535(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                if (!c21600.f69359 && supportsPredictiveItemAnimations()) {
                    int iMo7485 = this.mOrientationHelper.mo7485(viewFindReferenceChild);
                    int iMo7473 = this.mOrientationHelper.mo7473(viewFindReferenceChild);
                    int iMo7478 = this.mOrientationHelper.mo7478();
                    int iMo7476 = this.mOrientationHelper.mo7476();
                    boolean z4 = iMo7473 <= iMo7478 && iMo7485 < iMo7478;
                    if (iMo7485 >= iMo7476 && iMo7473 > iMo7476) {
                        z = true;
                    }
                    if (z4 || z) {
                        if (c16372.f50364) {
                            iMo7478 = iMo7476;
                        }
                        c16372.f50363 = iMo7478;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m17920(int i, C2550 c2550, C21600 c21600, boolean z) {
        int iMo7476;
        int iMo7477 = this.mOrientationHelper.mo7476() - i;
        if (iMo7477 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo7477, c2550, c21600);
        int i3 = i + i2;
        if (!z || (iMo7476 = this.mOrientationHelper.mo7476() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo7474(iMo7476);
        return iMo7476 + i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m17931(int i, C2550 c2550, C21600 c21600, boolean z) {
        int iMo7478;
        int iMo7479 = i - this.mOrientationHelper.mo7478();
        if (iMo7479 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo7479, c2550, c21600);
        int i3 = i + i2;
        if (!z || (iMo7478 = i3 - this.mOrientationHelper.mo7478()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo7474(-iMo7478);
        return i2 - iMo7478;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17928(C16372 c16372) {
        m17923(c16372.f50367, c16372.f50363);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17923(int i, int i2) {
        this.mLayoutState.f52355 = this.mOrientationHelper.mo7476() - i2;
        C17078 c17078 = this.mLayoutState;
        c17078.f52363 = this.mShouldReverseLayout ? -1 : 1;
        c17078.f52359 = i;
        c17078.f52366 = 1;
        c17078.f52365 = i2;
        c17078.f52361 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17937(C16372 c16372) {
        m17934(c16372.f50367, c16372.f50363);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17934(int i, int i2) {
        this.mLayoutState.f52355 = i2 - this.mOrientationHelper.mo7478();
        C17078 c17078 = this.mLayoutState;
        c17078.f52359 = i;
        c17078.f52363 = this.mShouldReverseLayout ? 1 : -1;
        c17078.f52366 = -1;
        c17078.f52365 = i2;
        c17078.f52361 = Integer.MIN_VALUE;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public C17078 createLayoutState() {
        C17078 c17078 = new C17078();
        c17078.f52358 = true;
        c17078.f52362 = 0;
        c17078.f52356 = 0;
        c17078.f52357 = null;
        return c17078;
    }

    @Override // l.AbstractC17366
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null) {
            c23428.f75228 = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null) {
            c23428.f75228 = -1;
        }
        requestLayout();
    }

    @Override // l.AbstractC17366
    public int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c2550, c21600);
    }

    @Override // l.AbstractC17366
    public int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c2550, c21600);
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollOffset(C21600 c21600) {
        return m17932(c21600);
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollOffset(C21600 c21600) {
        return m17932(c21600);
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollExtent(C21600 c21600) {
        return m17921(c21600);
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollExtent(C21600 c21600) {
        return m17921(c21600);
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollRange(C21600 c21600) {
        return m17939(c21600);
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollRange(C21600 c21600) {
        return m17939(c21600);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m17932(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C6077.m16983(c21600, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m17921(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C6077.m16982(c21600, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m17939(C21600 c21600) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C6077.m16984(c21600, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17924(int i, int i2, boolean z, C21600 c21600) {
        int iMo7478;
        this.mLayoutState.f52364 = resolveIsInfinite();
        this.mLayoutState.f52366 = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c21600, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C17078 c17078 = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c17078.f52362 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c17078.f52356 = iMax;
        if (z2) {
            c17078.f52362 = this.mOrientationHelper.mo7480() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            C17078 c17079 = this.mLayoutState;
            c17079.f52363 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C17078 c170710 = this.mLayoutState;
            c17079.f52359 = position + c170710.f52363;
            c170710.f52365 = this.mOrientationHelper.mo7473(childClosestToEnd);
            iMo7478 = this.mOrientationHelper.mo7473(childClosestToEnd) - this.mOrientationHelper.mo7476();
        } else {
            View childClosestToStart = getChildClosestToStart();
            C17078 c170711 = this.mLayoutState;
            c170711.f52362 = this.mOrientationHelper.mo7478() + c170711.f52362;
            C17078 c170712 = this.mLayoutState;
            c170712.f52363 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C17078 c170713 = this.mLayoutState;
            c170712.f52359 = position2 + c170713.f52363;
            c170713.f52365 = this.mOrientationHelper.mo7485(childClosestToStart);
            iMo7478 = (-this.mOrientationHelper.mo7485(childClosestToStart)) + this.mOrientationHelper.mo7478();
        }
        C17078 c170714 = this.mLayoutState;
        c170714.f52355 = i2;
        if (z) {
            c170714.f52355 = i2 - iMo7478;
        }
        c170714.f52361 = iMo7478;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo7484() == 0 && this.mOrientationHelper.mo7472() == 0;
    }

    public void collectPrefetchPositionsForLayoutState(C21600 c21600, C17078 c17078, InterfaceC16660 interfaceC16660) {
        int i = c17078.f52359;
        if (i < 0 || i >= c21600.m48777()) {
            return;
        }
        ((C19238) interfaceC16660).m44373(i, Math.max(0, c17078.f52361));
    }

    @Override // l.AbstractC17366
    public void collectInitialPrefetchPositions(int i, InterfaceC16660 interfaceC16660) {
        boolean z;
        int i2;
        C23428 c23428 = this.mPendingSavedState;
        if (c23428 != null && (i2 = c23428.f75228) >= 0) {
            z = c23428.f75229;
        } else {
            m17938();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((C19238) interfaceC16660).m44373(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    @Override // l.AbstractC17366
    public void collectAdjacentPrefetchPositions(int i, int i2, C21600 c21600, InterfaceC16660 interfaceC16660) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m17924(i > 0 ? 1 : -1, Math.abs(i), true, c21600);
        collectPrefetchPositionsForLayoutState(c21600, this.mLayoutState, interfaceC16660);
    }

    public int scrollBy(int i, C2550 c2550, C21600 c21600) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f52358 = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m17924(i2, iAbs, true, c21600);
        C17078 c17078 = this.mLayoutState;
        int iFill = c17078.f52361 + fill(c2550, c17078, c21600, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo7474(-i);
        this.mLayoutState.f52360 = i;
        return i;
    }

    @Override // l.AbstractC17366
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17925(C2550 c2550, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c2550);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    removeAndRecycleViewAt(i2, c2550);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m17941(C2550 c2550, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo7473(childAt) > i3 || this.mOrientationHelper.mo7483(childAt) > i3) {
                    m17925(c2550, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo7473(childAt2) > i3 || this.mOrientationHelper.mo7483(childAt2) > i3) {
                m17925(c2550, i5, i6);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17935(C2550 c2550, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iMo7472 = (this.mOrientationHelper.mo7472() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo7485(childAt) < iMo7472 || this.mOrientationHelper.mo7479(childAt) < iMo7472) {
                    m17925(c2550, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo7485(childAt2) < iMo7472 || this.mOrientationHelper.mo7479(childAt2) < iMo7472) {
                m17925(c2550, i4, i5);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17926(C2550 c2550, C17078 c17078) {
        if (!c17078.f52358 || c17078.f52364) {
            return;
        }
        int i = c17078.f52361;
        int i2 = c17078.f52356;
        if (c17078.f52366 == -1) {
            m17935(c2550, i, i2);
        } else {
            m17941(c2550, i, i2);
        }
    }

    public int fill(C2550 c2550, C17078 c17078, C21600 c21600, boolean z) {
        int i;
        int i2 = c17078.f52355;
        int i3 = c17078.f52361;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c17078.f52361 = i3 + i2;
            }
            m17926(c2550, c17078);
        }
        int i4 = c17078.f52355 + c17078.f52362;
        C17784 c17784 = this.mLayoutChunkResult;
        while (true) {
            if ((!c17078.f52364 && i4 <= 0) || (i = c17078.f52359) < 0 || i >= c21600.m48777()) {
                break;
            }
            c17784.f54394 = 0;
            c17784.f54395 = false;
            c17784.f54397 = false;
            c17784.f54396 = false;
            layoutChunk(c2550, c21600, c17078, c17784);
            if (!c17784.f54395) {
                int i5 = c17078.f52365;
                int i6 = c17784.f54394;
                c17078.f52365 = (c17078.f52366 * i6) + i5;
                if (!c17784.f54397 || c17078.f52357 != null || !c21600.f69359) {
                    c17078.f52355 -= i6;
                    i4 -= i6;
                }
                int i7 = c17078.f52361;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c17078.f52361 = i8;
                    int i9 = c17078.f52355;
                    if (i9 < 0) {
                        c17078.f52361 = i8 + i9;
                    }
                    m17926(c2550, c17078);
                }
                if (z && c17784.f54396) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c17078.f52355;
    }

    public void layoutChunk(C2550 c2550, C21600 c21600, C17078 c17078, C17784 c17784) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int paddingLeft;
        int iMo7481;
        int i6;
        int i7;
        View viewM40078 = c17078.m40078(c2550);
        if (viewM40078 == null) {
            c17784.f54395 = true;
            return;
        }
        C14543 c14543 = (C14543) viewM40078.getLayoutParams();
        if (c17078.f52357 == null) {
            if (this.mShouldReverseLayout == (c17078.f52366 == -1)) {
                addView(viewM40078);
            } else {
                addView(viewM40078, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c17078.f52366 == -1)) {
                addDisappearingView(viewM40078);
            } else {
                addDisappearingView(viewM40078, 0);
            }
        }
        measureChildWithMargins(viewM40078, 0, 0);
        c17784.f54394 = this.mOrientationHelper.mo7477(viewM40078);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo7481 = getWidth() - getPaddingRight();
                paddingLeft = iMo7481 - this.mOrientationHelper.mo7481(viewM40078);
            } else {
                paddingLeft = getPaddingLeft();
                iMo7481 = this.mOrientationHelper.mo7481(viewM40078) + paddingLeft;
            }
            if (c17078.f52366 == -1) {
                i7 = c17078.f52365;
                i6 = i7 - c17784.f54394;
            } else {
                i6 = c17078.f52365;
                i7 = c17784.f54394 + i6;
            }
            i5 = i7;
            i3 = iMo7481;
            i4 = i6;
        } else {
            int paddingTop = getPaddingTop();
            int iMo7482 = this.mOrientationHelper.mo7481(viewM40078) + paddingTop;
            if (c17078.f52366 == -1) {
                i2 = c17078.f52365;
                i = i2 - c17784.f54394;
            } else {
                i = c17078.f52365;
                i2 = c17784.f54394 + i;
            }
            i3 = i2;
            i4 = paddingTop;
            i5 = iMo7482;
            paddingLeft = i;
        }
        layoutDecoratedWithMargins(viewM40078, paddingLeft, i4, i3, i5);
        if (c14543.f44554.isRemoved() || c14543.f44554.isUpdated()) {
            c17784.f54397 = true;
        }
        c17784.f54396 = viewM40078.hasFocusable();
    }

    @Override // l.AbstractC17366
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(C2550 c2550, C21600 c21600, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i2 = -1;
            i = -1;
        } else {
            i = 1;
            i2 = childCount2;
            childCount = 0;
        }
        int iM48777 = c21600.m48777();
        int iMo7478 = this.mOrientationHelper.mo7478();
        int iMo7476 = this.mOrientationHelper.mo7476();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i2) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo7485 = this.mOrientationHelper.mo7485(childAt);
            int iMo7473 = this.mOrientationHelper.mo7473(childAt);
            if (position >= 0 && position < iM48777) {
                if (!((C14543) childAt.getLayoutParams()).f44554.isRemoved()) {
                    boolean z3 = iMo7473 <= iMo7478 && iMo7485 < iMo7478;
                    boolean z4 = iMo7485 >= iMo7476 && iMo7473 > iMo7476;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z3) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private View m17940() {
        return this.mShouldReverseLayout ? m17922() : m17933();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private View m17943() {
        return this.mShouldReverseLayout ? m17933() : m17922();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private View m17922() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private View m17933() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m8044(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m8044(i, i2, i3, i4);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo7485(getChildAt(i)) < this.mOrientationHelper.mo7478()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = o.a.a;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m8044(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m8044(i, i2, i3, i4);
    }

    @Override // l.AbstractC17366
    public View onFocusSearchFailed(View view, int i, C2550 c2550, C21600 c21600) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewM17940;
        View childClosestToEnd;
        m17938();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m17924(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo7487() * 0.33333334f), false, c21600);
        C17078 c17078 = this.mLayoutState;
        c17078.f52361 = Integer.MIN_VALUE;
        c17078.f52358 = false;
        fill(c2550, c17078, c21600, true);
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            viewM17940 = m17943();
        } else {
            viewM17940 = m17940();
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (!childClosestToEnd.hasFocusable()) {
            return viewM17940;
        }
        if (viewM17940 == null) {
            return null;
        }
        return childClosestToEnd;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17942() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo7485(childAt);
        }
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo7485 = this.mOrientationHelper.mo7485(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo7486 = this.mOrientationHelper.mo7485(childAt);
                if (position2 < position) {
                    m17942();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo7486 < iMo7485);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo7486 > iMo7485) {
                    m17942();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo7487 = this.mOrientationHelper.mo7485(childAt2);
            if (position3 < position) {
                m17942();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo7487 < iMo7485);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo7487 < iMo7485) {
                m17942();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // l.AbstractC17366
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    @Override // l.InterfaceC7242
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m17938();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7476() - (this.mOrientationHelper.mo7477(view) + this.mOrientationHelper.mo7485(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7485(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7473(view2) - this.mOrientationHelper.mo7477(view));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17930(C21600 c21600, C16372 c16372) {
        int i;
        int iMo7485;
        if (!c21600.f69359 && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= c21600.m48777()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                int i2 = this.mPendingScrollPosition;
                c16372.f50367 = i2;
                C23428 c23428 = this.mPendingSavedState;
                if (c23428 != null && c23428.f75228 >= 0) {
                    boolean z = c23428.f75229;
                    c16372.f50364 = z;
                    if (z) {
                        c16372.f50363 = this.mOrientationHelper.mo7476() - this.mPendingSavedState.f75230;
                        return true;
                    }
                    c16372.f50363 = this.mOrientationHelper.mo7478() + this.mPendingSavedState.f75230;
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition = findViewByPosition(i2);
                    if (viewFindViewByPosition != null) {
                        if (this.mOrientationHelper.mo7477(viewFindViewByPosition) > this.mOrientationHelper.mo7487()) {
                            c16372.m38534();
                            return true;
                        }
                        if (this.mOrientationHelper.mo7485(viewFindViewByPosition) - this.mOrientationHelper.mo7478() < 0) {
                            c16372.f50363 = this.mOrientationHelper.mo7478();
                            c16372.f50364 = false;
                            return true;
                        }
                        if (this.mOrientationHelper.mo7476() - this.mOrientationHelper.mo7473(viewFindViewByPosition) < 0) {
                            c16372.f50363 = this.mOrientationHelper.mo7476();
                            c16372.f50364 = true;
                            return true;
                        }
                        if (c16372.f50364) {
                            iMo7485 = this.mOrientationHelper.m7475() + this.mOrientationHelper.mo7473(viewFindViewByPosition);
                        } else {
                            iMo7485 = this.mOrientationHelper.mo7485(viewFindViewByPosition);
                        }
                        c16372.f50363 = iMo7485;
                        return true;
                    }
                    if (getChildCount() > 0) {
                        c16372.f50364 = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c16372.m38534();
                    return true;
                }
                boolean z2 = this.mShouldReverseLayout;
                c16372.f50364 = z2;
                if (z2) {
                    c16372.f50363 = this.mOrientationHelper.mo7476() - this.mPendingScrollPositionOffset;
                    return true;
                }
                c16372.f50363 = this.mOrientationHelper.mo7478() + this.mPendingScrollPositionOffset;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17927(C2550 c2550, C21600 c21600, int i, int i2) {
        if (!c21600.f69354 || getChildCount() == 0 || c21600.f69359 || !supportsPredictiveItemAnimations()) {
            return;
        }
        List listM8076 = c2550.m8076();
        int size = listM8076.size();
        int position = getPosition(getChildAt(0));
        int iMo7477 = 0;
        int iMo7478 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC3255 abstractC3255 = (AbstractC3255) listM8076.get(i3);
            if (!abstractC3255.isRemoved()) {
                if ((abstractC3255.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iMo7477 += this.mOrientationHelper.mo7477(abstractC3255.itemView);
                } else {
                    iMo7478 += this.mOrientationHelper.mo7477(abstractC3255.itemView);
                }
            }
        }
        this.mLayoutState.f52357 = listM8076;
        if (iMo7477 > 0) {
            m17934(getPosition(getChildClosestToStart()), i);
            C17078 c17078 = this.mLayoutState;
            c17078.f52362 = iMo7477;
            c17078.f52355 = 0;
            c17078.m40079((View) null);
            fill(c2550, this.mLayoutState, c21600, false);
        }
        if (iMo7478 > 0) {
            m17923(getPosition(getChildClosestToEnd()), i2);
            C17078 c17079 = this.mLayoutState;
            c17079.f52362 = iMo7478;
            c17079.f52355 = 0;
            c17079.m40079((View) null);
            fill(c2550, this.mLayoutState, c21600, false);
        }
        this.mLayoutState.f52357 = null;
    }

    @Deprecated
    public int getExtraLayoutSpace(C21600 c21600) {
        if (c21600.f69350 != -1) {
            return this.mOrientationHelper.mo7487();
        }
        return 0;
    }
}
