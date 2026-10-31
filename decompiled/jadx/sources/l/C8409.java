package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8409 extends AbstractC4944 implements Serializable {
    public static final C8409 c = new C8409();
    public static final long serialVersionUID = -1440403870442975015L;

    @Override // l.InterfaceC2765
    public final String k() {
        return "ISO";
    }

    @Override // l.InterfaceC2765
    public final String o() {
        return "iso8601";
    }

    @Override // l.InterfaceC2765
    public final InterfaceC4176 y(int i) {
        if (i == 0) {
            return EnumC15463.BCE;
        }
        if (i == 1) {
            return EnumC15463.CE;
        }
        throw new C16232("Invalid era: " + i);
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 M(int i, int i2, int i3) {
        return C19056.h0(i, i2, i3);
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 q(int i, int i2) {
        return C19056.j0(i, i2);
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 j(long j) {
        return C19056.i0(j);
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 E(InterfaceC2268 interfaceC2268) {
        return C19056.X(interfaceC2268);
    }

    @Override // l.AbstractC4944, l.InterfaceC2765
    public final InterfaceC14115 J(InterfaceC2268 interfaceC2268) {
        return C22770.W(interfaceC2268);
    }

    @Override // l.AbstractC4944, l.InterfaceC2765
    public final InterfaceC22583 p(InterfaceC2268 interfaceC2268) {
        return C1416.V(interfaceC2268);
    }

    @Override // l.InterfaceC2765
    public final InterfaceC22583 P(C4239 c4239, AbstractC5650 abstractC5650) {
        return C1416.ofInstant(c4239, abstractC5650);
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 m() {
        C8472 c8472A = AbstractC9178.a();
        C11003.requireNonNull(c8472A, "clock");
        return C19056.X(C19056.g0(c8472A));
    }

    @Override // l.InterfaceC2765
    public final boolean S(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // l.InterfaceC2765
    public final int z(InterfaceC4176 interfaceC4176, int i) {
        if (interfaceC4176 instanceof EnumC15463) {
            return interfaceC4176 == EnumC15463.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // l.InterfaceC2765
    public final List x() {
        return AbstractC22791.B(EnumC15463.values());
    }

    @Override // l.AbstractC4944, l.InterfaceC2765
    public final InterfaceC13410 O(Map map, EnumC17126 enumC17126) {
        return (C19056) super.O(map, enumC17126);
    }

    @Override // l.AbstractC4944
    public final void C(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC18496);
        if (l2 != null) {
            if (enumC17126 != EnumC17126.LENIENT) {
                enumC18496.T(l2.longValue());
            }
            long j = 12;
            AbstractC4944.l(map, EnumC18496.MONTH_OF_YEAR, ((int) AbstractC22791.O(l2.longValue(), j)) + 1);
            AbstractC4944.l(map, EnumC18496.YEAR, AbstractC22791.z(l2.longValue(), j));
        }
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 T(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC18496);
        if (l2 != null) {
            if (enumC17126 != EnumC17126.LENIENT) {
                enumC18496.T(l2.longValue());
            }
            Long l3 = (Long) map.remove(EnumC18496.ERA);
            if (l3 != null) {
                if (l3.longValue() == 1) {
                    AbstractC4944.l(map, EnumC18496.YEAR, l2.longValue());
                    return null;
                }
                if (l3.longValue() == 0) {
                    AbstractC4944.l(map, EnumC18496.YEAR, AbstractC22791.R(1L, l2.longValue()));
                    return null;
                }
                throw new C16232("Invalid value for era: " + l3);
            }
            EnumC18496 enumC18497 = EnumC18496.YEAR;
            Long l4 = (Long) map.get(enumC18497);
            if (enumC17126 != EnumC17126.STRICT) {
                AbstractC4944.l(map, enumC18497, (l4 == null || l4.longValue() > 0) ? l2.longValue() : AbstractC22791.R(1L, l2.longValue()));
                return null;
            }
            if (l4 != null) {
                long jLongValue = l4.longValue();
                long jLongValue2 = l2.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = AbstractC22791.R(1L, jLongValue2);
                }
                AbstractC4944.l(map, enumC18497, jLongValue2);
                return null;
            }
            map.put(enumC18496, l2);
            return null;
        }
        EnumC18496 enumC18498 = EnumC18496.ERA;
        if (!map.containsKey(enumC18498)) {
            return null;
        }
        enumC18498.T(((Long) map.get(enumC18498)).longValue());
        return null;
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 G(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        int iA = enumC18496.b.a(((Long) map.remove(enumC18496)).longValue(), enumC18496);
        boolean z = true;
        if (enumC17126 == EnumC17126.LENIENT) {
            return C19056.h0(iA, 1, 1).m0(AbstractC22791.R(((Long) map.remove(EnumC18496.MONTH_OF_YEAR)).longValue(), 1L)).l0(AbstractC22791.R(((Long) map.remove(EnumC18496.DAY_OF_MONTH)).longValue(), 1L));
        }
        EnumC18496 enumC18497 = EnumC18496.MONTH_OF_YEAR;
        int iA2 = enumC18497.b.a(((Long) map.remove(enumC18497)).longValue(), enumC18497);
        EnumC18496 enumC18498 = EnumC18496.DAY_OF_MONTH;
        int iA3 = enumC18498.b.a(((Long) map.remove(enumC18498)).longValue(), enumC18498);
        if (enumC17126 == EnumC17126.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                EnumC10735 enumC10735 = EnumC10735.FEBRUARY;
                long j = iA;
                int i = C1850.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, enumC10735.W(z));
            }
        }
        return C19056.h0(iA, iA2, iA3);
    }

    @Override // l.InterfaceC2765
    public final C22729 v(EnumC18496 enumC18496) {
        return enumC18496.b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C7766((byte) 1, this);
    }
}
