package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۜ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6998 extends AbstractC12000 {
    public static final long serialVersionUID = -8722293800195731463L;
    public final transient C19056 a;

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC14115 I(C7248 c7248) {
        return new C16875(this, c7248);
    }

    public C6998(C19056 c19056) {
        C11003.requireNonNull(c19056, "isoDate");
        this.a = c19056;
    }

    @Override // l.InterfaceC13410
    public final InterfaceC2765 a() {
        return C18287.c;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final int hashCode() {
        C18287.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC4176 K() {
        return a0() >= 1 ? EnumC9821.BE : EnumC9821.BEFORE_BE;
    }

    @Override // l.AbstractC12000, l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.m(this);
        }
        if (!AbstractC22791.f(this, interfaceC10030)) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        int i = AbstractC14758.a[enumC18496.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.n(interfaceC10030);
        }
        if (i != 4) {
            return C18287.c.v(enumC18496);
        }
        C22729 c22729 = EnumC18496.YEAR.b;
        return C22729.f(1L, a0() <= 0 ? (-(c22729.a + 543)) + 1 : 543 + c22729.d);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            int i = AbstractC14758.a[((EnumC18496) interfaceC10030).ordinal()];
            if (i == 4) {
                int iA0 = a0();
                if (iA0 < 1) {
                    iA0 = 1 - iA0;
                }
                return iA0;
            }
            if (i == 5) {
                return ((((long) a0()) * 12) + ((long) this.a.b)) - 1;
            }
            if (i == 6) {
                return a0();
            }
            if (i != 7) {
                return this.a.G(interfaceC10030);
            }
            return a0() < 1 ? 0 : 1;
        }
        return interfaceC10030.C(this);
    }

    public final int a0() {
        return this.a.a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    @Override // l.AbstractC12000, l.InterfaceC15672
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C6998 c(long j, InterfaceC10030 interfaceC10030) {
        int iA;
        int i;
        if (interfaceC10030 instanceof EnumC18496) {
            EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
            if (G(enumC18496) == j) {
                return this;
            }
            int[] iArr = AbstractC14758.a;
            int i2 = iArr[enumC18496.ordinal()];
            if (i2 == 4) {
                iA = C18287.c.v(enumC18496).a(j, enumC18496);
                i = iArr[enumC18496.ordinal()];
                if (i != 4) {
                    C19056 c19056 = this.a;
                    if (a0() < 1) {
                        iA = 1 - iA;
                    }
                    return c0(c19056.s0(iA - 543));
                }
                if (i != 6) {
                    return c0(this.a.s0(iA - 543));
                }
                if (i == 7) {
                    return c0(this.a.s0((-542) - a0()));
                }
            } else {
                if (i2 == 5) {
                    C18287.c.v(enumC18496).b(j, enumC18496);
                    long jA0 = ((long) a0()) * 12;
                    C19056 c19057 = this.a;
                    return c0(c19057.m0(j - ((jA0 + ((long) c19057.b)) - 1)));
                }
                if (i2 == 6 || i2 == 7) {
                    iA = C18287.c.v(enumC18496).a(j, enumC18496);
                    i = iArr[enumC18496.ordinal()];
                    if (i != 4) {
                        C19056 c19058 = this.a;
                        if (a0() < 1) {
                            iA = 1 - iA;
                        }
                        return c0(c19058.s0(iA - 543));
                    }
                    if (i != 6) {
                        return c0(this.a.s0(iA - 543));
                    }
                    if (i == 7) {
                        return c0(this.a.s0((-542) - a0()));
                    }
                }
            }
            return c0(this.a.c(j, interfaceC10030));
        }
        return (C6998) super.c(j, interfaceC10030);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    /* JADX INFO: renamed from: B */
    public final InterfaceC13410 m(InterfaceC2974 interfaceC2974) {
        return (C6998) super.m(interfaceC2974);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C6998) super.m(c19056);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 N(InterfaceC12146 interfaceC12146) {
        return (C6998) super.N(interfaceC12146);
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 Z(long j) {
        return c0(this.a.o0(j));
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 Y(long j) {
        return c0(this.a.m0(j));
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 X(long j) {
        return c0(this.a.l0(j));
    }

    @Override // l.AbstractC12000, l.InterfaceC13410, l.InterfaceC15672
    public final InterfaceC13410 d(long j, InterfaceC3679 interfaceC3679) {
        return (C6998) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 d(long j, InterfaceC3679 interfaceC3679) {
        return (C6998) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return (C6998) super.w(j, enumC8618);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 w(long j, InterfaceC3679 interfaceC3679) {
        return (C6998) super.w(j, interfaceC3679);
    }

    public final C6998 c0(C19056 c19056) {
        return c19056.equals(this.a) ? this : new C6998(c19056);
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
        if (obj instanceof C6998) {
            return this.a.equals(((C6998) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C7766((byte) 8, this);
    }
}
