package l;

/* JADX INFO: renamed from: l.ۚۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5185 extends AbstractC4308 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f16259;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f16260;

    @Override // l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        return "<ProxyType>";
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m14936() {
        AbstractC10370 abstractC10370 = this.f16260;
        byte[] bArrMo2757 = abstractC10370.mo2757();
        int iMo2761 = abstractC10370.mo2761();
        int iMo2759 = abstractC10370.mo2759();
        C20002 c20002 = this.f16259;
        c20002.f64774 = bArrMo2757;
        c20002.f64776 = iMo2761;
        c20002.f64764 = iMo2761 + iMo2759;
        return c20002.m46135();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185(C20002 c20002, int i) {
        super(c20002.f64770.f66475, C20743.f66779);
        this.f16259 = c20002;
        this.f16260 = c20002.f64767.m46287(i);
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC9454 mo3258() {
        return EnumC9454.NONE;
    }

    @Override // l.AbstractC4308
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo1357(C20743 c20743) {
        throw new UnsupportedOperationException();
    }
}
