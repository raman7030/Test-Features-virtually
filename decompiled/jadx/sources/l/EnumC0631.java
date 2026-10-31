package l;

/* JADX INFO: renamed from: l.֡᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5P4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0631 {
    DBG_END_SEQUENCE((byte) 0),
    DBG_ADVANCE_PC((byte) 1),
    DBG_ADVANCE_LINE((byte) 2),
    DBG_START_LOCAL((byte) 3),
    DBG_START_LOCAL_EXTENDED((byte) 4),
    DBG_END_LOCAL((byte) 5),
    DBG_RESTART_LOCAL((byte) 6),
    DBG_SET_PROLOGUE_END((byte) 7),
    DBG_SET_EPILOGUE_BEGIN((byte) 8),
    DBG_SET_FILE((byte) 9),
    DBG_SPECIAL_OPCODE((byte) 10);


    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static EnumC0631[] f2411 = new EnumC0631[11];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte f2424;

    static {
        for (EnumC0631 enumC0631 : values()) {
            f2411[enumC0631.f2424 & 255] = enumC0631;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0631 m2578(byte b) {
        return f2411[(byte) Math.min(b & 255, 10)];
    }

    EnumC0631(byte b) {
        this.f2424 = b;
    }
}
