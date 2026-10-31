package l;

/* JADX INFO: renamed from: l.ۖ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2758 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4169 f8571;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f8572;

    public RunnableC2758(C4169 c4169, float f) {
        this.f8571 = c4169;
        this.f8572 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0640 c0640 = this.f8571.f13598;
        if (c0640.f2455.isFinished()) {
            return;
        }
        boolean zComputeScrollOffset = c0640.f2455.computeScrollOffset();
        int iCeil = ((int) Math.ceil(c0640.f2455.getCurrY() * this.f8572)) - c0640.f2473;
        c0640.m2622(iCeil);
        if (iCeil != 0) {
            if (iCeil < 0) {
                if (c0640.f2473 <= (-c0640.f2465.m41261().m7009())) {
                    c0640.f2462.onAbsorb((int) (c0640.f2455.getCurrVelocity() / 1.2f));
                    c0640.invalidate();
                    return;
                }
            } else if (c0640.f2473 >= 0) {
                c0640.f2480.onAbsorb((int) (c0640.f2455.getCurrVelocity() / 1.2f));
                c0640.invalidate();
                return;
            }
        }
        if (zComputeScrollOffset) {
            c0640.post(this);
        }
    }
}
