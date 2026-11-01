package p067l;

/* JADX INFO: renamed from: l.ܿ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19068 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Object f56885;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C13010 f56886;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f56887;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f56888;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f56889;

    public /* synthetic */ RunnableC19068(Object obj, int i, C13010 c13010, Object obj2, int i2) {
        this.f56888 = i2;
        this.f56889 = obj;
        this.f56887 = i;
        this.f56886 = c13010;
        this.f56885 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56888) {
            case 0:
                C9010.m20848((C9010) this.f56889, this.f56887, this.f56886, (C10391) this.f56885);
                break;
            default:
                C22952.m51268((C22952) this.f56889, this.f56887, this.f56886, (Exception) this.f56885);
                break;
        }
    }
}
