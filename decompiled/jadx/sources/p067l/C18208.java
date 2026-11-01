package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܽ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18208 implements InterfaceC17263, InterfaceC5195, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f54352c = 0;
    public static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a */
    public final int f54353a;

    /* JADX INFO: renamed from: b */
    public final int f54354b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18208 c18208 = (C18208) obj;
        int i = this.f54353a - c18208.f54353a;
        return i == 0 ? this.f54354b - c18208.f54354b : i;
    }

    static {
        C6575 c6575 = new C6575();
        c6575.m15024m(EnumC19947.YEAR, 4, 10, EnumC24680.EXCEEDS_PAD);
        c6575.m15015d('-');
        c6575.m15023l(EnumC19947.MONTH_OF_YEAR, 2);
        c6575.m15028q(Locale.getDefault(), EnumC18645.SMART, null);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C18208 c18208;
        if (interfaceC17263 instanceof C18208) {
            c18208 = (C18208) interfaceC17263;
        } else {
            C12826.requireNonNull(interfaceC17263, "temporal");
            try {
                if (!C10361.f28676c.equals(AbstractC17736.m40316r(interfaceC17263))) {
                    interfaceC17263 = C20480.m46185X(interfaceC17263);
                }
                EnumC19947 enumC19947 = EnumC19947.YEAR;
                int iMo6952l = interfaceC17263.mo6952l(enumC19947);
                EnumC19947 enumC19948 = EnumC19947.MONTH_OF_YEAR;
                int iMo6952l2 = interfaceC17263.mo6952l(enumC19948);
                enumC19947.m45273T(iMo6952l);
                enumC19948.m45273T(iMo6952l2);
                c18208 = new C18208(iMo6952l, iMo6952l2);
            } catch (C17796 e) {
                throw new C17796("Unable to obtain YearMonth from TemporalAccessor: " + interfaceC17263 + " of type " + interfaceC17263.getClass().getName(), e);
            }
        }
        if (interfaceC5865 instanceof EnumC10559) {
            long jM41409V = c18208.m41409V() - m41409V();
            switch (AbstractC12845.f36137b[((EnumC10559) interfaceC5865).ordinal()]) {
                case 1:
                    return jM41409V;
                case 2:
                    return jM41409V / 12;
                case 3:
                    return jM41409V / 120;
                case 4:
                    return jM41409V / 1200;
                case 5:
                    return jM41409V / 12000;
                case 6:
                    EnumC19947 enumC19949 = EnumC19947.ERA;
                    return c18208.mo6949G(enumC19949) - mo6949G(enumC19949);
                default:
                    throw new C13242("Unsupported unit: " + interfaceC5865);
            }
        }
        return interfaceC5865.mo13169l(this, c18208);
    }

    public C18208(int i, int i2) {
        this.f54353a = i;
        this.f54354b = i2;
    }

    /* JADX INFO: renamed from: Z */
    public final C18208 m41413Z(int i, int i2) {
        return (this.f54353a == i && this.f54354b == i2) ? this : new C18208(i, i2);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.YEAR || interfaceC11901 == EnumC19947.MONTH_OF_YEAR || interfaceC11901 == EnumC19947.PROLEPTIC_MONTH || interfaceC11901 == EnumC19947.YEAR_OF_ERA || interfaceC11901 == EnumC19947.ERA;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.YEAR_OF_ERA) {
            return C23970.m53119f(1L, this.f54353a <= 0 ? 1000000000L : 999999999L);
        }
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        return mo6953n(interfaceC11901).m53121a(mo6949G(interfaceC11901), interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        int i;
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        int i2 = AbstractC12845.f36136a[((EnumC19947) interfaceC11901).ordinal()];
        if (i2 == 1) {
            i = this.f54354b;
        } else {
            if (i2 == 2) {
                return m41409V();
            }
            if (i2 == 3) {
                int i3 = this.f54353a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.f54353a < 1 ? 0 : 1;
                }
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
            }
            i = this.f54353a;
        }
        return i;
    }

    /* JADX INFO: renamed from: V */
    public final long m41409V() {
        return ((((long) this.f54353a) * 12) + ((long) this.f54354b)) - 1;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C18208 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return (C18208) interfaceC11901.mo3653G(this, j);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        enumC19947.m45273T(j);
        int i = AbstractC12845.f36136a[enumC19947.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            EnumC19947.MONTH_OF_YEAR.m45273T(i2);
            return m41413Z(this.f54353a, i2);
        }
        if (i == 2) {
            return m41411X(j - m41409V());
        }
        if (i == 3) {
            if (this.f54353a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            EnumC19947.YEAR.m45273T(i3);
            return m41413Z(i3, this.f54354b);
        }
        if (i == 4) {
            int i4 = (int) j;
            EnumC19947.YEAR.m45273T(i4);
            return m41413Z(i4, this.f54354b);
        }
        if (i != 5) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        if (mo6949G(EnumC19947.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.f54353a;
        EnumC19947.YEAR.m45273T(i5);
        return m41413Z(i5, this.f54354b);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C18208 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return (C18208) interfaceC5865.mo13170m(this, j);
        }
        switch (AbstractC12845.f36137b[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return m41411X(j);
            case 2:
                return m41412Y(j);
            case 3:
                return m41412Y(AbstractC24029.m53227Q(j, 10));
            case 4:
                return m41412Y(AbstractC24029.m53227Q(j, 100));
            case 5:
                return m41412Y(AbstractC24029.m53227Q(j, 1000));
            case 6:
                EnumC19947 enumC19947 = EnumC19947.ERA;
                return mo7152c(AbstractC24029.m53226P(mo6949G(enumC19947), j), enumC19947);
            default:
                throw new C13242("Unsupported unit: " + interfaceC5865);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final C18208 m41412Y(long j) {
        if (j == 0) {
            return this;
        }
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        return m41413Z(enumC19947.f60552b.m53121a(((long) this.f54353a) + j, enumC19947), this.f54354b);
    }

    /* JADX INFO: renamed from: X */
    public final C18208 m41411X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f54353a) * 12) + ((long) (this.f54354b - 1)) + j;
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        long j3 = 12;
        return m41413Z(enumC19947.f60552b.m53121a(AbstractC24029.m53257z(j2, j3), enumC19947), ((int) AbstractC24029.m53225O(j2, j3)) + 1);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, enumC10559).mo7153d(1L, enumC10559) : mo7153d(-j, enumC10559);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20680b) {
            return C10361.f28676c;
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.MONTHS;
        }
        return AbstractC7877.m18195c(this, c10500);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        if (!AbstractC17736.m40316r(interfaceC17263).equals(C10361.f28676c)) {
            throw new C17796("Adjustment only supported on ISO date-time");
        }
        return interfaceC17263.mo7152c(m41409V(), EnumC19947.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18208) {
            C18208 c18208 = (C18208) obj;
            if (this.f54353a == c18208.f54353a && this.f54354b == c18208.f54354b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f54353a ^ (this.f54354b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f54353a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.f54353a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.f54353a);
        }
        sb.append(this.f54354b < 10 ? "-0" : "-");
        sb.append(this.f54354b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21959((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C18208) AbstractC24029.m53232a(c20480, this);
    }
}
