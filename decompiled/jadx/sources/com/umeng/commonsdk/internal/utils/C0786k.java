package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.k */
/* JADX INFO: compiled from: O48C */
/* JADX INFO: loaded from: classes.dex */
public class C0786k {

    /* JADX INFO: renamed from: a */
    public static final String f3298a = "UM_PROBE_DATA";

    /* JADX INFO: renamed from: b */
    public static final String f3299b = "_dsk_s";

    /* JADX INFO: renamed from: c */
    public static final String f3300c = "_thm_z";

    /* JADX INFO: renamed from: d */
    public static final String f3301d = "_gdf_r";

    /* JADX INFO: renamed from: e */
    public static Object f3302e = new Object();

    /* JADX INFO: renamed from: a */
    public static String m2869a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f3298a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (f3302e) {
                jSONObject.put(f3299b, sharedPreferences.getString(f3299b, ""));
                jSONObject.put(f3300c, sharedPreferences.getString(f3300c, ""));
                jSONObject.put(f3301d, sharedPreferences.getString(f3301d, ""));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2872b(final Context context) {
        if (m2875c(context)) {
            return;
        }
        final String[] strArr = {"unknown", "unknown", "unknown"};
        new Thread() { // from class: com.umeng.commonsdk.internal.utils.k.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                try {
                    strArr[0] = C0786k.m2874c();
                    strArr[1] = C0786k.m2868a();
                    strArr[2] = C0786k.m2871b();
                    ULog.m2983i("diskType = " + strArr[0] + "; ThremalZone = " + strArr[1] + "; GoldFishRc = " + strArr[2]);
                    C0786k.m2873b(context, strArr);
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }.start();
    }

    /* JADX INFO: renamed from: b */
    public static void m2873b(Context context, String[] strArr) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f3298a, 0)) == null) {
            return;
        }
        synchronized (f3302e) {
            sharedPreferences.edit().putString(f3299b, strArr[0]).putString(f3300c, strArr[1]).putString(f3301d, strArr[2]).commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2875c(Context context) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f3298a, 0)) == null || TextUtils.isEmpty(sharedPreferences.getString(f3299b, ""))) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static int m2867a(String str, String str2) throws IOException {
        int i;
        if (Build.VERSION.SDK_INT > 28) {
            return -1;
        }
        Process processExec = Runtime.getRuntime().exec(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                i = -1;
                break;
            }
            if (line.contains(str2)) {
                i = 1;
                break;
            }
        }
        try {
            if (processExec.waitFor() != 0) {
                return -1;
            }
            return i;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2868a() {
        int iM2867a;
        try {
            iM2867a = m2867a("ls /sys/class/thermal", "thermal_zone");
        } catch (Throwable unused) {
            iM2867a = -1;
        }
        if (iM2867a > 0) {
            return "thermal_zone";
        }
        return iM2867a < 0 ? "noper" : "unknown";
    }

    /* JADX INFO: renamed from: b */
    public static String m2871b() {
        int iM2867a;
        try {
            iM2867a = m2867a("ls /", "goldfish");
        } catch (Throwable unused) {
            iM2867a = -1;
        }
        if (iM2867a > 0) {
            return "goldfish";
        }
        return iM2867a < 0 ? "noper" : "unknown";
    }

    /* JADX INFO: renamed from: c */
    public static String m2874c() {
        BufferedReader bufferedReader;
        String line;
        String str = "mtd";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/diskstats"));
            do {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        str = "unknown";
                        break;
                    }
                    if (line.contains("mmcblk")) {
                        str = "mmcblk";
                        break;
                    }
                    if (line.contains("sda")) {
                        str = "sda";
                        break;
                    }
                } catch (Throwable unused) {
                    bufferedReader2 = bufferedReader;
                    str = "noper";
                    bufferedReader = bufferedReader2;
                }
            } while (!line.contains("mtd"));
        } catch (Throwable unused2) {
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Throwable unused3) {
            }
        }
        return str;
    }
}
