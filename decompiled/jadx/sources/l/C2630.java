package l;

/* JADX INFO: renamed from: l.ۖܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2630 extends EnumC0121 {
    public /* synthetic */ C2630(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("X", 46, "--help-extra -X", "opt.X", enumC18467, enumC3650);
    }

    public C2630(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        C22364 c22364Mo3075 = abstractC0827.mo3075();
        EnumC0121.m1171(c22364Mo3075, EnumC18467.EXTENDED);
        EnumC21659 enumC21659 = EnumC21659.STDOUT;
        c22364Mo3075.m50107(enumC21659).println();
        C22364.m50100(c22364Mo3075.m50107(enumC21659), c22364Mo3075.m50109(EnumC15307.JAVAC, "msg.usage.nonstandard.footer", new Object[0]));
        super.mo1178(abstractC0827, str);
    }
}
