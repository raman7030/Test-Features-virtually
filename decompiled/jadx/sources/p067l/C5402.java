package p067l;

/* JADX INFO: renamed from: l.ۗۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class C5402 extends AbstractC10923 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C23663 f12864;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC6462 f12865;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5402(C23663 c23663, C11142 c11142, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849, EnumC18298 enumC18298) {
        super(c23663.f75323.m19466(abstractC6462, true), enumC18298, c11142, c4848, c4849, abstractC12224);
        this.f12864 = c23663;
        this.f12865 = abstractC6462;
    }

    @Override // p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo5930(C4036 c4036, EnumC18298 enumC18298) {
        AbstractC6462 abstractC6462 = this.f6711;
        enumC18298.m41671();
        return this.f12864.m52646(c4036, abstractC6462, this.f6709, this.f6707, this.f6710, enumC18298.m41672());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r0.m19491(r13.m4259((p067l.AbstractC6462) r9.f11034), r12.f12865, r0.f22469) != false) goto L10;
     */
    @Override // p067l.AbstractC10923
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC10923 mo11859(C2733 c2733) {
        C11142 c11142 = this.f30283;
        AbstractC14355 abstractC14355 = c11142.f30891;
        C23663 c23663 = this.f12864;
        if (!C9268.m21412(abstractC14355, c23663.f75320)) {
            return null;
        }
        C4848 c4848 = this.f6707;
        if (c4848.m10293()) {
            AbstractC6462 abstractC6462 = (AbstractC6462) c4848.f11034;
            EnumC11353 enumC11353 = EnumC11353.NONE;
            if (!abstractC6462.m14777(enumC11353)) {
                C8374 c8374 = c23663.f75323;
            }
            EnumC18298 enumC18298 = this.f6708;
            C4848 c4849 = c4848.f11035;
            AbstractC12224 abstractC12224 = this.f6709;
            AbstractC6462 abstractC6463 = this.f12865;
            C16956 c16956 = new C16956(c23663, c11142, abstractC12224, abstractC6463, c4849, this.f6710, enumC18298);
            C8374 c8375 = c23663.f75323;
            if (abstractC6463.mo14784() && !((AbstractC6462) c4848.f11034).m14777(enumC11353)) {
                c16956.f6711 = c8375.m19466(c8375.m19467(abstractC6463.f16705, (AbstractC6462) c4848.f11034), true);
            }
            return c16956;
        }
        return new C6743(this, c11142, this.f6709, this.f6711, this.f6707, this.f6710, this.f6708);
    }

    @Override // p067l.AbstractC10923
    /* JADX INFO: renamed from: ֫ */
    public EnumC21871 mo11860(AbstractC7783 abstractC7783) {
        if (abstractC7783.mo17483()) {
            return EnumC21871.f68800;
        }
        AbstractC12224 abstractC12224M21428 = C9268.m21428(this.f30283.f30891);
        if (abstractC12224M21428 != null && abstractC12224M21428 == this.f12864.f75320.f21756) {
            return EnumC21871.f68798;
        }
        return EnumC21871.f68795;
    }
}
