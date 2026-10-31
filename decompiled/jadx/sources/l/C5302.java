package l;

/* JADX INFO: renamed from: l.ۚۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5302 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f16544;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f16545;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f16546;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f16547;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5302(C22235 c22235, int i, int i2) {
        super("OkHttp %s ping %08x%08x", c22235.f72148, Integer.valueOf(i), Integer.valueOf(i2));
        this.f16544 = c22235;
        this.f16545 = true;
        this.f16547 = i;
        this.f16546 = i2;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        this.f16544.m49925(this.f16547, this.f16546, this.f16545);
    }
}
