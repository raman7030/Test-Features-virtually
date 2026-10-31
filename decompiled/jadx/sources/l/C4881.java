package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۙ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4881 extends AbstractC12000 {
    public static final C19056 d = C19056.h0(1873, 1, 1);
    public static final long serialVersionUID = -305327627230580483L;
    public final transient C19056 a;
    public final transient C3470 b;
    public final transient int c;

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC14115 I(C7248 c7248) {
        return new C16875(this, c7248);
    }

    public C4881(C19056 c19056) {
        if (c19056.c0(d)) {
            throw new C16232("JapaneseDate before Meiji 6 is not supported");
        }
        C3470 c3470J = C3470.j(c19056);
        this.b = c3470J;
        this.c = (c19056.a - c3470J.b.a) + 1;
        this.a = c19056;
    }

    public C4881(C3470 c3470, int i, C19056 c19056) {
        if (c19056.c0(d)) {
            throw new C16232("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = c3470;
        this.c = i;
        this.a = c19056;
    }

    @Override // l.InterfaceC13410
    public final InterfaceC2765 a() {
        return C22520.c;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final int hashCode() {
        C22520.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC4176 K() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // l.AbstractC12000, l.InterfaceC13410
    public final int Q() {
        int iQ;
        C3470 c3470K = this.b.k();
        if (c3470K != null) {
            C19056 c19056 = c3470K.b;
            if (c19056.a == this.a.a) {
                iQ = c19056.a0() - 1;
            } else {
                iQ = this.a.Q();
            }
        } else {
            iQ = this.a.Q();
        }
        return this.c == 1 ? iQ - (this.b.b.a0() - 1) : iQ;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410, l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC10030 == EnumC18496.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC10030 == EnumC18496.ALIGNED_WEEK_OF_MONTH || interfaceC10030 == EnumC18496.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC10030 instanceof EnumC18496) {
            return ((EnumC18496) interfaceC10030).isDateBased();
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.AbstractC12000, l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.m(this);
        }
        if (!e(interfaceC10030)) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        int i = AbstractC20404.a[enumC18496.ordinal()];
        if (i == 1) {
            return C22729.f(1L, this.a.d0());
        }
        if (i == 2) {
            return C22729.f(1L, Q());
        }
        if (i != 3) {
            return C22520.c.v(enumC18496);
        }
        C3470 c3470 = this.b;
        int i2 = c3470.b.a;
        C3470 c3470K = c3470.k();
        return c3470K != null ? C22729.f(1L, (c3470K.b.a - i2) + 1) : C22729.f(1L, 999999999 - i2);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        switch (AbstractC20404.a[((EnumC18496) interfaceC10030).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.a0() - this.b.b.a0()) + 1 : this.a.a0();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
            case 8:
                return this.b.a;
            default:
                return this.a.G(interfaceC10030);
        }
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C4881 c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
            if (G(enumC18496) == j) {
                return this;
            }
            int[] iArr = AbstractC20404.a;
            int i = iArr[enumC18496.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                C22520 c22520 = C22520.c;
                int iA = c22520.v(enumC18496).a(j, enumC18496);
                int i2 = iArr[enumC18496.ordinal()];
                if (i2 == 3) {
                    return d0(this.a.s0(c22520.z(this.b, iA)));
                }
                if (i2 == 8) {
                    return d0(this.a.s0(c22520.z(C3470.o(iA), this.c)));
                }
                if (i2 == 9) {
                    return d0(this.a.s0(iA));
                }
            }
            return d0(this.a.c(j, interfaceC10030));
        }
        return (C4881) super.c(j, interfaceC10030);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    /* JADX INFO: renamed from: B */
    public final InterfaceC13410 m(InterfaceC2974 interfaceC2974) {
        return (C4881) super.m(interfaceC2974);
    }

    public final C4881 c0(C8556 c8556) {
        return (C4881) super.m(c8556);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C4881) super.m(c19056);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 N(InterfaceC12146 interfaceC12146) {
        return (C4881) super.N(interfaceC12146);
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 Z(long j) {
        return d0(this.a.o0(j));
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 Y(long j) {
        return d0(this.a.m0(j));
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 X(long j) {
        return d0(this.a.l0(j));
    }

    public final C4881 a0(long j, EnumC8618 enumC8618) {
        return (C4881) super.d(j, (InterfaceC3679) enumC8618);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410, l.InterfaceC15672
    public final InterfaceC13410 d(long j, InterfaceC3679 interfaceC3679) {
        return (C4881) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 d(long j, InterfaceC3679 interfaceC3679) {
        return (C4881) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return (C4881) super.w(j, enumC8618);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 w(long j, InterfaceC3679 interfaceC3679) {
        return (C4881) super.w(j, interfaceC3679);
    }

    public final C4881 d0(C19056 c19056) {
        return c19056.equals(this.a) ? this : new C4881(c19056);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final long H() {
        return this.a.H();
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4881) {
            return this.a.equals(((C4881) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C7766((byte) 4, this);
    }
}
