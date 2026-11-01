package p067l;

/* JADX INFO: renamed from: l.ۢܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11522 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32136;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f32137;

    public /* synthetic */ RunnableC11522(int i, Object obj) {
        this.f32136 = i;
        this.f32137 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32136) {
            case 0:
                RunnableC17555.m39964((RunnableC17555) this.f32137, true);
                break;
            default:
                C6100 c6100 = (C6100) this.f32137;
                if (c6100.f15321.f40319 == c6100 && !c6100.f15325) {
                    c6100.m13889((AbstractC5390) null, (Throwable) null);
                    break;
                }
                break;
        }
    }
}
