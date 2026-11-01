package p067l;

/* JADX INFO: renamed from: l.ۙۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6680 implements InterfaceC15160 {
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


    /* JADX INFO: renamed from: ֫֫ */
    public static final int f17227 = 3;

    /* JADX INFO: renamed from: ۗ */
    public static final int f17228 = 7;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final InterfaceC15001 f17233;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC6680[] f17234;

    /* JADX INFO: renamed from: ۤ */
    public static final int f17235 = 2;

    /* JADX INFO: renamed from: ۨ */
    public static final int f17237 = 4;

    /* JADX INFO: renamed from: ۬ */
    public static final int f17239 = 6;

    /* JADX INFO: renamed from: ܰ */
    public static final int f17240 = 1;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final int f17242 = 9;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final int f17243 = 5;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final int f17246 = 0;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final int f17249 = 8;

    /* JADX INFO: renamed from: ᩸ */
    public final int f17250;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC6680.class.getName());
        f17233 = new C21433();
        f17234 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f17250;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC6680 m15197(int i) {
        return m15195(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6680 m15195(int i) {
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

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m15199() {
        return f17233;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m15201() {
        return (C4492) m15198().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m15200() {
        return m15198();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m15198() {
        int i = C5339.f12573;
        return (C11198) C12539.f35193.m43842().get(3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6680 m15196(C4492 c4492) {
        if (c4492.getType() != m15198()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f17234[c4492.m9500()];
    }

    EnumC6680(int i) {
        this.f17250 = i;
    }
}
