package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۖۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4614 extends AbstractC10564 {

    /* JADX INFO: renamed from: ۧ */
    public final C4848 f10344;

    public C4614(AbstractC6462 abstractC6462, C4848 c4848) {
        super(abstractC6462);
        this.f10344 = c4848;
    }

    @Override // p067l.AbstractC10564
    /* JADX INFO: renamed from: ֫ */
    public final void mo7611(InterfaceC11235 interfaceC11235) {
        ((InterfaceC3272) interfaceC11235).mo5686(this);
    }

    @Override // p067l.InterfaceC12404
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append((CharSequence) this.f29256.f16705.mo17995());
        sb.append("/*proxy*/{");
        boolean z = true;
        C4848 c4848 = this.f10344;
        while (c4848.m10293()) {
            C24293 c24293 = (C24293) c4848.f11034;
            if (!z) {
                sb.append(",");
            }
            sb.append((CharSequence) c24293.f76952);
            sb.append("=");
            sb.append(c24293.f76953);
            c4848 = c4848.f11035;
            z = false;
        }
        sb.append(C0249l.f1198d);
        return sb.toString();
    }
}
