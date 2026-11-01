package p067l;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes4.dex */
public final class C16205 extends AbstractC17508 {

    /* JADX INFO: renamed from: ֫ */
    public C13902 f47693;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24923 f47694;

    public C16205(C24923 c24923) {
        this.f47694 = c24923;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02b9 A[Catch: ۫ۗۚ -> 0x02cf, TryCatch #11 {۫ۗۚ -> 0x02cf, blocks: (B:107:0x024c, B:109:0x0256, B:110:0x025d, B:126:0x02af, B:127:0x02b3, B:129:0x02b9, B:130:0x02bc, B:117:0x0276, B:118:0x0294, B:120:0x0298, B:122:0x029e, B:123:0x02a1, B:124:0x02a5, B:125:0x02aa), top: B:174:0x024c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0317 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x0318  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231 A[Catch: ۫ۗۚ -> 0x0247, TryCatch #7 {۫ۗۚ -> 0x0247, blocks: (B:72:0x01c0, B:74:0x01c8, B:75:0x01cf, B:96:0x0227, B:97:0x022b, B:99:0x0231, B:100:0x0234, B:83:0x01ea, B:84:0x01fe, B:86:0x0202, B:88:0x0208, B:89:0x020c, B:90:0x0210, B:92:0x0216, B:93:0x0219, B:94:0x021d, B:95:0x0223), top: B:167:0x01c0 }] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4711 m36900(EnumC12758 enumC12758) {
        AbstractC4711 c9957;
        float f;
        int iFloatToIntBits;
        C17450 c17450M30738;
        double d;
        long jDoubleToLongBits;
        EnumC18121 enumC18121M30743;
        C17450 c17450M30729;
        AbstractC4711 c20016;
        C17450 c17450M30739;
        long j;
        C13902 c13902;
        AbstractC4711 c10628 = null;
        this.f47693 = null;
        int i = C10804.f29938[enumC12758.ordinal()];
        int i2 = 0;
        C24923 c24923 = this.f47694;
        switch (i) {
            case 1:
            case 2:
                try {
                    c24923.f9122.m20084(EnumC16818.f49772);
                    break;
                } catch (C13902 e) {
                    this.f47693 = e;
                }
                c10628 = new C23368(c24923.f9122.f23227);
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
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
                    C8655 c8655 = c24923.f9122;
                    if (c8655.f23232 == EnumC16818.f49697) {
                        c8655.m20078();
                        c24923.f9122.f23233 = true;
                    }
                    C8655 c8656 = c24923.f9122;
                    i2 = c8656.f23230 * c8656.f23237;
                    c8656.m20084(EnumC16818.f49668);
                    break;
                } catch (C13902 e2) {
                    this.f47693 = e2;
                }
                c10628 = new C10628(enumC12758, Integer.valueOf(i2));
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 13:
            case 14:
                try {
                    C8655 c8657 = c24923.f9122;
                    c8657.f23233 = false;
                    if (c8657.f23232 == EnumC16818.f49697) {
                        c8657.m20078();
                        c24923.f9122.f23233 = true;
                    }
                    int i3 = C12854.f36158[c24923.f9122.f23232.ordinal()];
                    try {
                        if (i3 == 6) {
                            f = (float) c24923.f9122.f23243;
                        } else if (i3 == 8) {
                            f = c24923.f9122.f23242;
                        } else {
                            if (i3 == 12) {
                                C8655 c8658 = c24923.f9122;
                                if (c8658.f23233) {
                                    iFloatToIntBits = c8658.f23237;
                                } else {
                                    f = c8658.f23237;
                                }
                                if (c24923.f9122.f23230 == -1) {
                                    iFloatToIntBits ^= Integer.MIN_VALUE;
                                }
                                c9957 = new C11299(Integer.valueOf(iFloatToIntBits));
                                c24923.f9122.m20078();
                                c10628 = c9957;
                                c13902 = this.f47693;
                                if (c13902 == null) {
                                    return c10628;
                                }
                                throw c13902;
                            }
                            if (i3 == 20) {
                                f = Float.POSITIVE_INFINITY;
                            } else {
                                if (i3 != 21) {
                                    c24923.f9120.m48074(new C5381(1, this));
                                    c24923.f9120.mo11117(c24923.f9122.f23240, "\"{0}\" token is expected", "<Float>");
                                    throw new C13902();
                                }
                                f = Float.NaN;
                            }
                        }
                        c24923.f9122.m20078();
                        c10628 = c9957;
                    } catch (C13902 e3) {
                        e = e3;
                        c10628 = c9957;
                        this.f47693 = e;
                    }
                    iFloatToIntBits = Float.floatToIntBits(f);
                    if (c24923.f9122.f23230 == -1) {
                        iFloatToIntBits ^= Integer.MIN_VALUE;
                    }
                    c9957 = new C11299(Integer.valueOf(iFloatToIntBits));
                } catch (C13902 e4) {
                    e = e4;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 15:
            case 16:
                try {
                    C8655 c8659 = c24923.f9122;
                    if (c8659.f23232 == EnumC16818.f49697) {
                        c8659.m20078();
                        c24923.f9122.f23233 = true;
                    }
                    int i4 = C12854.f36158[c24923.f9122.f23232.ordinal()];
                    try {
                        if (i4 == 6) {
                            d = c24923.f9122.f23243;
                        } else {
                            if (i4 != 8) {
                                if (i4 == 10) {
                                    C8655 c86510 = c24923.f9122;
                                    if (c86510.f23233) {
                                        jDoubleToLongBits = c86510.f23228;
                                    } else {
                                        d = c86510.f23228;
                                    }
                                } else if (i4 == 12) {
                                    C8655 c86511 = c24923.f9122;
                                    if (c86511.f23233) {
                                        jDoubleToLongBits = c86511.f23237;
                                    } else {
                                        d = c86511.f23237;
                                    }
                                } else if (i4 == 20) {
                                    d = Double.POSITIVE_INFINITY;
                                } else {
                                    if (i4 != 21) {
                                        c24923.f9120.mo11117(c24923.f9122.f23240, "\"{0}\" token is expected", "Double");
                                        throw new C13902();
                                    }
                                    d = Double.NaN;
                                }
                                if (c24923.f9122.f23230 == -1) {
                                    jDoubleToLongBits ^= Long.MIN_VALUE;
                                }
                                c9957 = new C24709(Long.valueOf(jDoubleToLongBits));
                                c24923.f9122.m20078();
                                c10628 = c9957;
                                c13902 = this.f47693;
                                if (c13902 == null) {
                                    return c10628;
                                }
                                throw c13902;
                            }
                            d = c24923.f9122.f23242;
                        }
                        c24923.f9122.m20078();
                        c10628 = c9957;
                    } catch (C13902 e5) {
                        e = e5;
                        c10628 = c9957;
                        this.f47693 = e;
                    }
                    jDoubleToLongBits = Double.doubleToLongBits(d);
                    if (c24923.f9122.f23230 == -1) {
                        jDoubleToLongBits ^= Long.MIN_VALUE;
                    }
                    c9957 = new C24709(Long.valueOf(jDoubleToLongBits));
                } catch (C13902 e6) {
                    e = e6;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 17:
            case 18:
                try {
                    C8655 c86512 = c24923.f9122;
                    if (c86512.f23232 == EnumC16818.f49697) {
                        c86512.m20078();
                        c24923.f9122.f23233 = true;
                    }
                    int i5 = C12854.f36158[c24923.f9122.f23232.ordinal()];
                    if (i5 == 10) {
                        j = c24923.f9122.f23228;
                    } else {
                        if (i5 != 12) {
                            c24923.f9120.mo11117(c24923.f9122.f23241, "\"{0}\" token is expected", "Integer");
                            throw new C13902();
                        }
                        j = c24923.f9122.f23237;
                    }
                    C5934 c5934 = new C5934(Long.valueOf(j * ((long) c24923.f9122.f23230)));
                    try {
                        c24923.f9122.m20078();
                        c10628 = c5934;
                    } catch (C13902 e7) {
                        e = e7;
                        c10628 = c5934;
                        this.f47693 = e;
                    }
                } catch (C13902 e8) {
                    e = e8;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 19:
                try {
                    c17450M30738 = c24923.f9121.m30738();
                    break;
                } catch (C13902 e9) {
                    this.f47693 = e9;
                    c17450M30738 = null;
                }
                if (this.f47693 == null) {
                    c10628 = new C2580(EnumC12758.f35923, c17450M30738);
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 20:
            case 21:
                try {
                    c17450M30739 = c24923.f9121.m30738();
                    break;
                } catch (C13902 e10) {
                    this.f47693 = e10;
                    c17450M30739 = null;
                }
                if (this.f47693 == null) {
                    c10628 = new C22698(c17450M30739);
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 22:
            case 23:
                try {
                    c9957 = new C15991(c24923.f9121.m30730(true));
                    c10628 = c9957;
                } catch (C13902 e11) {
                    this.f47693 = e11;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 24:
            case 25:
                c10628 = m36901(EnumC12758.f35914);
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 26:
            case 27:
                c10628 = m36901(EnumC12758.f35902);
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 28:
            case 29:
                c10628 = m36901(EnumC12758.f35919);
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 30:
                try {
                    C17450 c17450M307310 = c24923.f9121.m30738();
                    c24923.f9122.m20084(EnumC16818.f49722);
                    c20016 = new C3251(c17450M307310, c24923.f9121.m30738());
                    c10628 = c20016;
                } catch (C13902 e12) {
                    this.f47693 = e12;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 31:
                try {
                    C8655 c86513 = c24923.f9122;
                    if (c86513.f23232 == EnumC16818.f49668) {
                        enumC18121M30743 = C19463.m44283(c86513.f23237);
                        c24923.f9122.m20078();
                        c24923.f9122.m20084(EnumC16818.f49722);
                        C8655 c86514 = c24923.f9122;
                        if (c86514.f23232 == EnumC16818.f49704) {
                            c17450M30729 = c24923.f9121.f38012.m11353(c86514.f23237);
                            c24923.f9122.m20078();
                        } else {
                            c17450M30729 = c24923.f9121.m30729(enumC18121M30743);
                        }
                    } else {
                        enumC18121M30743 = c24923.f9121.m30743();
                        c24923.f9122.m20084(EnumC16818.f49722);
                        C8655 c86515 = c24923.f9122;
                        if (c86515.f23232 == EnumC16818.f49704) {
                            c17450M30729 = c24923.f9121.f38012.m11353(c86515.f23237);
                            c24923.f9122.m20078();
                        } else {
                            c17450M30729 = c24923.f9121.m30729(enumC18121M30743);
                        }
                    }
                    c20016 = new C20016(enumC18121M30743, c17450M30729);
                    c10628 = c20016;
                } catch (C13902 e13) {
                    this.f47693 = e13;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 32:
                c10628 = (C8616) m36899(new C18217());
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 33:
                c10628 = (C4593) m36899(new C19559());
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 34:
                try {
                    c9957 = new C9957(EnumC12758.f35894, c24923.f9121.m30739());
                    c10628 = c9957;
                } catch (C13902 e14) {
                    this.f47693 = e14;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            case 35:
                try {
                    c9957 = new C7275(EnumC12758.f35924, c24923.f9121.m30735());
                    c10628 = c9957;
                } catch (C13902 e15) {
                    this.f47693 = e15;
                }
                c13902 = this.f47693;
                if (c13902 == null) {
                    return c10628;
                }
                throw c13902;
            default:
                throw new RuntimeException(C6988.m16053("The Constant Type \"", enumC12758.m29302(), "\" does not have a corresponding visitor function."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[Catch: ۫ۗۚ -> 0x00dc, TryCatch #0 {۫ۗۚ -> 0x00dc, blocks: (B:3:0x0003, B:5:0x0016, B:9:0x0030, B:17:0x0078, B:19:0x0080, B:20:0x0099, B:33:0x00c4, B:34:0x00db, B:27:0x00ab, B:28:0x00b1, B:29:0x00b9, B:8:0x001e, B:10:0x003a, B:12:0x004a, B:15:0x0059, B:16:0x006e), top: B:38:0x0003 }] */
    /* JADX INFO: renamed from: ۧ */
    public final C16661 m36901(EnumC12758 enumC12758) {
        C17450 c17450M53532;
        C16661 c17332;
        C24923 c24923 = this.f47694;
        C16661 c16661 = null;
        try {
            EnumC16818 enumC16818 = c24923.f9122.f23232;
            C17450 c17450M30730 = c24923.f9121.m30730(false);
            C8655 c8655 = c24923.f9122;
            if (c8655.f23232 == EnumC16818.f49724) {
                c8655.m20078();
                if (enumC16818 != EnumC16818.f49704) {
                    C5263 c5263 = c24923.f9121.f38012;
                    EnumC12758 enumC12759 = EnumC12758.f35925;
                    c5263.getClass();
                    c17450M30730 = c5263.m11356((AbstractC4711) new C18674(enumC12759, c17450M30730));
                }
                C17450 c17450 = c17450M30730;
                c17450M30730 = c24923.f9121.m30738();
                c17450M53532 = c17450;
            } else if (c24923.f9121.f38026.f44284.m53532().mo20303() || c24923.f9121.f38026.f44284.m53532().f52180 == null) {
                c17450M53532 = c24923.f9121.f38026.f44284.m53532();
            } else {
                C13524 c13524 = c24923.f9121;
                c17450M53532 = c13524.f38012.m11356(c13524.f38026.f44284.m53532().f52180);
            }
            C8655 c8656 = c24923.f9122;
            if (c8656.f23232 == EnumC16818.f49722) {
                c8656.m20078();
                C13524 c13525 = c24923.f9121;
                C5263 c5264 = c13525.f38012;
                EnumC12758 enumC127510 = EnumC12758.f35921;
                C17450 c17450M30738 = c13525.m30738();
                c5264.getClass();
                c17450M30730 = c5264.m11356((AbstractC4711) new C16661(enumC127510, c17450M30730, c17450M30738));
            }
            int i = C12854.f36157[enumC12758.ordinal()];
            if (i == 1) {
                c17332 = new C17332(EnumC12758.f35919, c17450M53532, c17450M30730);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        c17332 = new C22028(c17450M53532, c17450M30730);
                    }
                    if (c16661 != null) {
                        return c16661;
                    }
                    c24923.f9120.mo13866("Invalid type of Constant Pool Constant {0}", enumC12758.m29302());
                    C13902 c13902 = new C13902();
                    c13902.m31626();
                    throw c13902;
                }
                c17332 = new C20687(EnumC12758.f35914, c17450M53532, c17450M30730);
            }
            c16661 = c17332;
            if (c16661 != null) {
                return c16661;
            }
            c24923.f9120.mo13866("Invalid type of Constant Pool Constant {0}", enumC12758.m29302());
            C13902 c13903 = new C13902();
            c13903.m31626();
            throw c13903;
        } catch (C13902 e) {
            this.f47693 = e;
            return c16661;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ef A[Catch: ۫ۗۚ -> 0x0118, TryCatch #0 {۫ۗۚ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa A[Catch: ۫ۗۚ -> 0x0118, TryCatch #0 {۫ۗۚ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108 A[Catch: ۫ۗۚ -> 0x0118, TryCatch #0 {۫ۗۚ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX INFO: renamed from: ֫ */
    private C19345 m36899(BiFunction biFunction) {
        C8655 c8655;
        C8655 c8656;
        C17450 c17450M11356;
        C24923 c24923 = this.f47694;
        try {
            C8655 c8657 = c24923.f9122;
            if (c8657.f23232 == EnumC16818.f49668) {
                int i = c8657.f23237;
                c8657.m20078();
                c24923.f9122.m20084(EnumC16818.f49722);
                C8655 c8658 = c24923.f9122;
                if (c8658.f23232 != EnumC16818.f49704) {
                    c24923.f9120.m48074(new Supplier() { // from class: l.ܿܰۚ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return "token=" + this.f56389.f47694.f9122.f23232;
                        }
                    });
                    c24923.f9120.mo11117(c24923.f9122.f23240, "\"{0}\" token is expected", "<CPINDEX>");
                    throw new C13902();
                }
                int i2 = c8658.f23237;
                c8658.m20078();
                C11475 c11475 = new C11475();
                c11475.f31990 = null;
                c11475.f31991 = new ArrayList();
                c11475.f23817 = i;
                return (C19345) biFunction.apply(c11475, c24923.f9121.f38012.m11353(i2));
            }
            C17450 c17450M11357 = c24923.f9121.f38012.m11356(c24923.m54788(EnumC12758.f35900));
            c24923.f9122.m20084(EnumC16818.f49722);
            C17450 c17450M11358 = c24923.f9121.f38012.m11356(c24923.m54788(EnumC12758.f35921));
            if (c24923.f9122.f23232 == EnumC16818.f49767) {
                c24923.m54793();
                c24923.f9122.m20078();
            }
            ArrayList arrayList = new ArrayList(256);
            while (true) {
                if (c24923.f79593 > 0) {
                    C8655 c8659 = c24923.f9122;
                    EnumC16818 enumC16818 = c8659.f23232;
                    EnumC16818 enumC16819 = EnumC16818.f49567;
                    if (enumC16818 == enumC16819) {
                        c24923.m54791();
                        c24923.f9122.m20078();
                        break;
                    }
                    if (enumC16818 == EnumC16818.f49604) {
                        c8659.m20084(enumC16819);
                    }
                    c8655 = c24923.f9122;
                    if (c8655.f23232 == EnumC16818.f49716) {
                        c8655.m20078();
                    }
                    c8656 = c24923.f9122;
                    if (c8656.f23232 == EnumC16818.f49704) {
                        int i3 = c8656.f23237;
                        c8656.m20078();
                        c17450M11356 = c24923.f9121.f38012.m11353(i3);
                    } else {
                        c17450M11356 = c24923.f9121.f38012.m11356(c24923.m54789(null, null, false, true));
                    }
                    arrayList.add(c17450M11356);
                } else {
                    if (c24923.f9122.f23232 == EnumC16818.f49604) {
                        break;
                    }
                    c8655 = c24923.f9122;
                    if (c8655.f23232 == EnumC16818.f49716) {
                        c8655.m20078();
                    }
                    c8656 = c24923.f9122;
                    if (c8656.f23232 == EnumC16818.f49704) {
                        int i4 = c8656.f23237;
                        c8656.m20078();
                        c17450M11356 = c24923.f9121.f38012.m11353(i4);
                    } else {
                        c17450M11356 = c24923.f9121.f38012.m11356(c24923.m54789(null, null, false, true));
                    }
                    arrayList.add(c17450M11356);
                }
            }
            if (c24923.f79593 == 0) {
                c24923.f9122.m20081(EnumC16818.f49604);
            }
            C11475 c11476 = new C11475(c17450M11357, arrayList);
            c24923.f9121.f38026.m35273(c11476);
            return (C19345) biFunction.apply(c11476, c17450M11358);
        } catch (C13902 e) {
            this.f47693 = e;
            return null;
        }
    }
}
