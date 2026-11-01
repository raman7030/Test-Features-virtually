package p067l;

/* JADX INFO: renamed from: l.ܰۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes4.dex */
public final class C15278 implements InterfaceC23116 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19263 f43602;

    public C15278(C19263 c19263) {
        this.f43602 = c19263;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20790 mo5732(int i, int i2) {
        C19263 c19263 = this.f43602;
        C9244 c9244 = (C9244) c19263.f57565.get(i);
        if (c9244 != null) {
            return c9244;
        }
        if (c19263.f57563) {
            return new C21105();
        }
        C9244 c9245 = new C9244(c19263, c19263.f57564, i);
        c19263.f57565.put(i, c9245);
        return c9245;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ܳ */
    public final void mo5734() {
        this.f43602.f57563 = true;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final void mo5733(InterfaceC11402 interfaceC11402) {
        this.f43602.f57566 = interfaceC11402;
    }
}
