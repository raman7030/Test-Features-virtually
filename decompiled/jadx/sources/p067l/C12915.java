package p067l;

/* JADX INFO: renamed from: l.ۧܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12915 extends EnumC2483 {
    public /* synthetic */ C12915(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("SOURCE", 36, "--source -source", "opt.arg.release", "opt.source", enumC19919, enumC5837);
    }

    public C12915(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        if (EnumC17840.m40514(str2) == null) {
            C14040 c14040 = C8300.f21997;
            throw abstractC3154.m5388(new C14040("compiler", "invalid.source", str2));
        }
        super.mo3580(abstractC3154, str, str2);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3582(C23623 c23623) {
        C21543 c21543 = new C21543(", ");
        for (EnumC17840 enumC17840 : EnumC17840.values()) {
            if (enumC17840.m40518()) {
                c21543.add(enumC17840.f53238);
            }
        }
        super.m3583(c23623, c23623.m52449(EnumC16916.JAVAC, this.f3988, c21543.toString()));
    }
}
