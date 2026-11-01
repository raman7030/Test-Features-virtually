package p067l;

/* JADX INFO: renamed from: l.ۡ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10673 extends AbstractC5979 implements InterfaceC14025 {

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC16706 f29527;

    /* JADX INFO: renamed from: ۬ */
    public String f29528;

    public C10673(InterfaceC16706 interfaceC16706) {
        this.f29527 = interfaceC16706;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10673 m24560(InterfaceC16706 interfaceC16706) {
        return new C10673(interfaceC16706);
    }

    @Override // p067l.InterfaceC14025
    /* JADX INFO: renamed from: ֫ */
    public final void mo9793(C20061 c20061) {
        c20061.m45423(this);
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ܽ */
    public final int mo9799() {
        InterfaceC16706 interfaceC16706 = this.f29527;
        String strMo37859 = interfaceC16706.mo37859();
        int i = C14695.f41914;
        C5308 c5308 = new C5308(strMo37859);
        c5308.next();
        int iIntValue = c5308.hasNext() ? ((Integer) c5308.next()).intValue() : -1;
        if (!interfaceC16706.mo37858()) {
            if (iIntValue != -1) {
                return 1000;
            }
            return interfaceC16706.length();
        }
        if (iIntValue > 0) {
            return iIntValue;
        }
        if (interfaceC16706.mo37854() && !interfaceC16706.mo37859().startsWith("// ")) {
            return interfaceC16706.length() + 1;
        }
        return ((Integer) C3967.m7911(interfaceC16706).map(new C14929(4)).orElse(Integer.valueOf(interfaceC16706.length()))).intValue();
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final String mo9791() {
        InterfaceC16706 interfaceC16706 = this.f29527;
        if (interfaceC16706.mo37854() && !interfaceC16706.mo37859().startsWith("// ")) {
            return "// " + interfaceC16706.mo37859().substring(2);
        }
        return (String) C3967.m7911(interfaceC16706).orElse(interfaceC16706.mo37859());
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ۧ */
    public final C15444 mo9797() {
        Integer numValueOf = Integer.valueOf(this.f29527.getIndex());
        return C15444.m35178(numValueOf, numValueOf).m35186(AbstractC5979.f14788);
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final C11344 mo9792(InterfaceC12685 interfaceC12685, C11344 c11344) {
        Object next;
        String strM3475 = ((C2459) interfaceC12685).m3475(this.f29527, c11344.f31579);
        this.f29528 = strM3475;
        int length = strM3475.length();
        String str = this.f29528;
        int i = C14695.f41914;
        C5308 c5308 = new C5308(str);
        do {
            next = c5308.next();
        } while (c5308.hasNext());
        return c11344.m26282(c11344.f31579 + (length - ((Integer) next).intValue()));
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final void mo9794(C20151 c20151) {
        c20151.m45595(m13404(), this.f29528);
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f29527, "tok");
        return c10888M40057.toString();
    }
}
