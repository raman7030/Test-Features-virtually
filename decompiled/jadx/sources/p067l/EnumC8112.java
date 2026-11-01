package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۛۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC8112 {
    public static final EnumC8112 CONCURRENT;
    public static final EnumC8112 IDENTITY_FINISH;
    public static final EnumC8112 UNORDERED;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC8112[] f21392a;

    public static EnumC8112 valueOf(String str) {
        return (EnumC8112) Enum.valueOf(EnumC8112.class, str);
    }

    public static EnumC8112[] values() {
        return (EnumC8112[]) f21392a.clone();
    }

    static {
        EnumC8112 enumC8112 = new EnumC8112("CONCURRENT", 0);
        CONCURRENT = enumC8112;
        EnumC8112 enumC8113 = new EnumC8112("UNORDERED", 1);
        UNORDERED = enumC8113;
        EnumC8112 enumC8114 = new EnumC8112("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = enumC8114;
        f21392a = new EnumC8112[]{enumC8112, enumC8113, enumC8114};
    }
}
