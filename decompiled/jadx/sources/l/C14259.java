package l;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ܳۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes3.dex */
public final class C14259 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6499 f42948;

    public C14259(C6499 c6499) {
        this.f42948 = c6499;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6499 c6499 = this.f42948;
        int scrollX = (int) (c6499.getScrollX() + f + 0.5f);
        int scrollY = (int) (c6499.getScrollY() + f2 + 0.5f);
        int iM17967 = c6499.m17967();
        int iM17971 = c6499.m17971();
        if (scrollX < 0) {
            if (motionEvent2 != null) {
                C23379.m51831(c6499.f20073, (-f) / c6499.getWidth(), 1.0f - (motionEvent2.getY() / c6499.getHeight()));
                int i = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                if (!c6499.f20072.isFinished()) {
                    c6499.f20072.onRelease();
                }
            }
            scrollX = 0;
        } else if (scrollX > iM17967) {
            if (motionEvent2 != null) {
                C23379.m51831(c6499.f20072, f / c6499.getWidth(), motionEvent2.getY() / c6499.getHeight());
                int i2 = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                if (!c6499.f20073.isFinished()) {
                    c6499.f20073.onRelease();
                }
            }
            scrollX = iM17967;
        }
        if (scrollY < 0) {
            if (motionEvent2 != null) {
                C23379.m51831(c6499.f20064, (-f2) / c6499.getHeight(), motionEvent2.getX() / c6499.getWidth());
                int i3 = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                if (!c6499.f20063.isFinished()) {
                    c6499.f20063.onRelease();
                }
            }
            scrollY = 0;
        } else if (scrollY > iM17971) {
            if (motionEvent2 != null) {
                C23379.m51831(c6499.f20063, f2 / c6499.getHeight(), 1.0f - (motionEvent2.getX() / c6499.getWidth()));
                int i4 = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                if (!c6499.f20064.isFinished()) {
                    c6499.f20064.onRelease();
                }
            }
            scrollY = iM17971;
        }
        c6499.scrollTo(scrollX, scrollY);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6499 c6499 = this.f42948;
        if (c6499.f20065 == null) {
            return true;
        }
        c6499.f20069.fling(c6499.getScrollX(), c6499.getScrollY(), (int) (-f), (int) (-f2), 0, c6499.m17967(), 0, c6499.m17971());
        c6499.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C6499 c6499 = this.f42948;
        if (c6499.f20065 == null) {
            return true;
        }
        PointF pointF = new PointF(motionEvent.getX() + c6499.getScrollX(), motionEvent.getY() + c6499.getScrollY());
        C6499.m17965(c6499, pointF);
        C16376 c16376 = c6499.f20065;
        C7246 c7246M38569 = c16376.m38569(pointF);
        if (c7246M38569 != null) {
            c16376.f50391 = c7246M38569.f22229;
        } else {
            c16376.f50391 = -1;
        }
        c6499.invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        InterfaceC23432 interfaceC23432;
        C6499 c6499 = this.f42948;
        if (c6499.f20065 == null || (interfaceC23432 = c6499.f20070) == null) {
            return;
        }
        PointF pointF = new PointF(motionEvent.getX() + c6499.getScrollX(), motionEvent.getY() + c6499.getScrollY());
        C6499.m17965(c6499, pointF);
        C7246 c7246M38569 = c6499.f20065.m38569(pointF);
        if (C16266.m38267(((C11329) interfaceC23432).f33902, (c7246M38569 == null || c7246M38569.f22234.isEmpty()) ? -1 : c7246M38569.f22229, motionEvent.getX(), motionEvent.getY())) {
            c6499.performHapticFeedback(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        C6499 c6499 = this.f42948;
        if (c6499.f20065 == null) {
            return true;
        }
        float f = 0.5f;
        if (c6499.f20075 >= 0.5f) {
            f = 1.0f;
            if (c6499.f20075 >= 1.0f) {
                f = 0.2f;
            }
        }
        ValueAnimator duration = ValueAnimator.ofFloat(c6499.f20075, f).setDuration(200L);
        final PointF pointF = new PointF();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܿۗܿ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MotionEvent motionEvent2 = motionEvent;
                float x = motionEvent2.getX();
                C6499 c64910 = this.f52384.f42948;
                float scrollX = x + c64910.getScrollX();
                float y = motionEvent2.getY() + c64910.getScrollY();
                PointF pointF2 = pointF;
                pointF2.set(scrollX, y);
                C6499.m17965(c64910, pointF2);
                c64910.f20075 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c64910.m17958(pointF2);
                c64910.scrollTo(C6499.m17955(c64910, (int) (pointF2.x - motionEvent2.getX())), C6499.m17963(c64910, (int) (pointF2.y - motionEvent2.getY())));
                c64910.invalidate();
            }
        });
        duration.start();
        return true;
    }
}
