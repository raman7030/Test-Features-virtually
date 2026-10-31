package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2363 extends AbstractC8624 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 f7553;

    public C2363(AbstractC4308 abstractC4308, C2609 c2609) {
        super(abstractC4308);
        this.f7553 = c2609;
    }

    @Override // l.AbstractC8624
    /* JADX INFO: renamed from: ֫ */
    public final void mo5382(InterfaceC9330 interfaceC9330) {
        ((InterfaceC0951) interfaceC9330).mo3367(this);
    }

    @Override // l.InterfaceC10559
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append((CharSequence) this.f26338.f13890.mo16076());
        sb.append("/*proxy*/{");
        boolean z = true;
        C2609 c2609 = this.f7553;
        while (c2609.m8249()) {
            C23069 c23069 = (C23069) c2609.f8240;
            if (!z) {
                sb.append(",");
            }
            sb.append((CharSequence) c23069.f74207);
            sb.append("=");
            sb.append(c23069.f74208);
            c2609 = c2609.f8241;
            z = false;
        }
        sb.append(l.d);
        return sb.toString();
    }
}
