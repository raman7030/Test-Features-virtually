package p067l;

import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ܶۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC16593 implements InterfaceC11901 {
    public static final EnumC16593 DAY_OF_QUARTER;
    public static final EnumC16593 QUARTER_OF_YEAR;
    public static final EnumC16593 WEEK_BASED_YEAR;
    public static final EnumC16593 WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a */
    public static final int[] f48736a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC16593[] f48737b;

    @Override // p067l.InterfaceC11901
    public final boolean isDateBased() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public /* synthetic */ InterfaceC4524 mo3656n(Map map, C17974 c17974, EnumC18645 enumC18645) {
        return null;
    }

    public static EnumC16593 valueOf(String str) {
        return (EnumC16593) Enum.valueOf(EnumC16593.class, str);
    }

    public static EnumC16593[] values() {
        return (EnumC16593[]) f48737b.clone();
    }

    static {
        EnumC16593 enumC16593 = new EnumC16593() { // from class: l.֡ۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: s */
            public final C23970 mo3657s() {
                return C23970.m53120g(1L, 90L, 92L);
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: l */
            public final boolean mo3654l(InterfaceC4524 interfaceC4524) {
                if (!interfaceC4524.mo6951e(EnumC19947.DAY_OF_YEAR) || !interfaceC4524.mo6951e(EnumC19947.MONTH_OF_YEAR) || !interfaceC4524.mo6951e(EnumC19947.YEAR)) {
                    return false;
                }
                EnumC16593 enumC16594 = AbstractC23300.f73302a;
                return AbstractC17736.m40316r(interfaceC4524).equals(C10361.f28676c);
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: m */
            public final C23970 mo3655m(InterfaceC4524 interfaceC4524) {
                if (!mo3654l(interfaceC4524)) {
                    throw new C13242("Unsupported field: DayOfQuarter");
                }
                long jMo6949G = interfaceC4524.mo6949G(EnumC16593.QUARTER_OF_YEAR);
                if (jMo6949G == 1) {
                    return C10361.f28676c.mo10582S(interfaceC4524.mo6949G(EnumC19947.YEAR)) ? C23970.m53119f(1L, 91L) : C23970.m53119f(1L, 90L);
                }
                if (jMo6949G == 2) {
                    return C23970.m53119f(1L, 91L);
                }
                if (jMo6949G == 3 || jMo6949G == 4) {
                    return C23970.m53119f(1L, 92L);
                }
                return mo3657s();
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: C */
            public final long mo3652C(InterfaceC4524 interfaceC4524) {
                if (!mo3654l(interfaceC4524)) {
                    throw new C13242("Unsupported field: DayOfQuarter");
                }
                return interfaceC4524.mo6952l(EnumC19947.DAY_OF_YEAR) - EnumC16593.f48736a[((interfaceC4524.mo6952l(EnumC19947.MONTH_OF_YEAR) - 1) / 3) + (C10361.f28676c.mo10582S(interfaceC4524.mo6949G(EnumC19947.YEAR)) ? 4 : 0)];
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: G */
            public final InterfaceC17263 mo3653G(InterfaceC17263 interfaceC17263, long j) {
                long jMo3652C = mo3652C(interfaceC17263);
                mo3657s().m53122b(j, this);
                EnumC19947 enumC19947 = EnumC19947.DAY_OF_YEAR;
                return interfaceC17263.mo7152c((j - jMo3652C) + interfaceC17263.mo6949G(enumC19947), enumC19947);
            }

            @Override // p067l.EnumC16593, p067l.InterfaceC11901
            /* JADX INFO: renamed from: n */
            public final InterfaceC4524 mo3656n(Map map, C17974 c17974, EnumC18645 enumC18645) {
                long jM53228R;
                C20480 c20480M46202m0;
                EnumC19947 enumC19947 = EnumC19947.YEAR;
                Long l2 = (Long) map.get(enumC19947);
                InterfaceC11901 interfaceC11901 = EnumC16593.QUARTER_OF_YEAR;
                Long l3 = (Long) map.get(interfaceC11901);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iM53121a = enumC19947.f60552b.m53121a(l2.longValue(), enumC19947);
                long jLongValue = ((Long) map.get(EnumC16593.DAY_OF_QUARTER)).longValue();
                EnumC16593 enumC16594 = AbstractC23300.f73302a;
                if (!AbstractC17736.m40316r(c17974).equals(C10361.f28676c)) {
                    throw new C17796("Resolve requires IsoChronology");
                }
                if (enumC18645 == EnumC18645.LENIENT) {
                    c20480M46202m0 = C20480.m46187h0(iM53121a, 1, 1).m46202m0(AbstractC24029.m53227Q(AbstractC24029.m53228R(l3.longValue(), 1L), 3));
                    jM53228R = AbstractC24029.m53228R(jLongValue, 1L);
                } else {
                    C20480 c20480M46187h0 = C20480.m46187h0(iM53121a, ((interfaceC11901.mo3657s().m53121a(l3.longValue(), interfaceC11901) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (enumC18645 == EnumC18645.STRICT) {
                            mo3655m(c20480M46187h0).m53122b(jLongValue, this);
                        } else {
                            mo3657s().m53122b(jLongValue, this);
                        }
                    }
                    jM53228R = jLongValue - 1;
                    c20480M46202m0 = c20480M46187h0;
                }
                map.remove(this);
                map.remove(enumC19947);
                map.remove(interfaceC11901);
                return c20480M46202m0.m46201l0(jM53228R);
            }
        };
        DAY_OF_QUARTER = enumC16593;
        EnumC16593 enumC16594 = new EnumC16593() { // from class: l.ۚۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: s */
            public final C23970 mo3657s() {
                return C23970.m53119f(1L, 4L);
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: l */
            public final boolean mo3654l(InterfaceC4524 interfaceC4524) {
                if (!interfaceC4524.mo6951e(EnumC19947.MONTH_OF_YEAR)) {
                    return false;
                }
                EnumC16593 enumC16595 = AbstractC23300.f73302a;
                return AbstractC17736.m40316r(interfaceC4524).equals(C10361.f28676c);
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: C */
            public final long mo3652C(InterfaceC4524 interfaceC4524) {
                if (!mo3654l(interfaceC4524)) {
                    throw new C13242("Unsupported field: QuarterOfYear");
                }
                return (interfaceC4524.mo6949G(EnumC19947.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: m */
            public final C23970 mo3655m(InterfaceC4524 interfaceC4524) {
                if (!mo3654l(interfaceC4524)) {
                    throw new C13242("Unsupported field: QuarterOfYear");
                }
                return mo3657s();
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: G */
            public final InterfaceC17263 mo3653G(InterfaceC17263 interfaceC17263, long j) {
                long jMo3652C = mo3652C(interfaceC17263);
                mo3657s().m53122b(j, this);
                EnumC19947 enumC19947 = EnumC19947.MONTH_OF_YEAR;
                return interfaceC17263.mo7152c(((j - jMo3652C) * 3) + interfaceC17263.mo6949G(enumC19947), enumC19947);
            }
        };
        QUARTER_OF_YEAR = enumC16594;
        EnumC16593 enumC16595 = new EnumC16593() { // from class: l.֨ۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: s */
            public final C23970 mo3657s() {
                return C23970.m53120g(1L, 52L, 53L);
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: l */
            public final boolean mo3654l(InterfaceC4524 interfaceC4524) {
                if (!interfaceC4524.mo6951e(EnumC19947.EPOCH_DAY)) {
                    return false;
                }
                EnumC16593 enumC16596 = AbstractC23300.f73302a;
                return AbstractC17736.m40316r(interfaceC4524).equals(C10361.f28676c);
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: m */
            public final C23970 mo3655m(InterfaceC4524 interfaceC4524) {
                if (mo3654l(interfaceC4524)) {
                    return EnumC16593.m37608X(C20480.m46185X(interfaceC4524));
                }
                throw new C13242("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: C */
            public final long mo3652C(InterfaceC4524 interfaceC4524) {
                if (!mo3654l(interfaceC4524)) {
                    throw new C13242("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC16593.m37605T(C20480.m46185X(interfaceC4524));
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: G */
            public final InterfaceC17263 mo3653G(InterfaceC17263 interfaceC17263, long j) {
                mo3657s().m53122b(j, this);
                return interfaceC17263.mo7153d(AbstractC24029.m53228R(j, mo3652C(interfaceC17263)), EnumC10559.WEEKS);
            }

            @Override // p067l.EnumC16593, p067l.InterfaceC11901
            /* JADX INFO: renamed from: n */
            public final InterfaceC4524 mo3656n(Map map, C17974 c17974, EnumC18645 enumC18645) {
                C20480 c20480Mo7152c;
                long j;
                C20480 c20480M46203n0;
                long j2;
                InterfaceC11901 interfaceC11901 = EnumC16593.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(interfaceC11901);
                EnumC19947 enumC19947 = EnumC19947.DAY_OF_WEEK;
                Long l3 = (Long) map.get(enumC19947);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iM53121a = interfaceC11901.mo3657s().m53121a(l2.longValue(), interfaceC11901);
                long jLongValue = ((Long) map.get(EnumC16593.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                EnumC16593 enumC16596 = AbstractC23300.f73302a;
                if (!AbstractC17736.m40316r(c17974).equals(C10361.f28676c)) {
                    throw new C17796("Resolve requires IsoChronology");
                }
                C20480 c20480M46187h0 = C20480.m46187h0(iM53121a, 1, 4);
                if (enumC18645 == EnumC18645.LENIENT) {
                    long jLongValue2 = l3.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        c20480M46203n0 = c20480M46187h0.m46203n0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            c20480M46203n0 = c20480M46187h0.m46203n0(AbstractC24029.m53228R(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        c20480Mo7152c = c20480M46187h0.m46203n0(AbstractC24029.m53228R(jLongValue, j)).mo7152c(jLongValue2, enumC19947);
                    }
                    c20480M46187h0 = c20480M46203n0;
                    j = 1;
                    jLongValue2 = j2 + 1;
                    c20480Mo7152c = c20480M46187h0.m46203n0(AbstractC24029.m53228R(jLongValue, j)).mo7152c(jLongValue2, enumC19947);
                } else {
                    int iM53121a2 = enumC19947.f60552b.m53121a(l3.longValue(), enumC19947);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (enumC18645 == EnumC18645.STRICT) {
                            EnumC16593.m37608X(c20480M46187h0).m53122b(jLongValue, this);
                        } else {
                            mo3657s().m53122b(jLongValue, this);
                        }
                    }
                    c20480Mo7152c = c20480M46187h0.m46203n0(jLongValue - 1).mo7152c(iM53121a2, enumC19947);
                }
                map.remove(this);
                map.remove(interfaceC11901);
                map.remove(enumC19947);
                return c20480Mo7152c;
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC16595;
        EnumC16593 enumC16596 = new EnumC16593() { // from class: l.۠ۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: s */
            public final C23970 mo3657s() {
                return EnumC19947.YEAR.f60552b;
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: l */
            public final boolean mo3654l(InterfaceC4524 interfaceC4524) {
                if (!interfaceC4524.mo6951e(EnumC19947.EPOCH_DAY)) {
                    return false;
                }
                EnumC16593 enumC16597 = AbstractC23300.f73302a;
                return AbstractC17736.m40316r(interfaceC4524).equals(C10361.f28676c);
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: C */
            public final long mo3652C(InterfaceC4524 interfaceC4524) {
                if (mo3654l(interfaceC4524)) {
                    return EnumC16593.m37606V(C20480.m46185X(interfaceC4524));
                }
                throw new C13242("Unsupported field: WeekBasedYear");
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: m */
            public final C23970 mo3655m(InterfaceC4524 interfaceC4524) {
                if (!mo3654l(interfaceC4524)) {
                    throw new C13242("Unsupported field: WeekBasedYear");
                }
                return mo3657s();
            }

            @Override // p067l.InterfaceC11901
            /* JADX INFO: renamed from: G */
            public final InterfaceC17263 mo3653G(InterfaceC17263 interfaceC17263, long j) {
                if (!mo3654l(interfaceC17263)) {
                    throw new C13242("Unsupported field: WeekBasedYear");
                }
                int iM53121a = EnumC19947.YEAR.f60552b.m53121a(j, EnumC16593.WEEK_BASED_YEAR);
                C20480 c20480M46185X = C20480.m46185X(interfaceC17263);
                EnumC19947 enumC19947 = EnumC19947.DAY_OF_WEEK;
                int iMo6952l = c20480M46185X.mo6952l(enumC19947);
                int iM37605T = EnumC16593.m37605T(c20480M46185X);
                if (iM37605T == 53 && EnumC16593.m37607W(iM53121a) == 52) {
                    iM37605T = 52;
                }
                C20480 c20480M46187h0 = C20480.m46187h0(iM53121a, 1, 4);
                return interfaceC17263.mo7158m(c20480M46187h0.m46201l0(((iM37605T - 1) * 7) + (iMo6952l - c20480M46187h0.mo6952l(enumC19947))));
            }
        };
        WEEK_BASED_YEAR = enumC16596;
        f48737b = new EnumC16593[]{enumC16593, enumC16594, enumC16595, enumC16596};
        f48736a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: renamed from: X */
    public static C23970 m37608X(C20480 c20480) {
        return C23970.m53119f(1L, m37607W(m37606V(c20480)));
    }

    /* JADX INFO: renamed from: W */
    public static int m37607W(int i) {
        C20480 c20480M46187h0 = C20480.m46187h0(i, 1, 1);
        if (c20480M46187h0.m46193Z() != EnumC23162.THURSDAY) {
            return (c20480M46187h0.m46193Z() == EnumC23162.WEDNESDAY && c20480M46187h0.mo17797u()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: renamed from: T */
    public static int m37605T(C20480 c20480) {
        int iOrdinal = c20480.m46193Z().ordinal();
        int iM46194a0 = c20480.m46194a0() - 1;
        int i = (3 - iOrdinal) + iM46194a0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iM46194a0 >= i3) {
            int i4 = ((iM46194a0 - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && c20480.mo17797u())) {
                return i4;
            }
            return 1;
        }
        if (c20480.m46194a0() != 180) {
            c20480 = C20480.m46189j0(c20480.f63259a, 180);
        }
        return (int) m37608X(c20480.m46204o0(-1L)).f76159d;
    }

    /* JADX INFO: renamed from: V */
    public static int m37606V(C20480 c20480) {
        int i = c20480.f63259a;
        int iM46194a0 = c20480.m46194a0();
        if (iM46194a0 <= 3) {
            return iM46194a0 - c20480.m46193Z().ordinal() < -2 ? i - 1 : i;
        }
        if (iM46194a0 >= 363) {
            return ((iM46194a0 - 363) - (c20480.mo17797u() ? 1 : 0)) - c20480.m46193Z().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
