package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩶ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21490 extends AbstractC5396 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C12102 f67799;

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ۧ */
    public final int mo11846() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21490(C12102 c12102, EnumC14113 enumC14113, long j) {
        super(c12102, enumC14113, Long.valueOf(j));
        this.f67799 = c12102;
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ܽ */
    public final String mo5910() {
        StringBuilder sb;
        String string;
        boolean z = this.f67799.f33846.f32293;
        Object obj = this.f12857;
        if (z) {
            sb = new StringBuilder();
            long jLongValue = ((Long) obj).longValue();
            int i = C24630.f77971;
            int i2 = 16;
            while (i2 > 0 && (jLongValue >> ((i2 - 1) * 4)) == 0) {
                i2--;
            }
            string = C24630.m54288(i2, jLongValue);
        } else {
            sb = new StringBuilder();
            string = ((Long) obj).toString();
        }
        sb.append(string);
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
