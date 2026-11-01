package p067l;

/* JADX INFO: renamed from: l.᩺᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6NL */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24520 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15802 f77668;

    public RunnableC24520(C15802 c15802) {
        this.f77668 = c15802;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15802 c15802 = this.f77668;
        if (c15802.f45721) {
            return;
        }
        if (c15802.m35875()) {
            c15802.f45720.postDelayed(this, 200L);
        } else {
            c15802.m35872();
        }
    }
}
