package l;

/* JADX INFO: renamed from: l.ᩳܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18175 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56483;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56484;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56485;

    public /* synthetic */ RunnableC18175(int i, Object obj, Object obj2) {
        this.f56484 = i;
        this.f56485 = obj;
        this.f56483 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56484) {
            case 0:
                InterfaceC21403 interfaceC21403 = (InterfaceC21403) this.f56485;
                C22108 c22108 = (C22108) this.f56483;
                interfaceC21403.mo22512(c22108.f71772, c22108.f71773);
                interfaceC21403.mo22514();
                break;
            case 1:
                C10784.m26981((C10784) this.f56485, this.f56483);
                break;
            default:
                C4553.m13394((C4553) this.f56485, (AbstractC1139) this.f56483);
                break;
        }
    }
}
