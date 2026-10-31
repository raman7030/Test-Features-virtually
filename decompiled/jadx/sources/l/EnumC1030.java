package l;

/* JADX INFO: renamed from: l.֨ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1030 implements InterfaceC13460 {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f3761 = 2;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC1030[] f3762;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f3763 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f3764;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f3766 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f3769;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC1030.class.getName());
        f3764 = new C5264();
        f3762 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f3769;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC1030 m3555(int i) {
        return m3553(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1030 m3553(int i) {
        if (i == 0) {
            return ENUM_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i != 2) {
            return null;
        }
        return CLOSED;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m3557() {
        return f3764;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m3559() {
        return (C2235) m3556().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m3558() {
        return m3556();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m3556() {
        int i = C5969.f18301;
        return (C9291) C10702.f32245.m41597().get(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1030 m3554(C2235 c2235) {
        if (c2235.getType() != m3556()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f3762[c2235.m7418()];
    }

    EnumC1030(int i) {
        this.f3769 = i;
    }
}
