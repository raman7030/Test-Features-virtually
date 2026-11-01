package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10361 extends AbstractC7068 implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final C10361 f28676c = new C10361();
    public static final long serialVersionUID = -1440403870442975015L;

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: k */
    public final String mo10584k() {
        return "ISO";
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: o */
    public final String mo10585o() {
        return "iso8601";
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: y */
    public final InterfaceC6338 mo10590y(int i) {
        if (i == 0) {
            return EnumC17065.BCE;
        }
        if (i == 1) {
            return EnumC17065.f50459CE;
        }
        throw new C17796("Invalid era: " + i);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: M */
    public final InterfaceC15114 mo10579M(int i, int i2, int i3) {
        return C20480.m46187h0(i, i2, i3);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: q */
    public final InterfaceC15114 mo10587q(int i, int i2) {
        return C20480.m46189j0(i, i2);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: j */
    public final InterfaceC15114 mo10583j(long j) {
        return C20480.m46188i0(j);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: E */
    public final InterfaceC15114 mo10577E(InterfaceC4524 interfaceC4524) {
        return C20480.m46185X(interfaceC4524);
    }

    @Override // p067l.AbstractC7068, p067l.InterfaceC4997
    /* JADX INFO: renamed from: J */
    public final InterfaceC15784 mo10578J(InterfaceC4524 interfaceC4524) {
        return C24009.m53181W(interfaceC4524);
    }

    @Override // p067l.AbstractC7068, p067l.InterfaceC4997
    /* JADX INFO: renamed from: p */
    public final InterfaceC23832 mo10586p(InterfaceC4524 interfaceC4524) {
        return C3715.m7141V(interfaceC4524);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: P */
    public final InterfaceC23832 mo10581P(C6398 c6398, AbstractC7739 abstractC7739) {
        return C3715.ofInstant(c6398, abstractC7739);
    }

    @Override // p067l.AbstractC7068
    /* JADX INFO: renamed from: m */
    public final InterfaceC15114 mo12725m() {
        C10421 c10421M25535a = AbstractC11092.m25535a();
        C12826.requireNonNull(c10421M25535a, "clock");
        return C20480.m46185X(C20480.m46186g0(c10421M25535a));
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: S */
    public final boolean mo10582S(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: z */
    public final int mo10591z(InterfaceC6338 interfaceC6338, int i) {
        if (interfaceC6338 instanceof EnumC17065) {
            return interfaceC6338 == EnumC17065.f50459CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: x */
    public final List mo10589x() {
        return AbstractC24029.m53212B(EnumC17065.values());
    }

    @Override // p067l.AbstractC7068, p067l.InterfaceC4997
    /* JADX INFO: renamed from: O */
    public final InterfaceC15114 mo10580O(Map map, EnumC18645 enumC18645) {
        return (C20480) super.mo10580O(map, enumC18645);
    }

    @Override // p067l.AbstractC7068
    /* JADX INFO: renamed from: C */
    public final void mo16287C(Map map, EnumC18645 enumC18645) {
        EnumC19947 enumC19947 = EnumC19947.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC19947);
        if (l2 != null) {
            if (enumC18645 != EnumC18645.LENIENT) {
                enumC19947.m45273T(l2.longValue());
            }
            long j = 12;
            AbstractC7068.m16284l(map, EnumC19947.MONTH_OF_YEAR, ((int) AbstractC24029.m53225O(l2.longValue(), j)) + 1);
            AbstractC7068.m16284l(map, EnumC19947.YEAR, AbstractC24029.m53257z(l2.longValue(), j));
        }
    }

    @Override // p067l.AbstractC7068
    /* JADX INFO: renamed from: T */
    public final InterfaceC15114 mo16289T(Map map, EnumC18645 enumC18645) {
        EnumC19947 enumC19947 = EnumC19947.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC19947);
        if (l2 != null) {
            if (enumC18645 != EnumC18645.LENIENT) {
                enumC19947.m45273T(l2.longValue());
            }
            Long l3 = (Long) map.remove(EnumC19947.ERA);
            if (l3 != null) {
                if (l3.longValue() == 1) {
                    AbstractC7068.m16284l(map, EnumC19947.YEAR, l2.longValue());
                    return null;
                }
                if (l3.longValue() == 0) {
                    AbstractC7068.m16284l(map, EnumC19947.YEAR, AbstractC24029.m53228R(1L, l2.longValue()));
                    return null;
                }
                throw new C17796("Invalid value for era: " + l3);
            }
            EnumC19947 enumC19948 = EnumC19947.YEAR;
            Long l4 = (Long) map.get(enumC19948);
            if (enumC18645 != EnumC18645.STRICT) {
                AbstractC7068.m16284l(map, enumC19948, (l4 == null || l4.longValue() > 0) ? l2.longValue() : AbstractC24029.m53228R(1L, l2.longValue()));
                return null;
            }
            if (l4 != null) {
                long jLongValue = l4.longValue();
                long jLongValue2 = l2.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = AbstractC24029.m53228R(1L, jLongValue2);
                }
                AbstractC7068.m16284l(map, enumC19948, jLongValue2);
                return null;
            }
            map.put(enumC19947, l2);
            return null;
        }
        EnumC19947 enumC19949 = EnumC19947.ERA;
        if (!map.containsKey(enumC19949)) {
            return null;
        }
        enumC19949.m45273T(((Long) map.get(enumC19949)).longValue());
        return null;
    }

    @Override // p067l.AbstractC7068
    /* JADX INFO: renamed from: G */
    public final InterfaceC15114 mo16288G(Map map, EnumC18645 enumC18645) {
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        int iM53121a = enumC19947.f60552b.m53121a(((Long) map.remove(enumC19947)).longValue(), enumC19947);
        boolean z = true;
        if (enumC18645 == EnumC18645.LENIENT) {
            return C20480.m46187h0(iM53121a, 1, 1).m46202m0(AbstractC24029.m53228R(((Long) map.remove(EnumC19947.MONTH_OF_YEAR)).longValue(), 1L)).m46201l0(AbstractC24029.m53228R(((Long) map.remove(EnumC19947.DAY_OF_MONTH)).longValue(), 1L));
        }
        EnumC19947 enumC19948 = EnumC19947.MONTH_OF_YEAR;
        int iM53121a2 = enumC19948.f60552b.m53121a(((Long) map.remove(enumC19948)).longValue(), enumC19948);
        EnumC19947 enumC19949 = EnumC19947.DAY_OF_MONTH;
        int iM53121a3 = enumC19949.f60552b.m53121a(((Long) map.remove(enumC19949)).longValue(), enumC19949);
        if (enumC18645 == EnumC18645.SMART) {
            if (iM53121a2 == 4 || iM53121a2 == 6 || iM53121a2 == 9 || iM53121a2 == 11) {
                iM53121a3 = Math.min(iM53121a3, 30);
            } else if (iM53121a2 == 2) {
                EnumC12571 enumC12571 = EnumC12571.FEBRUARY;
                long j = iM53121a;
                int i = C4127.f9109b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iM53121a3 = Math.min(iM53121a3, enumC12571.m28962W(z));
            }
        }
        return C20480.m46187h0(iM53121a, iM53121a2, iM53121a3);
    }

    @Override // p067l.InterfaceC4997
    /* JADX INFO: renamed from: v */
    public final C23970 mo10588v(EnumC19947 enumC19947) {
        return enumC19947.f60552b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C9750((byte) 1, this);
    }
}
