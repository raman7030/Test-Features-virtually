package p067l;

/* JADX INFO: renamed from: l.ܿ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19045 implements InterfaceC15160 {
    UTF8_VALIDATION_UNKNOWN(0),
    DEFAULT(1),
    VERIFY(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f56823 = 1;

    /* JADX INFO: renamed from: ۛ */
    public static final int f56824 = 2;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f56826;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC19045[] f56827;

    /* JADX INFO: renamed from: ۬ */
    public static final int f56828 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int f56831;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC19045.class.getName());
        f56826 = new C19716();
        f56827 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f56831;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC19045 m43275(int i) {
        return m43273(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC19045 m43273(int i) {
        if (i == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return VERIFY;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m43277() {
        return f56826;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m43279() {
        return (C4492) m43276().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m43278() {
        return m43276();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m43276() {
        int i = C16362.f48078;
        return (C11198) C25080.f80006.m43842().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC19045 m43274(C4492 c4492) {
        if (c4492.getType() != m43276()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f56827[c4492.m9500()];
    }

    EnumC19045(int i) {
        this.f56831 = i;
    }
}
