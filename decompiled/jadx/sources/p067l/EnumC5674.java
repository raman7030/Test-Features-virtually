package p067l;

/* JADX INFO: renamed from: l.ۗ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5674 implements InterfaceC15160 {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(f13824),
    EDITION_PROTO2(f13828),
    EDITION_PROTO3(f13813),
    EDITION_2023(1000),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(f13820),
    EDITION_99998_TEST_ONLY(f13805),
    EDITION_99999_TEST_ONLY(f13823),
    EDITION_MAX(Integer.MAX_VALUE);


    /* JADX INFO: renamed from: ֫֫ */
    public static final int f13805 = 99998;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final int f13806 = 0;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC5674[] f13808;

    /* JADX INFO: renamed from: ۙ */
    public static final int f13809 = 1;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final int f13813 = 999;

    /* JADX INFO: renamed from: ۤ */
    public static final int f13815 = 1001;

    /* JADX INFO: renamed from: ۨ */
    public static final int f13817 = 2;

    /* JADX INFO: renamed from: ۬ */
    public static final int f13819 = 1000;

    /* JADX INFO: renamed from: ܰ */
    public static final int f13820 = 99997;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final int f13823 = 99999;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final int f13824 = 900;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final InterfaceC15001 f13826;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final int f13828 = 998;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final int f13831 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩸ */
    public final int f13832;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC5674.class.getName());
        f13826 = new C7015();
        f13808 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f13832;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC5674 m12647(int i) {
        return m12645(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5674 m12645(int i) {
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
                case f13828:
                    return EDITION_PROTO2;
                case f13813:
                    return EDITION_PROTO3;
                case 1000:
                    return EDITION_2023;
                case 1001:
                    return EDITION_2024;
                default:
                    switch (i) {
                        case f13820:
                            return EDITION_99997_TEST_ONLY;
                        case f13805:
                            return EDITION_99998_TEST_ONLY;
                        case f13823:
                            return EDITION_99999_TEST_ONLY;
                        default:
                            return null;
                    }
            }
        }
        return EDITION_MAX;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m12649() {
        return f13826;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m12651() {
        return (C4492) m12648().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m12650() {
        return m12648();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m12648() {
        return (C11198) C12539.m28899().m16484().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5674 m12646(C4492 c4492) {
        if (c4492.getType() != m12648()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f13808[c4492.m9500()];
    }

    EnumC5674(int i) {
        this.f13832 = i;
    }
}
