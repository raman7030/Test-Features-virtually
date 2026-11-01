package p067l;

/* JADX INFO: renamed from: l.ۨܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65AK */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13558 {
    BUILD((byte) 0, "build"),
    RUNTIME((byte) 1, "runtime"),
    SYSTEM((byte) 2, "system");


    /* JADX INFO: renamed from: ᩸ */
    public final byte f38136;

    /* JADX INFO: renamed from: ᩹ */
    public final String f38137;

    EnumC13558(byte b, String str) {
        this.f38136 = b;
        this.f38137 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC13558 m30859(byte b) {
        if (b == 0) {
            return BUILD;
        }
        if (b == 1) {
            return RUNTIME;
        }
        if (b == 2) {
            return SYSTEM;
        }
        throw new RuntimeException(C20778.m46922(b, "Invalid annotation visibility value: "));
    }
}
