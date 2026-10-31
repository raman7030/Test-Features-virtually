package l;

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
public abstract class AbstractC17366 {
    public boolean mAutoMeasure;
    public C22514 mChildHelper;
    public int mHeight;
    public int mHeightMode;
    public C2530 mHorizontalBoundCheck;
    public final InterfaceC15934 mHorizontalBoundCheckCallback;
    public boolean mIsAttachedToWindow;
    public boolean mItemPrefetchEnabled;
    public boolean mMeasurementCacheEnabled;
    public int mPrefetchMaxCountObserved;
    public boolean mPrefetchMaxObservedInInitialPrefetch;
    public C13132 mRecyclerView;
    public boolean mRequestedSimpleAnimations;
    public AbstractC15248 mSmoothScroller;
    public C2530 mVerticalBoundCheck;
    public final InterfaceC15934 mVerticalBoundCheckCallback;
    public int mWidth;
    public int mWidthMode;

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(C14543 c14543) {
        return c14543 != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C21600 c21600, InterfaceC16660 interfaceC16660) {
    }

    public void collectInitialPrefetchPositions(int i, InterfaceC16660 interfaceC16660) {
    }

    public int computeHorizontalScrollExtent(C21600 c21600) {
        return 0;
    }

    public int computeHorizontalScrollOffset(C21600 c21600) {
        return 0;
    }

    public int computeHorizontalScrollRange(C21600 c21600) {
        return 0;
    }

    public int computeVerticalScrollExtent(C21600 c21600) {
        return 0;
    }

    public int computeVerticalScrollOffset(C21600 c21600) {
        return 0;
    }

    public int computeVerticalScrollRange(C21600 c21600) {
        return 0;
    }

    public abstract C14543 generateDefaultLayoutParams();

    public int getBaseline() {
        return -1;
    }

    public int getColumnCountForAccessibility(C2550 c2550, C21600 c21600) {
        return -1;
    }

    public int getRowCountForAccessibility(C2550 c2550, C21600 c21600) {
        return -1;
    }

    public int getSelectionModeForAccessibility(C2550 c2550, C21600 c21600) {
        return 0;
    }

    public boolean isLayoutHierarchical(C2550 c2550, C21600 c21600) {
        return false;
    }

    public void onAdapterChanged(AbstractC19902 abstractC19902, AbstractC19902 abstractC19903) {
    }

