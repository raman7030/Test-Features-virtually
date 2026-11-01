package p067l;

/* JADX INFO: renamed from: l.۠ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AYO */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10104 {
    V1_V2_V3("V1 + V2 + V3", true, true, true),
    V1_V2("V1 + V2", true, true, false),
    V1_V3("V1 + V3", true, false, true),
    V1("V1", true, false, false),
    V2_V3("V2 + V3 (Android 7.0+)", false, true, true),
    V2("V2 (Android 7.0+)", false, true, false),
    V3("V3 (Android 9.0+)", false, false, true);


    /* JADX INFO: renamed from: ۙ */
    public final String f28036;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f28037;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f28038;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f28039;

    EnumC10104(String str, boolean z, boolean z2, boolean z3) {
        this.f28036 = str;
        this.f28038 = z;
        this.f28039 = z2;
        this.f28037 = z3;
    }
}
