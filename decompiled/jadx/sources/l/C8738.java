package l;

/* JADX INFO: renamed from: l.ۡ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8738 extends AbstractC3799 implements InterfaceC12265 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15086 f26602;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f26603;

    public C8738(InterfaceC15086 interfaceC15086) {
        this.f26602 = interfaceC15086;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8738 m22591(InterfaceC15086 interfaceC15086) {
        return new C8738(interfaceC15086);
    }

    @Override // l.InterfaceC12265
    /* JADX INFO: renamed from: ֫ */
    public final void mo7732(C18616 c18616) {
        c18616.m43158(this);
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ܽ */
    public final int mo7738() {
        InterfaceC15086 interfaceC15086 = this.f26602;
        String strMo35701 = interfaceC15086.mo35701();
        int i = C12970.f38870;
        C3093 c3093 = new C3093(strMo35701);
        c3093.next();
        int iIntValue = c3093.hasNext() ? ((Integer) c3093.next()).intValue() : -1;
        if (!interfaceC15086.mo35700()) {
            if (iIntValue != -1) {
                return 1000;
            }
            return interfaceC15086.length();
        }
        if (iIntValue > 0) {
            return iIntValue;
        }
        if (interfaceC15086.mo35696() && !interfaceC15086.mo35701().startsWith("// ")) {
            return interfaceC15086.length() + 1;
        }
        return ((Integer) C1682.m5681(interfaceC15086).map(new C13216(4)).orElse(Integer.valueOf(interfaceC15086.length()))).intValue();
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final String mo7730() {
        InterfaceC15086 interfaceC15086 = this.f26602;
        if (interfaceC15086.mo35696() && !interfaceC15086.mo35701().startsWith("// ")) {
            return "// " + interfaceC15086.mo35701().substring(2);
        }
        return (String) C1682.m5681(interfaceC15086).orElse(interfaceC15086.mo35701());
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ۧ */
    public final C13758 mo7736() {
        Integer numValueOf = Integer.valueOf(this.f26602.getIndex());
        return C13758.m33063(numValueOf, numValueOf).m33071(AbstractC3799.f11982);
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final C9444 mo7731(InterfaceC10855 interfaceC10855, C9444 c9444) {
        Object next;
        String strM1079 = ((C0096) interfaceC10855).m1079(this.f26602, c9444.f28632);
        this.f26603 = strM1079;
        int length = strM1079.length();
        String str = this.f26603;
        int i = C12970.f38870;
        C3093 c3093 = new C3093(str);
        do {
            next = c3093.next();
        } while (c3093.hasNext());
        return c9444.m24272(c9444.f28632 + (length - ((Integer) next).intValue()));
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final void mo7733(C18711 c18711) {
        c18711.m43328(m11468(), this.f26603);
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f26602, "tok");
        return c8964M37871.toString();
    }
}
