package p067l;

/* JADX INFO: renamed from: l.ۢۤ */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1314 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC1489 f31842;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f31843;

    public RunnableC1314(InterfaceC1489 interfaceC1489, Object obj) {
        this.f31842 = interfaceC1489;
        this.f31843 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31842.accept(this.f31843);
    }
}
