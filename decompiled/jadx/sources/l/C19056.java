package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19056 implements InterfaceC15672, InterfaceC2974, InterfaceC13410, Serializable {
    public static final C19056 d = h0(-999999999, 1, 1);
    public static final C19056 e = h0(999999999, 12, 31);
    public static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        h0(1970, 1, 1);
    }

    public static C19056 now() {
        return g0(AbstractC9178.a());
    }

    public static C19056 g0(C8472 c8472) {
        C11003.requireNonNull(c8472, "clock");
        C4239 c4239Instant = c8472.instant();
        AbstractC5650 abstractC5650 = c8472.a;
        C11003.requireNonNull(c4239Instant, "instant");
        C11003.requireNonNull(abstractC5650, "zone");
        return i0(AbstractC22791.z(c4239Instant.getEpochSecond() + ((long) abstractC5650.W().d(c4239Instant).b), 86400));
    }

    public static C19056 h0(int i, int i2, int i3) {
        EnumC18496.YEAR.T(i);
        EnumC18496.MONTH_OF_YEAR.T(i2);
        EnumC18496.DAY_OF_MONTH.T(i3);
        return W(i, i2, i3);
    }

    public static C19056 j0(int i, int i2) {
        long j = i;
        EnumC18496.YEAR.T(j);
        EnumC18496.DAY_OF_YEAR.T(i2);
        boolean zS = C8409.c.S(j);
        if (i2 == 366 && !zS) {
            throw new C16232("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        EnumC10735 enumC10735Y = EnumC10735.Y(((i2 - 1) / 31) + 1);
        if (i2 > (enumC10735Y.W(zS) + enumC10735Y.V(zS)) - 1) {
            enumC10735Y = EnumC10735.a[((((int) 1) + 12) + enumC10735Y.ordinal()) % 12];
        }
        return new C19056(i, enumC10735Y.getValue(), (i2 - enumC10735Y.V(zS)) + 1);
    }

    public static C19056 i0(long j) {
        long j2;
        EnumC18496.EPOCH_DAY.T(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        return new C19056(enumC18496.b.a(j7, enumC18496), i3, i4);
    }

    public static C19056 X(InterfaceC2268 interfaceC2268) {
        C11003.requireNonNull(interfaceC2268, "temporal");
        C19056 c19056 = (C19056) interfaceC2268.T(AbstractC5796.f);
        if (c19056 != null) {
            return c19056;
        }
        throw new C16232("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName());
    }

    public static C19056 W(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (C8409.c.S(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C16232("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C16232("Invalid date '" + EnumC10735.Y(i2).name() + " " + i3 + "'");
            }
        }
        return new C19056(i, i2, i3);
    }

    public static C19056 p0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, C8409.c.S((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new C19056(i, i2, i3);
    }

    public C19056(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        return AbstractC22791.f(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.m(this);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        if (!enumC18496.isDateBased()) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        int i = AbstractC10526.a[enumC18496.ordinal()];
        if (i == 1) {
            return C22729.f(1L, d0());
        }
        if (i == 2) {
            return C22729.f(1L, Q());
        }
        if (i == 3) {
            return C22729.f(1L, (EnumC10735.Y(this.b) != EnumC10735.FEBRUARY || u()) ? 5L : 4L);
        }
        if (i != 4) {
            return enumC18496.b;
        }
        return this.a <= 0 ? C22729.f(1L, 1000000000L) : C22729.f(1L, 999999999L);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return Y(interfaceC10030);
        }
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (interfaceC10030 == EnumC18496.EPOCH_DAY) {
                return H();
            }
            if (interfaceC10030 == EnumC18496.PROLEPTIC_MONTH) {
                return b0();
            }
            return Y(interfaceC10030);
        }
        return interfaceC10030.C(this);
    }

    public final int Y(InterfaceC10030 interfaceC10030) {
        switch (AbstractC10526.a[((EnumC18496) interfaceC10030).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return a0();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return Z().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((a0() - 1) % 7) + 1;
            case 8:
                throw new C11441("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((a0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new C11441("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
    }

    public final long b0() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // l.InterfaceC13410
    public final InterfaceC2765 a() {
        return C8409.c;
    }

    @Override // l.InterfaceC13410
    public final InterfaceC4176 K() {
        return this.a >= 1 ? EnumC15463.CE : EnumC15463.BCE;
    }

    public final int a0() {
        return (EnumC10735.Y(this.b).V(u()) + this.c) - 1;
    }

    public final EnumC21878 Z() {
        return EnumC21878.V(((int) AbstractC22791.O(H() + 3, 7)) + 1);
    }

    @Override // l.InterfaceC13410
    public final boolean u() {
        return C8409.c.S(this.a);
    }

    public final int d0() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return u() ? 29 : 28;
    }

    @Override // l.InterfaceC13410
    public final int Q() {
        return u() ? 366 : 365;
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C19056 m(InterfaceC2974 interfaceC2974) {
        if (interfaceC2974 instanceof C19056) {
            return (C19056) interfaceC2974;
        }
        return (C19056) interfaceC2974.s(this);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final C19056 c(long j, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return (C19056) interfaceC10030.G(this, j);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        enumC18496.T(j);
        switch (AbstractC10526.a[enumC18496.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return h0(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (a0() != i2) {
                    return j0(this.a, i2);
                }
                return this;
            case 3:
                return n0(j - G(EnumC18496.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return s0((int) j);
            case 5:
                return l0(j - ((long) Z().getValue()));
            case 6:
                return l0(j - G(EnumC18496.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return l0(j - G(EnumC18496.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return i0(j);
            case 9:
                return n0(j - G(EnumC18496.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    EnumC18496.MONTH_OF_YEAR.T(i3);
                    return p0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return m0(j - b0());
            case 12:
                return s0((int) j);
            case 13:
                if (G(EnumC18496.ERA) != j) {
                    return s0(1 - this.a);
                }
                return this;
            default:
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
    }

    public final C19056 s0(int i) {
        if (this.a == i) {
            return this;
        }
        EnumC18496.YEAR.T(i);
        return p0(i, this.b, this.c);
    }

    @Override // l.InterfaceC13410
    public final InterfaceC13410 N(InterfaceC12146 interfaceC12146) {
        if (interfaceC12146 != null) {
            C6501 c6501 = (C6501) interfaceC12146;
            return m0((((long) c6501.a) * 12) + ((long) c6501.b)).l0(c6501.c);
        }
        C11003.requireNonNull(interfaceC12146, "amountToAdd");
        return (C19056) ((C6501) interfaceC12146).l(this);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final C19056 d(long j, InterfaceC3679 interfaceC3679) {
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return (C19056) interfaceC3679.m(this, j);
        }
        switch (AbstractC10526.b[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return l0(j);
            case 2:
                return n0(j);
            case 3:
                return m0(j);
            case 4:
                return o0(j);
            case 5:
                return o0(AbstractC22791.Q(j, 10));
            case 6:
                return o0(AbstractC22791.Q(j, 100));
            case 7:
                return o0(AbstractC22791.Q(j, 1000));
            case 8:
                EnumC18496 enumC18496 = EnumC18496.ERA;
                return c(AbstractC22791.P(G(enumC18496), j), enumC18496);
            default:
                throw new C11441("Unsupported unit: " + interfaceC3679);
        }
    }

    public final C19056 o0(long j) {
        if (j == 0) {
            return this;
        }
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        return p0(enumC18496.b.a(((long) this.a) + j, enumC18496), this.b, this.c);
    }

    public final C19056 m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        long j3 = 12;
        return p0(enumC18496.b.a(AbstractC22791.z(j2, j3), enumC18496), ((int) AbstractC22791.O(j2, j3)) + 1, this.c);
    }

    public final C19056 n0(long j) {
        return l0(AbstractC22791.Q(j, 7));
    }

    public final C19056 l0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new C19056(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jD0 = d0();
                if (j2 <= jD0) {
                    return new C19056(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new C19056(this.a, s + 1, (int) (j2 - jD0));
                }
                EnumC18496.YEAR.T(this.a + 1);
                return new C19056(this.a + 1, 1, (int) (j2 - jD0));
            }
        }
        return i0(AbstractC22791.P(H(), j));
    }

    @Override // l.InterfaceC13410
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C19056 w(long j, InterfaceC3679 interfaceC3679) {
        return j == Long.MIN_VALUE ? d(C13132.FOREVER_NS, interfaceC3679).d(1L, interfaceC3679) : d(-j, interfaceC3679);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        return c8556 == AbstractC5796.f ? this : AbstractC22791.g(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return AbstractC22791.a(this, interfaceC15672);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C19056 c19056X = X(interfaceC15672);
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return interfaceC3679.l(this, c19056X);
        }
        switch (AbstractC10526.b[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return c19056X.H() - H();
            case 2:
                return (c19056X.H() - H()) / 7;
            case 3:
                return f0(c19056X);
            case 4:
                return f0(c19056X) / 12;
            case 5:
                return f0(c19056X) / 120;
            case 6:
                return f0(c19056X) / 1200;
            case 7:
                return f0(c19056X) / 12000;
            case 8:
                EnumC18496 enumC18496 = EnumC18496.ERA;
                return c19056X.G(enumC18496) - G(enumC18496);
            default:
                throw new C11441("Unsupported unit: " + interfaceC3679);
        }
    }

    public final long f0(C19056 c19056) {
        return (((c19056.b0() * 32) + ((long) c19056.c)) - ((b0() * 32) + ((long) this.c))) / 32;
    }

    @Override // l.InterfaceC13410
    public final InterfaceC14115 I(C7248 c7248) {
        return C22770.Y(this, c7248);
    }

    public C1416 atStartOfDay(AbstractC5650 abstractC5650) {
        C11003.requireNonNull(abstractC5650, "zone");
        C22770 c22770Y = C22770.Y(this, C7248.g);
        if (!(abstractC5650 instanceof C18078)) {
            Object objE = abstractC5650.W().e(c22770Y);
            C6789 c6789 = objE instanceof C6789 ? (C6789) objE : null;
            if (c6789 != null && c6789.l()) {
                c22770Y = c6789.b.b0(c6789.d.b - c6789.c.b);
            }
        }
        return C1416.W(c22770Y, abstractC5650, null);
    }

    @Override // l.InterfaceC13410
    public final long H() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !u() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC13410 interfaceC13410) {
        if (interfaceC13410 instanceof C19056) {
            return V((C19056) interfaceC13410);
        }
        return AbstractC22791.b(this, interfaceC13410);
    }

    public final int V(C19056 c19056) {
        int i = this.a - c19056.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - c19056.b;
        return i2 == 0 ? this.c - c19056.c : i2;
    }

    public final boolean c0(InterfaceC13410 interfaceC13410) {
        if (interfaceC13410 instanceof C19056) {
            return V((C19056) interfaceC13410) < 0;
        }
        return H() < interfaceC13410.H();
    }

    @Override // l.InterfaceC13410
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19056) && V((C19056) obj) == 0;
    }

    @Override // l.InterfaceC13410
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // l.InterfaceC13410
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C20613((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
