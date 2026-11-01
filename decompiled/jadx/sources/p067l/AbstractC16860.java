package p067l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ܶ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16860 {
    public AbstractC18873 mLayoutManager;
    public boolean mPendingInitialRun;
    public C14849 mRecyclerView;
    public boolean mRunning;
    public boolean mStarted;
    public View mTargetView;
    public int mTargetPosition = -1;
    public final C3450 mRecyclingAction = new C3450();

    public abstract void onSeekTargetStep(int i, int i2, C22897 c22897, C3450 c3450);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, C22897 c22897, C3450 c3450);

    public void start(C14849 c14849, AbstractC18873 abstractC18873) {
        RunnableC6803 runnableC6803 = c14849.mViewFlinger;
        runnableC6803.f17668.removeCallbacks(runnableC6803);
        runnableC6803.f17666.abortAnimation();
        this.mRecyclerView = c14849;
        this.mLayoutManager = abstractC18873;
        int i = this.mTargetPosition;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        c14849.mState.f72054 = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.m15596();
        this.mStarted = true;
    }

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof InterfaceC10156) {
            return ((InterfaceC10156) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public AbstractC18873 getLayoutManager() {
        return this.mLayoutManager;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f72054 = -1;
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
        C14849 c14849 = this.mRecyclerView;
        if (this.mTargetPosition == -1 || c14849 == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f = pointFComputeScrollVectorForPosition.x;
            if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                c14849.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, c14849.mState, this.mRecyclingAction);
                this.mRecyclingAction.m6116(c14849);
                stop();
            } else {
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, c14849.mState, this.mRecyclingAction);
            boolean zM6117 = this.mRecyclingAction.m6117();
            this.mRecyclingAction.m6116(c14849);
            if (zM6117 && this.mRunning) {
                this.mPendingInitialRun = true;
                c14849.mViewFlinger.m15596();
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
            int i = C14849.HORIZONTAL;
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
