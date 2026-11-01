package p067l;

/* JADX INFO: renamed from: l.۟۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9494 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5471 f25999;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ DialogInterfaceC2564 f26000;

    public /* synthetic */ RunnableC9494(C5471 c5471, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f25999 = c5471;
        this.f26000 = dialogInterfaceC2564;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f25999.m12039()) {
            return;
        }
        this.f26000.dismiss();
    }
}
