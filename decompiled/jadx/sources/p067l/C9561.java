package p067l;

/* JADX INFO: renamed from: l.۟ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9561 extends EnumC2483 {
    public /* synthetic */ C9561(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("DEPRECATION", 10, "-deprecation", "opt.deprecation", enumC19919, enumC5837);
    }

    public C9561(String str, int i, String str2, String str3, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) {
        abstractC3154.mo5391("-Xlint:deprecation", str);
    }
}
