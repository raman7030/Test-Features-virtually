package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܽ֫' uses external variables
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
/* JADX INFO: renamed from: l.֨ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1296 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4564;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC1296[] f4565;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4566;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4567;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4568;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4569;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4570;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4571;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4572;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4573;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4574;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4575;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4576;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4577;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4578;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4579;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4580;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4581;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC1296 f4582;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15406 f4583;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC8352 f4584;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC8352 f4585;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC5530 f4586;

    public static EnumC1296 valueOf(String str) {
        return (EnumC1296) Enum.valueOf(EnumC1296.class, str);
    }

    public static EnumC1296[] values() {
        return (EnumC1296[]) f4565.clone();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC1296[] m4388() {
        return new EnumC1296[]{f4577, f4579, f4582, f4567, f4571, f4578, f4568, f4581, f4566, f4575, f4576, f4564, f4572, f4570, f4569, f4580, f4574, f4573};
    }

    static {
        EnumC5530 enumC5530 = EnumC5530.BASIC;
        f4577 = new EnumC1296("NIL", 0, enumC5530, C15406.f47184);
        f4579 = new EnumC1296("PCK", 1, enumC5530, EnumC8352.PACKAGE, C15406.f47190);
        EnumC8352 enumC8352 = EnumC8352.CLASS;
        f4582 = new EnumC1296("TYP", 2, enumC5530, enumC8352, C15406.f47189);
        EnumC8352 enumC8353 = EnumC8352.VAR;
        f4567 = new EnumC1296("VAR", 3, enumC5530, enumC8353, C15406.f47179);
        EnumC8352 enumC8354 = EnumC8352.METHOD;
        f4571 = new EnumC1296("MTH", 4, enumC5530, enumC8354, C15406.f47187);
        f4578 = new EnumC1296("POLY", 5, enumC5530, C15406.f47180);
        f4568 = new EnumC1296("MDL", 6, enumC5530, C15406.f47188);
        f4581 = new EnumC1296("ERR", 7, EnumC5530.ERROR, C15406.f47186);
        EnumC5530 enumC5531 = EnumC5530.RESOLUTION_TARGET;
        f4566 = new EnumC1296("AMBIGUOUS", 8, enumC5531);
        f4575 = new EnumC1296("HIDDEN", 9, enumC5531);
        f4576 = new EnumC1296("STATICERR", 10, enumC5531);
        EnumC5530 enumC5532 = EnumC5530.RESOLUTION;
        f4564 = new EnumC1296("MISSING_ENCL", 11, enumC5532);
        f4572 = new EnumC1296("BAD_RESTRICTED_TYPE", 12, enumC5532);
        f4570 = new EnumC1296("ABSENT_VAR", 13, enumC5531, enumC8353);
        f4569 = new EnumC1296("WRONG_MTHS", 14, enumC5531, enumC8354);
        f4580 = new EnumC1296("WRONG_MTH", 15, enumC5531, enumC8354);
        f4574 = new EnumC1296("ABSENT_MTH", 16, enumC5531, enumC8354);
        f4573 = new EnumC1296("ABSENT_TYP", 17, enumC5531, enumC8352);
        f4565 = m4388();
    }

    public EnumC1296(String str, int i, EnumC5530 enumC5530) {
        this(str, i, enumC5530, null, null, null);
    }

    public EnumC1296(String str, int i, EnumC5530 enumC5530, C15406 c15406) {
        this(str, i, enumC5530, null, null, c15406);
    }

    public EnumC1296(String str, int i, EnumC5530 enumC5530, EnumC8352 enumC8352) {
        this(str, i, enumC5530, null, enumC8352, null);
    }

    public EnumC1296(String str, int i, EnumC5530 enumC5530, EnumC8352 enumC8352, C15406 c15406) {
        this(str, i, enumC5530, enumC8352, null, c15406);
    }

    public EnumC1296(String str, int i, EnumC5530 enumC5530, EnumC8352 enumC8352, EnumC8352 enumC8353, C15406 c15406) {
        super(str, i);
        this.f4586 = enumC5530;
        this.f4584 = enumC8352;
        this.f4585 = enumC8353;
        this.f4583 = c15406;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15406 m4392() {
        return this.f4583;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m4391(C15406 c15406) {
        return this.f4583.m36457(c15406);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m4393() {
        EnumC5530 enumC5530 = this.f4586;
        return enumC5530 == EnumC5530.RESOLUTION || enumC5530 == EnumC5530.RESOLUTION_TARGET;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m4394() {
        return this.f4586 == EnumC5530.RESOLUTION_TARGET;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m4396() {
        return this.f4586 == EnumC5530.BASIC;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m4390(EnumC1296 enumC1296) {
        return ordinal() < enumC1296.ordinal();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC8352 m4395() {
        EnumC8352 enumC8352 = this.f4584;
        if (enumC8352 != null) {
            return enumC8352;
        }
        throw new AssertionError("Unexpected kind: " + this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC8352 m4389() {
        EnumC8352 enumC8352 = this.f4585;
        if (enumC8352 != null) {
            return enumC8352;
        }
        throw new AssertionError("Unexpected kind: " + this);
    }
}
