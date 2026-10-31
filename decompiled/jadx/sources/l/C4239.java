package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۘ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4239 implements InterfaceC15672, InterfaceC2974, Comparable, Serializable {
    public static final C4239 EPOCH = new C4239(0, 0);
    public static final C4239 c = ofEpochSecond(-31557014167219200L, 0);
    public static final C4239 d = ofEpochSecond(31556889864403199L, 999999999);
    public static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    public static C4239 now() {
        return AbstractC9178.systemUTC().instant();
    }

    public static C4239 ofEpochSecond(long j) {
        return V(j, 0);
    }

    public static C4239 ofEpochSecond(long j, long j2) {
        return V(AbstractC22791.P(j, AbstractC22791.z(j2, 1000000000L)), (int) AbstractC22791.O(j2, 1000000000L));
    }

    public static C4239 ofEpochMilli(long j) {
        long j2 = 1000;
        return V(AbstractC22791.z(j, j2), ((int) AbstractC22791.O(j, j2)) * BasicLabelFormatter.MILLION);
    }

    public static C4239 W(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268 instanceof C4239) {
            return (C4239) interfaceC2268;
        }
        C11003.requireNonNull(interfaceC2268, "temporal");
        try {
            return ofEpochSecond(interfaceC2268.G(EnumC18496.INSTANT_SECONDS), interfaceC2268.l(EnumC18496.NANO_OF_SECOND));
        } catch (C16232 e) {
            throw new C16232("Unable to obtain Instant from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName(), e);
        }
    }

    public static C4239 V(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C16232("Instant exceeds minimum or maximum instant");
        }
        return new C4239(j, i);
    }

    public C4239(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.INSTANT_SECONDS || interfaceC10030 == EnumC18496.NANO_OF_SECOND || interfaceC10030 == EnumC18496.MICRO_OF_SECOND || interfaceC10030 == EnumC18496.MILLI_OF_SECOND;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return AbstractC5796.d(this, interfaceC10030).a(interfaceC10030.C(this), interfaceC10030);
        }
        int i = AbstractC12642.a[((EnumC18496) interfaceC10030).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / BasicLabelFormatter.MILLION;
        }
        if (i == 4) {
            EnumC18496 enumC18496 = EnumC18496.INSTANT_SECONDS;
            enumC18496.b.a(this.a, enumC18496);
        }
        throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        int i;
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        int i2 = AbstractC12642.a[((EnumC18496) interfaceC10030).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
            }
            i = this.b / BasicLabelFormatter.MILLION;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 c(long j, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return (C4239) interfaceC10030.G(this, j);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        enumC18496.T(j);
        int i = AbstractC12642.a[enumC18496.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.b) {
                    return V(this.a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * BasicLabelFormatter.MILLION;
                if (i3 != this.b) {
                    return V(this.a, i3);
                }
            } else {
                if (i != 4) {
                    throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
                }
                if (j != this.a) {
                    return V(j, this.b);
                }
            }
        } else if (j != this.b) {
            return V(this.a, (int) j);
        }
        return this;
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C4239 d(long j, InterfaceC3679 interfaceC3679) {
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return (C4239) interfaceC3679.m(this, j);
        }
        switch (AbstractC12642.b[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return X(0L, j);
            case 2:
                return X(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return X(j / 1000, (j % 1000) * 1000000);
            case 4:
                return X(j, 0L);
            case 5:
                return X(AbstractC22791.Q(j, 60), 0L);
            case 6:
                return X(AbstractC22791.Q(j, 3600), 0L);
            case 7:
                return X(AbstractC22791.Q(j, 43200), 0L);
            case 8:
                return X(AbstractC22791.Q(j, 86400), 0L);
            default:
                throw new C11441("Unsupported unit: " + interfaceC3679);
        }
    }

    public final C4239 X(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(AbstractC22791.P(AbstractC22791.P(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return j == Long.MIN_VALUE ? d(C13132.FOREVER_NS, enumC8618).d(1L, enumC8618) : d(-j, enumC8618);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.NANOS;
        }
        if (c8556 == AbstractC5796.b || c8556 == AbstractC5796.a || c8556 == AbstractC5796.e || c8556 == AbstractC5796.d || c8556 == AbstractC5796.f || c8556 == AbstractC5796.g) {
            return null;
        }
        return c8556.h(this);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(this.a, EnumC18496.INSTANT_SECONDS).c(this.b, EnumC18496.NANO_OF_SECOND);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C4239 c4239W = W(interfaceC15672);
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return interfaceC3679.l(this, c4239W);
        }
        switch (AbstractC12642.b[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return AbstractC22791.P(AbstractC22791.Q(AbstractC22791.R(c4239W.a, this.a), 1000000000L), c4239W.b - this.b);
            case 2:
                return AbstractC22791.P(AbstractC22791.Q(AbstractC22791.R(c4239W.a, this.a), 1000000000L), c4239W.b - this.b) / 1000;
            case 3:
                return AbstractC22791.R(c4239W.toEpochMilli(), toEpochMilli());
            case 4:
                return Z(c4239W);
            case 5:
                return Z(c4239W) / 60;
            case 6:
                return Z(c4239W) / 3600;
            case 7:
                return Z(c4239W) / 43200;
            case 8:
                return Z(c4239W) / 86400;
            default:
                throw new C11441("Unsupported unit: " + interfaceC3679);
        }
    }

    public final long Z(C4239 c4239) {
        long jR = AbstractC22791.R(c4239.a, this.a);
        long j = c4239.b - this.b;
        if (jR <= 0 || j >= 0) {
            return (jR >= 0 || j <= 0) ? jR : jR + 1;
        }
        return jR - 1;
    }

    public C1416 atZone(AbstractC5650 abstractC5650) {
        return C1416.ofInstant(this, abstractC5650);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? AbstractC22791.P(AbstractC22791.Q(j, 1000), this.b / BasicLabelFormatter.MILLION) : AbstractC22791.P(AbstractC22791.Q(j + 1, 1000), (this.b / BasicLabelFormatter.MILLION) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(C4239 c4239) {
        int iCompare = Long.compare(this.a, c4239.a);
        return iCompare != 0 ? iCompare : this.b - c4239.b;
    }

    public boolean isAfter(C4239 c4239) {
        return compareTo(c4239) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4239) {
            C4239 c4239 = (C4239) obj;
            if (this.a == c4239.a && this.b == c4239.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return C6292.h.format(this);
    }

    private Object writeReplace() {
        return new C20613((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C4239) AbstractC22791.a(c19056, this);
    }
}
