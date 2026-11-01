package p067l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.֨ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3213 implements InterfaceC2542 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f6226;

    /* JADX INFO: renamed from: ۜ */
    public final VelocityTracker f6227 = VelocityTracker.obtain();

    /* JADX INFO: renamed from: ۧ */
    public float f6228;

    /* JADX INFO: renamed from: ܳ */
    public final ScaleGestureDetector f6229;

    /* JADX INFO: renamed from: ܽ */
    public float f6230;

    /* JADX INFO: renamed from: ܿ */
    public final float f6231;

    /* JADX INFO: renamed from: ᩳ */
    public ViewOnTouchListenerC19978 f6232;

    /* JADX INFO: renamed from: ᩷ */
    public int f6233;

    /* JADX INFO: renamed from: ᩻ */
    public final float f6234;

    public C3213(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6231 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6234 = viewConfiguration.getScaledTouchSlop();
        this.f6229 = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC7237(this));
    }

    @Override // p067l.InterfaceC2542
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3731() {
        return this.f6229.isInProgress();
    }

    @Override // p067l.InterfaceC2542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3730(MotionEvent motionEvent) {
        this.f6229.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        VelocityTracker velocityTracker = this.f6227;
        if (actionMasked == 0) {
            velocityTracker.clear();
            velocityTracker.addMovement(motionEvent);
            this.f6228 = motionEvent.getX();
            this.f6230 = motionEvent.getY();
            this.f6226 = false;
            this.f6233 = 0;
            return;
        }
        if (actionMasked == 1) {
            if (this.f6226) {
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float yVelocity = velocityTracker.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f6231) {
                    ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f6232;
                    motionEvent.getX();
                    motionEvent.getY();
                    viewOnTouchListenerC19978.m45346(-xVelocity, -yVelocity);
                    return;
                }
                return;
            }
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f6233++;
                this.f6226 = false;
                return;
            } else {
                if (actionMasked != 6) {
                    return;
                }
                int i = this.f6233 - 1;
                this.f6233 = i;
                if (i == 0) {
                    this.f6228 = Float.NaN;
                    this.f6230 = Float.NaN;
                    velocityTracker.clear();
                    return;
                }
                return;
            }
        }
        if (this.f6233 == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Float.isNaN(this.f6228) || Float.isNaN(this.f6230)) {
                this.f6228 = x;
                this.f6230 = y;
                velocityTracker.addMovement(motionEvent);
                return;
            }
            float f = x - this.f6228;
            float f2 = y - this.f6230;
            if (!this.f6226) {
                this.f6226 = Math.sqrt((double) ((f2 * f2) + (f * f))) >= ((double) this.f6234);
            }
            if (this.f6226) {
                this.f6232.m45339(f, f2);
                this.f6228 = x;
                this.f6230 = y;
                velocityTracker.addMovement(motionEvent);
            }
        }
    }
}
