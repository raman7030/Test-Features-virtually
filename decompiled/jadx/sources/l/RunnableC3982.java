package l;

/* JADX INFO: renamed from: l.ۘܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z26I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3982 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12629;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12630;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12631;

    public /* synthetic */ RunnableC3982(int i, Object obj, Object obj2) {
        this.f12630 = i;
        this.f12631 = obj;
        this.f12629 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12630) {
            case 0:
                DialogInterfaceOnDismissListenerC8215.m21753((DialogInterfaceOnDismissListenerC8215) this.f12631, (InterfaceC17889) this.f12629);
                break;
            default:
                C14929.m35376((C14929) this.f12631, (RunnableC1000) this.f12629);
                break;
        }
    }
}
