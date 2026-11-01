package p067l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۢ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnDoubleTapListenerC11696 implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6331 f32619;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC11696(C6331 c6331) {
        this.f32619 = c6331;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f32619.f16411.f5224 = 0.0f;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C2977 c2977 = this.f32619.f16411;
        c2977.f5223 = false;
        c2977.m4988(motionEvent);
        return true;
    }
}
