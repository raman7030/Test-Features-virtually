package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23434 implements InterfaceC15672, InterfaceC2974, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 7264499704384272492L;
    public final C7248 a;
    public final C18078 b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C23434 c23434 = (C23434) obj;
        if (this.b.equals(c23434.b)) {
            return this.a.compareTo(c23434.a);
        }
        int iCompare = Long.compare(W(), c23434.W());
        return iCompare == 0 ? this.a.compareTo(c23434.a) : iCompare;
    }

    static {
        C7248 c7248 = C7248.e;
        C18078 c18078 = C18078.h;
        c7248.getClass();
        new C23434(c7248, c18078);
        C7248 c7249 = C7248.f;
        C18078 c18079 = C18078.g;
        c7249.getClass();
        new C23434(c7249, c18079);
    }

    @Override // l.InterfaceC15672
    public final long g(InterfaceC15672 interfaceC15672, InterfaceC3679 interfaceC3679) {
        C23434 c23434;
        if (interfaceC15672 instanceof C23434) {
            c23434 = (C23434) interfaceC15672;
        } else {
            try {
                c23434 = new C23434(C7248.X(interfaceC15672), C18078.b0(interfaceC15672));
            } catch (C16232 e) {
                throw new C16232("Unable to obtain OffsetTime from TemporalAccessor: " + interfaceC15672 + " of type " + interfaceC15672.getClass().getName(), e);
            }
        }
        if (interfaceC3679 instanceof EnumC8618) {
            long jW = c23434.W() - W();
            switch (AbstractC14261.a[((EnumC8618) interfaceC3679).ordinal()]) {
                case 1:
                    return jW;
                case 2:
                    return jW / 1000;
                case 3:
                    return jW / 1000000;
                case 4:
                    return jW / 1000000000;
                case 5:
                    return jW / 60000000000L;
                case 6:
                    return jW / 3600000000000L;
                case 7:
                    return jW / 43200000000000L;
                default:
                    throw new C11441("Unsupported unit: " + interfaceC3679);
            }
        }
        return interfaceC3679.l(this, c23434);
    }

    public C23434(C7248 c7248, C18078 c18078) {
        this.a = (C7248) C11003.requireNonNull(c7248, "time");
        this.b = (C18078) C11003.requireNonNull(c18078, "offset");
    }

    public final C23434 X(C7248 c7248, C18078 c18078) {
        return (this.a == c7248 && this.b.equals(c18078)) ? this : new C23434(c7248, c18078);
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).V() || interfaceC10030 == EnumC18496.OFFSET_SECONDS;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (interfaceC10030 != EnumC18496.OFFSET_SECONDS) {
                C7248 c7248 = this.a;
                c7248.getClass();
                return AbstractC5796.d(c7248, interfaceC10030);
            }
            return ((EnumC18496) interfaceC10030).b;
        }
        return interfaceC10030.m(this);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (interfaceC10030 == EnumC18496.OFFSET_SECONDS) {
                return this.b.b;
            }
            return this.a.G(interfaceC10030);
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            if (interfaceC10030 == EnumC18496.OFFSET_SECONDS) {
                EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
                return X(this.a, C18078.e0(enumC18496.b.a(j, enumC18496)));
            }
            return X(this.a.c(j, interfaceC10030), this.b);
        }
        return (C23434) interfaceC10030.G(this, j);
    }

    @Override // l.InterfaceC15672
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C23434 d(long j, InterfaceC3679 interfaceC3679) {
        if (interfaceC3679 instanceof EnumC8618) {
            return X(this.a.d(j, interfaceC3679), this.b);
        }
        return (C23434) interfaceC3679.m(this, j);
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
        if (((c8556 == AbstractC5796.a) || (c8556 == AbstractC5796.b)) || c8556 == AbstractC5796.f) {
            return null;
        }
        if (c8556 == AbstractC5796.g) {
            return this.a;
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.NANOS;
        }
        return c8556.h(this);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(this.a.h0(), EnumC18496.NANO_OF_DAY).c(this.b.b, EnumC18496.OFFSET_SECONDS);
    }

    public final long W() {
        return this.a.h0() - (((long) this.b.b) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23434) {
            C23434 c23434 = (C23434) obj;
            if (this.a.equals(c23434.a) && this.b.equals(c23434.b)) {
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
        return new C20613((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C23434) AbstractC22791.a(c19056, this);
    }
}
