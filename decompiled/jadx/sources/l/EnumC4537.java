package l;

/* JADX INFO: renamed from: l.ۙۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4537 implements InterfaceC13460 {
    TARGET_TYPE_UNKNOWN(0),
    TARGET_TYPE_FILE(1),
    TARGET_TYPE_EXTENSION_RANGE(2),
    TARGET_TYPE_MESSAGE(3),
    TARGET_TYPE_FIELD(4),
    TARGET_TYPE_ONEOF(5),
    TARGET_TYPE_ENUM(6),
    TARGET_TYPE_ENUM_ENTRY(7),
    TARGET_TYPE_SERVICE(8),
    TARGET_TYPE_METHOD(9);


    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final int f14396 = 3;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final int f14397 = 7;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f14402;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC4537[] f14403;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f14404 = 2;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f14406 = 4;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f14408 = 6;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f14409 = 1;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final int f14411 = 9;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final int f14412 = 5;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final int f14415 = 0;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final int f14418 = 8;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f14419;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC4537.class.getName());
        f14402 = new C20060();
        f14403 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f14419;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC4537 m13309(int i) {
        return m13307(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4537 m13307(int i) {
        switch (i) {
            case 0:
                return TARGET_TYPE_UNKNOWN;
            case 1:
                return TARGET_TYPE_FILE;
            case 2:
                return TARGET_TYPE_EXTENSION_RANGE;
            case 3:
                return TARGET_TYPE_MESSAGE;
            case 4:
                return TARGET_TYPE_FIELD;
            case 5:
                return TARGET_TYPE_ONEOF;
            case 6:
                return TARGET_TYPE_ENUM;
            case 7:
                return TARGET_TYPE_ENUM_ENTRY;
            case 8:
                return TARGET_TYPE_SERVICE;
            case 9:
                return TARGET_TYPE_METHOD;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m13311() {
        return f14402;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m13313() {
        return (C2235) m13310().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m13312() {
        return m13310();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m13310() {
        int i = C3126.f9770;
        return (C9291) C10702.f32218.m41597().get(3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4537 m13308(C2235 c2235) {
        if (c2235.getType() != m13310()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f14403[c2235.m7418()];
    }

    EnumC4537(int i) {
        this.f14419 = i;
    }
}
