package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18873 {
    public boolean mAutoMeasure;
    public C23766 mChildHelper;
    public int mHeight;
    public int mHeightMode;
    public C4773 mHorizontalBoundCheck;
    public final InterfaceC17512 mHorizontalBoundCheckCallback;
    public boolean mIsAttachedToWindow;
    public boolean mItemPrefetchEnabled;
    public boolean mMeasurementCacheEnabled;
    public int mPrefetchMaxCountObserved;
    public boolean mPrefetchMaxObservedInInitialPrefetch;
    public C14849 mRecyclerView;
    public boolean mRequestedSimpleAnimations;
    public AbstractC16860 mSmoothScroller;
    public C4773 mVerticalBoundCheck;
    public final InterfaceC17512 mVerticalBoundCheckCallback;
    public int mWidth;
    public int mWidthMode;

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(C16190 c16190) {
        return c16190 != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C22897 c22897, InterfaceC18202 interfaceC18202) {
    }

    public void collectInitialPrefetchPositions(int i, InterfaceC18202 interfaceC18202) {
    }

    public int computeHorizontalScrollExtent(C22897 c22897) {
        return 0;
    }

    public int computeHorizontalScrollOffset(C22897 c22897) {
        return 0;
    }

    public int computeHorizontalScrollRange(C22897 c22897) {
        return 0;
    }

    public int computeVerticalScrollExtent(C22897 c22897) {
        return 0;
    }

    public int computeVerticalScrollOffset(C22897 c22897) {
        return 0;
    }

    public int computeVerticalScrollRange(C22897 c22897) {
        return 0;
    }

    public abstract C16190 generateDefaultLayoutParams();

    public int getBaseline() {
        return -1;
    }

    public int getColumnCountForAccessibility(C4792 c4792, C22897 c22897) {
        return -1;
    }

    public int getRowCountForAccessibility(C4792 c4792, C22897 c22897) {
        return -1;
    }

    public int getSelectionModeForAccessibility(C4792 c4792, C22897 c22897) {
        return 0;
    }

    public boolean isLayoutHierarchical(C4792 c4792, C22897 c22897) {
        return false;
    }

    public void onAdapterChanged(AbstractC21283 abstractC21283, AbstractC21283 abstractC21284) {
    }

    public boolean onAddFocusables(C14849 c14849, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow(C14849 c14849) {
    }

    @Deprecated
    public void onDetachedFromWindow(C14849 c14849) {
    }

    public View onFocusSearchFailed(View view, int i, C4792 c4792, C22897 c22897) {
        return null;
    }

    public void onInitializeAccessibilityNodeInfoForItem(C4792 c4792, C22897 c22897, View view, C1555 c1555) {
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsAdded(C14849 c14849, int i, int i2) {
    }

    public void onItemsChanged(C14849 c14849) {
    }

    public void onItemsMoved(C14849 c14849, int i, int i2, int i3) {
    }

    public void onItemsRemoved(C14849 c14849, int i, int i2) {
    }

    public void onItemsUpdated(C14849 c14849, int i, int i2) {
    }

    public void onLayoutChildren(C4792 c4792, C22897 c22897) {
    }

    public void onLayoutCompleted(C22897 c22897) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public boolean performAccessibilityActionForItem(C4792 c4792, C22897 c22897, View view, int i, Bundle bundle) {
        return false;
    }

    public int scrollHorizontallyBy(int i, C4792 c4792, C22897 c22897) {
        return 0;
    }

    public int scrollVerticallyBy(int i, C4792 c4792, C22897 c22897) {
        return 0;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public void smoothScrollToPosition(C14849 c14849, C22897 c22897, int i) {
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void removeAndRecycleScrapInt(C4792 c4792) {
        ArrayList arrayList = c4792.f10865;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC5462) arrayList.get(i)).itemView;
            AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
            if (!abstractC5462M33925.shouldIgnore()) {
                abstractC5462M33925.setIsRecyclable(false);
                if (abstractC5462M33925.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                AbstractC23964 abstractC23964 = this.mRecyclerView.mItemAnimator;
                if (abstractC23964 != null) {
                    abstractC23964.mo22576(abstractC5462M33925);
                }
                abstractC5462M33925.setIsRecyclable(true);
                AbstractC5462 abstractC5462M33926 = C14849.m33925(view);
                abstractC5462M33926.mScrapContainer = null;
                abstractC5462M33926.mInChangeScrap = false;
                abstractC5462M33926.clearReturnedFromScrapFlag();
                c4792.m10102(abstractC5462M33926);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c4792.f10869;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public AbstractC18873() {
        C4121 c4121 = new C4121(this);
        this.mHorizontalBoundCheckCallback = c4121;
        C12839 c12839 = new C12839(this);
        this.mVerticalBoundCheckCallback = c12839;
        this.mHorizontalBoundCheck = new C4773(c4121);
        this.mVerticalBoundCheck = new C4773(c12839);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public void setRecyclerView(C14849 c14849) {
        if (c14849 == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = c14849;
            this.mChildHelper = c14849.mChildHelper;
            this.mWidth = c14849.getWidth();
            this.mHeight = c14849.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !C14849.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 != 0 || C14849.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimensionFromChildren(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.mRecyclerView.mTempRect.set(i5, i6, i3, i4);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        setMeasuredDimension(m42942(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), m42942(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void requestLayout() {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            c14849.requestLayout();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            c14849.assertInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42942(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public void assertNotInLayoutOrScroll(String str) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            c14849.assertNotInLayoutOrScroll(str);
        }
    }

    @Deprecated
    public void setAutoMeasureEnabled(boolean z) {
        this.mAutoMeasure = z;
    }

    public boolean isAutoMeasureEnabled() {
        return this.mAutoMeasure;
    }

    public final void setItemPrefetchEnabled(boolean z) {
        if (z != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z;
            this.mPrefetchMaxCountObserved = 0;
            C14849 c14849 = this.mRecyclerView;
            if (c14849 != null) {
                c14849.mRecycler.m10110();
            }
        }
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public void dispatchAttachedToWindow(C14849 c14849) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(c14849);
    }

    public void dispatchDetachedFromWindow(C14849 c14849, C4792 c4792) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(c14849, c4792);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public void postOnAnimation(Runnable runnable) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            int i = C1717.f57146;
            c14849.postOnAnimation(runnable);
        }
    }

    public boolean removeCallbacks(Runnable runnable) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            return c14849.removeCallbacks(runnable);
        }
        return false;
    }

    public void onDetachedFromWindow(C14849 c14849, C4792 c4792) {
        onDetachedFromWindow(c14849);
    }

    public boolean getClipToPadding() {
        C14849 c14849 = this.mRecyclerView;
        return c14849 != null && c14849.mClipToPadding;
    }

    public C16190 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C16190) {
            return new C16190((C16190) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16190((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16190(layoutParams);
    }

    public C16190 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C16190(context, attributeSet);
    }

    public void scrollToPosition(int i) {
        int i2 = C14849.HORIZONTAL;
    }

    public void startSmoothScroll(AbstractC16860 abstractC16860) {
        AbstractC16860 abstractC16861 = this.mSmoothScroller;
        if (abstractC16861 != null && abstractC16860 != abstractC16861 && abstractC16861.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = abstractC16860;
        abstractC16860.start(this.mRecyclerView, this);
    }

    public boolean isSmoothScrolling() {
        AbstractC16860 abstractC16860 = this.mSmoothScroller;
        return abstractC16860 != null && abstractC16860.isRunning();
    }

    public int getLayoutDirection() {
        C14849 c14849 = this.mRecyclerView;
        int i = C1717.f57146;
        return c14849.getLayoutDirection();
    }

    public void endAnimation(View view) {
        AbstractC23964 abstractC23964 = this.mRecyclerView.mItemAnimator;
        if (abstractC23964 != null) {
            abstractC23964.mo22576(C14849.m33925(view));
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addDisappearingView(View view, int i) {
        m42947(view, i, true);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void addView(View view, int i) {
        m42947(view, i, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42947(View view, int i, boolean z) {
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        if (z || abstractC5462M33925.isRemoved()) {
            C1012 c1012 = this.mRecyclerView.mViewInfoStore.f65553;
            C6114 c6114M13913 = (C6114) c1012.getOrDefault(abstractC5462M33925, null);
            if (c6114M13913 == null) {
                c6114M13913 = C6114.m13913();
                c1012.put(abstractC5462M33925, c6114M13913);
            }
            c6114M13913.f15367 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m47162(abstractC5462M33925);
        }
        C16190 c16190 = (C16190) view.getLayoutParams();
        if (abstractC5462M33925.wasReturnedFromScrap() || abstractC5462M33925.isScrap()) {
            if (abstractC5462M33925.isScrap()) {
                abstractC5462M33925.unScrap();
            } else {
                abstractC5462M33925.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.m52814(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iM52817 = this.mChildHelper.m52817(view);
            if (i == -1) {
                i = this.mChildHelper.m52811();
            }
            if (iM52817 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
            }
            if (iM52817 != i) {
                this.mRecyclerView.mLayout.moveView(iM52817, i);
            }
        } else {
            this.mChildHelper.m52815(view, i, false);
            c16190.f47658 = true;
            AbstractC16860 abstractC16860 = this.mSmoothScroller;
            if (abstractC16860 != null && abstractC16860.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (c16190.f47659) {
            if (C14849.sVerboseLoggingEnabled) {
                C12826.toString(c16190.f47660);
            }
            abstractC5462M33925.itemView.invalidate();
            c16190.f47659 = false;
        }
    }

    public void removeView(View view) {
        this.mChildHelper.m52820(view);
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.m52822(i);
        }
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                this.mChildHelper.m52822(childCount);
            }
        }
    }

    public int getPosition(View view) {
        return ((C16190) view.getLayoutParams()).f47660.getLayoutPosition();
    }

    public int getItemViewType(View view) {
        return C14849.m33925(view).getItemViewType();
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        C14849 c14849 = this.mRecyclerView;
        if (c14849 == null || (viewFindContainingItemView = c14849.findContainingItemView(view)) == null || this.mChildHelper.f75584.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC5462 abstractC5462M33925 = C14849.m33925(childAt);
            if (abstractC5462M33925 != null && abstractC5462M33925.getLayoutPosition() == i && !abstractC5462M33925.shouldIgnore() && (this.mRecyclerView.mState.f72063 || !abstractC5462M33925.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public void detachView(View view) {
        int iM52817 = this.mChildHelper.m52817(view);
        if (iM52817 >= 0) {
            m42946(iM52817, view);
        }
    }

    public void detachViewAt(int i) {
        m42946(i, getChildAt(i));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42946(int i, View view) {
        this.mChildHelper.m52812(i);
    }

    public void attachView(View view, int i, C16190 c16190) {
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        if (abstractC5462M33925.isRemoved()) {
            C1012 c1012 = this.mRecyclerView.mViewInfoStore.f65553;
            C6114 c6114M13913 = (C6114) c1012.getOrDefault(abstractC5462M33925, null);
            if (c6114M13913 == null) {
                c6114M13913 = C6114.m13913();
                c1012.put(abstractC5462M33925, c6114M13913);
            }
            c6114M13913.f15367 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m47162(abstractC5462M33925);
        }
        this.mChildHelper.m52814(view, i, c16190, abstractC5462M33925.isRemoved());
    }

    public void attachView(View view, int i) {
        attachView(view, i, (C16190) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    public void moveView(int i, int i2) {
        View childAt = getChildAt(i);
        if (childAt == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }
        detachViewAt(i);
        attachView(childAt, i2);
    }

    public void detachAndScrapView(View view, C4792 c4792) {
        m42948(c4792, this.mChildHelper.m52817(view), view);
    }

    public void detachAndScrapViewAt(int i, C4792 c4792) {
        m42948(c4792, i, getChildAt(i));
    }

    public void removeAndRecycleView(View view, C4792 c4792) {
        removeView(view);
        c4792.m10101(view);
    }

    public void removeAndRecycleViewAt(int i, C4792 c4792) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        c4792.m10101(childAt);
    }

    public int getChildCount() {
        C23766 c23766 = this.mChildHelper;
        if (c23766 != null) {
            return c23766.m52811();
        }
        return 0;
    }

    public View getChildAt(int i) {
        C23766 c23766 = this.mChildHelper;
        if (c23766 != null) {
            return c23766.m52818(i);
        }
        return null;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getPaddingLeft() {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            return c14849.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingTop() {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            return c14849.getPaddingTop();
        }
        return 0;
    }

    public int getPaddingRight() {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            return c14849.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingBottom() {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            return c14849.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingStart() {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 == null) {
            return 0;
        }
        int i = C1717.f57146;
        return c14849.getPaddingStart();
    }

    public int getPaddingEnd() {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 == null) {
            return 0;
        }
        int i = C1717.f57146;
        return c14849.getPaddingEnd();
    }

    public boolean isFocused() {
        C14849 c14849 = this.mRecyclerView;
        return c14849 != null && c14849.isFocused();
    }

    public boolean hasFocus() {
        C14849 c14849 = this.mRecyclerView;
        return c14849 != null && c14849.hasFocus();
    }

    public View getFocusedChild() {
        View focusedChild;
        C14849 c14849 = this.mRecyclerView;
        if (c14849 == null || (focusedChild = c14849.getFocusedChild()) == null || this.mChildHelper.f75584.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getItemCount() {
        C14849 c14849 = this.mRecyclerView;
        AbstractC21283 adapter = c14849 != null ? c14849.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public void offsetChildrenHorizontal(int i) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            c14849.offsetChildrenHorizontal(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 != null) {
            c14849.offsetChildrenVertical(i);
        }
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        C14849 c14849 = this.mRecyclerView;
        if (parent != c14849 || c14849.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
        }
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        abstractC5462M33925.addFlags(128);
        this.mRecyclerView.mViewInfoStore.m47163(abstractC5462M33925);
    }

    public void stopIgnoringView(View view) {
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        abstractC5462M33925.stopIgnoring();
        abstractC5462M33925.resetInternal();
        abstractC5462M33925.addFlags(4);
    }

    public void detachAndScrapAttachedViews(C4792 c4792) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                m42948(c4792, childCount, getChildAt(childCount));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42948(C4792 c4792, int i, View view) {
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        if (abstractC5462M33925.shouldIgnore()) {
            if (C14849.sVerboseLoggingEnabled) {
                abstractC5462M33925.toString();
            }
        } else if (abstractC5462M33925.isInvalid() && !abstractC5462M33925.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i);
            c4792.m10102(abstractC5462M33925);
        } else {
            detachViewAt(i);
            c4792.m10108(view);
            this.mRecyclerView.mViewInfoStore.m47162(abstractC5462M33925);
        }
    }

    public void measureChild(View view, int i, int i2) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM42943 = m42943(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) c16190).width, canScrollHorizontally());
        int iM42944 = m42943(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) c16190).height, canScrollVertically());
        if (shouldMeasureChild(view, iM42943, iM42944, c16190)) {
            view.measure(iM42943, iM42944);
        }
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, C16190 c16190) {
        return (this.mMeasurementCacheEnabled && m42951(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c16190).width) && m42951(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c16190).height)) ? false : true;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, C16190 c16190) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m42951(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c16190).width) && m42951(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c16190).height)) ? false : true;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m42951(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM42943 = m42943(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c16190).leftMargin + ((ViewGroup.MarginLayoutParams) c16190).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c16190).width, canScrollHorizontally());
        int iM42944 = m42943(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c16190).topMargin + ((ViewGroup.MarginLayoutParams) c16190).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c16190).height, canScrollVertically());
        if (shouldMeasureChild(view, iM42943, iM42944, c16190)) {
            view.measure(iM42943, iM42944);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static int m42944(int i, int i2, int i3, boolean z) {
        int i4 = i - i2;
        int i5 = 0;
        int iMax = Math.max(0, i4);
        if (z) {
            if (i3 >= 0) {
                i5 = 1073741824;
            } else {
                i3 = 0;
            }
        } else if (i3 >= 0) {
            i5 = 1073741824;
        } else {
            if (i3 == -1) {
                i5 = 1073741824;
            } else if (i3 == -2) {
                i5 = Integer.MIN_VALUE;
            } else {
                i3 = 0;
            }
            i3 = iMax;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, i5);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    /* JADX INFO: renamed from: ֫ */
    public static int m42943(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i5 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i5 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
                i5 = i2;
            }
        } else if (i4 >= 0) {
            i5 = 1073741824;
        } else {
            if (i4 != -1) {
                if (i4 == -2) {
                    i2 = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
            }
            i4 = iMax;
            i5 = i2;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i5);
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((C16190) view.getLayoutParams()).f47657;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((C16190) view.getLayoutParams()).f47657;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((C16190) view.getLayoutParams()).f47657;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        C16190 c16190 = (C16190) view.getLayoutParams();
        Rect rect = c16190.f47657;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c16190).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c16190).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c16190).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c16190).bottomMargin);
    }

    public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C16190) view.getLayoutParams()).f47657;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        C14849.m33902(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(c14849.getItemDecorInsetsForChild(view));
        }
    }

    public int getTopDecorationHeight(View view) {
        return ((C16190) view.getLayoutParams()).f47657.top;
    }

    public int getBottomDecorationHeight(View view) {
        return ((C16190) view.getLayoutParams()).f47657.bottom;
    }

    public int getLeftDecorationWidth(View view) {
        return ((C16190) view.getLayoutParams()).f47657.left;
    }

    public int getRightDecorationWidth(View view) {
        return ((C16190) view.getLayoutParams()).f47657.right;
    }

    /* JADX INFO: renamed from: ֫ */
    private int[] m42950(View view, Rect rect) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - width;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - height);
        if (getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        return new int[]{iMax, iMin2};
    }

    public boolean requestChildRectangleOnScreen(C14849 c14849, View view, Rect rect, boolean z) {
        return requestChildRectangleOnScreen(c14849, view, rect, z, false);
    }

    public boolean requestChildRectangleOnScreen(C14849 c14849, View view, Rect rect, boolean z, boolean z2) {
        int[] iArrM42950 = m42950(view, rect);
        int i = iArrM42950[0];
        int i2 = iArrM42950[1];
        if ((z2 && !m42949(c14849, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            c14849.scrollBy(i, i2);
        } else {
            c14849.smoothScrollBy(i, i2);
        }
        return true;
    }

    public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.m10075(view) && this.mVerticalBoundCheck.m10075(view);
        return z ? z3 : !z3;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42949(C14849 c14849, int i, int i2) {
        View focusedChild = c14849.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Rect rect = this.mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(focusedChild, rect);
        return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
    }

    @Deprecated
    public boolean onRequestChildFocus(C14849 c14849, View view, View view2) {
        return isSmoothScrolling() || c14849.isComputingLayout();
    }

    public boolean onRequestChildFocus(C14849 c14849, C22897 c22897, View view, View view2) {
        return onRequestChildFocus(c14849, view, view2);
    }

    public void onItemsUpdated(C14849 c14849, int i, int i2, Object obj) {
        onItemsUpdated(c14849, i, i2);
    }

    public void onMeasure(C4792 c4792, C22897 c22897, int i, int i2) {
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    public int getMinimumWidth() {
        C14849 c14849 = this.mRecyclerView;
        int i = C1717.f57146;
        return c14849.getMinimumWidth();
    }

    public int getMinimumHeight() {
        C14849 c14849 = this.mRecyclerView;
        int i = C1717.f57146;
        return c14849.getMinimumHeight();
    }

    public void stopSmoothScroller() {
        AbstractC16860 abstractC16860 = this.mSmoothScroller;
        if (abstractC16860 != null) {
            abstractC16860.stop();
        }
    }

    public void onSmoothScrollerStopped(AbstractC16860 abstractC16860) {
        if (this.mSmoothScroller == abstractC16860) {
            this.mSmoothScroller = null;
        }
    }

    public void removeAndRecycleAllViews(C4792 c4792) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            if (!C14849.m33925(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c4792);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(C1555 c1555) {
        C14849 c14849 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(c14849.mRecycler, c14849.mState, c1555);
    }

    public void onInitializeAccessibilityNodeInfo(C4792 c4792, C22897 c22897, C1555 c1555) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            c1555.m36408(8192);
            c1555.m36446(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            c1555.m36408(4096);
            c1555.m36446(true);
        }
        c1555.m36417(C1660.m41076(getRowCountForAccessibility(c4792, c22897), getColumnCountForAccessibility(c4792, c22897), getSelectionModeForAccessibility(c4792, c22897), isLayoutHierarchical(c4792, c22897)));
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C14849 c14849 = this.mRecyclerView;
        onInitializeAccessibilityEvent(c14849.mRecycler, c14849.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(C4792 c4792, C22897 c22897, AccessibilityEvent accessibilityEvent) {
        C14849 c14849 = this.mRecyclerView;
        if (c14849 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!c14849.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC21283 abstractC21283 = this.mRecyclerView.mAdapter;
        if (abstractC21283 != null) {
            accessibilityEvent.setItemCount(abstractC21283.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C1555 c1555) {
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        if (abstractC5462M33925 == null || abstractC5462M33925.isRemoved()) {
            return;
        }
        C23766 c23766 = this.mChildHelper;
        if (c23766.f75584.contains(abstractC5462M33925.itemView)) {
            return;
        }
        C14849 c14849 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(c14849.mRecycler, c14849.mState, view, c1555);
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        C14849 c14849 = this.mRecyclerView;
        return performAccessibilityAction(c14849.mRecycler, c14849.mState, i, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[PHI: r10
      0x0095: PHI (r10v9 int) = (r10v5 int), (r10v13 int) binds: [B:27:0x0084, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean performAccessibilityAction(C4792 c4792, C22897 c22897, int i, Bundle bundle) {
        int paddingTop;
        int i2;
        int paddingLeft;
        int i3;
        int i4;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                i2 = paddingTop;
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i4 = paddingLeft;
                i3 = i2;
            } else {
                i3 = paddingTop;
                i4 = 0;
            }
        } else if (i != 8192) {
            i4 = 0;
            i3 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                i2 = paddingTop;
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i4 = paddingLeft;
                i3 = i2;
            } else {
                i3 = paddingTop;
                i4 = 0;
            }
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i4, i3, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        C14849 c14849 = this.mRecyclerView;
        return performAccessibilityActionForItem(c14849.mRecycler, c14849.mState, view, i, bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19544 m42945(Context context, AttributeSet attributeSet, int i, int i2) {
        C19544 c19544 = new C19544();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2978.f5261, i, i2);
        c19544.f59495 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c19544.f59497 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c19544.f59496 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c19544.f59498 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c19544;
    }

    public void setExactMeasureSpecsFrom(C14849 c14849) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(c14849.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c14849.getHeight(), 1073741824));
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }
}
