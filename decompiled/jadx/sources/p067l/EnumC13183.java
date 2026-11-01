package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۨ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13183 {
    public static final EnumC13183 EXECUTE;
    public static final EnumC13183 READ;
    public static final EnumC13183 WRITE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC13183[] f37040a;

    public static EnumC13183 valueOf(String str) {
        return (EnumC13183) Enum.valueOf(EnumC13183.class, str);
    }

    public static EnumC13183[] values() {
        return (EnumC13183[]) f37040a.clone();
    }

    static {
        EnumC13183 enumC13183 = new EnumC13183("READ", 0);
        READ = enumC13183;
        EnumC13183 enumC13184 = new EnumC13183("WRITE", 1);
        WRITE = enumC13184;
        EnumC13183 enumC13185 = new EnumC13183("EXECUTE", 2);
        EXECUTE = enumC13185;
        f37040a = new EnumC13183[]{enumC13183, enumC13184, enumC13185};
    }
}
