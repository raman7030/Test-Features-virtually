package p067l;

/* JADX INFO: renamed from: l.ۘۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U713 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6035 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f15115;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f15116;

    public /* synthetic */ RunnableC6035(int i, Object obj) {
        this.f15115 = i;
        this.f15116 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15115;
        Object obj = this.f15116;
        switch (i) {
            case 0:
                ((C20117) obj).postInvalidateOnAnimation();
                break;
            default:
                String str = ((String[]) obj)[1];
                C7350 c7350 = C9111.f24679;
                C13045.m29867(str, "orderId");
                new Thread(new RunnableC8368(5, str)).start();
                break;
        }
    }
}
