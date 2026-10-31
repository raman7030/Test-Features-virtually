package l;

/* JADX INFO: renamed from: l.ᩳ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17691 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC18543 f54149;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f54150;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54151;

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo7222() {
        return true;
    }

    public C17691(AbstractC18543 abstractC18543) {
        this.f54149 = abstractC18543;
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7220(AbstractC11342 abstractC11342) {
        if (!(abstractC11342 instanceof C19249)) {
            return false;
        }
        if (this.f54150 && this.f54151 == 1) {
            this.f54149.m43087(false);
            this.f54150 = false;
        }
        return true;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f54149;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        if (interfaceC19124.mo44149()) {
            this.f54150 = true;
            this.f54151 = 0;
        } else if (this.f54150) {
            this.f54151++;
        }
        return C14721.m35022(interfaceC19124.getIndex());
    }
}
