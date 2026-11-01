package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4127 implements InterfaceC17263, InterfaceC5195, Comparable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f9109b = 0;
    public static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a */
    public final int f9110a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9110a - ((C4127) obj).f9110a;
    }

    static {
        C6575 c6575 = new C6575();
        c6575.m15024m(EnumC19947.YEAR, 4, 10, EnumC24680.EXCEEDS_PAD);
        c6575.m15028q(Locale.getDefault(), EnumC18645.SMART, null);
    }

    /* JADX INFO: renamed from: V */
    public static C4127 m8359V(int i) {
        EnumC19947.YEAR.m45273T(i);
        return new C4127(i);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C4127 c4127M8359V;
        if (interfaceC17263 instanceof C4127) {
            c4127M8359V = (C4127) interfaceC17263;
        } else {
            C12826.requireNonNull(interfaceC17263, "temporal");
            try {
                if (!C10361.f28676c.equals(AbstractC17736.m40316r(interfaceC17263))) {
                    interfaceC17263 = C20480.m46185X(interfaceC17263);
                }
                c4127M8359V = m8359V(interfaceC17263.mo6952l(EnumC19947.YEAR));
            } catch (C17796 e) {
                throw new C17796("Unable to obtain Year from TemporalAccessor: " + interfaceC17263 + " of type " + interfaceC17263.getClass().getName(), e);
            }
        }
        if (interfaceC5865 instanceof EnumC10559) {
            long j = ((long) c4127M8359V.f9110a) - ((long) this.f9110a);
            int i = AbstractC11230.f31236b[((EnumC10559) interfaceC5865).ordinal()];
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
                EnumC19947 enumC19947 = EnumC19947.ERA;
                return c4127M8359V.mo6949G(enumC19947) - mo6949G(enumC19947);
            }
            throw new C13242("Unsupported unit: " + interfaceC5865);
        }
        return interfaceC5865.mo13169l(this, c4127M8359V);
    }

    public C4127(int i) {
        this.f9110a = i;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.YEAR || interfaceC11901 == EnumC19947.YEAR_OF_ERA || interfaceC11901 == EnumC19947.ERA;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.YEAR_OF_ERA) {
            return C23970.m53119f(1L, this.f9110a <= 0 ? 1000000000L : 999999999L);
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
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        int i = AbstractC11230.f31235a[((EnumC19947) interfaceC11901).ordinal()];
        if (i == 1) {
            int i2 = this.f9110a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.f9110a;
        }
        if (i == 3) {
            return this.f9110a < 1 ? 0 : 1;
        }
        throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C4127 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return (C4127) interfaceC11901.mo3653G(this, j);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        enumC19947.m45273T(j);
        int i = AbstractC11230.f31235a[enumC19947.ordinal()];
        if (i == 1) {
            if (this.f9110a < 1) {
                j = 1 - j;
            }
            return m8359V((int) j);
        }
        if (i == 2) {
            return m8359V((int) j);
        }
        if (i == 3) {
            return mo6949G(EnumC19947.ERA) == j ? this : m8359V(1 - this.f9110a);
        }
        throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C4127 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return (C4127) interfaceC5865.mo13170m(this, j);
        }
        int i = AbstractC11230.f31236b[((EnumC10559) interfaceC5865).ordinal()];
        if (i == 1) {
            return m8361X(j);
        }
        if (i == 2) {
            return m8361X(AbstractC24029.m53227Q(j, 10));
        }
        if (i == 3) {
            return m8361X(AbstractC24029.m53227Q(j, 100));
        }
        if (i == 4) {
            return m8361X(AbstractC24029.m53227Q(j, 1000));
        }
        if (i == 5) {
            EnumC19947 enumC19947 = EnumC19947.ERA;
            return mo7152c(AbstractC24029.m53226P(mo6949G(enumC19947), j), enumC19947);
        }
        throw new C13242("Unsupported unit: " + interfaceC5865);
    }

    /* JADX INFO: renamed from: X */
    public final C4127 m8361X(long j) {
        if (j == 0) {
            return this;
        }
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        return m8359V(enumC19947.f60552b.m53121a(((long) this.f9110a) + j, enumC19947));
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
            return EnumC10559.YEARS;
        }
        return AbstractC7877.m18195c(this, c10500);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        if (!AbstractC17736.m40316r(interfaceC17263).equals(C10361.f28676c)) {
            throw new C17796("Adjustment only supported on ISO date-time");
        }
        return interfaceC17263.mo7152c(this.f9110a, EnumC19947.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4127) && this.f9110a == ((C4127) obj).f9110a;
    }

    public final int hashCode() {
        return this.f9110a;
    }

    public final String toString() {
        return Integer.toString(this.f9110a);
    }

    private Object writeReplace() {
        return new C21959((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C4127) AbstractC24029.m53232a(c20480, this);
    }
}
