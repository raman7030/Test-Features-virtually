package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7248 implements InterfaceC15672, InterfaceC2974, Comparable, Serializable {
    public static final C7248 e;
    public static final C7248 f;
    public static final C7248 g;
    public static final C7248[] h = new C7248[24];
    public static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            C7248[] c7248Arr = h;
            if (i < c7248Arr.length) {
                c7248Arr[i] = new C7248(i, 0, 0, 0);
                i++;
            } else {
                C7248 c7248 = c7248Arr[0];
                g = c7248;
                C7248 c7249 = c7248Arr[12];
                e = c7248;
                f = new C7248(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static C7248 Z(int i, int i2, int i3, int i4) {
        EnumC18496.HOUR_OF_DAY.T(i);
        EnumC18496.MINUTE_OF_HOUR.T(i2);
        EnumC18496.SECOND_OF_MINUTE.T(i3);
        EnumC18496.NANO_OF_SECOND.T(i4);
        return W(i, i2, i3, i4);
    }

    public static C7248 a0(long j) {
        EnumC18496.NANO_OF_DAY.T(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return W(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static C7248 X(InterfaceC2268 interfaceC2268) {
        C11003.requireNonNull(interfaceC2268, "temporal");
        C7248 c7248 = (C7248) interfaceC2268.T(AbstractC5796.g);
        if (c7248 != null) {
            return c7248;
        }
        throw new C16232("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName());
    }

    public static C7248 W(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new C7248(i, i2, i3, i4);
    }

    public C7248(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).V();
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
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
            if (interfaceC10030 == EnumC18496.NANO_OF_DAY) {
                return h0();
            }
            if (interfaceC10030 == EnumC18496.MICRO_OF_DAY) {
                return h0() / 1000;
            }
            return Y(interfaceC10030);
        }
        return interfaceC10030.C(this);
    }

    public final int Y(InterfaceC10030 interfaceC10030) {
        switch (AbstractC13597.a[((EnumC18496) interfaceC10030).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new C11441("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new C11441("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / BasicLabelFormatter.MILLION;
            case 6:
                return (int) (h0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return i0();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final C7248 c(long j, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return (C7248) interfaceC10030.G(this, j);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        enumC18496.T(j);
        switch (AbstractC13597.a[enumC18496.ordinal()]) {
            case 1:
                return k0((int) j);
            case 2:
                return a0(j);
            case 3:
                return k0(((int) j) * 1000);
            case 4:
                return a0(j * 1000);
            case 5:
                return k0(((int) j) * BasicLabelFormatter.MILLION);
            case 6:
                return a0(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    EnumC18496.SECOND_OF_MINUTE.T(i);
                    return W(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return f0(j - ((long) i0()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    EnumC18496.MINUTE_OF_HOUR.T(i2);
                    return W(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return d0(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return c0(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return c0(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    EnumC18496.HOUR_OF_DAY.T(i3);
                    return W(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    EnumC18496.HOUR_OF_DAY.T(i4);
                    return W(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return c0((j - ((long) (this.a / 12))) * 12);
            default:
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
    }

    public final C7248 k0(int i) {
        if (this.d == i) {
            return this;
        }
        EnumC18496.NANO_OF_SECOND.T(i);
        return W(this.a, this.b, this.c, i);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C7248 d(long j, InterfaceC3679 interfaceC3679) {
        if (interfaceC3679 instanceof EnumC8618) {
            switch (AbstractC13597.b[((EnumC8618) interfaceC3679).ordinal()]) {
                case 1:
                    return e0(j);
                case 2:
                    return e0((j % 86400000000L) * 1000);
                case 3:
                    return e0((j % 86400000) * 1000000);
                case 4:
                    return f0(j);
                case 5:
                    return d0(j);
                case 6:
                    return c0(j);
                case 7:
                    return c0((j % 2) * 12);
                default:
                    throw new C11441("Unsupported unit: " + interfaceC3679);
            }
        }
        return (C7248) interfaceC3679.m(this, j);
    }

    public final C7248 c0(long j) {
        return j == 0 ? this : W(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final C7248 d0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return W(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final C7248 f0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return W(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final C7248 e0(long j) {
        if (j != 0) {
            long jH0 = h0();
            long j2 = (((j % 86400000000000L) + jH0) + 86400000000000L) % 86400000000000L;
            if (jH0 != j2) {
                return W((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return j == Long.MIN_VALUE ? d(C13132.FOREVER_NS, enumC8618).d(1L, enumC8618) : d(-j, enumC8618);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.b || c8556 == AbstractC5796.a || c8556 == AbstractC5796.e || c8556 == AbstractC5796.d) {
            return null;
        }
        if (c8556 == AbstractC5796.g) {
            return this;
        }
        if (c8556 == AbstractC5796.f) {
            return null;
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.NANOS;
        }
        return c8556.h(this);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(h0(), EnumC18496.NANO_OF_DAY);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C7248 c7248X = X(interfaceC15672);
        if (interfaceC3679 instanceof EnumC8618) {
            long jH0 = c7248X.h0() - h0();
            switch (AbstractC13597.b[((EnumC8618) interfaceC3679).ordinal()]) {
                case 1:
                    return jH0;
                case 2:
                    return jH0 / 1000;
                case 3:
                    return jH0 / 1000000;
                case 4:
                    return jH0 / 1000000000;
                case 5:
                    return jH0 / 60000000000L;
                case 6:
                    return jH0 / 3600000000000L;
                case 7:
                    return jH0 / 43200000000000L;
                default:
                    throw new C11441("Unsupported unit: " + interfaceC3679);
            }
        }
        return interfaceC3679.l(this, c7248X);
    }

    public final int i0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long h0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C7248 c7248) {
        int iCompare = Integer.compare(this.a, c7248.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, c7248.b)) == 0 && (iCompare = Integer.compare(this.c, c7248.c)) == 0) ? Integer.compare(this.d, c7248.d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7248) {
            C7248 c7248 = (C7248) obj;
            if (this.a == c7248.a && this.b == c7248.b && this.c == c7248.c && this.d == c7248.d) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C7248) AbstractC22791.a(c19056, this);
    }

    public final int hashCode() {
        long jH0 = h0();
        return (int) (jH0 ^ (jH0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % BasicLabelFormatter.MILLION == 0) {
                    sb.append(Integer.toString((i / BasicLabelFormatter.MILLION) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + BasicLabelFormatter.MILLION).substring(1));
                } else {
                    sb.append(Integer.toString(i + BasicLabelFormatter.BILLION).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C20613((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void l0(DataOutput dataOutput) throws IOException {
        if (this.d == 0) {
            if (this.c == 0) {
                if (this.b == 0) {
                    dataOutput.writeByte(~this.a);
                    return;
                } else {
                    dataOutput.writeByte(this.a);
                    dataOutput.writeByte(~this.b);
                    return;
                }
            }
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
        dataOutput.writeInt(this.d);
    }

    public static C7248 g0(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = dataInput.readByte();
        int i5 = 0;
        if (i4 >= 0) {
            i5 = dataInput.readByte();
            if (i5 < 0) {
                i5 = ~i5;
                i2 = 0;
                i = 0;
            } else {
                i = dataInput.readByte();
                if (i < 0) {
                    i3 = ~i;
                } else {
                    i2 = dataInput.readInt();
                }
            }
            return Z(i4, i5, i, i2);
        }
        i4 = ~i4;
        i3 = 0;
        i = i3;
        i2 = 0;
        return Z(i4, i5, i, i2);
    }
}
