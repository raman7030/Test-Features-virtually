package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩷ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3858 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC22359 {

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC22359 f70560;

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC22359 f70562 = new C25040("DEFAULT", 0);

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC22359[] f70561 = m50192();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC24329 mo20675(Long l2);

    public EnumC22359(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC22359(String str, int i, C25040 c25040) {
        this(str, i);
    }

    public static EnumC22359 valueOf(String str) {
        return (EnumC22359) Enum.valueOf(EnumC22359.class, str);
    }

    public static EnumC22359[] values() {
        return (EnumC22359[]) f70561.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC22359[] m50192() {
        return new EnumC22359[]{f70562, f70560};
    }

    static {
        final String str = "STRING";
        final int i = 1;
        f70560 = new EnumC22359(str, i) { // from class: l.ۜᩳۖ
            {
                C25040 c25040 = null;
            }

            @Override // p067l.EnumC22359
            /* JADX INFO: renamed from: ֫ */
            public AbstractC24329 mo20675(Long l2) {
                if (l2 == null) {
                    return C9577.f26370;
                }
                return new C19676(l2.toString());
            }
        };
    }
}
