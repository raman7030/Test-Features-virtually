package p067l;

/* JADX INFO: renamed from: l.᩶ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21691 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f68311;

    /* JADX INFO: renamed from: ۧ */
    public final String f68312;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f68313;

    /* JADX INFO: renamed from: ܽ */
    public final String f68314;

    /* JADX INFO: renamed from: ܿ */
    public final Integer f68315;

    /* JADX INFO: renamed from: ᩳ */
    public final String f68316;

    public C21691(String str, String str2, Integer num, boolean z, boolean z2, String str3) {
        this.f68314 = str;
        this.f68316 = str2;
        this.f68315 = num;
        this.f68313 = z;
        this.f68311 = z2;
        this.f68312 = str3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21691 m48965(int i, String str, String str2) {
        return new C21691(str, str2, Integer.valueOf(i), false, true, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21691 m48964(int i, String str) {
        return new C21691(str, null, Integer.valueOf(i), true, true, "VALUE_XML_TRUNCATED");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21691 m48966(String str) {
        return new C21691(str, null, null, false, false, "VALUE_XML_TOO_LARGE");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21691 m48967(String str, String str2) {
        return new C21691(str, null, null, false, false, str2);
    }
}
