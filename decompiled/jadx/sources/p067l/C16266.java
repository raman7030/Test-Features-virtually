package p067l;

/* JADX INFO: renamed from: l.ܳܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16266 extends EnumC2483 {
    public /* synthetic */ C16266(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("PROFILE", 40, "-profile", "opt.arg.profile", "opt.profile", enumC19919, enumC5837);
    }

    public C16266(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        if (EnumC8045.m18666(str2) == null) {
            C14040 c14040 = C8300.f21997;
            throw abstractC3154.m5388(new C14040("compiler", "invalid.profile", str2));
        }
        super.mo3580(abstractC3154, str, str2);
    }
}
