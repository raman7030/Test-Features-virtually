package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۘ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6398 implements InterfaceC17263, InterfaceC5195, Comparable, Serializable {
    public static final C6398 EPOCH = new C6398(0, 0);

    /* JADX INFO: renamed from: c */
    public static final C6398 f16562c = ofEpochSecond(-31557014167219200L, 0);

    /* JADX INFO: renamed from: d */
    public static final C6398 f16563d = ofEpochSecond(31556889864403199L, 999999999);
    public static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a */
    public final long f16564a;

    /* JADX INFO: renamed from: b */
    public final int f16565b;

    public static C6398 now() {
        return AbstractC11092.systemUTC().instant();
    }

    public static C6398 ofEpochSecond(long j) {
        return m14640V(j, 0);
    }

    public static C6398 ofEpochSecond(long j, long j2) {
        return m14640V(AbstractC24029.m53226P(j, AbstractC24029.m53257z(j2, 1000000000L)), (int) AbstractC24029.m53225O(j2, 1000000000L));
    }

    public static C6398 ofEpochMilli(long j) {
        long j2 = 1000;
        return m14640V(AbstractC24029.m53257z(j, j2), ((int) AbstractC24029.m53225O(j, j2)) * BasicLabelFormatter.MILLION);
    }

    /* JADX INFO: renamed from: W */
    public static C6398 m14641W(InterfaceC4524 interfaceC4524) {
        if (interfaceC4524 instanceof C6398) {
            return (C6398) interfaceC4524;
        }
        C12826.requireNonNull(interfaceC4524, "temporal");
        try {
            return ofEpochSecond(interfaceC4524.mo6949G(EnumC19947.INSTANT_SECONDS), interfaceC4524.mo6952l(EnumC19947.NANO_OF_SECOND));
        } catch (C17796 e) {
            throw new C17796("Unable to obtain Instant from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: V */
    public static C6398 m14640V(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C17796("Instant exceeds minimum or maximum instant");
        }
        return new C6398(j, i);
    }

    public C6398(long j, int i) {
        this.f16564a = j;
        this.f16565b = i;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.INSTANT_SECONDS || interfaceC11901 == EnumC19947.NANO_OF_SECOND || interfaceC11901 == EnumC19947.MICRO_OF_SECOND || interfaceC11901 == EnumC19947.MILLI_OF_SECOND;
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
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return AbstractC7877.m18196d(this, interfaceC11901).m53121a(interfaceC11901.mo3652C(this), interfaceC11901);
        }
        int i = AbstractC14384.f41114a[((EnumC19947) interfaceC11901).ordinal()];
        if (i == 1) {
            return this.f16565b;
        }
        if (i == 2) {
            return this.f16565b / 1000;
        }
        if (i == 3) {
            return this.f16565b / BasicLabelFormatter.MILLION;
        }
        if (i == 4) {
            EnumC19947 enumC19947 = EnumC19947.INSTANT_SECONDS;
            enumC19947.f60552b.m53121a(this.f16564a, enumC19947);
        }
        throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        int i;
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        int i2 = AbstractC14384.f41114a[((EnumC19947) interfaceC11901).ordinal()];
        if (i2 == 1) {
            i = this.f16565b;
        } else if (i2 == 2) {
            i = this.f16565b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.f16564a;
                }
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
            }
            i = this.f16565b / BasicLabelFormatter.MILLION;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.f16564a;
    }

    public int getNano() {
        return this.f16565b;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: c */
    public final InterfaceC17263 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return (C6398) interfaceC11901.mo3653G(this, j);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        enumC19947.m45273T(j);
        int i = AbstractC14384.f41114a[enumC19947.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.f16565b) {
                    return m14640V(this.f16564a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * BasicLabelFormatter.MILLION;
                if (i3 != this.f16565b) {
                    return m14640V(this.f16564a, i3);
                }
            } else {
                if (i != 4) {
                    throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
                }
                if (j != this.f16564a) {
                    return m14640V(j, this.f16565b);
                }
            }
        } else if (j != this.f16565b) {
            return m14640V(this.f16564a, (int) j);
        }
        return this;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C6398 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return (C6398) interfaceC5865.mo13170m(this, j);
        }
        switch (AbstractC14384.f41115b[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return m14642X(0L, j);
            case 2:
                return m14642X(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m14642X(j / 1000, (j % 1000) * 1000000);
            case 4:
                return m14642X(j, 0L);
            case 5:
                return m14642X(AbstractC24029.m53227Q(j, 60), 0L);
            case 6:
                return m14642X(AbstractC24029.m53227Q(j, 3600), 0L);
            case 7:
                return m14642X(AbstractC24029.m53227Q(j, 43200), 0L);
            case 8:
                return m14642X(AbstractC24029.m53227Q(j, 86400), 0L);
            default:
                throw new C13242("Unsupported unit: " + interfaceC5865);
        }
    }

    /* JADX INFO: renamed from: X */
    public final C6398 m14642X(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(AbstractC24029.m53226P(AbstractC24029.m53226P(this.f16564a, j), j2 / 1000000000), ((long) this.f16565b) + (j2 % 1000000000));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, enumC10559).mo7153d(1L, enumC10559) : mo7153d(-j, enumC10559);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.NANOS;
        }
        if (c10500 == AbstractC7877.f20680b || c10500 == AbstractC7877.f20679a || c10500 == AbstractC7877.f20683e || c10500 == AbstractC7877.f20682d || c10500 == AbstractC7877.f20684f || c10500 == AbstractC7877.f20685g) {
            return null;
        }
        return c10500.m24242h(this);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(this.f16564a, EnumC19947.INSTANT_SECONDS).mo7152c(this.f16565b, EnumC19947.NANO_OF_SECOND);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C6398 c6398M14641W = m14641W(interfaceC17263);
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return interfaceC5865.mo13169l(this, c6398M14641W);
        }
        switch (AbstractC14384.f41115b[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return AbstractC24029.m53226P(AbstractC24029.m53227Q(AbstractC24029.m53228R(c6398M14641W.f16564a, this.f16564a), 1000000000L), c6398M14641W.f16565b - this.f16565b);
            case 2:
                return AbstractC24029.m53226P(AbstractC24029.m53227Q(AbstractC24029.m53228R(c6398M14641W.f16564a, this.f16564a), 1000000000L), c6398M14641W.f16565b - this.f16565b) / 1000;
            case 3:
                return AbstractC24029.m53228R(c6398M14641W.toEpochMilli(), toEpochMilli());
            case 4:
                return m14644Z(c6398M14641W);
            case 5:
                return m14644Z(c6398M14641W) / 60;
            case 6:
                return m14644Z(c6398M14641W) / 3600;
            case 7:
                return m14644Z(c6398M14641W) / 43200;
            case 8:
                return m14644Z(c6398M14641W) / 86400;
            default:
                throw new C13242("Unsupported unit: " + interfaceC5865);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final long m14644Z(C6398 c6398) {
        long jM53228R = AbstractC24029.m53228R(c6398.f16564a, this.f16564a);
        long j = c6398.f16565b - this.f16565b;
        if (jM53228R <= 0 || j >= 0) {
            return (jM53228R >= 0 || j <= 0) ? jM53228R : jM53228R + 1;
        }
        return jM53228R - 1;
    }

    public C3715 atZone(AbstractC7739 abstractC7739) {
        return C3715.ofInstant(this, abstractC7739);
    }

    public long toEpochMilli() {
        long j = this.f16564a;
        return (j >= 0 || this.f16565b <= 0) ? AbstractC24029.m53226P(AbstractC24029.m53227Q(j, 1000), this.f16565b / BasicLabelFormatter.MILLION) : AbstractC24029.m53226P(AbstractC24029.m53227Q(j + 1, 1000), (this.f16565b / BasicLabelFormatter.MILLION) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(C6398 c6398) {
        int iCompare = Long.compare(this.f16564a, c6398.f16564a);
        return iCompare != 0 ? iCompare : this.f16565b - c6398.f16565b;
    }

    public boolean isAfter(C6398 c6398) {
        return compareTo(c6398) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6398) {
            C6398 c6398 = (C6398) obj;
            if (this.f16564a == c6398.f16564a && this.f16565b == c6398.f16565b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16564a;
        return (this.f16565b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return C8349.f22320h.format(this);
    }

    private Object writeReplace() {
        return new C21959((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C6398) AbstractC24029.m53232a(c20480, this);
    }
}
