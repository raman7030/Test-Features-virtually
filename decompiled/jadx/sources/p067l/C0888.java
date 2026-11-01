package p067l;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.֨ۛ */
/* JADX INFO: compiled from: C5P1 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0888 {

    /* JADX INFO: renamed from: ֫ */
    public final GestureDetector f6322;

    public C0888(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f6322 = new GestureDetector(context, onGestureListener, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5650(MotionEvent motionEvent) {
        return this.f6322.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5648() {
        this.f6322.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5649(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f6322.setOnDoubleTapListener(onDoubleTapListener);
    }
}
