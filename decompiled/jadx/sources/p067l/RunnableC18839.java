package p067l;

/* JADX INFO: renamed from: l.ܿۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18839 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final C13318 f56261;

    public RunnableC18839(C13318 c13318, C21545 c21545) {
        this.f56261 = c13318;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        try {
            C11164.m25768();
            z = false;
        } catch (Throwable unused) {
            z = true;
        }
        C7050.m16212(new Runnable(z) { // from class: l.ᩳۨܿ
            @Override // java.lang.Runnable
            public final void run() {
                C16156.m36782(this.f59427.f56261);
            }
        });
    }
}
