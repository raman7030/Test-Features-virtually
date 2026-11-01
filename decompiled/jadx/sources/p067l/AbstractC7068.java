package p067l;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7068 implements InterfaceC4997 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMapC12768 f18414a = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMapC12768 f18415b = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: m */
    public abstract /* synthetic */ InterfaceC15114 mo12725m();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return mo10584k().compareTo(((InterfaceC4997) obj).mo10584k());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC4997 m16285n(InterfaceC4997 interfaceC4997, String str) {
        String strMo10585o;
        InterfaceC4997 interfaceC4998 = (InterfaceC4997) f18414a.putIfAbsent(str, interfaceC4997);
        if (interfaceC4998 == null && (strMo10585o = interfaceC4997.mo10585o()) != null) {
            f18415b.putIfAbsent(strMo10585o, interfaceC4997);
        }
        return interfaceC4998;
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: O */
    public InterfaceC15114 mo10580O(Map map, EnumC18645 enumC18645) {
        EnumC19947 enumC19947 = EnumC19947.EPOCH_DAY;
        if (map.containsKey(enumC19947)) {
            return mo10583j(((Long) map.remove(enumC19947)).longValue());
        }
        mo16287C(map, enumC18645);
        InterfaceC15114 interfaceC15114Mo16289T = mo16289T(map, enumC18645);
        if (interfaceC15114Mo16289T != null) {
            return interfaceC15114Mo16289T;
        }
        EnumC19947 enumC19948 = EnumC19947.YEAR;
        if (!map.containsKey(enumC19948)) {
            return null;
        }
        EnumC19947 enumC19949 = EnumC19947.MONTH_OF_YEAR;
        if (map.containsKey(enumC19949)) {
            if (map.containsKey(EnumC19947.DAY_OF_MONTH)) {
                return mo16288G(map, enumC18645);
            }
            EnumC19947 enumC199410 = EnumC19947.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC199410)) {
                EnumC19947 enumC199411 = EnumC19947.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(enumC199411)) {
                    EnumC19947 enumC199412 = EnumC19947.DAY_OF_WEEK;
                    if (map.containsKey(enumC199412)) {
                        int iM53121a = mo10588v(enumC19948).m53121a(((Long) map.remove(enumC19948)).longValue(), enumC19948);
                        if (enumC18645 == EnumC18645.LENIENT) {
                            return m16286s(mo10579M(iM53121a, 1, 1), AbstractC24029.m53228R(((Long) map.remove(enumC19949)).longValue(), 1L), AbstractC24029.m53228R(((Long) map.remove(enumC199410)).longValue(), 1L), AbstractC24029.m53228R(((Long) map.remove(enumC199412)).longValue(), 1L));
                        }
                        int iM53121a2 = mo10588v(enumC19949).m53121a(((Long) map.remove(enumC19949)).longValue(), enumC19949);
                        InterfaceC15114 interfaceC15114Mo7158m = mo10579M(iM53121a, iM53121a2, 1).mo7153d((mo10588v(enumC199410).m53121a(((Long) map.remove(enumC199410)).longValue(), enumC199410) - 1) * 7, (InterfaceC5865) EnumC10559.DAYS).mo7158m(new C14582(EnumC23162.m51623V(mo10588v(enumC199412).m53121a(((Long) map.remove(enumC199412)).longValue(), enumC199412)).getValue(), 0));
                        if (enumC18645 != EnumC18645.STRICT || interfaceC15114Mo7158m.mo6952l(enumC19949) == iM53121a2) {
                            return interfaceC15114Mo7158m;
                        }
                        throw new C17796("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iM53121a3 = mo10588v(enumC19948).m53121a(((Long) map.remove(enumC19948)).longValue(), enumC19948);
                    if (enumC18645 == EnumC18645.LENIENT) {
                        long jM53228R = AbstractC24029.m53228R(((Long) map.remove(enumC19949)).longValue(), 1L);
                        return mo10579M(iM53121a3, 1, 1).mo7153d(jM53228R, (InterfaceC5865) EnumC10559.MONTHS).mo7153d(AbstractC24029.m53228R(((Long) map.remove(enumC199410)).longValue(), 1L), (InterfaceC5865) EnumC10559.WEEKS).mo7153d(AbstractC24029.m53228R(((Long) map.remove(enumC199411)).longValue(), 1L), (InterfaceC5865) EnumC10559.DAYS);
                    }
                    int iM53121a4 = mo10588v(enumC19949).m53121a(((Long) map.remove(enumC19949)).longValue(), enumC19949);
                    InterfaceC15114 interfaceC15114Mo7153d = mo10579M(iM53121a3, iM53121a4, 1).mo7153d((mo10588v(enumC199411).m53121a(((Long) map.remove(enumC199411)).longValue(), enumC199411) - 1) + ((mo10588v(enumC199410).m53121a(((Long) map.remove(enumC199410)).longValue(), enumC199410) - 1) * 7), (InterfaceC5865) EnumC10559.DAYS);
                    if (enumC18645 != EnumC18645.STRICT || interfaceC15114Mo7153d.mo6952l(enumC19949) == iM53121a4) {
                        return interfaceC15114Mo7153d;
                    }
                    throw new C17796("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC19947 enumC199413 = EnumC19947.DAY_OF_YEAR;
        if (!map.containsKey(enumC199413)) {
            EnumC19947 enumC199414 = EnumC19947.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(enumC199414)) {
                return null;
            }
            EnumC19947 enumC199415 = EnumC19947.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(enumC199415)) {
                EnumC19947 enumC199416 = EnumC19947.DAY_OF_WEEK;
                if (!map.containsKey(enumC199416)) {
                    return null;
                }
                int iM53121a5 = mo10588v(enumC19948).m53121a(((Long) map.remove(enumC19948)).longValue(), enumC19948);
                if (enumC18645 == EnumC18645.LENIENT) {
                    return m16286s(mo10587q(iM53121a5, 1), 0L, AbstractC24029.m53228R(((Long) map.remove(enumC199414)).longValue(), 1L), AbstractC24029.m53228R(((Long) map.remove(enumC199416)).longValue(), 1L));
                }
                InterfaceC15114 interfaceC15114Mo7158m2 = mo10587q(iM53121a5, 1).mo7153d((mo10588v(enumC199414).m53121a(((Long) map.remove(enumC199414)).longValue(), enumC199414) - 1) * 7, (InterfaceC5865) EnumC10559.DAYS).mo7158m(new C14582(EnumC23162.m51623V(mo10588v(enumC199416).m53121a(((Long) map.remove(enumC199416)).longValue(), enumC199416)).getValue(), 0));
                if (enumC18645 != EnumC18645.STRICT || interfaceC15114Mo7158m2.mo6952l(enumC19948) == iM53121a5) {
                    return interfaceC15114Mo7158m2;
                }
                throw new C17796("Strict mode rejected resolved date as it is in a different year");
            }
            int iM53121a6 = mo10588v(enumC19948).m53121a(((Long) map.remove(enumC19948)).longValue(), enumC19948);
            if (enumC18645 == EnumC18645.LENIENT) {
                return mo10587q(iM53121a6, 1).mo7153d(AbstractC24029.m53228R(((Long) map.remove(enumC199414)).longValue(), 1L), (InterfaceC5865) EnumC10559.WEEKS).mo7153d(AbstractC24029.m53228R(((Long) map.remove(enumC199415)).longValue(), 1L), (InterfaceC5865) EnumC10559.DAYS);
            }
            InterfaceC15114 interfaceC15114Mo7153d2 = mo10587q(iM53121a6, 1).mo7153d((mo10588v(enumC199415).m53121a(((Long) map.remove(enumC199415)).longValue(), enumC199415) - 1) + ((mo10588v(enumC199414).m53121a(((Long) map.remove(enumC199414)).longValue(), enumC199414) - 1) * 7), (InterfaceC5865) EnumC10559.DAYS);
            if (enumC18645 != EnumC18645.STRICT || interfaceC15114Mo7153d2.mo6952l(enumC19948) == iM53121a6) {
                return interfaceC15114Mo7153d2;
            }
            throw new C17796("Strict mode rejected resolved date as it is in a different year");
        }
        int iM53121a7 = mo10588v(enumC19948).m53121a(((Long) map.remove(enumC19948)).longValue(), enumC19948);
        if (enumC18645 == EnumC18645.LENIENT) {
            return mo10587q(iM53121a7, 1).mo7153d(AbstractC24029.m53228R(((Long) map.remove(enumC199413)).longValue(), 1L), (InterfaceC5865) EnumC10559.DAYS);
        }
        return mo10587q(iM53121a7, mo10588v(enumC199413).m53121a(((Long) map.remove(enumC199413)).longValue(), enumC199413));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: J */
    public InterfaceC15784 mo10578J(InterfaceC4524 interfaceC4524) {
        try {
            return mo10577E(interfaceC4524).mo16119I(C9257.m21345X(interfaceC4524));
        } catch (C17796 e) {
            throw new C17796("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC4524.getClass(), e);
        }
    }

    /* JADX INFO: renamed from: C */
    public void mo16287C(Map map, EnumC18645 enumC18645) {
        EnumC19947 enumC19947 = EnumC19947.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC19947);
        if (l2 != null) {
            if (enumC18645 != EnumC18645.LENIENT) {
                enumC19947.m45273T(l2.longValue());
            }
            InterfaceC15114 interfaceC15114Mo7152c = mo12725m().mo7152c(1L, (InterfaceC11901) EnumC19947.DAY_OF_MONTH).mo7152c(l2.longValue(), (InterfaceC11901) enumC19947);
            EnumC19947 enumC19948 = EnumC19947.MONTH_OF_YEAR;
            m16284l(map, enumC19948, interfaceC15114Mo7152c.mo6952l(enumC19948));
            EnumC19947 enumC19949 = EnumC19947.YEAR;
            m16284l(map, enumC19949, interfaceC15114Mo7152c.mo6952l(enumC19949));
        }
    }

    /* JADX INFO: renamed from: T */
    public InterfaceC15114 mo16289T(Map map, EnumC18645 enumC18645) {
        int iM53256y;
        EnumC19947 enumC19947 = EnumC19947.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC19947);
        if (l2 != null) {
            EnumC19947 enumC19948 = EnumC19947.ERA;
            Long l3 = (Long) map.remove(enumC19948);
            if (enumC18645 != EnumC18645.LENIENT) {
                iM53256y = mo10588v(enumC19947).m53121a(l2.longValue(), enumC19947);
            } else {
                iM53256y = AbstractC24029.m53256y(l2.longValue());
            }
            if (l3 != null) {
                m16284l(map, EnumC19947.YEAR, mo10591z(mo10590y(mo10588v(enumC19948).m53121a(l3.longValue(), enumC19948)), iM53256y));
                return null;
            }
            EnumC19947 enumC19949 = EnumC19947.YEAR;
            if (map.containsKey(enumC19949)) {
                m16284l(map, enumC19949, mo10591z(mo10587q(mo10588v(enumC19949).m53121a(((Long) map.get(enumC19949)).longValue(), enumC19949), 1).mo16120K(), iM53256y));
                return null;
            }
            if (enumC18645 == EnumC18645.STRICT) {
                map.put(enumC19947, l2);
                return null;
            }
            List listMo10589x = mo10589x();
            if (listMo10589x.isEmpty()) {
                m16284l(map, enumC19949, iM53256y);
                return null;
            }
            m16284l(map, enumC19949, mo10591z((InterfaceC6338) listMo10589x.get(listMo10589x.size() - 1), iM53256y));
            return null;
        }
        EnumC19947 enumC199410 = EnumC19947.ERA;
        if (!map.containsKey(enumC199410)) {
            return null;
        }
        mo10588v(enumC199410).m53122b(((Long) map.get(enumC199410)).longValue(), enumC199410);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.᩹᩹ᩴ] */
    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: p */
    public InterfaceC23832 mo10586p(InterfaceC4524 interfaceC4524) {
        try {
            AbstractC7739 abstractC7739M17860V = AbstractC7739.m17860V(interfaceC4524);
            try {
                interfaceC4524 = mo10581P(C6398.m14641W(interfaceC4524), abstractC7739M17860V);
                return interfaceC4524;
            } catch (C17796 unused) {
                return C11032.m25440V(abstractC7739M17860V, null, C18407.m41908V(this, mo10578J(interfaceC4524)));
            }
        } catch (C17796 e) {
            throw new C17796("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC4524.getClass(), e);
        }
    }

    /* JADX INFO: renamed from: G */
    public InterfaceC15114 mo16288G(Map map, EnumC18645 enumC18645) {
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        int iM53121a = mo10588v(enumC19947).m53121a(((Long) map.remove(enumC19947)).longValue(), enumC19947);
        if (enumC18645 == EnumC18645.LENIENT) {
            long jM53228R = AbstractC24029.m53228R(((Long) map.remove(EnumC19947.MONTH_OF_YEAR)).longValue(), 1L);
            return mo10579M(iM53121a, 1, 1).mo7153d(jM53228R, (InterfaceC5865) EnumC10559.MONTHS).mo7153d(AbstractC24029.m53228R(((Long) map.remove(EnumC19947.DAY_OF_MONTH)).longValue(), 1L), (InterfaceC5865) EnumC10559.DAYS);
        }
        EnumC19947 enumC19948 = EnumC19947.MONTH_OF_YEAR;
        int iM53121a2 = mo10588v(enumC19948).m53121a(((Long) map.remove(enumC19948)).longValue(), enumC19948);
        EnumC19947 enumC19949 = EnumC19947.DAY_OF_MONTH;
        int iM53121a3 = mo10588v(enumC19949).m53121a(((Long) map.remove(enumC19949)).longValue(), enumC19949);
        if (enumC18645 != EnumC18645.SMART) {
            return mo10579M(iM53121a, iM53121a2, iM53121a3);
        }
        try {
            return mo10579M(iM53121a, iM53121a2, iM53121a3);
        } catch (C17796 unused) {
            return mo10579M(iM53121a, iM53121a2, 1).mo7158m(new C10500(3));
        }
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC15114 m16286s(InterfaceC15114 interfaceC15114, long j, long j2, long j3) {
        long j4;
        InterfaceC15114 interfaceC15114Mo7153d = interfaceC15114.mo7153d(j, (InterfaceC5865) EnumC10559.MONTHS);
        EnumC10559 enumC10559 = EnumC10559.WEEKS;
        InterfaceC15114 interfaceC15114Mo7153d2 = interfaceC15114Mo7153d.mo7153d(j2, (InterfaceC5865) enumC10559);
        if (j3 > 7) {
            long j5 = j3 - 1;
            interfaceC15114Mo7153d2 = interfaceC15114Mo7153d2.mo7153d(j5 / 7, (InterfaceC5865) enumC10559);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                interfaceC15114Mo7153d2 = interfaceC15114Mo7153d2.mo7153d(AbstractC24029.m53228R(j3, 7L) / 7, (InterfaceC5865) enumC10559);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC15114Mo7153d2.mo7158m(new C14582(EnumC23162.m51623V((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return interfaceC15114Mo7153d2.mo7158m(new C14582(EnumC23162.m51623V((int) j3).getValue(), 0));
    }

    /* JADX INFO: renamed from: l */
    public static void m16284l(Map map, EnumC19947 enumC19947, long j) {
        Long l2 = (Long) map.get(enumC19947);
        if (l2 != null && l2.longValue() != j) {
            throw new C17796("Conflict found: " + enumC19947 + " " + l2 + " differs from " + enumC19947 + " " + j);
        }
        map.put(enumC19947, Long.valueOf(j));
    }

    @Override // p067l.InterfaceC4997
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC7068) && mo10584k().compareTo(((AbstractC7068) obj).mo10584k()) == 0;
    }

    @Override // p067l.InterfaceC4997
    public final int hashCode() {
        return getClass().hashCode() ^ mo10584k().hashCode();
    }

    @Override // p067l.InterfaceC4997
    public final String toString() {
        return mo10584k();
    }
}
