package l;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: l.۟۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7488 extends AbstractC6783 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;
    public Scroller mGravityScroller;
    public C13132 mRecyclerView;
    public final AbstractC9606 mScrollListener = new C23010(this);

    public abstract int[] calculateDistanceToFinalSnap(AbstractC17366 abstractC17366, View view);

    public abstract View findSnapView(AbstractC17366 abstractC17366);

    public abstract int findTargetSnapPosition(AbstractC17366 abstractC17366, int i, int i2);

    @Override // l.AbstractC6783
    public boolean onFling(int i, int i2) {
        AbstractC17366 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m20110(layoutManager, i, i2);
    }

    public void attachToRecyclerView(C13132 c13132) {
        C13132 c13133 = this.mRecyclerView;
        if (c13133 == c13132) {
            return;
        }
        if (c13133 != null) {
            m20109();
        }
        this.mRecyclerView = c13132;
        if (c13132 != null) {
            m20111();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20111() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20109() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20110(AbstractC17366 abstractC17366, int i, int i2) {
        AbstractC15248 abstractC15248CreateScroller;
        int iFindTargetSnapPosition;
        if (!(abstractC17366 instanceof InterfaceC8194) || (abstractC15248CreateScroller = createScroller(abstractC17366)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(abstractC17366, i, i2)) == -1) {
            return false;
        }
        abstractC15248CreateScroller.setTargetPosition(iFindTargetSnapPosition);
        abstractC17366.startSmoothScroll(abstractC15248CreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        AbstractC17366 layoutManager;
        View viewFindSnapView;
        C13132 c13132 = this.mRecyclerView;
        if (c13132 == null || (layoutManager = c13132.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }

    public AbstractC15248 createScroller(AbstractC17366 abstractC17366) {
        return createSnapScroller(abstractC17366);
    }

    @Deprecated
    public C20607 createSnapScroller(AbstractC17366 abstractC17366) {
        if (abstractC17366 instanceof InterfaceC8194) {
            return new C13837(this, this.mRecyclerView.getContext());
        }
        return null;
    }
}
