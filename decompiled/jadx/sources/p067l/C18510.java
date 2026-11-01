package p067l;

/* JADX INFO: renamed from: l.ܿ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4900 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18510 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final C20662 f55293 = new C20662();

    /* JADX INFO: renamed from: ۧ */
    public int f55294;

    /* JADX INFO: renamed from: ܽ */
    public boolean f55295;

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9301() {
        return true;
    }

    public C18510(int i) {
        this.f55294 = i;
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9299(AbstractC13147 abstractC13147) {
        if (!this.f55295) {
            return true;
        }
        AbstractC13147 abstractC13147Mo3768 = this.f55293.mo3768();
        if (!(abstractC13147Mo3768 instanceof AbstractC19991)) {
            return true;
        }
        ((AbstractC19991) abstractC13147Mo3768).m45365(false);
        return true;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f55293;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        if (interfaceC20543.mo46443()) {
            if (this.f55293.m3754() == null) {
                return null;
            }
            AbstractC13147 abstractC13147Mo9302 = interfaceC20543.mo46446().mo9302();
            this.f55295 = (abstractC13147Mo9302 instanceof C22673) || (abstractC13147Mo9302 instanceof C20662);
            return C16359.m37169(interfaceC20543.mo46447());
        }
        int iMo46445 = interfaceC20543.mo46445();
        int i = this.f55294;
        if (iMo46445 >= i) {
            return new C16359(-1, interfaceC20543.mo46444() + i, false);
        }
        return null;
    }
}
