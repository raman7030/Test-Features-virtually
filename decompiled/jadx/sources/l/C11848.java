package l;

/* JADX INFO: renamed from: l.ۨܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11848 extends C23188 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f35369;

    @Override // l.C23188, l.InterfaceC11487
    /* JADX INFO: renamed from: ֫ */
    public final void mo28307(C17712 c17712, AbstractC0197 abstractC0197) {
        if (abstractC0197 instanceof C21757) {
            int i = this.f35369 + 1;
            this.f35369 = i;
            if (i > 100000) {
                throw new C7614();
            }
        }
        super.mo28307(c17712, abstractC0197);
    }
}
