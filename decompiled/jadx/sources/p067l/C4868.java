package p067l;

/* JADX INFO: renamed from: l.ۖܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C4868 extends EnumC2483 {
    public /* synthetic */ C4868(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("X", 46, "--help-extra -X", "opt.X", enumC19919, enumC5837);
    }

    public C4868(String str, int i, String str2, String str3, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) {
        C23623 c23623Mo5389 = abstractC3154.mo5389();
        EnumC2483.m3572(c23623Mo5389, EnumC19919.EXTENDED);
        EnumC22953 enumC22953 = EnumC22953.STDOUT;
        c23623Mo5389.m52447(enumC22953).println();
        C23623.m52440(c23623Mo5389.m52447(enumC22953), c23623Mo5389.m52449(EnumC16916.JAVAC, "msg.usage.nonstandard.footer", new Object[0]));
        super.mo3579(abstractC3154, str);
    }
}
