package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۛۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6043 {
    public static final EnumC6043 CONCURRENT;
    public static final EnumC6043 IDENTITY_FINISH;
    public static final EnumC6043 UNORDERED;
    public static final /* synthetic */ EnumC6043[] a;

    public static EnumC6043 valueOf(String str) {
        return (EnumC6043) Enum.valueOf(EnumC6043.class, str);
    }

    public static EnumC6043[] values() {
        return (EnumC6043[]) a.clone();
    }

    static {
        EnumC6043 enumC6043 = new EnumC6043("CONCURRENT", 0);
        CONCURRENT = enumC6043;
        EnumC6043 enumC6044 = new EnumC6043("UNORDERED", 1);
        UNORDERED = enumC6044;
        EnumC6043 enumC6045 = new EnumC6043("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC6045;
        a = new EnumC6043[]{enumC6043, enumC6044, enumC6045};
    }
}
