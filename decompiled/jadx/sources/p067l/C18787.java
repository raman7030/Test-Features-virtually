package p067l;

/* JADX INFO: renamed from: l.ܿۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5ND */
/* JADX INFO: loaded from: classes5.dex */
public final class C18787 extends AbstractC9476 implements InterfaceC22835 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f56136 = EnumC5850.Format21s;

    /* JADX INFO: renamed from: ۙ */
    public final int f56137;

    /* JADX INFO: renamed from: ᩶ */
    public final int f56138;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", " + mo7162();
    }

    public C18787(EnumC3167 enumC3167, int i, int i2) {
        super(enumC3167);
        C12981.m29763(i);
        this.f56137 = i;
        C12981.m29769(i2);
        this.f56138 = i2;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f56137;
    }

    @Override // p067l.InterfaceC15202
    /* JADX INFO: renamed from: ۡ */
    public final int mo7161() {
        return this.f56138;
    }

    @Override // p067l.InterfaceC11436
    /* JADX INFO: renamed from: ᩸ */
    public final long mo7162() {
        return this.f56138;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f56136;
    }
}
