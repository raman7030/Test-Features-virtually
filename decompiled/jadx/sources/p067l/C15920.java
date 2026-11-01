package p067l;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ܳۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes3.dex */
public final class C15920 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8545 f46040;

    public C15920(C8545 c8545) {
        this.f46040 = c8545;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C8545 c8545 = this.f46040;
        int scrollX = (int) (c8545.getScrollX() + f + 0.5f);
        int scrollY = (int) (c8545.getScrollY() + f2 + 0.5f);
        int iM19915 = c8545.m19915();
        int iM19919 = c8545.m19919();
        if (scrollX < 0) {
            if (motionEvent2 != null) {
                C24587.m54228(c8545.f22947, (-f) / c8545.getWidth(), 1.0f - (motionEvent2.getY() / c8545.getHeight()));
                int i = C1717.f57146;
                c8545.postInvalidateOnAnimation();
                if (!c8545.f22946.isFinished()) {
                    c8545.f22946.onRelease();
                }
            }
            scrollX = 0;
        } else if (scrollX > iM19915) {
            if (motionEvent2 != null) {
                C24587.m54228(c8545.f22946, f / c8545.getWidth(), motionEvent2.getY() / c8545.getHeight());
                int i2 = C1717.f57146;
                c8545.postInvalidateOnAnimation();
                if (!c8545.f22947.isFinished()) {
                    c8545.f22947.onRelease();
                }
            }
            scrollX = iM19915;
        }
        if (scrollY < 0) {
            if (motionEvent2 != null) {
                C24587.m54228(c8545.f22938, (-f2) / c8545.getHeight(), motionEvent2.getX() / c8545.getWidth());
                int i3 = C1717.f57146;
                c8545.postInvalidateOnAnimation();
                if (!c8545.f22937.isFinished()) {
                    c8545.f22937.onRelease();
                }
            }
            scrollY = 0;
        } else if (scrollY > iM19919) {
            if (motionEvent2 != null) {
                C24587.m54228(c8545.f22937, f2 / c8545.getHeight(), 1.0f - (motionEvent2.getX() / c8545.getWidth()));
                int i4 = C1717.f57146;
                c8545.postInvalidateOnAnimation();
                if (!c8545.f22938.isFinished()) {
                    c8545.f22938.onRelease();
                }
            }
            scrollY = iM19919;
        }
        c8545.scrollTo(scrollX, scrollY);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C8545 c8545 = this.f46040;
        if (c8545.f22939 == null) {
            return true;
        }
        c8545.f22943.fling(c8545.getScrollX(), c8545.getScrollY(), (int) (-f), (int) (-f2), 0, c8545.m19915(), 0, c8545.m19919());
        c8545.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C8545 c8545 = this.f46040;
        if (c8545.f22939 == null) {
            return true;
        }
        PointF pointF = new PointF(motionEvent.getX() + c8545.getScrollX(), motionEvent.getY() + c8545.getScrollY());
        C8545.m19913(c8545, pointF);
        C17932 c17932 = c8545.f22939;
        C9255 c9255M40786 = c17932.m40786(pointF);
        if (c9255M40786 != null) {
            c17932.f53562 = c9255M40786.f25111;
        } else {
            c17932.f53562 = -1;
        }
        c8545.invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        InterfaceC24638 interfaceC24638;
        C8545 c8545 = this.f46040;
        if (c8545.f22939 == null || (interfaceC24638 = c8545.f22944) == null) {
            return;
        }
        PointF pointF = new PointF(motionEvent.getX() + c8545.getScrollX(), motionEvent.getY() + c8545.getScrollY());
        C8545.m19913(c8545, pointF);
        C9255 c9255M40786 = c8545.f22939.m40786(pointF);
        if (C17828.m40481(((C13136) interfaceC24638).f36901, (c9255M40786 == null || c9255M40786.f25116.isEmpty()) ? -1 : c9255M40786.f25111, motionEvent.getX(), motionEvent.getY())) {
            c8545.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        C8545 c8545 = this.f46040;
        if (c8545.f22939 == null) {
            return true;
        }
        float f = 0.5f;
        if (c8545.f22949 >= 0.5f) {
            f = 1.0f;
            if (c8545.f22949 >= 1.0f) {
                f = 0.2f;
            }
        }
        ValueAnimator duration = ValueAnimator.ofFloat(c8545.f22949, f).setDuration(200L);
        final PointF pointF = new PointF();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܿۗܿ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MotionEvent motionEvent2 = motionEvent;
                float x = motionEvent2.getX();
                C8545 c8546 = this.f55566.f46040;
                float scrollX = x + c8546.getScrollX();
                float y = motionEvent2.getY() + c8546.getScrollY();
                PointF pointF2 = pointF;
                pointF2.set(scrollX, y);
                C8545.m19913(c8546, pointF2);
                c8546.f22949 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c8546.m19906(pointF2);
                c8546.scrollTo(C8545.m19903(c8546, (int) (pointF2.x - motionEvent2.getX())), C8545.m19911(c8546, (int) (pointF2.y - motionEvent2.getY())));
                c8546.invalidate();
            }
        });
        duration.start();
        return true;
    }
}
