package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24640 implements InterfaceC17263, InterfaceC5195, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f77995c = 0;
    public static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a */
    public final C9257 f77996a;

    /* JADX INFO: renamed from: b */
    public final C19550 f77997b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C24640 c24640 = (C24640) obj;
        if (this.f77997b.equals(c24640.f77997b)) {
            return this.f77996a.compareTo(c24640.f77996a);
        }
        int iCompare = Long.compare(m54292W(), c24640.m54292W());
        return iCompare == 0 ? this.f77996a.compareTo(c24640.f77996a) : iCompare;
    }

    static {
        C9257 c9257 = C9257.f25129e;
        C19550 c19550 = C19550.f59519h;
        c9257.getClass();
        new C24640(c9257, c19550);
        C9257 c9258 = C9257.f25130f;
        C19550 c19551 = C19550.f59518g;
        c9258.getClass();
        new C24640(c9258, c19551);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C24640 c24640;
        if (interfaceC17263 instanceof C24640) {
            c24640 = (C24640) interfaceC17263;
        } else {
            try {
                c24640 = new C24640(C9257.m21345X(interfaceC17263), C19550.m44392b0(interfaceC17263));
            } catch (C17796 e) {
                throw new C17796("Unable to obtain OffsetTime from TemporalAccessor: " + interfaceC17263 + " of type " + interfaceC17263.getClass().getName(), e);
            }
        }
        if (interfaceC5865 instanceof EnumC10559) {
            long jM54292W = c24640.m54292W() - m54292W();
            switch (AbstractC15922.f46044a[((EnumC10559) interfaceC5865).ordinal()]) {
                case 1:
                    return jM54292W;
                case 2:
                    return jM54292W / 1000;
                case 3:
                    return jM54292W / 1000000;
                case 4:
                    return jM54292W / 1000000000;
                case 5:
                    return jM54292W / 60000000000L;
                case 6:
                    return jM54292W / 3600000000000L;
                case 7:
                    return jM54292W / 43200000000000L;
                default:
                    throw new C13242("Unsupported unit: " + interfaceC5865);
            }
        }
        return interfaceC5865.mo13169l(this, c24640);
    }

    public C24640(C9257 c9257, C19550 c19550) {
        this.f77996a = (C9257) C12826.requireNonNull(c9257, "time");
        this.f77997b = (C19550) C12826.requireNonNull(c19550, "offset");
    }

    /* JADX INFO: renamed from: X */
    public final C24640 m54293X(C9257 c9257, C19550 c19550) {
        return (this.f77996a == c9257 && this.f77997b.equals(c19550)) ? this : new C24640(c9257, c19550);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return ((EnumC19947) interfaceC11901).m45274V() || interfaceC11901 == EnumC19947.OFFSET_SECONDS;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (interfaceC11901 != EnumC19947.OFFSET_SECONDS) {
                C9257 c9257 = this.f77996a;
                c9257.getClass();
                return AbstractC7877.m18196d(c9257, interfaceC11901);
            }
            return ((EnumC19947) interfaceC11901).f60552b;
        }
        return interfaceC11901.mo3655m(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (interfaceC11901 == EnumC19947.OFFSET_SECONDS) {
                return this.f77997b.f59520b;
            }
            return this.f77996a.mo6949G(interfaceC11901);
        }
        return interfaceC11901.mo3652C(this);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: c */
    public final InterfaceC17263 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (interfaceC11901 == EnumC19947.OFFSET_SECONDS) {
                EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
                return m54293X(this.f77996a, C19550.m44395e0(enumC19947.f60552b.m53121a(j, enumC19947)));
            }
            return m54293X(this.f77996a.mo7152c(j, interfaceC11901), this.f77997b);
        }
        return (C24640) interfaceC11901.mo3653G(this, j);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C24640 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (interfaceC5865 instanceof EnumC10559) {
            return m54293X(this.f77996a.mo7153d(j, interfaceC5865), this.f77997b);
        }
        return (C24640) interfaceC5865.mo13170m(this, j);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, enumC10559).mo7153d(1L, enumC10559) : mo7153d(-j, enumC10559);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20682d || c10500 == AbstractC7877.f20683e) {
            return this.f77997b;
        }
        if (((c10500 == AbstractC7877.f20679a) || (c10500 == AbstractC7877.f20680b)) || c10500 == AbstractC7877.f20684f) {
            return null;
        }
        if (c10500 == AbstractC7877.f20685g) {
            return this.f77996a;
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.NANOS;
        }
        return c10500.m24242h(this);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(this.f77996a.m21356h0(), EnumC19947.NANO_OF_DAY).mo7152c(this.f77997b.f59520b, EnumC19947.OFFSET_SECONDS);
    }

    /* JADX INFO: renamed from: W */
    public final long m54292W() {
        return this.f77996a.m21356h0() - (((long) this.f77997b.f59520b) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24640) {
            C24640 c24640 = (C24640) obj;
            if (this.f77996a.equals(c24640.f77996a) && this.f77997b.equals(c24640.f77997b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f77996a.hashCode() ^ this.f77997b.f59520b;
    }

    public final String toString() {
        return this.f77996a.toString() + this.f77997b.f59521c;
    }

    private Object writeReplace() {
        return new C21959((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C24640) AbstractC24029.m53232a(c20480, this);
    }
}
