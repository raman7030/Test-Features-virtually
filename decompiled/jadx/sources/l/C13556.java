package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܰۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13556 implements InterfaceC10030 {
    public static final C22729 f = C22729.f(1, 7);
    public static final C22729 g = C22729.g(0, 4, 6);
    public static final C22729 h = C22729.g(0, 52, 54);
    public static final C22729 i = C22729.g(1, 52, 53);
    public final String a;
    public final C7207 b;
    public final InterfaceC3679 c;
    public final InterfaceC3679 d;
    public final C22729 e;

    @Override // l.InterfaceC10030
    public final boolean isDateBased() {
        return true;
    }

    public final InterfaceC13410 e(InterfaceC2765 interfaceC2765, int i2, int i3, int i4) {
        InterfaceC13410 interfaceC13410M = interfaceC2765.M(i2, 1, 1);
        int iH = h(1, b(interfaceC13410M));
        return interfaceC13410M.d(((Math.min(i3, a(iH, interfaceC13410M.Q() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (InterfaceC3679) EnumC8618.DAYS);
    }

    public C13556(String str, C7207 c7207, InterfaceC3679 interfaceC3679, InterfaceC3679 interfaceC36710, C22729 c22729) {
        this.a = str;
        this.b = c7207;
        this.c = interfaceC3679;
        this.d = interfaceC36710;
        this.e = c22729;
    }

    @Override // l.InterfaceC10030
    public final long C(InterfaceC2268 interfaceC2268) {
        int iC;
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            iC = b(interfaceC2268);
        } else if (interfaceC3679 != EnumC8618.MONTHS) {
            if (interfaceC3679 != EnumC8618.YEARS) {
                if (interfaceC3679 == C7207.h) {
                    iC = d(interfaceC2268);
                } else if (interfaceC3679 == EnumC8618.FOREVER) {
                    iC = c(interfaceC2268);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC3679 + ", this: " + this);
                }
            } else {
                int iB = b(interfaceC2268);
                int iL = interfaceC2268.l(EnumC18496.DAY_OF_YEAR);
                iC = a(h(iL, iB), iL);
            }
        } else {
            int iB2 = b(interfaceC2268);
            int iL2 = interfaceC2268.l(EnumC18496.DAY_OF_MONTH);
            iC = a(h(iL2, iB2), iL2);
        }
        return iC;
    }

    public final int b(InterfaceC2268 interfaceC2268) {
        return AbstractC5796.e(interfaceC2268.l(EnumC18496.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(InterfaceC2268 interfaceC2268) {
        int iB = b(interfaceC2268);
        int iL = interfaceC2268.l(EnumC18496.YEAR);
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_YEAR;
        int iL2 = interfaceC2268.l(enumC18496);
        int iH = h(iL2, iB);
        int iA = a(iH, iL2);
        if (iA == 0) {
            return iL - 1;
        }
        return iA >= a(iH, ((int) interfaceC2268.n(enumC18496).d) + this.b.b) ? iL + 1 : iL;
    }

    public final int d(InterfaceC2268 interfaceC2268) {
        int iA;
        int iB = b(interfaceC2268);
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_YEAR;
        int iL = interfaceC2268.l(enumC18496);
        int iH = h(iL, iB);
        int iA2 = a(iH, iL);
        if (iA2 == 0) {
            return d(AbstractC16169.r(interfaceC2268).E(interfaceC2268).w(iL, EnumC8618.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) interfaceC2268.n(enumC18496).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i2, int i3) {
        int iE = AbstractC5796.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // l.InterfaceC10030
    public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
        int iA = this.e.a(j, this);
        int iL = interfaceC15672.l(this);
        if (iA == iL) {
            return interfaceC15672;
        }
        if (this.d != EnumC8618.FOREVER) {
            return interfaceC15672.d(iA - iL, this.c);
        }
        C7207 c7207 = this.b;
        return e(AbstractC16169.r(interfaceC15672), (int) j, interfaceC15672.l(c7207.e), interfaceC15672.l(c7207.c));
    }

    @Override // l.InterfaceC10030
    public final InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
        InterfaceC13410 interfaceC13410D;
        InterfaceC13410 interfaceC13410D2;
        InterfaceC13410 interfaceC13410D3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iY = AbstractC22791.y(jLongValue);
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        C22729 c22729 = this.e;
        C7207 c7207 = this.b;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            long jE = AbstractC5796.e((c22729.a(jLongValue, this) - 1) + (c7207.a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(EnumC18496.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_WEEK;
        if (map.containsKey(enumC18496)) {
            int iE = AbstractC5796.e(enumC18496.b.a(((Long) map.get(enumC18496)).longValue(), enumC18496) - c7207.a.getValue()) + 1;
            InterfaceC2765 interfaceC2765R = AbstractC16169.r(c16420);
            EnumC18496 enumC18497 = EnumC18496.YEAR;
            if (map.containsKey(enumC18497)) {
                int iA = enumC18497.b.a(((Long) map.get(enumC18497)).longValue(), enumC18497);
                EnumC8618 enumC8619 = EnumC8618.MONTHS;
                if (interfaceC3679 == enumC8619) {
                    EnumC18496 enumC18498 = EnumC18496.MONTH_OF_YEAR;
                    if (map.containsKey(enumC18498)) {
                        long jLongValue2 = ((Long) map.get(enumC18498)).longValue();
                        long j = iY;
                        if (enumC17126 == EnumC17126.LENIENT) {
                            InterfaceC13410 interfaceC13410D4 = interfaceC2765R.M(iA, 1, 1).d(AbstractC22791.R(jLongValue2, 1L), (InterfaceC3679) enumC8619);
                            int iB = b(interfaceC13410D4);
                            int iL = interfaceC13410D4.l(EnumC18496.DAY_OF_MONTH);
                            interfaceC13410D3 = interfaceC13410D4.d(AbstractC22791.P(AbstractC22791.Q(AbstractC22791.R(j, a(h(iL, iB), iL)), 7), iE - b(interfaceC13410D4)), (InterfaceC3679) EnumC8618.DAYS);
                        } else {
                            InterfaceC13410 interfaceC13410M = interfaceC2765R.M(iA, enumC18498.b.a(jLongValue2, enumC18498), 1);
                            long jA = c22729.a(j, this);
                            int iB2 = b(interfaceC13410M);
                            int iL2 = interfaceC13410M.l(EnumC18496.DAY_OF_MONTH);
                            InterfaceC13410 interfaceC13410D5 = interfaceC13410M.d((((int) (jA - ((long) a(h(iL2, iB2), iL2)))) * 7) + (iE - b(interfaceC13410M)), (InterfaceC3679) EnumC8618.DAYS);
                            if (enumC17126 == EnumC17126.STRICT && interfaceC13410D5.G(enumC18498) != jLongValue2) {
                                throw new C16232("Strict mode rejected resolved date as it is in a different month");
                            }
                            interfaceC13410D3 = interfaceC13410D5;
                        }
                        map.remove(this);
                        map.remove(enumC18497);
                        map.remove(enumC18498);
                        map.remove(enumC18496);
                        return interfaceC13410D3;
                    }
                }
                if (interfaceC3679 == EnumC8618.YEARS) {
                    long j2 = iY;
                    InterfaceC13410 interfaceC13410M2 = interfaceC2765R.M(iA, 1, 1);
                    if (enumC17126 == EnumC17126.LENIENT) {
                        int iB3 = b(interfaceC13410M2);
                        int iL3 = interfaceC13410M2.l(EnumC18496.DAY_OF_YEAR);
                        interfaceC13410D2 = interfaceC13410M2.d(AbstractC22791.P(AbstractC22791.Q(AbstractC22791.R(j2, a(h(iL3, iB3), iL3)), 7), iE - b(interfaceC13410M2)), (InterfaceC3679) EnumC8618.DAYS);
                    } else {
                        long jA2 = c22729.a(j2, this);
                        int iB4 = b(interfaceC13410M2);
                        int iL4 = interfaceC13410M2.l(EnumC18496.DAY_OF_YEAR);
                        InterfaceC13410 interfaceC13410D6 = interfaceC13410M2.d((((int) (jA2 - ((long) a(h(iL4, iB4), iL4)))) * 7) + (iE - b(interfaceC13410M2)), (InterfaceC3679) EnumC8618.DAYS);
                        if (enumC17126 == EnumC17126.STRICT && interfaceC13410D6.G(enumC18497) != iA) {
                            throw new C16232("Strict mode rejected resolved date as it is in a different year");
                        }
                        interfaceC13410D2 = interfaceC13410D6;
                    }
                    map.remove(this);
                    map.remove(enumC18497);
                    map.remove(enumC18496);
                    return interfaceC13410D2;
                }
            } else if ((interfaceC3679 == C7207.h || interfaceC3679 == EnumC8618.FOREVER) && map.containsKey(c7207.f) && map.containsKey(c7207.e)) {
                C13556 c13556 = c7207.f;
                int iA2 = c13556.e.a(((Long) map.get(c13556)).longValue(), c7207.f);
                if (enumC17126 == EnumC17126.LENIENT) {
                    interfaceC13410D = e(interfaceC2765R, iA2, 1, iE).d(AbstractC22791.R(((Long) map.get(c7207.e)).longValue(), 1L), (InterfaceC3679) enumC8618);
                } else {
                    C13556 c13557 = c7207.e;
                    InterfaceC13410 interfaceC13410E = e(interfaceC2765R, iA2, c13557.e.a(((Long) map.get(c13557)).longValue(), c7207.e), iE);
                    if (enumC17126 == EnumC17126.STRICT && c(interfaceC13410E) != iA2) {
                        throw new C16232("Strict mode rejected resolved date as it is in a different week-based-year");
                    }
                    interfaceC13410D = interfaceC13410E;
                }
                map.remove(this);
                map.remove(c7207.f);
                map.remove(c7207.e);
                map.remove(enumC18496);
                return interfaceC13410D;
            }
        }
        return null;
    }

    @Override // l.InterfaceC10030
    public final C22729 s() {
        return this.e;
    }

    @Override // l.InterfaceC10030
    public final boolean l(InterfaceC2268 interfaceC2268) {
        if (!interfaceC2268.e(EnumC18496.DAY_OF_WEEK)) {
            return false;
        }
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            return true;
        }
        if (interfaceC3679 == EnumC8618.MONTHS) {
            return interfaceC2268.e(EnumC18496.DAY_OF_MONTH);
        }
        if (interfaceC3679 == EnumC8618.YEARS) {
            return interfaceC2268.e(EnumC18496.DAY_OF_YEAR);
        }
        if (interfaceC3679 == C7207.h) {
            return interfaceC2268.e(EnumC18496.DAY_OF_YEAR);
        }
        if (interfaceC3679 == EnumC8618.FOREVER) {
            return interfaceC2268.e(EnumC18496.YEAR);
        }
        return false;
    }

    @Override // l.InterfaceC10030
    public final C22729 m(InterfaceC2268 interfaceC2268) {
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            return this.e;
        }
        if (interfaceC3679 == EnumC8618.MONTHS) {
            return f(interfaceC2268, EnumC18496.DAY_OF_MONTH);
        }
        if (interfaceC3679 == EnumC8618.YEARS) {
            return f(interfaceC2268, EnumC18496.DAY_OF_YEAR);
        }
        if (interfaceC3679 == C7207.h) {
            return g(interfaceC2268);
        }
        if (interfaceC3679 == EnumC8618.FOREVER) {
            return EnumC18496.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC3679 + ", this: " + this);
    }

    public final C22729 f(InterfaceC2268 interfaceC2268, EnumC18496 enumC18496) {
        int iH = h(interfaceC2268.l(enumC18496), b(interfaceC2268));
        C22729 c22729N = interfaceC2268.n(enumC18496);
        return C22729.f(a(iH, (int) c22729N.a), a(iH, (int) c22729N.d));
    }

    public final C22729 g(InterfaceC2268 interfaceC2268) {
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_YEAR;
        if (!interfaceC2268.e(enumC18496)) {
            return h;
        }
        int iB = b(interfaceC2268);
        int iL = interfaceC2268.l(enumC18496);
        int iH = h(iL, iB);
        int iA = a(iH, iL);
        if (iA != 0) {
            int i2 = (int) interfaceC2268.n(enumC18496).d;
            int iA2 = a(iH, this.b.b + i2);
            if (iA >= iA2) {
                return g(AbstractC16169.r(interfaceC2268).E(interfaceC2268).d((i2 - iL) + 8, (InterfaceC3679) EnumC8618.DAYS));
            }
            return C22729.f(1L, iA2 - 1);
        }
        return g(AbstractC16169.r(interfaceC2268).E(interfaceC2268).w(iL + 7, EnumC8618.DAYS));
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
