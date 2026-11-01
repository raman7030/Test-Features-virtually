package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܰۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15252 implements InterfaceC11901 {

    /* JADX INFO: renamed from: f */
    public static final C23970 f43531f = C23970.m53119f(1, 7);

    /* JADX INFO: renamed from: g */
    public static final C23970 f43532g = C23970.m53120g(0, 4, 6);

    /* JADX INFO: renamed from: h */
    public static final C23970 f43533h = C23970.m53120g(0, 52, 54);

    /* JADX INFO: renamed from: i */
    public static final C23970 f43534i = C23970.m53120g(1, 52, 53);

    /* JADX INFO: renamed from: a */
    public final String f43535a;

    /* JADX INFO: renamed from: b */
    public final C9218 f43536b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5865 f43537c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5865 f43538d;

    /* JADX INFO: renamed from: e */
    public final C23970 f43539e;

    @Override // p067l.InterfaceC11901
    public final boolean isDateBased() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC15114 m34708e(InterfaceC4997 interfaceC4997, int i, int i2, int i3) {
        InterfaceC15114 interfaceC15114Mo10579M = interfaceC4997.mo10579M(i, 1, 1);
        int iM34711h = m34711h(1, m34705b(interfaceC15114Mo10579M));
        return interfaceC15114Mo10579M.mo7153d(((Math.min(i2, m34704a(iM34711h, interfaceC15114Mo10579M.mo16122Q() + this.f43536b.f24939b) - 1) - 1) * 7) + (i3 - 1) + (-iM34711h), (InterfaceC5865) EnumC10559.DAYS);
    }

    public C15252(String str, C9218 c9218, InterfaceC5865 interfaceC5865, InterfaceC5865 interfaceC5866, C23970 c23970) {
        this.f43535a = str;
        this.f43536b = c9218;
        this.f43537c = interfaceC5865;
        this.f43538d = interfaceC5866;
        this.f43539e = c23970;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: C */
    public final long mo3652C(InterfaceC4524 interfaceC4524) {
        int iM34706c;
        EnumC10559 enumC10559 = EnumC10559.WEEKS;
        InterfaceC5865 interfaceC5865 = this.f43538d;
        if (interfaceC5865 == enumC10559) {
            iM34706c = m34705b(interfaceC4524);
        } else if (interfaceC5865 != EnumC10559.MONTHS) {
            if (interfaceC5865 != EnumC10559.YEARS) {
                if (interfaceC5865 == C9218.f24937h) {
                    iM34706c = m34707d(interfaceC4524);
                } else if (interfaceC5865 == EnumC10559.FOREVER) {
                    iM34706c = m34706c(interfaceC4524);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC5865 + ", this: " + this);
                }
            } else {
                int iM34705b = m34705b(interfaceC4524);
                int iMo6952l = interfaceC4524.mo6952l(EnumC19947.DAY_OF_YEAR);
                iM34706c = m34704a(m34711h(iMo6952l, iM34705b), iMo6952l);
            }
        } else {
            int iM34705b2 = m34705b(interfaceC4524);
            int iMo6952l2 = interfaceC4524.mo6952l(EnumC19947.DAY_OF_MONTH);
            iM34706c = m34704a(m34711h(iMo6952l2, iM34705b2), iMo6952l2);
        }
        return iM34706c;
    }

    /* JADX INFO: renamed from: b */
    public final int m34705b(InterfaceC4524 interfaceC4524) {
        return AbstractC7877.m18197e(interfaceC4524.mo6952l(EnumC19947.DAY_OF_WEEK) - this.f43536b.f24938a.getValue()) + 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m34706c(InterfaceC4524 interfaceC4524) {
        int iM34705b = m34705b(interfaceC4524);
        int iMo6952l = interfaceC4524.mo6952l(EnumC19947.YEAR);
        EnumC19947 enumC19947 = EnumC19947.DAY_OF_YEAR;
        int iMo6952l2 = interfaceC4524.mo6952l(enumC19947);
        int iM34711h = m34711h(iMo6952l2, iM34705b);
        int iM34704a = m34704a(iM34711h, iMo6952l2);
        if (iM34704a == 0) {
            return iMo6952l - 1;
        }
        return iM34704a >= m34704a(iM34711h, ((int) interfaceC4524.mo6953n(enumC19947).f76159d) + this.f43536b.f24939b) ? iMo6952l + 1 : iMo6952l;
    }

    /* JADX INFO: renamed from: d */
    public final int m34707d(InterfaceC4524 interfaceC4524) {
        int iM34704a;
        int iM34705b = m34705b(interfaceC4524);
        EnumC19947 enumC19947 = EnumC19947.DAY_OF_YEAR;
        int iMo6952l = interfaceC4524.mo6952l(enumC19947);
        int iM34711h = m34711h(iMo6952l, iM34705b);
        int iM34704a2 = m34704a(iM34711h, iMo6952l);
        if (iM34704a2 == 0) {
            return m34707d(AbstractC17736.m40316r(interfaceC4524).mo10577E(interfaceC4524).mo16131w(iMo6952l, EnumC10559.DAYS));
        }
        return (iM34704a2 <= 50 || iM34704a2 < (iM34704a = m34704a(iM34711h, ((int) interfaceC4524.mo6953n(enumC19947).f76159d) + this.f43536b.f24939b))) ? iM34704a2 : (iM34704a2 - iM34704a) + 1;
    }

    /* JADX INFO: renamed from: h */
    public final int m34711h(int i, int i2) {
        int iM18197e = AbstractC7877.m18197e(i - i2);
        return iM18197e + 1 > this.f43536b.f24939b ? 7 - iM18197e : -iM18197e;
    }

    /* JADX INFO: renamed from: a */
    public static int m34704a(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: G */
    public final InterfaceC17263 mo3653G(InterfaceC17263 interfaceC17263, long j) {
        int iM53121a = this.f43539e.m53121a(j, this);
        int iMo6952l = interfaceC17263.mo6952l(this);
        if (iM53121a == iMo6952l) {
            return interfaceC17263;
        }
        if (this.f43538d != EnumC10559.FOREVER) {
            return interfaceC17263.mo7153d(iM53121a - iMo6952l, this.f43537c);
        }
        C9218 c9218 = this.f43536b;
        return m34708e(AbstractC17736.m40316r(interfaceC17263), (int) j, interfaceC17263.mo6952l(c9218.f24942e), interfaceC17263.mo6952l(c9218.f24940c));
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: n */
    public final InterfaceC4524 mo3656n(Map map, C17974 c17974, EnumC18645 enumC18645) {
        InterfaceC15114 interfaceC15114Mo7153d;
        InterfaceC15114 interfaceC15114Mo7153d2;
        InterfaceC15114 interfaceC15114Mo7153d3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iM53256y = AbstractC24029.m53256y(jLongValue);
        EnumC10559 enumC10559 = EnumC10559.WEEKS;
        C23970 c23970 = this.f43539e;
        C9218 c9218 = this.f43536b;
        InterfaceC5865 interfaceC5865 = this.f43538d;
        if (interfaceC5865 == enumC10559) {
            long jM18197e = AbstractC7877.m18197e((c23970.m53121a(jLongValue, this) - 1) + (c9218.f24938a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(EnumC19947.DAY_OF_WEEK, Long.valueOf(jM18197e));
            return null;
        }
        EnumC19947 enumC19947 = EnumC19947.DAY_OF_WEEK;
        if (map.containsKey(enumC19947)) {
            int iM18197e = AbstractC7877.m18197e(enumC19947.f60552b.m53121a(((Long) map.get(enumC19947)).longValue(), enumC19947) - c9218.f24938a.getValue()) + 1;
            InterfaceC4997 interfaceC4997M40316r = AbstractC17736.m40316r(c17974);
            EnumC19947 enumC19948 = EnumC19947.YEAR;
            if (map.containsKey(enumC19948)) {
                int iM53121a = enumC19948.f60552b.m53121a(((Long) map.get(enumC19948)).longValue(), enumC19948);
                EnumC10559 enumC105510 = EnumC10559.MONTHS;
                if (interfaceC5865 == enumC105510) {
                    EnumC19947 enumC19949 = EnumC19947.MONTH_OF_YEAR;
                    if (map.containsKey(enumC19949)) {
                        long jLongValue2 = ((Long) map.get(enumC19949)).longValue();
                        long j = iM53256y;
                        if (enumC18645 == EnumC18645.LENIENT) {
                            InterfaceC15114 interfaceC15114Mo7153d4 = interfaceC4997M40316r.mo10579M(iM53121a, 1, 1).mo7153d(AbstractC24029.m53228R(jLongValue2, 1L), (InterfaceC5865) enumC105510);
                            int iM34705b = m34705b(interfaceC15114Mo7153d4);
                            int iMo6952l = interfaceC15114Mo7153d4.mo6952l(EnumC19947.DAY_OF_MONTH);
                            interfaceC15114Mo7153d3 = interfaceC15114Mo7153d4.mo7153d(AbstractC24029.m53226P(AbstractC24029.m53227Q(AbstractC24029.m53228R(j, m34704a(m34711h(iMo6952l, iM34705b), iMo6952l)), 7), iM18197e - m34705b(interfaceC15114Mo7153d4)), (InterfaceC5865) EnumC10559.DAYS);
                        } else {
                            InterfaceC15114 interfaceC15114Mo10579M = interfaceC4997M40316r.mo10579M(iM53121a, enumC19949.f60552b.m53121a(jLongValue2, enumC19949), 1);
                            long jM53121a = c23970.m53121a(j, this);
                            int iM34705b2 = m34705b(interfaceC15114Mo10579M);
                            int iMo6952l2 = interfaceC15114Mo10579M.mo6952l(EnumC19947.DAY_OF_MONTH);
                            InterfaceC15114 interfaceC15114Mo7153d5 = interfaceC15114Mo10579M.mo7153d((((int) (jM53121a - ((long) m34704a(m34711h(iMo6952l2, iM34705b2), iMo6952l2)))) * 7) + (iM18197e - m34705b(interfaceC15114Mo10579M)), (InterfaceC5865) EnumC10559.DAYS);
                            if (enumC18645 == EnumC18645.STRICT && interfaceC15114Mo7153d5.mo6949G(enumC19949) != jLongValue2) {
                                throw new C17796("Strict mode rejected resolved date as it is in a different month");
                            }
                            interfaceC15114Mo7153d3 = interfaceC15114Mo7153d5;
                        }
                        map.remove(this);
                        map.remove(enumC19948);
                        map.remove(enumC19949);
                        map.remove(enumC19947);
                        return interfaceC15114Mo7153d3;
                    }
                }
                if (interfaceC5865 == EnumC10559.YEARS) {
                    long j2 = iM53256y;
                    InterfaceC15114 interfaceC15114Mo10579M2 = interfaceC4997M40316r.mo10579M(iM53121a, 1, 1);
                    if (enumC18645 == EnumC18645.LENIENT) {
                        int iM34705b3 = m34705b(interfaceC15114Mo10579M2);
                        int iMo6952l3 = interfaceC15114Mo10579M2.mo6952l(EnumC19947.DAY_OF_YEAR);
                        interfaceC15114Mo7153d2 = interfaceC15114Mo10579M2.mo7153d(AbstractC24029.m53226P(AbstractC24029.m53227Q(AbstractC24029.m53228R(j2, m34704a(m34711h(iMo6952l3, iM34705b3), iMo6952l3)), 7), iM18197e - m34705b(interfaceC15114Mo10579M2)), (InterfaceC5865) EnumC10559.DAYS);
                    } else {
                        long jM53121a2 = c23970.m53121a(j2, this);
                        int iM34705b4 = m34705b(interfaceC15114Mo10579M2);
                        int iMo6952l4 = interfaceC15114Mo10579M2.mo6952l(EnumC19947.DAY_OF_YEAR);
                        InterfaceC15114 interfaceC15114Mo7153d6 = interfaceC15114Mo10579M2.mo7153d((((int) (jM53121a2 - ((long) m34704a(m34711h(iMo6952l4, iM34705b4), iMo6952l4)))) * 7) + (iM18197e - m34705b(interfaceC15114Mo10579M2)), (InterfaceC5865) EnumC10559.DAYS);
                        if (enumC18645 == EnumC18645.STRICT && interfaceC15114Mo7153d6.mo6949G(enumC19948) != iM53121a) {
                            throw new C17796("Strict mode rejected resolved date as it is in a different year");
                        }
                        interfaceC15114Mo7153d2 = interfaceC15114Mo7153d6;
                    }
                    map.remove(this);
                    map.remove(enumC19948);
                    map.remove(enumC19947);
                    return interfaceC15114Mo7153d2;
                }
            } else if ((interfaceC5865 == C9218.f24937h || interfaceC5865 == EnumC10559.FOREVER) && map.containsKey(c9218.f24943f) && map.containsKey(c9218.f24942e)) {
                C15252 c15252 = c9218.f24943f;
                int iM53121a2 = c15252.f43539e.m53121a(((Long) map.get(c15252)).longValue(), c9218.f24943f);
                if (enumC18645 == EnumC18645.LENIENT) {
                    interfaceC15114Mo7153d = m34708e(interfaceC4997M40316r, iM53121a2, 1, iM18197e).mo7153d(AbstractC24029.m53228R(((Long) map.get(c9218.f24942e)).longValue(), 1L), (InterfaceC5865) enumC10559);
                } else {
                    C15252 c15253 = c9218.f24942e;
                    InterfaceC15114 interfaceC15114M34708e = m34708e(interfaceC4997M40316r, iM53121a2, c15253.f43539e.m53121a(((Long) map.get(c15253)).longValue(), c9218.f24942e), iM18197e);
                    if (enumC18645 == EnumC18645.STRICT && m34706c(interfaceC15114M34708e) != iM53121a2) {
                        throw new C17796("Strict mode rejected resolved date as it is in a different week-based-year");
                    }
                    interfaceC15114Mo7153d = interfaceC15114M34708e;
                }
                map.remove(this);
                map.remove(c9218.f24943f);
                map.remove(c9218.f24942e);
                map.remove(enumC19947);
                return interfaceC15114Mo7153d;
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: s */
    public final C23970 mo3657s() {
        return this.f43539e;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: l */
    public final boolean mo3654l(InterfaceC4524 interfaceC4524) {
        if (!interfaceC4524.mo6951e(EnumC19947.DAY_OF_WEEK)) {
            return false;
        }
        EnumC10559 enumC10559 = EnumC10559.WEEKS;
        InterfaceC5865 interfaceC5865 = this.f43538d;
        if (interfaceC5865 == enumC10559) {
            return true;
        }
        if (interfaceC5865 == EnumC10559.MONTHS) {
            return interfaceC4524.mo6951e(EnumC19947.DAY_OF_MONTH);
        }
        if (interfaceC5865 == EnumC10559.YEARS) {
            return interfaceC4524.mo6951e(EnumC19947.DAY_OF_YEAR);
        }
        if (interfaceC5865 == C9218.f24937h) {
            return interfaceC4524.mo6951e(EnumC19947.DAY_OF_YEAR);
        }
        if (interfaceC5865 == EnumC10559.FOREVER) {
            return interfaceC4524.mo6951e(EnumC19947.YEAR);
        }
        return false;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: m */
    public final C23970 mo3655m(InterfaceC4524 interfaceC4524) {
        EnumC10559 enumC10559 = EnumC10559.WEEKS;
        InterfaceC5865 interfaceC5865 = this.f43538d;
        if (interfaceC5865 == enumC10559) {
            return this.f43539e;
        }
        if (interfaceC5865 == EnumC10559.MONTHS) {
            return m34709f(interfaceC4524, EnumC19947.DAY_OF_MONTH);
        }
        if (interfaceC5865 == EnumC10559.YEARS) {
            return m34709f(interfaceC4524, EnumC19947.DAY_OF_YEAR);
        }
        if (interfaceC5865 == C9218.f24937h) {
            return m34710g(interfaceC4524);
        }
        if (interfaceC5865 == EnumC10559.FOREVER) {
            return EnumC19947.YEAR.f60552b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC5865 + ", this: " + this);
    }

    /* JADX INFO: renamed from: f */
    public final C23970 m34709f(InterfaceC4524 interfaceC4524, EnumC19947 enumC19947) {
        int iM34711h = m34711h(interfaceC4524.mo6952l(enumC19947), m34705b(interfaceC4524));
        C23970 c23970Mo6953n = interfaceC4524.mo6953n(enumC19947);
        return C23970.m53119f(m34704a(iM34711h, (int) c23970Mo6953n.f76156a), m34704a(iM34711h, (int) c23970Mo6953n.f76159d));
    }

    /* JADX INFO: renamed from: g */
    public final C23970 m34710g(InterfaceC4524 interfaceC4524) {
        EnumC19947 enumC19947 = EnumC19947.DAY_OF_YEAR;
        if (!interfaceC4524.mo6951e(enumC19947)) {
            return f43533h;
        }
        int iM34705b = m34705b(interfaceC4524);
        int iMo6952l = interfaceC4524.mo6952l(enumC19947);
        int iM34711h = m34711h(iMo6952l, iM34705b);
        int iM34704a = m34704a(iM34711h, iMo6952l);
        if (iM34704a != 0) {
            int i = (int) interfaceC4524.mo6953n(enumC19947).f76159d;
            int iM34704a2 = m34704a(iM34711h, this.f43536b.f24939b + i);
            if (iM34704a >= iM34704a2) {
                return m34710g(AbstractC17736.m40316r(interfaceC4524).mo10577E(interfaceC4524).mo7153d((i - iMo6952l) + 8, (InterfaceC5865) EnumC10559.DAYS));
            }
            return C23970.m53119f(1L, iM34704a2 - 1);
        }
        return m34710g(AbstractC17736.m40316r(interfaceC4524).mo10577E(interfaceC4524).mo16131w(iMo6952l + 7, EnumC10559.DAYS));
    }

    public final String toString() {
        return this.f43535a + "[" + this.f43536b.toString() + "]";
    }
}
