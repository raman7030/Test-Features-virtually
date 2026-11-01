package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۡ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC10521 {
    public static final EnumC10521 DOUBLE_VALUE;
    public static final EnumC10521 INT_VALUE;
    public static final EnumC10521 LONG_VALUE;
    public static final EnumC10521 REFERENCE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC10521[] f29116a;

    public static EnumC10521 valueOf(String str) {
        return (EnumC10521) Enum.valueOf(EnumC10521.class, str);
    }

    public static EnumC10521[] values() {
        return (EnumC10521[]) f29116a.clone();
    }

    static {
        EnumC10521 enumC10521 = new EnumC10521("REFERENCE", 0);
        REFERENCE = enumC10521;
        EnumC10521 enumC10522 = new EnumC10521("INT_VALUE", 1);
        INT_VALUE = enumC10522;
        EnumC10521 enumC10523 = new EnumC10521("LONG_VALUE", 2);
        LONG_VALUE = enumC10523;
        EnumC10521 enumC10524 = new EnumC10521("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC10524;
        f29116a = new EnumC10521[]{enumC10521, enumC10522, enumC10523, enumC10524};
    }
}
