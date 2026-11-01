package p067l;

/* JADX INFO: renamed from: l.ۖۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2589 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4706 extends AbstractC9476 implements InterfaceC8082 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f10639 = EnumC5850.Format23x;

    /* JADX INFO: renamed from: ۗ */
    public final int f10640;

    /* JADX INFO: renamed from: ۙ */
    public final int f10641;

    /* JADX INFO: renamed from: ᩶ */
    public final int f10642;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978() + ", v" + mo9979();
    }

    public C4706(int i, int i2, int i3, EnumC3167 enumC3167) {
        super(enumC3167);
        C12981.m29763(i);
        this.f10642 = i;
        C12981.m29763(i2);
        this.f10641 = i2;
        C12981.m29763(i3);
        this.f10640 = i3;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f10642;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f10641;
    }

    @Override // p067l.InterfaceC16128
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9979() {
        return this.f10640;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f10639;
    }
}
