package com.alipay.sdk.p010m.p022f0;

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
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.statistics.idtracking.C0803b;
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
import org.json.JSONArray;
import org.json.JSONObject;
import p067l.C17588;

/* JADX INFO: renamed from: com.alipay.sdk.m.f0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0114b {

    /* JADX INFO: renamed from: b */
    public static C0114b f460b = new C0114b();

    /* JADX INFO: renamed from: a */
    public InterfaceC0118f f461a;

    /* JADX INFO: renamed from: a */
    public static C0114b m597a(InterfaceC0118f interfaceC0118f) {
        C0114b c0114b = f460b;
        c0114b.f461a = interfaceC0118f;
        return c0114b;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m598a(Context context, String str) {
        return !m599b(context, str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m599b(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: n */
    public static String m600n(Context context) {
        if (m598a(context, "android.permission.ACCESS_NETWORK_STATE")) {
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

    /* JADX INFO: renamed from: a */
    public String m601a() {
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            availableBlocks = 0;
        }
        return C17588.m40051(availableBlocks, "");
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m602a(Context context) {
        String subscriberId = this.f461a.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        String strM638a = C0116d.m638a("imsi");
        if (strM638a != null) {
            return strM638a;
        }
        if (this.f461a.isBackgroundRunning()) {
            return "";
        }
        if (m598a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (strM638a == null) {
            strM638a = "";
        }
        C0116d.m639a("imsi", strM638a);
        return strM638a;
    }

    /* JADX INFO: renamed from: b */
    public String m603b() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return C17588.m40051(blockSize, "");
    }

    /* JADX INFO: renamed from: b */
    public String m604b(Context context) {
        int i = 0;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i == 1 ? "1" : "0";
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public String m605c() {
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

    /* JADX INFO: renamed from: c */
    public String m606c(Context context) {
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

    /* JADX INFO: renamed from: d */
    public String m607d() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new C0115c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m608d(Context context) {
        String strM638a = C0116d.m638a("NetworkOperatorName");
        if (strM638a != null) {
            return strM638a;
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    strM638a = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        if (strM638a == null || "null".equals(strM638a)) {
            strM638a = "";
        }
        C0116d.m639a("NetworkOperatorName", strM638a);
        return strM638a;
    }

    /* JADX INFO: renamed from: e */
    public String m609e() {
        String strM636t = m636t();
        return !C0106a.m564a(strM636t) ? strM636t : m637u();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX INFO: renamed from: e */
    public String m610e(Context context) {
        List<Sensor> sensorList;
        String strM570e;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(C0655am.f2301ac);
                if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0) {
                    strM570e = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb.append(sensor.getName());
                        sb.append(sensor.getVersion());
                        sb.append(sensor.getVendor());
                    }
                    strM570e = C0106a.m570e(sb.toString());
                }
            } catch (Throwable unused) {
            }
        } else {
            strM570e = null;
        }
        return strM570e == null ? "" : strM570e;
    }

    /* JADX INFO: renamed from: f */
    public String m611f() {
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

    /* JADX INFO: renamed from: f */
    public String m612f(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(C0655am.f2301ac);
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

    /* JADX INFO: renamed from: g */
    public String m613g() {
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
                    return C17588.m40051(j, "");
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
        return C17588.m40051(j, "");
    }

    /* JADX INFO: renamed from: g */
    public String m614g(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public String m615h() {
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            blockCount = 0;
        }
        return C17588.m40051(blockCount, "");
    }

    /* JADX INFO: renamed from: h */
    public String m616h(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public String m617i() {
        long blockSize;
        try {
            StatFs statFs = new StatFs("/sdcard");
            blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
        } catch (Throwable unused) {
            blockSize = 0;
        }
        return C17588.m40051(blockSize, "");
    }

    /* JADX INFO: renamed from: i */
    public String m618i(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public String m619j() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: j */
    public synchronized String m620j(Context context) {
        String strM638a = C0116d.m638a("SimSerial");
        if (strM638a != null) {
            return strM638a;
        }
        if (this.f461a.isBackgroundRunning()) {
            return "";
        }
        if (m598a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        C0116d.m639a("SimSerial", strM638a);
        return strM638a;
    }

    /* JADX INFO: renamed from: k */
    public String m621k() {
        String string;
        try {
            string = Locale.getDefault().toString();
        } catch (Throwable unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: k */
    public synchronized String m622k(Context context) {
        String androidId = this.f461a.getAndroidId();
        if (androidId != null) {
            return androidId;
        }
        String strM638a = C0116d.m638a("ANDROIDID");
        if (strM638a != null) {
            return strM638a;
        }
        if (this.f461a.isBackgroundRunning()) {
            return "";
        }
        try {
            strM638a = Settings.Secure.getString(context.getContentResolver(), C0803b.f3412a);
        } catch (Throwable unused) {
        }
        if (strM638a == null) {
            strM638a = "";
        }
        C0116d.m639a("ANDROIDID", strM638a);
        return strM638a;
    }

    /* JADX INFO: renamed from: l */
    public String m623l() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = "";
        }
        return displayName == null ? "" : displayName;
    }

    /* JADX INFO: renamed from: l */
    public String m624l(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public String m625m() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            return "" + (jCurrentTimeMillis - (jCurrentTimeMillis % 1000));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public String m626m(Context context) {
        try {
            String strM600n = m600n(context);
            String strM629o = m629o(context);
            if (!C0106a.m567b(strM600n) || !C0106a.m567b(strM629o)) {
                return "";
            }
            return strM600n + ":" + m629o(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public String m627n() {
        try {
            return SystemClock.elapsedRealtime() + "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: o */
    public String m628o() {
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

    /* JADX INFO: renamed from: o */
    public String m629o(Context context) {
        String strM638a = C0116d.m638a("ip");
        if (strM638a != null) {
            return strM638a;
        }
        if (this.f461a.isBackgroundRunning()) {
            return "";
        }
        if (strM638a == null) {
            strM638a = "";
        }
        C0116d.m639a("ip", strM638a);
        return strM638a;
    }

    /* JADX INFO: renamed from: p */
    public String m630p() {
        StringBuilder sb = new StringBuilder("00:");
        try {
            Class.forName(new String[]{"dalvik.system.Taint"}[0]);
            sb.append("1");
        } catch (Throwable unused) {
            sb.append("0");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public String m631p(Context context) {
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

    /* JADX INFO: renamed from: q */
    public String m632q() {
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

    /* JADX INFO: renamed from: q */
    public String m633q(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(null, intentFilter, 2) : context.registerReceiver(null, intentFilter);
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra(C0172c.f705a, -1);
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

    /* JADX INFO: renamed from: r */
    public String m634r() {
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

    /* JADX INFO: renamed from: s */
    public String m635s() {
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
            String strM566b = C0106a.m566b(str, "");
            sb.append((strM566b == null || !strM566b.contains(str2)) ? '0' : '1');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public final String m636t() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                try {
                    String line = bufferedReader2.readLine();
                    if (!C0106a.m564a(line)) {
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

    /* JADX INFO: renamed from: u */
    public final String m637u() {
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
                        if (!C0106a.m564a(line) && (strArrSplit = line.split(":")) != null && strArrSplit.length > 1 && strArrSplit[0].contains("BogoMIPS")) {
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
