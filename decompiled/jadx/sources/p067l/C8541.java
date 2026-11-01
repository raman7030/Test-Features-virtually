package p067l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.umeng.analytics.pro.C0719o;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes3.dex */
public class C8541 extends AbstractC18873 implements InterfaceC9251, InterfaceC10156 {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final float MAX_SCROLL_FACTOR = 0.33333334f;
    public static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final C17928 mAnchorInfo;
    public int mInitialPrefetchItemCount;
    public boolean mLastStackFromEnd;
    public final C19270 mLayoutChunkResult;
    public C18599 mLayoutState;
    public int mOrientation;
    public AbstractC4518 mOrientationHelper;
    public C24634 mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public boolean mRecycleChildrenOnDetach;
    public int[] mReusableIntPair;
    public boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    public boolean mSmoothScrollbarEnabled;
    public boolean mStackFromEnd;

    @Override // p067l.AbstractC18873
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(C4792 c4792, C22897 c22897, C17928 c17928, int i) {
    }

    public C8541(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    public C8541(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C17928();
        this.mLayoutChunkResult = new C19270();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public C8541(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C17928();
        this.mLayoutChunkResult = new C19270();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C19544 c19544M42945 = AbstractC18873.m42945(context, attributeSet, i, i2);
        setOrientation(c19544M42945.f59495);
        setReverseLayout(c19544M42945.f59496);
        setStackFromEnd(c19544M42945.f59498);
    }

    @Override // p067l.AbstractC18873
    public C16190 generateDefaultLayoutParams() {
        return new C16190(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    @Override // p067l.AbstractC18873
    public void onDetachedFromWindow(C14849 c14849, C4792 c4792) {
        super.onDetachedFromWindow(c14849, c4792);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c4792);
            c4792.f10865.clear();
            c4792.m10113();
        }
    }

    @Override // p067l.AbstractC18873
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // p067l.AbstractC18873
    public Parcelable onSaveInstanceState() {
        C24634 c24634 = this.mPendingSavedState;
        if (c24634 == null) {
            C24634 c24635 = new C24634();
            if (getChildCount() > 0) {
                ensureLayoutState();
                boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
                c24635.f77975 = z;
                if (z) {
                    View childClosestToEnd = getChildClosestToEnd();
                    c24635.f77976 = this.mOrientationHelper.mo9558() - this.mOrientationHelper.mo9555(childClosestToEnd);
                    c24635.f77974 = getPosition(childClosestToEnd);
                    return c24635;
                }
                View childClosestToStart = getChildClosestToStart();
                c24635.f77974 = getPosition(childClosestToStart);
                c24635.f77976 = this.mOrientationHelper.mo9567(childClosestToStart) - this.mOrientationHelper.mo9560();
                return c24635;
            }
            c24635.f77974 = -1;
            return c24635;
        }
        C24634 c24636 = new C24634();
        c24636.f77974 = c24634.f77974;
        c24636.f77976 = c24634.f77976;
        c24636.f77975 = c24634.f77975;
        return c24636;
    }

    @Override // p067l.AbstractC18873
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C24634) {
            C24634 c24634 = (C24634) parcelable;
            this.mPendingSavedState = c24634;
            if (this.mPendingScrollPosition != -1) {
                c24634.f77974 = -1;
            }
            requestLayout();
        }
    }

