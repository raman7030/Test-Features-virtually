package p067l;

/* JADX INFO: renamed from: l.ܰۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15455 extends EnumC9421 {
    public /* synthetic */ C15455() {
        this("AMBIGUOUS", 4, false);
    }

    public C15455(String str, int i, boolean z) {
        super(str, i, 0, z);
    }

    @Override // p067l.EnumC9421
    /* JADX INFO: renamed from: ֫ */
    public EnumC9421 mo18750(EnumC14115 enumC14115) {
        int i = C14785.f42184[enumC14115.ordinal()];
        if (i == 1) {
            return EnumC9421.f25720;
        }
        if (i == 2 || i == 3) {
            return EnumC9421.f25716;
        }
        if (i == 4) {
            return EnumC9421.f25718;
        }
        throw new AssertionError();
    }
}
