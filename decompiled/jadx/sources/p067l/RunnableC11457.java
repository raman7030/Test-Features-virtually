package p067l;

/* JADX INFO: renamed from: l.ۢۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11457 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C23369 f31966;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f31967;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC3252 f31968;

    public /* synthetic */ RunnableC11457(InterfaceC3252 interfaceC3252, C23369 c23369, int i) {
        this.f31967 = i;
        this.f31968 = interfaceC3252;
        this.f31966 = c23369;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31967) {
            case 0:
                C7433.m17179((C7433) this.f31968, this.f31966);
                break;
            default:
                C12184.m28139((C12184) this.f31968, this.f31966);
                break;
        }
    }
}
