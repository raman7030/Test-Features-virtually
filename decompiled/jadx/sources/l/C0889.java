package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.֨ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0889 implements InterfaceC0183 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f3453;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final VelocityTracker f3454 = VelocityTracker.obtain();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f3455;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ScaleGestureDetector f3456;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f3457;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f3458;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18529 f3459;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f3460;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f3461;

    public C0889(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3458 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3461 = viewConfiguration.getScaledTouchSlop();
        this.f3456 = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC5123(this));
    }

    @Override // l.InterfaceC0183
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1323() {
        return this.f3456.isInProgress();
    }

    @Override // l.InterfaceC0183
    /* JADX INFO: renamed from: ֫ */
    public final void mo1322(MotionEvent motionEvent) {
        this.f3456.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        VelocityTracker velocityTracker = this.f3454;
        if (actionMasked == 0) {
            velocityTracker.clear();
            velocityTracker.addMovement(motionEvent);
            this.f3455 = motionEvent.getX();
            this.f3457 = motionEvent.getY();
            this.f3453 = false;
            this.f3460 = 0;
            return;
        }
        if (actionMasked == 1) {
            if (this.f3453) {
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float yVelocity = velocityTracker.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f3458) {
                    ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f3459;
                    motionEvent.getX();
                    motionEvent.getY();
                    viewOnTouchListenerC18529.m43068(-xVelocity, -yVelocity);
                    return;
                }
                return;
            }
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f3460++;
                this.f3453 = false;
                return;
            } else {
                if (actionMasked != 6) {
                    return;
                }
                int i = this.f3460 - 1;
                this.f3460 = i;
                if (i == 0) {
                    this.f3455 = Float.NaN;
                    this.f3457 = Float.NaN;
                    velocityTracker.clear();
                    return;
                }
                return;
            }
        }
        if (this.f3460 == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Float.isNaN(this.f3455) || Float.isNaN(this.f3457)) {
                this.f3455 = x;
                this.f3457 = y;
                velocityTracker.addMovement(motionEvent);
                return;
            }
            float f = x - this.f3455;
            float f2 = y - this.f3457;
            if (!this.f3453) {
                this.f3453 = Math.sqrt((double) ((f2 * f2) + (f * f))) >= ((double) this.f3461);
            }
            if (this.f3453) {
                this.f3459.m43061(f, f2);
                this.f3455 = x;
                this.f3457 = y;
                velocityTracker.addMovement(motionEvent);
            }
        }
    }
}
