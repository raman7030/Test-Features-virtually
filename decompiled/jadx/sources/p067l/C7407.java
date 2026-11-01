package p067l;

/* JADX INFO: renamed from: l.ۚۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7407 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C23500 f19381;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f19382;

    /* JADX INFO: renamed from: ᩶ */
    public final int f19383;

    /* JADX INFO: renamed from: ᩹ */
    public final int f19384;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7407(C23500 c23500, int i, int i2) {
        super("OkHttp %s ping %08x%08x", c23500.f74873, Integer.valueOf(i), Integer.valueOf(i2));
        this.f19381 = c23500;
        this.f19382 = true;
        this.f19384 = i;
        this.f19383 = i2;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        this.f19381.m52253(this.f19384, this.f19383, this.f19382);
    }
}
