package l;

/* JADX INFO: renamed from: l.֫ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1548 extends C10986 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f5459;

    public C1548(C9310 c9310) {
        this.f5459 = c9310;
    }

    @Override // l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo5305(C6262 c6262, Object obj) {
        C1755 c1755 = (C1755) obj;
        AbstractC12612 abstractC12612 = c6262.f19397;
        AbstractC5698 abstractC5698 = (AbstractC5698) (abstractC12612 == null ? null : abstractC12612.mo986(this, c1755));
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4581 || enumC1296 == EnumC1296.f4573 || enumC1296 == EnumC1296.f4575) {
            return abstractC5698;
        }
        AbstractC10370 abstractC10370 = c6262.f19395;
        EnumC1296 enumC1297 = EnumC1296.f4579;
        C9310 c9310 = this.f5459;
        if (enumC1296 == enumC1297) {
            c1755.f6075.f4746 = (C7814) abstractC5698;
            return c9310.f28231.m50321((C6262) null, c1755, (AbstractC19810) abstractC5698, abstractC10370, C15406.f47182);
        }
        c1755.f6079.f17186 = (C14163) abstractC5698;
        return c9310.f28231.m50334(c1755, abstractC5698.f17560, abstractC10370, (AbstractC19810) abstractC5698);
    }

    @Override // l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo5306(C7673 c7673, Object obj) {
        return this.f5459.f28231.m50322((C7673) null, (C1755) obj, c7673.f23696, C15406.f47182);
    }
}
