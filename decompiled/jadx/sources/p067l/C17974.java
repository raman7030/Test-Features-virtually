package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17974 implements InterfaceC4524 {

    /* JADX INFO: renamed from: b */
    public AbstractC7739 f53682b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4997 f53683c;

    /* JADX INFO: renamed from: d */
    public boolean f53684d;

    /* JADX INFO: renamed from: e */
    public EnumC18645 f53685e;

    /* JADX INFO: renamed from: f */
    public InterfaceC15114 f53686f;

    /* JADX INFO: renamed from: g */
    public C9257 f53687g;

    /* JADX INFO: renamed from: a */
    public final Map f53681a = new HashMap();

    /* JADX INFO: renamed from: h */
    public C8547 f53688h = C8547.f22959d;

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (((HashMap) this.f53681a).containsKey(interfaceC11901)) {
            return true;
        }
        InterfaceC15114 interfaceC15114 = this.f53686f;
        if (interfaceC15114 != null && interfaceC15114.mo6951e(interfaceC11901)) {
            return true;
        }
        C9257 c9257 = this.f53687g;
        if (c9257 == null || !c9257.mo6951e(interfaceC11901)) {
            return (interfaceC11901 == null || (interfaceC11901 instanceof EnumC19947) || !interfaceC11901.mo3654l(this)) ? false : true;
        }
        return true;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        C12826.requireNonNull(interfaceC11901, "field");
        Long l2 = (Long) ((HashMap) this.f53681a).get(interfaceC11901);
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC15114 interfaceC15114 = this.f53686f;
        if (interfaceC15114 != null && interfaceC15114.mo6951e(interfaceC11901)) {
            return this.f53686f.mo6949G(interfaceC11901);
        }
        C9257 c9257 = this.f53687g;
        if (c9257 != null && c9257.mo6951e(interfaceC11901)) {
            return this.f53687g.mo6949G(interfaceC11901);
        }
        if (interfaceC11901 instanceof EnumC19947) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        return interfaceC11901.mo3652C(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20679a) {
            return this.f53682b;
        }
        if (c10500 == AbstractC7877.f20680b) {
            return this.f53683c;
        }
        if (c10500 == AbstractC7877.f20684f) {
            InterfaceC15114 interfaceC15114 = this.f53686f;
            if (interfaceC15114 != null) {
                return C20480.m46185X(interfaceC15114);
            }
            return null;
        }
        if (c10500 == AbstractC7877.f20685g) {
            return this.f53687g;
        }
        if (c10500 == AbstractC7877.f20682d) {
            Long l2 = (Long) ((HashMap) this.f53681a).get(EnumC19947.OFFSET_SECONDS);
            if (l2 != null) {
                return C19550.m44395e0(l2.intValue());
            }
            AbstractC7739 abstractC7739 = this.f53682b;
            return abstractC7739 instanceof C19550 ? abstractC7739 : c10500.m24242h(this);
        }
        if (c10500 == AbstractC7877.f20683e) {
            return c10500.m24242h(this);
        }
        if (c10500 == AbstractC7877.f20681c) {
            return null;
        }
        return c10500.m24242h(this);
    }

    /* JADX INFO: renamed from: x */
    public final void m40918x(InterfaceC11901 interfaceC11901, EnumC19947 enumC19947, Long l2) {
        Long l3 = (Long) ((HashMap) this.f53681a).put(enumC19947, l2);
        if (l3 == null || l3.longValue() == l2.longValue()) {
            return;
        }
        throw new C17796("Conflict found: " + enumC19947 + " " + l3 + " differs from " + enumC19947 + " " + l2 + " while resolving  " + interfaceC11901);
    }

    /* JADX INFO: renamed from: k */
    public final void m40912k() {
        if (((HashMap) this.f53681a).containsKey(EnumC19947.INSTANT_SECONDS)) {
            AbstractC7739 abstractC7739 = this.f53682b;
            if (abstractC7739 != null) {
                m40913o(abstractC7739);
                return;
            }
            Long l2 = (Long) ((HashMap) this.f53681a).get(EnumC19947.OFFSET_SECONDS);
            if (l2 != null) {
                m40913o(C19550.m44395e0(l2.intValue()));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m40913o(AbstractC7739 abstractC7739) {
        Map map = this.f53681a;
        EnumC19947 enumC19947 = EnumC19947.INSTANT_SECONDS;
        InterfaceC23832 interfaceC23832Mo10581P = this.f53683c.mo10581P(C6398.ofEpochSecond(((Long) ((HashMap) map).remove(enumC19947)).longValue()), abstractC7739);
        m40917v(interfaceC23832Mo10581P.mo7154f());
        m40918x(enumC19947, EnumC19947.SECOND_OF_DAY, Long.valueOf(interfaceC23832Mo10581P.mo7151b().m21357i0()));
    }

    /* JADX INFO: renamed from: v */
    public final void m40917v(InterfaceC15114 interfaceC15114) {
        InterfaceC15114 interfaceC15115 = this.f53686f;
        if (interfaceC15115 != null) {
            if (interfaceC15114 == null || interfaceC15115.equals(interfaceC15114)) {
                return;
            }
            throw new C17796("Conflict found: Fields resolved to two different dates: " + this.f53686f + " " + interfaceC15114);
        }
        if (interfaceC15114 != null) {
            if (!this.f53683c.equals(interfaceC15114.mo16126a())) {
                throw new C17796("ChronoLocalDate must use the effective parsed chronology: " + this.f53683c);
            }
            this.f53686f = interfaceC15114;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m40915q() {
        Map map = this.f53681a;
        EnumC19947 enumC19947 = EnumC19947.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(enumC19947)) {
            long jLongValue = ((Long) ((HashMap) this.f53681a).remove(enumC19947)).longValue();
            EnumC18645 enumC18645 = this.f53685e;
            if (enumC18645 == EnumC18645.STRICT || (enumC18645 == EnumC18645.SMART && jLongValue != 0)) {
                enumC19947.m45273T(jLongValue);
            }
            EnumC19947 enumC19948 = EnumC19947.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            m40918x(enumC19947, enumC19948, Long.valueOf(jLongValue));
        }
        Map map2 = this.f53681a;
        EnumC19947 enumC19949 = EnumC19947.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(enumC19949)) {
            long jLongValue2 = ((Long) ((HashMap) this.f53681a).remove(enumC19949)).longValue();
            EnumC18645 enumC18646 = this.f53685e;
            if (enumC18646 == EnumC18645.STRICT || (enumC18646 == EnumC18645.SMART && jLongValue2 != 0)) {
                enumC19949.m45273T(jLongValue2);
            }
            m40918x(enumC19949, EnumC19947.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f53681a;
        EnumC19947 enumC199410 = EnumC19947.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(enumC199410)) {
            Map map4 = this.f53681a;
            EnumC19947 enumC199411 = EnumC19947.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(enumC199411)) {
                long jLongValue3 = ((Long) ((HashMap) this.f53681a).remove(enumC199410)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f53681a).remove(enumC199411)).longValue();
                if (this.f53685e == EnumC18645.LENIENT) {
                    m40918x(enumC199410, EnumC19947.HOUR_OF_DAY, Long.valueOf(AbstractC24029.m53226P(AbstractC24029.m53227Q(jLongValue3, 12), jLongValue4)));
                } else {
                    enumC199410.m45273T(jLongValue3);
                    enumC199411.m45273T(jLongValue3);
                    m40918x(enumC199410, EnumC19947.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f53681a;
        EnumC19947 enumC199412 = EnumC19947.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(enumC199412)) {
            long jLongValue5 = ((Long) ((HashMap) this.f53681a).remove(enumC199412)).longValue();
            if (this.f53685e != EnumC18645.LENIENT) {
                enumC199412.m45273T(jLongValue5);
            }
            m40918x(enumC199412, EnumC19947.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            m40918x(enumC199412, EnumC19947.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            m40918x(enumC199412, EnumC19947.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            m40918x(enumC199412, EnumC19947.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f53681a;
        EnumC19947 enumC199413 = EnumC19947.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(enumC199413)) {
            long jLongValue6 = ((Long) ((HashMap) this.f53681a).remove(enumC199413)).longValue();
            if (this.f53685e != EnumC18645.LENIENT) {
                enumC199413.m45273T(jLongValue6);
            }
            m40918x(enumC199413, EnumC19947.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            m40918x(enumC199413, EnumC19947.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f53681a;
        EnumC19947 enumC199414 = EnumC19947.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(enumC199414)) {
            long jLongValue7 = ((Long) ((HashMap) this.f53681a).remove(enumC199414)).longValue();
            if (this.f53685e != EnumC18645.LENIENT) {
                enumC199414.m45273T(jLongValue7);
            }
            m40918x(enumC199414, EnumC19947.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            m40918x(enumC199414, EnumC19947.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f53681a;
        EnumC19947 enumC199415 = EnumC19947.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(enumC199415)) {
            long jLongValue8 = ((Long) ((HashMap) this.f53681a).remove(enumC199415)).longValue();
            if (this.f53685e != EnumC18645.LENIENT) {
                enumC199415.m45273T(jLongValue8);
            }
            m40918x(enumC199415, EnumC19947.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            m40918x(enumC199415, EnumC19947.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            m40918x(enumC199415, EnumC19947.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f53681a;
        EnumC19947 enumC199416 = EnumC19947.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(enumC199416)) {
            long jLongValue9 = ((Long) ((HashMap) this.f53681a).remove(enumC199416)).longValue();
            if (this.f53685e != EnumC18645.LENIENT) {
                enumC199416.m45273T(jLongValue9);
            }
            m40918x(enumC199416, EnumC19947.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            m40918x(enumC199416, EnumC19947.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f53681a;
        EnumC19947 enumC199417 = EnumC19947.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(enumC199417)) {
            long jLongValue10 = ((Long) ((HashMap) this.f53681a).get(enumC199417)).longValue();
            EnumC18645 enumC18647 = this.f53685e;
            EnumC18645 enumC18648 = EnumC18645.LENIENT;
            if (enumC18647 != enumC18648) {
                enumC199417.m45273T(jLongValue10);
            }
            Map map11 = this.f53681a;
            EnumC19947 enumC199418 = EnumC19947.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(enumC199418)) {
                long jLongValue11 = ((Long) ((HashMap) this.f53681a).remove(enumC199418)).longValue();
                if (this.f53685e != enumC18648) {
                    enumC199418.m45273T(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                m40918x(enumC199418, enumC199417, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f53681a;
            EnumC19947 enumC199419 = EnumC19947.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(enumC199419)) {
                long jLongValue12 = ((Long) ((HashMap) this.f53681a).remove(enumC199419)).longValue();
                if (this.f53685e != enumC18648) {
                    enumC199419.m45273T(jLongValue12);
                }
                m40918x(enumC199419, enumC199417, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f53681a;
        EnumC19947 enumC199420 = EnumC19947.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(enumC199420)) {
            Map map14 = this.f53681a;
            EnumC19947 enumC199421 = EnumC19947.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(enumC199421)) {
                Map map15 = this.f53681a;
                EnumC19947 enumC199422 = EnumC19947.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(enumC199422) && ((HashMap) this.f53681a).containsKey(enumC199417)) {
                    m40914p(((Long) ((HashMap) this.f53681a).remove(enumC199420)).longValue(), ((Long) ((HashMap) this.f53681a).remove(enumC199421)).longValue(), ((Long) ((HashMap) this.f53681a).remove(enumC199422)).longValue(), ((Long) ((HashMap) this.f53681a).remove(enumC199417)).longValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m40914p(long j, long j2, long j3, long j4) {
        if (this.f53685e == EnumC18645.LENIENT) {
            long jM53226P = AbstractC24029.m53226P(AbstractC24029.m53226P(AbstractC24029.m53226P(AbstractC24029.m53227Q(j, 3600000000000L), AbstractC24029.m53227Q(j2, 60000000000L)), AbstractC24029.m53227Q(j3, 1000000000L)), j4);
            m40916s(C9257.m21347a0(AbstractC24029.m53225O(jM53226P, 86400000000000L)), C8547.m19933a(0, 0, (int) AbstractC24029.m53257z(jM53226P, 86400000000000L)));
            return;
        }
        EnumC19947 enumC19947 = EnumC19947.MINUTE_OF_HOUR;
        int iM53121a = enumC19947.f60552b.m53121a(j2, enumC19947);
        EnumC19947 enumC19948 = EnumC19947.NANO_OF_SECOND;
        int iM53121a2 = enumC19948.f60552b.m53121a(j4, enumC19948);
        if (this.f53685e == EnumC18645.SMART && j == 24 && iM53121a == 0 && j3 == 0 && iM53121a2 == 0) {
            m40916s(C9257.f25131g, C8547.m19933a(0, 0, 1));
            return;
        }
        EnumC19947 enumC19949 = EnumC19947.HOUR_OF_DAY;
        int iM53121a3 = enumC19949.f60552b.m53121a(j, enumC19949);
        EnumC19947 enumC199410 = EnumC19947.SECOND_OF_MINUTE;
        m40916s(C9257.m21346Z(iM53121a3, iM53121a, enumC199410.f60552b.m53121a(j3, enumC199410), iM53121a2), C8547.f22959d);
    }

    /* JADX INFO: renamed from: s */
    public final void m40916s(C9257 c9257, C8547 c8547) {
        C9257 c9258 = this.f53687g;
        if (c9258 != null) {
            if (!c9258.equals(c9257)) {
                throw new C17796("Conflict found: Fields resolved to different times: " + this.f53687g + " " + c9257);
            }
            C8547 c8548 = this.f53688h;
            c8548.getClass();
            C8547 c8549 = C8547.f22959d;
            if (c8548 != c8549 && c8547 != c8549 && !this.f53688h.equals(c8547)) {
                throw new C17796("Conflict found: Fields resolved to different excess periods: " + this.f53688h + " " + c8547);
            }
            this.f53688h = c8547;
            return;
        }
        this.f53687g = c9257;
        this.f53688h = c8547;
    }

    /* JADX INFO: renamed from: j */
    public final void m40911j(InterfaceC4524 interfaceC4524) {
        Iterator it = ((HashMap) this.f53681a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC11901 interfaceC11901 = (InterfaceC11901) entry.getKey();
            if (interfaceC4524.mo6951e(interfaceC11901)) {
                try {
                    long jMo6949G = interfaceC4524.mo6949G(interfaceC11901);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jMo6949G != jLongValue) {
                        throw new C17796("Conflict found: Field " + interfaceC11901 + " " + jMo6949G + " differs from " + interfaceC11901 + " " + jLongValue + " derived from " + interfaceC4524);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f53681a);
        sb.append(',');
        sb.append(this.f53683c);
        if (this.f53682b != null) {
            sb.append(',');
            sb.append(this.f53682b);
        }
        if (this.f53686f != null || this.f53687g != null) {
            sb.append(" resolved to ");
            InterfaceC15114 interfaceC15114 = this.f53686f;
            if (interfaceC15114 != null) {
                sb.append(interfaceC15114);
                if (this.f53687g != null) {
                    sb.append('T');
                    sb.append(this.f53687g);
                }
            } else {
                sb.append(this.f53687g);
            }
        }
        return sb.toString();
    }
}
