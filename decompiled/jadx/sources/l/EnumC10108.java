package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۙ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۤۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15PL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC10108 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC10108 f30432;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC10108 f30433;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC10108[] f30434 = m25392();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC10108 f30435;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9353(int i);

    public EnumC10108(String str, int i) {
        super(str, i);
    }

    public static EnumC10108 valueOf(String str) {
        return (EnumC10108) Enum.valueOf(EnumC10108.class, str);
    }

    public static EnumC10108[] values() {
        return (EnumC10108[]) f30434.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC10108[] m25392() {
        return new EnumC10108[]{f30432, f30433, f30435};
    }

    static {
        final String str = "NEXT_LOWER";
        final int i = 0;
        f30432 = new EnumC10108(str, i) { // from class: l.ۗۛܺ
            @Override // l.EnumC10108
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public int mo9353(int i2) {
                return i2 - 1;
            }
        };
        final String str2 = "NEXT_HIGHER";
        final int i2 = 1;
        f30433 = new EnumC10108(str2, i2) { // from class: l.۬ۛܺ
            @Override // l.EnumC10108
            /* JADX INFO: renamed from: ֫ */
            public int mo9353(int i3) {
                return i3;
            }
        };
        final String str3 = "INVERTED_INSERTION_INDEX";
        final int i3 = 2;
        f30435 = new EnumC10108(str3, i3) { // from class: l.۫ۛܺ
            @Override // l.EnumC10108
            /* JADX INFO: renamed from: ֫ */
            public int mo9353(int i4) {
                return ~i4;
            }
        };
    }
}
