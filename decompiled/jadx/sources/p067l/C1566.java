package p067l;

/* JADX INFO: renamed from: l.ܳܶ */
/* JADX INFO: compiled from: J1BI */
/* JADX INFO: loaded from: classes5.dex */
public class C1566 extends C1706 {

    /* JADX INFO: renamed from: ۖ */
    public int f47790;

    public C1566(AbstractC1251 abstractC1251) {
        super(abstractC1251);
        if (abstractC1251 instanceof C1636) {
            this.f56456 = EnumC1741.HORIZONTAL_DIMENSION;
        } else {
            this.f56456 = EnumC1741.VERTICAL_DIMENSION;
        }
    }

    @Override // p067l.C1706
    /* JADX INFO: renamed from: ֫ */
    public final void mo37000(int i) {
        if (this.f56464) {
            return;
        }
        this.f56464 = true;
        this.f56459 = i;
        for (InterfaceC1391 interfaceC1391 : this.f56457) {
            interfaceC1391.mo8443(interfaceC1391);
        }
    }
}
