package l;

/* JADX INFO: renamed from: l.ܰۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes4.dex */
public final class C13584 implements InterfaceC21830 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17777 f40525;

    public C13584(C17777 c17777) {
        this.f40525 = c17777;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19383 mo3429(int i, int i2) {
        C17777 c17777 = this.f40525;
        C7235 c7235 = (C7235) c17777.f54371.get(i);
        if (c7235 != null) {
            return c7235;
        }
        if (c17777.f54369) {
            return new C19714();
        }
        C7235 c7236 = new C7235(c17777, c17777.f54370, i);
        c17777.f54371.put(i, c7236);
        return c7236;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ܳ */
    public final void mo3431() {
        this.f40525.f54369 = true;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public final void mo3430(InterfaceC9505 interfaceC9505) {
        this.f40525.f54372 = interfaceC9505;
    }
}
