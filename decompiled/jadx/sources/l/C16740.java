package l;

/* JADX INFO: renamed from: l.ܽܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16740 extends EnumC0121 {
    public /* synthetic */ C16740(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("TARGET", 37, "--target -target", "opt.arg.release", "opt.target", enumC18467, enumC3650);
    }

    public C16740(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        if (EnumC10892.m27200(str2) == null) {
            C12281 c12281 = C6241.f19132;
            throw abstractC0827.m3074(new C12281("compiler", "invalid.target", str2));
        }
        super.mo1179(abstractC0827, str, str2);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1181(C22364 c22364) {
        C20175 c20175 = new C20175(", ");
        for (EnumC10892 enumC10892 : EnumC10892.values()) {
            if (enumC10892.m27205()) {
                c20175.add(enumC10892.f32755);
            }
        }
        super.m1182(c22364, c22364.m50109(EnumC15307.JAVAC, this.f1212, c20175.toString()));
    }
}
