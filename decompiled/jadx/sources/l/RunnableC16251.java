package l;

/* JADX INFO: renamed from: l.ܺ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16251 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50000;

    public /* synthetic */ RunnableC16251(int i, Object obj) {
        this.f49999 = i;
        this.f50000 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49999) {
            case 0:
                C15545.m36665((C15545) this.f50000);
                break;
            case 1:
                ((C3318) this.f50000).m10145();
                break;
            default:
                ((InterfaceC17827) this.f50000).mo5457();
                break;
        }
    }
}
