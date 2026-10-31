package l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ᩴۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18570 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5164 f57622;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C18570(C5164 c5164) {
        this.f57622 = c5164;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C5164 c5164 = this.f57622;
        if (!c5164.f16149.isInProgress() && motionEvent2.getPointerCount() == 1) {
            c5164.m14748(-f, -f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C5164 c5164 = this.f57622;
        if (c5164.f16148) {
            return true;
        }
        c5164.f16143 = 0;
        c5164.f16146 = 0;
        double d = 536870911;
        c5164.f16139.fling(0, 0, (int) f, (int) (-f2), (int) Math.max(-536870911, ((1.0f - c5164.f16155) * c5164.getWidth()) - c5164.f16150), (int) (-c5164.f16150), (int) (-Math.min(d, (c5164.f16161 - c5164.m14762()) * ((double) c5164.f16155))), (int) Math.min(d, (c5164.m14774() - c5164.f16161) * ((double) c5164.f16155)));
        c5164.postInvalidateOnAnimation();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C5164 c5164 = this.f57622;
        if (c5164.f16138 != null && c5164.f16158 != null) {
            C0224 c0224 = (C0224) c5164.f16133.get(c5164.f16138.m22466(c5164.f16161 + ((double) (motionEvent.getY() / c5164.f16155))));
            if (c0224 != null) {
                int i = c0224.f1482;
                if (((C20478) c5164.f16158).m46932(i)) {
                    float fM22472 = (float) ((c5164.f16138.m22472(i) - c5164.f16161) * ((double) c5164.f16155));
                    if (c5164.f16153.m33110(motionEvent.getX(), motionEvent.getY(), c5164.getWidth() / 2.0f, (Math.min(c5164.getHeight(), ((float) (c5164.f16138.m22473(i) * ((double) c5164.f16155))) + fM22472) + Math.max(0.0f, fM22472)) / 2.0f)) {
                        if (c5164.f16145 != null) {
                            c5164.f16145.mo9338(i);
                            return true;
                        }
                    }
                }
            }
            if (c0224 != null) {
                int i2 = c0224.f1482;
                if (!((C20478) c5164.f16158).m46932(i2) && c0224.f1477) {
                    c5164.mo14786(i2);
                    return true;
                }
            }
            if (c5164.f16145 != null) {
                c5164.f16145.mo9335();
            }
        } else if (c5164.f16145 != null) {
            c5164.f16145.mo9335();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C5164 c5164 = this.f57622;
        float f = c5164.f16155;
        float f2 = c5164.f16155 > 1.01f ? 1.0f : 2.0f;
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        c5164.f16132 = ValueAnimator.ofFloat(f, f2);
        c5164.f16132.setDuration(180L);
        c5164.f16132.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۘۛۜ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5164.m14752(this.f11840.f57622, ((Float) valueAnimator.getAnimatedValue()).floatValue(), x, y);
            }
        });
        c5164.f16132.start();
        return true;
    }
}
