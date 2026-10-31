package l;

/* JADX INFO: renamed from: l.ۢۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9563 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22097 f29019;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29020;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0930 f29021;

    public /* synthetic */ RunnableC9563(InterfaceC0930 interfaceC0930, C22097 c22097, int i) {
        this.f29020 = i;
        this.f29021 = interfaceC0930;
        this.f29019 = c22097;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29020) {
            case 0:
                C5329.m15272((C5329) this.f29021, this.f29019);
                break;
            default:
                C10328.m26114((C10328) this.f29021, this.f29019);
                break;
        }
    }
}
