package l;

/* JADX INFO: renamed from: l.᩶ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20269 extends EnumC0121 {
    public /* synthetic */ C20269(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("XD", 71, "-XD", null, enumC18467, enumC3650);
    }

    public C20269(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1183(String str) {
        return str.startsWith(this.f1214);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        mo1179(abstractC0827, str, str.substring(this.f1214.length()));
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) {
        int iIndexOf = str2.indexOf(61);
        String strSubstring = iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf);
        if (iIndexOf >= 0) {
            str2 = str2.substring(iIndexOf + 1);
        }
        abstractC0827.mo3077(strSubstring, str2);
    }
}
