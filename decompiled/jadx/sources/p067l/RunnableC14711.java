package p067l;

/* JADX INFO: renamed from: l.۬۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC14711 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8006 f41945;

    public RunnableC14711(C8006 c8006) {
        this.f41945 = c8006;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8006 c8006 = this.f41945;
        if (c8006.f21033 && c8006.f21056) {
            long jNanoTime = System.nanoTime();
            c8006.f21053.m8457(c8006.f21030 == 0 ? 0.016666668f : (jNanoTime - c8006.f21030) * 1.0E-9f);
            c8006.f21030 = jNanoTime;
            c8006.m18552(c8006.f21053.f9202, c8006.f21053.f9206);
            if (c8006.f21053.m8459()) {
                c8006.f21046.postOnAnimation(this);
            } else {
                c8006.m18569();
            }
        }
    }
}
