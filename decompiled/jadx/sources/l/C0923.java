package l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5P1 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0923 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final GestureDetector f3547;

    public C0923(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f3547 = new GestureDetector(context, onGestureListener, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3331(MotionEvent motionEvent) {
        return this.f3547.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3329() {
        this.f3547.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3330(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f3547.setOnDoubleTapListener(onDoubleTapListener);
    }
}
