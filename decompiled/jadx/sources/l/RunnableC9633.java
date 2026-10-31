package l;

/* JADX INFO: renamed from: l.ۢܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FG */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9633 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8927 f29191;

    public RunnableC9633(C8927 c8927) {
        this.f29191 = c8927;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            long jM23031 = this.f29191.m23031(System.nanoTime());
            if (jM23031 == -1) {
                return;
            }
            if (jM23031 > 0) {
                long j = jM23031 / 1000000;
                long j2 = jM23031 - (1000000 * j);
                synchronized (this.f29191) {
                    try {
                        this.f29191.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
