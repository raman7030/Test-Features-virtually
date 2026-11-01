package p067l;

/* JADX INFO: renamed from: l.᩷ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C22303 extends EnumC2483 {
    public /* synthetic */ C22303(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("HELP", 43, "--help -help -?", "opt.help", enumC19919, enumC5837);
    }

    public C22303(String str, int i, String str2, String str3, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) {
        C23623 c23623Mo5389 = abstractC3154.mo5389();
        String strMo5394 = abstractC3154.mo5394();
        EnumC22953 enumC22953 = EnumC22953.STDOUT;
        C23623.m52440(c23623Mo5389.m52447(enumC22953), c23623Mo5389.m52449(EnumC16916.JAVAC, "msg.usage.header", strMo5394));
        EnumC2483.m3572(c23623Mo5389, EnumC19919.STANDARD);
        c23623Mo5389.m52447(enumC22953).println();
        super.mo3579(abstractC3154, str);
    }
}
