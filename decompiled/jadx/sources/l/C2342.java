package l;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: l.ۖۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2342 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f7523;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f7524;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5164 f7525;

    public C2342(C5164 c5164) {
        this.f7525 = c5164;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f7523 = scaleGestureDetector.getFocusX();
        this.f7524 = scaleGestureDetector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX() - this.f7523;
        float focusY = scaleGestureDetector.getFocusY() - this.f7524;
        C5164 c5164 = this.f7525;
        c5164.m14748(focusX, focusY);
        this.f7523 = scaleGestureDetector.getFocusX();
        this.f7524 = scaleGestureDetector.getFocusY();
        C5164.m14752(c5164, scaleGestureDetector.getScaleFactor() * c5164.f16155, this.f7523, this.f7524);
        return true;
    }
}
