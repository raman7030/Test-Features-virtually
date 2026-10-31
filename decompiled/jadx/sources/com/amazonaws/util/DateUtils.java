package com.amazonaws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import l.C3261;

/* JADX INFO: loaded from: classes.dex */
public class DateUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final TimeZone f830 = C3261.getTimeZone("GMT");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f831 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m768(final String str) {
        ThreadLocal threadLocal;
        HashMap map = f831;
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
                        simpleDateFormat.setTimeZone(DateUtils.f830);
                        simpleDateFormat.setLenient(false);
                        return simpleDateFormat;
                    }
                };
                map.put(str, threadLocal);
            }
        }
        return threadLocal;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Date m769(String str, String str2) {
        try {
            return ((SimpleDateFormat) m768(str).get()).parse(str2);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m767(String str, Date date) {
        return ((SimpleDateFormat) m768(str).get()).format(date);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Date m772(String str) {
        try {
            return m769("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", str);
        } catch (IllegalArgumentException unused) {
            return m769("yyyy-MM-dd'T'HH:mm:ss'Z'", str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Date m770(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }
}
