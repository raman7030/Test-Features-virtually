package p067l;

/* JADX INFO: renamed from: l.ᩴۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20120 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f62256;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62257;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f62258;

    public /* synthetic */ RunnableC20120(int i, int i2, Object obj) {
        this.f62257 = i2;
        this.f62258 = obj;
        this.f62256 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62257) {
            case 0:
                C14084.m31961((C14084) this.f62258, this.f62256);
                break;
            default:
                ((C0974) this.f62258).setItemChecked(this.f62256, true);
                break;
        }
    }
}
