package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܿۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18645 {
    public static final EnumC18645 LENIENT;
    public static final EnumC18645 SMART;
    public static final EnumC18645 STRICT;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC18645[] f55657a;

    public static EnumC18645 valueOf(String str) {
        return (EnumC18645) Enum.valueOf(EnumC18645.class, str);
    }

    public static EnumC18645[] values() {
        return (EnumC18645[]) f55657a.clone();
    }

    static {
        EnumC18645 enumC18645 = new EnumC18645("STRICT", 0);
        STRICT = enumC18645;
        EnumC18645 enumC18646 = new EnumC18645("SMART", 1);
        SMART = enumC18646;
        EnumC18645 enumC18647 = new EnumC18645("LENIENT", 2);
        LENIENT = enumC18647;
        f55657a = new EnumC18645[]{enumC18645, enumC18646, enumC18647};
    }
}
