package p067l;

/* JADX INFO: renamed from: l.᩹ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23464 implements InterfaceC15160 {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);


    /* JADX INFO: renamed from: ۙ */
    public static final int f74718 = 1;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC23464[] f74719;

    /* JADX INFO: renamed from: ۤ */
    public static final int f74720 = 2;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f74721;

    /* JADX INFO: renamed from: ۬ */
    public static final int f74723 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int f74726;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC23464.class.getName());
        f74721 = new C22794();
        f74719 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f74726;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC23464 m52188(int i) {
        return m52186(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC23464 m52186(int i) {
        if (i == 0) {
            return JSON_FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return ALLOW;
        }
        if (i != 2) {
            return null;
        }
        return LEGACY_BEST_EFFORT;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m52190() {
        return f74721;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m52192() {
        return (C4492) m52189().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m52191() {
        return m52189();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m52189() {
        int i = C8041.f21154;
        return (C11198) C12539.f35220.m43842().get(5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC23464 m52187(C4492 c4492) {
        if (c4492.getType() != m52189()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f74719[c4492.m9500()];
    }

    EnumC23464(int i) {
        this.f74726 = i;
    }
}
