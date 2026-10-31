package l;

/* JADX INFO: renamed from: l.ۗ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3486 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11048;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f11049;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11050;

    public RunnableC3486(C16560 c16560, int i, int i2) {
        this.f11049 = c16560;
        this.f11048 = i;
        this.f11050 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C16560 c16560 = this.f11049;
        if (this.f11048 != c16560.f50895.get()) {
            return;
        }
        if (c16560.m39040()) {
            C4925.m14315(this);
        } else {
            c16560.onItemClick(null, null, this.f11050, 0L);
        }
    }
}
