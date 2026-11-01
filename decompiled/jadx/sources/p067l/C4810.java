package p067l;

/* JADX INFO: renamed from: l.ۖܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4810 {

    /* JADX INFO: renamed from: ֫ */
    public final long f10913 = System.nanoTime();

    /* JADX INFO: renamed from: ֫ */
    public final void m10153() {
        if (Thread.currentThread().isInterrupted() || System.nanoTime() - this.f10913 > 5000000000L) {
            throw C7492.m17268(EnumC2797.LIMIT, "Formatting interrupted or time limit exceeded");
        }
    }
}
