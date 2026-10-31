package l;

/* JADX INFO: renamed from: l.ܳܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14623 extends EnumC0121 {
    public /* synthetic */ C14623(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("PROFILE", 40, "-profile", "opt.arg.profile", "opt.profile", enumC18467, enumC3650);
    }

    public C14623(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        if (EnumC5973.m16740(str2) == null) {
            C12281 c12281 = C6241.f19132;
            throw abstractC0827.m3074(new C12281("compiler", "invalid.profile", str2));
        }
        super.mo1179(abstractC0827, str, str2);
    }
}
