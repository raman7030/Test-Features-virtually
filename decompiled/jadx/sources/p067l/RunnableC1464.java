package p067l;

/* JADX INFO: renamed from: l.۫ܿ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1464 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f40694;

    public RunnableC1464(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f40694 = layoutInflaterFactory2C1110;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f40694;
        if ((layoutInflaterFactory2C1110.f19662 & 1) != 0) {
            layoutInflaterFactory2C1110.m17384(0);
        }
        if ((layoutInflaterFactory2C1110.f19662 & 4096) != 0) {
            layoutInflaterFactory2C1110.m17384(108);
        }
        layoutInflaterFactory2C1110.f19682 = false;
        layoutInflaterFactory2C1110.f19662 = 0;
    }
}
