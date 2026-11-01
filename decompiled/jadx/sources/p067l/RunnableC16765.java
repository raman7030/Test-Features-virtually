package p067l;

/* JADX INFO: renamed from: l.ܶۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16765 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f49411;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f49412;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f49413;

    public /* synthetic */ RunnableC16765(int i, Object obj, Object obj2) {
        this.f49412 = i;
        this.f49413 = obj;
        this.f49411 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49412) {
            case 0:
                ((C14084) this.f49413).m31959((String) this.f49411, true);
                break;
            case 1:
                C13146.m30067((C13146) this.f49413, (AbstractC3451) this.f49411);
                break;
            default:
                C25026.m54951((C25026) this.f49413, (ActivityC18686) this.f49411);
                break;
        }
    }
}
