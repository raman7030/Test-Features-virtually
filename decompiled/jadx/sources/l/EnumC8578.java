package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۡ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8578 {
    public static final EnumC8578 DOUBLE_VALUE;
    public static final EnumC8578 INT_VALUE;
    public static final EnumC8578 LONG_VALUE;
    public static final EnumC8578 REFERENCE;
    public static final /* synthetic */ EnumC8578[] a;

    public static EnumC8578 valueOf(String str) {
        return (EnumC8578) Enum.valueOf(EnumC8578.class, str);
    }

    public static EnumC8578[] values() {
        return (EnumC8578[]) a.clone();
    }

    static {
        EnumC8578 enumC8578 = new EnumC8578("REFERENCE", 0);
        REFERENCE = enumC8578;
        EnumC8578 enumC8579 = new EnumC8578("INT_VALUE", 1);
        INT_VALUE = enumC8579;
        EnumC8578 enumC85710 = new EnumC8578("LONG_VALUE", 2);
        LONG_VALUE = enumC85710;
        EnumC8578 enumC85711 = new EnumC8578("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC85711;
        a = new EnumC8578[]{enumC8578, enumC8579, enumC85710, enumC85711};
    }
}
