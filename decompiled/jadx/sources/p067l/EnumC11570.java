package p067l;

/* JADX INFO: renamed from: l.ۢܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC11570 implements InterfaceC15160 {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f32232 = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC11570[] f32233;

    /* JADX INFO: renamed from: ۤ */
    public static final int f32234 = 1;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f32235;

    /* JADX INFO: renamed from: ۬ */
    public static final int f32237 = 2;

    /* JADX INFO: renamed from: ᩸ */
    public final int f32240;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC11570.class.getName());
        f32235 = new C22299();
        f32233 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f32240;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC11570 m26636(int i) {
        return m26634(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC11570 m26634(int i) {
        if (i == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m26638() {
        return f32235;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m26640() {
        return (C4492) m26637().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m26639() {
        return m26637();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m26637() {
        int i = C10899.f30200;
        return (C11198) C12539.f35211.m43842().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC11570 m26635(C4492 c4492) {
        if (c4492.getType() != m26637()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f32233[c4492.m9500()];
    }

    EnumC11570(int i) {
        this.f32240 = i;
    }
}
