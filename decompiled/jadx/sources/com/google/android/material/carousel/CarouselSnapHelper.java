package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import p067l.AbstractC16860;
import p067l.AbstractC18873;
import p067l.AbstractC9485;
import p067l.C14849;
import p067l.C21953;
import p067l.C22897;
import p067l.C3450;
import p067l.InterfaceC10156;

/* JADX INFO: loaded from: classes.dex */
public class CarouselSnapHelper extends AbstractC9485 {
    public static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    public static final float VERTICAL_SNAP_SPEED = 50.0f;
    public final boolean disableFling;
    public C14849 recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }

    @Override // p067l.AbstractC9485
    public void attachToRecyclerView(C14849 c14849) {
        super.attachToRecyclerView(c14849);
        this.recyclerView = c14849;
    }

    @Override // p067l.AbstractC9485
    public int[] calculateDistanceToFinalSnap(AbstractC18873 abstractC18873, View view) {
        return calculateDistanceToSnap(abstractC18873, view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(AbstractC18873 abstractC18873, View view, boolean z) {
        if (!(abstractC18873 instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) abstractC18873, z);
        if (abstractC18873.canScrollHorizontally()) {
            return new int[]{iDistanceToFirstFocalKeyline, 0};
        }
        if (abstractC18873.canScrollVertically()) {
            return new int[]{0, iDistanceToFirstFocalKeyline};
        }
        return new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    @Override // p067l.AbstractC9485
    public View findSnapView(AbstractC18873 abstractC18873) {
        return findViewNearestFirstKeyline(abstractC18873);
    }

    private View findViewNearestFirstKeyline(AbstractC18873 abstractC18873) {
        int childCount = abstractC18873.getChildCount();
        View view = null;
        if (childCount != 0 && (abstractC18873 instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) abstractC18873;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = abstractC18873.getChildAt(i2);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(abstractC18873.getPosition(childAt), false));
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    @Override // p067l.AbstractC9485
    public int findTargetSnapPosition(AbstractC18873 abstractC18873, int i, int i2) {
        int itemCount;
        if (!this.disableFling || (itemCount = abstractC18873.getItemCount()) == 0) {
            return -1;
        }
        int childCount = abstractC18873.getChildCount();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC18873.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) abstractC18873, false);
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
        boolean zIsForwardFling = isForwardFling(abstractC18873, i, i2);
        if (zIsForwardFling && view != null) {
            return abstractC18873.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return abstractC18873.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC18873.getPosition(view) + (isReverseLayout(abstractC18873) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private boolean isForwardFling(AbstractC18873 abstractC18873, int i, int i2) {
        if (abstractC18873.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(AbstractC18873 abstractC18873) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC18873.getItemCount();
        if (!(abstractC18873 instanceof InterfaceC10156) || (pointFComputeScrollVectorForPosition = ((InterfaceC10156) abstractC18873).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // p067l.AbstractC9485
    public AbstractC16860 createScroller(final AbstractC18873 abstractC18873) {
        if (abstractC18873 instanceof InterfaceC10156) {
            return new C21953(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // p067l.C21953, p067l.AbstractC16860
                public void onTargetFound(View view, C22897 c22897, C3450 c3450) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = iArrCalculateDistanceToSnap[0];
                        int i2 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                        if (iCalculateTimeForDeceleration > 0) {
                            c3450.m6115(i, i2, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                        }
                    }
                }

                @Override // p067l.C21953
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (abstractC18873.canScrollVertically()) {
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
