package l;

/* JADX INFO: renamed from: l.᩹ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes.dex */
public final class C22099 extends C1875 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4460 f71760;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f71761;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22099(C1056 c1056, C4460 c4460) {
        super(c1056);
        this.f71760 = c4460;
    }

    @Override // l.C1875
    /* JADX INFO: renamed from: ܳ */
    public final int mo6205(int i) {
        this.f71760.m13206();
        if (size() >= 200000) {
            throw C12221.m29712(EnumC19402.LIMIT, "Token count limit exceeded");
        }
        return super.mo6205(Math.min(i, 200000 - size()));
    }

    @Override // l.C1875
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC0463 mo6211(int i) {
        int i2 = this.f71761 + 1;
        this.f71761 = i2;
        if ((i2 & 1023) == 0) {
            this.f71760.m13206();
        }
        return super.mo6211(i);
    }
}
