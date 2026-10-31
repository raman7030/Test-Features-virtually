package l;

/* JADX INFO: renamed from: l.᩹ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22059 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1556 f70691;

    public RunnableC22059(C1556 c1556) {
        this.f70691 = c1556;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1556 c1556 = this.f70691;
        if (c1556.f5476 == null || !c1556.m5323()) {
            return;
        }
        AbstractC3255 abstractC3255 = c1556.f5476;
        if (abstractC3255 != null) {
            c1556.m5319(abstractC3255);
        }
        c1556.f5475.removeCallbacks(c1556.f5482);
        C13132 c13132 = c1556.f5475;
        int i = C17648.f53953;
        c13132.postOnAnimation(this);
    }
}
