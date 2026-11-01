package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܰ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.᩵ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20586 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC20586 f63626;

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC20586 f63627;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC20586 f63628;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC20586 f63629;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC20586[] f63630;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC20586 f63631;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC20586 f63632;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC20586 f63633;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC20586 f63634;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC20586 f63635;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC20586 f63636;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC20586 f63637;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC20586 f63638;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC20586 f63639;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC20586 f63640;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC20586 f63641;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC20586 f63642;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ EnumC20586[] f63643;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC20586 f63644;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC20586 f63645;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC19915 f63646;

    public static EnumC20586 valueOf(String str) {
        return (EnumC20586) Enum.valueOf(EnumC20586.class, str);
    }

    public static EnumC20586[] values() {
        return (EnumC20586[]) f63643.clone();
    }

    static {
        EnumC20586 enumC20586 = new EnumC20586("DOUBLE", 0, EnumC19915.DOUBLE);
        f63627 = enumC20586;
        EnumC20586 enumC20587 = new EnumC20586("FLOAT", 1, EnumC19915.FLOAT);
        f63629 = enumC20587;
        EnumC19915 enumC19915 = EnumC19915.LONG;
        EnumC20586 enumC20588 = new EnumC20586("INT64", 2, enumC19915);
        f63637 = enumC20588;
        EnumC20586 enumC20589 = new EnumC20586("UINT64", 3, enumC19915);
        f63645 = enumC20589;
        EnumC19915 enumC19916 = EnumC19915.INT;
        EnumC20586 enumC205810 = new EnumC20586("INT32", 4, enumC19916);
        f63644 = enumC205810;
        EnumC20586 enumC205811 = new EnumC20586("FIXED64", 5, enumC19915);
        f63632 = enumC205811;
        EnumC20586 enumC205812 = new EnumC20586("FIXED32", 6, enumC19916);
        f63635 = enumC205812;
        EnumC20586 enumC205813 = new EnumC20586("BOOL", 7, EnumC19915.BOOLEAN);
        f63642 = enumC205813;
        EnumC20586 enumC205814 = new EnumC20586("STRING", 8, EnumC19915.STRING);
        f63640 = enumC205814;
        EnumC19915 enumC19917 = EnumC19915.MESSAGE;
        EnumC20586 enumC205815 = new EnumC20586("GROUP", 9, enumC19917);
        f63634 = enumC205815;
        EnumC20586 enumC205816 = new EnumC20586("MESSAGE", 10, enumC19917);
        f63631 = enumC205816;
        EnumC20586 enumC205817 = new EnumC20586("BYTES", 11, EnumC19915.BYTE_STRING);
        f63628 = enumC205817;
        EnumC20586 enumC205818 = new EnumC20586("UINT32", 12, enumC19916);
        f63638 = enumC205818;
        EnumC20586 enumC205819 = new EnumC20586("ENUM", 13, EnumC19915.ENUM);
        f63636 = enumC205819;
        EnumC20586 enumC205820 = new EnumC20586("SFIXED32", 14, enumC19916);
        f63626 = enumC205820;
        EnumC20586 enumC205821 = new EnumC20586("SFIXED64", 15, enumC19915);
        f63633 = enumC205821;
        EnumC20586 enumC205822 = new EnumC20586("SINT32", 16, enumC19916);
        f63639 = enumC205822;
        EnumC20586 enumC205823 = new EnumC20586("SINT64", 17, enumC19915);
        f63641 = enumC205823;
        f63643 = new EnumC20586[]{enumC20586, enumC20587, enumC20588, enumC20589, enumC205810, enumC205811, enumC205812, enumC205813, enumC205814, enumC205815, enumC205816, enumC205817, enumC205818, enumC205819, enumC205820, enumC205821, enumC205822, enumC205823};
        f63630 = values();
    }

    public EnumC20586(String str, int i, EnumC19915 enumC19915) {
        super(str, i);
        this.f63646 = enumC19915;
    }

    /* JADX INFO: renamed from: ۧ */
    public EnumC8692 m46545() {
        return EnumC8692.m20122(ordinal() + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC19915 m46544() {
        return this.f63646;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC20586 m46542(EnumC8692 enumC8692) {
        return f63630[enumC8692.getNumber() - 1];
    }
}
