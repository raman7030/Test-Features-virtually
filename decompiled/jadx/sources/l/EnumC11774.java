package l;

/* JADX INFO: renamed from: l.ۨܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11774 {
    BUILD((byte) 0, "build"),
    RUNTIME((byte) 1, "runtime"),
    SYSTEM((byte) 2, "system");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte f35137;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f35138;

    EnumC11774(byte b, String str) {
        this.f35137 = b;
        this.f35138 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC11774 m28811(byte b) {
        if (b == 0) {
            return BUILD;
        }
        if (b == 1) {
            return RUNTIME;
        }
        if (b == 2) {
            return SYSTEM;
        }
        throw new RuntimeException(C19370.m44628(b, "Invalid annotation visibility value: "));
    }
}
