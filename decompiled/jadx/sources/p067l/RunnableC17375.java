package p067l;

/* JADX INFO: renamed from: l.ܺ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17375 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final int f51851;

    /* JADX INFO: renamed from: ᩹ */
    public final C14849 f51852;

    public RunnableC17375(C14849 c14849, int i) {
        this.f51851 = i;
        this.f51852 = c14849;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f51852.smoothScrollToPosition(this.f51851);
    }
}
