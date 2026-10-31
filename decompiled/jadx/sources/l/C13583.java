package l;

/* JADX INFO: renamed from: l.ܰۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13583 extends C7234 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40522;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f40523;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f40524;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13583(C9310 c9310, AbstractC12612 abstractC12612, InterfaceC3953 interfaceC3953) {
        super(c9310, interfaceC3953);
        this.f40523 = c9310;
        this.f40524 = abstractC12612;
    }

    @Override // l.C7234, l.C1130, l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final void mo1084(InterfaceC3109 interfaceC3109, C16719 c16719) {
        if (this.f40522) {
            this.f4107.mo1084(interfaceC3109, this.f40523.f28210.m16617(C11886.f35474));
        } else {
            super.mo1084(interfaceC3109, c16719);
        }
    }

    @Override // l.C7234, l.C1130, l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3859(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        if (abstractC4309.m12913(EnumC9454.VOID)) {
            this.f40522 = true;
            return C7260.m19447(this.f40524);
        }
        return super.mo3859(abstractC4308, abstractC4309, c1386);
    }
}
