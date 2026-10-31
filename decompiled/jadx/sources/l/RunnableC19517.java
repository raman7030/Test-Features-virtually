package l;

/* JADX INFO: renamed from: l.᩵ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19517 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f63077;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4888 f63078;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63079;

    public RunnableC19517(C4888 c4888, C4888 c4889, boolean z, C2727 c2727) {
        this.f63077 = c4888;
        this.f63078 = c4889;
        this.f63079 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentCallbacksC9205 componentCallbacksC9205M14248 = this.f63077.m14248();
        ComponentCallbacksC9205 componentCallbacksC9205M14249 = this.f63078.m14248();
        AbstractC16176 abstractC16176 = C18294.f56886;
        if (this.f63079) {
            componentCallbacksC9205M14249.getEnterTransitionCallback();
        } else {
            componentCallbacksC9205M14248.getEnterTransitionCallback();
        }
    }
}
