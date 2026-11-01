package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۠ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10090 extends AbstractC5396 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C12102 f28007;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10090(C12102 c12102, EnumC14113 enumC14113, int i) {
        super(c12102, enumC14113, Integer.valueOf(i));
        this.f28007 = c12102;
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ܽ */
    public final String mo5910() {
        int iOrdinal = this.f12856.ordinal();
        C12102 c12102 = this.f28007;
        if (iOrdinal == 6) {
            return C12102.m27969(c12102.m27978(this), c12102.f33846.f70107);
        }
        Object obj = this.f12857;
        if (iOrdinal == 7 || iOrdinal == 13) {
            return c12102.m27986(((Integer) obj).intValue());
        }
        return (iOrdinal == 16 || iOrdinal == 17) ? c12102.m27987(((Integer) obj).intValue(), new C13639(1)) : "UnknownTag";
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ֫ */
    public final void mo5908(InterfaceC3446 interfaceC3446, int i) {
        super.mo5908(interfaceC3446, i);
        m23552();
    }

    @Override // p067l.AbstractC5396
    /* JADX INFO: renamed from: ۧ */
    public final void mo5909(InterfaceC3446 interfaceC3446, int i) {
        super.mo5909(interfaceC3446, i);
        m23552();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m23552() {
        int iOrdinal = this.f12856.ordinal();
        if (iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 13 || iOrdinal == 16 || iOrdinal == 17) {
            C12102 c12102 = this.f28007;
            boolean z = c12102.f32292;
            Object obj = this.f12857;
            if (z) {
                c12102.m26676("#" + obj + C0249l.f1196b);
                return;
            }
            c12102.m26675(this.f12854, "#" + obj + C0249l.f1196b);
            StringBuilder sb = new StringBuilder(" // ");
            sb.append(mo5910());
            c12102.m26676(sb.toString());
        }
    }
}
