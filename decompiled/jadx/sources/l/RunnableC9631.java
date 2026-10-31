package l;

/* JADX INFO: renamed from: l.ۢܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9631 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29189;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29190;

    public /* synthetic */ RunnableC9631(int i, Object obj) {
        this.f29189 = i;
        this.f29190 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29189) {
            case 0:
                RunnableC15979.m37780((RunnableC15979) this.f29190, true);
                break;
            default:
                C3926 c3926 = (C3926) this.f29190;
                if (c3926.f12514.f37302 == c3926 && !c3926.f12518) {
                    c3926.m11969((AbstractC3179) null, (Throwable) null);
                    break;
                }
                break;
        }
    }
}
