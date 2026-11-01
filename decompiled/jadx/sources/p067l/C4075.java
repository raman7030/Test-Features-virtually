package p067l;

/* JADX INFO: renamed from: l.֫ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final enum C4075 extends EnumC12793 {
    public /* synthetic */ C4075(EnumC20544 enumC20544) {
        this("CAPTURED", 5, enumC20544);
    }

    public C4075(String str, int i, EnumC20544 enumC20544) {
        super(str, i, enumC20544, 0);
    }

    @Override // p067l.EnumC12793
    /* JADX INFO: renamed from: ֫ */
    public boolean mo8179(C3108 c3108, C2733 c2733) {
        return c3108.m5298() && !c2733.m4264(c3108.m5292(EnumC20544.f63504, EnumC20544.f63505));
    }

    @Override // p067l.EnumC12793
    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 mo8180(C3108 c3108, C2733 c2733) {
        AbstractC6462 abstractC6462Mo8180;
        AbstractC6462 abstractC6462Mo8181;
        C8769 c8769 = c2733.f4592;
        EnumC12793 enumC12793 = EnumC12793.f36003;
        if (enumC12793.m29344(c3108, c2733).m10293()) {
            abstractC6462Mo8180 = enumC12793.mo8180(c3108, c2733);
        } else {
            abstractC6462Mo8180 = c8769.f23796.f69208;
        }
        AbstractC6462 abstractC6462 = abstractC6462Mo8180;
        EnumC12793 enumC12794 = EnumC12793.f36000;
        if (enumC12794.m29344(c3108, c2733).m10293()) {
            abstractC6462Mo8181 = enumC12794.mo8180(c3108, c2733);
        } else {
            abstractC6462Mo8181 = c8769.f23796.f69204;
        }
        C16637 c16637 = (C16637) c3108.f16992;
        AbstractC21195 abstractC21195 = c16637.f16705;
        return new C16637(abstractC21195.f20408, abstractC21195.f20407, abstractC6462, abstractC6462Mo8181, c16637.f48907);
    }
}
