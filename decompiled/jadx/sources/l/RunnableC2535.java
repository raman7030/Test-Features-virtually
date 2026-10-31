package l;

/* JADX INFO: renamed from: l.ۖ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2535 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8055;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f8056;

    public /* synthetic */ RunnableC2535(int i, Object obj) {
        this.f8055 = i;
        this.f8056 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8055;
        Object obj = this.f8056;
        switch (i) {
            case 0:
                int i2 = C7473.f23014;
                ((C7473) obj).m20082(false);
                break;
            default:
                C4925.m14315(new RunnableC16251(0, (C15545) obj));
                break;
        }
    }
}
