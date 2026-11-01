package p067l;

/* JADX INFO: renamed from: l.ܶ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17056 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f50441;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f50442;

    public /* synthetic */ RunnableC17056(int i, Object obj) {
        this.f50441 = i;
        this.f50442 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50441) {
            case 0:
                ((InterfaceC12364) this.f50442).m28459();
                break;
            case 1:
                C14742.m33685(((C6891) this.f50442).f17938);
                break;
            default:
                ((AbstractC5520) this.f50442).cancel();
                break;
        }
    }
}
