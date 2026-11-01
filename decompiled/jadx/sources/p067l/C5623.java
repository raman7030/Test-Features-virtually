package p067l;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.ManufacturerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.ۗᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 253O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5623 {

    /* JADX INFO: renamed from: ֫ */
    public static final String f13607 = Build.MANUFACTURER.toLowerCase();

    /* JADX INFO: renamed from: ۜ */
    public static double m12436() throws Throwable {
        try {
            String strM12434 = m12434("ro.build.version.emui");
            return Double.parseDouble(strM12434.substring(strM12434.indexOf("_") + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12434(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return line;
            } catch (IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m12441() {
        return !TextUtils.isEmpty(m12434("ro.miui.ui.version.name"));
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m12439() throws Throwable {
        String strM12434 = m12434("ro.build.display.id");
        if (TextUtils.isEmpty(strM12434)) {
            return false;
        }
        return strM12434.contains("flyme") || strM12434.toLowerCase().contains("flyme");
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m12437() {
        return f13607.contains("huawei");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12435() {
        String str = f13607;
        return str.contains("qiku") || str.contains("360");
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m12440() {
        return f13607.contains("oppo");
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m12442() {
        return f13607.contains("vivo");
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m12438() {
        return f13607.contains(ManufacturerUtils.SAMSUNG);
    }
}
