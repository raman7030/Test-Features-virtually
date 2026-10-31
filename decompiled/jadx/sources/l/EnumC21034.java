package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩷ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3858 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC21034 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC21034 f67874;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC21034 f67876 = new C23855("DEFAULT", 0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC21034[] f67875 = m47862();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC23107 mo18726(Long l2);

    public EnumC21034(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC21034(String str, int i, C23855 c23855) {
        this(str, i);
    }

    public static EnumC21034 valueOf(String str) {
        return (EnumC21034) Enum.valueOf(EnumC21034.class, str);
    }

    public static EnumC21034[] values() {
        return (EnumC21034[]) f67875.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC21034[] m47862() {
        return new EnumC21034[]{f67876, f67874};
    }

    static {
        final String str = "STRING";
        final int i = 1;
        f67874 = new EnumC21034(str, i) { // from class: l.ۜᩳۖ
            {
                C23855 c23855 = null;
            }

            @Override // l.EnumC21034
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public AbstractC23107 mo18726(Long l2) {
                if (l2 == null) {
                    return C7585.f23459;
                }
                return new C18211(l2.toString());
            }
        };
    }
}
