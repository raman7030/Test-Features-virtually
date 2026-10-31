package l;

/* JADX INFO: renamed from: l.ܿۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17303 extends AbstractC9001 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f53009;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f53010;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17303(C22406 c22406, C9232 c9232, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010, EnumC16761 enumC16761) {
        super(abstractC4308, enumC16761, c9232, c2609, c26010, c22406.f72594.f18879);
        this.f53009 = c22406;
        if (abstractC4308.mo12920()) {
            this.f3940 = new C19955(abstractC4308.mo4958(), (abstractC4308.f13890.m16069() && abstractC4308.mo4958().mo12920()) ? C2609.m8239() : abstractC4308.f13890.f17560.mo12938(), abstractC4308.f13890, abstractC4308.m12921());
            this.f53010 = true;
        }
    }

    @Override // l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo3659(C1755 c1755, EnumC16761 enumC16761) {
        AbstractC5698 abstractC5698M50306;
        boolean z = this.f53010;
        C22406 c22406 = this.f53009;
        if (z) {
            AbstractC4308 abstractC4308 = this.f3940;
            enumC16761.m39435();
            abstractC5698M50306 = c22406.m50282(c1755, abstractC4308, this.f3936, this.f3939, enumC16761.m39436());
        } else {
            AbstractC4308 abstractC4309 = this.f3940;
            enumC16761.m39435();
            abstractC5698M50306 = c22406.m50306(c1755, abstractC4309, this.f3938, this.f3936, this.f3939, enumC16761.m39436());
        }
        return c22406.m50327(c1755, this.f3940) ? new C7157(abstractC5698M50306, c22406) : abstractC5698M50306;
    }

    @Override // l.AbstractC9001
    /* JADX INFO: renamed from: ֫ */
    public final EnumC20521 mo9815(AbstractC5698 abstractC5698) {
        return this.f3940.mo4958().m12913(EnumC9454.NONE) ? EnumC20521.f66119 : EnumC20521.f66123;
    }
}
