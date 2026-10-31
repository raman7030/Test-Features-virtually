package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.᩷᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21103 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4169 f68082;

    public C21103(C4169 c4169) {
        this.f68082 = c4169;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        C0640 c0640 = this.f68082.f13598;
        if (c0640.f2455.isFinished()) {
            return false;
        }
        c0640.f2455.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C0640 c0640 = this.f68082.f13598;
        c0640.f2452 = 0.0f;
        if (c0640.f2465 == null) {
            return true;
        }
        if (c0640.f2451) {
            int i = ((int) (c0640.f2468.y / c0640.f2464.f49787)) + c0640.f2473;
            if (c0640.f2449 - 1 <= i && i <= c0640.f2458 + 1) {
                c0640.f2450.mo8713(c0640.f2465.m41247(c0640.f2478, c0640.f2449, c0640.f2479, c0640.f2458).trim());
            }
            c0640.m2648((MotionEvent) null);
            return true;
        }
        c0640.requestFocus();
        c0640.f2456.mo4692();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C0640 c0640 = this.f68082.f13598;
        if (c0640.f2465 == null) {
            return true;
        }
        float f3 = f2 + c0640.f2452;
        int i = (int) (f3 / c0640.f2464.f49787);
        c0640.f2452 = f3 - (c0640.f2464.f49787 * i);
        c0640.m2622(i);
        if (i < 0) {
            if (motionEvent2 == null || c0640.f2473 > (-c0640.f2465.m41261().m7009())) {
                return true;
            }
            C23379.m51831(c0640.f2462, (-f3) / c0640.getHeight(), motionEvent2.getX() / c0640.getWidth());
            c0640.postInvalidateOnAnimation();
            if (c0640.f2480.isFinished()) {
                return true;
            }
            c0640.f2480.onRelease();
            return true;
        }
        if (i <= 0 || motionEvent2 == null || c0640.f2473 < 0) {
            return true;
        }
        C23379.m51831(c0640.f2480, f3 / c0640.getHeight(), 1.0f - (motionEvent2.getX() / c0640.getWidth()));
        c0640.postInvalidateOnAnimation();
        if (c0640.f2462.isFinished()) {
            return true;
        }
        c0640.f2462.onRelease();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C0640 c0640 = this.f68082.f13598;
        c0640.performHapticFeedback(0);
        c0640.f2451 = false;
        c0640.m2648(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C4169 c4169 = this.f68082;
        C0640 c0640 = c4169.f13598;
        if (c0640.f2465 == null) {
            return true;
        }
        float f3 = 1.0f / c0640.f2464.f49787;
        c0640.f2455.fling(0, (int) Math.ceil(c0640.f2473 / f3), 0, (int) ((-f2) * 1.2f), 0, 0, (int) (-Math.ceil(c0640.f2465.m41261().m7009() / f3)), 0);
        c0640.post(new RunnableC2758(c4169, f3));
        return true;
    }
}
