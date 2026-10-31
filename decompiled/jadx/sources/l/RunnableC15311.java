package l;

/* JADX INFO: renamed from: l.ܶܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15311 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16723 f46960;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46961;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3318 f46962;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46963;

    public RunnableC15311(C3318 c3318, C16723 c16723, int i, int i2) {
        this.f46962 = c3318;
        this.f46960 = c16723;
        this.f46961 = i;
        this.f46963 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3318 c3318 = this.f46962;
        if (c3318.f10394 != this) {
            return;
        }
        c3318.f10394 = null;
        C21663 c21663 = c3318.f10397;
        int i = this.f46961;
        C16723 c16723 = this.f46960;
        if (c21663.m48930(i, c16723)) {
            C3318.m10132(c3318, c16723, this.f46963);
        }
    }
}
