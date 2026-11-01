package p067l;

/* JADX INFO: renamed from: l.᩹ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23333 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3847 f73408;

    public RunnableC23333(C3847 c3847) {
        this.f73408 = c3847;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3847 c3847 = this.f73408;
        if (c3847.f8257 == null || !c3847.m7552()) {
            return;
        }
        AbstractC5462 abstractC5462 = c3847.f8257;
        if (abstractC5462 != null) {
            c3847.m7548(abstractC5462);
        }
        c3847.f8256.removeCallbacks(c3847.f8263);
        C14849 c14849 = c3847.f8256;
        int i = C1717.f57146;
        c14849.postOnAnimation(this);
    }
}
