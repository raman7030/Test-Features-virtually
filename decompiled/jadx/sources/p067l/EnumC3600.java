package p067l;

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
public final class EnumC3600 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC3600 f7336;

    /* JADX INFO: renamed from: ۗ */
    public static final /* synthetic */ EnumC3600[] f7337;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC3600 f7338;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC3600 f7339;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC3600 f7340;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC3600 f7341;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC3600 f7342;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC3600 f7343;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC3600 f7344;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC3600 f7345;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC3600 f7346;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC3600 f7347;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC3600 f7348;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC3600 f7349;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC3600 f7350;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC3600 f7351;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC3600 f7352;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC3600 f7353;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC3600 f7354;

    /* JADX INFO: renamed from: ۙ */
    public final C17010 f7355;

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC10306 f7356;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC10306 f7357;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC7624 f7358;

    public static EnumC3600 valueOf(String str) {
        return (EnumC3600) Enum.valueOf(EnumC3600.class, str);
    }

    public static EnumC3600[] values() {
        return (EnumC3600[]) f7337.clone();
    }

    /* JADX INFO: renamed from: ۡ */
    public static /* synthetic */ EnumC3600[] m6620() {
        return new EnumC3600[]{f7349, f7351, f7354, f7339, f7343, f7350, f7340, f7353, f7338, f7347, f7348, f7336, f7344, f7342, f7341, f7352, f7346, f7345};
    }

    static {
        EnumC7624 enumC7624 = EnumC7624.BASIC;
        f7349 = new EnumC3600("NIL", 0, enumC7624, C17010.f50314);
        f7351 = new EnumC3600("PCK", 1, enumC7624, EnumC10306.PACKAGE, C17010.f50320);
        EnumC10306 enumC10306 = EnumC10306.CLASS;
        f7354 = new EnumC3600("TYP", 2, enumC7624, enumC10306, C17010.f50319);
        EnumC10306 enumC10307 = EnumC10306.VAR;
        f7339 = new EnumC3600("VAR", 3, enumC7624, enumC10307, C17010.f50309);
        EnumC10306 enumC10308 = EnumC10306.METHOD;
        f7343 = new EnumC3600("MTH", 4, enumC7624, enumC10308, C17010.f50317);
        f7350 = new EnumC3600("POLY", 5, enumC7624, C17010.f50310);
        f7340 = new EnumC3600("MDL", 6, enumC7624, C17010.f50318);
        f7353 = new EnumC3600("ERR", 7, EnumC7624.ERROR, C17010.f50316);
        EnumC7624 enumC7625 = EnumC7624.RESOLUTION_TARGET;
        f7338 = new EnumC3600("AMBIGUOUS", 8, enumC7625);
        f7347 = new EnumC3600("HIDDEN", 9, enumC7625);
        f7348 = new EnumC3600("STATICERR", 10, enumC7625);
        EnumC7624 enumC7626 = EnumC7624.RESOLUTION;
        f7336 = new EnumC3600("MISSING_ENCL", 11, enumC7626);
        f7344 = new EnumC3600("BAD_RESTRICTED_TYPE", 12, enumC7626);
        f7342 = new EnumC3600("ABSENT_VAR", 13, enumC7625, enumC10307);
        f7341 = new EnumC3600("WRONG_MTHS", 14, enumC7625, enumC10308);
        f7352 = new EnumC3600("WRONG_MTH", 15, enumC7625, enumC10308);
        f7346 = new EnumC3600("ABSENT_MTH", 16, enumC7625, enumC10308);
        f7345 = new EnumC3600("ABSENT_TYP", 17, enumC7625, enumC10306);
        f7337 = m6620();
    }

    public EnumC3600(String str, int i, EnumC7624 enumC7624) {
        this(str, i, enumC7624, null, null, null);
    }

    public EnumC3600(String str, int i, EnumC7624 enumC7624, C17010 c17010) {
        this(str, i, enumC7624, null, null, c17010);
    }

    public EnumC3600(String str, int i, EnumC7624 enumC7624, EnumC10306 enumC10306) {
        this(str, i, enumC7624, null, enumC10306, null);
    }

    public EnumC3600(String str, int i, EnumC7624 enumC7624, EnumC10306 enumC10306, C17010 c17010) {
        this(str, i, enumC7624, enumC10306, null, c17010);
    }

    public EnumC3600(String str, int i, EnumC7624 enumC7624, EnumC10306 enumC10306, EnumC10306 enumC10307, C17010 c17010) {
        super(str, i);
        this.f7358 = enumC7624;
        this.f7356 = enumC10306;
        this.f7357 = enumC10307;
        this.f7355 = c17010;
    }

    /* JADX INFO: renamed from: ۢ */
    public C17010 m6624() {
        return this.f7355;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m6623(C17010 c17010) {
        return this.f7355.m38615(c17010);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m6625() {
        EnumC7624 enumC7624 = this.f7358;
        return enumC7624 == EnumC7624.RESOLUTION || enumC7624 == EnumC7624.RESOLUTION_TARGET;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m6626() {
        return this.f7358 == EnumC7624.RESOLUTION_TARGET;
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean m6628() {
        return this.f7358 == EnumC7624.BASIC;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m6622(EnumC3600 enumC3600) {
        return ordinal() < enumC3600.ordinal();
    }

    /* JADX INFO: renamed from: ᩷ */
    public EnumC10306 m6627() {
        EnumC10306 enumC10306 = this.f7356;
        if (enumC10306 != null) {
            return enumC10306;
        }
        throw new AssertionError("Unexpected kind: " + this);
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC10306 m6621() {
        EnumC10306 enumC10306 = this.f7357;
        if (enumC10306 != null) {
            return enumC10306;
        }
        throw new AssertionError("Unexpected kind: " + this);
    }
}
