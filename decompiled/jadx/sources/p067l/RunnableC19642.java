package p067l;

/* JADX INFO: renamed from: l.ᩳܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19642 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f59697;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f59698;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f59699;

    public /* synthetic */ RunnableC19642(int i, Object obj, Object obj2) {
        this.f59698 = i;
        this.f59699 = obj;
        this.f59697 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59698) {
            case 0:
                InterfaceC22710 interfaceC22710 = (InterfaceC22710) this.f59699;
                C23380 c23380 = (C23380) this.f59697;
                interfaceC22710.mo24481(c23380.f74494, c23380.f74495);
                interfaceC22710.mo24483();
                break;
            case 1:
                C12617.m29026((C12617) this.f59699, this.f59697);
                break;
            default:
                C6696.m15282((C6696) this.f59699, (AbstractC3451) this.f59697);
                break;
        }
    }
}
