package l;

/* JADX INFO: renamed from: l.ۧܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11097 extends EnumC0121 {
    public /* synthetic */ C11097(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("SOURCE", 36, "--source -source", "opt.arg.release", "opt.source", enumC18467, enumC3650);
    }

    public C11097(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        if (EnumC16280.m38300(str2) == null) {
            C12281 c12281 = C6241.f19132;
            throw abstractC0827.m3074(new C12281("compiler", "invalid.source", str2));
        }
        super.mo1179(abstractC0827, str, str2);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1181(C22364 c22364) {
        C20175 c20175 = new C20175(", ");
        for (EnumC16280 enumC16280 : EnumC16280.values()) {
            if (enumC16280.m38304()) {
                c20175.add(enumC16280.f50071);
            }
        }
        super.m1182(c22364, c22364.m50109(EnumC15307.JAVAC, this.f1212, c20175.toString()));
    }
}
