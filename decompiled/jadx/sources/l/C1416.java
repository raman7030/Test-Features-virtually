package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1416 implements InterfaceC15672, InterfaceC22583, Serializable {
    public static final long serialVersionUID = -6260982410461394882L;
    public final C22770 a;
    public final C18078 b;
    public final AbstractC5650 c;

    @Override // l.InterfaceC22583
    public final /* synthetic */ long U() {
        return AbstractC22791.k(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC22791.d(this, (InterfaceC22583) obj);
    }

    @Override // l.InterfaceC22583
    public final InterfaceC2765 a() {
        return ((C19056) f()).a();
    }

    public static C1416 W(C22770 c22770, AbstractC5650 abstractC5650, C18078 c18078) {
        C11003.requireNonNull(c22770, "localDateTime");
        C11003.requireNonNull(abstractC5650, "zone");
        if (abstractC5650 instanceof C18078) {
            return new C1416(c22770, abstractC5650, (C18078) abstractC5650);
        }
        C15960 c15960W = abstractC5650.W();
        List listF = c15960W.f(c22770);
        if (listF.size() == 1) {
            c18078 = (C18078) listF.get(0);
        } else if (listF.size() != 0) {
            if (c18078 == null || !listF.contains(c18078)) {
                c18078 = (C18078) C11003.requireNonNull((C18078) listF.get(0), "offset");
            }
        } else {
            Object objE = c15960W.e(c22770);
            C6789 c6789 = objE instanceof C6789 ? (C6789) objE : null;
            c22770 = c22770.b0(C2828.ofSeconds(c6789.d.b - c6789.c.b).a);
            c18078 = c6789.d;
        }
        return new C1416(c22770, abstractC5650, c18078);
    }

    public static C1416 ofInstant(C4239 c4239, AbstractC5650 abstractC5650) {
        C11003.requireNonNull(c4239, "instant");
        C11003.requireNonNull(abstractC5650, "zone");
        return s(c4239.getEpochSecond(), c4239.getNano(), abstractC5650);
    }

    public static C1416 s(long j, int i, AbstractC5650 abstractC5650) {
        C18078 c18078D = abstractC5650.W().d(C4239.ofEpochSecond(j, i));
        return new C1416(C22770.Z(j, i, c18078D), abstractC5650, c18078D);
    }

    @Override // l.InterfaceC22583
    public final C4239 toInstant() {
        return C4239.ofEpochSecond(U(), b().d);
    }

    public static C1416 V(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268 instanceof C1416) {
            return (C1416) interfaceC2268;
        }
        try {
            AbstractC5650 abstractC5650V = AbstractC5650.V(interfaceC2268);
            EnumC18496 enumC18496 = EnumC18496.INSTANT_SECONDS;
            if (!interfaceC2268.e(enumC18496)) {
                return W(C22770.Y(C19056.X(interfaceC2268), C7248.X(interfaceC2268)), abstractC5650V, null);
            }
            return s(interfaceC2268.G(enumC18496), interfaceC2268.l(EnumC18496.NANO_OF_SECOND), abstractC5650V);
        } catch (C16232 e) {
            throw new C16232("Unable to obtain ZonedDateTime from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName(), e);
        }
    }

    public C1416(C22770 c22770, AbstractC5650 abstractC5650, C18078 c18078) {
        this.a = c22770;
        this.b = c18078;
        this.c = abstractC5650;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return true;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (interfaceC10030 == EnumC18496.INSTANT_SECONDS || interfaceC10030 == EnumC18496.OFFSET_SECONDS) {
                return ((EnumC18496) interfaceC10030).b;
            }
            return this.a.n(interfaceC10030);
        }
        return interfaceC10030.m(this);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            int i = AbstractC14549.a[((EnumC18496) interfaceC10030).ordinal()];
            if (i == 1) {
                throw new C11441("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.l(interfaceC10030);
        }
        return AbstractC22791.e(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        int i = AbstractC14549.a[((EnumC18496) interfaceC10030).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.G(interfaceC10030) : this.b.b;
        }
        return AbstractC22791.k(this);
    }

    @Override // l.InterfaceC22583
    public final C18078 h() {
        return this.b;
    }

    @Override // l.InterfaceC22583
    public final AbstractC5650 F() {
        return this.c;
    }

    @Override // l.InterfaceC22583
    public final InterfaceC22583 A(AbstractC5650 abstractC5650) {
        C11003.requireNonNull(abstractC5650, "zone");
        return this.c.equals(abstractC5650) ? this : W(this.a, abstractC5650, this.b);
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C1416 i(AbstractC5650 abstractC5650) {
        C11003.requireNonNull(abstractC5650, "zone");
        if (this.c.equals(abstractC5650)) {
            return this;
        }
        C22770 c22770 = this.a;
        C18078 c18078 = this.b;
        c22770.getClass();
        return s(AbstractC22791.j(c22770, c18078), this.a.b.d, abstractC5650);
    }

    @Override // l.InterfaceC22583
    public final InterfaceC14115 t() {
        return this.a;
    }

    @Override // l.InterfaceC22583
    public final InterfaceC13410 f() {
        return this.a.a;
    }

    @Override // l.InterfaceC22583
    public final C7248 b() {
        return this.a.b;
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return W(C22770.Y(c19056, this.a.b), this.c, this.b);
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
            int i = AbstractC14549.a[enumC18496.ordinal()];
            if (i == 1) {
                return s(j, this.a.b.d, this.c);
            }
            if (i != 2) {
                return W(this.a.c(j, interfaceC10030), this.c, this.b);
            }
            C18078 c18078E0 = C18078.e0(enumC18496.b.a(j, enumC18496));
            return (c18078E0.equals(this.b) || !this.c.W().f(this.a).contains(c18078E0)) ? this : new C1416(this.a, this.c, c18078E0);
        }
        return (C1416) interfaceC10030.G(this, j);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C1416 d(long j, InterfaceC3679 interfaceC3679) {
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return (C1416) interfaceC3679.m(this, j);
        }
        EnumC8618 enumC8618 = (EnumC8618) interfaceC3679;
        if (enumC8618.compareTo(EnumC8618.DAYS) >= 0 && enumC8618 != EnumC8618.FOREVER) {
            return W(this.a.d(j, interfaceC3679), this.c, this.b);
        }
        C22770 c22770A0 = this.a.d(j, interfaceC3679);
        C18078 c18078 = this.b;
        AbstractC5650 abstractC5650 = this.c;
        C11003.requireNonNull(c22770A0, "localDateTime");
        C11003.requireNonNull(c18078, "offset");
        C11003.requireNonNull(abstractC5650, "zone");
        if (abstractC5650.W().f(c22770A0).contains(c18078)) {
            return new C1416(c22770A0, abstractC5650, c18078);
        }
        c22770A0.getClass();
        return s(AbstractC22791.j(c22770A0, c18078), c22770A0.b.d, abstractC5650);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return j == Long.MIN_VALUE ? d(C13132.FOREVER_NS, enumC8618).d(1L, enumC8618) : d(-j, enumC8618);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.f) {
            return this.a.a;
        }
        return AbstractC22791.i(this, c8556);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C1416 c1416V = V(interfaceC15672);
        if (interfaceC3679 instanceof EnumC8618) {
            C1416 c1416I = c1416V.i(this.c);
            EnumC8618 enumC8618 = (EnumC8618) interfaceC3679;
            if (enumC8618.compareTo(EnumC8618.DAYS) >= 0 && enumC8618 != EnumC8618.FOREVER) {
                return this.a.g(c1416I.a, interfaceC3679);
            }
            return new C19762(this.a, this.b).g(new C19762(c1416I.a, c1416I.b), interfaceC3679);
        }
        return interfaceC3679.l(this, c1416V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1416) {
            C1416 c1416 = (C1416) obj;
            if (this.a.equals(c1416.a) && this.b.equals(c1416.b) && this.c.equals(c1416.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        C18078 c18078 = this.b;
        AbstractC5650 abstractC5650 = this.c;
        if (c18078 == abstractC5650) {
            return str;
        }
        return str + "[" + abstractC5650.toString() + "]";
    }

    private Object writeReplace() {
        return new C20613((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
