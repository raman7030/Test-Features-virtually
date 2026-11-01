package p067l;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: l.ۖۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes2.dex */
public final class C4594 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: ֫ */
    public float f10314;

    /* JADX INFO: renamed from: ۧ */
    public float f10315;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C7276 f10316;

    public C4594(C7276 c7276) {
        this.f10316 = c7276;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f10314 = scaleGestureDetector.getFocusX();
        this.f10315 = scaleGestureDetector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX() - this.f10314;
        float focusY = scaleGestureDetector.getFocusY() - this.f10315;
        C7276 c7276 = this.f10316;
        c7276.m16656(focusX, focusY);
        this.f10314 = scaleGestureDetector.getFocusX();
        this.f10315 = scaleGestureDetector.getFocusY();
        C7276.m16660(c7276, scaleGestureDetector.getScaleFactor() * c7276.f18994, this.f10314, this.f10315);
        return true;
    }
}
