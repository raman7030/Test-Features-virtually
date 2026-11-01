package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩻ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC24680 {
    public static final EnumC24680 ALWAYS;
    public static final EnumC24680 EXCEEDS_PAD;
    public static final EnumC24680 NEVER;
    public static final EnumC24680 NORMAL;
    public static final EnumC24680 NOT_NEGATIVE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC24680[] f78076a;

    public static EnumC24680 valueOf(String str) {
        return (EnumC24680) Enum.valueOf(EnumC24680.class, str);
    }

    public static EnumC24680[] values() {
        return (EnumC24680[]) f78076a.clone();
    }

    static {
        EnumC24680 enumC24680 = new EnumC24680("NORMAL", 0);
        NORMAL = enumC24680;
        EnumC24680 enumC24681 = new EnumC24680("ALWAYS", 1);
        ALWAYS = enumC24681;
        EnumC24680 enumC24682 = new EnumC24680("NEVER", 2);
        NEVER = enumC24682;
        EnumC24680 enumC24683 = new EnumC24680("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC24683;
        EnumC24680 enumC24684 = new EnumC24680("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC24684;
        f78076a = new EnumC24680[]{enumC24680, enumC24681, enumC24682, enumC24683, enumC24684};
    }
}
