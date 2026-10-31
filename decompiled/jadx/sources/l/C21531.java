package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21531 extends AbstractC3186 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f69212;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21531(C10242 c10242, EnumC12358 enumC12358, float f) {
        super(c10242, enumC12358, Float.valueOf(f));
        this.f69212 = c10242;
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ܽ */
    public final String mo3639() {
        boolean z = this.f69212.f30885.f29344;
        Object obj = this.f10053;
        if (!z) {
            String string = ((Float) obj).toString();
            return (((Float) obj).isNaN() || ((Float) obj).isInfinite()) ? string : C16014.m37867(string, "f");
        }
        return "bits " + C23424.m51889(Float.floatToIntBits(((Float) obj).floatValue()));
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
