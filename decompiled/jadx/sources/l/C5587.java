package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5587 extends AbstractC12000 {
    public static final long serialVersionUID = -5207853542612002020L;
    public final transient C19699 a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC14115 I(C7248 c7248) {
        return new C16875(this, c7248);
    }

    public C5587(C19699 c19699, int i, int i2, int i3) {
        c19699.Y(i, i2, i3);
        this.a = c19699;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public C5587(C19699 c19699, long j) {
        int i = (int) j;
        c19699.V();
        if (i < c19699.e || i >= c19699.f) {
            throw new C16232("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(c19699.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {c19699.X(iBinarySearch), ((c19699.g + iBinarySearch) % 12) + 1, (i - c19699.d[iBinarySearch]) + 1};
        this.a = c19699;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // l.InterfaceC13410
    public final InterfaceC2765 a() {
        return this.a;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC4176 K() {
        return EnumC1353.AH;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final int Q() {
        return this.a.b0(this.b, 12);
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
        int i = AbstractC0647.a[enumC18496.ordinal()];
        if (i == 1) {
            return C22729.f(1L, this.a.Z(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.v(enumC18496) : C22729.f(1L, 5L);
        }
        return C22729.f(1L, Q());
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        switch (AbstractC0647.a[((EnumC18496) interfaceC10030).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return a0();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) AbstractC22791.O(H() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((a0() - 1) % 7) + 1;
            case 7:
                return H();
            case 8:
                return ((a0() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final C5587 c(long j, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return (C5587) super.c(j, interfaceC10030);
        }
        EnumC18496 enumC18496 = (EnumC18496) interfaceC10030;
        this.a.v(enumC18496).b(j, enumC18496);
        int i = (int) j;
        switch (AbstractC0647.a[enumC18496.ordinal()]) {
            case 1:
                return d0(this.b, this.c, i);
            case 2:
                return X(Math.min(i, Q()) - a0());
            case 3:
                return X((j - G(EnumC18496.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return X(j - ((long) (((int) AbstractC22791.O(H() + 3, 7)) + 1)));
            case 5:
                return X(j - G(EnumC18496.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return X(j - G(EnumC18496.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C5587(this.a, j);
            case 8:
                return X((j - G(EnumC18496.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return d0(this.b, i, this.d);
            case 10:
                return Y(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return d0(i, this.c, this.d);
            case 12:
                return d0(i, this.c, this.d);
            case 13:
                return d0(1 - this.b, this.c, this.d);
            default:
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
    }

    public final C5587 d0(int i, int i2, int i3) {
        int iZ = this.a.Z(i, i2);
        if (i3 > iZ) {
            i3 = iZ;
        }
        return new C5587(this.a, i, i2, i3);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    /* JADX INFO: renamed from: B */
    public final InterfaceC13410 m(InterfaceC2974 interfaceC2974) {
        return (C5587) super.m(interfaceC2974);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 m(C19056 c19056) {
        return (C5587) super.m(c19056);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 N(InterfaceC12146 interfaceC12146) {
        return (C5587) super.N(interfaceC12146);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final long H() {
        return this.a.Y(this.b, this.c, this.d);
    }

    public final int a0() {
        return this.a.b0(this.b, this.c - 1) + this.d;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final boolean u() {
        return this.a.S(this.b);
    }

    @Override // l.AbstractC12000
    public final InterfaceC13410 Z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return d0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // l.AbstractC12000
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final C5587 Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        C19699 c19699 = this.a;
        long jZ = AbstractC22791.z(j2, 12L);
        if (jZ >= c19699.X(0) && jZ <= c19699.X(c19699.d.length - 1) - 1) {
            return d0((int) jZ, ((int) AbstractC22791.O(j2, 12L)) + 1, this.d);
        }
        throw new C16232("Invalid Hijrah year: " + jZ);
    }

    @Override // l.AbstractC12000
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C5587 X(long j) {
        return new C5587(this.a, H() + j);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410, l.InterfaceC15672
    public final InterfaceC13410 d(long j, InterfaceC3679 interfaceC3679) {
        return (C5587) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    public final InterfaceC15672 d(long j, InterfaceC3679 interfaceC3679) {
        return (C5587) super.d(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC15672
    /* JADX INFO: renamed from: C */
    public final InterfaceC15672 w(long j, EnumC8618 enumC8618) {
        return (C5587) super.w(j, enumC8618);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final InterfaceC13410 w(long j, InterfaceC3679 interfaceC3679) {
        return (C5587) super.w(j, interfaceC3679);
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5587) {
            C5587 c5587 = (C5587) obj;
            if (this.b == c5587.b && this.c == c5587.c && this.d == c5587.d && this.a.equals(c5587.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC12000, l.InterfaceC13410
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return (((i << 11) + (i2 << 6)) + i3) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C7766((byte) 6, this);
    }
}
