package p067l;

/* JADX INFO: renamed from: l.۟֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9132 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ long f24715;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f24716;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ServiceC3906 f24717;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23884 f24718;

    public /* synthetic */ RunnableC9132(ServiceC3906 serviceC3906, C23884 c23884, String str, long j) {
        this.f24717 = serviceC3906;
        this.f24718 = c23884;
        this.f24716 = str;
        this.f24715 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceC3906.m7713(this.f24717, this.f24718, this.f24716, this.f24715);
    }
}
