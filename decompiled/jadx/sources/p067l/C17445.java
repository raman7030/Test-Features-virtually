package p067l;

/* JADX INFO: renamed from: l.ܺۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S53J */
/* JADX INFO: loaded from: classes5.dex */
public final class C17445 extends AbstractC9476 implements InterfaceC12106 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f52173 = EnumC5850.Format22x;

    /* JADX INFO: renamed from: ۙ */
    public final int f52174;

    /* JADX INFO: renamed from: ᩶ */
    public final int f52175;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978();
    }

    public C17445(EnumC3167 enumC3167, int i, int i2) {
        super(enumC3167);
        C12981.m29763(i);
        this.f52175 = i;
        C12981.m29765(i2);
        this.f52174 = i2;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f52175;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f52174;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f52173;
    }
}