    public boolean onAddFocusables(C13132 c13132, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow(C13132 c13132) {
    }

    @Deprecated
    public void onDetachedFromWindow(C13132 c13132) {
    }

    public View onFocusSearchFailed(View view, int i, C2550 c2550, C21600 c21600) {
        return null;
    }

    public void onInitializeAccessibilityNodeInfoForItem(C2550 c2550, C21600 c21600, View view, C14369 c14369) {
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsAdded(C13132 c13132, int i, int i2) {
    }

    public void onItemsChanged(C13132 c13132) {
    }

    public void onItemsMoved(C13132 c13132, int i, int i2, int i3) {
    }

    public void onItemsRemoved(C13132 c13132, int i, int i2) {
    }

    public void onItemsUpdated(C13132 c13132, int i, int i2) {
    }

    public void onLayoutChildren(C2550 c2550, C21600 c21600) {
    }

    public void onLayoutCompleted(C21600 c21600) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public boolean performAccessibilityActionForItem(C2550 c2550, C21600 c21600, View view, int i, Bundle bundle) {
        return false;
    }

    public int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        return 0;
    }

    public int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        return 0;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public void smoothScrollToPosition(C13132 c13132, C21600 c21600, int i) {
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void removeAndRecycleScrapInt(C2550 c2550) {
        ArrayList arrayList = c2550.f8075;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC3255) arrayList.get(i)).itemView;
            AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
            if (!abstractC3255M31833.shouldIgnore()) {
                abstractC3255M31833.setIsRecyclable(false);
                if (abstractC3255M31833.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                AbstractC22723 abstractC22723 = this.mRecyclerView.mItemAnimator;
                if (abstractC22723 != null) {
                    abstractC22723.mo20596(abstractC3255M31833);
                }
                abstractC3255M31833.setIsRecyclable(true);
                AbstractC3255 abstractC3255M31834 = C13132.m31833(view);
                abstractC3255M31834.mScrapContainer = null;
                abstractC3255M31834.mInChangeScrap = false;
                abstractC3255M31834.clearReturnedFromScrapFlag();
                c2550.m8071(abstractC3255M31834);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c2550.f8079;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public AbstractC17366() {
        C1844 c1844 = new C1844(this);
        this.mHorizontalBoundCheckCallback = c1844;
        C11017 c11017 = new C11017(this);
        this.mVerticalBoundCheckCallback = c11017;
        this.mHorizontalBoundCheck = new C2530(c1844);
        this.mVerticalBoundCheck = new C2530(c11017);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public void setRecyclerView(C13132 c13132) {
        if (c13132 == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = c13132;
            this.mChildHelper = c13132.mChildHelper;
            this.mWidth = c13132.getWidth();
            this.mHeight = c13132.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !C13132.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 != 0 || C13132.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
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
        setMeasuredDimension(m40691(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), m40691(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void requestLayout() {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            c13132.requestLayout();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            c13132.assertInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40691(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public void assertNotInLayoutOrScroll(String str) {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            c13132.assertNotInLayoutOrScroll(str);
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
            C13132 c13132 = this.mRecyclerView;
            if (c13132 != null) {
                c13132.mRecycler.m8079();
            }
        }
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public void dispatchAttachedToWindow(C13132 c13132) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(c13132);
    }

    public void dispatchDetachedFromWindow(C13132 c13132, C2550 c2550) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(c13132, c2550);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public void postOnAnimation(Runnable runnable) {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            int i = C17648.f53953;
            c13132.postOnAnimation(runnable);
        }
    }

    public boolean removeCallbacks(Runnable runnable) {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            return c13132.removeCallbacks(runnable);
        }
        return false;
    }

    public void onDetachedFromWindow(C13132 c13132, C2550 c2550) {
        onDetachedFromWindow(c13132);
    }

    public boolean getClipToPadding() {
        C13132 c13132 = this.mRecyclerView;
        return c13132 != null && c13132.mClipToPadding;
    }

    public C14543 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C14543) {
            return new C14543((C14543) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C14543((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C14543(layoutParams);
    }

    public C14543 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C14543(context, attributeSet);
    }

    public void scrollToPosition(int i) {
        int i2 = C13132.HORIZONTAL;
    }

    public void startSmoothScroll(AbstractC15248 abstractC15248) {
        AbstractC15248 abstractC15249 = this.mSmoothScroller;
        if (abstractC15249 != null && abstractC15248 != abstractC15249 && abstractC15249.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = abstractC15248;
        abstractC15248.start(this.mRecyclerView, this);
    }

    public boolean isSmoothScrolling() {
        AbstractC15248 abstractC15248 = this.mSmoothScroller;
        return abstractC15248 != null && abstractC15248.isRunning();
    }

    public int getLayoutDirection() {
        C13132 c13132 = this.mRecyclerView;
        int i = C17648.f53953;
        return c13132.getLayoutDirection();
    }

    public void endAnimation(View view) {
        AbstractC22723 abstractC22723 = this.mRecyclerView.mItemAnimator;
        if (abstractC22723 != null) {
            abstractC22723.mo20596(C13132.m31833(view));
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addDisappearingView(View view, int i) {
        m40696(view, i, true);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void addView(View view, int i) {
        m40696(view, i, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40696(View view, int i, boolean z) {
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        if (z || abstractC3255M31833.isRemoved()) {
            C3432 c3432 = this.mRecyclerView.mViewInfoStore.f62936;
            C3941 c3941M11993 = (C3941) c3432.getOrDefault(abstractC3255M31833, null);
            if (c3941M11993 == null) {
                c3941M11993 = C3941.m11993();
                c3432.put(abstractC3255M31833, c3941M11993);
            }
            c3941M11993.f12559 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m44866(abstractC3255M31833);
        }
        C14543 c14543 = (C14543) view.getLayoutParams();
        if (abstractC3255M31833.wasReturnedFromScrap() || abstractC3255M31833.isScrap()) {
            if (abstractC3255M31833.isScrap()) {
                abstractC3255M31833.unScrap();
            } else {
                abstractC3255M31833.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.m50472(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iM50475 = this.mChildHelper.m50475(view);
            if (i == -1) {
                i = this.mChildHelper.m50469();
            }
            if (iM50475 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
            }
            if (iM50475 != i) {
                this.mRecyclerView.mLayout.moveView(iM50475, i);
            }
        } else {
            this.mChildHelper.m50473(view, i, false);
            c14543.f44552 = true;
            AbstractC15248 abstractC15248 = this.mSmoothScroller;
            if (abstractC15248 != null && abstractC15248.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (c14543.f44553) {
            if (C13132.sVerboseLoggingEnabled) {
                C11003.toString(c14543.f44554);
            }
            abstractC3255M31833.itemView.invalidate();
            c14543.f44553 = false;
        }
    }

    public void removeView(View view) {
        this.mChildHelper.m50478(view);
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.m50480(i);
        }
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                this.mChildHelper.m50480(childCount);
            }
        }
    }

    public int getPosition(View view) {
        return ((C14543) view.getLayoutParams()).f44554.getLayoutPosition();
    }

    public int getItemViewType(View view) {
        return C13132.m31833(view).getItemViewType();
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        C13132 c13132 = this.mRecyclerView;
        if (c13132 == null || (viewFindContainingItemView = c13132.findContainingItemView(view)) == null || this.mChildHelper.f72858.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC3255 abstractC3255M31833 = C13132.m31833(childAt);
            if (abstractC3255M31833 != null && abstractC3255M31833.getLayoutPosition() == i && !abstractC3255M31833.shouldIgnore() && (this.mRecyclerView.mState.f69359 || !abstractC3255M31833.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public void detachView(View view) {
        int iM50475 = this.mChildHelper.m50475(view);
        if (iM50475 >= 0) {
            m40695(iM50475, view);
        }
    }

    public void detachViewAt(int i) {
        m40695(i, getChildAt(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40695(int i, View view) {
        this.mChildHelper.m50470(i);
    }

    public void attachView(View view, int i, C14543 c14543) {
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        if (abstractC3255M31833.isRemoved()) {
            C3432 c3432 = this.mRecyclerView.mViewInfoStore.f62936;
            C3941 c3941M11993 = (C3941) c3432.getOrDefault(abstractC3255M31833, null);
            if (c3941M11993 == null) {
                c3941M11993 = C3941.m11993();
                c3432.put(abstractC3255M31833, c3941M11993);
            }
            c3941M11993.f12559 |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m44866(abstractC3255M31833);
        }
        this.mChildHelper.m50472(view, i, c14543, abstractC3255M31833.isRemoved());
    }

    public void attachView(View view, int i) {
        attachView(view, i, (C14543) view.getLayoutParams());
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

    public void detachAndScrapView(View view, C2550 c2550) {
        m40697(c2550, this.mChildHelper.m50475(view), view);
    }

    public void detachAndScrapViewAt(int i, C2550 c2550) {
        m40697(c2550, i, getChildAt(i));
    }

    public void removeAndRecycleView(View view, C2550 c2550) {
        removeView(view);
        c2550.m8070(view);
    }

    public void removeAndRecycleViewAt(int i, C2550 c2550) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        c2550.m8070(childAt);
    }

    public int getChildCount() {
        C22514 c22514 = this.mChildHelper;
        if (c22514 != null) {
            return c22514.m50469();
        }
        return 0;
    }

    public View getChildAt(int i) {
        C22514 c22514 = this.mChildHelper;
        if (c22514 != null) {
            return c22514.m50476(i);
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
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            return c13132.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingTop() {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            return c13132.getPaddingTop();
        }
        return 0;
    }

    public int getPaddingRight() {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            return c13132.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingBottom() {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            return c13132.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingStart() {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 == null) {
            return 0;
        }
        int i = C17648.f53953;
        return c13132.getPaddingStart();
    }

    public int getPaddingEnd() {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 == null) {
            return 0;
        }
        int i = C17648.f53953;
        return c13132.getPaddingEnd();
    }

    public boolean isFocused() {
        C13132 c13132 = this.mRecyclerView;
        return c13132 != null && c13132.isFocused();
    }

    public boolean hasFocus() {
        C13132 c13132 = this.mRecyclerView;
        return c13132 != null && c13132.hasFocus();
    }

    public View getFocusedChild() {
        View focusedChild;
        C13132 c13132 = this.mRecyclerView;
        if (c13132 == null || (focusedChild = c13132.getFocusedChild()) == null || this.mChildHelper.f72858.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getItemCount() {
        C13132 c13132 = this.mRecyclerView;
        AbstractC19902 adapter = c13132 != null ? c13132.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public void offsetChildrenHorizontal(int i) {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            c13132.offsetChildrenHorizontal(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 != null) {
            c13132.offsetChildrenVertical(i);
        }
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        C13132 c13132 = this.mRecyclerView;
        if (parent != c13132 || c13132.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
        }
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        abstractC3255M31833.addFlags(128);
        this.mRecyclerView.mViewInfoStore.m44867(abstractC3255M31833);
    }

    public void stopIgnoringView(View view) {
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        abstractC3255M31833.stopIgnoring();
        abstractC3255M31833.resetInternal();
        abstractC3255M31833.addFlags(4);
    }

    public void detachAndScrapAttachedViews(C2550 c2550) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                m40697(c2550, childCount, getChildAt(childCount));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40697(C2550 c2550, int i, View view) {
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        if (abstractC3255M31833.shouldIgnore()) {
            if (C13132.sVerboseLoggingEnabled) {
                abstractC3255M31833.toString();
            }
        } else if (abstractC3255M31833.isInvalid() && !abstractC3255M31833.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i);
            c2550.m8071(abstractC3255M31833);
        } else {
            detachViewAt(i);
            c2550.m8077(view);
            this.mRecyclerView.mViewInfoStore.m44866(abstractC3255M31833);
        }
    }

    public void measureChild(View view, int i, int i2) {
        C14543 c14543 = (C14543) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM40692 = m40692(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) c14543).width, canScrollHorizontally());
        int iM40693 = m40692(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) c14543).height, canScrollVertically());
        if (shouldMeasureChild(view, iM40692, iM40693, c14543)) {
            view.measure(iM40692, iM40693);
        }
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, C14543 c14543) {
        return (this.mMeasurementCacheEnabled && m40700(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c14543).width) && m40700(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c14543).height)) ? false : true;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, C14543 c14543) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m40700(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c14543).width) && m40700(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c14543).height)) ? false : true;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m40700(int i, int i2, int i3) {
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
        C14543 c14543 = (C14543) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int iM40692 = m40692(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c14543).leftMargin + ((ViewGroup.MarginLayoutParams) c14543).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c14543).width, canScrollHorizontally());
        int iM40693 = m40692(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14543).topMargin + ((ViewGroup.MarginLayoutParams) c14543).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c14543).height, canScrollVertically());
        if (shouldMeasureChild(view, iM40692, iM40693, c14543)) {
            view.measure(iM40692, iM40693);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40693(int i, int i2, int i3, boolean z) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40692(int i, int i2, int i3, int i4, boolean z) {
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
        Rect rect = ((C14543) view.getLayoutParams()).f44551;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((C14543) view.getLayoutParams()).f44551;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((C14543) view.getLayoutParams()).f44551;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        C14543 c14543 = (C14543) view.getLayoutParams();
        Rect rect = c14543.f44551;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c14543).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c14543).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c14543).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c14543).bottomMargin);
    }

    public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C14543) view.getLayoutParams()).f44551;
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
        C13132.m31810(view, rect);
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
        C13132 c13132 = this.mRecyclerView;
        if (c13132 == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(c13132.getItemDecorInsetsForChild(view));
        }
    }

    public int getTopDecorationHeight(View view) {
        return ((C14543) view.getLayoutParams()).f44551.top;
    }

    public int getBottomDecorationHeight(View view) {
        return ((C14543) view.getLayoutParams()).f44551.bottom;
    }

    public int getLeftDecorationWidth(View view) {
        return ((C14543) view.getLayoutParams()).f44551.left;
    }

    public int getRightDecorationWidth(View view) {
        return ((C14543) view.getLayoutParams()).f44551.right;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m40699(View view, Rect rect) {
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

    public boolean requestChildRectangleOnScreen(C13132 c13132, View view, Rect rect, boolean z) {
        return requestChildRectangleOnScreen(c13132, view, rect, z, false);
    }

    public boolean requestChildRectangleOnScreen(C13132 c13132, View view, Rect rect, boolean z, boolean z2) {
        int[] iArrM40699 = m40699(view, rect);
        int i = iArrM40699[0];
        int i2 = iArrM40699[1];
        if ((z2 && !m40698(c13132, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            c13132.scrollBy(i, i2);
        } else {
            c13132.smoothScrollBy(i, i2);
        }
        return true;
    }

    public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.m8045(view) && this.mVerticalBoundCheck.m8045(view);
        return z ? z3 : !z3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40698(C13132 c13132, int i, int i2) {
        View focusedChild = c13132.getFocusedChild();
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
    public boolean onRequestChildFocus(C13132 c13132, View view, View view2) {
        return isSmoothScrolling() || c13132.isComputingLayout();
    }

    public boolean onRequestChildFocus(C13132 c13132, C21600 c21600, View view, View view2) {
        return onRequestChildFocus(c13132, view, view2);
    }

    public void onItemsUpdated(C13132 c13132, int i, int i2, Object obj) {
        onItemsUpdated(c13132, i, i2);
    }

    public void onMeasure(C2550 c2550, C21600 c21600, int i, int i2) {
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    public int getMinimumWidth() {
        C13132 c13132 = this.mRecyclerView;
        int i = C17648.f53953;
        return c13132.getMinimumWidth();
    }

    public int getMinimumHeight() {
        C13132 c13132 = this.mRecyclerView;
        int i = C17648.f53953;
        return c13132.getMinimumHeight();
    }

    public void stopSmoothScroller() {
        AbstractC15248 abstractC15248 = this.mSmoothScroller;
        if (abstractC15248 != null) {
            abstractC15248.stop();
        }
    }

    public void onSmoothScrollerStopped(AbstractC15248 abstractC15248) {
        if (this.mSmoothScroller == abstractC15248) {
            this.mSmoothScroller = null;
        }
    }

    public void removeAndRecycleAllViews(C2550 c2550) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            if (!C13132.m31833(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c2550);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(C14369 c14369) {
        C13132 c13132 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(c13132.mRecycler, c13132.mState, c14369);
    }

    public void onInitializeAccessibilityNodeInfo(C2550 c2550, C21600 c21600, C14369 c14369) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            c14369.m34275(8192);
            c14369.m34313(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            c14369.m34275(4096);
            c14369.m34313(true);
        }
        c14369.m34284(C16486.m38850(getRowCountForAccessibility(c2550, c21600), getColumnCountForAccessibility(c2550, c21600), getSelectionModeForAccessibility(c2550, c21600), isLayoutHierarchical(c2550, c21600)));
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C13132 c13132 = this.mRecyclerView;
        onInitializeAccessibilityEvent(c13132.mRecycler, c13132.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(C2550 c2550, C21600 c21600, AccessibilityEvent accessibilityEvent) {
        C13132 c13132 = this.mRecyclerView;
        if (c13132 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!c13132.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC19902 abstractC19902 = this.mRecyclerView.mAdapter;
        if (abstractC19902 != null) {
            accessibilityEvent.setItemCount(abstractC19902.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C14369 c14369) {
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        if (abstractC3255M31833 == null || abstractC3255M31833.isRemoved()) {
            return;
        }
        C22514 c22514 = this.mChildHelper;
        if (c22514.f72858.contains(abstractC3255M31833.itemView)) {
            return;
        }
        C13132 c13132 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(c13132.mRecycler, c13132.mState, view, c14369);
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        C13132 c13132 = this.mRecyclerView;
        return performAccessibilityAction(c13132.mRecycler, c13132.mState, i, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[PHI: r10
      0x0095: PHI (r10v9 int) = (r10v5 int), (r10v13 int) binds: [B:27:0x0084, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean performAccessibilityAction(C2550 c2550, C21600 c21600, int i, Bundle bundle) {
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
        C13132 c13132 = this.mRecyclerView;
        return performAccessibilityActionForItem(c13132.mRecycler, c13132.mState, view, i, bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18072 m40694(Context context, AttributeSet attributeSet, int i, int i2) {
        C18072 c18072 = new C18072();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0641.f2489, i, i2);
        c18072.f56290 = typedArrayObtainStyledAttributes.getInt(0, 1);
        c18072.f56292 = typedArrayObtainStyledAttributes.getInt(10, 1);
        c18072.f56291 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c18072.f56293 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c18072;
    }

    public void setExactMeasureSpecsFrom(C13132 c13132) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(c13132.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c13132.getHeight(), 1073741824));
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
