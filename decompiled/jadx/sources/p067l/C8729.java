package p067l;

/* JADX INFO: renamed from: l.ۜۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 25QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8729 extends AbstractC9476 implements InterfaceC6741, InterfaceC3132 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f23673 = EnumC5850.Format22c;

    /* JADX INFO: renamed from: ۗ */
    public final int f23674;

    /* JADX INFO: renamed from: ۙ */
    public final int f23675;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC10250 f23676;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978() + ", " + getReference();
    }

    public C8729(EnumC3167 enumC3167, int i, int i2, InterfaceC10250 interfaceC10250) {
        super(enumC3167);
        C12981.m29767(i);
        this.f23675 = i;
        C12981.m29767(i2);
        this.f23674 = i2;
        this.f23676 = interfaceC10250;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f23675;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f23674;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        return this.f23676;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f23676 = c20765.m46903(this.f23676);
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f25973.f6092;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f23673;
    }
}
