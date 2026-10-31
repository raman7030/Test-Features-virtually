package l;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4944 implements InterfaceC2765 {
    public static final ConcurrentMapC10942 a = new ConcurrentMapC10942();
    public static final ConcurrentMapC10942 b = new ConcurrentMapC10942();

    public abstract /* synthetic */ InterfaceC13410 m();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k().compareTo(((InterfaceC2765) obj).k());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static InterfaceC2765 n(InterfaceC2765 interfaceC2765, String str) {
        String strO;
        InterfaceC2765 interfaceC2766 = (InterfaceC2765) a.putIfAbsent(str, interfaceC2765);
        if (interfaceC2766 == null && (strO = interfaceC2765.o()) != null) {
            b.putIfAbsent(strO, interfaceC2765);
        }
        return interfaceC2766;
    }

    @Override // l.InterfaceC2765
    public InterfaceC13410 O(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.EPOCH_DAY;
        if (map.containsKey(enumC18496)) {
            return j(((Long) map.remove(enumC18496)).longValue());
        }
        C(map, enumC17126);
        InterfaceC13410 interfaceC13410T = T(map, enumC17126);
        if (interfaceC13410T != null) {
            return interfaceC13410T;
        }
        EnumC18496 enumC18497 = EnumC18496.YEAR;
        if (!map.containsKey(enumC18497)) {
            return null;
        }
        EnumC18496 enumC18498 = EnumC18496.MONTH_OF_YEAR;
        if (map.containsKey(enumC18498)) {
            if (map.containsKey(EnumC18496.DAY_OF_MONTH)) {
                return G(map, enumC17126);
            }
            EnumC18496 enumC18499 = EnumC18496.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC18499)) {
                EnumC18496 enumC184910 = EnumC18496.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(enumC184910)) {
                    EnumC18496 enumC184911 = EnumC18496.DAY_OF_WEEK;
                    if (map.containsKey(enumC184911)) {
                        int iA = v(enumC18497).a(((Long) map.remove(enumC18497)).longValue(), enumC18497);
                        if (enumC17126 == EnumC17126.LENIENT) {
                            return s(M(iA, 1, 1), AbstractC22791.R(((Long) map.remove(enumC18498)).longValue(), 1L), AbstractC22791.R(((Long) map.remove(enumC18499)).longValue(), 1L), AbstractC22791.R(((Long) map.remove(enumC184911)).longValue(), 1L));
                        }
                        int iA2 = v(enumC18498).a(((Long) map.remove(enumC18498)).longValue(), enumC18498);
                        InterfaceC13410 interfaceC13410M = M(iA, iA2, 1).d((v(enumC18499).a(((Long) map.remove(enumC18499)).longValue(), enumC18499) - 1) * 7, (InterfaceC3679) EnumC8618.DAYS).m(new C12851(EnumC21878.V(v(enumC184911).a(((Long) map.remove(enumC184911)).longValue(), enumC184911)).getValue(), 0));
                        if (enumC17126 != EnumC17126.STRICT || interfaceC13410M.l(enumC18498) == iA2) {
                            return interfaceC13410M;
                        }
                        throw new C16232("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iA3 = v(enumC18497).a(((Long) map.remove(enumC18497)).longValue(), enumC18497);
                    if (enumC17126 == EnumC17126.LENIENT) {
                        long jR = AbstractC22791.R(((Long) map.remove(enumC18498)).longValue(), 1L);
                        return M(iA3, 1, 1).d(jR, (InterfaceC3679) EnumC8618.MONTHS).d(AbstractC22791.R(((Long) map.remove(enumC18499)).longValue(), 1L), (InterfaceC3679) EnumC8618.WEEKS).d(AbstractC22791.R(((Long) map.remove(enumC184910)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
                    }
                    int iA4 = v(enumC18498).a(((Long) map.remove(enumC18498)).longValue(), enumC18498);
                    InterfaceC13410 interfaceC13410D = M(iA3, iA4, 1).d((v(enumC184910).a(((Long) map.remove(enumC184910)).longValue(), enumC184910) - 1) + ((v(enumC18499).a(((Long) map.remove(enumC18499)).longValue(), enumC18499) - 1) * 7), (InterfaceC3679) EnumC8618.DAYS);
                    if (enumC17126 != EnumC17126.STRICT || interfaceC13410D.l(enumC18498) == iA4) {
                        return interfaceC13410D;
                    }
                    throw new C16232("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC18496 enumC184912 = EnumC18496.DAY_OF_YEAR;
        if (!map.containsKey(enumC184912)) {
            EnumC18496 enumC184913 = EnumC18496.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(enumC184913)) {
                return null;
            }
            EnumC18496 enumC184914 = EnumC18496.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(enumC184914)) {
                EnumC18496 enumC184915 = EnumC18496.DAY_OF_WEEK;
                if (!map.containsKey(enumC184915)) {
                    return null;
                }
                int iA5 = v(enumC18497).a(((Long) map.remove(enumC18497)).longValue(), enumC18497);
                if (enumC17126 == EnumC17126.LENIENT) {
                    return s(q(iA5, 1), 0L, AbstractC22791.R(((Long) map.remove(enumC184913)).longValue(), 1L), AbstractC22791.R(((Long) map.remove(enumC184915)).longValue(), 1L));
                }
                InterfaceC13410 interfaceC13410M2 = q(iA5, 1).d((v(enumC184913).a(((Long) map.remove(enumC184913)).longValue(), enumC184913) - 1) * 7, (InterfaceC3679) EnumC8618.DAYS).m(new C12851(EnumC21878.V(v(enumC184915).a(((Long) map.remove(enumC184915)).longValue(), enumC184915)).getValue(), 0));
                if (enumC17126 != EnumC17126.STRICT || interfaceC13410M2.l(enumC18497) == iA5) {
                    return interfaceC13410M2;
                }
                throw new C16232("Strict mode rejected resolved date as it is in a different year");
            }
            int iA6 = v(enumC18497).a(((Long) map.remove(enumC18497)).longValue(), enumC18497);
            if (enumC17126 == EnumC17126.LENIENT) {
                return q(iA6, 1).d(AbstractC22791.R(((Long) map.remove(enumC184913)).longValue(), 1L), (InterfaceC3679) EnumC8618.WEEKS).d(AbstractC22791.R(((Long) map.remove(enumC184914)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
            }
            InterfaceC13410 interfaceC13410D2 = q(iA6, 1).d((v(enumC184914).a(((Long) map.remove(enumC184914)).longValue(), enumC184914) - 1) + ((v(enumC184913).a(((Long) map.remove(enumC184913)).longValue(), enumC184913) - 1) * 7), (InterfaceC3679) EnumC8618.DAYS);
            if (enumC17126 != EnumC17126.STRICT || interfaceC13410D2.l(enumC18497) == iA6) {
                return interfaceC13410D2;
            }
            throw new C16232("Strict mode rejected resolved date as it is in a different year");
        }
        int iA7 = v(enumC18497).a(((Long) map.remove(enumC18497)).longValue(), enumC18497);
        if (enumC17126 == EnumC17126.LENIENT) {
            return q(iA7, 1).d(AbstractC22791.R(((Long) map.remove(enumC184912)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
        }
        return q(iA7, v(enumC184912).a(((Long) map.remove(enumC184912)).longValue(), enumC184912));
    }

    @Override // l.InterfaceC2765
    public InterfaceC14115 J(InterfaceC2268 interfaceC2268) {
        try {
            return E(interfaceC2268).I(C7248.X(interfaceC2268));
        } catch (C16232 e) {
            throw new C16232("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC2268.getClass(), e);
        }
    }

    public void C(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC18496);
        if (l2 != null) {
            if (enumC17126 != EnumC17126.LENIENT) {
                enumC18496.T(l2.longValue());
            }
            InterfaceC13410 interfaceC13410C = m().c(1L, (InterfaceC10030) EnumC18496.DAY_OF_MONTH).c(l2.longValue(), (InterfaceC10030) enumC18496);
            EnumC18496 enumC18497 = EnumC18496.MONTH_OF_YEAR;
            l(map, enumC18497, interfaceC13410C.l(enumC18497));
            EnumC18496 enumC18498 = EnumC18496.YEAR;
            l(map, enumC18498, interfaceC13410C.l(enumC18498));
        }
    }

    public InterfaceC13410 T(Map map, EnumC17126 enumC17126) {
        int iY;
        EnumC18496 enumC18496 = EnumC18496.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC18496);
        if (l2 != null) {
            EnumC18496 enumC18497 = EnumC18496.ERA;
            Long l3 = (Long) map.remove(enumC18497);
            if (enumC17126 != EnumC17126.LENIENT) {
                iY = v(enumC18496).a(l2.longValue(), enumC18496);
            } else {
                iY = AbstractC22791.y(l2.longValue());
            }
            if (l3 != null) {
                l(map, EnumC18496.YEAR, z(y(v(enumC18497).a(l3.longValue(), enumC18497)), iY));
                return null;
            }
            EnumC18496 enumC18498 = EnumC18496.YEAR;
            if (map.containsKey(enumC18498)) {
                l(map, enumC18498, z(q(v(enumC18498).a(((Long) map.get(enumC18498)).longValue(), enumC18498), 1).K(), iY));
                return null;
            }
            if (enumC17126 == EnumC17126.STRICT) {
                map.put(enumC18496, l2);
                return null;
            }
            List listX = x();
            if (listX.isEmpty()) {
                l(map, enumC18498, iY);
                return null;
            }
            l(map, enumC18498, z((InterfaceC4176) listX.get(listX.size() - 1), iY));
            return null;
        }
        EnumC18496 enumC18499 = EnumC18496.ERA;
        if (!map.containsKey(enumC18499)) {
            return null;
        }
        v(enumC18499).b(((Long) map.get(enumC18499)).longValue(), enumC18499);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.᩹᩹ᩴ] */
    @Override // l.InterfaceC2765
    public InterfaceC22583 p(InterfaceC2268 interfaceC2268) {
        try {
            AbstractC5650 abstractC5650V = AbstractC5650.V(interfaceC2268);
            try {
                interfaceC2268 = P(C4239.W(interfaceC2268), abstractC5650V);
                return interfaceC2268;
            } catch (C16232 unused) {
                return C9115.V(abstractC5650V, null, C16875.V(this, J(interfaceC2268)));
            }
        } catch (C16232 e) {
            throw new C16232("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC2268.getClass(), e);
        }
    }

    public InterfaceC13410 G(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        int iA = v(enumC18496).a(((Long) map.remove(enumC18496)).longValue(), enumC18496);
        if (enumC17126 == EnumC17126.LENIENT) {
            long jR = AbstractC22791.R(((Long) map.remove(EnumC18496.MONTH_OF_YEAR)).longValue(), 1L);
            return M(iA, 1, 1).d(jR, (InterfaceC3679) EnumC8618.MONTHS).d(AbstractC22791.R(((Long) map.remove(EnumC18496.DAY_OF_MONTH)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
        }
        EnumC18496 enumC18497 = EnumC18496.MONTH_OF_YEAR;
        int iA2 = v(enumC18497).a(((Long) map.remove(enumC18497)).longValue(), enumC18497);
        EnumC18496 enumC18498 = EnumC18496.DAY_OF_MONTH;
        int iA3 = v(enumC18498).a(((Long) map.remove(enumC18498)).longValue(), enumC18498);
        if (enumC17126 != EnumC17126.SMART) {
            return M(iA, iA2, iA3);
        }
        try {
            return M(iA, iA2, iA3);
        } catch (C16232 unused) {
            return M(iA, iA2, 1).m(new C8556(3));
        }
    }

    public static InterfaceC13410 s(InterfaceC13410 interfaceC13410, long j, long j2, long j3) {
        long j4;
        InterfaceC13410 interfaceC13410D = interfaceC13410.d(j, (InterfaceC3679) EnumC8618.MONTHS);
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC13410 interfaceC13410D2 = interfaceC13410D.d(j2, (InterfaceC3679) enumC8618);
        if (j3 > 7) {
            long j5 = j3 - 1;
            interfaceC13410D2 = interfaceC13410D2.d(j5 / 7, (InterfaceC3679) enumC8618);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                interfaceC13410D2 = interfaceC13410D2.d(AbstractC22791.R(j3, 7L) / 7, (InterfaceC3679) enumC8618);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC13410D2.m(new C12851(EnumC21878.V((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return interfaceC13410D2.m(new C12851(EnumC21878.V((int) j3).getValue(), 0));
    }

    public static void l(Map map, EnumC18496 enumC18496, long j) {
        Long l2 = (Long) map.get(enumC18496);
        if (l2 != null && l2.longValue() != j) {
            throw new C16232("Conflict found: " + enumC18496 + " " + l2 + " differs from " + enumC18496 + " " + j);
        }
        map.put(enumC18496, Long.valueOf(j));
    }

    @Override // l.InterfaceC2765
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC4944) && k().compareTo(((AbstractC4944) obj).k()) == 0;
    }

    @Override // l.InterfaceC2765
    public final int hashCode() {
        return getClass().hashCode() ^ k().hashCode();
    }

    @Override // l.InterfaceC2765
    public final String toString() {
        return k();
    }
}
