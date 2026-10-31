package l;

/* JADX INFO: renamed from: l.ܺ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC15790 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f48712;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13132 f48713;

    public RunnableC15790(C13132 c13132, int i) {
        this.f48712 = i;
        this.f48713 = c13132;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48713.smoothScrollToPosition(this.f48712);
    }
}
