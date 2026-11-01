package p067l;

/* JADX INFO: renamed from: l.ܶۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC16737 implements InterfaceC15160 {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f49346 = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC16737[] f49347;

    /* JADX INFO: renamed from: ۤ */
    public static final int f49348 = 1;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f49349;

    /* JADX INFO: renamed from: ۬ */
    public static final int f49351 = 2;

    /* JADX INFO: renamed from: ᩸ */
    public final int f49354;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC16737.class.getName());
        f49349 = new C10033();
        f49347 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f49354;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC16737 m37974(int i) {
        return m37972(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16737 m37972(int i) {
        if (i == 0) {
            return JS_NORMAL;
        }
        if (i == 1) {
            return JS_STRING;
        }
        if (i != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m37976() {
        return f49349;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m37978() {
        return (C4492) m37975().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m37977() {
        return m37975();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m37975() {
        int i = C5339.f12573;
        return (C11198) C12539.f35193.m43842().get(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16737 m37973(C4492 c4492) {
        if (c4492.getType() != m37975()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f49347[c4492.m9500()];
    }

    EnumC16737(int i) {
        this.f49354 = i;
    }
}
