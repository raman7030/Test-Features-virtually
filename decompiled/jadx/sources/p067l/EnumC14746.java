package p067l;

/* JADX INFO: renamed from: l.۬ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14746 implements InterfaceC15160 {
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    PACKED(1),
    EXPANDED(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f42024 = 2;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC14746[] f42025;

    /* JADX INFO: renamed from: ۤ */
    public static final int f42026 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f42027;

    /* JADX INFO: renamed from: ۬ */
    public static final int f42029 = 1;

    /* JADX INFO: renamed from: ᩸ */
    public final int f42032;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC14746.class.getName());
        f42027 = new C5359();
        f42025 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f42032;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC14746 m33693(int i) {
        return m33691(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC14746 m33691(int i) {
        if (i == 0) {
            return REPEATED_FIELD_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return PACKED;
        }
        if (i != 2) {
            return null;
        }
        return EXPANDED;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m33695() {
        return f42027;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m33697() {
        return (C4492) m33694().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m33696() {
        return m33694();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m33694() {
        int i = C8041.f21154;
        return (C11198) C12539.f35220.m43842().get(2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC14746 m33692(C4492 c4492) {
        if (c4492.getType() != m33694()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f42025[c4492.m9500()];
    }

    EnumC14746(int i) {
        this.f42032 = i;
    }
}
