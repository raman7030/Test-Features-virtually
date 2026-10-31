package l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۘܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4041 extends EnumC0121 {

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public final String f12813;

    public /* synthetic */ C4041(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("HELP_LINT", 47, "--help-lint", "opt.help.lint", enumC18467, enumC3650);
    }

    public C4041(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, enumC18467, enumC3650, 0);
        this.f12813 = "    %-20s %s";
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        C22364 c22364Mo3075 = abstractC0827.mo3075();
        EnumC21659 enumC21659 = EnumC21659.STDOUT;
        EnumC15307 enumC15307 = EnumC15307.JAVAC;
        c22364Mo3075.m50115(enumC21659, c22364Mo3075.m50109(enumC15307, "opt.help.lint.header", new Object[0]));
        c22364Mo3075.m50115(enumC21659, String.format(this.f12813, ProviderConfigurationPermission.ALL_STR, c22364Mo3075.m50109(enumC15307, "opt.Xlint.all", new Object[0])));
        for (EnumC20347 enumC20347 : EnumC20347.values()) {
            c22364Mo3075.m50115(EnumC21659.STDOUT, String.format(this.f12813, enumC20347.f65711, c22364Mo3075.m50109(EnumC15307.JAVAC, "opt.Xlint.desc." + enumC20347.f65711, new Object[0])));
        }
        c22364Mo3075.m50115(EnumC21659.STDOUT, String.format(this.f12813, "none", c22364Mo3075.m50109(EnumC15307.JAVAC, "opt.Xlint.none", new Object[0])));
        super.mo1178(abstractC0827, str);
    }
}
