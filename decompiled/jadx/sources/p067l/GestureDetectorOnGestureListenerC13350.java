package p067l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC13350 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f37478;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15360 f37479;

    /* JADX INFO: renamed from: ᩶ */
    public int f37480;

    /* JADX INFO: renamed from: ᩸ */
    public long f37481;

    /* JADX INFO: renamed from: ᩹ */
    public int f37482;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public GestureDetectorOnGestureListenerC13350(C15360 c15360, int i) {
        this.f37479 = c15360;
        this.f37478 = i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C15360 c15360 = this.f37479;
        c15360.scrollTo(c15360.getScrollX() + ((int) (f + 0.5f)), c15360.getScrollY() + ((int) (f2 + 0.5f)));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        long j = this.f37481;
        C15360 c15360 = this.f37479;
        if (j != 0) {
            long eventTime = motionEvent.getEventTime() - this.f37481;
            if (eventTime >= 40 && eventTime <= 300) {
                int x = this.f37482 - ((int) motionEvent.getX());
                int y = this.f37480 - ((int) motionEvent.getY());
                if ((y * y) + (x * x) < this.f37478) {
                    this.f37481 = 0L;
                    float fM34976 = c15360.m34976();
                    final int scrollX = c15360.getScrollX();
                    final int scrollY = c15360.getScrollY();
                    if (c15360.f43844 == fM34976) {
                        fM34976 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c15360.f43844, fM34976);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۛ۟ۜ
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C15360 c15361 = this.f20993.f37479;
                            c15361.f43844 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                            c15361.scrollTo((int) (scrollX * animatedFraction), (int) (scrollY * animatedFraction));
                            c15361.postInvalidateOnAnimation();
                        }
                    });
                    valueAnimatorOfFloat.start();
                    return true;
                }
            }
        }
        this.f37481 = motionEvent.getEventTime();
        this.f37482 = (int) motionEvent.getX();
        this.f37480 = (int) motionEvent.getY();
        int width = c15360.getWidth();
        int height = c15360.getHeight();
        int i = (int) ((c15360.f43856 * c15360.f43844) + 0.5f);
        int i2 = (int) ((c15360.f43860 * c15360.f43844) + 0.5f);
        float x2 = (motionEvent.getX() + c15360.getScrollX()) - ((width - i) / 2.0f);
        float y2 = (motionEvent.getY() + c15360.getScrollY()) - ((height - i2) / 2.0f);
        boolean z = x2 < ((float) (-c15360.f43865)) || y2 < ((float) (-c15360.f43865)) || x2 > ((float) (i + c15360.f43865)) || y2 > ((float) (i2 + c15360.f43865));
        C5303 c5303 = new C5303(c15360.f43844, c15360.f43865);
        int i3 = c15360.f43849;
        if (i3 == 0) {
            Iterator it = c15360.f43854.iterator();
            while (it.hasNext()) {
                c5303.m11483((C6644) it.next(), x2);
            }
            Iterator it2 = c15360.f43852.iterator();
            while (it2.hasNext()) {
                c5303.m11483((C6644) it2.next(), y2);
            }
        } else if (i3 == 1) {
            if (c15360.f43853 != null) {
                c5303.m11483(c15360.f43853, x2);
                c5303.m11483(c15360.f43851, y2);
            }
        } else if (i3 == 2 && c15360.f43871 != null) {
            c5303.m11483(c15360.f43871, x2);
            c5303.m11483(c15360.f43855, y2);
        }
        C14690 c14690 = (C14690) c5303.m11482();
        c15360.m34957(c14690);
        c15360.f43867 = c14690;
        c15360.f43872 = (c14690 == null && z) ? false : true;
        c15360.invalidate();
        return true;
    }
}
