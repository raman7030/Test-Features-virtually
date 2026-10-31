package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۖ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2828 implements InterfaceC12146, Comparable, Serializable {
    public static final C2828 ZERO = new C2828(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    public static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public static C2828 ofMinutes(long j) {
        return m(AbstractC22791.Q(j, 60), 0);
    }

    public static C2828 ofSeconds(long j) {
        return m(j, 0);
    }

    public static C2828 s(long j, long j2) {
        return m(AbstractC22791.P(j, AbstractC22791.z(j2, 1000000000L)), (int) AbstractC22791.O(j2, 1000000000L));
    }

    public static C2828 ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m(j2, i * BasicLabelFormatter.MILLION);
    }

    public static C2828 n(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m(j2, i);
    }

    public static C2828 of(long j, InterfaceC3679 interfaceC3679) {
        C2828 c2828 = ZERO;
        c2828.getClass();
        C11003.requireNonNull(interfaceC3679, "unit");
        if (interfaceC3679 == EnumC8618.DAYS) {
            return c2828.C(AbstractC22791.Q(j, 86400), 0L);
        }
        if (interfaceC3679.isDurationEstimated()) {
            throw new C11441("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return c2828;
        }
        if (interfaceC3679 instanceof EnumC8618) {
            int i = AbstractC13347.a[((EnumC8618) interfaceC3679).ordinal()];
            if (i == 1) {
                return c2828.C(0L, j);
            }
            if (i == 2) {
                return c2828.C((j / 1000000000) * 1000, 0L).C(0L, (j % 1000000000) * 1000);
            }
            if (i != 3) {
                return i != 4 ? c2828.C(AbstractC22791.Q(interfaceC3679.getDuration().a, j), 0L) : c2828.C(j, 0L);
            }
            return c2828.C(j / 1000, (j % 1000) * 1000000);
        }
        C2828 duration = interfaceC3679.getDuration();
        duration.getClass();
        if (j == 0) {
            duration = c2828;
        } else if (j != 1) {
            BigInteger bigIntegerExact = BigDecimal.valueOf(duration.a).add(BigDecimal.valueOf(duration.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
            BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
            if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
                throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
            }
            duration = s(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        return c2828.C(duration.a, 0L).C(0L, duration.b);
    }

    public static C2828 between(InterfaceC15672 interfaceC15672, InterfaceC15672 interfaceC15673) {
        try {
            return n(interfaceC15672.g(interfaceC15673, EnumC8618.NANOS));
        } catch (ArithmeticException | C16232 unused) {
            long jG = interfaceC15672.g(interfaceC15673, EnumC8618.SECONDS);
            long j = 0;
            try {
                EnumC18496 enumC18496 = EnumC18496.NANO_OF_SECOND;
                long jG2 = interfaceC15673.G(enumC18496) - interfaceC15672.G(enumC18496);
                if (jG > 0 && jG2 < 0) {
                    jG++;
                } else if (jG < 0 && jG2 > 0) {
                    jG--;
                }
                j = jG2;
            } catch (C16232 unused2) {
            }
            return s(jG, j);
        }
    }

    public static C2828 m(long j, int i) {
        if ((((long) i) | j) == 0) {
            return ZERO;
        }
        return new C2828(j, i);
    }

    public C2828(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public boolean isZero() {
        return (this.a | ((long) this.b)) == 0;
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public final C2828 C(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return s(AbstractC22791.P(AbstractC22791.P(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // l.InterfaceC12146
    public final InterfaceC15672 l(InterfaceC15672 interfaceC15672) {
        long j = this.a;
        if (j != 0) {
            interfaceC15672 = interfaceC15672.d(j, EnumC8618.SECONDS);
        }
        int i = this.b;
        return i != 0 ? interfaceC15672.d(i, EnumC8618.NANOS) : interfaceC15672;
    }

    public long toMillis() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC22791.P(AbstractC22791.Q(j, 1000), j2 / 1000000);
    }

    public long toNanos() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC22791.P(AbstractC22791.Q(j, 1000000000L), j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(C2828 c2828) {
        int iCompare = Long.compare(this.a, c2828.a);
        return iCompare != 0 ? iCompare : this.b - c2828.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2828) {
            C2828 c2828 = (C2828) obj;
            if (this.a == c2828.a && this.b == c2828.b) {
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
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        if (j < 0 && this.b > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.a < 0 && this.b > 0 && i2 == 0) {
            sb.append("-0");
        } else {
            sb.append(i2);
        }
        if (this.b > 0) {
            int length = sb.length();
            if (this.a < 0) {
                sb.append(2000000000 - ((long) this.b));
            } else {
                sb.append(((long) this.b) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new C20613((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
