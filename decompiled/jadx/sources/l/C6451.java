package l;

/* JADX INFO: renamed from: l.ۜ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6451 extends AbstractC18009 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19110 f19935;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f19936;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6451(C22406 c22406, AbstractC10370 abstractC10370, C19955 c19955, C2609 c2609, C2609 c26010, C19110 c19110) {
        super(c22406, abstractC10370, c19955, c2609, c26010);
        this.f19936 = c22406;
        this.f19935 = c19110;
    }

    @Override // l.AbstractC18009
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 mo17829(C1755 c1755, EnumC16761 enumC16761) {
        AbstractC4308 abstractC4308 = this.f3940;
        enumC16761.m39435();
        return C22406.m50288(this.f19936, this.f19935, c1755, abstractC4308, this.f3936, this.f3939, enumC16761.m39436());
    }

    @Override // l.AbstractC18009, l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo3658(C1755 c1755, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        if (!abstractC5699.f17559.m4393()) {
            return abstractC5699;
        }
        EnumC1296 enumC1296 = abstractC5699.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4580;
        if (enumC1296 != enumC1297 && enumC1296 != EnumC1296.f4569) {
            return super.mo3658(c1755, interfaceC3109, abstractC5698, abstractC5699);
        }
        if (enumC1296 == enumC1297) {
        }
        C22406 c22406 = this.f19936;
        C14480 c14480 = new C14480(c22406, abstractC5699, c22406.f72579);
        AbstractC4308 abstractC4308 = this.f3940;
        AbstractC10370 abstractC10370 = c22406.f72594.f18879;
        AbstractC5698 abstractC5698M50317 = c22406.m50317((AbstractC5698) c14480, interfaceC3109, (AbstractC5698) abstractC4308.f13890, abstractC4308, abstractC10370, true, this.f3936, this.f3939, (InterfaceC0369) c22406.f72610);
        ((C8604) c1755.f6073).f26288 = c22406.f72579.f37061;
        return abstractC5698M50317;
    }
}
