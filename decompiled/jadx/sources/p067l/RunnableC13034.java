package p067l;

/* JADX INFO: renamed from: l.ۧ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13034 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f36659;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f36660;

    public /* synthetic */ RunnableC13034(int i, Object obj) {
        this.f36659 = i;
        this.f36660 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f36659;
        Object obj = this.f36660;
        switch (i) {
            case 0:
                C22422.m50364(((C13010) obj).f36613);
                break;
            default:
                C17391 c17391 = (C17391) obj;
                int i2 = ActivityC12088.f33683;
                if (c17391 != null) {
                    c17391.close();
                }
                break;
        }
    }
}
