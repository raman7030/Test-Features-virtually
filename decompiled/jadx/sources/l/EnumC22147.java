package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩹۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC22147 {
    public static final EnumC22147 OP;
    public static final EnumC22147 SPLITERATOR;
    public static final EnumC22147 STREAM;
    public static final EnumC22147 TERMINAL_OP;
    public static final EnumC22147 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ EnumC22147[] a;

    public static EnumC22147 valueOf(String str) {
        return (EnumC22147) Enum.valueOf(EnumC22147.class, str);
    }

    public static EnumC22147[] values() {
        return (EnumC22147[]) a.clone();
    }

    static {
        EnumC22147 enumC22147 = new EnumC22147("SPLITERATOR", 0);
        SPLITERATOR = enumC22147;
        EnumC22147 enumC22148 = new EnumC22147("STREAM", 1);
        STREAM = enumC22148;
        EnumC22147 enumC22149 = new EnumC22147("OP", 2);
        OP = enumC22149;
        EnumC22147 enumC221410 = new EnumC22147("TERMINAL_OP", 3);
        TERMINAL_OP = enumC221410;
        EnumC22147 enumC221411 = new EnumC22147("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC221411;
        a = new EnumC22147[]{enumC22147, enumC22148, enumC22149, enumC221410, enumC221411};
    }
}
