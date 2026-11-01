package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۖ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4662 implements InterfaceC23911 {
    public static final EnumC4662 ATOMIC_MOVE;
    public static final EnumC4662 COPY_ATTRIBUTES;
    public static final EnumC4662 REPLACE_EXISTING;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC4662[] f10481a;

    public static EnumC4662 valueOf(String str) {
        return (EnumC4662) Enum.valueOf(EnumC4662.class, str);
    }

    public static EnumC4662[] values() {
        return (EnumC4662[]) f10481a.clone();
    }

    static {
        EnumC4662 enumC4662 = new EnumC4662("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = enumC4662;
        EnumC4662 enumC4663 = new EnumC4662("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = enumC4663;
        EnumC4662 enumC4664 = new EnumC4662("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = enumC4664;
        f10481a = new EnumC4662[]{enumC4662, enumC4663, enumC4664};
    }
}
