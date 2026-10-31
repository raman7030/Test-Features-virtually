package l;

/* JADX INFO: renamed from: l.۟֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7117 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f21836;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21837;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC1618 f21838;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22639 f21839;

    public /* synthetic */ RunnableC7117(ServiceC1618 serviceC1618, C22639 c22639, String str, long j) {
        this.f21838 = serviceC1618;
        this.f21839 = c22639;
        this.f21837 = str;
        this.f21836 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceC1618.m5483(this.f21838, this.f21839, this.f21837, this.f21836);
    }
}
