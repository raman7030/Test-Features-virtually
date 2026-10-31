package l;

/* JADX INFO: renamed from: l.᩺ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9JY */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22799 {
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


    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final EnumC22799[] f73625 = new EnumC22799[19];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73629;

    static {
        for (EnumC22799 enumC22799 : values()) {
            f73625[enumC22799.getValue()] = enumC22799;
        }
    }

    EnumC22799(int i) {
        this.f73629 = i;
    }

    public int getValue() {
        return this.f73629;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22799 m50888(int i) {
        return f73625[i];
    }
}
