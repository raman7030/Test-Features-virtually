package p067l;

/* JADX INFO: renamed from: l.ܶۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC16757 implements InterfaceC15160 {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);


    /* JADX INFO: renamed from: ۙ */
    public static final int f49381 = 1;

    /* JADX INFO: renamed from: ۤ */
    public static final int f49383 = 2;

    /* JADX INFO: renamed from: ۨ */
    public static final int f49384 = 3;

    /* JADX INFO: renamed from: ۬ */
    public static final int f49386 = 0;

    /* JADX INFO: renamed from: ܰ */
    public static final InterfaceC15001 f49387;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC16757[] f49390;

    /* JADX INFO: renamed from: ᩸ */
    public final int f49391;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC16757.class.getName());
        f49387 = new C10053();
        f49390 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f49391;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC16757 m37999(int i) {
        return m37997(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16757 m37997(int i) {
        if (i == 0) {
            return FIELD_PRESENCE_UNKNOWN;
        }
        if (i == 1) {
            return EXPLICIT;
        }
        if (i == 2) {
            return IMPLICIT;
        }
        if (i != 3) {
            return null;
        }
        return LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m38001() {
        return f49387;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m38003() {
        return (C4492) m38000().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m38002() {
        return m38000();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m38000() {
        int i = C8041.f21154;
        return (C11198) C12539.f35220.m43842().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16757 m37998(C4492 c4492) {
        if (c4492.getType() != m38000()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f49390[c4492.m9500()];
    }

    EnumC16757(int i) {
        this.f49391 = i;
    }
}
