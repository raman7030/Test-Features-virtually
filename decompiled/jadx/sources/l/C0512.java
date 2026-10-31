package l;

/* JADX INFO: renamed from: l.֡ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0512 extends EnumC0121 {
    public /* synthetic */ C0512(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("WARNUNCHECKED", 54, "-warnunchecked", null, enumC18467, enumC3650);
    }

    public C0512(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        abstractC0827.mo3077("-Xlint:unchecked", str);
    }
}
