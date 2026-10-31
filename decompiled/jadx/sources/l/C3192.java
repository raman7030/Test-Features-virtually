package l;

/* JADX INFO: renamed from: l.ۗۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class C3192 extends AbstractC9001 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f10060;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f10061;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3192(C22406 c22406, C9232 c9232, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010, EnumC16761 enumC16761) {
        super(c22406.f72597.m17526(abstractC4308, true), enumC16761, c9232, c2609, c26010, abstractC10370);
        this.f10060 = c22406;
        this.f10061 = abstractC4308;
    }

    @Override // l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo3659(C1755 c1755, EnumC16761 enumC16761) {
        AbstractC4308 abstractC4308 = this.f3940;
        enumC16761.m39435();
        return this.f10060.m50306(c1755, abstractC4308, this.f3938, this.f3936, this.f3939, enumC16761.m39436());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r0.m17551(r13.m1868((l.AbstractC4308) r9.f8240), r12.f10061, r0.f19598) != false) goto L10;
     */
    @Override // l.AbstractC9001
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC9001 mo9814(C0384 c0384) {
        C9232 c9232 = this.f27349;
        AbstractC12612 abstractC12612 = c9232.f27945;
        C22406 c22406 = this.f10060;
        if (!C7260.m19446(abstractC12612, c22406.f72594)) {
            return null;
        }
        C2609 c2609 = this.f3936;
        if (c2609.m8249()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) c2609.f8240;
            EnumC9454 enumC9454 = EnumC9454.NONE;
            if (!abstractC4308.m12913(enumC9454)) {
                C6319 c6319 = c22406.f72597;
            }
            EnumC16761 enumC16761 = this.f3937;
            C2609 c26010 = c2609.f8241;
            AbstractC10370 abstractC10370 = this.f3938;
            AbstractC4308 abstractC4309 = this.f10061;
            C15349 c15349 = new C15349(c22406, c9232, abstractC10370, abstractC4309, c26010, this.f3939, enumC16761);
            C6319 c63110 = c22406.f72597;
            if (abstractC4309.mo12920() && !((AbstractC4308) c2609.f8240).m12913(enumC9454)) {
                c15349.f3940 = c63110.m17526(c63110.m17527(abstractC4309.f13890, (AbstractC4308) c2609.f8240), true);
            }
            return c15349;
        }
        return new C4603(this, c9232, this.f3938, this.f3940, this.f3936, this.f3939, this.f3937);
    }

    @Override // l.AbstractC9001
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC20521 mo9815(AbstractC5698 abstractC5698) {
        if (abstractC5698.mo15572()) {
            return EnumC20521.f66122;
        }
        AbstractC10370 abstractC10370M19462 = C7260.m19462(this.f27349.f27945);
        if (abstractC10370M19462 != null && abstractC10370M19462 == this.f10060.f72594.f18898) {
            return EnumC20521.f66120;
        }
        return EnumC20521.f66117;
    }
}
