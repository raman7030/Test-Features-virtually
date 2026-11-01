package p067l;

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
public final class C9257 implements InterfaceC17263, InterfaceC5195, Comparable, Serializable {

    /* JADX INFO: renamed from: e */
    public static final C9257 f25129e;

    /* JADX INFO: renamed from: f */
    public static final C9257 f25130f;

    /* JADX INFO: renamed from: g */
    public static final C9257 f25131g;

    /* JADX INFO: renamed from: h */
    public static final C9257[] f25132h = new C9257[24];
    public static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a */
    public final byte f25133a;

    /* JADX INFO: renamed from: b */
    public final byte f25134b;

    /* JADX INFO: renamed from: c */
    public final byte f25135c;

    /* JADX INFO: renamed from: d */
    public final int f25136d;

    static {
        int i = 0;
        while (true) {
            C9257[] c9257Arr = f25132h;
            if (i < c9257Arr.length) {
                c9257Arr[i] = new C9257(i, 0, 0, 0);
                i++;
            } else {
                C9257 c9257 = c9257Arr[0];
                f25131g = c9257;
                C9257 c9258 = c9257Arr[12];
                f25129e = c9257;
                f25130f = new C9257(23, 59, 59, 999999999);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public static C9257 m21346Z(int i, int i2, int i3, int i4) {
        EnumC19947.HOUR_OF_DAY.m45273T(i);
        EnumC19947.MINUTE_OF_HOUR.m45273T(i2);
        EnumC19947.SECOND_OF_MINUTE.m45273T(i3);
        EnumC19947.NANO_OF_SECOND.m45273T(i4);
        return m21344W(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a0 */
    public static C9257 m21347a0(long j) {
        EnumC19947.NANO_OF_DAY.m45273T(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m21344W(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* JADX INFO: renamed from: X */
    public static C9257 m21345X(InterfaceC4524 interfaceC4524) {
        C12826.requireNonNull(interfaceC4524, "temporal");
        C9257 c9257 = (C9257) interfaceC4524.mo6950T(AbstractC7877.f20685g);
        if (c9257 != null) {
            return c9257;
        }
        throw new C17796("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName());
    }

    /* JADX INFO: renamed from: W */
    public static C9257 m21344W(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f25132h[i];
        }
        return new C9257(i, i2, i3, i4);
    }

    public C9257(int i, int i2, int i3, int i4) {
        this.f25133a = (byte) i;
        this.f25134b = (byte) i2;
        this.f25135c = (byte) i3;
        this.f25136d = i4;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).m45274V();
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return m21350Y(interfaceC11901);
        }
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (interfaceC11901 == EnumC19947.NANO_OF_DAY) {
                return m21356h0();
            }
            if (interfaceC11901 == EnumC19947.MICRO_OF_DAY) {
                return m21356h0() / 1000;
            }
            return m21350Y(interfaceC11901);
        }
        return interfaceC11901.mo3652C(this);
    }

    /* JADX INFO: renamed from: Y */
    public final int m21350Y(InterfaceC11901 interfaceC11901) {
        switch (AbstractC15291.f43626a[((EnumC19947) interfaceC11901).ordinal()]) {
            case 1:
                return this.f25136d;
            case 2:
                throw new C13242("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f25136d / 1000;
            case 4:
                throw new C13242("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f25136d / BasicLabelFormatter.MILLION;
            case 6:
                return (int) (m21356h0() / 1000000);
            case 7:
                return this.f25135c;
            case 8:
                return m21357i0();
            case 9:
                return this.f25134b;
            case 10:
                return (this.f25133a * 60) + this.f25134b;
            case 11:
                return this.f25133a % 12;
            case 12:
                int i = this.f25133a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f25133a;
            case 14:
                byte b = this.f25133a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f25133a / 12;
            default:
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final C9257 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return (C9257) interfaceC11901.mo3653G(this, j);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        enumC19947.m45273T(j);
        switch (AbstractC15291.f43626a[enumC19947.ordinal()]) {
            case 1:
                return m21359k0((int) j);
            case 2:
                return m21347a0(j);
            case 3:
                return m21359k0(((int) j) * 1000);
            case 4:
                return m21347a0(j * 1000);
            case 5:
                return m21359k0(((int) j) * BasicLabelFormatter.MILLION);
            case 6:
                return m21347a0(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f25135c != i) {
                    EnumC19947.SECOND_OF_MINUTE.m45273T(i);
                    return m21344W(this.f25133a, this.f25134b, i, this.f25136d);
                }
                return this;
            case 8:
                return m21355f0(j - ((long) m21357i0()));
            case 9:
                int i2 = (int) j;
                if (this.f25134b != i2) {
                    EnumC19947.MINUTE_OF_HOUR.m45273T(i2);
                    return m21344W(this.f25133a, i2, this.f25135c, this.f25136d);
                }
                return this;
            case 10:
                return m21353d0(j - ((long) ((this.f25133a * 60) + this.f25134b)));
            case 11:
                return m21352c0(j - ((long) (this.f25133a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return m21352c0(j - ((long) (this.f25133a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.f25133a != i3) {
                    EnumC19947.HOUR_OF_DAY.m45273T(i3);
                    return m21344W(i3, this.f25134b, this.f25135c, this.f25136d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.f25133a != i4) {
                    EnumC19947.HOUR_OF_DAY.m45273T(i4);
                    return m21344W(i4, this.f25134b, this.f25135c, this.f25136d);
                }
                return this;
            case 15:
                return m21352c0((j - ((long) (this.f25133a / 12))) * 12);
            default:
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final C9257 m21359k0(int i) {
        if (this.f25136d == i) {
            return this;
        }
        EnumC19947.NANO_OF_SECOND.m45273T(i);
        return m21344W(this.f25133a, this.f25134b, this.f25135c, i);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C9257 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (interfaceC5865 instanceof EnumC10559) {
            switch (AbstractC15291.f43627b[((EnumC10559) interfaceC5865).ordinal()]) {
                case 1:
                    return m21354e0(j);
                case 2:
                    return m21354e0((j % 86400000000L) * 1000);
                case 3:
                    return m21354e0((j % 86400000) * 1000000);
                case 4:
                    return m21355f0(j);
                case 5:
                    return m21353d0(j);
                case 6:
                    return m21352c0(j);
                case 7:
                    return m21352c0((j % 2) * 12);
                default:
                    throw new C13242("Unsupported unit: " + interfaceC5865);
            }
        }
        return (C9257) interfaceC5865.mo13170m(this, j);
    }

    /* JADX INFO: renamed from: c0 */
    public final C9257 m21352c0(long j) {
        return j == 0 ? this : m21344W(((((int) (j % 24)) + this.f25133a) + 24) % 24, this.f25134b, this.f25135c, this.f25136d);
    }

    /* JADX INFO: renamed from: d0 */
    public final C9257 m21353d0(long j) {
        if (j != 0) {
            int i = (this.f25133a * 60) + this.f25134b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return m21344W(i2 / 60, i2 % 60, this.f25135c, this.f25136d);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: f0 */
    public final C9257 m21355f0(long j) {
        if (j != 0) {
            int i = (this.f25134b * 60) + (this.f25133a * 3600) + this.f25135c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return m21344W(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f25136d);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e0 */
    public final C9257 m21354e0(long j) {
        if (j != 0) {
            long jM21356h0 = m21356h0();
            long j2 = (((j % 86400000000000L) + jM21356h0) + 86400000000000L) % 86400000000000L;
            if (jM21356h0 != j2) {
                return m21344W((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, enumC10559).mo7153d(1L, enumC10559) : mo7153d(-j, enumC10559);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20680b || c10500 == AbstractC7877.f20679a || c10500 == AbstractC7877.f20683e || c10500 == AbstractC7877.f20682d) {
            return null;
        }
        if (c10500 == AbstractC7877.f20685g) {
            return this;
        }
        if (c10500 == AbstractC7877.f20684f) {
            return null;
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.NANOS;
        }
        return c10500.m24242h(this);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(m21356h0(), EnumC19947.NANO_OF_DAY);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C9257 c9257M21345X = m21345X(interfaceC17263);
        if (interfaceC5865 instanceof EnumC10559) {
            long jM21356h0 = c9257M21345X.m21356h0() - m21356h0();
            switch (AbstractC15291.f43627b[((EnumC10559) interfaceC5865).ordinal()]) {
                case 1:
                    return jM21356h0;
                case 2:
                    return jM21356h0 / 1000;
                case 3:
                    return jM21356h0 / 1000000;
                case 4:
                    return jM21356h0 / 1000000000;
                case 5:
                    return jM21356h0 / 60000000000L;
                case 6:
                    return jM21356h0 / 3600000000000L;
                case 7:
                    return jM21356h0 / 43200000000000L;
                default:
                    throw new C13242("Unsupported unit: " + interfaceC5865);
            }
        }
        return interfaceC5865.mo13169l(this, c9257M21345X);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m21357i0() {
        return (this.f25134b * 60) + (this.f25133a * 3600) + this.f25135c;
    }

    /* JADX INFO: renamed from: h0 */
    public final long m21356h0() {
        return (((long) this.f25135c) * 1000000000) + (((long) this.f25134b) * 60000000000L) + (((long) this.f25133a) * 3600000000000L) + ((long) this.f25136d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C9257 c9257) {
        int iCompare = Integer.compare(this.f25133a, c9257.f25133a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f25134b, c9257.f25134b)) == 0 && (iCompare = Integer.compare(this.f25135c, c9257.f25135c)) == 0) ? Integer.compare(this.f25136d, c9257.f25136d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9257) {
            C9257 c9257 = (C9257) obj;
            if (this.f25133a == c9257.f25133a && this.f25134b == c9257.f25134b && this.f25135c == c9257.f25135c && this.f25136d == c9257.f25136d) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C9257) AbstractC24029.m53232a(c20480, this);
    }

    public final int hashCode() {
        long jM21356h0 = m21356h0();
        return (int) (jM21356h0 ^ (jM21356h0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f25133a;
        byte b2 = this.f25134b;
        byte b3 = this.f25135c;
        int i = this.f25136d;
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
        return new C21959((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: l0 */
    public final void m21360l0(DataOutput dataOutput) throws IOException {
        if (this.f25136d == 0) {
            if (this.f25135c == 0) {
                if (this.f25134b == 0) {
                    dataOutput.writeByte(~this.f25133a);
                    return;
                } else {
                    dataOutput.writeByte(this.f25133a);
                    dataOutput.writeByte(~this.f25134b);
                    return;
                }
            }
            dataOutput.writeByte(this.f25133a);
            dataOutput.writeByte(this.f25134b);
            dataOutput.writeByte(~this.f25135c);
            return;
        }
        dataOutput.writeByte(this.f25133a);
        dataOutput.writeByte(this.f25134b);
        dataOutput.writeByte(this.f25135c);
        dataOutput.writeInt(this.f25136d);
    }

    /* JADX INFO: renamed from: g0 */
    public static C9257 m21348g0(DataInput dataInput) throws IOException {
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
            return m21346Z(i4, i5, i, i2);
        }
        i4 = ~i4;
        i3 = 0;
        i = i3;
        i2 = 0;
        return m21346Z(i4, i5, i, i2);
    }
}
