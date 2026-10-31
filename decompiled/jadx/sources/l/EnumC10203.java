package l;

/* JADX INFO: renamed from: l.ۤۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC10203 implements InterfaceC13460 {
    UTF8_VALIDATION_UNKNOWN(0),
    VERIFY(2),
    NONE(3);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f30654 = 3;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f30655 = 2;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f30657;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC10203[] f30658;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f30659 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f30662;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC10203.class.getName());
        f30657 = new C12319();
        f30658 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f30662;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC10203 m25608(int i) {
        return m25606(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10203 m25606(int i) {
        if (i == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i == 2) {
            return VERIFY;
        }
        if (i != 3) {
            return null;
        }
        return NONE;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m25610() {
        return f30657;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m25612() {
        return (C2235) m25609().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m25611() {
        return m25609();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m25609() {
        int i = C5969.f18301;
        return (C9291) C10702.f32245.m41597().get(3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10203 m25607(C2235 c2235) {
        if (c2235.getType() != m25609()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f30658[c2235.m7418()];
    }

    EnumC10203(int i) {
        this.f30662 = i;
    }
}
