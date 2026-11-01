package p067l;

/* JADX INFO: renamed from: l.᩺ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9JY */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24036 {
    SMB2_NEGOTIATE(0),
    SMB2_SESSION_SETUP(1),
    SMB2_LOGOFF(2),
    SMB2_TREE_CONNECT(3),
    SMB2_TREE_DISCONNECT(4),
    SMB2_CREATE(5),
    SMB2_CLOSE(6),
    SMB2_FLUSH(7),
    SMB2_READ(8),
    SMB2_WRITE(9),
    SMB2_LOCK(10),
    SMB2_IOCTL(11),
    SMB2_CANCEL(12),
    SMB2_ECHO(13),
    SMB2_QUERY_DIRECTORY(14),
    SMB2_CHANGE_NOTIFY(15),
    SMB2_QUERY_INFO(16),
    SMB2_SET_INFO(17),
    SMB2_OPLOCK_BREAK(18);


    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC24036[] f76355 = new EnumC24036[19];

    /* JADX INFO: renamed from: ᩸ */
    public int f76359;

    static {
        for (EnumC24036 enumC24036 : values()) {
            f76355[enumC24036.getValue()] = enumC24036;
        }
    }

    EnumC24036(int i) {
        this.f76359 = i;
    }

    public int getValue() {
        return this.f76359;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC24036 m53278(int i) {
        return f76355[i];
    }
}
