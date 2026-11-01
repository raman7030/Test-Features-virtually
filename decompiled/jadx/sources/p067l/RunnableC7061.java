package p067l;

/* JADX INFO: renamed from: l.ۙ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7061 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC12426 f18401;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f18402;

    public RunnableC7061(ActivityC12426 activityC12426, String str) {
        this.f18401 = activityC12426;
        this.f18402 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityC12426 activityC12426 = this.f18401;
        if (activityC12426.isFinishing()) {
            return;
        }
        C19131 c19131M43346 = activityC12426.f34734.f41247.m43346();
        if (c19131M43346 == null || c19131M43346.m43503() == 0) {
            C7050.m16212(this);
        } else {
            activityC12426.f34734.f41247.m10778(this.f18402.toString());
        }
    }
}
