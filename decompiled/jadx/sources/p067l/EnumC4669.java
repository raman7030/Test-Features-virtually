package p067l;

/* JADX INFO: renamed from: l.ۖۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4669 implements InterfaceC15160 {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f10495 = 1;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC4669[] f10496;

    /* JADX INFO: renamed from: ۤ */
    public static final int f10497 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f10498;

    /* JADX INFO: renamed from: ۫ */
    public static final int f10499 = 2;

    /* JADX INFO: renamed from: ᩸ */
    public final int f10503;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC4669.class.getName());
        f10498 = new C17408();
        f10496 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f10503;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC4669 m9897(int i) {
        return m9895(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC4669 m9895(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return CORD;
        }
        if (i != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m9899() {
        return f10498;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m9901() {
        return (C4492) m9898().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m9900() {
        return m9898();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m9898() {
        int i = C5339.f12573;
        return (C11198) C12539.f35193.m43842().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC4669 m9896(C4492 c4492) {
        if (c4492.getType() != m9898()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f10496[c4492.m9500()];
    }

    EnumC4669(int i) {
        this.f10503 = i;
    }
}
