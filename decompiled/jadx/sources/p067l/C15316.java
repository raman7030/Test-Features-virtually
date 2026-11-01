package p067l;

/* JADX INFO: renamed from: l.ܰۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15316 extends EnumC12793 {
    public /* synthetic */ C15316(EnumC20544 enumC20544) {
        this("UPPER", 3, enumC20544);
    }

    public C15316(String str, int i, EnumC20544 enumC20544) {
        super(str, i, enumC20544, 0);
    }

    @Override // p067l.EnumC12793
    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 mo8180(C3108 c3108, C2733 c2733) {
        C8769 c8769 = c2733.f4592;
        C4848 c4848M29344 = m29344(c3108, c2733);
        AbstractC6462 abstractC6462M19493 = c4848M29344.f11035.f11035 == null ? (AbstractC6462) c4848M29344.f11034 : c8769.f23797.m19493(c4848M29344);
        if (!abstractC6462M19493.mo14805() && !abstractC6462M19493.m14777(EnumC11353.ERROR)) {
            return abstractC6462M19493;
        }
        C8005 c8005 = c8769.f23806;
        AbstractC6462 abstractC6462 = c3108.f16992;
        C13370 c13370 = C13665.f38450;
        throw C8769.m20286(c8005.m18543(new C13370("compiler", "no.unique.maximal.instance.exists", abstractC6462, c4848M29344)));
    }
}
