package p067l;

import android.app.Application;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۠ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1X5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10045 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ServiceConnection f27793;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Application f27794;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6692 f27795;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AtomicBoolean f27796;

    public /* synthetic */ RunnableC10045(C6692 c6692, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        this.f27795 = c6692;
        this.f27796 = atomicBoolean;
        this.f27794 = application;
        this.f27793 = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6692.m15259(this.f27795, this.f27796, this.f27794, this.f27793);
    }
}
