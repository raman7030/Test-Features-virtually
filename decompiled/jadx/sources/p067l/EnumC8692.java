package p067l;

/* JADX INFO: renamed from: l.ۜۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8692 implements InterfaceC15160 {
    TYPE_DOUBLE(1),
    TYPE_FLOAT(2),
    TYPE_INT64(3),
    TYPE_UINT64(4),
    TYPE_INT32(5),
    TYPE_FIXED64(6),
    TYPE_FIXED32(7),
    TYPE_BOOL(8),
    TYPE_STRING(9),
    TYPE_GROUP(10),
    TYPE_MESSAGE(11),
    TYPE_BYTES(12),
    TYPE_UINT32(13),
    TYPE_ENUM(14),
    TYPE_SFIXED32(15),
    TYPE_SFIXED64(16),
    TYPE_SINT32(17),
    TYPE_SINT64(18);


    /* JADX INFO: renamed from: ֡֫ */
    public static final int f23508 = 17;

    /* JADX INFO: renamed from: ֨֫ */
    public static final int f23509 = 18;

    /* JADX INFO: renamed from: ֫֫ */
    public static final int f23510 = 6;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final int f23511 = 15;

    /* JADX INFO: renamed from: ۗ֫ */
    public static final EnumC8692[] f23513;

    /* JADX INFO: renamed from: ۙ */
    public static final int f23515 = 8;

    /* JADX INFO: renamed from: ۙ֫ */
    public static final int f23516 = 4;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final int f23522 = 11;

    /* JADX INFO: renamed from: ۤ */
    public static final int f23524 = 1;

    /* JADX INFO: renamed from: ۨ */
    public static final int f23526 = 14;

    /* JADX INFO: renamed from: ۬ */
    public static final int f23528 = 12;

    /* JADX INFO: renamed from: ۬֫ */
    public static final InterfaceC15001 f23529;

    /* JADX INFO: renamed from: ܰ */
    public static final int f23530 = 7;

    /* JADX INFO: renamed from: ܶ֫ */
    public static final int f23532 = 9;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final int f23534 = 2;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final int f23535 = 10;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final int f23537 = 16;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final int f23541 = 3;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final int f23544 = 13;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final int f23546 = 5;

    /* JADX INFO: renamed from: ᩸ */
    public final int f23547;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC8692.class.getName());
        f23529 = new C24785();
        f23513 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f23547;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC8692 m20124(int i) {
        return m20122(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8692 m20122(int i) {
        switch (i) {
            case 1:
                return TYPE_DOUBLE;
            case 2:
                return TYPE_FLOAT;
            case 3:
                return TYPE_INT64;
            case 4:
                return TYPE_UINT64;
            case 5:
                return TYPE_INT32;
            case 6:
                return TYPE_FIXED64;
            case 7:
                return TYPE_FIXED32;
            case 8:
                return TYPE_BOOL;
            case 9:
                return TYPE_STRING;
            case 10:
                return TYPE_GROUP;
            case 11:
                return TYPE_MESSAGE;
            case 12:
                return TYPE_BYTES;
            case 13:
                return TYPE_UINT32;
            case 14:
                return TYPE_ENUM;
            case 15:
                return TYPE_SFIXED32;
            case 16:
                return TYPE_SFIXED64;
            case 17:
                return TYPE_SINT32;
            case 18:
                return TYPE_SINT64;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m20126() {
        return f23529;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m20128() {
        return (C4492) m20125().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m20127() {
        return m20125();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m20125() {
        int i = C22104.f69939;
        return (C11198) C12539.f35214.m43842().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8692 m20123(C4492 c4492) {
        if (c4492.getType() != m20125()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f23513[c4492.m9500()];
    }

    EnumC8692(int i) {
        this.f23547 = i;
    }
}
