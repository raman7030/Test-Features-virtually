package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۘۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7AP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5918 {

    /* JADX INFO: renamed from: ֫ */
    public static String f14608;

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 f14609;

    /* JADX INFO: renamed from: ܽ */
    public static int f14610;

    static {
        m13303();
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m13301() {
        return f14609;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m13302() {
        return f14610;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m13298() {
        return f14608;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m13303() {
        String string = ApplicationC21448.f67649.getString("rwmip", null);
        if (TextUtils.isEmpty(string)) {
            f14609 = C17853.f53287;
        } else {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(string, new String[0]);
            if (!abstractC17043M42109.mo25087()) {
                abstractC17043M42109 = C17853.f53287;
            }
            f14609 = abstractC17043M42109;
        }
        int i = ApplicationC21448.f67649.getInt("rwmp", 8081);
        f14610 = C22622.m50682(i) ? i : 8081;
        String string2 = ApplicationC21448.f67649.getString("rwmpc", "");
        String strTrim = string2 == null ? "" : string2.trim();
        f14608 = m13300(strTrim) ? strTrim : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13299(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            f14609 = C17853.f53287;
        } else {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            if (!abstractC17043M42109.mo25087()) {
                abstractC17043M42109 = C17853.f53287;
            }
            f14609 = abstractC17043M42109;
        }
        Integer numM50681 = C22622.m50681(str2);
        if (numM50681 != null) {
            f14610 = numM50681.intValue();
        }
        String strTrim = str3 == null ? "" : str3.trim();
        if (m13300(strTrim)) {
            f14608 = strTrim;
        }
        ApplicationC21448.f67649.edit().putString("rwmip", f14609.mo25505()).mo27875(f14610, "rwmp").putString("rwmpc", f14608).apply();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13300(String str) {
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
