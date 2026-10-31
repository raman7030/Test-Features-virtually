package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۘ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3824 implements InterfaceC23579 {
    public static final EnumC3824 APPEND;
    public static final EnumC3824 CREATE;
    public static final EnumC3824 CREATE_NEW;
    public static final EnumC3824 DELETE_ON_CLOSE;
    public static final EnumC3824 DSYNC;
    public static final EnumC3824 READ;
    public static final EnumC3824 SPARSE;
    public static final EnumC3824 SYNC;
    public static final EnumC3824 TRUNCATE_EXISTING;
    public static final EnumC3824 WRITE;
    public static final /* synthetic */ EnumC3824[] a;

    public static EnumC3824 valueOf(String str) {
        return (EnumC3824) Enum.valueOf(EnumC3824.class, str);
    }

    public static EnumC3824[] values() {
        return (EnumC3824[]) a.clone();
    }

    static {
        EnumC3824 enumC3824 = new EnumC3824("READ", 0);
        READ = enumC3824;
        EnumC3824 enumC3825 = new EnumC3824("WRITE", 1);
        WRITE = enumC3825;
        EnumC3824 enumC3826 = new EnumC3824("APPEND", 2);
        APPEND = enumC3826;
        EnumC3824 enumC3827 = new EnumC3824("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = enumC3827;
        EnumC3824 enumC3828 = new EnumC3824("CREATE", 4);
        CREATE = enumC3828;
        EnumC3824 enumC3829 = new EnumC3824("CREATE_NEW", 5);
        CREATE_NEW = enumC3829;
        EnumC3824 enumC38210 = new EnumC3824("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = enumC38210;
        EnumC3824 enumC38211 = new EnumC3824("SPARSE", 7);
        SPARSE = enumC38211;
        EnumC3824 enumC38212 = new EnumC3824("SYNC", 8);
        SYNC = enumC38212;
        EnumC3824 enumC38213 = new EnumC3824("DSYNC", 9);
        DSYNC = enumC38213;
        a = new EnumC3824[]{enumC3824, enumC3825, enumC3826, enumC3827, enumC3828, enumC3829, enumC38210, enumC38211, enumC38212, enumC38213};
    }
}
