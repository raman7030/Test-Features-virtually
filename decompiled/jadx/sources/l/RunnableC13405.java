package l;

/* JADX INFO: renamed from: l.۬᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13405 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12700 f40067;

    public /* synthetic */ RunnableC13405(C12700 c12700) {
        this.f40067 = c12700;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12700 c12700 = this.f40067;
        c12700.notifyItemRangeChanged(0, c12700.f38233.size());
    }
}
