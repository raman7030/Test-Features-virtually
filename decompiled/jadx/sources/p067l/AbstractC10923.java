package p067l;

/* JADX INFO: renamed from: l.ۡܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10923 extends AbstractC3390 {

    /* JADX INFO: renamed from: ܳ */
    public C11142 f30283;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC10923 mo11859(C2733 c2733) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC21871 mo11860(AbstractC7783 abstractC7783);

    public AbstractC10923(AbstractC6462 abstractC6462, EnumC18298 enumC18298, C11142 c11142, C4848 c4848, C4848 c4849, AbstractC12224 abstractC12224) {
        super(abstractC12224, abstractC6462, c4848, c4849, enumC18298);
        this.f30283 = c11142;
    }

    @Override // p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo5929(C4036 c4036, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        if (abstractC7784.f20405 != EnumC3600.f7338) {
            return abstractC7784;
        }
        C13194 c13194 = (C13194) abstractC7784.mo9143();
        AbstractC6462 abstractC6462 = this.f6711;
        return (AbstractC7783) c13194.f37078.f75323.m19437(c13194.f37079.m10294(), abstractC6462, true).orElse(c13194);
    }
}
