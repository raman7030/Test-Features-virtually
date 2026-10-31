package l;

/* JADX INFO: renamed from: l.۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12541 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f37668;

    public RunnableC12541(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f37668 = layoutInflaterFactory2C5402;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f37668;
        if ((layoutInflaterFactory2C5402.f16824 & 1) != 0) {
            layoutInflaterFactory2C5402.m15473(0);
        }
        if ((layoutInflaterFactory2C5402.f16824 & 4096) != 0) {
            layoutInflaterFactory2C5402.m15473(108);
        }
        layoutInflaterFactory2C5402.f16844 = false;
        layoutInflaterFactory2C5402.f16824 = 0;
    }
}
