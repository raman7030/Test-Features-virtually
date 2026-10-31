package l;

/* JADX INFO: renamed from: l.ۙۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4460 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f14217 = System.nanoTime();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13206() {
        C20813.m47630();
        if (System.nanoTime() - this.f14217 > 5000000000L) {
            throw C12221.m29712(EnumC19402.LIMIT, "Formatting time limit exceeded");
        }
    }
}
