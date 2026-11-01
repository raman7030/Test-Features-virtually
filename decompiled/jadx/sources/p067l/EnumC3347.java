package p067l;

/* JADX INFO: renamed from: l.֨ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3347 implements InterfaceC15160 {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f6533 = 2;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC3347[] f6534;

    /* JADX INFO: renamed from: ۤ */
    public static final int f6535 = 1;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f6536;

    /* JADX INFO: renamed from: ۬ */
    public static final int f6538 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int f6541;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC3347.class.getName());
        f6536 = new C7371();
        f6534 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f6541;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC3347 m5842(int i) {
        return m5840(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC3347 m5840(int i) {
        if (i == 0) {
            return ENUM_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i != 2) {
            return null;
        }
        return CLOSED;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m5844() {
        return f6536;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m5846() {
        return (C4492) m5843().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m5845() {
        return m5843();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m5843() {
        int i = C8041.f21154;
        return (C11198) C12539.f35220.m43842().get(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC3347 m5841(C4492 c4492) {
        if (c4492.getType() != m5843()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f6534[c4492.m9500()];
    }

    EnumC3347(int i) {
        this.f6541 = i;
    }
}
