package l;

/* JADX INFO: renamed from: l.ۜۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6472 extends EnumC0121 {
    public /* synthetic */ C6472(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("BOOT_CLASS_PATH", 18, "--boot-class-path -bootclasspath", "opt.arg.path", "opt.bootclasspath", enumC18467, enumC3650);
    }

    public C6472(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) {
        abstractC0827.mo3081("-Xbootclasspath/p:");
        abstractC0827.mo3081("-Xbootclasspath/a:");
        super.mo1179(abstractC0827, str, str2);
    }
}
