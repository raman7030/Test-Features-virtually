package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩹۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC23417 {

    /* JADX INFO: renamed from: OP */
    public static final EnumC23417 f74573OP;
    public static final EnumC23417 SPLITERATOR;
    public static final EnumC23417 STREAM;
    public static final EnumC23417 TERMINAL_OP;
    public static final EnumC23417 UPSTREAM_TERMINAL_OP;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC23417[] f74574a;

    public static EnumC23417 valueOf(String str) {
        return (EnumC23417) Enum.valueOf(EnumC23417.class, str);
    }

    public static EnumC23417[] values() {
        return (EnumC23417[]) f74574a.clone();
    }

    static {
        EnumC23417 enumC23417 = new EnumC23417("SPLITERATOR", 0);
        SPLITERATOR = enumC23417;
        EnumC23417 enumC23418 = new EnumC23417("STREAM", 1);
        STREAM = enumC23418;
        EnumC23417 enumC23419 = new EnumC23417("OP", 2);
        f74573OP = enumC23419;
        EnumC23417 enumC234110 = new EnumC23417("TERMINAL_OP", 3);
        TERMINAL_OP = enumC234110;
        EnumC23417 enumC234111 = new EnumC23417("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC234111;
        f74574a = new EnumC23417[]{enumC23417, enumC23418, enumC23419, enumC234110, enumC234111};
    }
}
