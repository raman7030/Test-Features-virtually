package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7679 extends AbstractC13774 {
    public static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a */
    public final transient C21091 f20140a;

    /* JADX INFO: renamed from: b */
    public final transient int f20141b;

    /* JADX INFO: renamed from: c */
    public final transient int f20142c;

    /* JADX INFO: renamed from: d */
    public final transient int f20143d;

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: I */
    public final InterfaceC15784 mo16119I(C9257 c9257) {
        return new C18407(this, c9257);
    }

    public C7679(C21091 c21091, int i, int i2, int i3) {
        c21091.m47693Y(i, i2, i3);
        this.f20140a = c21091;
        this.f20141b = i;
        this.f20142c = i2;
        this.f20143d = i3;
    }

    public C7679(C21091 c21091, long j) {
        int i = (int) j;
        c21091.m47690V();
        if (i < c21091.f66264e || i >= c21091.f66265f) {
            throw new C17796("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(c21091.f66263d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {c21091.m47692X(iBinarySearch), ((c21091.f66266g + iBinarySearch) % 12) + 1, (i - c21091.f66263d[iBinarySearch]) + 1};
        this.f20140a = c21091;
        this.f20141b = iArr[0];
        this.f20142c = iArr[1];
        this.f20143d = iArr[2];
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo16126a() {
        return this.f20140a;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: K */
    public final InterfaceC6338 mo16120K() {
        return EnumC3655.f7677AH;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: Q */
    public final int mo16122Q() {
        return this.f20140a.m47695b0(this.f20141b, 12);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3655m(this);
        }
        if (!AbstractC24029.m53237f(this, interfaceC11901)) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        int i = AbstractC2984.f5272a[enumC19947.ordinal()];
        if (i == 1) {
            return C23970.m53119f(1L, this.f20140a.m47694Z(this.f20141b, this.f20142c));
        }
        if (i != 2) {
            return i != 3 ? this.f20140a.mo10588v(enumC19947) : C23970.m53119f(1L, 5L);
        }
        return C23970.m53119f(1L, mo16122Q());
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3652C(this);
        }
        switch (AbstractC2984.f5272a[((EnumC19947) interfaceC11901).ordinal()]) {
            case 1:
                return this.f20143d;
            case 2:
                return m17792a0();
            case 3:
                return ((this.f20143d - 1) / 7) + 1;
            case 4:
                return ((int) AbstractC24029.m53225O(mo16118H() + 3, 7)) + 1;
            case 5:
                return ((this.f20143d - 1) % 7) + 1;
            case 6:
                return ((m17792a0() - 1) % 7) + 1;
            case 7:
                return mo16118H();
            case 8:
                return ((m17792a0() - 1) / 7) + 1;
            case 9:
                return this.f20142c;
            case 10:
                return ((((long) this.f20141b) * 12) + ((long) this.f20142c)) - 1;
            case 11:
                return this.f20141b;
            case 12:
                return this.f20141b;
            case 13:
                return this.f20141b <= 1 ? 0 : 1;
            default:
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final C7679 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return (C7679) super.mo7152c(j, interfaceC11901);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        this.f20140a.mo10588v(enumC19947).m53122b(j, enumC19947);
        int i = (int) j;
        switch (AbstractC2984.f5272a[enumC19947.ordinal()]) {
            case 1:
                return m17795d0(this.f20141b, this.f20142c, i);
            case 2:
                return mo16123X(Math.min(i, mo16122Q()) - m17792a0());
            case 3:
                return mo16123X((j - mo6949G(EnumC19947.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return mo16123X(j - ((long) (((int) AbstractC24029.m53225O(mo16118H() + 3, 7)) + 1)));
            case 5:
                return mo16123X(j - mo6949G(EnumC19947.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return mo16123X(j - mo6949G(EnumC19947.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C7679(this.f20140a, j);
            case 8:
                return mo16123X((j - mo6949G(EnumC19947.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return m17795d0(this.f20141b, i, this.f20143d);
            case 10:
                return mo16124Y(j - (((((long) this.f20141b) * 12) + ((long) this.f20142c)) - 1));
            case 11:
                if (this.f20141b < 1) {
                    i = 1 - i;
                }
                return m17795d0(i, this.f20142c, this.f20143d);
            case 12:
                return m17795d0(i, this.f20142c, this.f20143d);
            case 13:
                return m17795d0(1 - this.f20141b, this.f20142c, this.f20143d);
            default:
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final C7679 m17795d0(int i, int i2, int i3) {
        int iM47694Z = this.f20140a.m47694Z(i, i2);
        if (i3 > iM47694Z) {
            i3 = iM47694Z;
        }
        return new C7679(this.f20140a, i, i2, i3);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: B */
    public final InterfaceC15114 mo7158m(InterfaceC5195 interfaceC5195) {
        return (C7679) super.mo7158m(interfaceC5195);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo7158m(C20480 c20480) {
        return (C7679) super.mo7158m(c20480);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: N */
    public final InterfaceC15114 mo16121N(InterfaceC13912 interfaceC13912) {
        return (C7679) super.mo16121N(interfaceC13912);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: H */
    public final long mo16118H() {
        return this.f20140a.m47693Y(this.f20141b, this.f20142c, this.f20143d);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m17792a0() {
        return this.f20140a.m47695b0(this.f20141b, this.f20142c - 1) + this.f20143d;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: u */
    public final boolean mo17797u() {
        return this.f20140a.mo10582S(this.f20141b);
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: Z */
    public final InterfaceC15114 mo16125Z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.f20141b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return m17795d0(i, this.f20142c, this.f20143d);
        }
        throw new ArithmeticException();
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final C7679 mo16124Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f20141b) * 12) + ((long) (this.f20142c - 1)) + j;
        C21091 c21091 = this.f20140a;
        long jM53257z = AbstractC24029.m53257z(j2, 12L);
        if (jM53257z >= c21091.m47692X(0) && jM53257z <= c21091.m47692X(c21091.f66263d.length - 1) - 1) {
            return m17795d0((int) jM53257z, ((int) AbstractC24029.m53225O(j2, 12L)) + 1, this.f20143d);
        }
        throw new C17796("Invalid Hijrah year: " + jM53257z);
    }

    @Override // p067l.AbstractC13774
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C7679 mo16123X(long j) {
        return new C7679(this.f20140a, mo16118H() + j);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC15114 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C7679) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: d */
    public final InterfaceC17263 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        return (C7679) super.mo7153d(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC17263
    /* JADX INFO: renamed from: C */
    public final InterfaceC17263 mo16131w(long j, EnumC10559 enumC10559) {
        return (C7679) super.mo16131w(j, enumC10559);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    /* JADX INFO: renamed from: w */
    public final InterfaceC15114 mo16131w(long j, InterfaceC5865 interfaceC5865) {
        return (C7679) super.mo16131w(j, interfaceC5865);
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7679) {
            C7679 c7679 = (C7679) obj;
            if (this.f20141b == c7679.f20141b && this.f20142c == c7679.f20142c && this.f20143d == c7679.f20143d && this.f20140a.equals(c7679.f20140a)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC13774, p067l.InterfaceC15114
    public final int hashCode() {
        int i = this.f20141b;
        int i2 = this.f20142c;
        int i3 = this.f20143d;
        this.f20140a.getClass();
        return (((i << 11) + (i2 << 6)) + i3) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C9750((byte) 6, this);
    }
}
