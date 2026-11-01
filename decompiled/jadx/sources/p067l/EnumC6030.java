package p067l;

/* JADX INFO: renamed from: l.ۘۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6030 implements InterfaceC15160 {
    DECLARATION(0),
    UNVERIFIED(1);


    /* JADX INFO: renamed from: ۙ */
    public static final int f15097 = 0;

    /* JADX INFO: renamed from: ۤ */
    public static final InterfaceC15001 f15098;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC6030[] f15099;

    /* JADX INFO: renamed from: ۬ */
    public static final int f15100 = 1;

    /* JADX INFO: renamed from: ᩸ */
    public final int f15103;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC6030.class.getName());
        f15098 = new C4689();
        f15099 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f15103;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC6030 m13538(int i) {
        return m13536(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6030 m13536(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i != 1) {
            return null;
        }
        return UNVERIFIED;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m13540() {
        return f15098;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m13542() {
        return (C4492) m13539().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m13541() {
        return m13539();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m13539() {
        int i = C20112.f62215;
        return (C11198) C12539.f35225.m43842().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6030 m13537(C4492 c4492) {
        if (c4492.getType() != m13539()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f15099[c4492.m9500()];
    }

    EnumC6030(int i) {
        this.f15103 = i;
    }
}
