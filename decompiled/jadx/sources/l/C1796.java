package l;

/* JADX INFO: renamed from: l.֫ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final enum C1796 extends EnumC10969 {
    public /* synthetic */ C1796(EnumC19125 enumC19125) {
        this("CAPTURED", 5, enumC19125);
    }

    public C1796(String str, int i, EnumC19125 enumC19125) {
        super(str, i, enumC19125, 0);
    }

    @Override // l.EnumC10969
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo5982(C0779 c0779, C0384 c0384) {
        return c0779.m2969() && !c0384.m1873(c0779.m2963(EnumC19125.f60272, EnumC19125.f60273));
    }

    @Override // l.EnumC10969
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 mo5983(C0779 c0779, C0384 c0384) {
        AbstractC4308 abstractC4308Mo5983;
        AbstractC4308 abstractC4308Mo5984;
        C6735 c6735 = c0384.f1815;
        EnumC10969 enumC10969 = EnumC10969.f33010;
        if (enumC10969.m27282(c0779, c0384).m8249()) {
            abstractC4308Mo5983 = enumC10969.mo5983(c0779, c0384);
        } else {
            abstractC4308Mo5983 = c6735.f20922.f66526;
        }
        AbstractC4308 abstractC4308 = abstractC4308Mo5983;
        EnumC10969 enumC109610 = EnumC10969.f33007;
        if (enumC109610.m27282(c0779, c0384).m8249()) {
            abstractC4308Mo5984 = enumC109610.mo5983(c0779, c0384);
        } else {
            abstractC4308Mo5984 = c6735.f20922.f66522;
        }
        C15014 c15014 = (C15014) c0779.f14167;
        AbstractC19810 abstractC19810 = c15014.f13890;
        return new C15014(abstractC19810.f17562, abstractC19810.f17561, abstractC4308, abstractC4308Mo5984, c15014.f45790);
    }
}
