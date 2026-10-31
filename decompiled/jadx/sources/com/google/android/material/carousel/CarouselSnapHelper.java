package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import l.AbstractC15248;
import l.AbstractC17366;
import l.AbstractC7488;
import l.C1138;
import l.C13132;
import l.C20607;
import l.C21600;
import l.InterfaceC8194;

/* JADX INFO: loaded from: classes.dex */
public class CarouselSnapHelper extends AbstractC7488 {
    public static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    public static final float VERTICAL_SNAP_SPEED = 50.0f;
    public final boolean disableFling;
    public C13132 recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }

    @Override // l.AbstractC7488
    public void attachToRecyclerView(C13132 c13132) {
        super.attachToRecyclerView(c13132);
        this.recyclerView = c13132;
    }

    @Override // l.AbstractC7488
    public int[] calculateDistanceToFinalSnap(AbstractC17366 abstractC17366, View view) {
        return calculateDistanceToSnap(abstractC17366, view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(AbstractC17366 abstractC17366, View view, boolean z) {
        if (!(abstractC17366 instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) abstractC17366, z);
        if (abstractC17366.canScrollHorizontally()) {
            return new int[]{iDistanceToFirstFocalKeyline, 0};
        }
        if (abstractC17366.canScrollVertically()) {
            return new int[]{0, iDistanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    @Override // l.AbstractC7488
    public View findSnapView(AbstractC17366 abstractC17366) {
        return findViewNearestFirstKeyline(abstractC17366);
    }

    private View findViewNearestFirstKeyline(AbstractC17366 abstractC17366) {
        int childCount = abstractC17366.getChildCount();
        View view = null;
        if (childCount != 0 && (abstractC17366 instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) abstractC17366;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = abstractC17366.getChildAt(i2);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(abstractC17366.getPosition(childAt), false));
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    @Override // l.AbstractC7488
    public int findTargetSnapPosition(AbstractC17366 abstractC17366, int i, int i2) {
        int itemCount;
        if (!this.disableFling || (itemCount = abstractC17366.getItemCount()) == 0) {
            return -1;
        }
        int childCount = abstractC17366.getChildCount();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC17366.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) abstractC17366, false);
                if (iDistanceToFirstFocalKeyline <= 0 && iDistanceToFirstFocalKeyline > i3) {
                    view2 = childAt;
                    i3 = iDistanceToFirstFocalKeyline;
                }
                if (iDistanceToFirstFocalKeyline >= 0 && iDistanceToFirstFocalKeyline < i4) {
                    view = childAt;
                    i4 = iDistanceToFirstFocalKeyline;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(abstractC17366, i, i2);
        if (zIsForwardFling && view != null) {
            return abstractC17366.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return abstractC17366.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC17366.getPosition(view) + (isReverseLayout(abstractC17366) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private boolean isForwardFling(AbstractC17366 abstractC17366, int i, int i2) {
        if (abstractC17366.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(AbstractC17366 abstractC17366) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC17366.getItemCount();
        if (!(abstractC17366 instanceof InterfaceC8194) || (pointFComputeScrollVectorForPosition = ((InterfaceC8194) abstractC17366).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // l.AbstractC7488
    public AbstractC15248 createScroller(final AbstractC17366 abstractC17366) {
        if (abstractC17366 instanceof InterfaceC8194) {
            return new C20607(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // l.C20607, l.AbstractC15248
                public void onTargetFound(View view, C21600 c21600, C1138 c1138) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = iArrCalculateDistanceToSnap[0];
                        int i2 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                        if (iCalculateTimeForDeceleration > 0) {
                            c1138.m3874(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                        }
                    }
                }

                @Override // l.C20607
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (abstractC17366.canScrollVertically()) {
                        f = displayMetrics.densityDpi;
                        f2 = 50.0f;
                    } else {
                        f = displayMetrics.densityDpi;
                        f2 = 100.0f;
                    }
                    return f2 / f;
                }
            };
        }
        return null;
    }
}
