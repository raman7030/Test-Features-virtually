package l;

/* JADX INFO: renamed from: l.۟۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7354 implements InterfaceC13460 {
    REPLACE(0),
    REPLACE_BZ(1),
    MOVE(2),
    BSDIFF(3),
    SOURCE_COPY(4),
    SOURCE_BSDIFF(5),
    REPLACE_XZ(8),
    ZERO(6),
    DISCARD(7),
    BROTLI_BSDIFF(10),
    PUFFDIFF(9),
    ZUCCHINI(11),
    LZ4DIFF_BSDIFF(12),
    LZ4DIFF_PUFFDIFF(13),
    REPLACE_ZSTD(14);

    public static final int BROTLI_BSDIFF_VALUE = 10;

    @Deprecated
    public static final int BSDIFF_VALUE = 3;
    public static final int DISCARD_VALUE = 7;
    public static final int LZ4DIFF_BSDIFF_VALUE = 12;
    public static final int LZ4DIFF_PUFFDIFF_VALUE = 13;

    @Deprecated
    public static final int MOVE_VALUE = 2;
    public static final int PUFFDIFF_VALUE = 9;
    public static final int REPLACE_BZ_VALUE = 1;
    public static final int REPLACE_VALUE = 0;
    public static final int REPLACE_XZ_VALUE = 8;
    public static final int REPLACE_ZSTD_VALUE = 14;
    public static final int SOURCE_BSDIFF_VALUE = 5;
    public static final int SOURCE_COPY_VALUE = 4;
    public static final EnumC7354[] VALUES;
    public static final int ZERO_VALUE = 6;
    public static final int ZUCCHINI_VALUE = 11;
    public static final InterfaceC13292 internalValueMap;
    public final int value;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC7354.class.getName());
        internalValueMap = new InterfaceC13292() { // from class: l.ܰ۠᩻
            public EnumC7354 findValueByNumber(int i) {
                return EnumC7354.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static EnumC7354 valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC7354 forNumber(int i) {
        switch (i) {
            case 0:
                return REPLACE;
            case 1:
                return REPLACE_BZ;
            case 2:
                return MOVE;
            case 3:
                return BSDIFF;
            case 4:
                return SOURCE_COPY;
            case 5:
                return SOURCE_BSDIFF;
            case 6:
                return ZERO;
            case 7:
                return DISCARD;
            case 8:
                return REPLACE_XZ;
            case 9:
                return PUFFDIFF;
            case 10:
                return BROTLI_BSDIFF;
            case 11:
                return ZUCCHINI;
            case 12:
                return LZ4DIFF_BSDIFF;
            case 13:
                return LZ4DIFF_PUFFDIFF;
            case 14:
                return REPLACE_ZSTD;
            default:
                return null;
        }
    }

    public static InterfaceC13292 internalGetValueMap() {
        return internalValueMap;
    }

    public final C2235 getValueDescriptor() {
        return (C2235) getDescriptor().m23854().get(ordinal());
    }

    public final C9291 getDescriptorForType() {
        return getDescriptor();
    }

    public static final C9291 getDescriptor() {
        return (C9291) C1915.getDescriptor().m41597().get(0);
    }

    public static EnumC7354 valueOf(C2235 c2235) {
        if (c2235.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[c2235.m7418()];
    }

    EnumC7354(int i) {
        this.value = i;
    }
}
