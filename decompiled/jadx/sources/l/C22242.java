package l;

/* JADX INFO: renamed from: l.᩹ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C22242 extends AbstractC15185 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20126 f72174;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC21537 f72175;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22242(C20126 c20126, boolean z, C6755 c6755, C1386 c1386, boolean z2) {
        super(c20126.f65162, z, c6755, c1386);
        this.f72174 = c20126;
        this.f72175 = z2 ? EnumC21537.VARARG_MISMATCH : EnumC21537.ARG_MISMATCH;
    }

    @Override // l.AbstractC15185, l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3859(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        C20126 c20126 = this.f72174;
        AbstractC4308 abstractC4308M1868 = c20126.f65161.m1868(abstractC4308);
        if (abstractC4308M1868.m12913(EnumC9454.UNDETVAR) && abstractC4309.mo12941()) {
            abstractC4309 = c20126.f65162.f72597.m17496(abstractC4309).f17560;
        }
        return super.mo3859(abstractC4308M1868, abstractC4309, c1386);
    }

    @Override // l.AbstractC15185, l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final void mo1084(InterfaceC3109 interfaceC3109, C16719 c16719) {
        this.f72174.m25145(interfaceC3109, this.f72175, this.f46399.f20968, c16719);
        throw null;
    }
}
