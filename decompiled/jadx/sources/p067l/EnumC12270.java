package p067l;

/* JADX INFO: renamed from: l.ۤܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66JZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12270 {
    AOSP(64, "aosp"),
    MOTOROLA_76(76, "motorola76");


    /* JADX INFO: renamed from: ᩸ */
    public final int f34283;

    /* JADX INFO: renamed from: ᩹ */
    public final String f34284;

    EnumC12270(int i, String str) {
        this.f34283 = i;
        this.f34284 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC12270 m28288(String str) {
        for (EnumC12270 enumC12270 : values()) {
            if (enumC12270.f34284.equals(str)) {
                return enumC12270;
            }
        }
        throw new IllegalArgumentException(C21466.m48631("Unknown config layout: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public int m28290() {
        return this == MOTOROLA_76 ? 1835008 : 0;
    }
}
