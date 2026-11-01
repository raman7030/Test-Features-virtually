package p067l;

/* JADX INFO: renamed from: l.᩹ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23444 implements InterfaceC15160 {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f74668 = 1;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC23444[] f74669;

    /* JADX INFO: renamed from: ۤ */
    public static final int f74670 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f74671;

    /* JADX INFO: renamed from: ۬ */
    public static final int f74673 = 2;

    /* JADX INFO: renamed from: ᩸ */
    public final int f74676;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC23444.class.getName());
        f74671 = new C22774();
        f74669 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f74676;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC23444 m52145(int i) {
        return m52143(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC23444 m52143(int i) {
        if (i == 0) {
            return RETENTION_UNKNOWN;
        }
        if (i == 1) {
            return RETENTION_RUNTIME;
        }
        if (i != 2) {
            return null;
        }
        return RETENTION_SOURCE;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m52147() {
        return f74671;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m52149() {
        return (C4492) m52146().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m52148() {
        return m52146();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m52146() {
        int i = C5339.f12573;
        return (C11198) C12539.f35193.m43842().get(2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC23444 m52144(C4492 c4492) {
        if (c4492.getType() != m52146()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f74669[c4492.m9500()];
    }

    EnumC23444(int i) {
        this.f74676 = i;
    }
}
