package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ᩴۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC18496 implements InterfaceC10030 {
    public static final EnumC18496 ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC18496 ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC18496 ALIGNED_WEEK_OF_MONTH;
    public static final EnumC18496 ALIGNED_WEEK_OF_YEAR;
    public static final EnumC18496 AMPM_OF_DAY;
    public static final EnumC18496 CLOCK_HOUR_OF_AMPM;
    public static final EnumC18496 CLOCK_HOUR_OF_DAY;
    public static final EnumC18496 DAY_OF_MONTH;
    public static final EnumC18496 DAY_OF_WEEK;
    public static final EnumC18496 DAY_OF_YEAR;
    public static final EnumC18496 EPOCH_DAY;
    public static final EnumC18496 ERA;
    public static final EnumC18496 HOUR_OF_AMPM;
    public static final EnumC18496 HOUR_OF_DAY;
    public static final EnumC18496 INSTANT_SECONDS;
    public static final EnumC18496 MICRO_OF_DAY;
    public static final EnumC18496 MICRO_OF_SECOND;
    public static final EnumC18496 MILLI_OF_DAY;
    public static final EnumC18496 MILLI_OF_SECOND;
    public static final EnumC18496 MINUTE_OF_DAY;
    public static final EnumC18496 MINUTE_OF_HOUR;
    public static final EnumC18496 MONTH_OF_YEAR;
    public static final EnumC18496 NANO_OF_DAY;
    public static final EnumC18496 NANO_OF_SECOND;
    public static final EnumC18496 OFFSET_SECONDS;
    public static final EnumC18496 PROLEPTIC_MONTH;
    public static final EnumC18496 SECOND_OF_DAY;
    public static final EnumC18496 SECOND_OF_MINUTE;
    public static final EnumC18496 YEAR;
    public static final EnumC18496 YEAR_OF_ERA;
    public static final /* synthetic */ EnumC18496[] c;
    public final String a;
    public final C22729 b;

    @Override // l.InterfaceC10030
    public final /* synthetic */ InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
        return null;
    }

    public static EnumC18496 valueOf(String str) {
        return (EnumC18496) Enum.valueOf(EnumC18496.class, str);
    }

    public static EnumC18496[] values() {
        return (EnumC18496[]) c.clone();
    }

    static {
        EnumC8618 enumC8618 = EnumC8618.NANOS;
        EnumC8618 enumC8619 = EnumC8618.SECONDS;
        EnumC18496 enumC18496 = new EnumC18496("NANO_OF_SECOND", 0, "NanoOfSecond", enumC8618, enumC8619, C22729.f(0L, 999999999L));
        NANO_OF_SECOND = enumC18496;
        EnumC8618 enumC86110 = EnumC8618.DAYS;
        EnumC18496 enumC18497 = new EnumC18496("NANO_OF_DAY", 1, "NanoOfDay", enumC8618, enumC86110, C22729.f(0L, 86399999999999L));
        NANO_OF_DAY = enumC18497;
        EnumC8618 enumC86111 = EnumC8618.MICROS;
        EnumC18496 enumC18498 = new EnumC18496("MICRO_OF_SECOND", 2, "MicroOfSecond", enumC86111, enumC8619, C22729.f(0L, 999999L));
        MICRO_OF_SECOND = enumC18498;
        EnumC18496 enumC18499 = new EnumC18496("MICRO_OF_DAY", 3, "MicroOfDay", enumC86111, enumC86110, C22729.f(0L, 86399999999L));
        MICRO_OF_DAY = enumC18499;
        EnumC8618 enumC86112 = EnumC8618.MILLIS;
        EnumC18496 enumC184910 = new EnumC18496("MILLI_OF_SECOND", 4, "MilliOfSecond", enumC86112, enumC8619, C22729.f(0L, 999L));
        MILLI_OF_SECOND = enumC184910;
        EnumC18496 enumC184911 = new EnumC18496("MILLI_OF_DAY", 5, "MilliOfDay", enumC86112, enumC86110, C22729.f(0L, 86399999L));
        MILLI_OF_DAY = enumC184911;
        EnumC8618 enumC86113 = EnumC8618.MINUTES;
        EnumC18496 enumC184912 = new EnumC18496("SECOND_OF_MINUTE", 6, "SecondOfMinute", enumC8619, enumC86113, C22729.f(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC184912;
        EnumC18496 enumC184913 = new EnumC18496("SECOND_OF_DAY", 7, "SecondOfDay", enumC8619, enumC86110, C22729.f(0L, 86399L));
        SECOND_OF_DAY = enumC184913;
        EnumC8618 enumC86114 = EnumC8618.HOURS;
        EnumC18496 enumC184914 = new EnumC18496("MINUTE_OF_HOUR", 8, "MinuteOfHour", enumC86113, enumC86114, C22729.f(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC184914;
        EnumC18496 enumC184915 = new EnumC18496("MINUTE_OF_DAY", 9, "MinuteOfDay", enumC86113, enumC86110, C22729.f(0L, 1439L));
        MINUTE_OF_DAY = enumC184915;
        EnumC8618 enumC86115 = EnumC8618.HALF_DAYS;
        EnumC18496 enumC184916 = new EnumC18496("HOUR_OF_AMPM", 10, "HourOfAmPm", enumC86114, enumC86115, C22729.f(0L, 11L));
        HOUR_OF_AMPM = enumC184916;
        EnumC18496 enumC184917 = new EnumC18496("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", enumC86114, enumC86115, C22729.f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC184917;
        EnumC18496 enumC184918 = new EnumC18496("HOUR_OF_DAY", 12, "HourOfDay", enumC86114, enumC86110, C22729.f(0L, 23L), 0);
        HOUR_OF_DAY = enumC184918;
        EnumC18496 enumC184919 = new EnumC18496("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", enumC86114, enumC86110, C22729.f(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC184919;
        EnumC18496 enumC184920 = new EnumC18496("AMPM_OF_DAY", 14, "AmPmOfDay", enumC86115, enumC86110, C22729.f(0L, 1L), 0);
        AMPM_OF_DAY = enumC184920;
        EnumC8618 enumC86116 = EnumC8618.WEEKS;
        EnumC18496 enumC184921 = new EnumC18496("DAY_OF_WEEK", 15, "DayOfWeek", enumC86110, enumC86116, C22729.f(1L, 7L), 0);
        DAY_OF_WEEK = enumC184921;
        EnumC18496 enumC184922 = new EnumC18496("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", enumC86110, enumC86116, C22729.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC184922;
        EnumC18496 enumC184923 = new EnumC18496("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", enumC86110, enumC86116, C22729.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC184923;
        EnumC8618 enumC86117 = EnumC8618.MONTHS;
        EnumC18496 enumC184924 = new EnumC18496("DAY_OF_MONTH", 18, "DayOfMonth", enumC86110, enumC86117, C22729.g(1L, 28L, 31L), 0);
        DAY_OF_MONTH = enumC184924;
        EnumC8618 enumC86118 = EnumC8618.YEARS;
        EnumC18496 enumC184925 = new EnumC18496("DAY_OF_YEAR", 19, "DayOfYear", enumC86110, enumC86118, C22729.g(1L, 365L, 366L));
        DAY_OF_YEAR = enumC184925;
        EnumC8618 enumC86119 = EnumC8618.FOREVER;
        EnumC18496 enumC184926 = new EnumC18496("EPOCH_DAY", 20, "EpochDay", enumC86110, enumC86119, C22729.f(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC184926;
        EnumC18496 enumC184927 = new EnumC18496("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", enumC86116, enumC86117, C22729.g(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC184927;
        EnumC18496 enumC184928 = new EnumC18496("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", enumC86116, enumC86118, C22729.f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC184928;
        EnumC18496 enumC184929 = new EnumC18496("MONTH_OF_YEAR", 23, "MonthOfYear", enumC86117, enumC86118, C22729.f(1L, 12L), 0);
        MONTH_OF_YEAR = enumC184929;
        EnumC18496 enumC184930 = new EnumC18496("PROLEPTIC_MONTH", 24, "ProlepticMonth", enumC86117, enumC86119, C22729.f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC184930;
        EnumC18496 enumC184931 = new EnumC18496("YEAR_OF_ERA", 25, "YearOfEra", enumC86118, enumC86119, C22729.g(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC184931;
        EnumC18496 enumC184932 = new EnumC18496("YEAR", 26, "Year", enumC86118, enumC86119, C22729.f(-999999999L, 999999999L), 0);
        YEAR = enumC184932;
        EnumC18496 enumC184933 = new EnumC18496("ERA", 27, "Era", EnumC8618.ERAS, enumC86119, C22729.f(0L, 1L), 0);
        ERA = enumC184933;
        EnumC18496 enumC184934 = new EnumC18496("INSTANT_SECONDS", 28, "InstantSeconds", enumC8619, enumC86119, C22729.f(Long.MIN_VALUE, C13132.FOREVER_NS));
        INSTANT_SECONDS = enumC184934;
        EnumC18496 enumC184935 = new EnumC18496("OFFSET_SECONDS", 29, "OffsetSeconds", enumC8619, enumC86119, C22729.f(-64800L, 64800L));
        OFFSET_SECONDS = enumC184935;
        c = new EnumC18496[]{enumC18496, enumC18497, enumC18498, enumC18499, enumC184910, enumC184911, enumC184912, enumC184913, enumC184914, enumC184915, enumC184916, enumC184917, enumC184918, enumC184919, enumC184920, enumC184921, enumC184922, enumC184923, enumC184924, enumC184925, enumC184926, enumC184927, enumC184928, enumC184929, enumC184930, enumC184931, enumC184932, enumC184933, enumC184934, enumC184935};
    }

    public EnumC18496(String str, int i, String str2, EnumC8618 enumC8618, EnumC8618 enumC8619, C22729 c22729) {
        super(str, i);
        this.a = str2;
        this.b = c22729;
    }

    public EnumC18496(String str, int i, String str2, EnumC8618 enumC8618, EnumC8618 enumC8619, C22729 c22729, int i2) {
        super(str, i);
        this.a = str2;
        this.b = c22729;
    }

    public final void T(long j) {
        this.b.b(j, this);
    }

    @Override // l.InterfaceC10030
    public final C22729 s() {
        return this.b;
    }

    @Override // l.InterfaceC10030
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean V() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // l.InterfaceC10030
    public final boolean l(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.e(this);
    }

    @Override // l.InterfaceC10030
    public final C22729 m(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.n(this);
    }

    @Override // l.InterfaceC10030
    public final long C(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.G(this);
    }

    @Override // l.InterfaceC10030
    public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
        return interfaceC15672.c(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
