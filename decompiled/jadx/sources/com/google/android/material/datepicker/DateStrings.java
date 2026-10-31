package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import l.C10220;
import l.C3820;

/* JADX INFO: loaded from: classes.dex */
public class DateStrings {
    public static String getYearMonth(long j) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j));
        }
        return DateUtils.formatDateTime(null, j, 8228);
    }

    public static String getYearMonthDay(long j) {
        return getYearMonthDay(j, Locale.getDefault());
    }

    public static String getYearMonthDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getMediumFormat(locale).format(new Date(j));
    }

    public static String getMonthDay(long j) {
        return getMonthDay(j, Locale.getDefault());
    }

    public static String getMonthDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getMediumNoYear(locale).format(new Date(j));
    }

    public static C10220 getDateRangeString(Long l2, Long l3, SimpleDateFormat simpleDateFormat) {
        if (l2 == null && l3 == null) {
            return new C10220(null, null);
        }
        if (l2 == null) {
            return new C10220(null, getDateString(l3.longValue(), simpleDateFormat));
        }
        if (l3 == null) {
            return new C10220(getDateString(l2.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l2.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l3.longValue());
        if (simpleDateFormat != null) {
            return new C10220(simpleDateFormat.format(new Date(l2.longValue())), simpleDateFormat.format(new Date(l3.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            return utcCalendar.get(1) == todayCalendar.get(1) ? new C10220(getMonthDay(l2.longValue(), Locale.getDefault()), getMonthDay(l3.longValue(), Locale.getDefault())) : new C10220(getMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
        }
        return new C10220(getYearMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
    }

    public static String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getFullFormat(locale).format(new Date(j));
    }

    public static String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getFullFormat(locale).format(new Date(j));
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j) {
        if (isDateWithinCurrentYear(j)) {
            return getMonthDayOfWeekDay(j);
        }
        return getYearMonthDayOfWeekDay(j);
    }

    public static String getDateString(long j) {
        return getDateString(j, null);
    }

    public static String getDateString(long j, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (isDateWithinCurrentYear(j)) {
            return getMonthDay(j);
        }
        return getYearMonthDay(j);
    }

    public static boolean isDateWithinCurrentYear(long j) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    public static C10220 getDateRangeString(Long l2, Long l3) {
        return getDateRangeString(l2, l3, null);
    }

    public static String getDayContentDescription(Context context, long j, boolean z, boolean z2, boolean z3) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j);
        if (z) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(C3820.f12172), optionalYearMonthDayOfWeekDay);
        }
        if (z2) {
            return String.format(context.getString(C3820.f12100), optionalYearMonthDayOfWeekDay);
        }
        return z3 ? String.format(context.getString(C3820.f12191), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    public static String getYearContentDescription(Context context, int i) {
        if (UtcDates.getTodayCalendar().get(1) == i) {
            return String.format(context.getString(C3820.f12161), Integer.valueOf(i));
        }
        return String.format(context.getString(C3820.f12206), Integer.valueOf(i));
    }
}
