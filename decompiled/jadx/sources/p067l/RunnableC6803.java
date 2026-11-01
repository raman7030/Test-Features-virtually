package p067l;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6803 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public OverScroller f17666;

    /* JADX INFO: renamed from: ۙ */
    public int f17667;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C14849 f17668;

    /* JADX INFO: renamed from: ۬ */
    public boolean f17669;

    /* JADX INFO: renamed from: ᩶ */
    public int f17670;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f17671;

    /* JADX INFO: renamed from: ᩹ */
    public Interpolator f17672;

    public RunnableC6803(C14849 c14849) {
        this.f17668 = c14849;
        Interpolator interpolator = C14849.sQuinticInterpolator;
        this.f17672 = interpolator;
        this.f17671 = false;
        this.f17669 = false;
        this.f17666 = new OverScroller(c14849.getContext(), interpolator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C14849 c14849 = this.f17668;
        if (c14849.mLayout != null) {
            this.f17669 = false;
            this.f17671 = true;
            c14849.consumePendingUpdateOperations();
            OverScroller overScroller = this.f17666;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f17670;
                int i7 = currY - this.f17667;
                this.f17670 = currX;
                this.f17667 = currY;
                int iConsumeFlingInHorizontalStretch = c14849.consumeFlingInHorizontalStretch(i6);
                int iConsumeFlingInVerticalStretch = c14849.consumeFlingInVerticalStretch(i7);
                int[] iArr = c14849.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (c14849.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = c14849.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (c14849.getOverScrollMode() != 2) {
                    c14849.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (c14849.mAdapter != null) {
                    int[] iArr3 = c14849.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    c14849.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = c14849.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    int i10 = iConsumeFlingInHorizontalStretch - i8;
                    int i11 = iConsumeFlingInVerticalStretch - i9;
                    AbstractC16860 abstractC16860 = c14849.mLayout.mSmoothScroller;
                    if (abstractC16860 != null && !abstractC16860.isPendingInitialRun() && abstractC16860.isRunning()) {
                        int iM51124 = c14849.mState.m51124();
                        if (iM51124 == 0) {
                            abstractC16860.stop();
                        } else if (abstractC16860.getTargetPosition() >= iM51124) {
                            abstractC16860.setTargetPosition(iM51124 - 1);
                            abstractC16860.onAnimation(i8, i9);
                        } else {
                            abstractC16860.onAnimation(i8, i9);
                        }
                    }
                    i3 = i9;
                    i4 = i8;
                    i = i10;
                    i2 = i11;
                } else {
                    i = iConsumeFlingInHorizontalStretch;
                    i2 = iConsumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!c14849.mItemDecorations.isEmpty()) {
                    c14849.invalidate();
                }
                int[] iArr5 = c14849.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                c14849.dispatchNestedScroll(i4, i3, i, i2, null, 1, iArr5);
                int[] iArr6 = c14849.mReusableIntPair;
                int i12 = i - iArr6[0];
                int i13 = i2 - iArr6[1];
                if (i4 != 0 || i3 != 0) {
                    c14849.dispatchOnScrolled(i4, i3);
                }
                if (!c14849.awakenScrollBars()) {
                    c14849.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                AbstractC16860 abstractC16861 = c14849.mLayout.mSmoothScroller;
                if ((abstractC16861 == null || !abstractC16861.isPendingInitialRun()) && z) {
                    if (c14849.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i12 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i12 > 0 ? currVelocity : 0;
                        }
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        c14849.absorbGlows(i5, currVelocity);
                    }
                    if (C14849.ALLOW_THREAD_GAP_WORK) {
                        C20652 c20652 = c14849.mPrefetchRegistry;
                        int[] iArr7 = c20652.f63783;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        c20652.f63782 = 0;
                    }
                } else {
                    m15596();
                    RunnableC7240 runnableC7240 = c14849.mGapWorker;
                    if (runnableC7240 != null) {
                        runnableC7240.m16585(c14849, i4, i3);
                    }
                }
            }
            AbstractC16860 abstractC16862 = c14849.mLayout.mSmoothScroller;
            if (abstractC16862 != null && abstractC16862.isPendingInitialRun()) {
                abstractC16862.onAnimation(0, 0);
            }
            this.f17671 = false;
            if (!this.f17669) {
                c14849.setScrollState(0);
                c14849.stopNestedScroll(1);
                return;
            } else {
                c14849.removeCallbacks(this);
                int i14 = C1717.f57146;
                c14849.postOnAnimation(this);
                return;
            }
        }
        c14849.removeCallbacks(this);
        this.f17666.abortAnimation();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15596() {
        if (this.f17671) {
            this.f17669 = true;
            return;
        }
        C14849 c14849 = this.f17668;
        c14849.removeCallbacks(this);
        int i = C1717.f57146;
        c14849.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15597(int i, int i2) {
        C14849 c14849 = this.f17668;
        c14849.setScrollState(2);
        this.f17667 = 0;
        this.f17670 = 0;
        Interpolator interpolator = this.f17672;
        Interpolator interpolator2 = C14849.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f17672 = interpolator2;
            this.f17666 = new OverScroller(c14849.getContext(), interpolator2);
        }
        this.f17666.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m15596();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15598(int i, int i2, Interpolator interpolator, int i3) {
        C14849 c14849 = this.f17668;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? c14849.getWidth() : c14849.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = C14849.sQuinticInterpolator;
        }
        if (this.f17672 != interpolator) {
            this.f17672 = interpolator;
            this.f17666 = new OverScroller(c14849.getContext(), interpolator);
        }
        this.f17667 = 0;
        this.f17670 = 0;
        c14849.setScrollState(2);
        this.f17666.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.f17666.computeScrollOffset();
        }
        m15596();
    }
}
