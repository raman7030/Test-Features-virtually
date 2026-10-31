package l;

/* JADX INFO: renamed from: l.ۢܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9682 implements InterfaceC13460 {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f29282 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC9682[] f29283;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f29284 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f29285;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f29287 = 2;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f29290;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC9682.class.getName());
        f29285 = new C20971();
        f29283 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f29290;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC9682 m24622(int i) {
        return m24620(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC9682 m24620(int i) {
        if (i == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m24624() {
        return f29285;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m24626() {
        return (C2235) m24623().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m24625() {
        return m24623();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m24623() {
        int i = C8976.f27265;
        return (C9291) C10702.f32236.m41597().get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC9682 m24621(C2235 c2235) {
        if (c2235.getType() != m24623()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f29283[c2235.m7418()];
    }

    EnumC9682(int i) {
        this.f29290 = i;
    }
}
