package p067l;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: l.ۚۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VZ */
/* JADX INFO: loaded from: classes2.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC7237 implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C3213 f18877;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ScaleGestureDetectorOnScaleGestureListenerC7237(C3213 c3213) {
        this.f18877 = c3213;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f18877.f6232.m45340(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }
}
