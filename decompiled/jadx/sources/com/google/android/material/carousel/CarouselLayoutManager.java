package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.AbstractC17366;
import l.AbstractC7201;
import l.C13132;
import l.C14543;
import l.C1814;
import l.C19343;
import l.C19370;
import l.C20195;
import l.C20361;
import l.C20607;
import l.C21600;
import l.C23575;
import l.C2550;
import l.C7191;
import l.InterfaceC8194;
import l.RunnableC4196;
import l.ViewOnLayoutChangeListenerC18974;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC17366 implements Carousel, InterfaceC8194 {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    public static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    public int carouselAlignment;
    public CarouselStrategy carouselStrategy;
    public int currentEstimatedPosition;
    public int currentFillStartPosition;
    public KeylineState currentKeylineState;
    public final DebugItemDecoration debugItemDecoration;
    public boolean isDebuggingEnabled;
    public KeylineStateList keylineStateList;
    public Map keylineStatePositionMap;
    public int lastItemCount;
    public int maxScroll;
    public int minScroll;
    public CarouselOrientationHelper orientationHelper;
    public final View.OnLayoutChangeListener recyclerViewSizeChangeListener;
    public int scrollOffset;

    public class LayoutDirection {
        public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        public static final int LAYOUT_END = 1;
        public static final int LAYOUT_START = -1;
    }

    public static int calculateShouldScrollBy(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        if (i5 < i3) {
            return i3 - i2;
        }
        return i5 > i4 ? i4 - i2 : i;
    }

    @Override // l.AbstractC17366
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new RunnableC4196(7, this));
    }

    public final class ChildCalculations {
        public final float center;
        public final View child;
        public final float offsetCenter;
        public final KeylineRange range;

        public ChildCalculations(View view, float f, float f2, KeylineRange keylineRange) {
            this.child = view;
            this.center = f;
            this.offsetCenter = f2;
            this.range = keylineRange;
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy, int i) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new ViewOnLayoutChangeListenerC18974(1, this);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new ViewOnLayoutChangeListenerC18974(1, this);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19343.f61067);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(C19343.f61810, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(C19343.f61204, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setCarouselAlignment(int i) {
        this.carouselAlignment = i;
        refreshKeylineState();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingTop();
        }
        return getPaddingLeft();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingBottom();
        }
        return getPaddingRight();
    }

    @Override // l.AbstractC17366
    public C14543 generateDefaultLayoutParams() {
        return new C14543(-2, -2);
    }

    public void setCarouselStrategy(CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    @Override // l.AbstractC17366
    public void onAttachedToWindow(C13132 c13132) {
        super.onAttachedToWindow(c13132);
        this.carouselStrategy.initialize(c13132.getContext());
        refreshKeylineState();
        c13132.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // l.AbstractC17366
    public void onDetachedFromWindow(C13132 c13132, C2550 c2550) {
        super.onDetachedFromWindow(c13132, c2550);
        c13132.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // l.AbstractC17366
    public void onLayoutChildren(C2550 c2550, C21600 c21600) {
        if (c21600.m48777() <= 0 || getContainerSize() <= 0.0f) {
            removeAndRecycleAllViews(c2550);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean zIsLayoutRtl = isLayoutRtl();
        boolean z = this.keylineStateList == null;
        if (z) {
            recalculateKeylineStateList(c2550);
        }
        int iCalculateStartScroll = calculateStartScroll(this.keylineStateList);
        int iCalculateEndScroll = calculateEndScroll(c21600, this.keylineStateList);
        this.minScroll = zIsLayoutRtl ? iCalculateEndScroll : iCalculateStartScroll;
        if (zIsLayoutRtl) {
            iCalculateEndScroll = iCalculateStartScroll;
        }
        this.maxScroll = iCalculateEndScroll;
        if (z) {
            this.scrollOffset = iCalculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
            int i = this.currentEstimatedPosition;
            if (i != -1) {
                this.scrollOffset = getScrollOffsetForPosition(i, getKeylineStateForPosition(i));
            }
        }
        int i2 = this.scrollOffset;
        this.scrollOffset = i2 + calculateShouldScrollBy(0, i2, this.minScroll, this.maxScroll);
        this.currentFillStartPosition = C1814.m6036(this.currentFillStartPosition, 0, c21600.m48777());
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        detachAndScrapAttachedViews(c2550);
        fill(c2550, c21600);
        this.lastItemCount = getItemCount();
    }

    private void recalculateKeylineStateList(C2550 c2550) {
        View viewM8075 = c2550.m8075(0);
        measureChildWithMargins(viewM8075, 0, 0);
        KeylineState keylineStateOnFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewM8075);
        if (isLayoutRtl()) {
            keylineStateOnFirstChildMeasuredWithMargins = KeylineState.reverse(keylineStateOnFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, keylineStateOnFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift());
    }

    private int getItemMargins() {
        int i;
        int i2;
        if (getChildCount() <= 0) {
            return 0;
        }
        C14543 c14543 = (C14543) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i = ((ViewGroup.MarginLayoutParams) c14543).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c14543).rightMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) c14543).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c14543).bottomMargin;
        }
        return i + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void fill(C2550 c2550, C21600 c21600) {
        removeAndRecycleOutOfBoundsViews(c2550);
        if (getChildCount() == 0) {
            addViewsStart(c2550, this.currentFillStartPosition - 1);
            addViewsEnd(c2550, c21600, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(c2550, position - 1);
            addViewsEnd(c2550, c21600, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    @Override // l.AbstractC17366
    public void onLayoutCompleted(C21600 c21600) {
        super.onLayoutCompleted(c21600);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    private void addViewsStart(C2550 c2550, int i) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i);
        while (i >= 0) {
            ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(c2550, fCalculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsStart(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                return;
            }
            fCalculateChildStartForFill = addStart(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                addAndLayoutView(childCalculationsMakeChildCalculations.child, 0, childCalculationsMakeChildCalculations);
            }
            i--;
        }
    }

    private void addViewAtPosition(C2550 c2550, int i, int i2) {
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(c2550, calculateChildStartForFill(i), i);
        addAndLayoutView(childCalculationsMakeChildCalculations.child, i2, childCalculationsMakeChildCalculations);
    }

    private void addViewsEnd(C2550 c2550, C21600 c21600, int i) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i);
        while (i < c21600.m48777()) {
            ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(c2550, fCalculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsEnd(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                return;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                addAndLayoutView(childCalculationsMakeChildCalculations.child, -1, childCalculationsMakeChildCalculations);
            }
            i++;
        }
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                getDecoratedCenterWithMargins(childAt);
                getPosition(childAt);
            }
        }
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i = 0;
        while (i < getChildCount() - 1) {
            int position = getPosition(getChildAt(i));
            int i2 = i + 1;
            int position2 = getPosition(getChildAt(i2));
            if (position > position2) {
                logChildrenIfDebugging();
                StringBuilder sbM46682 = C20361.m46682("Detected invalid child order. Child at index [", i, "] had adapter position [", "] and child at index [", position);
                sbM46682.append(i2);
                sbM46682.append("] had adapter position [");
                sbM46682.append(position2);
                sbM46682.append("].");
                throw new IllegalStateException(sbM46682.toString());
            }
            i = i2;
        }
    }

    private ChildCalculations makeChildCalculations(C2550 c2550, float f, int i) {
        View viewM8075 = c2550.m8075(i);
        measureChildWithMargins(viewM8075, 0, 0);
        float fAddEnd = addEnd(f, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        return new ChildCalculations(viewM8075, fAddEnd, calculateChildOffsetCenterForLocation(viewM8075, fAddEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private void addAndLayoutView(View view, int i, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i);
        float f = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f - itemSize), (int) (f + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f, KeylineRange keylineRange) {
        float fAddEnd = addEnd(f, getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            return fAddEnd > ((float) getContainerSize());
        }
        return fAddEnd < 0.0f;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f, KeylineRange keylineRange) {
        float fAddStart = addStart(f, getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            return fAddStart < 0.0f;
        }
        return fAddStart > ((float) getContainerSize());
    }

    @Override // l.AbstractC17366
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(fCenterY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fCenterY, true));
        float fWidth = isHorizontal() ? (rect.width() - maskedItemSizeForLocOffset) / 2.0f : 0.0f;
        float fHeight = isHorizontal() ? 0.0f : (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    private float getDecoratedCenterWithMargins(View view) {
        int iCenterY;
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        if (isHorizontal()) {
            iCenterY = rect.centerX();
        } else {
            iCenterY = rect.centerY();
        }
        return iCenterY;
    }

    private void removeAndRecycleOutOfBoundsViews(C2550 c2550) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, c2550);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, c2550);
            }
        }
    }

    public static KeylineRange getSurroundingKeylineRange(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list.get(i5);
            float f6 = z ? keyline.locOffset : keyline.loc;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f3) {
                i3 = i5;
                f3 = fAbs;
            }
            if (f6 <= f4) {
                i2 = i5;
                f4 = f6;
            }
            if (f6 > f5) {
                i4 = i5;
                f5 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new KeylineRange((KeylineState.Keyline) list.get(i), (KeylineState.Keyline) list.get(i3));
    }

    private void updateCurrentKeylineStateForScrollOffset(KeylineStateList keylineStateList) {
        int i = this.maxScroll;
        int i2 = this.minScroll;
        if (i <= i2) {
            this.currentKeylineState = isLayoutRtl() ? keylineStateList.getEndState() : keylineStateList.getStartState();
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i2, i);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private int calculateStartScroll(KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState endState = zIsLayoutRtl ? keylineStateList.getEndState() : keylineStateList.getStartState();
        return (int) (getParentStart() - addStart((zIsLayoutRtl ? endState.getLastFocalKeyline() : endState.getFirstFocalKeyline()).loc, endState.getItemSize() / 2.0f));
    }

    private int calculateEndScroll(C21600 c21600, KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState startState = zIsLayoutRtl ? keylineStateList.getStartState() : keylineStateList.getEndState();
        KeylineState.Keyline firstFocalKeyline = zIsLayoutRtl ? startState.getFirstFocalKeyline() : startState.getLastFocalKeyline();
        int iM48777 = (int) (((((c21600.m48777() - 1) * startState.getItemSize()) * (zIsLayoutRtl ? -1.0f : 1.0f)) - (firstFocalKeyline.loc - getParentStart())) + (getParentEnd() - firstFocalKeyline.loc) + (zIsLayoutRtl ? -firstFocalKeyline.leftOrTopPaddingShift : firstFocalKeyline.rightOrBottomPaddingShift));
        return zIsLayoutRtl ? Math.min(0, iM48777) : Math.max(0, iM48777);
    }

    private float calculateChildStartForFill(int i) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i);
    }

    private float calculateChildOffsetCenterForLocation(View view, float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f2 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float fLerp = AnimationUtils.lerp(f2, keyline2.locOffset, keyline.loc, keyline2.loc, f);
        if (keylineRange.rightOrBottom != this.currentKeylineState.getFirstKeyline() && keylineRange.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return fLerp;
        }
        float maskMargins = this.orientationHelper.getMaskMargins((C14543) view.getLayoutParams()) / this.currentKeylineState.getItemSize();
        KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
        return (((1.0f - keyline3.mask) + maskMargins) * (f - keyline3.loc)) + fLerp;
    }

    private float getMaskedItemSizeForLocOffset(float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f2 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f2, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.leftOrTop;
            float f2 = keyline.mask;
            KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
            float fLerp = AnimationUtils.lerp(f2, keyline2.mask, keyline.loc, keyline2.loc, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, fLerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, fLerp));
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, f, keylineRange);
            RectF rectF = new RectF(fCalculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), fCalculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), (maskRect.width() / 2.0f) + fCalculateChildOffsetCenterForLocation, (maskRect.height() / 2.0f) + fCalculateChildOffsetCenterForLocation);
            RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.isContained()) {
                this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((Maskable) view).setMaskRectF(maskRect);
        }
    }

    @Override // l.AbstractC17366
    public void measureChildWithMargins(View view, int i, int i2) {
        float itemSize;
        float itemSize2;
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        C14543 c14543 = (C14543) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = rect.left + rect.right + i;
        int i4 = rect.top + rect.bottom + i2;
        KeylineStateList keylineStateList = this.keylineStateList;
        if (keylineStateList != null && this.orientationHelper.orientation == 0) {
            itemSize = keylineStateList.getDefaultState().getItemSize();
        } else {
            itemSize = ((ViewGroup.MarginLayoutParams) c14543).width;
        }
        KeylineStateList keylineStateList2 = this.keylineStateList;
        if (keylineStateList2 != null && this.orientationHelper.orientation == 1) {
            itemSize2 = keylineStateList2.getDefaultState().getItemSize();
        } else {
            itemSize2 = ((ViewGroup.MarginLayoutParams) c14543).height;
        }
        view.measure(AbstractC17366.m40692(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c14543).leftMargin + ((ViewGroup.MarginLayoutParams) c14543).rightMargin + i3, (int) itemSize, canScrollHorizontally()), AbstractC17366.m40692(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c14543).topMargin + ((ViewGroup.MarginLayoutParams) c14543).bottomMargin + i4, (int) itemSize2, canScrollVertically()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    private int getContainerSize() {
        if (isHorizontal()) {
            return getContainerWidth();
        }
        return getContainerHeight();
    }

    public boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    private float addStart(float f, float f2) {
        return isLayoutRtl() ? f + f2 : f - f2;
    }

    private float addEnd(float f, float f2) {
        return isLayoutRtl() ? f - f2 : f + f2;
    }

    @Override // l.AbstractC17366
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    private int getScrollOffsetForPosition(int i, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) ((keylineState.getItemSize() / 2.0f) + ((i * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i, KeylineState keylineState) {
        int containerSize;
        int i2 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (keylineState.getItemSize() / 2.0f) + (i * keylineState.getItemSize());
            if (isLayoutRtl()) {
                containerSize = (int) ((getContainerSize() - keyline.loc) - itemSize);
            } else {
                containerSize = (int) (itemSize - keyline.loc);
            }
            int i3 = containerSize - this.scrollOffset;
            if (Math.abs(i2) > Math.abs(i3)) {
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // l.InterfaceC8194
    public PointF computeScrollVectorForPosition(int i) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, getKeylineStateForPosition(i));
        if (isHorizontal()) {
            return new PointF(offsetToScrollToPosition, 0.0f);
        }
        return new PointF(0.0f, offsetToScrollToPosition);
    }

    public int getOffsetToScrollToPosition(int i, KeylineState keylineState) {
        return getScrollOffsetForPosition(i, keylineState) - this.scrollOffset;
    }

    public int getOffsetToScrollToPositionForSnap(int i, boolean z) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i, getKeylineStateForPosition(i)) : offsetToScrollToPosition;
        return (!z || Math.abs(offsetToScrollToPosition2) >= Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    private KeylineState getKeylineStateForPosition(int i) {
        KeylineState keylineState;
        Map map = this.keylineStatePositionMap;
        return (map == null || (keylineState = (KeylineState) map.get(Integer.valueOf(C1814.m6036(i, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.getDefaultState() : keylineState;
    }

    @Override // l.AbstractC17366
    public void scrollToPosition(int i) {
        this.currentEstimatedPosition = i;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i, getKeylineStateForPosition(i));
        this.currentFillStartPosition = C1814.m6036(i, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // l.AbstractC17366
    public void smoothScrollToPosition(C13132 c13132, C21600 c21600, int i) {
        C20607 c20607 = new C20607(c13132.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // l.AbstractC15248
            public PointF computeScrollVectorForPosition(int i2) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i2);
            }

            @Override // l.C20607
            public int calculateDxToMakeVisible(View view, int i2) {
                if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // l.C20607
            public int calculateDyToMakeVisible(View view, int i2) {
                if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }
        };
        c20607.setTargetPosition(i);
        startSmoothScroll(c20607);
    }

    public int calculateScrollDeltaToMakePositionVisible(int i) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i, getKeylineStateForPosition(i)));
    }

    @Override // l.AbstractC17366
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // l.AbstractC17366
    public int scrollHorizontallyBy(int i, C2550 c2550, C21600 c21600) {
        if (canScrollHorizontally()) {
            return scrollBy(i, c2550, c21600);
        }
        return 0;
    }

    @Override // l.AbstractC17366
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // l.AbstractC17366
    public int scrollVerticallyBy(int i, C2550 c2550, C21600 c21600) {
        if (canScrollVertically()) {
            return scrollBy(i, c2550, c21600);
        }
        return 0;
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            if (orientation == 0) {
                return isLayoutRtl() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && orientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        if (orientation == 0) {
            return isLayoutRtl() ? -1 : 1;
        }
        return Integer.MIN_VALUE;
    }

    @Override // l.AbstractC17366
    public View onFocusSearchFailed(View view, int i, C2550 c2550, C21600 c21600) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(c2550, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(c2550, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    private View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    @Override // l.AbstractC17366
    public boolean requestChildRectangleOnScreen(C13132 c13132, View view, Rect rect, boolean z, boolean z2) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(c13132, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    private void scrollBy(C13132 c13132, int i) {
        if (isHorizontal()) {
            c13132.scrollBy(i, 0);
        } else {
            c13132.scrollBy(0, i);
        }
    }

    private int scrollBy(int i, C2550 c2550, C21600 c21600) {
        float f;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(c2550);
        }
        int iCalculateShouldScrollBy = calculateShouldScrollBy(i, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += iCalculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float fCalculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (isLayoutRtl()) {
            f = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            float fAbs = Math.abs(f - offsetChild(childAt, fCalculateChildStartForFill, itemSize, rect));
            if (childAt != null && fAbs < f2) {
                this.currentEstimatedPosition = getPosition(childAt);
                f2 = fAbs;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(c2550, c21600);
        return iCalculateShouldScrollBy;
    }

    private float offsetChild(View view, float f, float f2, Rect rect) {
        float fAddEnd = addEnd(f, f2);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, fAddEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, fAddEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f2, fCalculateChildOffsetCenterForLocation);
        return fCalculateChildOffsetCenterForLocation;
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollOffset(C21600 c21600) {
        return this.scrollOffset;
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollExtent(C21600 c21600) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(c21600)));
    }

    @Override // l.AbstractC17366
    public int computeHorizontalScrollRange(C21600 c21600) {
        return this.maxScroll - this.minScroll;
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollOffset(C21600 c21600) {
        return this.scrollOffset;
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollExtent(C21600 c21600) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(c21600)));
    }

    @Override // l.AbstractC17366
    public int computeVerticalScrollRange(C21600 c21600) {
        return this.maxScroll - this.minScroll;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C19370.m44628(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i);
            refreshKeylineState();
        }
    }

    @Override // l.AbstractC17366
    public void onItemsAdded(C13132 c13132, int i, int i2) {
        super.onItemsAdded(c13132, i, i2);
        updateItemCount();
    }

    @Override // l.AbstractC17366
    public void onItemsRemoved(C13132 c13132, int i, int i2) {
        super.onItemsRemoved(c13132, i, i2);
        updateItemCount();
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i = this.lastItemCount;
        if (itemCount == i || this.keylineStateList == null) {
            return;
        }
        if (this.carouselStrategy.shouldRefreshKeylineState(this, i)) {
            refreshKeylineState();
        }
        this.lastItemCount = itemCount;
    }

    public void setDebuggingEnabled(C13132 c13132, boolean z) {
        this.isDebuggingEnabled = z;
        c13132.removeItemDecoration(this.debugItemDecoration);
        if (z) {
            c13132.addItemDecoration(this.debugItemDecoration);
        }
        c13132.invalidateItemDecorations();
    }

    public class KeylineRange {
        public final KeylineState.Keyline leftOrTop;
        public final KeylineState.Keyline rightOrBottom;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            if (keyline.loc > keyline2.loc) {
                throw new IllegalArgumentException();
            }
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    public class DebugItemDecoration extends AbstractC7201 {
        public List keylines;
        public final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = C20195.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void setKeylines(List list) {
            this.keylines = C20195.unmodifiableList(list);
        }

        @Override // l.AbstractC7201
        public void onDrawOver(Canvas canvas, C13132 c13132, C21600 c21600) {
            super.onDrawOver(canvas, c13132, c21600);
            this.linePaint.setStrokeWidth(c13132.getResources().getDimension(C23575.f75910));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(C7191.m19267(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) c13132.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) c13132.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) c13132.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) c13132.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) c13132.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }
    }
}
