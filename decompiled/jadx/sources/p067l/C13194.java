package p067l;

/* JADX INFO: renamed from: l.ۨ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13194 extends AbstractC7570 {

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C23663 f37078;

    /* JADX INFO: renamed from: ᩺ */
    public C4848 f37079;

    /* JADX WARN: Illegal instructions before constructor call */
    public C13194(C23663 c23663, AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        C4848 c4848M10276of;
        C4848 c4848M10276of2;
        this.f37078 = c23663;
        EnumC3600 enumC3600 = EnumC3600.f7338;
        super(c23663, enumC3600, "ambiguity error");
        this.f37079 = C4848.m10283();
        if (abstractC7784.f20405 == enumC3600) {
            c4848M10276of = ((C13194) abstractC7784.mo9143()).f37079;
        } else {
            c4848M10276of = C4848.m10276of((Object) abstractC7784);
        }
        if (abstractC7783.f20405 == enumC3600) {
            c4848M10276of2 = ((C13194) abstractC7783.mo9143()).f37079;
        } else {
            c4848M10276of2 = C4848.m10276of((Object) abstractC7783);
        }
        c4848M10276of.getClass();
        this.f37079 = c4848M10276of2.m10292(c4848M10276of);
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        C4848 c4848M10294 = this.f37079.m10294();
        AbstractC7783 abstractC7784 = (AbstractC7783) c4848M10294.f11034;
        AbstractC7783 abstractC7785 = (AbstractC7783) c4848M10294.f11035.f11034;
        AbstractC12224 abstractC12225 = abstractC7784.f20408;
        C23663 c23663 = this.f37078;
        if (abstractC12225 == c23663.f75320.f21737) {
            abstractC12225 = abstractC7784.f20407.f20408;
        }
        return c23663.f75333.m18545(enumC14710, c23663.f75324.m9345(), interfaceC5323, "ref.ambiguous", abstractC12225, C23047.m51425(abstractC7784), abstractC7784, abstractC7784.m17997(abstractC6462, c23663.f75323), C23047.m51425(abstractC7785), abstractC7785, abstractC7785.m17997(abstractC6462, c23663.f75323));
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo17484(AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        AbstractC7783 abstractC7783 = (AbstractC7783) this.f37079.last();
        if (abstractC7783.f20405 != EnumC3600.f7354) {
            return abstractC7783;
        }
        C8374 c8374 = this.f37078.f75323;
        AbstractC6462 abstractC6462 = abstractC7783.f20406;
        c8374.getClass();
        return C8374.m19397(abstractC12224, abstractC21195, abstractC6462).f16705;
    }
}
