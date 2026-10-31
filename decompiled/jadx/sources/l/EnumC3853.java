package l;

/* JADX INFO: renamed from: l.ۘۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3853 implements InterfaceC13460 {
    DECLARATION(0),
    UNVERIFIED(1);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f12290 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f12291;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC3853[] f12292;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f12293 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12296;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC3853.class.getName());
        f12291 = new C2442();
        f12292 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f12296;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC3853 m11602(int i) {
        return m11600(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3853 m11600(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i != 1) {
            return null;
        }
        return UNVERIFIED;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m11604() {
        return f12291;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m11606() {
        return (C2235) m11603().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m11605() {
        return m11603();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m11603() {
        int i = C18670.f58992;
        return (C9291) C10702.f32250.m41597().get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3853 m11601(C2235 c2235) {
        if (c2235.getType() != m11603()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f12292[c2235.m7418()];
    }

    EnumC3853(int i) {
        this.f12296 = i;
    }
}
