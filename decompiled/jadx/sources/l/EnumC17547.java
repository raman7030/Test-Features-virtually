package l;

/* JADX INFO: renamed from: l.ܿ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC17547 implements InterfaceC13460 {
    UTF8_VALIDATION_UNKNOWN(0),
    DEFAULT(1),
    VERIFY(2);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f53633 = 1;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f53634 = 2;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f53636;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC17547[] f53637;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f53638 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53641;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC17547.class.getName());
        f53636 = new C18253();
        f53637 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f53641;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC17547 m41030(int i) {
        return m41028(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC17547 m41028(int i) {
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m41032() {
        return f53636;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m41034() {
        return (C2235) m41031().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m41033() {
        return m41031();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m41031() {
        int i = C14724.f44965;
        return (C9291) C23897.f77255.m41597().get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC17547 m41029(C2235 c2235) {
        if (c2235.getType() != m41031()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f53637[c2235.m7418()];
    }

    EnumC17547(int i) {
        this.f53641 = i;
    }
}
