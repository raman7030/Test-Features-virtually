package p067l;

/* JADX INFO: renamed from: l.ᩴۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B58A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20129 extends AbstractC9476 implements InterfaceC24175, InterfaceC3132 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f62317 = EnumC5850.Format31c;

    /* JADX INFO: renamed from: ۙ */
    public final int f62318;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC10250 f62319;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", " + getReference();
    }

    public C20129(EnumC3167 enumC3167, int i, InterfaceC10250 interfaceC10250) {
        super(enumC3167);
        C12981.m29763(i);
        this.f62318 = i;
        this.f62319 = interfaceC10250;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f62318;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        return this.f62319;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f62319 = c20765.m46903(this.f62319);
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f25973.f6092;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f62317;
    }
}
