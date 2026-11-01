package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: com.umeng.commonsdk.utils.c */
/* JADX INFO: compiled from: TAIZ */
/* JADX INFO: loaded from: classes.dex */
public class C0831c {

    /* JADX INFO: renamed from: a */
    public static final String f3576a = "um_slmode_sp";

    /* JADX INFO: renamed from: b */
    public static final String f3577b = "lastReqTime";

    /* JADX INFO: renamed from: c */
    public static final int f3578c = 48;

    /* JADX INFO: renamed from: d */
    public static final int f3579d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f3580e = 720;

    /* JADX INFO: renamed from: f */
    public static final String f3581f = "iss";

    /* JADX INFO: renamed from: g */
    public static final String f3582g = "sinr";

    /* JADX INFO: renamed from: h */
    public static final String f3583h = "clean";

    /* JADX INFO: renamed from: i */
    public static boolean f3584i = false;

    /* JADX INFO: renamed from: j */
    public static int f3585j = 720;

    /* JADX INFO: renamed from: k */
    public static Object f3586k = new Object();

    /* JADX INFO: renamed from: a */
    public static int m3307a(int i) {
        if (i > 720) {
            return f3580e;
        }
        if (i < 1) {
            return 1;
        }
        return i;
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(appContext, f3581f, "");
            if (TextUtils.isEmpty(strImprintProperty) || !"1".equals(strImprintProperty)) {
                return;
            }
            synchronized (f3586k) {
                f3584i = true;
            }
            String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(appContext, f3582g, "");
            if (!TextUtils.isEmpty(strImprintProperty)) {
                try {
                    f3585j = m3307a(Integer.parseInt(strImprintProperty2));
                    return;
                } catch (Throwable unused) {
                    f3585j = 48;
                    return;
                }
            }
            f3585j = 48;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3310a() {
        boolean z;
        synchronized (f3586k) {
            z = f3584i;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static int m3308a(Context context) {
        int i;
        synchronized (f3586k) {
            i = f3585j;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3311a(long j, long j2, int i) {
        Date date = new Date(j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.add(10, i);
        return date.after(calendar.getTime());
    }

    /* JADX INFO: renamed from: b */
    public static long m3312b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f3576a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(f3577b, 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static void m3309a(Context context, long j) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f3576a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(f3577b, j).commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3313c(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f3576a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f3583h, true).commit();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3314d(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f3576a, 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(f3583h, false).commit();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3315e(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f3576a, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(f3583h, false);
        }
        return false;
    }
}
