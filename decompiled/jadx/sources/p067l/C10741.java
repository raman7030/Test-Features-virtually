package p067l;

/* JADX INFO: renamed from: l.ۡۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10741 extends AbstractC4093 implements InterfaceC14117 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f29760 = EnumC5850.Format22t;

    /* JADX INFO: renamed from: ۗ */
    public final int f29761;

    /* JADX INFO: renamed from: ۙ */
    public final int f29762;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978() + ", " + mo5147();
    }

    public C10741(EnumC3167 enumC3167, int i, int i2, C18845 c18845) {
        super(enumC3167, c18845);
        C12981.m29767(i);
        this.f29762 = i;
        C12981.m29767(i2);
        this.f29761 = i2;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f29762;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f29761;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f29760;
    }
}
