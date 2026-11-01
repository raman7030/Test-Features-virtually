package p067l;

/* JADX INFO: renamed from: l.ᩳ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19181 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC19991 f57341;

    /* JADX INFO: renamed from: ۧ */
    public boolean f57342;

    /* JADX INFO: renamed from: ܽ */
    public int f57343;

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9301() {
        return true;
    }

    public C19181(AbstractC19991 abstractC19991) {
        this.f57341 = abstractC19991;
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9299(AbstractC13147 abstractC13147) {
        if (!(abstractC13147 instanceof C20662)) {
            return false;
        }
        if (this.f57342 && this.f57343 == 1) {
            this.f57341.m45365(false);
            this.f57342 = false;
        }
        return true;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f57341;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        if (interfaceC20543.mo46443()) {
            this.f57342 = true;
            this.f57343 = 0;
        } else if (this.f57342) {
            this.f57343++;
        }
        return C16359.m37169(interfaceC20543.getIndex());
    }
}
