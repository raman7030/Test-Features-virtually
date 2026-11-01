package p067l;

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
public abstract class EnumC11975 {

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC11975 f33391;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC11975 f33392;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC11975[] f33393 = m27411();

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC11975 f33394;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo11395(int i);

    public EnumC11975(String str, int i) {
        super(str, i);
    }

    public static EnumC11975 valueOf(String str) {
        return (EnumC11975) Enum.valueOf(EnumC11975.class, str);
    }

    public static EnumC11975[] values() {
        return (EnumC11975[]) f33393.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC11975[] m27411() {
        return new EnumC11975[]{f33391, f33392, f33394};
    }

    static {
        final String str = "NEXT_LOWER";
        final int i = 0;
        f33391 = new EnumC11975(str, i) { // from class: l.ۗۛܺ
            @Override // p067l.EnumC11975
            /* JADX INFO: renamed from: ֫ */
            public int mo11395(int i2) {
                return i2 - 1;
            }
        };
        final String str2 = "NEXT_HIGHER";
        final int i2 = 1;
        f33392 = new EnumC11975(str2, i2) { // from class: l.۬ۛܺ
            @Override // p067l.EnumC11975
            /* JADX INFO: renamed from: ֫ */
            public int mo11395(int i3) {
                return i3;
            }
        };
        final String str3 = "INVERTED_INSERTION_INDEX";
        final int i3 = 2;
        f33394 = new EnumC11975(str3, i3) { // from class: l.۫ۛܺ
            @Override // p067l.EnumC11975
            /* JADX INFO: renamed from: ֫ */
            public int mo11395(int i4) {
                return ~i4;
            }
        };
    }
}
