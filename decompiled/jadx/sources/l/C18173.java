package l;

/* JADX INFO: renamed from: l.ᩳܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18173 extends C23420 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f56482;

    /* JADX WARN: Illegal instructions before constructor call */
    public C18173(C22406 c22406, AbstractC4308 abstractC4308, InterfaceC3953 interfaceC3953) {
        this.f56482 = c22406;
        C9310 c9310 = c22406.f72613;
        C11003.requireNonNull(c9310);
        super(c9310, C15406.f47181, abstractC4308, interfaceC3953);
    }

    @Override // l.C23420
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo13581(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4308M17523;
        if (abstractC4308.m12913(EnumC9454.DEFERRED)) {
            return ((C1110) abstractC4308).m3822((C23420) this);
        }
        AbstractC4308 abstractC4309 = this.f75219;
        C22406 c22406 = this.f56482;
        if (abstractC4308 != abstractC4309) {
            c22406.f72597.getClass();
            abstractC4308 = C6319.m17473(abstractC4308);
        }
        if (interfaceC3109 == null || interfaceC3109.mo9482() == null) {
            abstractC4308M17523 = c22406.f72597.m17523(abstractC4308);
        } else {
            abstractC4308M17523 = this.f75215.mo3857().m1860(interfaceC3109.mo9482(), abstractC4308, true);
        }
        return super.mo13581(interfaceC3109, c22406.f72599.m36202(interfaceC3109, abstractC4308M17523));
    }

    @Override // l.C23420
    /* JADX INFO: renamed from: ֫ */
    public final C23420 mo38523(AbstractC4308 abstractC4308) {
        return new C18173(this.f56482, abstractC4308, this.f75215);
    }

    @Override // l.C23420
    /* JADX INFO: renamed from: ֫ */
    public final C23420 mo38522(InterfaceC3953 interfaceC3953) {
        return new C18173(this.f56482, this.f75219, interfaceC3953);
    }
}
