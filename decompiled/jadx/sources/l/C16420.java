package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16420 implements InterfaceC2268 {
    public AbstractC5650 b;
    public InterfaceC2765 c;
    public boolean d;
    public EnumC17126 e;
    public InterfaceC13410 f;
    public C7248 g;
    public final Map a = new HashMap();
    public C6501 h = C6501.d;

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (((HashMap) this.a).containsKey(interfaceC10030)) {
            return true;
        }
        InterfaceC13410 interfaceC13410 = this.f;
        if (interfaceC13410 != null && interfaceC13410.e(interfaceC10030)) {
            return true;
        }
        C7248 c7248 = this.g;
        if (c7248 == null || !c7248.e(interfaceC10030)) {
            return (interfaceC10030 == null || (interfaceC10030 instanceof EnumC18496) || !interfaceC10030.l(this)) ? false : true;
        }
        return true;
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        C11003.requireNonNull(interfaceC10030, "field");
        Long l2 = (Long) ((HashMap) this.a).get(interfaceC10030);
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC13410 interfaceC13410 = this.f;
        if (interfaceC13410 != null && interfaceC13410.e(interfaceC10030)) {
            return this.f.G(interfaceC10030);
        }
        C7248 c7248 = this.g;
        if (c7248 != null && c7248.e(interfaceC10030)) {
            return this.g.G(interfaceC10030);
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.a) {
            return this.b;
        }
        if (c8556 == AbstractC5796.b) {
            return this.c;
        }
        if (c8556 == AbstractC5796.f) {
            InterfaceC13410 interfaceC13410 = this.f;
            if (interfaceC13410 != null) {
                return C19056.X(interfaceC13410);
            }
            return null;
        }
        if (c8556 == AbstractC5796.g) {
            return this.g;
        }
        if (c8556 == AbstractC5796.d) {
            Long l2 = (Long) ((HashMap) this.a).get(EnumC18496.OFFSET_SECONDS);
            if (l2 != null) {
                return C18078.e0(l2.intValue());
            }
            AbstractC5650 abstractC5650 = this.b;
            return abstractC5650 instanceof C18078 ? abstractC5650 : c8556.h(this);
        }
        if (c8556 == AbstractC5796.e) {
            return c8556.h(this);
        }
        if (c8556 == AbstractC5796.c) {
            return null;
        }
        return c8556.h(this);
    }

    public final void x(InterfaceC10030 interfaceC10030, EnumC18496 enumC18496, Long l2) {
        Long l3 = (Long) ((HashMap) this.a).put(enumC18496, l2);
        if (l3 == null || l3.longValue() == l2.longValue()) {
            return;
        }
        throw new C16232("Conflict found: " + enumC18496 + " " + l3 + " differs from " + enumC18496 + " " + l2 + " while resolving  " + interfaceC10030);
    }

    public final void k() {
        if (((HashMap) this.a).containsKey(EnumC18496.INSTANT_SECONDS)) {
            AbstractC5650 abstractC5650 = this.b;
            if (abstractC5650 != null) {
                o(abstractC5650);
                return;
            }
            Long l2 = (Long) ((HashMap) this.a).get(EnumC18496.OFFSET_SECONDS);
            if (l2 != null) {
                o(C18078.e0(l2.intValue()));
            }
        }
    }

    public final void o(AbstractC5650 abstractC5650) {
        Map map = this.a;
        EnumC18496 enumC18496 = EnumC18496.INSTANT_SECONDS;
        InterfaceC22583 interfaceC22583P = this.c.P(C4239.ofEpochSecond(((Long) ((HashMap) map).remove(enumC18496)).longValue()), abstractC5650);
        v(interfaceC22583P.f());
        x(enumC18496, EnumC18496.SECOND_OF_DAY, Long.valueOf(interfaceC22583P.b().i0()));
    }

    public final void v(InterfaceC13410 interfaceC13410) {
        InterfaceC13410 interfaceC13411 = this.f;
        if (interfaceC13411 != null) {
            if (interfaceC13410 == null || interfaceC13411.equals(interfaceC13410)) {
                return;
            }
            throw new C16232("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC13410);
        }
        if (interfaceC13410 != null) {
            if (!this.c.equals(interfaceC13410.a())) {
                throw new C16232("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = interfaceC13410;
        }
    }

    public final void q() {
        Map map = this.a;
        EnumC18496 enumC18496 = EnumC18496.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(enumC18496)) {
            long jLongValue = ((Long) ((HashMap) this.a).remove(enumC18496)).longValue();
            EnumC17126 enumC17126 = this.e;
            if (enumC17126 == EnumC17126.STRICT || (enumC17126 == EnumC17126.SMART && jLongValue != 0)) {
                enumC18496.T(jLongValue);
            }
            EnumC18496 enumC18497 = EnumC18496.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            x(enumC18496, enumC18497, Long.valueOf(jLongValue));
        }
        Map map2 = this.a;
        EnumC18496 enumC18498 = EnumC18496.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(enumC18498)) {
            long jLongValue2 = ((Long) ((HashMap) this.a).remove(enumC18498)).longValue();
            EnumC17126 enumC17127 = this.e;
            if (enumC17127 == EnumC17126.STRICT || (enumC17127 == EnumC17126.SMART && jLongValue2 != 0)) {
                enumC18498.T(jLongValue2);
            }
            x(enumC18498, EnumC18496.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.a;
        EnumC18496 enumC18499 = EnumC18496.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(enumC18499)) {
            Map map4 = this.a;
            EnumC18496 enumC184910 = EnumC18496.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(enumC184910)) {
                long jLongValue3 = ((Long) ((HashMap) this.a).remove(enumC18499)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.a).remove(enumC184910)).longValue();
                if (this.e == EnumC17126.LENIENT) {
                    x(enumC18499, EnumC18496.HOUR_OF_DAY, Long.valueOf(AbstractC22791.P(AbstractC22791.Q(jLongValue3, 12), jLongValue4)));
                } else {
                    enumC18499.T(jLongValue3);
                    enumC184910.T(jLongValue3);
                    x(enumC18499, EnumC18496.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.a;
        EnumC18496 enumC184911 = EnumC18496.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(enumC184911)) {
            long jLongValue5 = ((Long) ((HashMap) this.a).remove(enumC184911)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184911.T(jLongValue5);
            }
            x(enumC184911, EnumC18496.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            x(enumC184911, EnumC18496.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            x(enumC184911, EnumC18496.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            x(enumC184911, EnumC18496.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.a;
        EnumC18496 enumC184912 = EnumC18496.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(enumC184912)) {
            long jLongValue6 = ((Long) ((HashMap) this.a).remove(enumC184912)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184912.T(jLongValue6);
            }
            x(enumC184912, EnumC18496.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            x(enumC184912, EnumC18496.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.a;
        EnumC18496 enumC184913 = EnumC18496.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(enumC184913)) {
            long jLongValue7 = ((Long) ((HashMap) this.a).remove(enumC184913)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184913.T(jLongValue7);
            }
            x(enumC184913, EnumC18496.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            x(enumC184913, EnumC18496.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.a;
        EnumC18496 enumC184914 = EnumC18496.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(enumC184914)) {
            long jLongValue8 = ((Long) ((HashMap) this.a).remove(enumC184914)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184914.T(jLongValue8);
            }
            x(enumC184914, EnumC18496.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            x(enumC184914, EnumC18496.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            x(enumC184914, EnumC18496.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.a;
        EnumC18496 enumC184915 = EnumC18496.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(enumC184915)) {
            long jLongValue9 = ((Long) ((HashMap) this.a).remove(enumC184915)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184915.T(jLongValue9);
            }
            x(enumC184915, EnumC18496.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            x(enumC184915, EnumC18496.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.a;
        EnumC18496 enumC184916 = EnumC18496.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(enumC184916)) {
            long jLongValue10 = ((Long) ((HashMap) this.a).get(enumC184916)).longValue();
            EnumC17126 enumC17128 = this.e;
            EnumC17126 enumC17129 = EnumC17126.LENIENT;
            if (enumC17128 != enumC17129) {
                enumC184916.T(jLongValue10);
            }
            Map map11 = this.a;
            EnumC18496 enumC184917 = EnumC18496.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(enumC184917)) {
                long jLongValue11 = ((Long) ((HashMap) this.a).remove(enumC184917)).longValue();
                if (this.e != enumC17129) {
                    enumC184917.T(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                x(enumC184917, enumC184916, Long.valueOf(jLongValue10));
            }
            Map map12 = this.a;
            EnumC18496 enumC184918 = EnumC18496.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(enumC184918)) {
                long jLongValue12 = ((Long) ((HashMap) this.a).remove(enumC184918)).longValue();
                if (this.e != enumC17129) {
                    enumC184918.T(jLongValue12);
                }
                x(enumC184918, enumC184916, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        EnumC18496 enumC184919 = EnumC18496.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(enumC184919)) {
            Map map14 = this.a;
            EnumC18496 enumC184920 = EnumC18496.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(enumC184920)) {
                Map map15 = this.a;
                EnumC18496 enumC184921 = EnumC18496.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(enumC184921) && ((HashMap) this.a).containsKey(enumC184916)) {
                    p(((Long) ((HashMap) this.a).remove(enumC184919)).longValue(), ((Long) ((HashMap) this.a).remove(enumC184920)).longValue(), ((Long) ((HashMap) this.a).remove(enumC184921)).longValue(), ((Long) ((HashMap) this.a).remove(enumC184916)).longValue());
                }
            }
        }
    }

    public final void p(long j, long j2, long j3, long j4) {
        if (this.e == EnumC17126.LENIENT) {
            long jP = AbstractC22791.P(AbstractC22791.P(AbstractC22791.P(AbstractC22791.Q(j, 3600000000000L), AbstractC22791.Q(j2, 60000000000L)), AbstractC22791.Q(j3, 1000000000L)), j4);
            s(C7248.a0(AbstractC22791.O(jP, 86400000000000L)), C6501.a(0, 0, (int) AbstractC22791.z(jP, 86400000000000L)));
            return;
        }
        EnumC18496 enumC18496 = EnumC18496.MINUTE_OF_HOUR;
        int iA = enumC18496.b.a(j2, enumC18496);
        EnumC18496 enumC18497 = EnumC18496.NANO_OF_SECOND;
        int iA2 = enumC18497.b.a(j4, enumC18497);
        if (this.e == EnumC17126.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            s(C7248.g, C6501.a(0, 0, 1));
            return;
        }
        EnumC18496 enumC18498 = EnumC18496.HOUR_OF_DAY;
        int iA3 = enumC18498.b.a(j, enumC18498);
        EnumC18496 enumC18499 = EnumC18496.SECOND_OF_MINUTE;
        s(C7248.Z(iA3, iA, enumC18499.b.a(j3, enumC18499), iA2), C6501.d);
    }

    public final void s(C7248 c7248, C6501 c6501) {
        C7248 c7249 = this.g;
        if (c7249 != null) {
            if (!c7249.equals(c7248)) {
                throw new C16232("Conflict found: Fields resolved to different times: " + this.g + " " + c7248);
            }
            C6501 c6502 = this.h;
            c6502.getClass();
            C6501 c6503 = C6501.d;
            if (c6502 != c6503 && c6501 != c6503 && !this.h.equals(c6501)) {
                throw new C16232("Conflict found: Fields resolved to different excess periods: " + this.h + " " + c6501);
            }
            this.h = c6501;
            return;
        }
        this.g = c7248;
        this.h = c6501;
    }

    public final void j(InterfaceC2268 interfaceC2268) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC10030 interfaceC10030 = (InterfaceC10030) entry.getKey();
            if (interfaceC2268.e(interfaceC10030)) {
                try {
                    long jG = interfaceC2268.G(interfaceC10030);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jG != jLongValue) {
                        throw new C16232("Conflict found: Field " + interfaceC10030 + " " + jG + " differs from " + interfaceC10030 + " " + jLongValue + " derived from " + interfaceC2268);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC13410 interfaceC13410 = this.f;
            if (interfaceC13410 != null) {
                sb.append(interfaceC13410);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
