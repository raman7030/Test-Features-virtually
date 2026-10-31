package l;

/* JADX INFO: renamed from: l.ܰۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13624 extends EnumC10969 {
    public /* synthetic */ C13624(EnumC19125 enumC19125) {
        this("UPPER", 3, enumC19125);
    }

    public C13624(String str, int i, EnumC19125 enumC19125) {
        super(str, i, enumC19125, 0);
    }

    @Override // l.EnumC10969
    /* JADX INFO: renamed from: ܽ */
    public AbstractC4308 mo5983(C0779 c0779, C0384 c0384) {
        C6735 c6735 = c0384.f1815;
        C2609 c2609M27282 = m27282(c0779, c0384);
        AbstractC4308 abstractC4308M17553 = c2609M27282.f8241.f8241 == null ? (AbstractC4308) c2609M27282.f8240 : c6735.f20923.m17553(c2609M27282);
        if (!abstractC4308M17553.mo12941() && !abstractC4308M17553.m12913(EnumC9454.ERROR)) {
            return abstractC4308M17553;
        }
        C5931 c5931 = c6735.f20932;
        AbstractC4308 abstractC4308 = c0779.f14167;
        C11576 c11576 = C11886.f35440;
        throw C6735.m18338(c5931.m16617(new C11576("compiler", "no.unique.maximal.instance.exists", abstractC4308, c2609M27282)));
    }
}
