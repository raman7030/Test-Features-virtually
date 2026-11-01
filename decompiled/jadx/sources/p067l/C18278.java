package p067l;

/* JADX INFO: renamed from: l.ܽܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C18278 extends EnumC2483 {
    public /* synthetic */ C18278(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("TARGET", 37, "--target -target", "opt.arg.release", "opt.target", enumC19919, enumC5837);
    }

    public C18278(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        if (EnumC12720.m29245(str2) == null) {
            C14040 c14040 = C8300.f21997;
            throw abstractC3154.m5388(new C14040("compiler", "invalid.target", str2));
        }
        super.mo3580(abstractC3154, str, str2);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3582(C23623 c23623) {
        C21543 c21543 = new C21543(", ");
        for (EnumC12720 enumC12720 : EnumC12720.values()) {
            if (enumC12720.m29250()) {
                c21543.add(enumC12720.f35733);
            }
        }
        super.m3583(c23623, c23623.m52449(EnumC16916.JAVAC, this.f3988, c21543.toString()));
    }
}
