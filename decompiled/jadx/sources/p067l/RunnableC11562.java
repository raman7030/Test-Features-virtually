package p067l;

/* JADX INFO: renamed from: l.ۢܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11562 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23631 f32225;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C11084 f32226;

    public RunnableC11562(C23631 c23631, C11084 c11084) {
        this.f32225 = c23631;
        this.f32226 = c11084;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f32226.m25532()) {
            C23631 c23631 = this.f32225;
            if (c23631.m7643()) {
                return;
            }
            if (c23631.f75233) {
                c23631.m52511();
            } else {
                C7050.m16213(this, 100L);
            }
        }
    }
}
