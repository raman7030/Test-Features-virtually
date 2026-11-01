package p067l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۡۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10590 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnTouchListenerC19978 f29326;

    public C10590(ViewOnTouchListenerC19978 viewOnTouchListenerC19978) {
        this.f29326 = viewOnTouchListenerC19978;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f29326;
        if (viewOnTouchListenerC19978.f60629 != null) {
            viewOnTouchListenerC19978.f60629.onLongClick(viewOnTouchListenerC19978.m45351());
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f29326;
        if (viewOnTouchListenerC19978.m45353() > 1.0f) {
            return false;
        }
        viewOnTouchListenerC19978.getClass();
        return false;
    }
}
