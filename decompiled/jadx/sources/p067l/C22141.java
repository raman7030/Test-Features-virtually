package p067l;

/* JADX INFO: renamed from: l.᩷ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5O2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22141 extends AbstractC9476 implements InterfaceC5400 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f70029 = EnumC5850.Format22cs;

    /* JADX INFO: renamed from: ۗ */
    public final int f70030;

    /* JADX INFO: renamed from: ۙ */
    public final int f70031;

    /* JADX INFO: renamed from: ᩶ */
    public final int f70032;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978() + ", " + mo16292();
    }

    public C22141(int i, int i2, int i3, EnumC3167 enumC3167) {
        super(enumC3167);
        C12981.m29767(i);
        this.f70031 = i;
        C12981.m29767(i2);
        this.f70030 = i2;
        this.f70032 = i3;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f70031;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f70030;
    }

    @Override // p067l.InterfaceC13862
    /* JADX INFO: renamed from: ܺ */
    public final int mo16292() {
        return this.f70032;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f70029;
    }
}
