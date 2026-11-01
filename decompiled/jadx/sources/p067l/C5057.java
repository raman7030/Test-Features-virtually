package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۖ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5057 implements InterfaceC13912, Comparable, Serializable {
    public static final C5057 ZERO = new C5057(0, 0);

    /* JADX INFO: renamed from: c */
    public static final BigInteger f11850c = BigInteger.valueOf(1000000000);
    public static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a */
    public final long f11851a;

    /* JADX INFO: renamed from: b */
    public final int f11852b;

    public static C5057 ofMinutes(long j) {
        return m10789m(AbstractC24029.m53227Q(j, 60), 0);
    }

    public static C5057 ofSeconds(long j) {
        return m10789m(j, 0);
    }

    /* JADX INFO: renamed from: s */
    public static C5057 m10792s(long j, long j2) {
        return m10789m(AbstractC24029.m53226P(j, AbstractC24029.m53257z(j2, 1000000000L)), (int) AbstractC24029.m53225O(j2, 1000000000L));
    }

    public static C5057 ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m10789m(j2, i * BasicLabelFormatter.MILLION);
    }

    /* JADX INFO: renamed from: n */
    public static C5057 m10790n(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m10789m(j2, i);
    }

    /* JADX INFO: renamed from: of */
    public static C5057 m10791of(long j, InterfaceC5865 interfaceC5865) {
        C5057 c5057 = ZERO;
        c5057.getClass();
        C12826.requireNonNull(interfaceC5865, "unit");
        if (interfaceC5865 == EnumC10559.DAYS) {
            return c5057.m10793C(AbstractC24029.m53227Q(j, 86400), 0L);
        }
        if (interfaceC5865.isDurationEstimated()) {
            throw new C13242("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return c5057;
        }
        if (interfaceC5865 instanceof EnumC10559) {
            int i = AbstractC15054.f42991a[((EnumC10559) interfaceC5865).ordinal()];
            if (i == 1) {
                return c5057.m10793C(0L, j);
            }
            if (i == 2) {
                return c5057.m10793C((j / 1000000000) * 1000, 0L).m10793C(0L, (j % 1000000000) * 1000);
            }
            if (i != 3) {
                return i != 4 ? c5057.m10793C(AbstractC24029.m53227Q(interfaceC5865.getDuration().f11851a, j), 0L) : c5057.m10793C(j, 0L);
            }
            return c5057.m10793C(j / 1000, (j % 1000) * 1000000);
        }
        C5057 duration = interfaceC5865.getDuration();
        duration.getClass();
        if (j == 0) {
            duration = c5057;
        } else if (j != 1) {
            BigInteger bigIntegerExact = BigDecimal.valueOf(duration.f11851a).add(BigDecimal.valueOf(duration.f11852b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
            BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(f11850c);
            if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
                throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
            }
            duration = m10792s(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        return c5057.m10793C(duration.f11851a, 0L).m10793C(0L, duration.f11852b);
    }

    public static C5057 between(InterfaceC17263 interfaceC17263, InterfaceC17263 interfaceC17264) {
        try {
            return m10790n(interfaceC17263.mo7155g(interfaceC17264, EnumC10559.NANOS));
        } catch (ArithmeticException | C17796 unused) {
            long jMo7155g = interfaceC17263.mo7155g(interfaceC17264, EnumC10559.SECONDS);
            long j = 0;
            try {
                EnumC19947 enumC19947 = EnumC19947.NANO_OF_SECOND;
                long jMo6949G = interfaceC17264.mo6949G(enumC19947) - interfaceC17263.mo6949G(enumC19947);
                if (jMo7155g > 0 && jMo6949G < 0) {
                    jMo7155g++;
                } else if (jMo7155g < 0 && jMo6949G > 0) {
                    jMo7155g--;
                }
                j = jMo6949G;
            } catch (C17796 unused2) {
            }
            return m10792s(jMo7155g, j);
        }
    }

    /* JADX INFO: renamed from: m */
    public static C5057 m10789m(long j, int i) {
        if ((((long) i) | j) == 0) {
            return ZERO;
        }
        return new C5057(j, i);
    }

    public C5057(long j, int i) {
        this.f11851a = j;
        this.f11852b = i;
    }

    public boolean isZero() {
        return (this.f11851a | ((long) this.f11852b)) == 0;
    }

    public boolean isNegative() {
        return this.f11851a < 0;
    }

    /* JADX INFO: renamed from: C */
    public final C5057 m10793C(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m10792s(AbstractC24029.m53226P(AbstractC24029.m53226P(this.f11851a, j), j2 / 1000000000), ((long) this.f11852b) + (j2 % 1000000000));
    }

    @Override // p067l.InterfaceC13912
    /* JADX INFO: renamed from: l */
    public final InterfaceC17263 mo10794l(InterfaceC17263 interfaceC17263) {
        long j = this.f11851a;
        if (j != 0) {
            interfaceC17263 = interfaceC17263.mo7153d(j, EnumC10559.SECONDS);
        }
        int i = this.f11852b;
        return i != 0 ? interfaceC17263.mo7153d(i, EnumC10559.NANOS) : interfaceC17263;
    }

    public long toMillis() {
        long j = this.f11851a;
        long j2 = this.f11852b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC24029.m53226P(AbstractC24029.m53227Q(j, 1000), j2 / 1000000);
    }

    public long toNanos() {
        long j = this.f11851a;
        long j2 = this.f11852b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC24029.m53226P(AbstractC24029.m53227Q(j, 1000000000L), j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(C5057 c5057) {
        int iCompare = Long.compare(this.f11851a, c5057.f11851a);
        return iCompare != 0 ? iCompare : this.f11852b - c5057.f11852b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5057) {
            C5057 c5057 = (C5057) obj;
            if (this.f11851a == c5057.f11851a && this.f11852b == c5057.f11852b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f11851a;
        return (this.f11852b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.f11851a;
        if (j < 0 && this.f11852b > 0) {
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
        if (i2 == 0 && this.f11852b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.f11851a < 0 && this.f11852b > 0 && i2 == 0) {
            sb.append("-0");
        } else {
            sb.append(i2);
        }
        if (this.f11852b > 0) {
            int length = sb.length();
            if (this.f11851a < 0) {
                sb.append(2000000000 - ((long) this.f11852b));
            } else {
                sb.append(((long) this.f11852b) + 1000000000);
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
        return new C21959((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
