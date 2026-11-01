package p067l;

/* JADX INFO: renamed from: l.᩵ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20917 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C7014 f65697;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7014 f65698;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f65699;

    public RunnableC20917(C7014 c7014, C7014 c7015, boolean z, C0977 c0977) {
        this.f65697 = c7014;
        this.f65698 = c7015;
        this.f65699 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentCallbacksC11117 componentCallbacksC11117M16145 = this.f65697.m16145();
        ComponentCallbacksC11117 componentCallbacksC11117M16146 = this.f65698.m16145();
        AbstractC17742 abstractC17742 = C19755.f60104;
        if (this.f65699) {
            componentCallbacksC11117M16146.getEnterTransitionCallback();
        } else {
            componentCallbacksC11117M16145.getEnterTransitionCallback();
        }
    }
}
