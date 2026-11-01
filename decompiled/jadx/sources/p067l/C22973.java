package p067l;

/* JADX INFO: renamed from: l.᩸ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C22973 extends EnumC2483 {
    public /* synthetic */ C22973(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("XDOCLINT_CUSTOM", 6, "-Xdoclint:", "opt.Xdoclint.subopts", "opt.Xdoclint.custom", enumC19919, enumC5837);
    }

    public C22973(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3584(String str) {
        return AbstractC3148.m5381().mo5382(str.replace(EnumC2483.f3940.f3990, "-Xmsgs:"));
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) {
        EnumC2483 enumC2483 = EnumC2483.f3940;
        String strMo5387 = abstractC3154.mo5387(enumC2483);
        if (strMo5387 != null) {
            str2 = C24104.m53357(strMo5387, " ", str2);
        }
        abstractC3154.mo5391(enumC2483.f3990, str2);
    }
}
