package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1850 implements InterfaceC15672, InterfaceC2974, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    public static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((C1850) obj).a;
    }

    static {
        C4426 c4426 = new C4426();
        c4426.m(EnumC18496.YEAR, 4, 10, EnumC23476.EXCEEDS_PAD);
        c4426.q(Locale.getDefault(), EnumC17126.SMART, null);
    }

    public static C1850 V(int i) {
        EnumC18496.YEAR.T(i);
        return new C1850(i);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C1850 c1850V;
        if (interfaceC15672 instanceof C1850) {
            c1850V = (C1850) interfaceC15672;
        } else {
            C11003.requireNonNull(interfaceC15672, "temporal");
            try {
                if (!C8409.c.equals(AbstractC16169.r(interfaceC15672))) {
                    interfaceC15672 = C19056.X(interfaceC15672);
                }
                c1850V = V(interfaceC15672.l(EnumC18496.YEAR));
            } catch (C16232 e) {
                throw new C16232("Unable to obtain Year from TemporalAccessor: " + interfaceC15672 + " of type " + interfaceC15672.getClass().getName(), e);
            }
        }
        if (interfaceC3679 instanceof EnumC8618) {
            long j = ((long) c1850V.a) - ((long) this.a);
            int i = AbstractC9324.b[((EnumC8618) interfaceC3679).ordinal()];
            if (i == 1) {
                return j;
            }
            if (i == 2) {
                return j / 10;
            }
            if (i == 3) {
                return j / 100;
            }
            if (i == 4) {
                return j / 1000;
            }
            if (i == 5) {
                EnumC18496 enumC18496 = EnumC18496.ERA;
                return c1850V.G(enumC18496) - G(enumC18496);
            }
            throw new C11441("Unsupported unit: " + interfaceC3679);
        }
        return interfaceC3679.l(this, c1850V);
    }

    public C1850(int i) {
        this.a = i;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.YEAR || interfaceC10030 == EnumC18496.YEAR_OF_ERA || interfaceC10030 == EnumC18496.ERA;
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
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        int i = AbstractC9324.a[((EnumC18496) interfaceC10030).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C1850 c(long j, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return (C1850) interfaceC10030.G(this, j);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        enumC18496.T(j);
        int i = AbstractC9324.a[enumC18496.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return V((int) j);
        }
        if (i == 2) {
            return V((int) j);
        }
        if (i == 3) {
            return G(EnumC18496.ERA) == j ? this : V(1 - this.a);
        }
        throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C1850 d(long j, InterfaceC3679 interfaceC3679) {
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return (C1850) interfaceC3679.m(this, j);
        }
        int i = AbstractC9324.b[((EnumC8618) interfaceC3679).ordinal()];
        if (i == 1) {
            return X(j);
        }
        if (i == 2) {
            return X(AbstractC22791.Q(j, 10));
        }
        if (i == 3) {
            return X(AbstractC22791.Q(j, 100));
        }
        if (i == 4) {
            return X(AbstractC22791.Q(j, 1000));
        }
        if (i == 5) {
            EnumC18496 enumC18496 = EnumC18496.ERA;
            return c(AbstractC22791.P(G(enumC18496), j), enumC18496);
        }
        throw new C11441("Unsupported unit: " + interfaceC3679);
    }

    public final C1850 X(long j) {
        if (j == 0) {
            return this;
        }
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        return V(enumC18496.b.a(((long) this.a) + j, enumC18496));
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
            return EnumC8618.YEARS;
        }
        return AbstractC5796.c(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        if (!AbstractC16169.r(interfaceC15672).equals(C8409.c)) {
            throw new C16232("Adjustment only supported on ISO date-time");
        }
        return interfaceC15672.c(this.a, EnumC18496.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1850) && this.a == ((C1850) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new C20613((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C1850) AbstractC22791.a(c19056, this);
    }
}
