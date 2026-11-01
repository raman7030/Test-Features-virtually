package p067l;

/* JADX INFO: renamed from: l.᩺ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBBP */
/* JADX INFO: loaded from: classes.dex */
public final class C24123 extends AbstractC17417 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC12548 f76540;

    /* JADX INFO: renamed from: ֫ */
    public static String m53368(InterfaceC12548 interfaceC12548) {
        StringBuilder sbM34407 = C15033.m34407(100, "catch");
        int size = interfaceC12548.size();
        for (int i = 0; i < size; i++) {
            sbM34407.append(" ");
            sbM34407.append(interfaceC12548.getType(i).mo4819());
        }
        return sbM34407.toString();
    }

    public C24123(C5348 c5348, C12054 c12054, C21442 c21442, InterfaceC12548 interfaceC12548) {
        super(c5348, c12054, null, c21442);
        if (c5348.m11601() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c5348.m11601());
        }
        if (interfaceC12548 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f76540 = interfaceC12548;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ᩳ */
    public final String mo13526() {
        return m53368(this.f76540);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12548 mo5820() {
        return this.f76540;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final void mo5818(InterfaceC10713 interfaceC10713) {
        interfaceC10713.mo10259(this);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5816(C9566 c9566) {
        return new C24123(m39656(), m39652(), m39651(), this.f76540.mo28930(c9566));
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5817(C22783 c22783, C21442 c21442) {
        return new C24123(m39656(), m39652(), c21442, this.f76540);
    }
}
