package l;

/* JADX INFO: renamed from: l.ۗ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3478 implements InterfaceC13460 {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(f11019),
    EDITION_PROTO2(f11023),
    EDITION_PROTO3(f11008),
    EDITION_2023(1000),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(f11015),
    EDITION_99998_TEST_ONLY(f11000),
    EDITION_99999_TEST_ONLY(f11018),
    EDITION_MAX(Integer.MAX_VALUE);


    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final int f11000 = 99998;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final int f11001 = 0;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC3478[] f11003;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f11004 = 1;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final int f11008 = 999;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f11010 = 1001;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f11012 = 2;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f11014 = 1000;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f11015 = 99997;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final int f11018 = 99999;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final int f11019 = 900;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f11021;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final int f11023 = 998;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final int f11026 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f11027;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC3478.class.getName());
        f11021 = new C4889();
        f11003 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f11027;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC3478 m10652(int i) {
        return m10650(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3478 m10650(int i) {
        if (i == 0) {
            return EDITION_UNKNOWN;
        }
        if (i == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i == 2) {
            return EDITION_2_TEST_ONLY;
        }
        if (i == 900) {
            return EDITION_LEGACY;
        }
        if (i != Integer.MAX_VALUE) {
            switch (i) {
                case f11023:
                    return EDITION_PROTO2;
                case f11008:
                    return EDITION_PROTO3;
                case 1000:
                    return EDITION_2023;
                case 1001:
                    return EDITION_2024;
                default:
                    switch (i) {
                        case f11015:
                            return EDITION_99997_TEST_ONLY;
                        case f11000:
                            return EDITION_99998_TEST_ONLY;
                        case f11018:
                            return EDITION_99999_TEST_ONLY;
                        default:
                            return null;
                    }
            }
        }
        return EDITION_MAX;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m10654() {
        return f11021;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m10656() {
        return (C2235) m10653().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m10655() {
        return m10653();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m10653() {
        return (C9291) C10702.m26859().m14577().get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3478 m10651(C2235 c2235) {
        if (c2235.getType() != m10653()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f11003[c2235.m7418()];
    }

    EnumC3478(int i) {
        this.f11027 = i;
    }
}
