package l;

/* JADX INFO: renamed from: l.ᩳۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17872 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54584;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f54585;

    public /* synthetic */ RunnableC17872(C12392 c12392, int i) {
        this.f54584 = i;
        this.f54585 = c12392;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54584) {
            case 0:
                C12392.m30204(this.f54585);
                break;
            default:
                this.f54585.requestFocus();
                break;
        }
    }
}
