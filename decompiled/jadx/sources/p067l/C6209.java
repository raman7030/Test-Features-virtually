package p067l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۘܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6209 extends EnumC2483 {

    /* JADX INFO: renamed from: ᩵ܽ */
    public final String f15628;

    public /* synthetic */ C6209(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("HELP_LINT", 47, "--help-lint", "opt.help.lint", enumC19919, enumC5837);
    }

    public C6209(String str, int i, String str2, String str3, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, enumC19919, enumC5837, 0);
        this.f15628 = "    %-20s %s";
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) {
        C23623 c23623Mo5389 = abstractC3154.mo5389();
        EnumC22953 enumC22953 = EnumC22953.STDOUT;
        EnumC16916 enumC16916 = EnumC16916.JAVAC;
        c23623Mo5389.m52455(enumC22953, c23623Mo5389.m52449(enumC16916, "opt.help.lint.header", new Object[0]));
        c23623Mo5389.m52455(enumC22953, String.format(this.f15628, ProviderConfigurationPermission.ALL_STR, c23623Mo5389.m52449(enumC16916, "opt.Xlint.all", new Object[0])));
        for (EnumC21706 enumC21706 : EnumC21706.values()) {
            c23623Mo5389.m52455(EnumC22953.STDOUT, String.format(this.f15628, enumC21706.f68387, c23623Mo5389.m52449(EnumC16916.JAVAC, "opt.Xlint.desc." + enumC21706.f68387, new Object[0])));
        }
        c23623Mo5389.m52455(EnumC22953.STDOUT, String.format(this.f15628, "none", c23623Mo5389.m52449(EnumC16916.JAVAC, "opt.Xlint.none", new Object[0])));
        super.mo3579(abstractC3154, str);
    }
}
