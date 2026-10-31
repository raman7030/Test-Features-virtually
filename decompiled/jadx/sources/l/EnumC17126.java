package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܿۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC17126 {
    public static final EnumC17126 LENIENT;
    public static final EnumC17126 SMART;
    public static final EnumC17126 STRICT;
    public static final /* synthetic */ EnumC17126[] a;

    public static EnumC17126 valueOf(String str) {
        return (EnumC17126) Enum.valueOf(EnumC17126.class, str);
    }

    public static EnumC17126[] values() {
        return (EnumC17126[]) a.clone();
    }

    static {
        EnumC17126 enumC17126 = new EnumC17126("STRICT", 0);
        STRICT = enumC17126;
        EnumC17126 enumC17127 = new EnumC17126("SMART", 1);
        SMART = enumC17127;
        EnumC17126 enumC17128 = new EnumC17126("LENIENT", 2);
        LENIENT = enumC17128;
        a = new EnumC17126[]{enumC17126, enumC17127, enumC17128};
    }
}
