package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes.dex */
public final class C22236 extends AbstractC3186 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f72164;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22236(C10242 c10242, EnumC12358 enumC12358, int i) {
        super(c10242, enumC12358, Integer.valueOf(i));
        this.f72164 = c10242;
    }

    @Override // l.AbstractC3186
    /* JADX INFO: renamed from: ܽ */
    public final String mo3639() {
        boolean z = this.f72164.f30885.f29344;
        Integer num = (Integer) this.f10053;
        return z ? C23424.m51889(num.intValue()) : num.toString();
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
