package p067l;

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
public final class EnumC19947 implements InterfaceC11901 {
    public static final EnumC19947 ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC19947 ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC19947 ALIGNED_WEEK_OF_MONTH;
    public static final EnumC19947 ALIGNED_WEEK_OF_YEAR;
    public static final EnumC19947 AMPM_OF_DAY;
    public static final EnumC19947 CLOCK_HOUR_OF_AMPM;
    public static final EnumC19947 CLOCK_HOUR_OF_DAY;
    public static final EnumC19947 DAY_OF_MONTH;
    public static final EnumC19947 DAY_OF_WEEK;
    public static final EnumC19947 DAY_OF_YEAR;
    public static final EnumC19947 EPOCH_DAY;
    public static final EnumC19947 ERA;
    public static final EnumC19947 HOUR_OF_AMPM;
    public static final EnumC19947 HOUR_OF_DAY;
    public static final EnumC19947 INSTANT_SECONDS;
    public static final EnumC19947 MICRO_OF_DAY;
    public static final EnumC19947 MICRO_OF_SECOND;
    public static final EnumC19947 MILLI_OF_DAY;
    public static final EnumC19947 MILLI_OF_SECOND;
    public static final EnumC19947 MINUTE_OF_DAY;
    public static final EnumC19947 MINUTE_OF_HOUR;
    public static final EnumC19947 MONTH_OF_YEAR;
    public static final EnumC19947 NANO_OF_DAY;
    public static final EnumC19947 NANO_OF_SECOND;
    public static final EnumC19947 OFFSET_SECONDS;
    public static final EnumC19947 PROLEPTIC_MONTH;
    public static final EnumC19947 SECOND_OF_DAY;
    public static final EnumC19947 SECOND_OF_MINUTE;
    public static final EnumC19947 YEAR;
    public static final EnumC19947 YEAR_OF_ERA;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC19947[] f60550c;

    /* JADX INFO: renamed from: a */
    public final String f60551a;

    /* JADX INFO: renamed from: b */
    public final C23970 f60552b;

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC4524 mo3656n(Map map, C17974 c17974, EnumC18645 enumC18645) {
        return null;
    }

    public static EnumC19947 valueOf(String str) {
        return (EnumC19947) Enum.valueOf(EnumC19947.class, str);
    }

    public static EnumC19947[] values() {
        return (EnumC19947[]) f60550c.clone();
    }

