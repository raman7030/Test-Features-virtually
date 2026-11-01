package p067l;

/* JADX INFO: renamed from: l.ۙۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6700 implements InterfaceC15160 {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f17370 = 2;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC6700[] f17371;

    /* JADX INFO: renamed from: ۤ */
    public static final int f17372 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f17373;

    /* JADX INFO: renamed from: ۬ */
    public static final int f17375 = 1;

    /* JADX INFO: renamed from: ᩸ */
    public final int f17378;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC6700.class.getName());
        f17373 = new C21453();
        f17371 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f17378;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC6700 m15298(int i) {
        return m15296(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6700 m15296(int i) {
        if (i == 0) {
            return MESSAGE_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return LENGTH_PREFIXED;
        }
        if (i != 2) {
            return null;
        }
        return DELIMITED;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m15300() {
        return f17373;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m15302() {
        return (C4492) m15299().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m15301() {
        return m15299();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m15299() {
        int i = C8041.f21154;
        return (C11198) C12539.f35220.m43842().get(4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6700 m15297(C4492 c4492) {
        if (c4492.getType() != m15299()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f17371[c4492.m9500()];
    }

    EnumC6700(int i) {
        this.f17378 = i;
    }
}
