package l;

/* JADX INFO: renamed from: l.ܳۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14414 implements InterfaceC13460 {
    LABEL_OPTIONAL(1),
    LABEL_REPEATED(3),
    LABEL_REQUIRED(2);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f44178 = 1;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC14414[] f44179;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f44180 = 2;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f44181;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f44183 = 3;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f44186;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC14414.class.getName());
        f44181 = new C17237();
        f44179 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f44186;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC14414 m34441(int i) {
        return m34439(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC14414 m34439(int i) {
        if (i == 1) {
            return LABEL_OPTIONAL;
        }
        if (i == 2) {
            return LABEL_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m34443() {
        return f44181;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m34445() {
        return (C2235) m34442().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m34444() {
        return m34442();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m34442() {
        int i = C20766.f67255;
        return (C9291) C10702.f32239.m41597().get(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC14414 m34440(C2235 c2235) {
        if (c2235.getType() != m34442()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f44179[c2235.m7418()];
    }

    EnumC14414(int i) {
        this.f44186 = i;
    }
}