    static {
        EnumC10559 enumC10559 = EnumC10559.NANOS;
        EnumC10559 enumC105510 = EnumC10559.SECONDS;
        EnumC19947 enumC19947 = new EnumC19947("NANO_OF_SECOND", 0, "NanoOfSecond", enumC10559, enumC105510, C23970.m53119f(0L, 999999999L));
        NANO_OF_SECOND = enumC19947;
        EnumC10559 enumC105511 = EnumC10559.DAYS;
        EnumC19947 enumC19948 = new EnumC19947("NANO_OF_DAY", 1, "NanoOfDay", enumC10559, enumC105511, C23970.m53119f(0L, 86399999999999L));
        NANO_OF_DAY = enumC19948;
        EnumC10559 enumC105512 = EnumC10559.MICROS;
        EnumC19947 enumC19949 = new EnumC19947("MICRO_OF_SECOND", 2, "MicroOfSecond", enumC105512, enumC105510, C23970.m53119f(0L, 999999L));
        MICRO_OF_SECOND = enumC19949;
        EnumC19947 enumC199410 = new EnumC19947("MICRO_OF_DAY", 3, "MicroOfDay", enumC105512, enumC105511, C23970.m53119f(0L, 86399999999L));
        MICRO_OF_DAY = enumC199410;
        EnumC10559 enumC105513 = EnumC10559.MILLIS;
        EnumC19947 enumC199411 = new EnumC19947("MILLI_OF_SECOND", 4, "MilliOfSecond", enumC105513, enumC105510, C23970.m53119f(0L, 999L));
        MILLI_OF_SECOND = enumC199411;
        EnumC19947 enumC199412 = new EnumC19947("MILLI_OF_DAY", 5, "MilliOfDay", enumC105513, enumC105511, C23970.m53119f(0L, 86399999L));
        MILLI_OF_DAY = enumC199412;
        EnumC10559 enumC105514 = EnumC10559.MINUTES;
        EnumC19947 enumC199413 = new EnumC19947("SECOND_OF_MINUTE", 6, "SecondOfMinute", enumC105510, enumC105514, C23970.m53119f(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC199413;
        EnumC19947 enumC199414 = new EnumC19947("SECOND_OF_DAY", 7, "SecondOfDay", enumC105510, enumC105511, C23970.m53119f(0L, 86399L));
        SECOND_OF_DAY = enumC199414;
        EnumC10559 enumC105515 = EnumC10559.HOURS;
        EnumC19947 enumC199415 = new EnumC19947("MINUTE_OF_HOUR", 8, "MinuteOfHour", enumC105514, enumC105515, C23970.m53119f(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC199415;
        EnumC19947 enumC199416 = new EnumC19947("MINUTE_OF_DAY", 9, "MinuteOfDay", enumC105514, enumC105511, C23970.m53119f(0L, 1439L));
        MINUTE_OF_DAY = enumC199416;
        EnumC10559 enumC105516 = EnumC10559.HALF_DAYS;
        EnumC19947 enumC199417 = new EnumC19947("HOUR_OF_AMPM", 10, "HourOfAmPm", enumC105515, enumC105516, C23970.m53119f(0L, 11L));
        HOUR_OF_AMPM = enumC199417;
        EnumC19947 enumC199418 = new EnumC19947("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", enumC105515, enumC105516, C23970.m53119f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC199418;
        EnumC19947 enumC199419 = new EnumC19947("HOUR_OF_DAY", 12, "HourOfDay", enumC105515, enumC105511, C23970.m53119f(0L, 23L), 0);
        HOUR_OF_DAY = enumC199419;
        EnumC19947 enumC199420 = new EnumC19947("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", enumC105515, enumC105511, C23970.m53119f(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC199420;
        EnumC19947 enumC199421 = new EnumC19947("AMPM_OF_DAY", 14, "AmPmOfDay", enumC105516, enumC105511, C23970.m53119f(0L, 1L), 0);
        AMPM_OF_DAY = enumC199421;
        EnumC10559 enumC105517 = EnumC10559.WEEKS;
        EnumC19947 enumC199422 = new EnumC19947("DAY_OF_WEEK", 15, "DayOfWeek", enumC105511, enumC105517, C23970.m53119f(1L, 7L), 0);
        DAY_OF_WEEK = enumC199422;
        EnumC19947 enumC199423 = new EnumC19947("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", enumC105511, enumC105517, C23970.m53119f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC199423;
        EnumC19947 enumC199424 = new EnumC19947("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", enumC105511, enumC105517, C23970.m53119f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC199424;
        EnumC10559 enumC105518 = EnumC10559.MONTHS;
        EnumC19947 enumC199425 = new EnumC19947("DAY_OF_MONTH", 18, "DayOfMonth", enumC105511, enumC105518, C23970.m53120g(1L, 28L, 31L), 0);
        DAY_OF_MONTH = enumC199425;
        EnumC10559 enumC105519 = EnumC10559.YEARS;
        EnumC19947 enumC199426 = new EnumC19947("DAY_OF_YEAR", 19, "DayOfYear", enumC105511, enumC105519, C23970.m53120g(1L, 365L, 366L));
        DAY_OF_YEAR = enumC199426;
        EnumC10559 enumC105520 = EnumC10559.FOREVER;
        EnumC19947 enumC199427 = new EnumC19947("EPOCH_DAY", 20, "EpochDay", enumC105511, enumC105520, C23970.m53119f(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC199427;
        EnumC19947 enumC199428 = new EnumC19947("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", enumC105517, enumC105518, C23970.m53120g(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC199428;
        EnumC19947 enumC199429 = new EnumC19947("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", enumC105517, enumC105519, C23970.m53119f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC199429;
        EnumC19947 enumC199430 = new EnumC19947("MONTH_OF_YEAR", 23, "MonthOfYear", enumC105518, enumC105519, C23970.m53119f(1L, 12L), 0);
        MONTH_OF_YEAR = enumC199430;
        EnumC19947 enumC199431 = new EnumC19947("PROLEPTIC_MONTH", 24, "ProlepticMonth", enumC105518, enumC105520, C23970.m53119f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC199431;
        EnumC19947 enumC199432 = new EnumC19947("YEAR_OF_ERA", 25, "YearOfEra", enumC105519, enumC105520, C23970.m53120g(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC199432;
        EnumC19947 enumC199433 = new EnumC19947("YEAR", 26, "Year", enumC105519, enumC105520, C23970.m53119f(-999999999L, 999999999L), 0);
        YEAR = enumC199433;
        EnumC19947 enumC199434 = new EnumC19947("ERA", 27, "Era", EnumC10559.ERAS, enumC105520, C23970.m53119f(0L, 1L), 0);
        ERA = enumC199434;
        EnumC19947 enumC199435 = new EnumC19947("INSTANT_SECONDS", 28, "InstantSeconds", enumC105510, enumC105520, C23970.m53119f(Long.MIN_VALUE, C14849.FOREVER_NS));
        INSTANT_SECONDS = enumC199435;
        EnumC19947 enumC199436 = new EnumC19947("OFFSET_SECONDS", 29, "OffsetSeconds", enumC105510, enumC105520, C23970.m53119f(-64800L, 64800L));
        OFFSET_SECONDS = enumC199436;
        f60550c = new EnumC19947[]{enumC19947, enumC19948, enumC19949, enumC199410, enumC199411, enumC199412, enumC199413, enumC199414, enumC199415, enumC199416, enumC199417, enumC199418, enumC199419, enumC199420, enumC199421, enumC199422, enumC199423, enumC199424, enumC199425, enumC199426, enumC199427, enumC199428, enumC199429, enumC199430, enumC199431, enumC199432, enumC199433, enumC199434, enumC199435, enumC199436};
    }

    public EnumC19947(String str, int i, String str2, EnumC10559 enumC10559, EnumC10559 enumC105510, C23970 c23970) {
        super(str, i);
        this.f60551a = str2;
        this.f60552b = c23970;
    }

    public EnumC19947(String str, int i, String str2, EnumC10559 enumC10559, EnumC10559 enumC105510, C23970 c23970, int i2) {
        super(str, i);
        this.f60551a = str2;
        this.f60552b = c23970;
    }

    /* JADX INFO: renamed from: T */
    public final void m45273T(long j) {
        this.f60552b.m53122b(j, this);
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: s */
    public final C23970 mo3657s() {
        return this.f60552b;
    }

    @Override // p067l.InterfaceC11901
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m45274V() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: l */
    public final boolean mo3654l(InterfaceC4524 interfaceC4524) {
        return interfaceC4524.mo6951e(this);
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: m */
    public final C23970 mo3655m(InterfaceC4524 interfaceC4524) {
        return interfaceC4524.mo6953n(this);
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: C */
    public final long mo3652C(InterfaceC4524 interfaceC4524) {
        return interfaceC4524.mo6949G(this);
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: G */
    public final InterfaceC17263 mo3653G(InterfaceC17263 interfaceC17263, long j) {
        return interfaceC17263.mo7152c(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f60551a;
    }
}
