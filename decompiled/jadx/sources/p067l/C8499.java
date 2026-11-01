package p067l;

/* JADX INFO: renamed from: l.ۜ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8499 extends AbstractC19484 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C20530 f22808;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23663 f22809;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8499(C23663 c23663, AbstractC12224 abstractC12224, C21333 c21333, C4848 c4848, C4848 c4849, C20530 c20530) {
        super(c23663, abstractC12224, c21333, c4848, c4849);
        this.f22809 = c23663;
        this.f22808 = c20530;
    }

    @Override // p067l.AbstractC19484
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7783 mo19776(C4036 c4036, EnumC18298 enumC18298) {
        AbstractC6462 abstractC6462 = this.f6711;
        enumC18298.m41671();
        return C23663.m52628(this.f22809, this.f22808, c4036, abstractC6462, this.f6707, this.f6710, enumC18298.m41672());
    }

    @Override // p067l.AbstractC19484, p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo5929(C4036 c4036, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        if (!abstractC7784.f20405.m6625()) {
            return abstractC7784;
        }
        EnumC3600 enumC3600 = abstractC7784.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7352;
        if (enumC3600 != enumC3601 && enumC3600 != EnumC3600.f7341) {
            return super.mo5929(c4036, interfaceC5323, abstractC7783, abstractC7784);
        }
        if (enumC3600 == enumC3601) {
        }
        C23663 c23663 = this.f22809;
        C16130 c16130 = new C16130(c23663, abstractC7784, c23663.f75305);
        AbstractC6462 abstractC6462 = this.f6711;
        AbstractC12224 abstractC12224 = c23663.f75320.f21737;
        AbstractC7783 abstractC7783M52657 = c23663.m52657((AbstractC7783) c16130, interfaceC5323, (AbstractC7783) abstractC6462.f16705, abstractC6462, abstractC12224, true, this.f6707, this.f6710, (InterfaceC2719) c23663.f75336);
        ((C10545) c4036.f8849).f29204 = c23663.f75305.f40077;
        return abstractC7783M52657;
    }
}
