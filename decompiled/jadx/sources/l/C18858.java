package l;

/* JADX INFO: renamed from: l.ᩴܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18858 extends EnumC0121 {
    public /* synthetic */ C18858(EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295) {
        this("J", 48, "-J", "opt.arg.flag", "opt.J", enumC18467, enumC3650, enumC9295);
    }

    public C18858(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, enumC9295, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        throw new AssertionError("the -J flag should be caught by the launcher.");
    }
}
