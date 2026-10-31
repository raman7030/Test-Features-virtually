package l;

/* JADX INFO: renamed from: l.᩻ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes.dex */
public final class C23732 extends C1860 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14559 f76841;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f76843 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76842 = 0;

    public C23732(C11738 c11738) {
        this.f6339 = c11738.f6339;
        this.f6341 = c11738.f6341;
        this.f6340 = c11738;
        this.f76841 = new C14559(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52385(boolean z) {
        this.f76843 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2465 m52381(EnumC10932 enumC10932) {
        return this.f76841.m34751(enumC10932);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private EnumC10932 m52380(boolean z, boolean z2) {
        EnumC10932 enumC10932M42035;
        if (z) {
            enumC10932M42035 = null;
        } else if (z2) {
            enumC10932M42035 = C17987.m42031(this.f6341.f20357);
        } else {
            enumC10932M42035 = C17987.m42035(this.f6341.f20357);
        }
        String.format("\t\tTag: %s ", enumC10932M42035 == null ? "<not found>" : enumC10932M42035);
        return enumC10932M42035;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2465 m52382(EnumC10932 enumC10932, EnumC10932 enumC10933, boolean z, boolean z2) {
        EnumC10932 enumC10932M52380 = m52380(z, z2);
        C11003.toString(enumC10932M52380);
        if (enumC10932M52380 != null) {
            if (enumC10932 != null && !enumC10932M52380.m27254(enumC10932)) {
                if (enumC10933 == null) {
                    if (this.f76843) {
                        throw C20094.m46318(this.f6339, this.f6341.f20363, "Wrong tag: {0} expected", new Object[]{enumC10932.m27257()});
                    }
                    this.f6339.mo11949(this.f6341.f20363, "Wrong tag: {0} expected", enumC10932.m27257());
                } else if (!enumC10932M52380.m27254(enumC10933)) {
                    if (this.f76843) {
                        throw C20094.m46318(this.f6339, this.f6341.f20363, "Wrong tag: Either {0} or {1} expected", new Object[]{enumC10932.m27257(), enumC10933.m27257()});
                    }
                    this.f6339.mo11949(this.f6341.f20363, "Wrong tag: Either {0} or {1} expected", enumC10932.m27257(), enumC10933.m27257());
                }
            }
            this.f6341.m18126();
            enumC10932 = enumC10932M52380;
        } else if (enumC10932 == null) {
            switch (C11033.f33163[this.f6341.f20355.ordinal()]) {
                case 1:
                    enumC10932 = EnumC10932.f32918;
                    break;
                case 2:
                    enumC10932 = EnumC10932.f32921;
                    break;
                case 3:
                    enumC10932 = EnumC10932.f32928;
                    break;
                case 4:
                    enumC10932 = EnumC10932.f32912;
                    break;
                case 5:
                    enumC10932 = EnumC10932.f32948;
                    break;
                case 6:
                    enumC10932 = EnumC10932.f32938;
                    break;
                case 7:
                    enumC10932 = EnumC10932.f32923;
                    break;
                case 8:
                    enumC10932 = EnumC10932.f32940;
                    break;
                case 9:
                    enumC10932 = EnumC10932.f32910;
                    break;
                case 10:
                    enumC10932 = EnumC10932.f32939;
                    break;
                case 11:
                    enumC10932 = EnumC10932.f32937;
                    break;
                case 12:
                    enumC10932 = EnumC10932.f32913;
                    break;
                case 13:
                    enumC10932 = EnumC10932.f32914;
                    break;
                case 14:
                    enumC10932 = EnumC10932.f32935;
                    break;
                case 15:
                    enumC10932 = EnumC10932.f32925;
                    break;
                case 16:
                    enumC10932 = EnumC10932.f32934;
                    break;
                case 17:
                case 18:
                case 19:
                    enumC10932 = EnumC10932.f32933;
                    break;
                default:
                    C3917 c3917 = this.f6339;
                    C6615 c6615 = this.f6341;
                    throw C19462.m44860(c3917, c6615.f20363, "Value expected near \"{0}\"", new Object[]{c6615.f20355.m35962()});
            }
        }
        return this.f76841.m34751(enumC10932);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15869 m52387() {
        AbstractC2465 c8691;
        EnumC10932 enumC10932M52380 = m52380(false, true);
        if (enumC10932M52380 != null && enumC10932M52380.m27256() >= 1) {
            this.f6341.m18126();
            return this.f6340.f35012.m9314(this.f76841.m34751(enumC10932M52380));
        }
        int i = C11033.f33163[this.f6341.f20355.ordinal()];
        if (i == 2) {
            c8691 = new C8691(EnumC10932.f32918, Integer.valueOf(this.f6341.f20360));
        } else if (i == 4) {
            c8691 = new C8691(EnumC10932.f32928, Integer.valueOf(this.f6341.f20360));
        } else if (i == 6) {
            c8691 = new C23507(Long.valueOf(Double.doubleToLongBits(this.f6341.f20366)));
        } else if (i == 8) {
            c8691 = new C9397(Integer.valueOf(Float.floatToIntBits(this.f6341.f20365)));
        } else if (i == 10) {
            c8691 = new C3752(Long.valueOf(this.f6341.f20351));
        } else if (i == 12) {
            c8691 = new C8691(EnumC10932.f32937, Integer.valueOf(this.f6341.f20360));
        } else if (i == 14) {
            c8691 = new C8691(EnumC10932.f32914, Integer.valueOf(this.f6341.f20360));
        } else if (i == 19) {
            String str = this.f6341.f20350;
            if (str.equalsIgnoreCase("true")) {
                c8691 = new C8691(EnumC10932.f32925, 1);
            } else {
                if (!str.equalsIgnoreCase("false")) {
                    throw C20094.m46318(this.f6339, this.f6341.f20363, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
                }
                c8691 = new C8691(EnumC10932.f32925, 0);
            }
        } else if (i == 16) {
            c8691 = new C8691(EnumC10932.f32925, Integer.valueOf(this.f6341.f20360));
        } else {
            if (i != 17) {
                throw C20094.m46318(this.f6339, this.f6341.f20363, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
            }
            c8691 = new C22096(this.f6341.f20350);
        }
        this.f6341.m18126();
        return this.f6340.f35012.m9314(c8691);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m52383(EnumC10932 enumC10932, EnumC10932 enumC10933, boolean z) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f6340.f35012.m9311(i);
        }
        return this.f6340.f35012.m9314(m52382(enumC10932, enumC10933, z, false));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52384() {
        this.f76842--;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52386() {
        this.f76842++;
    }
}
