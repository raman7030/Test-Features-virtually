package p067l;

/* JADX INFO: renamed from: l.֡ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2855 extends EnumC2483 {
    public /* synthetic */ C2855(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("WARNUNCHECKED", 54, "-warnunchecked", null, enumC19919, enumC5837);
    }

    public C2855(String str, int i, String str2, String str3, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) {
        abstractC3154.mo5391("-Xlint:unchecked", str);
    }
}
