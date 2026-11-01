package p067l;

/* JADX INFO: renamed from: l.ܰۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15396 implements InterfaceC15160 {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* JADX INFO: renamed from: ۙ */
    public static final int f43987 = 2;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC15396[] f43988;

    /* JADX INFO: renamed from: ۤ */
    public static final int f43989 = 1;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f43990;

    /* JADX INFO: renamed from: ۬ */
    public static final int f43992 = 3;

    /* JADX INFO: renamed from: ᩸ */
    public final int f43995;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC15396.class.getName());
        f43990 = new C24114();
        f43988 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f43995;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC15396 m35075(int i) {
        return m35073(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC15396 m35073(int i) {
        if (i == 1) {
            return SPEED;
        }
        if (i == 2) {
            return CODE_SIZE;
        }
        if (i != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m35077() {
        return f43990;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m35079() {
        return (C4492) m35076().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m35078() {
        return m35076();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m35076() {
        int i = C9362.f25490;
        return (C11198) C12539.f35232.m43842().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC15396 m35074(C4492 c4492) {
        if (c4492.getType() != m35076()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f43988[c4492.m9500()];
    }

    EnumC15396(int i) {
        this.f43995 = i;
    }
}
