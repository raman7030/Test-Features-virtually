package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22770 implements InterfaceC15672, InterfaceC2974, InterfaceC14115, Serializable {
    public static final C22770 c = Y(C19056.d, C7248.e);
    public static final C22770 d = Y(C19056.e, C7248.f);
    public static final long serialVersionUID = 6207766400415563566L;
    public final C19056 a;
    public final C7248 b;

    @Override // l.InterfaceC14115
    public final /* synthetic */ long r(C18078 c18078) {
        return AbstractC22791.j(this, c18078);
    }

    @Override // l.InterfaceC14115
    public final InterfaceC2765 a() {
        return ((C19056) f()).a();
    }

    @Override // l.InterfaceC14115
    public final InterfaceC22583 D(AbstractC5650 abstractC5650) {
        return C1416.W(this, abstractC5650, null);
    }

    public static C22770 Y(C19056 c19056, C7248 c7248) {
        C11003.requireNonNull(c19056, "date");
        C11003.requireNonNull(c7248, "time");
        return new C22770(c19056, c7248);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(((C19056) f()).H(), EnumC18496.EPOCH_DAY).c(b().h0(), EnumC18496.NANO_OF_DAY);
    }

    public static C22770 Z(long j, int i, C18078 c18078) {
        C11003.requireNonNull(c18078, "offset");
        long j2 = i;
        EnumC18496.NANO_OF_SECOND.T(j2);
        long j3 = j + ((long) c18078.b);
        long j4 = 86400;
        return new C22770(C19056.i0(AbstractC22791.z(j3, j4)), C7248.a0((((long) ((int) AbstractC22791.O(j3, j4))) * 1000000000) + j2));
    }

    public static C22770 W(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268 instanceof C22770) {
            return (C22770) interfaceC2268;
        }
        if (!(interfaceC2268 instanceof C1416)) {
            if (!(interfaceC2268 instanceof C19762)) {
                try {
                    return new C22770(C19056.X(interfaceC2268), C7248.X(interfaceC2268));
                } catch (C16232 e) {
                    throw new C16232("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName(), e);
                }
            }
            return ((C19762) interfaceC2268).a;
        }
        return ((C1416) interfaceC2268).a;
    }

    public C22770(C19056 c19056, C7248 c7248) {
        this.a = c19056;
        this.b = c7248;
    }

    public final C22770 e0(C19056 c19056, C7248 c7248) {
        return (this.a == c19056 && this.b == c7248) ? this : new C22770(c19056, c7248);
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030 != null && interfaceC10030.l(this);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        return enumC18496.isDateBased() || enumC18496.V();
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (((EnumC18496) interfaceC10030).V()) {
                C7248 c7248 = this.b;
                c7248.getClass();
                return AbstractC5796.d(c7248, interfaceC10030);
            }
            return this.a.n(interfaceC10030);
        }
        return interfaceC10030.m(this);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).V() ? this.b.l(interfaceC10030) : this.a.l(interfaceC10030);
        }
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).V() ? this.b.G(interfaceC10030) : this.a.G(interfaceC10030);
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC14115
    public final InterfaceC13410 f() {
        return this.a;
    }

    @Override // l.InterfaceC14115
    public final C7248 b() {
        return this.b;
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return e0(c19056, this.b);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final C22770 c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (((EnumC18496) interfaceC10030).V()) {
                return e0(this.a, this.b.c(j, interfaceC10030));
            }
            return e0(this.a.c(j, interfaceC10030), this.b);
        }
        return (C22770) interfaceC10030.G(this, j);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C22770 d(long j, InterfaceC3679 interfaceC3679) {
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return (C22770) interfaceC3679.m(this, j);
        }
        switch (AbstractC11482.a[((EnumC8618) interfaceC3679).ordinal()]) {
            case 1:
                return c0(this.a, 0L, 0L, 0L, j);
            case 2:
                C22770 c22770E0 = e0(this.a.l0(j / 86400000000L), this.b);
                return c22770E0.c0(c22770E0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C22770 c22770E1 = e0(this.a.l0(j / 86400000), this.b);
                return c22770E1.c0(c22770E1.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return b0(j);
            case 5:
                return c0(this.a, 0L, j, 0L, 0L);
            case 6:
                return c0(this.a, j, 0L, 0L, 0L);
            case 7:
                C22770 c22770E2 = e0(this.a.l0(j / 256), this.b);
                return c22770E2.c0(c22770E2.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return e0(this.a.d(j, interfaceC3679), this.b);
        }
    }

    public final C22770 b0(long j) {
        return c0(this.a, 0L, 0L, j, 0L);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return j == Long.MIN_VALUE ? d(C13132.FOREVER_NS, enumC8618).d(1L, enumC8618) : d(-j, enumC8618);
    }

    public final C22770 c0(C19056 c19056, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return e0(c19056, this.b);
        }
        long j5 = 1;
        long jH0 = this.b.h0();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + jH0;
        long jZ = AbstractC22791.z(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long jO = AbstractC22791.O(j6, 86400000000000L);
        return e0(c19056.l0(jZ), jO == jH0 ? this.b : C7248.a0(jO));
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.f) {
            return this.a;
        }
        return AbstractC22791.h(this, c8556);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        long jQ;
        long j;
        C22770 c22770W = W(interfaceC15672);
        if (!(interfaceC3679 instanceof EnumC8618)) {
            return interfaceC3679.l(this, c22770W);
        }
        EnumC8618 enumC8618 = (EnumC8618) interfaceC3679;
        if (enumC8618.compareTo(EnumC8618.DAYS) >= 0) {
            C19056 c19056L0 = c22770W.a;
            C19056 c19056 = this.a;
            if (c19056 == null) {
                if (c19056L0.H() > c19056.H()) {
                    if (c22770W.b.compareTo(this.b) < 0) {
                        c19056L0 = c19056L0.l0(-1L);
                    }
                }
                return this.a.g(c19056L0, interfaceC3679);
            }
            c19056L0.getClass();
            if (c19056L0.V(c19056) > 0) {
                if (c22770W.b.compareTo(this.b) < 0) {
                    c19056L0 = c19056L0.l0(-1L);
                }
            }
            return this.a.g(c19056L0, interfaceC3679);
            if (c19056L0.c0(this.a) && c22770W.b.compareTo(this.b) > 0) {
                c19056L0 = c19056L0.l0(1L);
            }
            return this.a.g(c19056L0, interfaceC3679);
        }
        C19056 c19057 = this.a;
        C19056 c19058 = c22770W.a;
        c19057.getClass();
        long jH = c19058.H() - c19057.H();
        if (jH == 0) {
            return this.b.g(c22770W.b, interfaceC3679);
        }
        long jH0 = c22770W.b.h0() - this.b.h0();
        if (jH > 0) {
            jQ = jH - 1;
            j = jH0 + 86400000000000L;
        } else {
            jQ = jH + 1;
            j = jH0 - 86400000000000L;
        }
        switch (AbstractC11482.a[enumC8618.ordinal()]) {
            case 1:
                jQ = AbstractC22791.Q(jQ, 86400000000000L);
                break;
            case 2:
                jQ = AbstractC22791.Q(jQ, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jQ = AbstractC22791.Q(jQ, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jQ = AbstractC22791.Q(jQ, 86400);
                j /= 1000000000;
                break;
            case 5:
                jQ = AbstractC22791.Q(jQ, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jQ = AbstractC22791.Q(jQ, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jQ = AbstractC22791.Q(jQ, 2);
                j /= 43200000000000L;
                break;
        }
        return AbstractC22791.P(jQ, j);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC14115 interfaceC14115) {
        if (interfaceC14115 instanceof C22770) {
            return V((C22770) interfaceC14115);
        }
        return AbstractC22791.c(this, interfaceC14115);
    }

    public final int V(C22770 c22770) {
        int iV = this.a.V(c22770.a);
        return iV == 0 ? this.b.compareTo(c22770.b) : iV;
    }

    public final boolean X(InterfaceC14115 interfaceC14115) {
        if (interfaceC14115 instanceof C22770) {
            return V((C22770) interfaceC14115) < 0;
        }
        long jH = this.a.H();
        long jH2 = interfaceC14115.f().H();
        if (jH >= jH2) {
            return jH == jH2 && this.b.h0() < interfaceC14115.b().h0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22770) {
            C22770 c22770 = (C22770) obj;
            if (this.a.equals(c22770.a) && this.b.equals(c22770.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new C20613((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
