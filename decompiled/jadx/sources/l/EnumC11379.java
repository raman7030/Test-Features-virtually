package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۨ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11379 {
    public static final EnumC11379 EXECUTE;
    public static final EnumC11379 READ;
    public static final EnumC11379 WRITE;
    public static final /* synthetic */ EnumC11379[] a;

    public static EnumC11379 valueOf(String str) {
        return (EnumC11379) Enum.valueOf(EnumC11379.class, str);
    }

    public static EnumC11379[] values() {
        return (EnumC11379[]) a.clone();
    }

    static {
        EnumC11379 enumC11379 = new EnumC11379("READ", 0);
        READ = enumC11379;
        EnumC11379 enumC113710 = new EnumC11379("WRITE", 1);
        WRITE = enumC113710;
        EnumC11379 enumC113711 = new EnumC11379("EXECUTE", 2);
        EXECUTE = enumC113711;
        a = new EnumC11379[]{enumC11379, enumC113710, enumC113711};
    }
}
