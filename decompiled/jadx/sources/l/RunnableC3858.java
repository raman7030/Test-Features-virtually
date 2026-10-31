package l;

/* JADX INFO: renamed from: l.ۘۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U713 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3858 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12308;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12309;

    public /* synthetic */ RunnableC3858(int i, Object obj) {
        this.f12308 = i;
        this.f12309 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12308;
        Object obj = this.f12309;
        switch (i) {
            case 0:
                ((C18675) obj).postInvalidateOnAnimation();
                break;
            default:
                String str = ((String[]) obj)[1];
                C5242 c5242 = C7094.f21798;
                C11233.m27805(str, "orderId");
                new Thread(new RunnableC6312(5, str)).start();
                break;
        }
    }
}
