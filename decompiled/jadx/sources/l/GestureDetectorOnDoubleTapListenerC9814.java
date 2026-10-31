package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۢ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnDoubleTapListenerC9814 implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4169 f29668;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC9814(C4169 c4169) {
        this.f29668 = c4169;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f29668.f13598.f2452 = 0.0f;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C0640 c0640 = this.f29668.f13598;
        c0640.f2451 = false;
        c0640.m2648(motionEvent);
        return true;
    }
}
