package p067l;

/* JADX INFO: renamed from: l.ۢܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FG */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11524 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10853 f32140;

    public RunnableC11524(C10853 c10853) {
        this.f32140 = c10853;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            long jM25005 = this.f32140.m25005(System.nanoTime());
            if (jM25005 == -1) {
                return;
            }
            if (jM25005 > 0) {
                long j = jM25005 / 1000000;
                long j2 = jM25005 - (1000000 * j);
                synchronized (this.f32140) {
                    try {
                        this.f32140.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
