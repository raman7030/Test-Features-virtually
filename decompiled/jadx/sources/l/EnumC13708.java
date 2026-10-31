package l;

/* JADX INFO: renamed from: l.ܰۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13708 implements InterfaceC13460 {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f40906 = 2;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC13708[] f40907;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f40908 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f40909;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f40911 = 3;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f40914;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC13708.class.getName());
        f40909 = new C22881();
        f40907 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f40914;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC13708 m32961(int i) {
        return m32959(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13708 m32959(int i) {
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m32963() {
        return f40909;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m32965() {
        return (C2235) m32962().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m32964() {
        return m32962();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m32962() {
        int i = C7359.f22576;
        return (C9291) C10702.f32257.m41597().get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13708 m32960(C2235 c2235) {
        if (c2235.getType() != m32962()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f40907[c2235.m7418()];
    }

    EnumC13708(int i) {
        this.f40914 = i;
    }
}
