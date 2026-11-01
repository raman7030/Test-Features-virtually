package p067l;

/* JADX INFO: renamed from: l.ۗ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G5OY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5434 extends AbstractC8135 implements InterfaceC6486, InterfaceC3132 {

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC16954 f12961;

    @Override // p067l.InterfaceC9838
    /* JADX INFO: renamed from: ܽ */
    public final int mo10470() {
        return 9;
    }

    public C5434(InterfaceC16954 interfaceC16954) {
        this.f12961 = interfaceC16954;
    }

    @Override // p067l.InterfaceC6486
    /* JADX INFO: renamed from: ۜ */
    public final String mo11944() {
        InterfaceC16954 interfaceC16954 = this.f12961;
        if (interfaceC16954 == null) {
            return null;
        }
        return interfaceC16954.getString();
    }

    @Override // p067l.InterfaceC6486
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16954 mo11945() {
        return this.f12961;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        InterfaceC16954 interfaceC16954 = this.f12961;
        if (interfaceC16954 != null) {
            this.f12961 = c20765.m46910(interfaceC16954.getString());
        }
    }
}
