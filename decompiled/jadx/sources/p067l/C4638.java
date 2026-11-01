package p067l;

/* JADX INFO: renamed from: l.ۖ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4638 extends AbstractC5979 implements InterfaceC14025 {

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC22743 f10411;

    /* JADX INFO: renamed from: ۤ */
    public final EnumC17377 f10412;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC10002 f10413;

    /* JADX INFO: renamed from: ۬ */
    public final C18189 f10414;

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ܽ */
    public final int mo9799() {
        InterfaceC22743 interfaceC22743 = this.f10411;
        String strMo37859 = interfaceC22743.mo50894().mo37859();
        int i = C14695.f41914;
        C5308 c5308 = new C5308(strMo37859);
        c5308.next();
        if ((c5308.hasNext() ? ((Integer) c5308.next()).intValue() : -1) >= 0) {
            return 1000;
        }
        return interfaceC22743.mo50894().length();
    }

    public C4638(InterfaceC22743 interfaceC22743, EnumC17377 enumC17377, AbstractC10002 abstractC10002, C18189 c18189) {
        this.f10411 = interfaceC22743;
        this.f10412 = enumC17377;
        this.f10413 = abstractC10002;
        this.f10414 = c18189;
    }

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC10002 m9796() {
        return this.f10413;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C18189 m9800() {
        return this.f10414;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4638 m9790(InterfaceC22743 interfaceC22743, EnumC17377 enumC17377, AbstractC10002 abstractC10002, C18189 c18189) {
        return new C4638(interfaceC22743, enumC17377, abstractC10002, c18189);
    }

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC22743 m9795() {
        return this.f10411;
    }

    /* JADX INFO: renamed from: ܺ */
    public final EnumC17377 m9798() {
        return this.f10412;
    }

    @Override // p067l.InterfaceC14025
    /* JADX INFO: renamed from: ֫ */
    public final void mo9793(C20061 c20061) {
        c20061.m45423(this);
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final String mo9791() {
        return this.f10411.mo50894().mo37859();
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ۧ */
    public final C15444 mo9797() {
        Integer numValueOf = Integer.valueOf(this.f10411.mo50894().getIndex());
        return C15444.m35178(numValueOf, numValueOf).m35186(AbstractC5979.f14788);
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final C11344 mo9792(InterfaceC12685 interfaceC12685, C11344 c11344) {
        return c11344.m26282(c11344.f31579 + mo9799());
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final void mo9794(C20151 c20151) {
        c20151.m45595(m13404(), this.f10411.mo50894().mo37859());
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f10411, "token");
        c10888M40057.m25084(this.f10412, "realOrImaginary");
        c10888M40057.m25084(this.f10413, "plusIndentCommentsBefore");
        return c10888M40057.toString();
    }
}
