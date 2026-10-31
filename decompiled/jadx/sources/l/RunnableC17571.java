package l;

/* JADX INFO: renamed from: l.ܿ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17571 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53695;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11197 f53696;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53697;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53698;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53699;

    public /* synthetic */ RunnableC17571(Object obj, int i, C11197 c11197, Object obj2, int i2) {
        this.f53698 = i2;
        this.f53699 = obj;
        this.f53697 = i;
        this.f53696 = c11197;
        this.f53695 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53698) {
            case 0:
                C6988.m18894((C6988) this.f53699, this.f53697, this.f53696, (C8441) this.f53695);
                break;
            default:
                C21658.m48919((C21658) this.f53699, this.f53697, this.f53696, (Exception) this.f53695);
                break;
        }
    }
}
