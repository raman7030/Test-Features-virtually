package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9115 implements InterfaceC22583, Serializable {
    public static final long serialVersionUID = -5261813987200935591L;
    public final transient C16875 a;
    public final transient C18078 b;
    public final transient AbstractC5650 c;

    @Override // l.InterfaceC2268
    public final /* synthetic */ Object T(C8556 c8556) {
        return AbstractC22791.i(this, c8556);
    }

    @Override // l.InterfaceC22583
    public final /* synthetic */ long U() {
        return AbstractC22791.k(this);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC22791.e(this, interfaceC10030);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC22791.d(this, (InterfaceC22583) obj);
    }

    public static C9115 V(AbstractC5650 abstractC5650, C18078 c18078, C16875 c16875) {
        C11003.requireNonNull(c16875, "localDateTime");
        C11003.requireNonNull(abstractC5650, "zone");
        if (abstractC5650 instanceof C18078) {
            return new C9115(abstractC5650, (C18078) abstractC5650, c16875);
        }
        C15960 c15960W = abstractC5650.W();
        C22770 c22770W = C22770.W(c16875);
        List listF = c15960W.f(c22770W);
        if (listF.size() == 1) {
            c18078 = (C18078) listF.get(0);
        } else if (listF.size() != 0) {
            if (c18078 == null || !listF.contains(c18078)) {
                c18078 = (C18078) listF.get(0);
            }
        } else {
            Object objE = c15960W.e(c22770W);
            C6789 c6789 = objE instanceof C6789 ? (C6789) objE : null;
            c16875 = c16875.X(c16875.a, 0L, 0L, C2828.ofSeconds(c6789.d.b - c6789.c.b).a, 0L);
            c18078 = c6789.d;
        }
        C11003.requireNonNull(c18078, "offset");
        return new C9115(abstractC5650, c18078, c16875);
    }

    public static C9115 W(InterfaceC2765 interfaceC2765, C4239 c4239, AbstractC5650 abstractC5650) {
        C18078 c18078D = abstractC5650.W().d(c4239);
        C11003.requireNonNull(c18078D, "offset");
        return new C9115(abstractC5650, c18078D, (C16875) interfaceC2765.J(C22770.Z(c4239.getEpochSecond(), c4239.getNano(), c18078D)));
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (interfaceC10030 != EnumC18496.INSTANT_SECONDS && interfaceC10030 != EnumC18496.OFFSET_SECONDS) {
                return ((C16875) t()).n(interfaceC10030);
            }
            return ((EnumC18496) interfaceC10030).b;
        }
        return interfaceC10030.m(this);
    }

    public static C9115 s(InterfaceC2765 interfaceC2765, InterfaceC15672 interfaceC15672) {
        C9115 c9115 = (C9115) interfaceC15672;
        if (interfaceC2765.equals(c9115.a())) {
            return c9115;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC2765.k() + ", actual: " + c9115.a().k());
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            int i = AbstractC23931.a[((EnumC18496) interfaceC10030).ordinal()];
            if (i == 1) {
                return U();
            }
            if (i != 2) {
                return ((C16875) t()).G(interfaceC10030);
            }
            return h().b;
        }
        return interfaceC10030.C(this);
    }

    public C9115(AbstractC5650 abstractC5650, C18078 c18078, C16875 c16875) {
        this.a = (C16875) C11003.requireNonNull(c16875, "dateTime");
        this.b = (C18078) C11003.requireNonNull(c18078, "offset");
        this.c = (AbstractC5650) C11003.requireNonNull(abstractC5650, "zone");
    }

    @Override // l.InterfaceC22583
    public final C18078 h() {
        return this.b;
    }

    @Override // l.InterfaceC22583
    public final InterfaceC13410 f() {
        return ((C16875) t()).f();
    }

    @Override // l.InterfaceC22583
    public final C7248 b() {
        return ((C16875) t()).b();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // l.InterfaceC22583
    public final InterfaceC14115 t() {
        return this.a;
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

    @Override // l.InterfaceC22583
    public final AbstractC5650 F() {
        return this.c;
    }

    @Override // l.InterfaceC22583
    public final InterfaceC2765 a() {
        return f().a();
    }

    @Override // l.InterfaceC22583
    public final InterfaceC22583 A(AbstractC5650 abstractC5650) {
        return V(abstractC5650, this.b, this.a);
    }

    @Override // l.InterfaceC22583
    public final InterfaceC22583 i(AbstractC5650 abstractC5650) {
        C11003.requireNonNull(abstractC5650, "zone");
        if (this.c.equals(abstractC5650)) {
            return this;
        }
        C16875 c16875 = this.a;
        C18078 c18078 = this.b;
        c16875.getClass();
        return W(a(), AbstractC22791.l(c16875, c18078), abstractC5650);
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return true;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 c(long j, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return s(a(), interfaceC10030.G(this, j));
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        int i = AbstractC21110.a[enumC18496.ordinal()];
        if (i == 1) {
            return d(j - AbstractC22791.k(this), EnumC8618.SECONDS);
        }
        if (i != 2) {
            return V(this.c, this.b, this.a.c(j, interfaceC10030));
        }
        C18078 c18078E0 = C18078.e0(enumC18496.b.a(j, enumC18496));
        C16875 c16875 = this.a;
        c16875.getClass();
        return W(a(), AbstractC22791.l(c16875, c18078E0), this.c);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C9115 d(long j, InterfaceC3679 interfaceC3679) {
        if (interfaceC3679 instanceof EnumC8618) {
            return s(a(), this.a.d(j, interfaceC3679).s(this));
        }
        return s(a(), interfaceC3679.m(this, j));
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C11003.requireNonNull(interfaceC15672, "endExclusive");
        InterfaceC22583 interfaceC22583P = a().p(interfaceC15672);
        if (interfaceC3679 instanceof EnumC8618) {
            return this.a.g(interfaceC22583P.i(this.b).t(), interfaceC3679);
        }
        C11003.requireNonNull(interfaceC3679, "unit");
        return interfaceC3679.l(this, interfaceC22583P);
    }

    private Object writeReplace() {
        return new C7766((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC22583) && AbstractC22791.d(this, (InterfaceC22583) obj) == 0;
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return s(a(), c19056.s(this));
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return s(a(), AbstractC5796.b(this, j, enumC8618));
    }

    @Override // l.InterfaceC22583
    public final C4239 toInstant() {
        return C4239.ofEpochSecond(U(), b().d);
    }
}
