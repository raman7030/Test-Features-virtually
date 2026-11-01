package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۨ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۜ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9OU */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC8987 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC8987 f24340;

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC8987 f24341;

    /* JADX INFO: renamed from: ۙ */
    public static final /* synthetic */ EnumC8987[] f24342;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC8987 f24343;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC8987 f24344;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC8987 f24345;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC8987 f24346;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC8987 f24347;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC8987 f24348;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC8987 f24349;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC8987 f24350;

    /* JADX INFO: renamed from: ᩶ */
    public final Class f24351;

    /* JADX INFO: renamed from: ᩸ */
    public final Class f24352;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f24353;

    public static EnumC8987 valueOf(String str) {
        return (EnumC8987) Enum.valueOf(EnumC8987.class, str);
    }

    public static EnumC8987[] values() {
        return (EnumC8987[]) f24342.clone();
    }

    static {
        EnumC8987 enumC8987 = new EnumC8987("VOID", 0, Void.class, Void.class, null);
        f24340 = enumC8987;
        Class cls = Integer.TYPE;
        EnumC8987 enumC8988 = new EnumC8987("INT", 1, cls, Integer.class, 0);
        f24346 = enumC8988;
        EnumC8987 enumC8989 = new EnumC8987("LONG", 2, Long.TYPE, Long.class, 0L);
        f24350 = enumC8989;
        EnumC8987 enumC89810 = new EnumC8987("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f24343 = enumC89810;
        EnumC8987 enumC89811 = new EnumC8987("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f24347 = enumC89811;
        EnumC8987 enumC89812 = new EnumC8987("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f24341 = enumC89812;
        EnumC8987 enumC89813 = new EnumC8987("STRING", 6, String.class, String.class, "");
        f24344 = enumC89813;
        EnumC8987 enumC89814 = new EnumC8987("BYTE_STRING", 7, AbstractC7962.class, AbstractC7962.class, AbstractC7962.f20935);
        f24348 = enumC89814;
        EnumC8987 enumC89815 = new EnumC8987("ENUM", 8, cls, Integer.class, null);
        f24345 = enumC89815;
        EnumC8987 enumC89816 = new EnumC8987("MESSAGE", 9, Object.class, Object.class, null);
        f24349 = enumC89816;
        f24342 = new EnumC8987[]{enumC8987, enumC8988, enumC8989, enumC89810, enumC89811, enumC89812, enumC89813, enumC89814, enumC89815, enumC89816};
    }

    public EnumC8987(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.f24351 = cls;
        this.f24352 = cls2;
        this.f24353 = obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public Object m20760() {
        return this.f24353;
    }

    public Class getType() {
        return this.f24351;
    }

    /* JADX INFO: renamed from: ֫ */
    public Class m20758() {
        return this.f24352;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m20759(Class cls) {
        return this.f24351.isAssignableFrom(cls);
    }
}
