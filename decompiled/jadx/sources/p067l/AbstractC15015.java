package p067l;

/* JADX INFO: renamed from: l.۬ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79UX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15015 extends AbstractC5628 implements InterfaceC9571, InterfaceC12553 {

    /* JADX INFO: renamed from: ᩷֫ */
    public AbstractC14345 f42900;

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC14345 mo8764(InterfaceC20106 interfaceC20106);

    public AbstractC15015(InterfaceC3341 interfaceC3341, int i) {
        super(interfaceC3341, i);
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC9571 mo22299() {
        return (AbstractC15015) getNext();
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC9571 mo22295() {
        AbstractC15015 abstractC15015 = (AbstractC15015) getNext();
        if (abstractC15015 != null) {
            m12474((AbstractC14345) null);
            abstractC15015.m12478();
        }
        return abstractC15015;
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9571 mo22299() {
        return (AbstractC15015) getNext();
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo22297() {
        return m12489() != 0;
    }

    @Override // p067l.InterfaceC9571
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo22298(InterfaceC9571 interfaceC9571) {
        if (((C15410) m12497()).m35089(getClass().getSimpleName())) {
            return ((C15410) m12497()).m35089(interfaceC9571.getClass().getSimpleName());
        }
        return false;
    }

    @Override // p067l.InterfaceC12553
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14345 mo7659(InterfaceC20106 interfaceC20106) {
        AbstractC14345 abstractC14345Mo8764 = mo8764(interfaceC20106);
        abstractC14345Mo8764.mo12475(getDigest());
        mo30248((InterfaceC3835) abstractC14345Mo8764);
        AbstractC15015 abstractC15015 = (AbstractC15015) getNext();
        if (abstractC15015 != null) {
            abstractC14345Mo8764.m12474(abstractC15015.mo7659(interfaceC20106));
        }
        return abstractC14345Mo8764;
    }

    @Override // p067l.AbstractC5628, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final int mo12469(int i, byte[] bArr) {
        int iMo12469 = super.mo12469(i, bArr);
        int size = size();
        int iM12508 = m12508();
        if (size == iM12508) {
            return iMo12469;
        }
        throw new IllegalStateException(String.format("Wrong size calculation have %d expect %d", Integer.valueOf(size), Integer.valueOf(iM12508)));
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3835 mo7658() {
        return this.f42900;
    }

    @Override // p067l.AbstractC5628, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14345 mo7658() {
        return this.f42900;
    }

    @Override // p067l.InterfaceC9571, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15194 mo7658() {
        return this.f42900;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo30248(InterfaceC3835 interfaceC3835) {
        if (interfaceC3835 != null && !(interfaceC3835 instanceof AbstractC5628)) {
            throw new IllegalArgumentException("Incompatible response");
        }
        this.f42900 = (AbstractC14345) interfaceC3835;
    }
}
