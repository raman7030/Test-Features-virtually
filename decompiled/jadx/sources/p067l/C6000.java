package p067l;

/* JADX INFO: renamed from: l.ۘ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6000 {

    /* JADX INFO: renamed from: ֫ */
    public final int f15029;

    /* JADX INFO: renamed from: ۜ */
    public final int f15030;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC12628 f15031;

    /* JADX INFO: renamed from: ۧ */
    public final int f15032;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f15033;

    /* JADX INFO: renamed from: ܽ */
    public final int f15034;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC12628 f15035;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f15036;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC12628 f15037;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12628 f15038;

    public C6000(C24697 c24697, int i, C24697 c24698, C6454 c6454, C24697 c24699, C14638 c14638) {
        this.f15038 = c24697.f78179;
        this.f15033 = m13501(c24697);
        this.f15034 = i;
        this.f15035 = c24698.f78179;
        this.f15036 = m13501(c24698);
        this.f15037 = c6454 == null ? null : c6454.f23121;
        this.f15030 = c6454 == null ? 0 : c6454.f23120;
        this.f15031 = c24699.f78179;
        this.f15032 = c14638.f41780;
        this.f15029 = c14638.f41781;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6000 m13499(C14638 c14638) {
        int i;
        int i2;
        C7933 c7933;
        C7933 c7934;
        C7933 c7935;
        C3239 c3239;
        C24697 c24697;
        C24697 c24697M13500;
        C6454 c6454;
        C24697 c24698;
        InterfaceC12628 interfaceC12628;
        C7933 c7936;
        if (c14638 != null) {
            int i3 = c14638.f41777;
            if (c14638.getClass() == C14638.class && (i = c14638.f41780) >= 0 && c14638.f41781 >= i && c14638.f41782 >= -1 && i3 >= 0 && (i2 = c14638.f41778) >= 0 && i3 != i2 && (c7933 = c14638.f41779) != null && c7933.getClass() == C7263.class) {
                C7263 c7263 = (C7263) c14638.f41779;
                boolean z = c7263.f18932;
                int i4 = c7263.f18931;
                if (z && i4 == i3 && (c7934 = c7263.f20809) != null && c7934.getClass() == C13160.class) {
                    C13160 c13160 = (C13160) c7263.f20809;
                    C7933[] c7933Arr = c13160.f36986;
                    C7933 c7937 = c13160.f36988;
                    if (c7933Arr != null && c13160.f36987 == 2 && c7933Arr.length >= 2 && c7937 != null && c7937.getClass() == C23888.class && (c7935 = c7937.f20809) != null && c7935.getClass() == C3239.class && c7263.f18933 == (c3239 = (C3239) c7937.f20809) && c3239.f6279 && c3239.f6277 == 0 && c3239.f6278 == i4 && c3239.f20809 == c14638) {
                        C24697 c24697M13501 = m13500(c13160.f36986[0]);
                        C24697 c24697M13502 = m13500(c13160.f36986[1]);
                        if (c24697M13501 != null && c24697M13502 != null) {
                            if (c24697M13501.f20809 == c7937) {
                                c24697 = c24697M13501;
                                c24697M13501 = c24697M13502;
                            } else if (c24697M13502.f20809 == c7937) {
                                c24697 = c24697M13502;
                            }
                            InterfaceC12628 interfaceC12629 = c24697M13501.f78179;
                            if (m13501(c24697M13501) && (c24697M13500 = m13500(c24697M13501.f20809)) != null && c24697M13500.f20809 == c7937) {
                                C7933 c7938 = c14638.f20809;
                                if (c7938 == null || c7938.getClass() != C6454.class) {
                                    c6454 = null;
                                } else {
                                    C6454 c6455 = (C6454) c7938;
                                    if (c6455.f23120 >= 0 && c6455.f23121 != null) {
                                        c6454 = c6455;
                                        c7938 = c6455.f20809;
                                    }
                                }
                                if (m13501(c7938) && (interfaceC12628 = (c24698 = (C24697) c7938).f78179) != null && (c7936 = c24698.f20809) != null && c7936.getClass() == C16649.class) {
                                    boolean zM13501 = m13501(c24697);
                                    int iMax = Math.max(C16057.m36555(interfaceC12629), C16057.m36555(interfaceC12628));
                                    if (c6454 != null) {
                                        iMax = Math.max(iMax, C16057.m36555(c6454.f23121));
                                    }
                                    int i5 = -1;
                                    for (int i6 = 0; i6 < iMax; i6++) {
                                        boolean zMo4821 = interfaceC12629.mo4821(i6);
                                        if (zMo4821) {
                                            if (i5 < 0 && !Character.isSurrogate((char) i6)) {
                                                i5 = i6;
                                            }
                                        }
                                        boolean zMo4822 = interfaceC12628.mo4821(i6);
                                        boolean z2 = c6454 != null && c6454.f23121.mo4821(i6);
                                        if (zMo4822 && z2) {
                                            return null;
                                        }
                                        boolean z3 = zMo4822 || z2;
                                        if (!zM13501 && z3 && Character.isSurrogate((char) i6)) {
                                            return null;
                                        }
                                        if (zMo4821 && z3) {
                                            return null;
                                        }
                                        if ((zMo4821 || z3) && c24697.f78179.mo4821(i6)) {
                                            return null;
                                        }
                                    }
                                    if (i5 < 0) {
                                        return null;
                                    }
                                    return new C6000(c24697, i5, c24697M13500, c6454, c24698, c14638);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24697 m13500(C7933 c7933) {
        if (c7933 == null) {
            return null;
        }
        Class<?> cls = c7933.getClass();
        if (cls != C24697.class && cls != C10616.class && cls != C12706.class && !m13501(c7933)) {
            return null;
        }
        C24697 c24697 = (C24697) c7933;
        if (c24697.f78179 == null) {
            return null;
        }
        return c24697;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m13501(C7933 c7933) {
        return c7933 != null && c7933.getClass() == C21207.class;
    }
}
