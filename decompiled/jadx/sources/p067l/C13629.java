package p067l;

/* JADX INFO: renamed from: l.ۨܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13629 extends C24406 {

    /* JADX INFO: renamed from: ᩵ */
    public int f38374;

    @Override // p067l.C24406, p067l.InterfaceC13285
    /* JADX INFO: renamed from: ֫ */
    public final void mo30351(C19201 c19201, AbstractC2555 abstractC2555) {
        if (abstractC2555 instanceof C23046) {
            int i = this.f38374 + 1;
            this.f38374 = i;
            if (i > 100000) {
                throw new C9605();
            }
        }
        super.mo30351(c19201, abstractC2555);
    }
}
