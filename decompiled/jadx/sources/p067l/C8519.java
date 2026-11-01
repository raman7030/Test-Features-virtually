package p067l;

/* JADX INFO: renamed from: l.ۜۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8519 extends EnumC2483 {
    public /* synthetic */ C8519(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("BOOT_CLASS_PATH", 18, "--boot-class-path -bootclasspath", "opt.arg.path", "opt.bootclasspath", enumC19919, enumC5837);
    }

    public C8519(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) {
        abstractC3154.mo5395("-Xbootclasspath/p:");
        abstractC3154.mo5395("-Xbootclasspath/a:");
        super.mo3580(abstractC3154, str, str2);
    }
}
