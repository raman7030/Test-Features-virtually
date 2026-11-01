package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20480 implements InterfaceC17263, InterfaceC5195, InterfaceC15114, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C20480 f63257d = m46187h0(-999999999, 1, 1);

    /* JADX INFO: renamed from: e */
    public static final C20480 f63258e = m46187h0(999999999, 12, 31);
    public static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a */
    public final int f63259a;

    /* JADX INFO: renamed from: b */
    public final short f63260b;

    /* JADX INFO: renamed from: c */
    public final short f63261c;

    static {
        m46187h0(1970, 1, 1);
    }

    public static C20480 now() {
        return m46186g0(AbstractC11092.m25535a());
    }

    /* JADX INFO: renamed from: g0 */
    public static C20480 m46186g0(C10421 c10421) {
        C12826.requireNonNull(c10421, "clock");
        C6398 c6398Instant = c10421.instant();
        AbstractC7739 abstractC7739 = c10421.f28821a;
        C12826.requireNonNull(c6398Instant, "instant");
        C12826.requireNonNull(abstractC7739, "zone");
        return m46188i0(AbstractC24029.m53257z(c6398Instant.getEpochSecond() + ((long) abstractC7739.mo17864W().m39916d(c6398Instant).f59520b), 86400));
    }

    /* JADX INFO: renamed from: h0 */
    public static C20480 m46187h0(int i, int i2, int i3) {
        EnumC19947.YEAR.m45273T(i);
        EnumC19947.MONTH_OF_YEAR.m45273T(i2);
        EnumC19947.DAY_OF_MONTH.m45273T(i3);
        return m46184W(i, i2, i3);
    }

    /* JADX INFO: renamed from: j0 */
    public static C20480 m46189j0(int i, int i2) {
        long j = i;
        EnumC19947.YEAR.m45273T(j);
        EnumC19947.DAY_OF_YEAR.m45273T(i2);
        boolean zMo10582S = C10361.f28676c.mo10582S(j);
        if (i2 == 366 && !zMo10582S) {
            throw new C17796("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        EnumC12571 enumC12571M28960Y = EnumC12571.m28960Y(((i2 - 1) / 31) + 1);
        if (i2 > (enumC12571M28960Y.m28962W(zMo10582S) + enumC12571M28960Y.m28961V(zMo10582S)) - 1) {
            enumC12571M28960Y = EnumC12571.f35323a[((((int) 1) + 12) + enumC12571M28960Y.ordinal()) % 12];
        }
        return new C20480(i, enumC12571M28960Y.getValue(), (i2 - enumC12571M28960Y.m28961V(zMo10582S)) + 1);
    }

    /* JADX INFO: renamed from: i0 */
    public static C20480 m46188i0(long j) {
        long j2;
        EnumC19947.EPOCH_DAY.m45273T(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        return new C20480(enumC19947.f60552b.m53121a(j7, enumC19947), i3, i4);
    }

    /* JADX INFO: renamed from: X */
    public static C20480 m46185X(InterfaceC4524 interfaceC4524) {
        C12826.requireNonNull(interfaceC4524, "temporal");
        C20480 c20480 = (C20480) interfaceC4524.mo6950T(AbstractC7877.f20684f);
        if (c20480 != null) {
            return c20480;
        }
        throw new C17796("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName());
    }

    /* JADX INFO: renamed from: W */
    public static C20480 m46184W(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (C10361.f28676c.mo10582S(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C17796("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C17796("Invalid date '" + EnumC12571.m28960Y(i2).name() + " " + i3 + "'");
            }
        }
        return new C20480(i, i2, i3);
    }

    /* JADX INFO: renamed from: p0 */
    public static C20480 m46190p0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, C10361.f28676c.mo10582S((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new C20480(i, i2, i3);
    }

    public C20480(int i, int i2, int i3) {
        this.f63259a = i;
        this.f63260b = (short) i2;
        this.f63261c = (short) i3;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        return AbstractC24029.m53237f(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return interfaceC11901.mo3655m(this);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        if (!enumC19947.isDateBased()) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        int i = AbstractC12373.f34518a[enumC19947.ordinal()];
        if (i == 1) {
            return C23970.m53119f(1L, m46197d0());
        }
        if (i == 2) {
            return C23970.m53119f(1L, mo16122Q());
        }
        if (i == 3) {
            return C23970.m53119f(1L, (EnumC12571.m28960Y(this.f63260b) != EnumC12571.FEBRUARY || mo17797u()) ? 5L : 4L);
        }
        if (i != 4) {
            return enumC19947.f60552b;
        }
        return this.f63259a <= 0 ? C23970.m53119f(1L, 1000000000L) : C23970.m53119f(1L, 999999999L);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return m46192Y(interfaceC11901);
        }
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            if (interfaceC11901 == EnumC19947.EPOCH_DAY) {
                return mo16118H();
            }
            if (interfaceC11901 == EnumC19947.PROLEPTIC_MONTH) {
                return m46195b0();
            }
            return m46192Y(interfaceC11901);
        }
        return interfaceC11901.mo3652C(this);
    }

    /* JADX INFO: renamed from: Y */
    public final int m46192Y(InterfaceC11901 interfaceC11901) {
        switch (AbstractC12373.f34518a[((EnumC19947) interfaceC11901).ordinal()]) {
            case 1:
                return this.f63261c;
            case 2:
                return m46194a0();
            case 3:
                return ((this.f63261c - 1) / 7) + 1;
            case 4:
                int i = this.f63259a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return m46193Z().getValue();
            case 6:
                return ((this.f63261c - 1) % 7) + 1;
            case 7:
                return ((m46194a0() - 1) % 7) + 1;
            case 8:
                throw new C13242("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((m46194a0() - 1) / 7) + 1;
            case 10:
                return this.f63260b;
            case 11:
                throw new C13242("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f63259a;
            case 13:
                return this.f63259a >= 1 ? 1 : 0;
            default:
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final long m46195b0() {
        return ((((long) this.f63259a) * 12) + ((long) this.f63260b)) - 1;
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 mo16126a() {
        return C10361.f28676c;
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: K */
    public final InterfaceC6338 mo16120K() {
        return this.f63259a >= 1 ? EnumC17065.f50459CE : EnumC17065.BCE;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m46194a0() {
        return (EnumC12571.m28960Y(this.f63260b).m28961V(mo17797u()) + this.f63261c) - 1;
    }

    /* JADX INFO: renamed from: Z */
    public final EnumC23162 m46193Z() {
        return EnumC23162.m51623V(((int) AbstractC24029.m53225O(mo16118H() + 3, 7)) + 1);
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: u */
    public final boolean mo17797u() {
        return C10361.f28676c.mo10582S(this.f63259a);
    }

    /* JADX INFO: renamed from: d0 */
    public final int m46197d0() {
        short s = this.f63260b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return mo17797u() ? 29 : 28;
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: Q */
    public final int mo16122Q() {
        return mo17797u() ? 366 : 365;
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C20480 mo7158m(InterfaceC5195 interfaceC5195) {
        if (interfaceC5195 instanceof C20480) {
            return (C20480) interfaceC5195;
        }
        return (C20480) interfaceC5195.mo6954s(this);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final C20480 mo7152c(long j, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            return (C20480) interfaceC11901.mo3653G(this, j);
        }
        EnumC19947 enumC19947 = (EnumC19947) interfaceC11901;
        enumC19947.m45273T(j);
        switch (AbstractC12373.f34518a[enumC19947.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.f63261c != i) {
                    return m46187h0(this.f63259a, this.f63260b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (m46194a0() != i2) {
                    return m46189j0(this.f63259a, i2);
                }
                return this;
            case 3:
                return m46203n0(j - mo6949G(EnumC19947.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f63259a < 1) {
                    j = 1 - j;
                }
                return m46207s0((int) j);
            case 5:
                return m46201l0(j - ((long) m46193Z().getValue()));
            case 6:
                return m46201l0(j - mo6949G(EnumC19947.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m46201l0(j - mo6949G(EnumC19947.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m46188i0(j);
            case 9:
                return m46203n0(j - mo6949G(EnumC19947.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.f63260b != i3) {
                    EnumC19947.MONTH_OF_YEAR.m45273T(i3);
                    return m46190p0(this.f63259a, i3, this.f63261c);
                }
                return this;
            case 11:
                return m46202m0(j - m46195b0());
            case 12:
                return m46207s0((int) j);
            case 13:
                if (mo6949G(EnumC19947.ERA) != j) {
                    return m46207s0(1 - this.f63259a);
                }
                return this;
            default:
                throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final C20480 m46207s0(int i) {
        if (this.f63259a == i) {
            return this;
        }
        EnumC19947.YEAR.m45273T(i);
        return m46190p0(i, this.f63260b, this.f63261c);
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: N */
    public final InterfaceC15114 mo16121N(InterfaceC13912 interfaceC13912) {
        if (interfaceC13912 != null) {
            C8547 c8547 = (C8547) interfaceC13912;
            return m46202m0((((long) c8547.f22960a) * 12) + ((long) c8547.f22961b)).m46201l0(c8547.f22962c);
        }
        C12826.requireNonNull(interfaceC13912, "amountToAdd");
        return (C20480) ((C8547) interfaceC13912).mo10794l(this);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final C20480 mo7153d(long j, InterfaceC5865 interfaceC5865) {
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return (C20480) interfaceC5865.mo13170m(this, j);
        }
        switch (AbstractC12373.f34519b[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return m46201l0(j);
            case 2:
                return m46203n0(j);
            case 3:
                return m46202m0(j);
            case 4:
                return m46204o0(j);
            case 5:
                return m46204o0(AbstractC24029.m53227Q(j, 10));
            case 6:
                return m46204o0(AbstractC24029.m53227Q(j, 100));
            case 7:
                return m46204o0(AbstractC24029.m53227Q(j, 1000));
            case 8:
                EnumC19947 enumC19947 = EnumC19947.ERA;
                return mo7152c(AbstractC24029.m53226P(mo6949G(enumC19947), j), enumC19947);
            default:
                throw new C13242("Unsupported unit: " + interfaceC5865);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final C20480 m46204o0(long j) {
        if (j == 0) {
            return this;
        }
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        return m46190p0(enumC19947.f60552b.m53121a(((long) this.f63259a) + j, enumC19947), this.f63260b, this.f63261c);
    }

    /* JADX INFO: renamed from: m0 */
    public final C20480 m46202m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f63259a) * 12) + ((long) (this.f63260b - 1)) + j;
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        long j3 = 12;
        return m46190p0(enumC19947.f60552b.m53121a(AbstractC24029.m53257z(j2, j3), enumC19947), ((int) AbstractC24029.m53225O(j2, j3)) + 1, this.f63261c);
    }

    /* JADX INFO: renamed from: n0 */
    public final C20480 m46203n0(long j) {
        return m46201l0(AbstractC24029.m53227Q(j, 7));
    }

    /* JADX INFO: renamed from: l0 */
    public final C20480 m46201l0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.f63261c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new C20480(this.f63259a, this.f63260b, (int) j2);
            }
            if (j2 <= 59) {
                long jM46197d0 = m46197d0();
                if (j2 <= jM46197d0) {
                    return new C20480(this.f63259a, this.f63260b, (int) j2);
                }
                short s = this.f63260b;
                if (s < 12) {
                    return new C20480(this.f63259a, s + 1, (int) (j2 - jM46197d0));
                }
                EnumC19947.YEAR.m45273T(this.f63259a + 1);
                return new C20480(this.f63259a + 1, 1, (int) (j2 - jM46197d0));
            }
        }
        return m46188i0(AbstractC24029.m53226P(mo16118H(), j));
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C20480 mo16131w(long j, InterfaceC5865 interfaceC5865) {
        return j == Long.MIN_VALUE ? mo7153d(C14849.FOREVER_NS, interfaceC5865).mo7153d(1L, interfaceC5865) : mo7153d(-j, interfaceC5865);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        return c10500 == AbstractC7877.f20684f ? this : AbstractC24029.m53238g(this, c10500);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return AbstractC24029.m53232a(this, interfaceC17263);
    }

    @Override // p067l.InterfaceC17263
    /* JADX INFO: renamed from: g */
    public final long mo7155g(InterfaceC17263 interfaceC17263, InterfaceC5865 interfaceC5865) {
        C20480 c20480M46185X = m46185X(interfaceC17263);
        if (!(interfaceC5865 instanceof EnumC10559)) {
            return interfaceC5865.mo13169l(this, c20480M46185X);
        }
        switch (AbstractC12373.f34519b[((EnumC10559) interfaceC5865).ordinal()]) {
            case 1:
                return c20480M46185X.mo16118H() - mo16118H();
            case 2:
                return (c20480M46185X.mo16118H() - mo16118H()) / 7;
            case 3:
                return m46199f0(c20480M46185X);
            case 4:
                return m46199f0(c20480M46185X) / 12;
            case 5:
                return m46199f0(c20480M46185X) / 120;
            case 6:
                return m46199f0(c20480M46185X) / 1200;
            case 7:
                return m46199f0(c20480M46185X) / 12000;
            case 8:
                EnumC19947 enumC19947 = EnumC19947.ERA;
                return c20480M46185X.mo6949G(enumC19947) - mo6949G(enumC19947);
            default:
                throw new C13242("Unsupported unit: " + interfaceC5865);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final long m46199f0(C20480 c20480) {
        return (((c20480.m46195b0() * 32) + ((long) c20480.f63261c)) - ((m46195b0() * 32) + ((long) this.f63261c))) / 32;
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: I */
    public final InterfaceC15784 mo16119I(C9257 c9257) {
        return C24009.m53182Y(this, c9257);
    }

    public C3715 atStartOfDay(AbstractC7739 abstractC7739) {
        C12826.requireNonNull(abstractC7739, "zone");
        C24009 c24009M53182Y = C24009.m53182Y(this, C9257.f25131g);
        if (!(abstractC7739 instanceof C19550)) {
            Object objM39917e = abstractC7739.mo17864W().m39917e(c24009M53182Y);
            C8821 c8821 = objM39917e instanceof C8821 ? (C8821) objM39917e : null;
            if (c8821 != null && c8821.m20383l()) {
                c24009M53182Y = c8821.f23948b.m53187b0(c8821.f23950d.f59520b - c8821.f23949c.f59520b);
            }
        }
        return C3715.m7142W(c24009M53182Y, abstractC7739, null);
    }

    @Override // p067l.InterfaceC15114
    /* JADX INFO: renamed from: H */
    public final long mo16118H() {
        long j;
        long j2 = this.f63259a;
        long j3 = this.f63260b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.f63261c - 1));
        if (j3 > 2) {
            j5 = !mo17797u() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC15114 interfaceC15114) {
        if (interfaceC15114 instanceof C20480) {
            return m46191V((C20480) interfaceC15114);
        }
        return AbstractC24029.m53233b(this, interfaceC15114);
    }

    /* JADX INFO: renamed from: V */
    public final int m46191V(C20480 c20480) {
        int i = this.f63259a - c20480.f63259a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f63260b - c20480.f63260b;
        return i2 == 0 ? this.f63261c - c20480.f63261c : i2;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m46196c0(InterfaceC15114 interfaceC15114) {
        if (interfaceC15114 instanceof C20480) {
            return m46191V((C20480) interfaceC15114) < 0;
        }
        return mo16118H() < interfaceC15114.mo16118H();
    }

    @Override // p067l.InterfaceC15114
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20480) && m46191V((C20480) obj) == 0;
    }

    @Override // p067l.InterfaceC15114
    public final int hashCode() {
        int i = this.f63259a;
        return (((i << 11) + (this.f63260b << 6)) + this.f63261c) ^ (i & (-2048));
    }

    @Override // p067l.InterfaceC15114
    public final String toString() {
        int i = this.f63259a;
        short s = this.f63260b;
        short s2 = this.f63261c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21959((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
