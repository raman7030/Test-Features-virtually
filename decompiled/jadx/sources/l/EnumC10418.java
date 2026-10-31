package l;

/* JADX INFO: renamed from: l.ۤܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66JZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10418 {
    AOSP(64, "aosp"),
    MOTOROLA_76(76, "motorola76");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f31318;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f31319;

    EnumC10418(int i, String str) {
        this.f31318 = i;
        this.f31319 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10418 m26259(String str) {
        for (EnumC10418 enumC10418 : values()) {
            if (enumC10418.f31319.equals(str)) {
                return enumC10418;
            }
        }
        throw new IllegalArgumentException(C20094.m46315("Unknown config layout: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m26261() {
        return this == MOTOROLA_76 ? 1835008 : 0;
    }
}
