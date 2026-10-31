package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.֡ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0518 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5458 f2170;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C18864 f2171;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC15334 f2172;

    public C0518(C5458 c5458, InterfaceC15334 interfaceC15334) {
        this.f2170 = c5458;
        this.f2172 = interfaceC15334;
        setPriority(10);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f2170.f16985.countDown();
        while (true) {
            LockSupport.park();
            if (this.f2170.f16988) {
                return;
            }
            this.f2172.mo4061(this.f2171);
            this.f2170.f16987.decrementAndGet();
        }
    }
}
