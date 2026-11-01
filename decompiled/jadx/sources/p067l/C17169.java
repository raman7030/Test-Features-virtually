package p067l;

/* JADX INFO: renamed from: l.ܺ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public final class C17169 extends C5771 implements InterfaceC10057 {

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f51119;

    /* JADX INFO: renamed from: ܽ֫ */
    public AbstractC7783 f51120;

    @Override // p067l.C5771, p067l.AbstractC7783, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public final int mo3348() {
        return 15;
    }

    @Override // p067l.C5771
    /* JADX INFO: renamed from: ᩹֫ */
    public final C17169 mo12943() {
        return this;
    }

    public C17169(AbstractC7783 abstractC7783, boolean z) {
        super(abstractC7783.f20409, abstractC7783.f20408, abstractC7783.f20406, abstractC7783.f20407);
        this.f51120 = abstractC7783;
        this.f51119 = z;
    }

    /* JADX INFO: renamed from: ۬֫ */
    public final int m38869() {
        AbstractC7783 abstractC7783 = this.f51120;
        if (abstractC7783.f20405 == EnumC3600.f7339) {
            if (this.f51119) {
                return abstractC7783.mo17483() ? 2 : 1;
            }
            return abstractC7783.mo17483() ? 4 : 3;
        }
        if (abstractC7783.m17994()) {
            return 8;
        }
        if (abstractC7783.mo17483()) {
            return 6;
        }
        if ((abstractC7783.mo18003() & 2) != 0) {
            AbstractC7783 abstractC7784 = this;
            while (abstractC7784 != null && !(abstractC7784 instanceof C23206)) {
                abstractC7784 = abstractC7784.f20407;
            }
            if (abstractC7784 == null || !((C23206) abstractC7784).f72918) {
                return 7;
            }
        }
        return abstractC7783.m17990().m17989() ? 9 : 5;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5861(C8374 c8374) {
        return new C24293(this.f51120, Integer.valueOf(m38869()));
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC7783 mo9143() {
        return this.f51120;
    }
}
