package p067l;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: l.۟۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9485 extends AbstractC8815 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;
    public Scroller mGravityScroller;
    public C14849 mRecyclerView;
    public final AbstractC11498 mScrollListener = new C24237(this);

    public abstract int[] calculateDistanceToFinalSnap(AbstractC18873 abstractC18873, View view);

    public abstract View findSnapView(AbstractC18873 abstractC18873);

    public abstract int findTargetSnapPosition(AbstractC18873 abstractC18873, int i, int i2);

    @Override // p067l.AbstractC8815
    public boolean onFling(int i, int i2) {
        AbstractC18873 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m22086(layoutManager, i, i2);
    }

    public void attachToRecyclerView(C14849 c14849) {
        C14849 c148410 = this.mRecyclerView;
        if (c148410 == c14849) {
            return;
        }
        if (c148410 != null) {
            m22085();
        }
        this.mRecyclerView = c14849;
        if (c14849 != null) {
            m22087();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m22087() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22085() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22086(AbstractC18873 abstractC18873, int i, int i2) {
        AbstractC16860 abstractC16860CreateScroller;
        int iFindTargetSnapPosition;
        if (!(abstractC18873 instanceof InterfaceC10156) || (abstractC16860CreateScroller = createScroller(abstractC18873)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(abstractC18873, i, i2)) == -1) {
            return false;
        }
        abstractC16860CreateScroller.setTargetPosition(iFindTargetSnapPosition);
        abstractC18873.startSmoothScroll(abstractC16860CreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        AbstractC18873 layoutManager;
        View viewFindSnapView;
        C14849 c14849 = this.mRecyclerView;
        if (c14849 == null || (layoutManager = c14849.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }

    public AbstractC16860 createScroller(AbstractC18873 abstractC18873) {
        return createSnapScroller(abstractC18873);
    }

    @Deprecated
    public C21953 createSnapScroller(AbstractC18873 abstractC18873) {
        if (abstractC18873 instanceof InterfaceC10156) {
            return new C15519(this, this.mRecyclerView.getContext());
        }
        return null;
    }
}
