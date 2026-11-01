package com.amazonaws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p067l.C5468;

/* JADX INFO: loaded from: classes.dex */
public class DateUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final TimeZone f1990 = C5468.getTimeZone("GMT");

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f1991 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static ThreadLocal m1933(final String str) {
        ThreadLocal threadLocal;
        HashMap map = f1991;
        ThreadLocal threadLocal2 = (ThreadLocal) map.get(str);
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (map) {
            threadLocal = (ThreadLocal) map.get(str);
            if (threadLocal == null) {
                threadLocal = new ThreadLocal() { // from class: com.amazonaws.util.DateUtils.1
                    @Override // java.lang.ThreadLocal
                    public final Object initialValue() {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
                        simpleDateFormat.setTimeZone(DateUtils.f1990);
                        simpleDateFormat.setLenient(false);
                        return simpleDateFormat;
                    }
                };
                map.put(str, threadLocal);
            }
        }
        return threadLocal;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Date m1934(String str, String str2) {
        try {
            return ((SimpleDateFormat) m1933(str).get()).parse(str2);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1932(String str, Date date) {
        return ((SimpleDateFormat) m1933(str).get()).format(date);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Date m1937(String str) {
        try {
            return m1934("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", str);
        } catch (IllegalArgumentException unused) {
            return m1934("yyyy-MM-dd'T'HH:mm:ss'Z'", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Date m1935(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }
}
