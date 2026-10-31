package l;

/* JADX INFO: renamed from: l.ۛۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6010 extends EnumC7421 {
    public /* synthetic */ C6010() {
        this("TYPE", 1, true);
    }

    public C6010(String str, int i, boolean z) {
        super(str, i, 0, z);
    }

    @Override // l.EnumC7421
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC7421 mo16823(EnumC12360 enumC12360) {
        int i = C13065.f39136[enumC12360.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return EnumC7421.f22804;
        }
        if (i == 4) {
            return EnumC7421.f22805;
        }
        throw new AssertionError();
    }
}
