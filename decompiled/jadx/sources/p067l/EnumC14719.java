package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۬۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14719 {
    public static final EnumC14719 GROUP_EXECUTE;
    public static final EnumC14719 GROUP_READ;
    public static final EnumC14719 GROUP_WRITE;
    public static final EnumC14719 OTHERS_EXECUTE;
    public static final EnumC14719 OTHERS_READ;
    public static final EnumC14719 OTHERS_WRITE;
    public static final EnumC14719 OWNER_EXECUTE;
    public static final EnumC14719 OWNER_READ;
    public static final EnumC14719 OWNER_WRITE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC14719[] f41967a;

    public static EnumC14719 valueOf(String str) {
        return (EnumC14719) Enum.valueOf(EnumC14719.class, str);
    }

    public static EnumC14719[] values() {
        return (EnumC14719[]) f41967a.clone();
    }

    static {
        EnumC14719 enumC14719 = new EnumC14719("OWNER_READ", 0);
        OWNER_READ = enumC14719;
        EnumC14719 enumC147110 = new EnumC14719("OWNER_WRITE", 1);
        OWNER_WRITE = enumC147110;
        EnumC14719 enumC147111 = new EnumC14719("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = enumC147111;
        EnumC14719 enumC147112 = new EnumC14719("GROUP_READ", 3);
        GROUP_READ = enumC147112;
        EnumC14719 enumC147113 = new EnumC14719("GROUP_WRITE", 4);
        GROUP_WRITE = enumC147113;
        EnumC14719 enumC147114 = new EnumC14719("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = enumC147114;
        EnumC14719 enumC147115 = new EnumC14719("OTHERS_READ", 6);
        OTHERS_READ = enumC147115;
        EnumC14719 enumC147116 = new EnumC14719("OTHERS_WRITE", 7);
        OTHERS_WRITE = enumC147116;
        EnumC14719 enumC147117 = new EnumC14719("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = enumC147117;
        f41967a = new EnumC14719[]{enumC14719, enumC147110, enumC147111, enumC147112, enumC147113, enumC147114, enumC147115, enumC147116, enumC147117};
    }
}
