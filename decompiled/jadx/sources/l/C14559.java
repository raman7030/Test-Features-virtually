package l;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes4.dex */
public final class C14559 extends AbstractC15930 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12136 f44586;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23732 f44587;

    public C14559(C23732 c23732) {
        this.f44587 = c23732;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02b9 A[Catch: ۫ۗۚ -> 0x02cf, TryCatch #11 {۫ۗۚ -> 0x02cf, blocks: (B:107:0x024c, B:109:0x0256, B:110:0x025d, B:126:0x02af, B:127:0x02b3, B:129:0x02b9, B:130:0x02bc, B:117:0x0276, B:118:0x0294, B:120:0x0298, B:122:0x029e, B:123:0x02a1, B:124:0x02a5, B:125:0x02aa), top: B:174:0x024c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0317 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x0318  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231 A[Catch: ۫ۗۚ -> 0x0247, TryCatch #7 {۫ۗۚ -> 0x0247, blocks: (B:72:0x01c0, B:74:0x01c8, B:75:0x01cf, B:96:0x0227, B:97:0x022b, B:99:0x0231, B:100:0x0234, B:83:0x01ea, B:84:0x01fe, B:86:0x0202, B:88:0x0208, B:89:0x020c, B:90:0x0210, B:92:0x0216, B:93:0x0219, B:94:0x021d, B:95:0x0223), top: B:167:0x01c0 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2465 m34751(EnumC10932 enumC10932) {
        AbstractC2465 c7985;
        float f;
        int iFloatToIntBits;
        C15869 c15869M28690;
        double d;
        long jDoubleToLongBits;
        EnumC16575 enumC16575M28695;
        C15869 c15869M28681;
        AbstractC2465 c18569;
        C15869 c15869M28691;
        long j;
        C12136 c12136;
        AbstractC2465 c8691 = null;
        this.f44586 = null;
        int i = C8876.f27014[enumC10932.ordinal()];
        int i2 = 0;
        C23732 c23732 = this.f44587;
        switch (i) {
            case 1:
            case 2:
                try {
                    c23732.f6341.m18132(EnumC15204.f46647);
                    break;
                } catch (C12136 e) {
                    this.f44586 = e;
                }
                c8691 = new C22096(c23732.f6341.f20350);
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                try {
                    C6615 c6615 = c23732.f6341;
                    if (c6615.f20355 == EnumC15204.f46572) {
                        c6615.m18126();
                        c23732.f6341.f20356 = true;
                    }
                    C6615 c6616 = c23732.f6341;
                    i2 = c6616.f20353 * c6616.f20360;
                    c6616.m18132(EnumC15204.f46543);
                    break;
                } catch (C12136 e2) {
                    this.f44586 = e2;
                }
                c8691 = new C8691(enumC10932, Integer.valueOf(i2));
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 13:
            case 14:
                try {
                    C6615 c6617 = c23732.f6341;
                    c6617.f20356 = false;
                    if (c6617.f20355 == EnumC15204.f46572) {
                        c6617.m18126();
                        c23732.f6341.f20356 = true;
                    }
                    int i3 = C11033.f33163[c23732.f6341.f20355.ordinal()];
                    try {
                        if (i3 == 6) {
                            f = (float) c23732.f6341.f20366;
                        } else if (i3 == 8) {
                            f = c23732.f6341.f20365;
                        } else {
                            if (i3 == 12) {
                                C6615 c6618 = c23732.f6341;
                                if (c6618.f20356) {
                                    iFloatToIntBits = c6618.f20360;
                                } else {
                                    f = c6618.f20360;
                                }
                                if (c23732.f6341.f20353 == -1) {
                                    iFloatToIntBits ^= Integer.MIN_VALUE;
                                }
                                c7985 = new C9397(Integer.valueOf(iFloatToIntBits));
                                c23732.f6341.m18126();
                                c8691 = c7985;
                                c12136 = this.f44586;
                                if (c12136 == null) {
                                    return c8691;
                                }
                                throw c12136;
                            }
                            if (i3 == 20) {
                                f = Float.POSITIVE_INFINITY;
                            } else {
                                if (i3 != 21) {
                                    c23732.f6339.m45762(new C3170(1, this));
                                    c23732.f6339.mo9065(c23732.f6341.f20363, "\"{0}\" token is expected", "<Float>");
                                    throw new C12136();
                                }
                                f = Float.NaN;
                            }
                        }
                        c23732.f6341.m18126();
                        c8691 = c7985;
                    } catch (C12136 e3) {
                        e = e3;
                        c8691 = c7985;
                        this.f44586 = e;
                    }
                    iFloatToIntBits = Float.floatToIntBits(f);
                    if (c23732.f6341.f20353 == -1) {
                        iFloatToIntBits ^= Integer.MIN_VALUE;
                    }
                    c7985 = new C9397(Integer.valueOf(iFloatToIntBits));
                } catch (C12136 e4) {
                    e = e4;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 15:
            case 16:
                try {
                    C6615 c6619 = c23732.f6341;
                    if (c6619.f20355 == EnumC15204.f46572) {
                        c6619.m18126();
                        c23732.f6341.f20356 = true;
                    }
                    int i4 = C11033.f33163[c23732.f6341.f20355.ordinal()];
                    try {
                        if (i4 == 6) {
                            d = c23732.f6341.f20366;
                        } else {
                            if (i4 != 8) {
                                if (i4 == 10) {
                                    C6615 c66110 = c23732.f6341;
                                    if (c66110.f20356) {
                                        jDoubleToLongBits = c66110.f20351;
                                    } else {
                                        d = c66110.f20351;
                                    }
                                } else if (i4 == 12) {
                                    C6615 c66111 = c23732.f6341;
                                    if (c66111.f20356) {
                                        jDoubleToLongBits = c66111.f20360;
                                    } else {
                                        d = c66111.f20360;
                                    }
                                } else if (i4 == 20) {
                                    d = Double.POSITIVE_INFINITY;
                                } else {
                                    if (i4 != 21) {
                                        c23732.f6339.mo9065(c23732.f6341.f20363, "\"{0}\" token is expected", "Double");
                                        throw new C12136();
                                    }
                                    d = Double.NaN;
                                }
                                if (c23732.f6341.f20353 == -1) {
                                    jDoubleToLongBits ^= Long.MIN_VALUE;
                                }
                                c7985 = new C23507(Long.valueOf(jDoubleToLongBits));
                                c23732.f6341.m18126();
                                c8691 = c7985;
                                c12136 = this.f44586;
                                if (c12136 == null) {
                                    return c8691;
                                }
                                throw c12136;
                            }
                            d = c23732.f6341.f20365;
                        }
                        c23732.f6341.m18126();
                        c8691 = c7985;
                    } catch (C12136 e5) {
                        e = e5;
                        c8691 = c7985;
                        this.f44586 = e;
                    }
                    jDoubleToLongBits = Double.doubleToLongBits(d);
                    if (c23732.f6341.f20353 == -1) {
                        jDoubleToLongBits ^= Long.MIN_VALUE;
                    }
                    c7985 = new C23507(Long.valueOf(jDoubleToLongBits));
                } catch (C12136 e6) {
                    e = e6;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 17:
            case 18:
                try {
                    C6615 c66112 = c23732.f6341;
                    if (c66112.f20355 == EnumC15204.f46572) {
                        c66112.m18126();
                        c23732.f6341.f20356 = true;
                    }
                    int i5 = C11033.f33163[c23732.f6341.f20355.ordinal()];
                    if (i5 == 10) {
                        j = c23732.f6341.f20351;
                    } else {
                        if (i5 != 12) {
                            c23732.f6339.mo9065(c23732.f6341.f20364, "\"{0}\" token is expected", "Integer");
                            throw new C12136();
                        }
                        j = c23732.f6341.f20360;
                    }
                    C3752 c3752 = new C3752(Long.valueOf(j * ((long) c23732.f6341.f20353)));
                    try {
                        c23732.f6341.m18126();
                        c8691 = c3752;
                    } catch (C12136 e7) {
                        e = e7;
                        c8691 = c3752;
                        this.f44586 = e;
                    }
                } catch (C12136 e8) {
                    e = e8;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 19:
                try {
                    c15869M28690 = c23732.f6340.m28690();
                    break;
                } catch (C12136 e9) {
                    this.f44586 = e9;
                    c15869M28690 = null;
                }
                if (this.f44586 == null) {
                    c8691 = new C0223(EnumC10932.f32945, c15869M28690);
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 20:
            case 21:
                try {
                    c15869M28691 = c23732.f6340.m28690();
                    break;
                } catch (C12136 e10) {
                    this.f44586 = e10;
                    c15869M28691 = null;
                }
                if (this.f44586 == null) {
                    c8691 = new C21391(c15869M28691);
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 22:
            case 23:
                try {
                    c7985 = new C14334(c23732.f6340.m28682(true));
                    c8691 = c7985;
                } catch (C12136 e11) {
                    this.f44586 = e11;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 24:
            case 25:
                c8691 = m34752(EnumC10932.f32936);
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 26:
            case 27:
                c8691 = m34752(EnumC10932.f32924);
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 28:
            case 29:
                c8691 = m34752(EnumC10932.f32941);
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 30:
                try {
                    C15869 c15869M28692 = c23732.f6340.m28690();
                    c23732.f6341.m18132(EnumC15204.f46597);
                    c18569 = new C0929(c15869M28692, c23732.f6340.m28690());
                    c8691 = c18569;
                } catch (C12136 e12) {
                    this.f44586 = e12;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 31:
                try {
                    C6615 c66113 = c23732.f6341;
                    if (c66113.f20355 == EnumC15204.f46543) {
                        enumC16575M28695 = C17987.m42033(c66113.f20360);
                        c23732.f6341.m18126();
                        c23732.f6341.m18132(EnumC15204.f46597);
                        C6615 c66114 = c23732.f6341;
                        if (c66114.f20355 == EnumC15204.f46579) {
                            c15869M28681 = c23732.f6340.f35012.m9311(c66114.f20360);
                            c23732.f6341.m18126();
                        } else {
                            c15869M28681 = c23732.f6340.m28681(enumC16575M28695);
                        }
                    } else {
                        enumC16575M28695 = c23732.f6340.m28695();
                        c23732.f6341.m18132(EnumC15204.f46597);
                        C6615 c66115 = c23732.f6341;
                        if (c66115.f20355 == EnumC15204.f46579) {
                            c15869M28681 = c23732.f6340.f35012.m9311(c66115.f20360);
                            c23732.f6341.m18126();
                        } else {
                            c15869M28681 = c23732.f6340.m28681(enumC16575M28695);
                        }
                    }
                    c18569 = new C18569(enumC16575M28695, c15869M28681);
                    c8691 = c18569;
                } catch (C12136 e13) {
                    this.f44586 = e13;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 32:
                c8691 = (C6574) m34750(new C16676());
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 33:
                c8691 = (C2341) m34750(new C18088());
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 34:
                try {
                    c7985 = new C7985(EnumC10932.f32916, c23732.f6340.m28691());
                    c8691 = c7985;
                } catch (C12136 e14) {
                    this.f44586 = e14;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            case 35:
                try {
                    c7985 = new C5163(EnumC10932.f32946, c23732.f6340.m28687());
                    c8691 = c7985;
                } catch (C12136 e15) {
                    this.f44586 = e15;
                }
                c12136 = this.f44586;
                if (c12136 == null) {
                    return c8691;
                }
                throw c12136;
            default:
                throw new RuntimeException(C4860.m14172("The Constant Type \"", enumC10932.m27258(), "\" does not have a corresponding visitor function."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[Catch: ۫ۗۚ -> 0x00dc, TryCatch #0 {۫ۗۚ -> 0x00dc, blocks: (B:3:0x0003, B:5:0x0016, B:9:0x0030, B:17:0x0078, B:19:0x0080, B:20:0x0099, B:33:0x00c4, B:34:0x00db, B:27:0x00ab, B:28:0x00b1, B:29:0x00b9, B:8:0x001e, B:10:0x003a, B:12:0x004a, B:15:0x0059, B:16:0x006e), top: B:38:0x0003 }] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15039 m34752(EnumC10932 enumC10932) {
        C15869 c15869M51139;
        C15039 c15745;
        C23732 c23732 = this.f44587;
        C15039 c15039 = null;
        try {
            EnumC15204 enumC15204 = c23732.f6341.f20355;
            C15869 c15869M28682 = c23732.f6340.m28682(false);
            C6615 c6615 = c23732.f6341;
            if (c6615.f20355 == EnumC15204.f46599) {
                c6615.m18126();
                if (enumC15204 != EnumC15204.f46579) {
                    C3046 c3046 = c23732.f6340.f35012;
                    EnumC10932 enumC10933 = EnumC10932.f32947;
                    c3046.getClass();
                    c15869M28682 = c3046.m9314((AbstractC2465) new C17157(enumC10933, c15869M28682));
                }
                C15869 c15869 = c15869M28682;
                c15869M28682 = c23732.f6340.m28690();
                c15869M51139 = c15869;
            } else if (c23732.f6340.f35026.f41206.m51139().mo18355() || c23732.f6340.f35026.f41206.m51139().f49042 == null) {
                c15869M51139 = c23732.f6340.f35026.f41206.m51139();
            } else {
                C11738 c11738 = c23732.f6340;
                c15869M51139 = c11738.f35012.m9314(c11738.f35026.f41206.m51139().f49042);
            }
            C6615 c6616 = c23732.f6341;
            if (c6616.f20355 == EnumC15204.f46597) {
                c6616.m18126();
                C11738 c11739 = c23732.f6340;
                C3046 c3047 = c11739.f35012;
                EnumC10932 enumC10934 = EnumC10932.f32943;
                C15869 c15869M28690 = c11739.m28690();
                c3047.getClass();
                c15869M28682 = c3047.m9314((AbstractC2465) new C15039(enumC10934, c15869M28682, c15869M28690));
            }
            int i = C11033.f33162[enumC10932.ordinal()];
            if (i == 1) {
                c15745 = new C15745(EnumC10932.f32941, c15869M51139, c15869M28682);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        c15745 = new C20686(c15869M51139, c15869M28682);
                    }
                    if (c15039 != null) {
                        return c15039;
                    }
                    c23732.f6339.mo11946("Invalid type of Constant Pool Constant {0}", enumC10932.m27258());
                    C12136 c12136 = new C12136();
                    c12136.m29561();
                    throw c12136;
                }
                c15745 = new C19275(EnumC10932.f32936, c15869M51139, c15869M28682);
            }
            c15039 = c15745;
            if (c15039 != null) {
                return c15039;
            }
            c23732.f6339.mo11946("Invalid type of Constant Pool Constant {0}", enumC10932.m27258());
            C12136 c12137 = new C12136();
            c12137.m29561();
            throw c12137;
        } catch (C12136 e) {
            this.f44586 = e;
            return c15039;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ef A[Catch: ۫ۗۚ -> 0x0118, TryCatch #0 {۫ۗۚ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa A[Catch: ۫ۗۚ -> 0x0118, TryCatch #0 {۫ۗۚ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108 A[Catch: ۫ۗۚ -> 0x0118, TryCatch #0 {۫ۗۚ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C17863 m34750(BiFunction biFunction) {
        C6615 c6615;
        C6615 c6616;
        C15869 c15869M9314;
        C23732 c23732 = this.f44587;
        try {
            C6615 c6617 = c23732.f6341;
            if (c6617.f20355 == EnumC15204.f46543) {
                int i = c6617.f20360;
                c6617.m18126();
                c23732.f6341.m18132(EnumC15204.f46597);
                C6615 c6618 = c23732.f6341;
                if (c6618.f20355 != EnumC15204.f46579) {
                    c23732.f6339.m45762(new Supplier() { // from class: l.ܿܰۚ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return "token=" + this.f53203.f44587.f6341.f20355;
                        }
                    });
                    c23732.f6339.mo9065(c23732.f6341.f20363, "\"{0}\" token is expected", "<CPINDEX>");
                    throw new C12136();
                }
                int i2 = c6618.f20360;
                c6618.m18126();
                C9582 c9582 = new C9582();
                c9582.f29043 = null;
                c9582.f29044 = new ArrayList();
                c9582.f20943 = i;
                return (C17863) biFunction.apply(c9582, c23732.f6340.f35012.m9311(i2));
            }
            C15869 c15869M9315 = c23732.f6340.f35012.m9314(c23732.m52381(EnumC10932.f32922));
            c23732.f6341.m18132(EnumC15204.f46597);
            C15869 c15869M9316 = c23732.f6340.f35012.m9314(c23732.m52381(EnumC10932.f32943));
            if (c23732.f6341.f20355 == EnumC15204.f46642) {
                c23732.m52386();
                c23732.f6341.m18126();
            }
            ArrayList arrayList = new ArrayList(256);
            while (true) {
                if (c23732.f76842 > 0) {
                    C6615 c6619 = c23732.f6341;
                    EnumC15204 enumC15204 = c6619.f20355;
                    EnumC15204 enumC15205 = EnumC15204.f46442;
                    if (enumC15204 == enumC15205) {
                        c23732.m52384();
                        c23732.f6341.m18126();
                        break;
                    }
                    if (enumC15204 == EnumC15204.f46479) {
                        c6619.m18132(enumC15205);
                    }
                    c6615 = c23732.f6341;
                    if (c6615.f20355 == EnumC15204.f46591) {
                        c6615.m18126();
                    }
                    c6616 = c23732.f6341;
                    if (c6616.f20355 == EnumC15204.f46579) {
                        int i3 = c6616.f20360;
                        c6616.m18126();
                        c15869M9314 = c23732.f6340.f35012.m9311(i3);
                    } else {
                        c15869M9314 = c23732.f6340.f35012.m9314(c23732.m52382(null, null, false, true));
                    }
                    arrayList.add(c15869M9314);
                } else {
                    if (c23732.f6341.f20355 == EnumC15204.f46479) {
                        break;
                    }
                    c6615 = c23732.f6341;
                    if (c6615.f20355 == EnumC15204.f46591) {
                        c6615.m18126();
                    }
                    c6616 = c23732.f6341;
                    if (c6616.f20355 == EnumC15204.f46579) {
                        int i4 = c6616.f20360;
                        c6616.m18126();
                        c15869M9314 = c23732.f6340.f35012.m9311(i4);
                    } else {
                        c15869M9314 = c23732.f6340.f35012.m9314(c23732.m52382(null, null, false, true));
                    }
                    arrayList.add(c15869M9314);
                }
            }
            if (c23732.f76842 == 0) {
                c23732.f6341.m18129(EnumC15204.f46479);
            }
            C9582 c9583 = new C9582(c15869M9315, arrayList);
            c23732.f6340.f35026.m33156(c9583);
            return (C17863) biFunction.apply(c9583, c15869M9316);
        } catch (C12136 e) {
            this.f44586 = e;
            return null;
        }
    }
}
