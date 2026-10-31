package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۘۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3735 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f11801;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 f11802;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f11803;

    static {
        m11351();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m11349() {
        return f11802;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m11350() {
        return f11803;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11346() {
        return f11801;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m11351() {
        String string = ApplicationC20075.f65008.getString("rwmip", null);
        if (TextUtils.isEmpty(string)) {
            f11802 = C16293.f50120;
        } else {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(string, new String[0]);
            if (!abstractC15440M39866.mo23113()) {
                abstractC15440M39866 = C16293.f50120;
            }
            f11802 = abstractC15440M39866;
        }
        int i = ApplicationC20075.f65008.getInt("rwmp", 8081);
        f11803 = C21311.m48347(i) ? i : 8081;
        String string2 = ApplicationC20075.f65008.getString("rwmpc", "");
        String strTrim = string2 == null ? "" : string2.trim();
        f11801 = m11348(strTrim) ? strTrim : "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11347(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            f11802 = C16293.f50120;
        } else {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
            if (!abstractC15440M39866.mo23113()) {
                abstractC15440M39866 = C16293.f50120;
            }
            f11802 = abstractC15440M39866;
        }
        Integer numM48346 = C21311.m48346(str2);
        if (numM48346 != null) {
            f11803 = numM48346.intValue();
        }
        String strTrim = str3 == null ? "" : str3.trim();
        if (m11348(strTrim)) {
            f11801 = strTrim;
        }
        ApplicationC20075.f65008.edit().putString("rwmip", f11802.mo23554()).mo25853(f11803, "rwmp").putString("rwmpc", f11801).apply();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11348(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return true;
        }
        if (strTrim.length() == 6) {
            for (int i = 0; i < strTrim.length(); i++) {
                char cCharAt = strTrim.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                }
            }
            return true;
        }
        return false;
    }
}
