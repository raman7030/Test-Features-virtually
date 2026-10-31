package l;

/* JADX INFO: renamed from: l.᩸ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C21680 extends EnumC0121 {
    public /* synthetic */ C21680(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("XDOCLINT_CUSTOM", 6, "-Xdoclint:", "opt.Xdoclint.subopts", "opt.Xdoclint.custom", enumC18467, enumC3650);
    }

    public C21680(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1183(String str) {
        return AbstractC0821.m3067().mo3068(str.replace(EnumC0121.f1164.f1214, "-Xmsgs:"));
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) {
        EnumC0121 enumC0121 = EnumC0121.f1164;
        String strMo3073 = abstractC0827.mo3073(enumC0121);
        if (strMo3073 != null) {
            str2 = C22870.m50967(strMo3073, " ", str2);
        }
        abstractC0827.mo3077(enumC0121.f1214, str2);
    }
}
