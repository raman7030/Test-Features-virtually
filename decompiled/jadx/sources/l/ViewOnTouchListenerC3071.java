package l;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۗۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58U6 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC3071 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC15770 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC4482 f9636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final GestureDetector f9638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PointF f9634 = new PointF();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final PointF f9637 = new PointF();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float f9633 = 25.0f;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile float f9635 = 3.1415927f;

    public ViewOnTouchListenerC3071(Context context, InterfaceC4482 interfaceC4482) {
        this.f9636 = interfaceC4482;
        this.f9638 = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9638.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f9634.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f9634.x) / this.f9633;
        float y = motionEvent2.getY();
        PointF pointF = this.f9634;
        float f3 = (y - pointF.y) / this.f9633;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f9635;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f9637;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        ((C21416) this.f9636).m48537(this.f9637);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((C21416) this.f9636).f68976.performClick();
    }

    @Override // l.InterfaceC15770
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9387(float f, float[] fArr) {
        this.f9635 = -f;
    }
}
