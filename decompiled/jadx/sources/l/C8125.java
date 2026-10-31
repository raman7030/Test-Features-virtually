package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8125 extends AbstractC3186 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f25094;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8125(C10242 c10242, EnumC12358 enumC12358, int i) {
        super(c10242, enumC12358, Integer.valueOf(i));
        this.f25094 = c10242;
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ܽ */
    public final String mo3639() {
        int iOrdinal = this.f10052.ordinal();
        C10242 c10242 = this.f25094;
        if (iOrdinal == 6) {
            return C10242.m25947(c10242.m25956(this), c10242.f30885.f67424);
        }
        Object obj = this.f10053;
        if (iOrdinal == 7 || iOrdinal == 13) {
            return c10242.m25964(((Integer) obj).intValue());
        }
        return (iOrdinal == 16 || iOrdinal == 17) ? c10242.m25965(((Integer) obj).intValue(), new C11859(1)) : "UnknownTag";
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ֫ */
    public final void mo3637(InterfaceC1134 interfaceC1134, int i) {
        super.mo3637(interfaceC1134, i);
        m21584();
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ۧ */
    public final void mo3638(InterfaceC1134 interfaceC1134, int i) {
        super.mo3638(interfaceC1134, i);
        m21584();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m21584() {
        int iOrdinal = this.f10052.ordinal();
        if (iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 13 || iOrdinal == 16 || iOrdinal == 17) {
            C10242 c10242 = this.f25094;
            boolean z = c10242.f29343;
            Object obj = this.f10053;
            if (z) {
                c10242.m24662("#" + obj + l.b);
                return;
            }
            c10242.m24661(this.f10050, "#" + obj + l.b);
            StringBuilder sb = new StringBuilder(" // ");
            sb.append(mo3639());
            c10242.m24662(sb.toString());
        }
    }
}
