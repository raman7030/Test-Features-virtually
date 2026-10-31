package l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC11555 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13670 f34482;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34483;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f34484;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34485;

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

    public GestureDetectorOnGestureListenerC11555(C13670 c13670, int i) {
        this.f34482 = c13670;
        this.f34481 = i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C13670 c13670 = this.f34482;
        c13670.scrollTo(c13670.getScrollX() + ((int) (f + 0.5f)), c13670.getScrollY() + ((int) (f2 + 0.5f)));
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        long j = this.f34484;
        C13670 c13670 = this.f34482;
        if (j != 0) {
            long eventTime = motionEvent.getEventTime() - this.f34484;
            if (eventTime >= 40 && eventTime <= 300) {
                int x = this.f34485 - ((int) motionEvent.getX());
                int y = this.f34483 - ((int) motionEvent.getY());
                if ((y * y) + (x * x) < this.f34481) {
                    this.f34484 = 0L;
                    float fM32861 = c13670.m32861();
                    final int scrollX = c13670.getScrollX();
                    final int scrollY = c13670.getScrollY();
                    if (c13670.f40763 == fM32861) {
                        fM32861 = 1.0f;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c13670.f40763, fM32861);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۛ۟ۜ
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C13670 c13671 = this.f18138.f34482;
                            c13671.f40763 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                            c13671.scrollTo((int) (scrollX * animatedFraction), (int) (scrollY * animatedFraction));
                            c13671.postInvalidateOnAnimation();
                        }
                    });
                    valueAnimatorOfFloat.start();
                    return true;
                }
            }
        }
        this.f34484 = motionEvent.getEventTime();
        this.f34485 = (int) motionEvent.getX();
        this.f34483 = (int) motionEvent.getY();
        int width = c13670.getWidth();
        int height = c13670.getHeight();
        int i = (int) ((c13670.f40775 * c13670.f40763) + 0.5f);
        int i2 = (int) ((c13670.f40779 * c13670.f40763) + 0.5f);
        float x2 = (motionEvent.getX() + c13670.getScrollX()) - ((width - i) / 2.0f);
        float y2 = (motionEvent.getY() + c13670.getScrollY()) - ((height - i2) / 2.0f);
        boolean z = x2 < ((float) (-c13670.f40784)) || y2 < ((float) (-c13670.f40784)) || x2 > ((float) (i + c13670.f40784)) || y2 > ((float) (i2 + c13670.f40784));
        C3088 c3088 = new C3088(c13670.f40763, c13670.f40784);
        int i3 = c13670.f40768;
        if (i3 == 0) {
            Iterator it = c13670.f40773.iterator();
            while (it.hasNext()) {
                c3088.m9440((C4499) it.next(), x2);
            }
            Iterator it2 = c13670.f40771.iterator();
            while (it2.hasNext()) {
                c3088.m9440((C4499) it2.next(), y2);
            }
        } else if (i3 == 1) {
            if (c13670.f40772 != null) {
                c3088.m9440(c13670.f40772, x2);
                c3088.m9440(c13670.f40770, y2);
            }
        } else if (i3 == 2 && c13670.f40790 != null) {
            c3088.m9440(c13670.f40790, x2);
            c3088.m9440(c13670.f40774, y2);
        }
        C12965 c12965 = (C12965) c3088.m9439();
        c13670.m32842(c12965);
        c13670.f40786 = c12965;
        c13670.f40791 = (c12965 == null && z) ? false : true;
        c13670.invalidate();
        return true;
    }
}
