package p067l;

/* JADX INFO: renamed from: l.ۖ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4990 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6331 f11365;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ float f11366;

    public RunnableC4990(C6331 c6331, float f) {
        this.f11365 = c6331;
        this.f11366 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2977 c2977 = this.f11365.f16411;
        if (c2977.f5227.isFinished()) {
            return;
        }
        boolean zComputeScrollOffset = c2977.f5227.computeScrollOffset();
        int iCeil = ((int) Math.ceil(c2977.f5227.getCurrY() * this.f11366)) - c2977.f5245;
        c2977.m4962(iCeil);
        if (iCeil != 0) {
            if (iCeil < 0) {
                if (c2977.f5245 <= (-c2977.f5237.m43507().m9120())) {
                    c2977.f5234.onAbsorb((int) (c2977.f5227.getCurrVelocity() / 1.2f));
                    c2977.invalidate();
                    return;
                }
            } else if (c2977.f5245 >= 0) {
                c2977.f5252.onAbsorb((int) (c2977.f5227.getCurrVelocity() / 1.2f));
                c2977.invalidate();
                return;
            }
        }
        if (zComputeScrollOffset) {
            c2977.post(this);
        }
    }
}
