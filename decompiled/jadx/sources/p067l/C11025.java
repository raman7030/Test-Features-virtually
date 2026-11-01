package p067l;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۡ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11025 {

    /* JADX INFO: renamed from: ֫ */
    public C0888 f30539;

    public C11025(Context context, C6331 c6331) {
        C0888 c0888 = new C0888(context, new C22425(c6331));
        this.f30539 = c0888;
        c0888.m5649(new GestureDetectorOnDoubleTapListenerC11696(c6331));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25421(MotionEvent motionEvent) {
        this.f30539.m5650(motionEvent);
    }
}
