package p067l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.֡ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2861 extends Thread {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C7556 f4943;

    /* JADX INFO: renamed from: ᩸ */
    public volatile C20297 f4944;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16942 f4945;

    public C2861(C7556 c7556, InterfaceC16942 interfaceC16942) {
        this.f4943 = c7556;
        this.f4945 = interfaceC16942;
        setPriority(10);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f4943.f19826.countDown();
        while (true) {
            LockSupport.park();
            if (this.f4943.f19829) {
                return;
            }
            this.f4945.mo6305(this.f4944);
            this.f4943.f19828.decrementAndGet();
        }
    }
}
