package l;

/* JADX INFO: renamed from: l.۬۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12987 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5932 f38899;

    public RunnableC12987(C5932 c5932) {
        this.f38899 = c5932;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5932 c5932 = this.f38899;
        if (c5932.f18179 && c5932.f18202) {
            long jNanoTime = System.nanoTime();
            c5932.f18199.m6255(c5932.f18176 == 0 ? 0.016666668f : (jNanoTime - c5932.f18176) * 1.0E-9f);
            c5932.f18176 = jNanoTime;
            c5932.m16626(c5932.f18199.f6421, c5932.f18199.f6425);
            if (c5932.f18199.m6257()) {
                c5932.f18192.postOnAnimation(this);
            } else {
                c5932.m16643();
            }
        }
    }
}
