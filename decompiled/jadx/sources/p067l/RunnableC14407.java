package p067l;

/* JADX INFO: renamed from: l.۫᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC14407 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C11411 f41206;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f41207;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Runnable f41208;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC4034 f41209;

    public /* synthetic */ RunnableC14407(RunnableC15077 runnableC15077, InterfaceC4034 interfaceC4034, Object obj, C11411 c11411) {
        this.f41208 = runnableC15077;
        this.f41209 = interfaceC4034;
        this.f41207 = obj;
        this.f41206 = c11411;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f41208;
        if (runnable != null) {
            runnable.run();
        }
        C11411 c11411 = this.f41206;
        Object obj = this.f41207;
        RunnableC16024 runnableC16024 = new RunnableC16024(1, c11411, obj);
        ((C20799) this.f41209).getClass();
        C4081.m8187(obj, 120000L, runnableC16024);
    }
}
