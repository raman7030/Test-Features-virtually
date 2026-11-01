package p067l;

/* JADX INFO: renamed from: l.ۤۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC12065 implements InterfaceC15160 {
    UTF8_VALIDATION_UNKNOWN(0),
    VERIFY(2),
    NONE(3);


    /* JADX INFO: renamed from: ۙ */
    public static final int f33615 = 3;

    /* JADX INFO: renamed from: ۛ */
    public static final int f33616 = 2;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC15001 f33618;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC12065[] f33619;

    /* JADX INFO: renamed from: ۬ */
    public static final int f33620 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int f33623;

    static {
        C22006.m49606(EnumC8594.PUBLIC, EnumC12065.class.getName());
        f33618 = new C14076();
        f33619 = values();
    }

    @Override // p067l.InterfaceC5614
    public final int getNumber() {
        return this.f33623;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static EnumC12065 m27630(int i) {
        return m27628(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC12065 m27628(int i) {
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

    /* JADX INFO: renamed from: ᩻ */
    public static InterfaceC15001 m27632() {
        return f33618;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4492 m27634() {
        return (C4492) m27631().m25863().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11198 m27633() {
        return m27631();
    }

    /* JADX INFO: renamed from: ܿ */
    public static final C11198 m27631() {
        int i = C8041.f21154;
        return (C11198) C12539.f35220.m43842().get(3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC12065 m27629(C4492 c4492) {
        if (c4492.getType() != m27631()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f33619[c4492.m9500()];
    }

    EnumC12065(int i) {
        this.f33623 = i;
    }
}
