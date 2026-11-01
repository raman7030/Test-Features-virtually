package p067l;

/* JADX INFO: renamed from: l.۬᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15109 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14439 f43137;

    public /* synthetic */ RunnableC15109(C14439 c14439) {
        this.f43137 = c14439;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14439 c14439 = this.f43137;
        c14439.notifyItemRangeChanged(0, c14439.f41261.size());
    }
}
