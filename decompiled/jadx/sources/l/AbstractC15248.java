package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ܶ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15248 {
    public AbstractC17366 mLayoutManager;
    public boolean mPendingInitialRun;
    public C13132 mRecyclerView;
    public boolean mRunning;
    public boolean mStarted;
    public View mTargetView;
    public int mTargetPosition = -1;
    public final C1138 mRecyclingAction = new C1138();

    public abstract void onSeekTargetStep(int i, int i2, C21600 c21600, C1138 c1138);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, C21600 c21600, C1138 c1138);

    public void start(C13132 c13132, AbstractC17366 abstractC17366) {
        RunnableC4666 runnableC4666 = c13132.mViewFlinger;
        runnableC4666.f14838.removeCallbacks(runnableC4666);
        runnableC4666.f14836.abortAnimation();
        this.mRecyclerView = c13132;
        this.mLayoutManager = abstractC17366;
        int i = this.mTargetPosition;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        c13132.mState.f69350 = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.m13721();
        this.mStarted = true;
    }

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof InterfaceC8194) {
            return ((InterfaceC8194) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public AbstractC17366 getLayoutManager() {
        return this.mLayoutManager;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f69350 = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    public void onAnimation(int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        C13132 c13132 = this.mRecyclerView;
        if (this.mTargetPosition == -1 || c13132 == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f = pointFComputeScrollVectorForPosition.x;
            if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                c13132.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, c13132.mState, this.mRecyclingAction);
                this.mRecyclingAction.m3875(c13132);
                stop();
            } else {
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, c13132.mState, this.mRecyclingAction);
            boolean zM3876 = this.mRecyclingAction.m3876();
            this.mRecyclingAction.m3875(c13132);
            if (zM3876 && this.mRunning) {
                this.mPendingInitialRun = true;
                c13132.mViewFlinger.m13721();
            }
        }
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public View findViewByPosition(int i) {
        return this.mRecyclerView.mLayout.findViewByPosition(i);
    }

    @Deprecated
    public void instantScrollToPosition(int i) {
        this.mRecyclerView.scrollToPosition(i);
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            int i = C13132.HORIZONTAL;
        }
    }

    public void normalize(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }
}
