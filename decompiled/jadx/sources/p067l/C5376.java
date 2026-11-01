package p067l;

/* JADX INFO: renamed from: l.ۗۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X4UE */
/* JADX INFO: loaded from: classes3.dex */
public final class C5376 extends AbstractC9476 implements InterfaceC22321, InterfaceC3132 {

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC5850 f12763 = EnumC5850.Format4rcc;

    /* JADX INFO: renamed from: ۗ */
    public final int f12764;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC10250 f12765;

    /* JADX INFO: renamed from: ۬ */
    public final int f12766;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC10250 f12767;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " " + C9731.m22754(this) + ", " + getReference() + ", " + mo11754();
    }

    public C5376(EnumC3167 enumC3167, int i, int i2, InterfaceC10250 interfaceC10250, InterfaceC10250 interfaceC10251) {
        super(enumC3167);
        C12981.m29765(i);
        this.f12766 = i;
        C12981.m29771(i2);
        this.f12764 = i2;
        this.f12767 = interfaceC10250;
        this.f12765 = interfaceC10251;
    }

    @Override // p067l.InterfaceC18140
    /* JADX INFO: renamed from: ᩴ */
    public final int mo11756() {
        return this.f12766;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f12764;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        return this.f12767;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f12767 = c20765.m46903(this.f12767);
        this.f12765 = c20765.m46903(this.f12765);
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f25973.f6092;
    }

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC10250 mo11754() {
        return this.f12765;
    }

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۠ */
    public final int mo11755() {
        return this.f25973.f6091;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f12763;
    }
}
