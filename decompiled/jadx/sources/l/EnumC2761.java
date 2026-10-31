package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۖ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3M1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC2761 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC2761 f8574;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC2761 f8576;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC2761 f8577;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC2761 f8579;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC2761 f8575 = new C6994("EXPLICIT", 0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC2761[] f8578 = m8521();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo8522();

    public static EnumC2761 valueOf(String str) {
        return (EnumC2761) Enum.valueOf(EnumC2761.class, str);
    }

    public static EnumC2761[] values() {
        return (EnumC2761[]) f8578.clone();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC2761[] m8521() {
        return new EnumC2761[]{f8575, f8574, f8579, f8577, f8576};
    }

    public EnumC2761(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC2761(String str, int i, C6994 c6994) {
        this(str, i);
    }

    static {
        final String str = "REPLACED";
        final int i = 1;
        f8574 = new EnumC2761(str, i) { // from class: l.᩷᩶ܺ
            @Override // l.EnumC2761
            /* JADX INFO: renamed from: ֫ */
            public boolean mo8522() {
                return false;
            }

            {
                C6994 c6994 = null;
            }
        };
        final String str2 = "COLLECTED";
        final int i2 = 2;
        f8579 = new EnumC2761(str2, i2) { // from class: l.ۢ᩶ܺ
            @Override // l.EnumC2761
            /* JADX INFO: renamed from: ֫ */
            public boolean mo8522() {
                return true;
            }

            {
                C6994 c6994 = null;
            }
        };
        final String str3 = "EXPIRED";
        final int i3 = 3;
        f8577 = new EnumC2761(str3, i3) { // from class: l.ۡ᩶ܺ
            @Override // l.EnumC2761
            /* JADX INFO: renamed from: ֫ */
            public boolean mo8522() {
                return true;
            }

            {
                C6994 c6994 = null;
            }
        };
        final String str4 = "SIZE";
        final int i4 = 4;
        f8576 = new EnumC2761(str4, i4) { // from class: l.ܺ᩶ܺ
            @Override // l.EnumC2761
            /* JADX INFO: renamed from: ֫ */
            public boolean mo8522() {
                return true;
            }

            {
                C6994 c6994 = null;
            }
        };
    }
}
