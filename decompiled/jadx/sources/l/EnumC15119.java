package l;

/* JADX INFO: renamed from: l.ܶۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC15119 implements InterfaceC13460 {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f46226 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC15119[] f46227;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f46228 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f46229;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f46231 = 2;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f46234;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC15119.class.getName());
        f46229 = new C8065();
        f46227 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f46234;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC15119 m35816(int i) {
        return m35814(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15119 m35814(int i) {
        if (i == 0) {
            return JS_NORMAL;
        }
        if (i == 1) {
            return JS_STRING;
        }
        if (i != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m35818() {
        return f46229;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m35820() {
        return (C2235) m35817().m23854().get(ordinal());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m35819() {
        return m35817();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m35817() {
        int i = C3126.f9770;
        return (C9291) C10702.f32218.m41597().get(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15119 m35815(C2235 c2235) {
        if (c2235.getType() != m35817()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f46227[c2235.m7418()];
    }

    EnumC15119(int i) {
        this.f46234 = i;
    }
}
