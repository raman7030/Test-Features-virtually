package l;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: l.ۚۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VZ */
/* JADX INFO: loaded from: classes2.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC5123 implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0889 f16043;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public ScaleGestureDetectorOnScaleGestureListenerC5123(C0889 c0889) {
        this.f16043 = c0889;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f16043.f3459.m43062(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }
}
