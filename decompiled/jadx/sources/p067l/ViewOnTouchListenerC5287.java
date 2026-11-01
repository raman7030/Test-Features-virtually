package p067l;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۗۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58U6 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC5287 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC17356 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC6628 f12439;

    /* JADX INFO: renamed from: ᩹ */
    public final GestureDetector f12441;

    /* JADX INFO: renamed from: ۙ */
    public final PointF f12437 = new PointF();

    /* JADX INFO: renamed from: ᩸ */
    public final PointF f12440 = new PointF();

    /* JADX INFO: renamed from: ۗ */
    public final float f12436 = 25.0f;

    /* JADX INFO: renamed from: ۬ */
    public volatile float f12438 = 3.1415927f;

    public ViewOnTouchListenerC5287(Context context, InterfaceC6628 interfaceC6628) {
        this.f12439 = interfaceC6628;
        this.f12441 = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f12441.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f12437.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f12437.x) / this.f12436;
        float y = motionEvent2.getY();
        PointF pointF = this.f12437;
        float f3 = (y - pointF.y) / this.f12436;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f12438;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f12440;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        ((C22722) this.f12439).m50873(this.f12440);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((C22722) this.f12439).f71674.performClick();
    }

    @Override // p067l.InterfaceC17356
    /* JADX INFO: renamed from: ֫ */
    public final void mo11429(float f, float[] fArr) {
        this.f12438 = -f;
    }
}
