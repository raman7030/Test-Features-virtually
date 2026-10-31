package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩵᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19762 implements InterfaceC15672, InterfaceC2974, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 2287754244819255394L;
    public final C22770 a;
    public final C18078 b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        C19762 c19762 = (C19762) obj;
        if (this.b.equals(c19762.b)) {
            iCompare = this.a.compareTo(c19762.a);
        } else {
            C22770 c22770 = this.a;
            C18078 c18078 = this.b;
            c22770.getClass();
            long j = AbstractC22791.j(c22770, c18078);
            C22770 c22771 = c19762.a;
            C18078 c18079 = c19762.b;
            c22771.getClass();
            iCompare = Long.compare(j, AbstractC22791.j(c22771, c18079));
            if (iCompare == 0) {
                iCompare = this.a.b.d - c19762.a.b.d;
            }
        }
        return iCompare == 0 ? this.a.compareTo(c19762.a) : iCompare;
    }

    static {
        C22770 c22770 = C22770.c;
        C18078 c18078 = C18078.h;
        c22770.getClass();
        new C19762(c22770, c18078);
        C22770 c22771 = C22770.d;
        C18078 c18079 = C18078.g;
        c22771.getClass();
        new C19762(c22771, c18079);
    }

    public static C19762 W(C4239 c4239, AbstractC5650 abstractC5650) {
        C11003.requireNonNull(c4239, "instant");
        C11003.requireNonNull(abstractC5650, "zone");
        C18078 c18078D = abstractC5650.W().d(c4239);
        return new C19762(C22770.Z(c4239.getEpochSecond(), c4239.getNano(), c18078D), c18078D);
    }

    public static C19762 V(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268 instanceof C19762) {
            return (C19762) interfaceC2268;
        }
        try {
            C18078 c18078B0 = C18078.b0(interfaceC2268);
            C19056 c19056 = (C19056) interfaceC2268.T(AbstractC5796.f);
            C7248 c7248 = (C7248) interfaceC2268.T(AbstractC5796.g);
            if (c19056 != null && c7248 != null) {
                return new C19762(C22770.Y(c19056, c7248), c18078B0);
            }
            return W(C4239.W(interfaceC2268), c18078B0);
        } catch (C16232 e) {
            throw new C16232("Unable to obtain OffsetDateTime from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName(), e);
        }
    }

    public static C19762 parse(CharSequence charSequence) {
        String string;
        C6292 c6292 = C6292.g;
        C11003.requireNonNull(c6292, "formatter");
        C8556 c8556 = new C8556(1);
        c6292.getClass();
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C11003.requireNonNull(c8556, "query");
        try {
            return (C19762) c6292.a(charSequence).T(c8556);
        } catch (C12892 e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            C12892 c12892 = new C12892("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw c12892;
        }
    }

    public C19762(C22770 c22770, C18078 c18078) {
        this.a = (C22770) C11003.requireNonNull(c22770, "dateTime");
        this.b = (C18078) C11003.requireNonNull(c18078, "offset");
    }

    public final C19762 Y(C22770 c22770, C18078 c18078) {
        return (this.a == c22770 && this.b.equals(c18078)) ? this : new C19762(c22770, c18078);
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
            if (interfaceC10030 != EnumC18496.INSTANT_SECONDS && interfaceC10030 != EnumC18496.OFFSET_SECONDS) {
                return this.a.n(interfaceC10030);
            }
            return ((EnumC18496) interfaceC10030).b;
        }
        return interfaceC10030.m(this);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            int i = AbstractC17084.a[((EnumC18496) interfaceC10030).ordinal()];
            if (i == 1) {
                throw new C11441("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.l(interfaceC10030);
        }
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        int i = AbstractC17084.a[((EnumC18496) interfaceC10030).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.G(interfaceC10030) : this.b.b;
        }
        C22770 c22770 = this.a;
        C18078 c18078 = this.b;
        c22770.getClass();
        return AbstractC22791.j(c22770, c18078);
    }

    public int getNano() {
        return this.a.b.d;
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        C22770 c22770 = this.a;
        return Y(c22770.e0(c19056, c22770.b), this.b);
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
            int i = AbstractC17084.a[enumC18496.ordinal()];
            if (i == 1) {
                return W(C4239.ofEpochSecond(j, getNano()), this.b);
            }
            if (i == 2) {
                return Y(this.a, C18078.e0(enumC18496.b.a(j, enumC18496)));
            }
            return Y(this.a.c(j, interfaceC10030), this.b);
        }
        return (C19762) interfaceC10030.G(this, j);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C19762 d(long j, InterfaceC3679 interfaceC3679) {
        if (interfaceC3679 instanceof EnumC8618) {
            return Y(this.a.d(j, interfaceC3679), this.b);
        }
        return (C19762) interfaceC3679.m(this, j);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return j == Long.MIN_VALUE ? d(C13132.FOREVER_NS, enumC8618).d(1L, enumC8618) : d(-j, enumC8618);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.d || c8556 == AbstractC5796.e) {
            return this.b;
        }
        if (c8556 == AbstractC5796.a) {
            return null;
        }
        if (c8556 == AbstractC5796.f) {
            return this.a.a;
        }
        if (c8556 == AbstractC5796.g) {
            return this.a.b;
        }
        if (c8556 == AbstractC5796.b) {
            return C8409.c;
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.NANOS;
        }
        return c8556.h(this);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(this.a.a.H(), EnumC18496.EPOCH_DAY).c(this.a.b.h0(), EnumC18496.NANO_OF_DAY).c(this.b.b, EnumC18496.OFFSET_SECONDS);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C19762 c19762V = V(interfaceC15672);
        if (interfaceC3679 instanceof EnumC8618) {
            C18078 c18078 = this.b;
            if (!c18078.equals(c19762V.b)) {
                c19762V = new C19762(c19762V.a.b0(c18078.b - c19762V.b.b), c18078);
            }
            return this.a.g(c19762V.a, interfaceC3679);
        }
        return interfaceC3679.l(this, c19762V);
    }

    public C4239 toInstant() {
        C22770 c22770 = this.a;
        C18078 c18078 = this.b;
        c22770.getClass();
        return AbstractC22791.l(c22770, c18078);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19762) {
            C19762 c19762 = (C19762) obj;
            if (this.a.equals(c19762.a) && this.b.equals(c19762.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new C20613((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
