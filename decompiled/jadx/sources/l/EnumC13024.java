package l;

/* JADX INFO: renamed from: l.۬ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13024 implements InterfaceC13460 {
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    PACKED(1),
    EXPANDED(2);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f38978 = 2;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC13024[] f38979;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f38980 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f38981;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f38983 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f38986;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC13024.class.getName());
        f38981 = new C3147();
        f38979 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f38986;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC13024 m31608(int i) {
        return m31606(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13024 m31606(int i) {
        if (i == 0) {
            return REPEATED_FIELD_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return PACKED;
        }
        if (i != 2) {
            return null;
        }
        return EXPANDED;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m31610() {
        return f38981;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m31612() {
        return (C2235) m31609().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m31611() {
        return m31609();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m31609() {
        int i = C5969.f18301;
        return (C9291) C10702.f32245.m41597().get(2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13024 m31607(C2235 c2235) {
        if (c2235.getType() != m31609()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f38979[c2235.m7418()];
    }

    EnumC13024(int i) {
        this.f38986 = i;
    }
}
