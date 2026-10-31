package l;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.ManufacturerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: l.ۗᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 253O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3424 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f10802 = Build.MANUFACTURER.toLowerCase();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static double m10397() throws Throwable {
        try {
            String strM10395 = m10395("ro.build.version.emui");
            return Double.parseDouble(strM10395.substring(strM10395.indexOf("_") + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10395(String str) throws Throwable {
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m10402() {
        return !TextUtils.isEmpty(m10395("ro.miui.ui.version.name"));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m10400() throws Throwable {
        String strM10395 = m10395("ro.build.display.id");
        if (TextUtils.isEmpty(strM10395)) {
            return false;
        }
        return strM10395.contains("flyme") || strM10395.toLowerCase().contains("flyme");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10398() {
        return f10802.contains("huawei");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10396() {
        String str = f10802;
        return str.contains("qiku") || str.contains("360");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m10401() {
        return f10802.contains("oppo");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m10403() {
        return f10802.contains("vivo");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m10399() {
        return f10802.contains(ManufacturerUtils.SAMSUNG);
    }
}
