package p067l;

/* JADX INFO: renamed from: l.ܰ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15204 extends AbstractC20155 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C23663 f43388;

    /* JADX INFO: renamed from: ۟ */
    public final C22635 f43389;

    /* JADX WARN: Illegal instructions before constructor call */
    public C15204(C23663 c23663, C22635 c22635) {
        this.f43388 = c23663;
        EnumC3600 enumC3600 = EnumC3600.f7347;
        AbstractC7783 abstractC7783 = c22635.f68780;
        super(c23663, enumC3600, abstractC7783, "BadClassFileError");
        this.f20408 = abstractC7783.f20408;
        this.f43389 = c22635;
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        C23663 c23663 = this.f43388;
        C8005 c8005 = c23663.f75333;
        C16051 c16051M9345 = c23663.f75324.m9345();
        C22635 c22635 = this.f43389;
        C18258 c18258M18545 = c8005.m18545(enumC14710, c16051M9345, interfaceC5323, "cant.access", c22635.f68780, c22635.m49312());
        c18258M18545.m41587(EnumC21417.NON_DEFERRABLE);
        return c18258M18545;
    }
}
