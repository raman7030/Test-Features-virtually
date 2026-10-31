package l;

/* JADX INFO: renamed from: l.ܿ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4900 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16985 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19249 f52113 = new C19249();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52114;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52115;

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo7222() {
        return true;
    }

    public C16985(int i) {
        this.f52114 = i;
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7220(AbstractC11342 abstractC11342) {
        if (!this.f52115) {
            return true;
        }
        AbstractC11342 abstractC11342Mo1355 = this.f52113.mo1355();
        if (!(abstractC11342Mo1355 instanceof AbstractC18543)) {
            return true;
        }
        ((AbstractC18543) abstractC11342Mo1355).m43087(false);
        return true;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f52113;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        if (interfaceC19124.mo44149()) {
            if (this.f52113.m1341() == null) {
                return null;
            }
            AbstractC11342 abstractC11342Mo7223 = interfaceC19124.mo44152().mo7223();
            this.f52115 = (abstractC11342Mo7223 instanceof C21365) || (abstractC11342Mo7223 instanceof C19249);
            return C14721.m35022(interfaceC19124.mo44153());
        }
        int iMo44151 = interfaceC19124.mo44151();
        int i = this.f52114;
        if (iMo44151 >= i) {
            return new C14721(-1, interfaceC19124.mo44150() + i, false);
        }
        return null;
    }
}
