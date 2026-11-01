package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۖ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3M1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC4993 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC4993 f11368;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC4993 f11370;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC4993 f11371;

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC4993 f11373;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC4993 f11369 = new C9016("EXPLICIT", 0);

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC4993[] f11372 = m10569();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo10570();

    public static EnumC4993 valueOf(String str) {
        return (EnumC4993) Enum.valueOf(EnumC4993.class, str);
    }

    public static EnumC4993[] values() {
        return (EnumC4993[]) f11372.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ EnumC4993[] m10569() {
        return new EnumC4993[]{f11369, f11368, f11373, f11371, f11370};
    }

    public EnumC4993(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC4993(String str, int i, C9016 c9016) {
        this(str, i);
    }

    static {
        final String str = "REPLACED";
        final int i = 1;
        f11368 = new EnumC4993(str, i) { // from class: l.᩷᩶ܺ
            @Override // p067l.EnumC4993
            /* JADX INFO: renamed from: ֫ */
            public boolean mo10570() {
                return false;
            }

            {
                C9016 c9016 = null;
            }
        };
        final String str2 = "COLLECTED";
        final int i2 = 2;
        f11373 = new EnumC4993(str2, i2) { // from class: l.ۢ᩶ܺ
            @Override // p067l.EnumC4993
            /* JADX INFO: renamed from: ֫ */
            public boolean mo10570() {
                return true;
            }

            {
                C9016 c9016 = null;
            }
        };
        final String str3 = "EXPIRED";
        final int i3 = 3;
        f11371 = new EnumC4993(str3, i3) { // from class: l.ۡ᩶ܺ
            @Override // p067l.EnumC4993
            /* JADX INFO: renamed from: ֫ */
            public boolean mo10570() {
                return true;
            }

            {
                C9016 c9016 = null;
            }
        };
        final String str4 = "SIZE";
        final int i4 = 4;
        f11370 = new EnumC4993(str4, i4) { // from class: l.ܺ᩶ܺ
            @Override // p067l.EnumC4993
            /* JADX INFO: renamed from: ֫ */
            public boolean mo10570() {
                return true;
            }

            {
                C9016 c9016 = null;
            }
        };
    }
}
