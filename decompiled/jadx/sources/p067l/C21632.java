package p067l;

/* JADX INFO: renamed from: l.᩶ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21632 extends EnumC2483 {
    public /* synthetic */ C21632(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("XD", 71, "-XD", null, enumC19919, enumC5837);
    }

    public C21632(String str, int i, String str2, String str3, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3584(String str) {
        return str.startsWith(this.f3990);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) {
        mo3580(abstractC3154, str, str.substring(this.f3990.length()));
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) {
        int iIndexOf = str2.indexOf(61);
        String strSubstring = iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf);
        if (iIndexOf >= 0) {
            str2 = str2.substring(iIndexOf + 1);
        }
        abstractC3154.mo5391(strSubstring, str2);
    }
}
