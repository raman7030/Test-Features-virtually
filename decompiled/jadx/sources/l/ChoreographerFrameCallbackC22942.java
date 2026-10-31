package l;

import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.᩺ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC22942 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13769 f73925;

    public ChoreographerFrameCallbackC22942(C13769 c13769) {
        this.f73925 = c13769;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C7420 c7420 = this.f73925.f34752.f30889;
        c7420.m19944(SystemClock.uptimeMillis());
        if (c7420.f22798.size() > 0) {
            c7420.m19943().mo28543();
        }
    }
}
