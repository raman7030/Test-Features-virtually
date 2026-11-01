package p067l;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAH8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17452 {

    /* JADX INFO: renamed from: ֫ */
    public static Exception f52186;

    /* JADX INFO: renamed from: ۧ */
    public static Boolean f52187;

    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m39788() {
        String[] list;
        Boolean bool = f52187;
        if (bool == null) {
            Locale locale = Locale.getDefault();
            boolean z = locale.getLanguage().equals("zh") && locale.getCountry().equals("CN");
            boolean z2 = Build.MANUFACTURER.equalsIgnoreCase("rockchip") && Build.MODEL.toLowerCase().contains("sandbox");
            String lowerCase = Build.FINGERPRINT.toLowerCase();
            boolean z3 = lowerCase.contains("springer") || lowerCase.contains("rockchip");
            if ((z && (z2 || z3)) || Log.getStackTraceString(f52186).contains("SimidaGuarder")) {
                bool = Boolean.TRUE;
            } else if (!Build.DEVICE.equals("OnePlus6") || (list = new File("/system/app").list()) == null) {
                bool = Boolean.FALSE;
            } else {
                int i = 0;
                for (String str : list) {
                    str.getClass();
                    switch (str) {
                        case "alipay":
                        case "weixin":
                        case "qq":
                        case "AdbIME":
                            i++;
                            break;
                    }
                }
                if (i == 4) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
            }
            f52187 = bool;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39789() {
        f52186 = new Exception();
    }
}
