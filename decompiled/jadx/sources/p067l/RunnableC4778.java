package p067l;

/* JADX INFO: renamed from: l.ۖ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4778 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10845;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f10846;

    public /* synthetic */ RunnableC4778(int i, Object obj) {
        this.f10845 = i;
        this.f10846 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10845;
        Object obj = this.f10846;
        switch (i) {
            case 0:
                int i2 = C9471.f25926;
                ((C9471) obj).m22057(false);
                break;
            default:
                C7050.m16212(new RunnableC17814(0, (C17143) obj));
                break;
        }
    }
}
