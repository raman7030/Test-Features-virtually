package l;

/* JADX INFO: renamed from: l.ۖ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2388 extends AbstractC3799 implements InterfaceC12265 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21438 f7620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC15792 f7621;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC8032 f7622;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16646 f7623;

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo7738() {
        InterfaceC21438 interfaceC21438 = this.f7620;
        String strMo35701 = interfaceC21438.mo48557().mo35701();
        int i = C12970.f38870;
        C3093 c3093 = new C3093(strMo35701);
        c3093.next();
        if ((c3093.hasNext() ? ((Integer) c3093.next()).intValue() : -1) >= 0) {
            return 1000;
        }
        return interfaceC21438.mo48557().length();
    }

    public C2388(InterfaceC21438 interfaceC21438, EnumC15792 enumC15792, AbstractC8032 abstractC8032, C16646 c16646) {
        this.f7620 = interfaceC21438;
        this.f7621 = enumC15792;
        this.f7622 = abstractC8032;
        this.f7623 = c16646;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC8032 m7735() {
        return this.f7622;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16646 m7739() {
        return this.f7623;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2388 m7729(InterfaceC21438 interfaceC21438, EnumC15792 enumC15792, AbstractC8032 abstractC8032, C16646 c16646) {
        return new C2388(interfaceC21438, enumC15792, abstractC8032, c16646);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21438 m7734() {
        return this.f7620;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC15792 m7737() {
        return this.f7621;
    }

    @Override // l.InterfaceC12265
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7732(C18616 c18616) {
        c18616.m43158(this);
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo7730() {
        return this.f7620.mo48557().mo35701();
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13758 mo7736() {
        Integer numValueOf = Integer.valueOf(this.f7620.mo48557().getIndex());
        return C13758.m33063(numValueOf, numValueOf).m33071(AbstractC3799.f11982);
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9444 mo7731(InterfaceC10855 interfaceC10855, C9444 c9444) {
        return c9444.m24272(c9444.f28632 + mo7738());
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7733(C18711 c18711) {
        c18711.m43328(m11468(), this.f7620.mo48557().mo35701());
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f7620, "token");
        c8964M37871.m23110(this.f7621, "realOrImaginary");
        c8964M37871.m23110(this.f7622, "plusIndentCommentsBefore");
        return c8964M37871.toString();
    }
}
