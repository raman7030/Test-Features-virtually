package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class TimeSource {
    public static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);
    public final Long fixedTimeMs;
    public final TimeZone fixedTimeZone;

    public TimeSource(Long l2, TimeZone timeZone) {
        this.fixedTimeMs = l2;
        this.fixedTimeZone = timeZone;
    }

    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    public static TimeSource fixed(long j, TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j), timeZone);
    }

    public static TimeSource fixed(long j) {
        return new TimeSource(Long.valueOf(j), null);
    }

    public Calendar now() {
        return now(this.fixedTimeZone);
    }

    public Calendar now(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = this.fixedTimeMs;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        return calendar;
    }
}
