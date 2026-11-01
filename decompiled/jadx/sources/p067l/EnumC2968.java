package p067l;

/* JADX INFO: renamed from: l.֡᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5P4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2968 {
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


    /* JADX INFO: renamed from: ֫֫ */
    public static EnumC2968[] f5183 = new EnumC2968[11];

    /* JADX INFO: renamed from: ᩸ */
    public final byte f5196;

    static {
        for (EnumC2968 enumC2968 : values()) {
            f5183[enumC2968.f5196 & 255] = enumC2968;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC2968 m4918(byte b) {
        return f5183[(byte) Math.min(b & 255, 10)];
    }

    EnumC2968(byte b) {
        this.f5196 = b;
    }
}
