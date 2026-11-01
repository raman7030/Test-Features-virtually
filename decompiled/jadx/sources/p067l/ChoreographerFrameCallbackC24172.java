package p067l;

import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.᩺ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC24172 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15454 f76655;

    public ChoreographerFrameCallbackC24172(C15454 c15454) {
        this.f76655 = c15454;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C9420 c9420 = this.f76655.f37751.f33850;
        c9420.m21918(SystemClock.uptimeMillis());
        if (c9420.f25711.size() > 0) {
            c9420.m21917().mo30591();
        }
    }
}
