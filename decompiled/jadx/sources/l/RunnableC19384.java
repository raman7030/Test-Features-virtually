package l;

/* JADX INFO: renamed from: l.᩵ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19384 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62739;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62740;

    public /* synthetic */ RunnableC19384(int i, Object obj) {
        this.f62739 = i;
        this.f62740 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f62739;
        Object obj = this.f62740;
        switch (i) {
            case 0:
                C12327.m29907((C12327) obj);
                break;
            case 1:
                ((C16609) obj).f51019.setVisibility(0);
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
