package l;

/* JADX INFO: renamed from: l.ۜ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6611 extends AbstractC14371 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f20346;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        AbstractC4308 abstractC4309 = (AbstractC4308) obj2;
        C10139 c10139 = this.f20346;
        boolean z = c10139.f30518.m17550(abstractC4308, c10139.f30514.f66533) || c10139.f30518.m17550(abstractC4309, c10139.f30514.f66533);
        EnumC9454 enumC9454 = EnumC9454.VOID;
        return z && !(abstractC4308.m12913(enumC9454) || abstractC4309.m12913(enumC9454));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6611(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f20346 = c10139;
    }

    @Override // l.AbstractC14371
    /* JADX INFO: renamed from: ֫ */
    public final C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        return m37193(new C17194(this, m18119(abstractC4308), m18119(abstractC4309)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m18119(AbstractC4308 abstractC4308) {
        boolean zMo12941 = abstractC4308.mo12941();
        C10139 c10139 = this.f20346;
        if (zMo12941) {
            return c10139.m25480(abstractC4308);
        }
        if (abstractC4308.m12913(EnumC9454.VOID) || abstractC4308.m12913(EnumC9454.BOT) || c10139.f30518.m17550(abstractC4308, c10139.f30514.f66533)) {
            return abstractC4308;
        }
        if (abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            return m18119(abstractC4308.mo12939());
        }
        return c10139.f30514.f66526;
    }
}
