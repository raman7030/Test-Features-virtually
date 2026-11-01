package p067l;

/* JADX INFO: renamed from: l.᩹ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23371 extends C4150 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C6607 f74480;

    /* JADX INFO: renamed from: ܿ */
    public int f74481;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23371(C3372 c3372, C6607 c6607) {
        super(c3372);
        this.f74480 = c6607;
    }

    @Override // p067l.C4150
    /* JADX INFO: renamed from: ܳ */
    public final int mo8407(int i) {
        this.f74480.m15087();
        if (size() >= 200000) {
            throw C13983.m31774(EnumC20808.LIMIT, "Token count limit exceeded");
        }
        return super.mo8407(Math.min(i, 200000 - size()));
    }

    @Override // p067l.C4150
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC2808 mo8413(int i) {
        int i2 = this.f74481 + 1;
        this.f74481 = i2;
        if ((i2 & 1023) == 0) {
            this.f74480.m15087();
        }
        return super.mo8413(i);
    }
}
