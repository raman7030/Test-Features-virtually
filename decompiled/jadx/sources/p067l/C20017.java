package p067l;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ᩴۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20017 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7276 f60845;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C20017(C7276 c7276) {
        this.f60845 = c7276;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C7276 c7276 = this.f60845;
        if (!c7276.f18988.isInProgress() && motionEvent2.getPointerCount() == 1) {
            c7276.m16656(-f, -f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C7276 c7276 = this.f60845;
        if (c7276.f18987) {
            return true;
        }
        c7276.f18982 = 0;
        c7276.f18985 = 0;
        double d = 536870911;
        c7276.f18978.fling(0, 0, (int) f, (int) (-f2), (int) Math.max(-536870911, ((1.0f - c7276.f18994) * c7276.getWidth()) - c7276.f18989), (int) (-c7276.f18989), (int) (-Math.min(d, (c7276.f19000 - c7276.m16670()) * ((double) c7276.f18994))), (int) Math.min(d, (c7276.m16682() - c7276.f19000) * ((double) c7276.f18994)));
        c7276.postInvalidateOnAnimation();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C7276 c7276 = this.f60845;
        if (c7276.f18977 != null && c7276.f18997 != null) {
            C2581 c2581 = (C2581) c7276.f18972.get(c7276.f18977.m24435(c7276.f19000 + ((double) (motionEvent.getY() / c7276.f18994))));
            if (c2581 != null) {
                int i = c2581.f4261;
                if (((C21831) c7276.f18997).m49255(i)) {
                    float fM24441 = (float) ((c7276.f18977.m24441(i) - c7276.f19000) * ((double) c7276.f18994));
                    if (c7276.f18992.m35226(motionEvent.getX(), motionEvent.getY(), c7276.getWidth() / 2.0f, (Math.min(c7276.getHeight(), ((float) (c7276.f18977.m24442(i) * ((double) c7276.f18994))) + fM24441) + Math.max(0.0f, fM24441)) / 2.0f)) {
                        if (c7276.f18984 != null) {
                            c7276.f18984.mo11380(i);
                            return true;
                        }
                    }
                }
            }
            if (c2581 != null) {
                int i2 = c2581.f4261;
                if (!((C21831) c7276.f18997).m49255(i2) && c2581.f4256) {
                    c7276.mo16694(i2);
                    return true;
                }
            }
            if (c7276.f18984 != null) {
                c7276.f18984.mo11377();
            }
        } else if (c7276.f18984 != null) {
            c7276.f18984.mo11377();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C7276 c7276 = this.f60845;
        float f = c7276.f18994;
        float f2 = c7276.f18994 > 1.01f ? 1.0f : 2.0f;
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        c7276.f18971 = ValueAnimator.ofFloat(f, f2);
        c7276.f18971.setDuration(180L);
        c7276.f18971.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۘۛۜ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7276.m16660(this.f14646.f60845, ((Float) valueAnimator.getAnimatedValue()).floatValue(), x, y);
            }
        });
        c7276.f18971.start();
        return true;
    }
}
