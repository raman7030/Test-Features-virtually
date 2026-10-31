package l;

/* JADX INFO: renamed from: l.ۜۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6654 implements InterfaceC13460 {
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


    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final int f20632 = 17;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final int f20633 = 18;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final int f20634 = 6;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final int f20635 = 15;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC6654[] f20637;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f20639 = 8;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final int f20640 = 4;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final int f20646 = 11;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f20648 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f20650 = 14;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f20652 = 12;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f20653;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f20654 = 7;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final int f20656 = 9;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final int f20658 = 2;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final int f20659 = 10;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final int f20661 = 16;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final int f20665 = 3;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final int f20668 = 13;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final int f20670 = 5;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f20671;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC6654.class.getName());
        f20653 = new C23587();
        f20637 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f20671;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC6654 m18176(int i) {
        return m18174(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC6654 m18174(int i) {
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m18178() {
        return f20653;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m18180() {
        return (C2235) m18177().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m18179() {
        return m18177();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m18177() {
        int i = C20766.f67255;
        return (C9291) C10702.f32239.m41597().get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC6654 m18175(C2235 c2235) {
        if (c2235.getType() != m18177()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f20637[c2235.m7418()];
    }

    EnumC6654(int i) {
        this.f20671 = i;
    }
}
