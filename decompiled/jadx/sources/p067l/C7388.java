package p067l;

/* JADX INFO: renamed from: l.ۚۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05TY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7388 extends AbstractC9476 implements InterfaceC4215 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f19349 = EnumC5850.Format32x;

    /* JADX INFO: renamed from: ۙ */
    public final int f19350;

    /* JADX INFO: renamed from: ᩶ */
    public final int f19351;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978();
    }

    public C7388(EnumC3167 enumC3167, int i, int i2) {
        super(enumC3167);
        C12981.m29765(i);
        this.f19351 = i;
        C12981.m29765(i2);
        this.f19350 = i2;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f19351;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f19350;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f19349;
    }
}
