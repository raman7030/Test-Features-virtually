package l;

/* JADX INFO: renamed from: l.ۙۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4558 implements InterfaceC13460 {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f14541 = 2;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC4558[] f14542;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f14543 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f14544;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f14546 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f14549;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC4558.class.getName());
        f14544 = new C20081();
        f14542 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f14549;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC4558 m13410(int i) {
        return m13408(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4558 m13408(int i) {
        if (i == 0) {
            return MESSAGE_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return LENGTH_PREFIXED;
        }
        if (i != 2) {
            return null;
        }
        return DELIMITED;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m13412() {
        return f14544;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m13414() {
        return (C2235) m13411().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m13413() {
        return m13411();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m13411() {
        int i = C5969.f18301;
        return (C9291) C10702.f32245.m41597().get(4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4558 m13409(C2235 c2235) {
        if (c2235.getType() != m13411()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f14542[c2235.m7418()];
    }

    EnumC4558(int i) {
        this.f14549 = i;
    }
}
