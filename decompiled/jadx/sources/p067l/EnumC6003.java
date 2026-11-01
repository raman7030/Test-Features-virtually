package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۘ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6003 implements InterfaceC24778 {
    public static final EnumC6003 APPEND;
    public static final EnumC6003 CREATE;
    public static final EnumC6003 CREATE_NEW;
    public static final EnumC6003 DELETE_ON_CLOSE;
    public static final EnumC6003 DSYNC;
    public static final EnumC6003 READ;
    public static final EnumC6003 SPARSE;
    public static final EnumC6003 SYNC;
    public static final EnumC6003 TRUNCATE_EXISTING;
    public static final EnumC6003 WRITE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6003[] f15052a;

    public static EnumC6003 valueOf(String str) {
        return (EnumC6003) Enum.valueOf(EnumC6003.class, str);
    }

    public static EnumC6003[] values() {
        return (EnumC6003[]) f15052a.clone();
    }

    static {
        EnumC6003 enumC6003 = new EnumC6003("READ", 0);
        READ = enumC6003;
        EnumC6003 enumC6004 = new EnumC6003("WRITE", 1);
        WRITE = enumC6004;
        EnumC6003 enumC6005 = new EnumC6003("APPEND", 2);
        APPEND = enumC6005;
        EnumC6003 enumC6006 = new EnumC6003("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = enumC6006;
        EnumC6003 enumC6007 = new EnumC6003("CREATE", 4);
        CREATE = enumC6007;
        EnumC6003 enumC6008 = new EnumC6003("CREATE_NEW", 5);
        CREATE_NEW = enumC6008;
        EnumC6003 enumC6009 = new EnumC6003("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = enumC6009;
        EnumC6003 enumC60010 = new EnumC6003("SPARSE", 7);
        SPARSE = enumC60010;
        EnumC6003 enumC60011 = new EnumC6003("SYNC", 8);
        SYNC = enumC60011;
        EnumC6003 enumC60012 = new EnumC6003("DSYNC", 9);
        DSYNC = enumC60012;
        f15052a = new EnumC6003[]{enumC6003, enumC6004, enumC6005, enumC6006, enumC6007, enumC6008, enumC6009, enumC60010, enumC60011, enumC60012};
    }
}
