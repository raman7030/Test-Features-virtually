package l;

/* JADX INFO: renamed from: l.ۨ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HU */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC11696 implements InterfaceC21614 {
    FILE_READ_DATA(1),
    FILE_WRITE_DATA(2),
    FILE_APPEND_DATA(4),
    FILE_EXECUTE(32),
    FILE_LIST_DIRECTORY(1),
    FILE_ADD_FILE(2),
    FILE_ADD_SUBDIRECTORY(4),
    FILE_TRAVERSE(32),
    FILE_DELETE_CHILD(64),
    FILE_READ_ATTRIBUTES(128),
    FILE_WRITE_ATTRIBUTES(256),
    FILE_READ_EA(8),
    FILE_WRITE_EA(16),
    DELETE(65536),
    READ_CONTROL(131072),
    WRITE_DAC(262144),
    WRITE_OWNER(524288),
    SYNCHRONIZE(1048576),
    ACCESS_SYSTEM_SECURITY(16777216),
    MAXIMUM_ALLOWED(33554432),
    GENERIC_ALL(268435456),
    GENERIC_EXECUTE(536870912),
    GENERIC_WRITE(1073741824),
    GENERIC_READ(2147483648L),
    ADS_RIGHT_DS_CONTROL_ACCESS(256),
    ADS_RIGHT_DS_CREATE_CHILD(1),
    ADS_RIGHT_DS_DELETE_CHILD(2),
    ADS_RIGHT_DS_READ_PROP(16),
    ADS_RIGHT_DS_WRITE_PROP(32),
    ADS_RIGHT_DS_SELF(8);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f34898;

    EnumC11696(long j) {
        this.f34898 = j;
    }

    @Override // l.InterfaceC21614
    public long getValue() {
        return this.f34898;
    }
}
