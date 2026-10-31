package com.alipay.sdk.m.f0;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.umeng.analytics.pro.am;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import l.C16014;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static b b = new b();
    public f a;

    public static b a(f fVar) {
        b bVar = b;
        bVar.a = fVar;
        return bVar;
    }

    public static boolean a(Context context, String str) {
        return !b(context, str);
    }

    public static boolean b(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static String n(Context context) {
        if (a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype != 4 && subtype != 1 && subtype != 2 && subtype != 7 && subtype != 11) {
                    if (subtype != 3 && subtype != 5 && subtype != 6 && subtype != 8 && subtype != 9 && subtype != 10 && subtype != 12 && subtype != 14 && subtype != 15) {
                        return subtype == 13 ? "4G" : "UNKNOW";
                    }
                    return "3G";
                }
                return "2G";
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public String a() {
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            availableBlocks = 0;
        }
        return C16014.m37865(availableBlocks, "");
    }

    public synchronized String a(Context context) {
        String subscriberId = this.a.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        String strA = d.a("imsi");
        if (strA != null) {
            return strA;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (strA == null) {
            strA = "";
        }
        d.a("imsi", strA);
        return strA;
    }

    public String b() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return C16014.m37865(blockSize, "");
    }

    public String b(Context context) {
        int i = 0;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i == 1 ? "1" : "0";
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public String c() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        String strTrim = "0000000000000000";
        LineNumberReader lineNumberReader = null;
        try {
            fileInputStream = new FileInputStream(new File("/proc/cpuinfo"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    LineNumberReader lineNumberReader2 = new LineNumberReader(inputStreamReader);
                    for (int i = 1; i < 100; i++) {
                        try {
                            String line = lineNumberReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.indexOf("Serial") > -1) {
                                strTrim = line.substring(line.indexOf(":") + 1, line.length()).trim();
                                break;
                            }
                        } catch (Throwable unused) {
                            lineNumberReader = lineNumberReader2;
                            if (lineNumberReader != null) {
                                try {
                                    lineNumberReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            if (fileInputStream != null) {
                            }
                            if (strTrim == null) {
                                return "";
                            }
                            return strTrim;
                        }
                    }
                    try {
                        lineNumberReader2.close();
                    } catch (Throwable unused4) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused5) {
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
                inputStreamReader = null;
            }
        } catch (Throwable unused8) {
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            fileInputStream.close();
        } catch (Throwable unused9) {
        }
        if (strTrim == null) {
            return "";
        }
        return strTrim;
    }

    public String c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", "" + i);
            jSONObject.put("call", "" + streamVolume);
            jSONObject.put("system", "" + streamVolume2);
            jSONObject.put("ring", "" + streamVolume3);
            jSONObject.put("music", "" + streamVolume4);
            jSONObject.put("alarm", "" + streamVolume5);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public String d() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public synchronized String d(Context context) {
        String strA = d.a("NetworkOperatorName");
        if (strA != null) {
            return strA;
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    strA = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        if (strA == null || "null".equals(strA)) {
            strA = "";
        }
        d.a("NetworkOperatorName", strA);
        return strA;
    }

    public String e() {
        String strT = t();
        return !com.alipay.sdk.m.d0.a.a(strT) ? strT : u();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    public String e(Context context) {
        List<Sensor> sensorList;
        String strE;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(am.ac);
                if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0) {
                    strE = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb.append(sensor.getName());
                        sb.append(sensor.getVersion());
                        sb.append(sensor.getVendor());
                    }
                    strE = com.alipay.sdk.m.d0.a.e(sb.toString());
                }
            } catch (Throwable unused) {
            }
        } else {
            strE = null;
        }
        return strE == null ? "" : strE;
    }

    public String f() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        FileReader fileReader = null;
        BufferedReader bufferedReader3 = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader2 = new BufferedReader(fileReader2);
                try {
                    String[] strArrSplit = bufferedReader2.readLine().split(":\\s+", 2);
                    if (strArrSplit != null && strArrSplit.length > 1) {
                        String str = strArrSplit[1];
                        try {
                            fileReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                        return str;
                    }
                    try {
                        fileReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    bufferedReader3 = bufferedReader2;
                    bufferedReader = bufferedReader3;
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (bufferedReader == null) {
                        return "";
                    }
                    bufferedReader2 = bufferedReader;
                }
            } catch (Throwable unused6) {
            }
        } catch (Throwable unused7) {
            bufferedReader = null;
        }
        try {
            bufferedReader2.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    public String f(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(am.ac);
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public String g() {
        BufferedReader bufferedReader;
        long j = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader2, 8192);
                try {
                    String line = bufferedReader.readLine();
                    j = line != null ? Integer.parseInt(line.split("\\s+")[1]) : 0L;
                    try {
                        fileReader2.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    bufferedReader2 = bufferedReader;
                    bufferedReader = bufferedReader2;
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (bufferedReader != null) {
                    }
                    return C16014.m37865(j, "");
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused6) {
        }
        return C16014.m37865(j, "");
    }

    public String g(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String h() {
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            blockCount = 0;
        }
        return C16014.m37865(blockCount, "");
    }

    public String h(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String i() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return C16014.m37865(blockSize, "");
    }

    public String i(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String j() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public synchronized String j(Context context) {
        String strA = d.a("SimSerial");
        if (strA != null) {
            return strA;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        d.a("SimSerial", strA);
        return strA;
    }

    public String k() {
        String string;
        try {
            string = Locale.getDefault().toString();
        } catch (Throwable unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    public synchronized String k(Context context) {
        String androidId = this.a.getAndroidId();
        if (androidId != null) {
            return androidId;
        }
        String strA = d.a("ANDROIDID");
        if (strA != null) {
            return strA;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        try {
            strA = Settings.Secure.getString(context.getContentResolver(), com.umeng.commonsdk.statistics.idtracking.b.a);
        } catch (Throwable unused) {
        }
        if (strA == null) {
            strA = "";
        }
        d.a("ANDROIDID", strA);
        return strA;
    }

    public String l() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = "";
        }
        return displayName == null ? "" : displayName;
    }

    public String l(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String m() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            return "" + (jCurrentTimeMillis - (jCurrentTimeMillis % 1000));
        } catch (Throwable unused) {
            return "";
        }
    }

    public String m(Context context) {
        try {
            String strN = n(context);
            String strO = o(context);
            if (!com.alipay.sdk.m.d0.a.b(strN) || !com.alipay.sdk.m.d0.a.b(strO)) {
                return "";
            }
            return strN + ":" + o(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String n() {
        try {
            return SystemClock.elapsedRealtime() + "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String o() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00:");
            for (int i = 0; i < 7; i++) {
                sb.append(new File(strArr[i]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String o(Context context) {
        String strA = d.a("ip");
        if (strA != null) {
            return strA;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        if (strA == null) {
            strA = "";
        }
        d.a("ip", strA);
        return strA;
    }

    public String p() {
        StringBuilder sb = new StringBuilder("00:");
        try {
            Class.forName(new String[]{"dalvik.system.Taint"}[0]);
            sb.append("1");
        } catch (Throwable unused) {
            sb.append("0");
        }
        return sb.toString();
    }

    public String p(Context context) {
        long jLastModified;
        try {
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            long jMax = 0;
            for (int i = 0; i < 5; i++) {
                try {
                    jLastModified = new File(strArr[i]).lastModified();
                } catch (Throwable unused) {
                    jLastModified = -1;
                }
                jMax = Math.max(jLastModified, jMax);
            }
            return "1:" + jMax;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String q() {
        LineNumberReader lineNumberReader;
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String line = lineNumberReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb.append('0');
                        if (lineNumberReader != null) {
                        }
                    }
                }
                sb.append(c);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    public String q(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(null, intentFilter, 2) : context.registerReceiver(null, intentFilter);
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra(com.alipay.sdk.m.n.c.a, -1);
            boolean z = intExtra2 == 2 || intExtra2 == 5;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "1" : "0");
            sb.append(":");
            sb.append(intExtra);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String r() {
        char c;
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                c = (lowerCase == null || !lowerCase.contains(str3)) ? '0' : '1';
            } catch (Throwable unused) {
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public String s() {
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String strB = com.alipay.sdk.m.d0.a.b(str, "");
            sb.append((strB == null || !strB.contains(str2)) ? '0' : '1');
        }
        return sb.toString();
    }

    public final String t() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                try {
                    String line = bufferedReader2.readLine();
                    if (!com.alipay.sdk.m.d0.a.a(line)) {
                        String strTrim = line.trim();
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            fileReader.close();
                        } catch (Throwable unused2) {
                        }
                        return strTrim;
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                }
            } catch (Throwable unused6) {
            }
        } catch (Throwable unused7) {
            fileReader = null;
        }
        try {
            fileReader.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    public final String u() {
        BufferedReader bufferedReader;
        String[] strArrSplit;
        String strTrim = "";
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2, 8192);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!com.alipay.sdk.m.d0.a.a(line) && (strArrSplit = line.split(":")) != null && strArrSplit.length > 1 && strArrSplit[0].contains("BogoMIPS")) {
                            strTrim = strArrSplit[1].trim();
                            break;
                        }
                    } catch (Throwable unused) {
                        bufferedReader2 = bufferedReader;
                        bufferedReader = bufferedReader2;
                        fileReader = fileReader2;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bufferedReader != null) {
                        }
                        return strTrim;
                    }
                }
                try {
                    fileReader2.close();
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused6) {
        }
        return strTrim;
    }
}
