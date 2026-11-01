package p067l;

/* JADX INFO: renamed from: l.᩸ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22811 extends AbstractC9476 implements InterfaceC18967, InterfaceC3132 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f71866 = EnumC5850.Format3rc;

    /* JADX INFO: renamed from: ۗ */
    public final int f71867;

    /* JADX INFO: renamed from: ۙ */
    public final int f71868;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC10250 f71869;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " " + C9731.m22754(this) + ", " + getReference();
    }

    public C22811(EnumC3167 enumC3167, int i, int i2, InterfaceC10250 interfaceC10250) {
        super(enumC3167);
        C12981.m29765(i);
        this.f71867 = i;
        C12981.m29771(i2);
        this.f71868 = i2;
        this.f71869 = interfaceC10250;
    }

    @Override // p067l.InterfaceC18140
    /* JADX INFO: renamed from: ᩴ */
    public final int mo11756() {
        return this.f71867;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f71868;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        return this.f71869;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f71869 = c20765.m46903(this.f71869);
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f25973.f6092;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f71866;
    }
}
