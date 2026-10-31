package l;

/* JADX INFO: renamed from: l.ۤۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10098 extends EnumC10969 {
    public /* synthetic */ C10098(EnumC19125 enumC19125) {
        this("LOWER", 1, enumC19125);
    }

    public C10098(String str, int i, EnumC19125 enumC19125) {
        super(str, i, enumC19125, 0);
    }

    @Override // l.EnumC10969
    /* JADX INFO: renamed from: ܽ */
    public AbstractC4308 mo5983(C0779 c0779, C0384 c0384) {
        C6735 c6735 = c0384.f1815;
        C2609 c2609M27282 = m27282(c0779, c0384);
        AbstractC4308 abstractC4308M17548 = c2609M27282.f8241.f8241 == null ? (AbstractC4308) c2609M27282.f8240 : c6735.f20923.m17548(c2609M27282);
        if (!abstractC4308M17548.mo12941() && !abstractC4308M17548.m12913(EnumC9454.ERROR)) {
            return abstractC4308M17548;
        }
        C5931 c5931 = c6735.f20932;
        AbstractC4308 abstractC4308 = c0779.f14167;
        C11576 c11576 = C11886.f35440;
        throw C6735.m18338(c5931.m16617(new C11576("compiler", "no.unique.minimal.instance.exists", abstractC4308, c2609M27282)));
    }
}
