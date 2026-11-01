package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩹ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes.dex */
public final class C23501 extends AbstractC5396 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C12102 f74889;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23501(C12102 c12102, EnumC14113 enumC14113, int i) {
        super(c12102, enumC14113, Integer.valueOf(i));
        this.f74889 = c12102;
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ܽ */
    public final String mo5910() {
        boolean z = this.f74889.f33846.f32293;
        Integer num = (Integer) this.f12857;
        return z ? C24630.m54287(num.intValue()) : num.toString();
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
