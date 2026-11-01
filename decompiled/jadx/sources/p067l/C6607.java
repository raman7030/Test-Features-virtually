package p067l;

/* JADX INFO: renamed from: l.ۙۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6607 {

    /* JADX INFO: renamed from: ֫ */
    public final long f17041 = System.nanoTime();

    /* JADX INFO: renamed from: ֫ */
    public final void m15087() {
        C22149.m49958();
        if (System.nanoTime() - this.f17041 > 5000000000L) {
            throw C13983.m31774(EnumC20808.LIMIT, "Formatting time limit exceeded");
        }
    }
}
