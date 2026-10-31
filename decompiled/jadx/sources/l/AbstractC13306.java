package l;

/* JADX INFO: renamed from: l.۬ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79UX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13306 extends AbstractC3429 implements InterfaceC7578, InterfaceC10716 {

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public AbstractC12601 f39833;

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC12601 mo6638(InterfaceC18663 interfaceC18663);

    public AbstractC13306(InterfaceC1023 interfaceC1023, int i) {
        super(interfaceC1023, i);
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC7578 mo20322() {
        return (AbstractC13306) getNext();
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC7578 mo20318() {
        AbstractC13306 abstractC13306 = (AbstractC13306) getNext();
        if (abstractC13306 != null) {
            m10435((AbstractC12601) null);
            abstractC13306.m10439();
        }
        return abstractC13306;
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7578 mo20322() {
        return (AbstractC13306) getNext();
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo20320() {
        return m10450() != 0;
    }

    @Override // l.InterfaceC7578
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo20321(InterfaceC7578 interfaceC7578) {
        if (((C13722) m10458()).m32975(getClass().getSimpleName())) {
            return ((C13722) m10458()).m32975(interfaceC7578.getClass().getSimpleName());
        }
        return false;
    }

    @Override // l.InterfaceC10716
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12601 mo5430(InterfaceC18663 interfaceC18663) {
        AbstractC12601 abstractC12601Mo6638 = mo6638(interfaceC18663);
        abstractC12601Mo6638.mo10436(getDigest());
        mo28204((InterfaceC1543) abstractC12601Mo6638);
        AbstractC13306 abstractC13306 = (AbstractC13306) getNext();
        if (abstractC13306 != null) {
            abstractC12601Mo6638.m10435(abstractC13306.mo5430(interfaceC18663));
        }
        return abstractC12601Mo6638;
    }

    @Override // l.AbstractC3429, l.InterfaceC13927
    /* JADX INFO: renamed from: ֫ */
    public final int mo10430(int i, byte[] bArr) {
        int iMo10430 = super.mo10430(i, bArr);
        int size = size();
        int iM10469 = m10469();
        if (size == iM10469) {
            return iMo10430;
        }
        throw new IllegalStateException(String.format("Wrong size calculation have %d expect %d", Integer.valueOf(size), Integer.valueOf(iM10469)));
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1543 mo5429() {
        return this.f39833;
    }

    @Override // l.AbstractC3429, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12601 mo5429() {
        return this.f39833;
    }

    @Override // l.InterfaceC7578, l.InterfaceC13927
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC13495 mo5429() {
        return this.f39833;
    }

    @Override // l.InterfaceC13927
    /* JADX INFO: renamed from: ֫ */
    public final void mo28204(InterfaceC1543 interfaceC1543) {
        if (interfaceC1543 != null && !(interfaceC1543 instanceof AbstractC3429)) {
            throw new IllegalArgumentException("Incompatible response");
        }
        this.f39833 = (AbstractC12601) interfaceC1543;
    }
}
