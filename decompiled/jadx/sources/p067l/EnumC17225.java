package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܺ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC17225 {
    public static final EnumC17225 MAYBE_MORE;
    public static final EnumC17225 NO_MORE;
    public static final EnumC17225 UNLIMITED;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC17225[] f51268a;

    static {
        EnumC17225 enumC17225 = new EnumC17225("NO_MORE", 0);
        NO_MORE = enumC17225;
        EnumC17225 enumC17226 = new EnumC17225("MAYBE_MORE", 1);
        MAYBE_MORE = enumC17226;
        EnumC17225 enumC17227 = new EnumC17225("UNLIMITED", 2);
        UNLIMITED = enumC17227;
        f51268a = new EnumC17225[]{enumC17225, enumC17226, enumC17227};
    }

    public static EnumC17225 valueOf(String str) {
        return (EnumC17225) Enum.valueOf(EnumC17225.class, str);
    }

    public static EnumC17225[] values() {
        return (EnumC17225[]) f51268a.clone();
    }
}
