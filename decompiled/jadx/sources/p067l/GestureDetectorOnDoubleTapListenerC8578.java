package p067l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۜۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R4JY */
/* JADX INFO: loaded from: classes2.dex */
public final class GestureDetectorOnDoubleTapListenerC8578 implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ᩸ */
    public ViewOnTouchListenerC19978 f23057;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC8578(ViewOnTouchListenerC19978 viewOnTouchListenerC19978) {
        this.f23057 = viewOnTouchListenerC19978;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f23057;
        if (viewOnTouchListenerC19978 == null) {
            return false;
        }
        viewOnTouchListenerC19978.m45351();
        this.f23057.getClass();
        this.f23057.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float fM45353 = this.f23057.m45353();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (fM45353 < this.f23057.m45350()) {
                ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f23057;
                viewOnTouchListenerC19978.m45341(viewOnTouchListenerC19978.m45350(), x, y, true);
                return true;
            }
            ViewOnTouchListenerC19978 viewOnTouchListenerC19979 = this.f23057;
            viewOnTouchListenerC19979.m45341(viewOnTouchListenerC19979.m45347(), x, y, true);
            return true;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }
}
