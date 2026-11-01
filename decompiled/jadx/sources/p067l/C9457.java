package p067l;

/* JADX INFO: renamed from: l.۟۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4QP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9457 extends AbstractC9476 implements InterfaceC2717, InterfaceC3132 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f25800 = EnumC5850.Format20bc;

    /* JADX INFO: renamed from: ۙ */
    public final int f25801;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC10250 f25802;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089;
    }

    public C9457(EnumC3167 enumC3167, int i, InterfaceC10250 interfaceC10250) {
        super(enumC3167);
        int i2 = C23285.f73274;
        if (i > 0 && i < 10) {
            this.f25801 = i;
            this.f25802 = interfaceC10250;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid verification error value: %d. Must be between 1 and 9, inclusive", Integer.valueOf(i)));
    }

    @Override // p067l.InterfaceC2717
    /* JADX INFO: renamed from: ᩵ */
    public final int mo4220() {
        return this.f25801;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        return this.f25802;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f25802 = c20765.m46903(this.f25802);
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        InterfaceC10250 interfaceC10250 = this.f25802;
        if (interfaceC10250 instanceof InterfaceC16954) {
            return 0;
        }
        if (interfaceC10250 instanceof InterfaceC22991) {
            return 1;
        }
        if (interfaceC10250 instanceof InterfaceC20309) {
            return 2;
        }
        if (interfaceC10250 instanceof InterfaceC7568) {
            return 3;
        }
        if (interfaceC10250 instanceof InterfaceC2873) {
            return 4;
        }
        if (interfaceC10250 instanceof InterfaceC6227) {
            return 5;
        }
        if (interfaceC10250 instanceof InterfaceC20980) {
            return 6;
        }
        throw new IllegalStateException("Invalid reference");
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f25800;
    }
}
