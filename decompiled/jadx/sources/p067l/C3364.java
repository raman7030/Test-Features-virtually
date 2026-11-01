package p067l;

/* JADX INFO: renamed from: l.֨ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L4S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3364 extends AbstractC9476 implements InterfaceC12933, InterfaceC3132 {

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC5850 f6639 = EnumC5850.Format35c;

    /* JADX INFO: renamed from: ۗ */
    public final int f6640;

    /* JADX INFO: renamed from: ۙ */
    public final int f6641;

    /* JADX INFO: renamed from: ۛ */
    public final int f6642;

    /* JADX INFO: renamed from: ۤ */
    public final int f6643;

    /* JADX INFO: renamed from: ۫ */
    public final int f6644;

    /* JADX INFO: renamed from: ۬ */
    public final int f6645;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC10250 f6646;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " " + C9731.m22753(this) + ", " + getReference();
    }

    public C3364(EnumC3167 enumC3167, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC10250 interfaceC10250) {
        super(enumC3167);
        C12981.m29755(i);
        this.f6640 = i;
        if (i > 0) {
            C12981.m29767(i2);
        } else {
            i2 = 0;
        }
        this.f6641 = i2;
        if (i > 1) {
            C12981.m29767(i3);
        } else {
            i3 = 0;
        }
        this.f6645 = i3;
        if (i > 2) {
            C12981.m29767(i4);
        } else {
            i4 = 0;
        }
        this.f6644 = i4;
        if (i > 3) {
            C12981.m29767(i5);
        } else {
            i5 = 0;
        }
        this.f6643 = i5;
        if (i > 4) {
            C12981.m29767(i6);
        } else {
            i6 = 0;
        }
        this.f6642 = i6;
        this.f6646 = interfaceC10250;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f6640;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5885() {
        return this.f6641;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܽ */
    public final int mo5883() {
        return this.f6645;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܳ */
    public final int mo5882() {
        return this.f6644;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܿ */
    public final int mo5884() {
        return this.f6643;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ۧ */
    public final int mo5881() {
        return this.f6642;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        return this.f6646;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f6646 = c20765.m46903(this.f6646);
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f25973.f6092;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f6639;
    }
}
