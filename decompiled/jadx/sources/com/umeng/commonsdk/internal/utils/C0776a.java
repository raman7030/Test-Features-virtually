package com.umeng.commonsdk.internal.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodManager;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C0830b;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.a */
/* JADX INFO: compiled from: 948H */
/* JADX INFO: loaded from: classes.dex */
public class C0776a {

    /* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.a$a */
    /* JADX INFO: compiled from: 948H */
    public class a {

        /* JADX INFO: renamed from: a */
        public String f3264a;

        /* JADX INFO: renamed from: b */
        public String f3265b;
    }

    /* JADX INFO: renamed from: b */
    public static void m2833b(Context context) {
    }

    /* JADX INFO: renamed from: i */
    public static String m2845i(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static String m2846j(Context context) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static long m2829a(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            PackageInfo packageInfoM3305a = C0830b.m3304a().m3305a(context, str, 64);
            if (packageInfoM3305a != null) {
                return packageInfoM3305a.firstInstallTime;
            }
            return 0L;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            ULog.m2977e("getAppFirstInstallTime" + th.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m2831b(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            PackageInfo packageInfoM3305a = C0830b.m3304a().m3305a(context, str, 64);
            if (packageInfoM3305a != null) {
                return packageInfoM3305a.lastUpdateTime;
            }
            return 0L;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            ULog.m2977e("getAppLastUpdateTime:" + th.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m2836c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            ULog.m2977e("getAppInstaller:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m2838d(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return 0;
        }
        try {
            PackageInfo packageInfoM3305a = C0830b.m3304a().m3305a(context, str, 64);
            if (packageInfoM3305a == null || (applicationInfo = packageInfoM3305a.applicationInfo) == null) {
                return 0;
            }
            return applicationInfo.uid;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            ULog.m2977e("getAppUid:" + th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2830a() {
        return C0783h.m2860a();
    }

    /* JADX INFO: renamed from: b */
    public static String m2832b() {
        return new SimpleDateFormat().format(new Date());
    }

    /* JADX INFO: renamed from: a */
    public static float m2828a(Context context) {
        if (context == null) {
            return 0.0f;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            return configuration.fontScale;
        } catch (Exception e) {
            ULog.m2977e("getFontSize:" + e.getMessage());
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m2834c(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: renamed from: d */
    public static int m2837d(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* JADX INFO: renamed from: e */
    public static DisplayMetrics m2840e(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: f */
    public static List m2842f(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return null;
        }
        return inputMethodManager.getInputMethodList();
    }

    /* JADX INFO: renamed from: g */
    public static List m2843g(Context context) {
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/Android/data/");
            if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
                for (String str : list) {
                    if (str != null && !str.startsWith(".")) {
                        a aVar = new a();
                        aVar.f3264a = str;
                        aVar.f3265b = m2841e(context, str);
                        arrayList.add(aVar);
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            ULog.m2977e("getAppList:" + e.getMessage());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m2841e(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return (String) applicationInfo.loadLabel(context.getPackageManager());
            }
            return null;
        } catch (Exception e) {
            ULog.m2977e("getLabel:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static ActivityManager.MemoryInfo m2844h(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* JADX INFO: renamed from: c */
    public static long m2835c() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: d */
    public static String m2839d() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            String string = declaredMethod.invoke(null, "net.hostname").toString();
            return (string == null || string.equalsIgnoreCase("")) ? string : HelperUtils.getUmengMD5(string);
        } catch (Exception e) {
            ULog.m2977e("getHostName:" + e.getMessage());
            return null;
        }
    }
}
