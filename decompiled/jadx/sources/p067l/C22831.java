package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22831 extends AbstractC5396 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C12102 f71912;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22831(C12102 c12102, EnumC14113 enumC14113, float f) {
        super(c12102, enumC14113, Float.valueOf(f));
        this.f71912 = c12102;
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ܽ */
    public final String mo5910() {
        boolean z = this.f71912.f33846.f32293;
        Object obj = this.f12857;
        if (!z) {
            String string = ((Float) obj).toString();
            return (((Float) obj).isNaN() || ((Float) obj).isInfinite()) ? string : C17588.m40053(string, "f");
        }
        return "bits " + C24630.m54287(Float.floatToIntBits(((Float) obj).floatValue()));
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
