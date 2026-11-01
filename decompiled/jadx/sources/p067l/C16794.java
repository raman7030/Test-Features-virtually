package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܶۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C16794 extends AbstractC5396 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C12102 f49495;

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ۧ */
    public final int mo11846() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16794(C12102 c12102, EnumC14113 enumC14113, double d) {
        super(c12102, enumC14113, Double.valueOf(d));
        this.f49495 = c12102;
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ܽ */
    public final String mo5910() {
        boolean z = this.f49495.f33846.f32293;
        Object obj = this.f12857;
        if (!z) {
            Double d = (Double) obj;
            String string = d.toString();
            return (d.isNaN() || d.isInfinite()) ? string : C17588.m40053(string, "d");
        }
        StringBuilder sb = new StringBuilder("bits ");
        long jDoubleToLongBits = Double.doubleToLongBits(((Double) obj).doubleValue());
        int i = C24630.f77971;
        int i2 = 16;
        while (i2 > 0 && (jDoubleToLongBits >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        sb.append(C24630.m54288(i2, jDoubleToLongBits));
        sb.append('l');
        return sb.toString();
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ֫ */
    public final void mo5908(InterfaceC3446 interfaceC3446, int i) {
        super.mo5908(interfaceC3446, i);
        interfaceC3446.mo4349(mo5910() + C0249l.f1196b);
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ۧ */
    public final void mo5909(InterfaceC3446 interfaceC3446, int i) {
        super.mo5909(interfaceC3446, i);
        interfaceC3446.mo4349(mo5910() + C0249l.f1196b);
    }
}
