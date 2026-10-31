package l;

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
public final class EnumC6964 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21459;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21460;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC6964[] f21461;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21462;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21463;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21464;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21465;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21466;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21467;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21468;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f21470;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Class f21471;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f21472;

    public static EnumC6964 valueOf(String str) {
        return (EnumC6964) Enum.valueOf(EnumC6964.class, str);
    }

    public static EnumC6964[] values() {
        return (EnumC6964[]) f21461.clone();
    }

    static {
        EnumC6964 enumC6964 = new EnumC6964("VOID", 0, Void.class, Void.class, null);
        f21459 = enumC6964;
        Class cls = Integer.TYPE;
        EnumC6964 enumC6965 = new EnumC6964("INT", 1, cls, Integer.class, 0);
        f21465 = enumC6965;
        EnumC6964 enumC6966 = new EnumC6964("LONG", 2, Long.TYPE, Long.class, 0L);
        f21469 = enumC6966;
        EnumC6964 enumC6967 = new EnumC6964("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f21462 = enumC6967;
        EnumC6964 enumC6968 = new EnumC6964("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f21466 = enumC6968;
        EnumC6964 enumC6969 = new EnumC6964("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f21460 = enumC6969;
        EnumC6964 enumC69610 = new EnumC6964("STRING", 6, String.class, String.class, "");
        f21463 = enumC69610;
        EnumC6964 enumC69611 = new EnumC6964("BYTE_STRING", 7, AbstractC5886.class, AbstractC5886.class, AbstractC5886.f18080);
        f21467 = enumC69611;
        EnumC6964 enumC69612 = new EnumC6964("ENUM", 8, cls, Integer.class, null);
        f21464 = enumC69612;
        EnumC6964 enumC69613 = new EnumC6964("MESSAGE", 9, Object.class, Object.class, null);
        f21468 = enumC69613;
        f21461 = new EnumC6964[]{enumC6964, enumC6965, enumC6966, enumC6967, enumC6968, enumC6969, enumC69610, enumC69611, enumC69612, enumC69613};
    }

    public EnumC6964(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.f21470 = cls;
        this.f21471 = cls2;
        this.f21472 = obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object m18806() {
        return this.f21472;
    }

    public Class getType() {
        return this.f21470;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Class m18804() {
        return this.f21471;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m18805(Class cls) {
        return this.f21470.isAssignableFrom(cls);
    }
}
