package p067l;

/* JADX INFO: renamed from: l.ۨۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13338 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f37461;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37462;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f37463;

    public /* synthetic */ RunnableC13338(int i, int i2, Object obj) {
        this.f37462 = i2;
        this.f37463 = obj;
        this.f37461 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37462) {
            case 0:
                C9038.m20928((String[]) this.f37463, this.f37461);
                break;
            default:
                ActivityC17586.m40008((ActivityC17586) this.f37463, this.f37461);
                break;
        }
    }
}
