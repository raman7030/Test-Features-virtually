package l;

import android.app.Application;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۠ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8077 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceConnection f24881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Application f24882;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4549 f24883;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f24884;

    public /* synthetic */ RunnableC8077(C4549 c4549, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        this.f24883 = c4549;
        this.f24884 = atomicBoolean;
        this.f24882 = application;
        this.f24881 = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4549.m13371(this.f24883, this.f24884, this.f24882, this.f24881);
    }
}