    @Override // p067l.AbstractC18873
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // p067l.AbstractC18873
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
            throw new IllegalArgumentException(C20778.m46922(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC4518 abstractC4518M9553 = AbstractC4518.m9553(this, i);
            this.mOrientationHelper = abstractC4518M9553;
            this.mAnchorInfo.f53538 = abstractC4518M9553;
            this.mOrientation = i;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m19886() {
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

    @Override // p067l.AbstractC18873
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

    public void calculateExtraLayoutSpace(C22897 c22897, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c22897);
        if (this.mLayoutState.f55548 == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // p067l.AbstractC18873
    public void smoothScrollToPosition(C14849 c14849, C22897 c22897, int i) {
        C21953 c21953 = new C21953(c14849.getContext());
        c21953.setTargetPosition(i);
        startSmoothScroll(c21953);
    }

    @Override // p067l.InterfaceC10156
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

    @Override // p067l.AbstractC18873
    public void onLayoutChildren(C4792 c4792, C22897 c22897) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM19868;
        int i5;
        View viewFindViewByPosition;
        int iMo9567;
        int iMo9558;
        int i6;
        int i7 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && c22897.m51124() == 0) {
            removeAndRecycleAllViews(c4792);
            return;
        }
        C24634 c24634 = this.mPendingSavedState;
        if (c24634 != null && (i6 = c24634.f77974) >= 0) {
            this.mPendingScrollPosition = i6;
        }
        ensureLayoutState();
        this.mLayoutState.f55540 = false;
        m19886();
        View focusedChild = getFocusedChild();
        C17928 c17928 = this.mAnchorInfo;
        if (!c17928.f53539 || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c17928.m40753();
            C17928 c17929 = this.mAnchorInfo;
            c17929.f53537 = this.mShouldReverseLayout ^ this.mStackFromEnd;
            m19884(c4792, c22897, c17929);
            this.mAnchorInfo.f53539 = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo9567(focusedChild) >= this.mOrientationHelper.mo9558() || this.mOrientationHelper.mo9555(focusedChild) <= this.mOrientationHelper.mo9560())) {
            this.mAnchorInfo.m40754(getPosition(focusedChild), focusedChild);
        }
        C18599 c18599 = this.mLayoutState;
        c18599.f55548 = c18599.f55542 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c22897, iArr);
        int iMo9560 = this.mOrientationHelper.mo9560() + Math.max(0, this.mReusableIntPair[0]);
        int iMo9562 = this.mOrientationHelper.mo9562() + Math.max(0, this.mReusableIntPair[1]);
        if (c22897.f72063 && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            if (this.mShouldReverseLayout) {
                iMo9558 = this.mOrientationHelper.mo9558() - this.mOrientationHelper.mo9555(viewFindViewByPosition);
                iMo9567 = this.mPendingScrollPositionOffset;
            } else {
                iMo9567 = this.mOrientationHelper.mo9567(viewFindViewByPosition) - this.mOrientationHelper.mo9560();
                iMo9558 = this.mPendingScrollPositionOffset;
            }
            int i8 = iMo9558 - iMo9567;
            if (i8 > 0) {
                iMo9560 += i8;
            } else {
                iMo9562 -= i8;
            }
        }
        C17928 c179210 = this.mAnchorInfo;
        if (!c179210.f53537 ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(c4792, c22897, c179210, i7);
        detachAndScrapAttachedViews(c4792);
        this.mLayoutState.f55546 = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f55538 = 0;
        C17928 c179211 = this.mAnchorInfo;
        if (c179211.f53537) {
            m19885(c179211);
            C18599 c185910 = this.mLayoutState;
            c185910.f55544 = iMo9560;
            fill(c4792, c185910, c22897, false);
            C18599 c185911 = this.mLayoutState;
            i2 = c185911.f55547;
            int i9 = c185911.f55541;
            int i10 = c185911.f55537;
            if (i10 > 0) {
                iMo9562 += i10;
            }
            m19876(this.mAnchorInfo);
            C18599 c185912 = this.mLayoutState;
            c185912.f55544 = iMo9562;
            c185912.f55541 += c185912.f55545;
            fill(c4792, c185912, c22897, false);
            C18599 c185913 = this.mLayoutState;
            i = c185913.f55547;
            int i11 = c185913.f55537;
            if (i11 > 0) {
                m19882(i9, i2);
                C18599 c185914 = this.mLayoutState;
                c185914.f55544 = i11;
                fill(c4792, c185914, c22897, false);
                i2 = this.mLayoutState.f55547;
            }
        } else {
            m19876(c179211);
            C18599 c185915 = this.mLayoutState;
            c185915.f55544 = iMo9562;
            fill(c4792, c185915, c22897, false);
            C18599 c185916 = this.mLayoutState;
            int i12 = c185916.f55547;
            int i13 = c185916.f55541;
            int i14 = c185916.f55537;
            if (i14 > 0) {
                iMo9560 += i14;
            }
            m19885(this.mAnchorInfo);
            C18599 c185917 = this.mLayoutState;
            c185917.f55544 = iMo9560;
            c185917.f55541 += c185917.f55545;
            fill(c4792, c185917, c22897, false);
            C18599 c185918 = this.mLayoutState;
            int i15 = c185918.f55547;
            int i16 = c185918.f55537;
            if (i16 > 0) {
                m19871(i13, i12);
                C18599 c185919 = this.mLayoutState;
                c185919.f55544 = i16;
                fill(c4792, c185919, c22897, false);
                i = this.mLayoutState.f55547;
            } else {
                i = i12;
            }
            i2 = i15;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM19869 = m19868(i, c4792, c22897, true);
                i3 = i2 + iM19869;
                i4 = i + iM19869;
                iM19868 = m19879(i3, c4792, c22897, false);
            } else {
                int iM19879 = m19879(i2, c4792, c22897, true);
                i3 = i2 + iM19879;
                i4 = i + iM19879;
                iM19868 = m19868(i4, c4792, c22897, false);
            }
            i2 = i3 + iM19868;
            i = i4 + iM19868;
        }
        m19875(c4792, c22897, i2, i);
        if (!c22897.f72063) {
            this.mOrientationHelper.m9568();
        } else {
            this.mAnchorInfo.m40753();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // p067l.AbstractC18873
    public void onLayoutCompleted(C22897 c22897) {
        super.onLayoutCompleted(c22897);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m40753();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19884(C4792 c4792, C22897 c22897, C17928 c17928) {
        if (m19878(c22897, c17928) || m19877(c4792, c22897, c17928)) {
            return;
        }
        c17928.m40751();
        c17928.f53540 = this.mStackFromEnd ? c22897.m51124() - 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m19877(C4792 c4792, C22897 c22897, C17928 c17928) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() != 0) {
            View focusedChild = getFocusedChild();
            if (focusedChild != null) {
                c17928.getClass();
                C16190 c16190 = (C16190) focusedChild.getLayoutParams();
                if (!c16190.f47660.isRemoved() && c16190.f47660.getLayoutPosition() >= 0 && c16190.f47660.getLayoutPosition() < c22897.m51124()) {
                    c17928.m40754(getPosition(focusedChild), focusedChild);
                    return true;
                }
            }
            boolean z2 = this.mLastStackFromEnd;
            boolean z3 = this.mStackFromEnd;
            if (z2 == z3 && (viewFindReferenceChild = findReferenceChild(c4792, c22897, c17928.f53537, z3)) != null) {
                c17928.m40752(getPosition(viewFindReferenceChild), viewFindReferenceChild);
                if (!c22897.f72063 && supportsPredictiveItemAnimations()) {
                    int iMo9567 = this.mOrientationHelper.mo9567(viewFindReferenceChild);
                    int iMo9555 = this.mOrientationHelper.mo9555(viewFindReferenceChild);
                    int iMo9560 = this.mOrientationHelper.mo9560();
                    int iMo9558 = this.mOrientationHelper.mo9558();
                    boolean z4 = iMo9555 <= iMo9560 && iMo9567 < iMo9560;
                    if (iMo9567 >= iMo9558 && iMo9555 > iMo9558) {
                        z = true;
                    }
                    if (z4 || z) {
                        if (c17928.f53537) {
                            iMo9560 = iMo9558;
                        }
                        c17928.f53536 = iMo9560;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m19868(int i, C4792 c4792, C22897 c22897, boolean z) {
        int iMo9558;
        int iMo9559 = this.mOrientationHelper.mo9558() - i;
        if (iMo9559 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo9559, c4792, c22897);
        int i3 = i + i2;
        if (!z || (iMo9558 = this.mOrientationHelper.mo9558() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo9556(iMo9558);
        return iMo9558 + i2;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m19879(int i, C4792 c4792, C22897 c22897, boolean z) {
        int iMo9560;
        int iMo9561 = i - this.mOrientationHelper.mo9560();
        if (iMo9561 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo9561, c4792, c22897);
        int i3 = i + i2;
        if (!z || (iMo9560 = i3 - this.mOrientationHelper.mo9560()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo9556(-iMo9560);
        return i2 - iMo9560;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19876(C17928 c17928) {
        m19871(c17928.f53540, c17928.f53536);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19871(int i, int i2) {
        this.mLayoutState.f55537 = this.mOrientationHelper.mo9558() - i2;
        C18599 c18599 = this.mLayoutState;
        c18599.f55545 = this.mShouldReverseLayout ? -1 : 1;
        c18599.f55541 = i;
        c18599.f55548 = 1;
        c18599.f55547 = i2;
        c18599.f55543 = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19885(C17928 c17928) {
        m19882(c17928.f53540, c17928.f53536);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19882(int i, int i2) {
        this.mLayoutState.f55537 = i2 - this.mOrientationHelper.mo9560();
        C18599 c18599 = this.mLayoutState;
        c18599.f55541 = i;
        c18599.f55545 = this.mShouldReverseLayout ? 1 : -1;
        c18599.f55548 = -1;
        c18599.f55547 = i2;
        c18599.f55543 = Integer.MIN_VALUE;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public C18599 createLayoutState() {
        C18599 c18599 = new C18599();
        c18599.f55540 = true;
        c18599.f55544 = 0;
        c18599.f55538 = 0;
        c18599.f55539 = null;
        return c18599;
    }

    @Override // p067l.AbstractC18873
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C24634 c24634 = this.mPendingSavedState;
        if (c24634 != null) {
            c24634.f77974 = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        C24634 c24634 = this.mPendingSavedState;
        if (c24634 != null) {
            c24634.f77974 = -1;
        }
        requestLayout();
    }

    @Override // p067l.AbstractC18873
    public int scrollHorizontallyBy(int i, C4792 c4792, C22897 c22897) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c4792, c22897);
    }

    @Override // p067l.AbstractC18873
    public int scrollVerticallyBy(int i, C4792 c4792, C22897 c22897) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c4792, c22897);
    }

    @Override // p067l.AbstractC18873
    public int computeHorizontalScrollOffset(C22897 c22897) {
        return m19880(c22897);
    }

    @Override // p067l.AbstractC18873
    public int computeVerticalScrollOffset(C22897 c22897) {
        return m19880(c22897);
    }

    @Override // p067l.AbstractC18873
    public int computeHorizontalScrollExtent(C22897 c22897) {
        return m19869(c22897);
    }

    @Override // p067l.AbstractC18873
    public int computeVerticalScrollExtent(C22897 c22897) {
        return m19869(c22897);
    }

    @Override // p067l.AbstractC18873
    public int computeHorizontalScrollRange(C22897 c22897) {
        return m19887(c22897);
    }

    @Override // p067l.AbstractC18873
    public int computeVerticalScrollRange(C22897 c22897) {
        return m19887(c22897);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m19880(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C8144.m18912(c22897, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m19869(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C8144.m18911(c22897, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m19887(C22897 c22897) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C8144.m18913(c22897, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19872(int i, int i2, boolean z, C22897 c22897) {
        int iMo9560;
        this.mLayoutState.f55546 = resolveIsInfinite();
        this.mLayoutState.f55548 = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c22897, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C18599 c18599 = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c18599.f55544 = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c18599.f55538 = iMax;
        if (z2) {
            c18599.f55544 = this.mOrientationHelper.mo9562() + i3;
            View childClosestToEnd = getChildClosestToEnd();
            C18599 c185910 = this.mLayoutState;
            c185910.f55545 = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C18599 c185911 = this.mLayoutState;
            c185910.f55541 = position + c185911.f55545;
            c185911.f55547 = this.mOrientationHelper.mo9555(childClosestToEnd);
            iMo9560 = this.mOrientationHelper.mo9555(childClosestToEnd) - this.mOrientationHelper.mo9558();
        } else {
            View childClosestToStart = getChildClosestToStart();
            C18599 c185912 = this.mLayoutState;
            c185912.f55544 = this.mOrientationHelper.mo9560() + c185912.f55544;
            C18599 c185913 = this.mLayoutState;
            c185913.f55545 = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C18599 c185914 = this.mLayoutState;
            c185913.f55541 = position2 + c185914.f55545;
            c185914.f55547 = this.mOrientationHelper.mo9567(childClosestToStart);
            iMo9560 = (-this.mOrientationHelper.mo9567(childClosestToStart)) + this.mOrientationHelper.mo9560();
        }
        C18599 c185915 = this.mLayoutState;
        c185915.f55537 = i2;
        if (z) {
            c185915.f55537 = i2 - iMo9560;
        }
        c185915.f55543 = iMo9560;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo9566() == 0 && this.mOrientationHelper.mo9554() == 0;
    }

    public void collectPrefetchPositionsForLayoutState(C22897 c22897, C18599 c18599, InterfaceC18202 interfaceC18202) {
        int i = c18599.f55541;
        if (i < 0 || i >= c22897.m51124()) {
            return;
        }
        ((C20652) interfaceC18202).m46667(i, Math.max(0, c18599.f55543));
    }

    @Override // p067l.AbstractC18873
    public void collectInitialPrefetchPositions(int i, InterfaceC18202 interfaceC18202) {
        boolean z;
        int i2;
        C24634 c24634 = this.mPendingSavedState;
        if (c24634 != null && (i2 = c24634.f77974) >= 0) {
            z = c24634.f77975;
        } else {
            m19886();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((C20652) interfaceC18202).m46667(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    @Override // p067l.AbstractC18873
    public void collectAdjacentPrefetchPositions(int i, int i2, C22897 c22897, InterfaceC18202 interfaceC18202) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m19872(i > 0 ? 1 : -1, Math.abs(i), true, c22897);
        collectPrefetchPositionsForLayoutState(c22897, this.mLayoutState, interfaceC18202);
    }

    public int scrollBy(int i, C4792 c4792, C22897 c22897) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f55540 = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m19872(i2, iAbs, true, c22897);
        C18599 c18599 = this.mLayoutState;
        int iFill = c18599.f55543 + fill(c4792, c18599, c22897, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo9556(-i);
        this.mLayoutState.f55542 = i;
        return i;
    }

    @Override // p067l.AbstractC18873
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19873(C4792 c4792, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c4792);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    removeAndRecycleViewAt(i2, c4792);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m19889(C4792 c4792, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo9555(childAt) > i3 || this.mOrientationHelper.mo9565(childAt) > i3) {
                    m19873(c4792, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo9555(childAt2) > i3 || this.mOrientationHelper.mo9565(childAt2) > i3) {
                m19873(c4792, i5, i6);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19883(C4792 c4792, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iMo9554 = (this.mOrientationHelper.mo9554() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo9567(childAt) < iMo9554 || this.mOrientationHelper.mo9561(childAt) < iMo9554) {
                    m19873(c4792, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo9567(childAt2) < iMo9554 || this.mOrientationHelper.mo9561(childAt2) < iMo9554) {
                m19873(c4792, i4, i5);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19874(C4792 c4792, C18599 c18599) {
        if (!c18599.f55540 || c18599.f55546) {
            return;
        }
        int i = c18599.f55543;
        int i2 = c18599.f55538;
        if (c18599.f55548 == -1) {
            m19883(c4792, i, i2);
        } else {
            m19889(c4792, i, i2);
        }
    }

    public int fill(C4792 c4792, C18599 c18599, C22897 c22897, boolean z) {
        int i;
        int i2 = c18599.f55537;
        int i3 = c18599.f55543;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c18599.f55543 = i3 + i2;
            }
            m19874(c4792, c18599);
        }
        int i4 = c18599.f55537 + c18599.f55544;
        C19270 c19270 = this.mLayoutChunkResult;
        while (true) {
            if ((!c18599.f55546 && i4 <= 0) || (i = c18599.f55541) < 0 || i >= c22897.m51124()) {
                break;
            }
            c19270.f57588 = 0;
            c19270.f57589 = false;
            c19270.f57591 = false;
            c19270.f57590 = false;
            layoutChunk(c4792, c22897, c18599, c19270);
            if (!c19270.f57589) {
                int i5 = c18599.f55547;
                int i6 = c19270.f57588;
                c18599.f55547 = (c18599.f55548 * i6) + i5;
                if (!c19270.f57591 || c18599.f55539 != null || !c22897.f72063) {
                    c18599.f55537 -= i6;
                    i4 -= i6;
                }
                int i7 = c18599.f55543;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c18599.f55543 = i8;
                    int i9 = c18599.f55537;
                    if (i9 < 0) {
                        c18599.f55543 = i8 + i9;
                    }
                    m19874(c4792, c18599);
                }
                if (z && c19270.f57590) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c18599.f55537;
    }

    public void layoutChunk(C4792 c4792, C22897 c22897, C18599 c18599, C19270 c19270) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int paddingLeft;
        int iMo9563;
        int i6;
        int i7;
        View viewM42323 = c18599.m42323(c4792);
        if (viewM42323 == null) {
            c19270.f57589 = true;
            return;
        }
        C16190 c16190 = (C16190) viewM42323.getLayoutParams();
        if (c18599.f55539 == null) {
            if (this.mShouldReverseLayout == (c18599.f55548 == -1)) {
                addView(viewM42323);
            } else {
                addView(viewM42323, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c18599.f55548 == -1)) {
                addDisappearingView(viewM42323);
            } else {
                addDisappearingView(viewM42323, 0);
            }
        }
        measureChildWithMargins(viewM42323, 0, 0);
        c19270.f57588 = this.mOrientationHelper.mo9559(viewM42323);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo9563 = getWidth() - getPaddingRight();
                paddingLeft = iMo9563 - this.mOrientationHelper.mo9563(viewM42323);
            } else {
                paddingLeft = getPaddingLeft();
                iMo9563 = this.mOrientationHelper.mo9563(viewM42323) + paddingLeft;
            }
            if (c18599.f55548 == -1) {
                i7 = c18599.f55547;
                i6 = i7 - c19270.f57588;
            } else {
                i6 = c18599.f55547;
                i7 = c19270.f57588 + i6;
            }
            i5 = i7;
            i3 = iMo9563;
            i4 = i6;
        } else {
            int paddingTop = getPaddingTop();
            int iMo9564 = this.mOrientationHelper.mo9563(viewM42323) + paddingTop;
            if (c18599.f55548 == -1) {
                i2 = c18599.f55547;
                i = i2 - c19270.f57588;
            } else {
                i = c18599.f55547;
                i2 = c19270.f57588 + i;
            }
            i3 = i2;
            i4 = paddingTop;
            i5 = iMo9564;
            paddingLeft = i;
        }
        layoutDecoratedWithMargins(viewM42323, paddingLeft, i4, i3, i5);
        if (c16190.f47660.isRemoved() || c16190.f47660.isUpdated()) {
            c19270.f57591 = true;
        }
        c19270.f57590 = viewM42323.hasFocusable();
    }

    @Override // p067l.AbstractC18873
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
    public View findReferenceChild(C4792 c4792, C22897 c22897, boolean z, boolean z2) {
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
        int iM51124 = c22897.m51124();
        int iMo9560 = this.mOrientationHelper.mo9560();
        int iMo9558 = this.mOrientationHelper.mo9558();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i2) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo9567 = this.mOrientationHelper.mo9567(childAt);
            int iMo9555 = this.mOrientationHelper.mo9555(childAt);
            if (position >= 0 && position < iM51124) {
                if (!((C16190) childAt.getLayoutParams()).f47660.isRemoved()) {
                    boolean z3 = iMo9555 <= iMo9560 && iMo9567 < iMo9560;
                    boolean z4 = iMo9567 >= iMo9558 && iMo9555 > iMo9558;
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

    /* JADX INFO: renamed from: ܽ */
    private View m19888() {
        return this.mShouldReverseLayout ? m19870() : m19881();
    }

    /* JADX INFO: renamed from: ᩳ */
    private View m19891() {
        return this.mShouldReverseLayout ? m19881() : m19870();
    }

    /* JADX INFO: renamed from: ֫ */
    private View m19870() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    /* JADX INFO: renamed from: ۧ */
    private View m19881() {
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
            return this.mHorizontalBoundCheck.m10074(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m10074(i, i2, i3, i4);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo9567(getChildAt(i)) < this.mOrientationHelper.mo9560()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = C0719o.a.f2895a;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.m10074(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.m10074(i, i2, i3, i4);
    }

    @Override // p067l.AbstractC18873
    public View onFocusSearchFailed(View view, int i, C4792 c4792, C22897 c22897) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewM19888;
        View childClosestToEnd;
        m19886();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        m19872(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo9569() * 0.33333334f), false, c22897);
        C18599 c18599 = this.mLayoutState;
        c18599.f55543 = Integer.MIN_VALUE;
        c18599.f55540 = false;
        fill(c4792, c18599, c22897, true);
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            viewM19888 = m19891();
        } else {
            viewM19888 = m19888();
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (!childClosestToEnd.hasFocusable()) {
            return viewM19888;
        }
        if (viewM19888 == null) {
            return null;
        }
        return childClosestToEnd;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m19890() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo9567(childAt);
        }
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo9567 = this.mOrientationHelper.mo9567(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo9568 = this.mOrientationHelper.mo9567(childAt);
                if (position2 < position) {
                    m19890();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo9568 < iMo9567);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo9568 > iMo9567) {
                    m19890();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo9569 = this.mOrientationHelper.mo9567(childAt2);
            if (position3 < position) {
                m19890();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo9569 < iMo9567);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo9569 < iMo9567) {
                m19890();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // p067l.AbstractC18873
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    @Override // p067l.InterfaceC9251
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m19886();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo9558() - (this.mOrientationHelper.mo9559(view) + this.mOrientationHelper.mo9567(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo9558() - this.mOrientationHelper.mo9555(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo9567(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo9555(view2) - this.mOrientationHelper.mo9559(view));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m19878(C22897 c22897, C17928 c17928) {
        int i;
        int iMo9567;
        if (!c22897.f72063 && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= c22897.m51124()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                int i2 = this.mPendingScrollPosition;
                c17928.f53540 = i2;
                C24634 c24634 = this.mPendingSavedState;
                if (c24634 != null && c24634.f77974 >= 0) {
                    boolean z = c24634.f77975;
                    c17928.f53537 = z;
                    if (z) {
                        c17928.f53536 = this.mOrientationHelper.mo9558() - this.mPendingSavedState.f77976;
                        return true;
                    }
                    c17928.f53536 = this.mOrientationHelper.mo9560() + this.mPendingSavedState.f77976;
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition = findViewByPosition(i2);
                    if (viewFindViewByPosition != null) {
                        if (this.mOrientationHelper.mo9559(viewFindViewByPosition) > this.mOrientationHelper.mo9569()) {
                            c17928.m40751();
                            return true;
                        }
                        if (this.mOrientationHelper.mo9567(viewFindViewByPosition) - this.mOrientationHelper.mo9560() < 0) {
                            c17928.f53536 = this.mOrientationHelper.mo9560();
                            c17928.f53537 = false;
                            return true;
                        }
                        if (this.mOrientationHelper.mo9558() - this.mOrientationHelper.mo9555(viewFindViewByPosition) < 0) {
                            c17928.f53536 = this.mOrientationHelper.mo9558();
                            c17928.f53537 = true;
                            return true;
                        }
                        if (c17928.f53537) {
                            iMo9567 = this.mOrientationHelper.m9557() + this.mOrientationHelper.mo9555(viewFindViewByPosition);
                        } else {
                            iMo9567 = this.mOrientationHelper.mo9567(viewFindViewByPosition);
                        }
                        c17928.f53536 = iMo9567;
                        return true;
                    }
                    if (getChildCount() > 0) {
                        c17928.f53537 = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c17928.m40751();
                    return true;
                }
                boolean z2 = this.mShouldReverseLayout;
                c17928.f53537 = z2;
                if (z2) {
                    c17928.f53536 = this.mOrientationHelper.mo9558() - this.mPendingScrollPositionOffset;
                    return true;
                }
                c17928.f53536 = this.mOrientationHelper.mo9560() + this.mPendingScrollPositionOffset;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19875(C4792 c4792, C22897 c22897, int i, int i2) {
        if (!c22897.f72058 || getChildCount() == 0 || c22897.f72063 || !supportsPredictiveItemAnimations()) {
            return;
        }
        List listM10107 = c4792.m10107();
        int size = listM10107.size();
        int position = getPosition(getChildAt(0));
        int iMo9559 = 0;
        int iMo95510 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC5462 abstractC5462 = (AbstractC5462) listM10107.get(i3);
            if (!abstractC5462.isRemoved()) {
                if ((abstractC5462.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    iMo9559 += this.mOrientationHelper.mo9559(abstractC5462.itemView);
                } else {
                    iMo95510 += this.mOrientationHelper.mo9559(abstractC5462.itemView);
                }
            }
        }
        this.mLayoutState.f55539 = listM10107;
        if (iMo9559 > 0) {
            m19882(getPosition(getChildClosestToStart()), i);
            C18599 c18599 = this.mLayoutState;
            c18599.f55544 = iMo9559;
            c18599.f55537 = 0;
            c18599.m42324((View) null);
            fill(c4792, this.mLayoutState, c22897, false);
        }
        if (iMo95510 > 0) {
            m19871(getPosition(getChildClosestToEnd()), i2);
            C18599 c185910 = this.mLayoutState;
            c185910.f55544 = iMo95510;
            c185910.f55537 = 0;
            c185910.m42324((View) null);
            fill(c4792, this.mLayoutState, c22897, false);
        }
        this.mLayoutState.f55539 = null;
    }

    @Deprecated
    public int getExtraLayoutSpace(C22897 c22897) {
        if (c22897.f72054 != -1) {
            return this.mOrientationHelper.mo9569();
        }
        return 0;
    }
}
