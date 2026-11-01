package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܽ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18072 {
    public static final EnumC18072 CONTINUE;
    public static final EnumC18072 SKIP_SIBLINGS;
    public static final EnumC18072 SKIP_SUBTREE;
    public static final EnumC18072 TERMINATE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC18072[] f53976a;

    public static EnumC18072 valueOf(String str) {
        return (EnumC18072) Enum.valueOf(EnumC18072.class, str);
    }

    public static EnumC18072[] values() {
        return (EnumC18072[]) f53976a.clone();
    }

    static {
        EnumC18072 enumC18072 = new EnumC18072("CONTINUE", 0);
        CONTINUE = enumC18072;
        EnumC18072 enumC18073 = new EnumC18072("TERMINATE", 1);
        TERMINATE = enumC18073;
        EnumC18072 enumC18074 = new EnumC18072("SKIP_SUBTREE", 2);
        SKIP_SUBTREE = enumC18074;
        EnumC18072 enumC18075 = new EnumC18072("SKIP_SIBLINGS", 3);
        SKIP_SIBLINGS = enumC18075;
        f53976a = new EnumC18072[]{enumC18072, enumC18073, enumC18074, enumC18075};
    }
}
