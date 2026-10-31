package l;

/* JADX INFO: renamed from: l.۫᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12666 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9514 f38179;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38180;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f38181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1752 f38182;

    public /* synthetic */ RunnableC12666(RunnableC13371 runnableC13371, InterfaceC1752 interfaceC1752, Object obj, C9514 c9514) {
        this.f38181 = runnableC13371;
        this.f38182 = interfaceC1752;
        this.f38180 = obj;
        this.f38179 = c9514;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f38181;
        if (runnable != null) {
            runnable.run();
        }
        C9514 c9514 = this.f38179;
        Object obj = this.f38180;
        RunnableC14368 runnableC14368 = new RunnableC14368(1, c9514, obj);
        ((C19392) this.f38182).getClass();
        C1802.m5990(obj, 120000L, runnableC14368);
    }
}
