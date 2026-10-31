package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܽ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16666 implements InterfaceC15672, InterfaceC2974, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C16666 c16666 = (C16666) obj;
        int i = this.a - c16666.a;
        return i == 0 ? this.b - c16666.b : i;
    }

    static {
        C4426 c4426 = new C4426();
        c4426.m(EnumC18496.YEAR, 4, 10, EnumC23476.EXCEEDS_PAD);
        c4426.d('-');
        c4426.l(EnumC18496.MONTH_OF_YEAR, 2);
        c4426.q(Locale.getDefault(), EnumC17126.SMART, null);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C16666 c16666;
        if (interfaceC15672 instanceof C16666) {
            c16666 = (C16666) interfaceC15672;
        } else {
            C11003.requireNonNull(interfaceC15672, "temporal");
            try {
                if (!C8409.c.equals(AbstractC16169.r(interfaceC15672))) {
                    interfaceC15672 = C19056.X(interfaceC15672);
                }
                EnumC18496 enumC18496 = EnumC18496.YEAR;
                int iL = interfaceC15672.l(enumC18496);
                EnumC18496 enumC18497 = EnumC18496.MONTH_OF_YEAR;
                int iL2 = interfaceC15672.l(enumC18497);
                enumC18496.T(iL);
                enumC18497.T(iL2);
                c16666 = new C16666(iL, iL2);
            } catch (C16232 e) {
                throw new C16232("Unable to obtain YearMonth from TemporalAccessor: " + interfaceC15672 + " of type " + interfaceC15672.getClass().getName(), e);
            }
        }
        if (interfaceC3679 instanceof EnumC8618) {
            long jV = c16666.V() - V();
            switch (AbstractC11023.b[((EnumC8618) interfaceC3679).ordinal()]) {
                case 1:
                    return jV;
                case 2:
                    return jV / 12;
                case 3:
                    return jV / 120;
                case 4:
                    return jV / 1200;
                case 5:
                    return jV / 12000;
                case 6:
                    EnumC18496 enumC18498 = EnumC18496.ERA;
                    return c16666.G(enumC18498) - G(enumC18498);
                default:
                    throw new C11441("Unsupported unit: " + interfaceC3679);
            }
        }
        return interfaceC3679.l(this, c16666);
    }

    public C16666(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final C16666 Z(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new C16666(i, i2);
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.YEAR || interfaceC10030 == EnumC18496.MONTH_OF_YEAR || interfaceC10030 == EnumC18496.PROLEPTIC_MONTH || interfaceC10030 == EnumC18496.YEAR_OF_ERA || interfaceC10030 == EnumC18496.ERA;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.YEAR_OF_ERA) {
            return C22729.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        return n(interfaceC10030).a(G(interfaceC10030), interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        int i;
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        int i2 = AbstractC11023.a[((EnumC18496) interfaceC10030).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return V();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
            }
            i = this.a;
        }
        return i;
    }

    public final long V() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C16666 c(long j, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return (C16666) interfaceC10030.G(this, j);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        enumC18496.T(j);
        int i = AbstractC11023.a[enumC18496.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            EnumC18496.MONTH_OF_YEAR.T(i2);
            return Z(this.a, i2);
        }
        if (i == 2) {
            return X(j - V());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            EnumC18496.YEAR.T(i3);
            return Z(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            EnumC18496.YEAR.T(i4);
            return Z(i4, this.b);
        }
        if (i != 5) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        if (G(EnumC18496.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        EnumC18496.YEAR.T(i5);
        return Z(i5, this.b);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C16666 d(long j, InterfaceC3679 interfaceC3679) {
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return (C16666) interfaceC3679.m(this, j);
        }
        switch (AbstractC11023.b[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return Y(j);
            case 3:
                return Y(AbstractC22791.Q(j, 10));
            case 4:
                return Y(AbstractC22791.Q(j, 100));
            case 5:
                return Y(AbstractC22791.Q(j, 1000));
            case 6:
                EnumC18496 enumC18496 = EnumC18496.ERA;
                return c(AbstractC22791.P(G(enumC18496), j), enumC18496);
            default:
                throw new C11441("Unsupported unit: " + interfaceC3679);
        }
    }

    public final C16666 Y(long j) {
        if (j == 0) {
            return this;
        }
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        return Z(enumC18496.b.a(((long) this.a) + j, enumC18496), this.b);
    }

    public final C16666 X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        long j3 = 12;
        return Z(enumC18496.b.a(AbstractC22791.z(j2, j3), enumC18496), ((int) AbstractC22791.O(j2, j3)) + 1);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return j == Long.MIN_VALUE ? d(C13132.FOREVER_NS, enumC8618).d(1L, enumC8618) : d(-j, enumC8618);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.b) {
            return C8409.c;
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.MONTHS;
        }
        return AbstractC5796.c(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        if (!AbstractC16169.r(interfaceC15672).equals(C8409.c)) {
            throw new C16232("Adjustment only supported on ISO date-time");
        }
        return interfaceC15672.c(V(), EnumC18496.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16666) {
            C16666 c16666 = (C16666) obj;
            if (this.a == c16666.a && this.b == c16666.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ (this.b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.a);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C20613((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C16666) AbstractC22791.a(c19056, this);
    }
}
