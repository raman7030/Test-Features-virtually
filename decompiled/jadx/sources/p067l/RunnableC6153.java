package p067l;

/* JADX INFO: renamed from: l.ۘܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z26I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6153 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f15440;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f15441;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f15442;

    public /* synthetic */ RunnableC6153(int i, Object obj, Object obj2) {
        this.f15441 = i;
        this.f15442 = obj;
        this.f15440 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15441) {
            case 0:
                DialogInterfaceOnDismissListenerC10176.m23722((DialogInterfaceOnDismissListenerC10176) this.f15442, (InterfaceC19370) this.f15440);
                break;
            default:
                C16557.m37528((C16557) this.f15442, (RunnableC3319) this.f15440);
                break;
        }
    }
}
