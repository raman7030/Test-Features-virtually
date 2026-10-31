package l;

/* JADX INFO: renamed from: l.ۚ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5040 extends AbstractC9980 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f15852;

    public final String toString() {
        return "resolveMethodCheck";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m14559(final C1755 c1755, final AbstractC4308 abstractC4308, C0384 c0384) {
        if (abstractC4308.m12928(c0384.f1817)) {
            c0384.m1864(C2609.of((Object) abstractC4308), new InterfaceC3748() { // from class: l.᩵֫۠
                @Override // l.InterfaceC3748
                /* JADX INFO: renamed from: ֫ */
                public final void mo4673(C0384 c0385) {
                    this.f60348.m14559(c1755, c0385.m1859(abstractC4308), c0385);
                }
            });
            return;
        }
        C22406 c22406 = this.f15852;
        if (c22406.m50329(c1755, c22406.f72597.m17519(abstractC4308), false)) {
            return;
        }
        C14163 c14163 = c1755.f6079.f17186;
        m25145(c1755.f6074, EnumC21537.INACCESSIBLE_VARARGS, c0384, abstractC4308, C21758.m49076(c14163), c14163);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5040(C22406 c22406) {
        super(c22406);
        this.f15852 = c22406;
    }

    @Override // l.AbstractC9980, l.InterfaceC8131
    /* JADX INFO: renamed from: ֫ */
    public final void mo11113(C1755 c1755, C6755 c6755, C2609 c2609, C2609 c26010, C1386 c1386) {
        super.mo11113(c1755, c6755, c2609, c26010, c1386);
        if (c6755.f20969.m39436()) {
            EnumC13829 enumC13829 = c6755.f20970;
            EnumC13829 enumC138210 = EnumC13829.CHECK;
            C22406 c22406 = this.f15852;
            if (enumC13829 == enumC138210 || !c22406.f72587) {
                m14559(c1755, c22406.f72597.m17515((AbstractC4308) c26010.last()), c6755.f20968);
            }
        }
    }

    @Override // l.AbstractC9980
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14561(InterfaceC3109 interfaceC3109, boolean z, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C6755 c6755, C1386 c1386) {
        new C18173(this.f15852, abstractC4309, new C0100(this, !c6755.f20969.m39435(), c6755, c1386, z)).mo13581(interfaceC3109, abstractC4308);
    }

    @Override // l.AbstractC9980, l.InterfaceC8131
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8131 mo11112(C2609 c2609) {
        return new C6884(this.f15852, c2609);
    }
}
