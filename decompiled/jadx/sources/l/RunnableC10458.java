package l;

/* JADX INFO: renamed from: l.ۤᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10458 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f31394;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f31395;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18904 f31396;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f31397;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1264 f31398;

    public /* synthetic */ RunnableC10458(boolean z, C1264 c1264, C18904 c18904, String str, boolean[] zArr) {
        this.f31397 = z;
        this.f31398 = c1264;
        this.f31396 = c18904;
        this.f31395 = str;
        this.f31394 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f31397) {
            return;
        }
        this.f31398.m4324(this.f31396, this.f31395, this.f31394[0]);
    }
}
