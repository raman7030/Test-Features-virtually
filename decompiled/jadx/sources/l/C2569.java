package l;

/* JADX INFO: renamed from: l.ۖܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2569 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f8123 = System.nanoTime();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8120() {
        if (Thread.currentThread().isInterrupted() || System.nanoTime() - this.f8123 > 5000000000L) {
            throw C5391.m15357(EnumC0451.LIMIT, "Formatting interrupted or time limit exceeded");
        }
    }
}
