package p067l;

/* JADX INFO: renamed from: l.ۛۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8080 extends EnumC9421 {
    public /* synthetic */ C8080() {
        this("TYPE", 1, true);
    }

    public C8080(String str, int i, boolean z) {
        super(str, i, 0, z);
    }

    @Override // p067l.EnumC9421
    /* JADX INFO: renamed from: ֫ */
    public EnumC9421 mo18750(EnumC14115 enumC14115) {
        int i = C14785.f42184[enumC14115.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return EnumC9421.f25717;
        }
        if (i == 4) {
            return EnumC9421.f25718;
        }
        throw new AssertionError();
    }
}
