package p067l;

/* JADX INFO: renamed from: l.᩻ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes.dex */
public final class C24923 extends C4136 {

    /* JADX INFO: renamed from: ܳ */
    public final C16205 f79592;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f79594 = false;

    /* JADX INFO: renamed from: ܿ */
    public int f79593 = 0;

    public C24923(C13524 c13524) {
        this.f9120 = c13524.f9120;
        this.f9122 = c13524.f9122;
        this.f9121 = c13524;
        this.f79592 = new C16205(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54792(boolean z) {
        this.f79594 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4711 m54788(EnumC12758 enumC12758) {
        return this.f79592.m36900(enumC12758);
    }

    /* JADX INFO: renamed from: ֫ */
    private EnumC12758 m54787(boolean z, boolean z2) {
        EnumC12758 enumC12758M44285;
        if (z) {
            enumC12758M44285 = null;
        } else if (z2) {
            enumC12758M44285 = C19463.m44281(this.f9122.f23234);
        } else {
            enumC12758M44285 = C19463.m44285(this.f9122.f23234);
        }
        String.format("\t\tTag: %s ", enumC12758M44285 == null ? "<not found>" : enumC12758M44285);
        return enumC12758M44285;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4711 m54789(EnumC12758 enumC12758, EnumC12758 enumC12759, boolean z, boolean z2) {
        EnumC12758 enumC12758M54787 = m54787(z, z2);
        C12826.toString(enumC12758M54787);
        if (enumC12758M54787 != null) {
            if (enumC12758 != null && !enumC12758M54787.m29298(enumC12758)) {
                if (enumC12759 == null) {
                    if (this.f79594) {
                        throw C21466.m48634(this.f9120, this.f9122.f23240, "Wrong tag: {0} expected", new Object[]{enumC12758.m29301()});
                    }
                    this.f9120.mo13869(this.f9122.f23240, "Wrong tag: {0} expected", enumC12758.m29301());
                } else if (!enumC12758M54787.m29298(enumC12759)) {
                    if (this.f79594) {
                        throw C21466.m48634(this.f9120, this.f9122.f23240, "Wrong tag: Either {0} or {1} expected", new Object[]{enumC12758.m29301(), enumC12759.m29301()});
                    }
                    this.f9120.mo13869(this.f9122.f23240, "Wrong tag: Either {0} or {1} expected", enumC12758.m29301(), enumC12759.m29301());
                }
            }
            this.f9122.m20078();
            enumC12758 = enumC12758M54787;
        } else if (enumC12758 == null) {
            switch (C12854.f36158[this.f9122.f23232.ordinal()]) {
                case 1:
                    enumC12758 = EnumC12758.f35896;
                    break;
                case 2:
                    enumC12758 = EnumC12758.f35899;
                    break;
                case 3:
                    enumC12758 = EnumC12758.f35906;
                    break;
                case 4:
                    enumC12758 = EnumC12758.f35890;
                    break;
                case 5:
                    enumC12758 = EnumC12758.f35926;
                    break;
                case 6:
                    enumC12758 = EnumC12758.f35916;
                    break;
                case 7:
                    enumC12758 = EnumC12758.f35901;
                    break;
                case 8:
                    enumC12758 = EnumC12758.f35918;
                    break;
                case 9:
                    enumC12758 = EnumC12758.f35888;
                    break;
                case 10:
                    enumC12758 = EnumC12758.f35917;
                    break;
                case 11:
                    enumC12758 = EnumC12758.f35915;
                    break;
                case 12:
                    enumC12758 = EnumC12758.f35891;
                    break;
                case 13:
                    enumC12758 = EnumC12758.f35892;
                    break;
                case 14:
                    enumC12758 = EnumC12758.f35913;
                    break;
                case 15:
                    enumC12758 = EnumC12758.f35903;
                    break;
                case 16:
                    enumC12758 = EnumC12758.f35912;
                    break;
                case 17:
                case 18:
                case 19:
                    enumC12758 = EnumC12758.f35911;
                    break;
                default:
                    C6091 c6091 = this.f9120;
                    C8655 c8655 = this.f9122;
                    throw C20865.m47156(c6091, c8655.f23240, "Value expected near \"{0}\"", new Object[]{c8655.f23232.m38122()});
            }
        }
        return this.f79592.m36900(enumC12758);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17450 m54794() {
        AbstractC4711 c10628;
        EnumC12758 enumC12758M54787 = m54787(false, true);
        if (enumC12758M54787 != null && enumC12758M54787.m29300() >= 1) {
            this.f9122.m20078();
            return this.f9121.f38012.m11356(this.f79592.m36900(enumC12758M54787));
        }
        int i = C12854.f36158[this.f9122.f23232.ordinal()];
        if (i == 2) {
            c10628 = new C10628(EnumC12758.f35896, Integer.valueOf(this.f9122.f23237));
        } else if (i == 4) {
            c10628 = new C10628(EnumC12758.f35906, Integer.valueOf(this.f9122.f23237));
        } else if (i == 6) {
            c10628 = new C24709(Long.valueOf(Double.doubleToLongBits(this.f9122.f23243)));
        } else if (i == 8) {
            c10628 = new C11299(Integer.valueOf(Float.floatToIntBits(this.f9122.f23242)));
        } else if (i == 10) {
            c10628 = new C5934(Long.valueOf(this.f9122.f23228));
        } else if (i == 12) {
            c10628 = new C10628(EnumC12758.f35915, Integer.valueOf(this.f9122.f23237));
        } else if (i == 14) {
            c10628 = new C10628(EnumC12758.f35892, Integer.valueOf(this.f9122.f23237));
        } else if (i == 19) {
            String str = this.f9122.f23227;
            if (str.equalsIgnoreCase("true")) {
                c10628 = new C10628(EnumC12758.f35903, 1);
            } else {
                if (!str.equalsIgnoreCase("false")) {
                    throw C21466.m48634(this.f9120, this.f9122.f23240, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
                }
                c10628 = new C10628(EnumC12758.f35903, 0);
            }
        } else if (i == 16) {
            c10628 = new C10628(EnumC12758.f35903, Integer.valueOf(this.f9122.f23237));
        } else {
            if (i != 17) {
                throw C21466.m48634(this.f9120, this.f9122.f23240, "Expected one of the valid constant kinds from the constant pool", new Object[0]);
            }
            c10628 = new C23368(this.f9122.f23227);
        }
        this.f9122.m20078();
        return this.f9121.f38012.m11356(c10628);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17450 m54790(EnumC12758 enumC12758, EnumC12758 enumC12759, boolean z) {
        C8655 c8655 = this.f9122;
        if (c8655.f23232 == EnumC16818.f49704) {
            int i = c8655.f23237;
            c8655.m20078();
            return this.f9121.f38012.m11353(i);
        }
        return this.f9121.f38012.m11356(m54789(enumC12758, enumC12759, z, false));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54791() {
        this.f79593--;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54793() {
        this.f79593++;
    }
}
