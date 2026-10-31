package l;

/* JADX INFO: renamed from: l.ۨ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11391 extends AbstractC5473 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f34080;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C2609 f34081;

    /* JADX WARN: Illegal instructions before constructor call */
    public C11391(C22406 c22406, AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        C2609 c2609Of;
        C2609 c2609Of2;
        this.f34080 = c22406;
        EnumC1296 enumC1296 = EnumC1296.f4566;
        super(c22406, enumC1296, "ambiguity error");
        this.f34081 = C2609.m8239();
        if (abstractC5699.f17559 == enumC1296) {
            c2609Of = ((C11391) abstractC5699.mo7048()).f34081;
        } else {
            c2609Of = C2609.of((Object) abstractC5699);
        }
        if (abstractC5698.f17559 == enumC1296) {
            c2609Of2 = ((C11391) abstractC5698.mo7048()).f34081;
        } else {
            c2609Of2 = C2609.of((Object) abstractC5698);
        }
        c2609Of.getClass();
        this.f34081 = c2609Of2.m8248(c2609Of);
    }

    @Override // l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010) {
        C2609 c2609M8250 = this.f34081.m8250();
        AbstractC5698 abstractC5699 = (AbstractC5698) c2609M8250.f8240;
        AbstractC5698 abstractC56910 = (AbstractC5698) c2609M8250.f8241.f8240;
        AbstractC10370 abstractC10371 = abstractC5699.f17562;
        C22406 c22406 = this.f34080;
        if (abstractC10371 == c22406.f72594.f18879) {
            abstractC10371 = abstractC5699.f17561.f17562;
        }
        return c22406.f72607.m16619(enumC12986, c22406.f72598.m7266(), interfaceC3109, "ref.ambiguous", abstractC10371, C21758.m49076(abstractC5699), abstractC5699, abstractC5699.m16078(abstractC4308, c22406.f72597), C21758.m49076(abstractC56910), abstractC56910, abstractC56910.m16078(abstractC4308, c22406.f72597));
    }

    @Override // l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo15573(AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        AbstractC5698 abstractC5698 = (AbstractC5698) this.f34081.last();
        if (abstractC5698.f17559 != EnumC1296.f4582) {
            return abstractC5698;
        }
        C6319 c6319 = this.f34080.f72597;
        AbstractC4308 abstractC4308 = abstractC5698.f17560;
        c6319.getClass();
        return C6319.m17457(abstractC10370, abstractC19810, abstractC4308).f13890;
    }
}
