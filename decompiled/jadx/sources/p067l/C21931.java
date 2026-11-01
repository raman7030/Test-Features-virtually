package p067l;

/* JADX INFO: renamed from: l.᩷ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21931 extends EnumC2483 {
    public /* synthetic */ C21931(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("XBOOTCLASSPATH", 21, "-Xbootclasspath:", "opt.arg.path", "opt.bootclasspath", enumC19919, enumC5837);
    }

    public C21931(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) {
        abstractC3154.mo5395("-Xbootclasspath/p:");
        abstractC3154.mo5395("-Xbootclasspath/a:");
        super.mo3580(abstractC3154, "-bootclasspath", str2);
    }
}
