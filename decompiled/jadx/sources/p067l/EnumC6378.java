package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۘ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC6378 {
    public static final EnumC6378 END_DIRECTORY;
    public static final EnumC6378 ENTRY;
    public static final EnumC6378 START_DIRECTORY;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC6378[] f16505a;

    public static EnumC6378 valueOf(String str) {
        return (EnumC6378) Enum.valueOf(EnumC6378.class, str);
    }

    public static EnumC6378[] values() {
        return (EnumC6378[]) f16505a.clone();
    }

    static {
        EnumC6378 enumC6378 = new EnumC6378("START_DIRECTORY", 0);
        START_DIRECTORY = enumC6378;
        EnumC6378 enumC6379 = new EnumC6378("END_DIRECTORY", 1);
        END_DIRECTORY = enumC6379;
        EnumC6378 enumC63710 = new EnumC6378("ENTRY", 2);
        ENTRY = enumC63710;
        f16505a = new EnumC6378[]{enumC6378, enumC6379, enumC63710};
    }
}
