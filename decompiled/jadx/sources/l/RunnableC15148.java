package l;

/* JADX INFO: renamed from: l.ܶۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC15148 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46292;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46293;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46294;

    public /* synthetic */ RunnableC15148(int i, Object obj, Object obj2) {
        this.f46293 = i;
        this.f46294 = obj;
        this.f46292 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46293) {
            case 0:
                ((C12327) this.f46294).m29899((String) this.f46292, true);
                break;
            case 1:
                C11339.m28006((C11339) this.f46294, (AbstractC1139) this.f46292);
                break;
            default:
                C23840.m52542((C23840) this.f46294, (ActivityC17169) this.f46292);
                break;
        }
    }
}
