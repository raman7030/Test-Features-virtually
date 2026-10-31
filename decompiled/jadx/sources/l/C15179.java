package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15179 extends AbstractC3186 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f46370;

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ۧ */
    public final int mo9801() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15179(C10242 c10242, EnumC12358 enumC12358, double d) {
        super(c10242, enumC12358, Double.valueOf(d));
        this.f46370 = c10242;
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ܽ */
    public final String mo3639() {
        boolean z = this.f46370.f30885.f29344;
        Object obj = this.f10053;
        if (!z) {
            Double d = (Double) obj;
            String string = d.toString();
            return (d.isNaN() || d.isInfinite()) ? string : C16014.m37867(string, "d");
        }
        StringBuilder sb = new StringBuilder("bits ");
        long jDoubleToLongBits = Double.doubleToLongBits(((Double) obj).doubleValue());
        int i = C23424.f75225;
        int i2 = 16;
        while (i2 > 0 && (jDoubleToLongBits >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        sb.append(C23424.m51890(i2, jDoubleToLongBits));
        sb.append('l');
        return sb.toString();
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ֫ */
    public final void mo3637(InterfaceC1134 interfaceC1134, int i) {
        super.mo3637(interfaceC1134, i);
        interfaceC1134.mo1973(mo3639() + l.b);
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ۧ */
    public final void mo3638(InterfaceC1134 interfaceC1134, int i) {
        super.mo3638(interfaceC1134, i);
        interfaceC1134.mo1973(mo3639() + l.b);
    }
}
