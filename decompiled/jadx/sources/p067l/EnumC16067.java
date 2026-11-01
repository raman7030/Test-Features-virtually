package p067l;

/* JADX INFO: renamed from: l.ܳۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16067 implements InterfaceC15160 {
    LABEL_OPTIONAL(1),
    LABEL_REPEATED(3),
    LABEL_REQUIRED(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f47272 = 1;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC16067[] f47273;

    /* JADX INFO: renamed from: ۤ */
    public static final int f47274 = 2;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f47275;

    /* JADX INFO: renamed from: ۬ */
    public static final int f47277 = 3;

    /* JADX INFO: renamed from: ᩸ */
    public final int f47280;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC16067.class.getName());
        f47275 = new C18750();
        f47273 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f47280;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC16067 m36574(int i) {
        return m36572(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16067 m36572(int i) {
        if (i == 1) {
            return LABEL_OPTIONAL;
        }
        if (i == 2) {
            return LABEL_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m36576() {
        return f47275;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m36578() {
        return (C4492) m36575().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m36577() {
        return m36575();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m36575() {
        int i = C22104.f69939;
        return (C11198) C12539.f35214.m43842().get(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16067 m36573(C4492 c4492) {
        if (c4492.getType() != m36575()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f47273[c4492.m9500()];
    }

    EnumC16067(int i) {
        this.f47280 = i;
    }
}
