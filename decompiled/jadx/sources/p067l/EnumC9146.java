package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۟' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.۟֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes2.dex */
public class EnumC9146 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC9146 f24766;

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC9146 f24767;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC9146 f24768;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC9146 f24769;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC9146 f24770;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC9146 f24771;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC9146 f24772;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC9146 f24773;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC9146 f24774;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC9146 f24775;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC9146 f24776;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC9146 f24777;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC9146 f24778;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC9146 f24779;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC9146 f24780;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC9146 f24781;

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ EnumC9146[] f24782;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC9146 f24783;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC9146 f24784;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC3978 f24785;

    /* JADX INFO: renamed from: ᩹ */
    public final int f24786;

    /* JADX INFO: renamed from: ܿ */
    public boolean mo18076() {
        return true;
    }

    public /* synthetic */ EnumC9146(String str, int i, EnumC3978 enumC3978, int i2, C11829 c11829) {
        this(str, i, enumC3978, i2);
    }

    public static EnumC9146 valueOf(String str) {
        return (EnumC9146) Enum.valueOf(EnumC9146.class, str);
    }

    public static EnumC9146[] values() {
        return (EnumC9146[]) f24782.clone();
    }

    static {
        EnumC9146 enumC9146 = new EnumC9146("DOUBLE", 0, EnumC3978.DOUBLE, 1);
        f24776 = enumC9146;
        EnumC9146 enumC9147 = new EnumC9146("FLOAT", 1, EnumC3978.FLOAT, 5);
        f24774 = enumC9147;
        EnumC3978 enumC3978 = EnumC3978.LONG;
        final int i = 2;
        EnumC9146 enumC9148 = new EnumC9146("INT64", 2, enumC3978, 0);
        f24771 = enumC9148;
        final int i2 = 3;
        EnumC9146 enumC9149 = new EnumC9146("UINT64", 3, enumC3978, 0);
        f24770 = enumC9149;
        EnumC3978 enumC3979 = EnumC3978.INT;
        EnumC9146 enumC91410 = new EnumC9146("INT32", 4, enumC3979, 0);
        f24777 = enumC91410;
        EnumC9146 enumC91411 = new EnumC9146("FIXED64", 5, enumC3978, 1);
        f24769 = enumC91411;
        EnumC9146 enumC91412 = new EnumC9146("FIXED32", 6, enumC3979, 5);
        f24772 = enumC91412;
        EnumC9146 enumC91413 = new EnumC9146("BOOL", 7, EnumC3978.BOOLEAN, 0);
        f24768 = enumC91413;
        final EnumC3978 enumC39710 = EnumC3978.STRING;
        final String str = "STRING";
        final int i3 = 8;
        EnumC9146 enumC91414 = new EnumC9146(str, i3, enumC39710, i) { // from class: l.ۛ֨ۖ
            @Override // p067l.EnumC9146
            /* JADX INFO: renamed from: ܿ */
            public boolean mo18076() {
                return false;
            }

            {
                C11829 c11829 = null;
            }
        };
        f24778 = enumC91414;
        final EnumC3978 enumC39711 = EnumC3978.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        EnumC9146 enumC91415 = new EnumC9146(str2, i4, enumC39711, i2) { // from class: l.ۨ֨ۖ
            @Override // p067l.EnumC9146
            /* JADX INFO: renamed from: ܿ */
            public boolean mo18076() {
                return false;
            }

            {
                C11829 c11829 = null;
            }
        };
        f24783 = enumC91415;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        final int i6 = 2;
        EnumC9146 enumC91416 = new EnumC9146(str3, i5, enumC39711, i6) { // from class: l.᩺֨ۖ
            @Override // p067l.EnumC9146
            /* JADX INFO: renamed from: ܿ */
            public boolean mo18076() {
                return false;
            }

            {
                C11829 c11829 = null;
            }
        };
        f24766 = enumC91416;
        final EnumC3978 enumC39712 = EnumC3978.BYTE_STRING;
        final String str4 = "BYTES";
        final int i7 = 11;
        EnumC9146 enumC91417 = new EnumC9146(str4, i7, enumC39712, i6) { // from class: l.ܰ֨ۖ
            @Override // p067l.EnumC9146
            /* JADX INFO: renamed from: ܿ */
            public boolean mo18076() {
                return false;
            }

            {
                C11829 c11829 = null;
            }
        };
        f24767 = enumC91417;
        EnumC9146 enumC91418 = new EnumC9146("UINT32", 12, enumC3979, 0);
        f24784 = enumC91418;
        EnumC9146 enumC91419 = new EnumC9146("ENUM", 13, EnumC3978.ENUM, 0);
        f24775 = enumC91419;
        EnumC9146 enumC91420 = new EnumC9146("SFIXED32", 14, enumC3979, 5);
        f24773 = enumC91420;
        EnumC9146 enumC91421 = new EnumC9146("SFIXED64", 15, enumC3978, 1);
        f24779 = enumC91421;
        EnumC9146 enumC91422 = new EnumC9146("SINT32", 16, enumC3979, 0);
        f24781 = enumC91422;
        EnumC9146 enumC91423 = new EnumC9146("SINT64", 17, enumC3978, 0);
        f24780 = enumC91423;
        f24782 = new EnumC9146[]{enumC9146, enumC9147, enumC9148, enumC9149, enumC91410, enumC91411, enumC91412, enumC91413, enumC91414, enumC91415, enumC91416, enumC91417, enumC91418, enumC91419, enumC91420, enumC91421, enumC91422, enumC91423};
    }

    public EnumC9146(String str, int i, EnumC3978 enumC3978, int i2) {
        super(str, i);
        this.f24785 = enumC3978;
        this.f24786 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC3978 m21089() {
        return this.f24785;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m21090() {
        return this.f24786;
    }
}
