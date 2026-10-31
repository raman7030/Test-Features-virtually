package l;

/* JADX INFO: renamed from: l.ܰ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13506 extends AbstractC18715 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f40318;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21325 f40319;

    /* JADX WARN: Illegal instructions before constructor call */
    public C13506(C22406 c22406, C21325 c21325) {
        this.f40318 = c22406;
        EnumC1296 enumC1296 = EnumC1296.f4575;
        AbstractC5698 abstractC5698 = c21325.f66102;
        super(c22406, enumC1296, abstractC5698, "BadClassFileError");
        this.f17562 = abstractC5698.f17562;
        this.f40319 = c21325;
    }

    @Override // l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010) {
        C22406 c22406 = this.f40318;
        C5931 c5931 = c22406.f72607;
        C14397 c14397M7266 = c22406.f72598.m7266();
        C21325 c21325 = this.f40319;
        C16719 c16719M16619 = c5931.m16619(enumC12986, c14397M7266, interfaceC3109, "cant.access", c21325.f66102, c21325.m46989());
        c16719M16619.m39351(EnumC20043.NON_DEFERRABLE);
        return c16719M16619;
    }
}
