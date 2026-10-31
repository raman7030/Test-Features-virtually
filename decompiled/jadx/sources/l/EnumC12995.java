package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۬۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12995 {
    public static final EnumC12995 GROUP_EXECUTE;
    public static final EnumC12995 GROUP_READ;
    public static final EnumC12995 GROUP_WRITE;
    public static final EnumC12995 OTHERS_EXECUTE;
    public static final EnumC12995 OTHERS_READ;
    public static final EnumC12995 OTHERS_WRITE;
    public static final EnumC12995 OWNER_EXECUTE;
    public static final EnumC12995 OWNER_READ;
    public static final EnumC12995 OWNER_WRITE;
    public static final /* synthetic */ EnumC12995[] a;

    public static EnumC12995 valueOf(String str) {
        return (EnumC12995) Enum.valueOf(EnumC12995.class, str);
    }

    public static EnumC12995[] values() {
        return (EnumC12995[]) a.clone();
    }

    static {
        EnumC12995 enumC12995 = new EnumC12995("OWNER_READ", 0);
        OWNER_READ = enumC12995;
        EnumC12995 enumC12996 = new EnumC12995("OWNER_WRITE", 1);
        OWNER_WRITE = enumC12996;
        EnumC12995 enumC12997 = new EnumC12995("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = enumC12997;
        EnumC12995 enumC12998 = new EnumC12995("GROUP_READ", 3);
        GROUP_READ = enumC12998;
        EnumC12995 enumC12999 = new EnumC12995("GROUP_WRITE", 4);
        GROUP_WRITE = enumC12999;
        EnumC12995 enumC129910 = new EnumC12995("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = enumC129910;
        EnumC12995 enumC129911 = new EnumC12995("OTHERS_READ", 6);
        OTHERS_READ = enumC129911;
        EnumC12995 enumC129912 = new EnumC12995("OTHERS_WRITE", 7);
        OTHERS_WRITE = enumC129912;
        EnumC12995 enumC129913 = new EnumC12995("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = enumC129913;
        a = new EnumC12995[]{enumC12995, enumC12996, enumC12997, enumC12998, enumC12999, enumC129910, enumC129911, enumC129912, enumC129913};
    }
}
