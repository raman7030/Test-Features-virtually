package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.۫ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6YG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12301 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29843(C7383 c7383, String str, String str2, boolean z) throws C3059 {
        if (str == null || str.isEmpty()) {
            if (!z || str == null) {
                throw m29844("FILE_EMPTY_PATH_NOT_ALLOWED", "Path must not be empty.", str2, str);
            }
            return c7383.f22726;
        }
        m29848(str, str2);
        boolean z2 = str.charAt(0) == '/';
        try {
            String strM29847 = m29847(z2 ? str : C23202.m51498(new StringBuilder(), c7383.f22726, "/", str), str2);
            if (z2 || m29846(strM29847, c7383.f22726)) {
                return strM29847;
            }
            throw m29844("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        } catch (C3059 e) {
            if (z2 || !"FILE_INVALID_PATH".equals(e.f9610)) {
                throw e;
            }
            throw m29844("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m29847(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                m29848(str, str2);
                ArrayDeque<String> arrayDeque = new ArrayDeque();
                for (String str3 : str.split("/", -1)) {
                    if (!str3.isEmpty() && !".".equals(str3)) {
                        if ("..".equals(str3)) {
                            if (arrayDeque.isEmpty()) {
                                throw m29844("FILE_INVALID_PATH", "Path escapes the filesystem root.", str2, str);
                            }
                            arrayDeque.removeLast();
                        } else {
                            arrayDeque.addLast(str3);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (String str4 : arrayDeque) {
                    sb.append('/');
                    sb.append(str4);
                }
                return C16999.m39885(sb.length() != 0 ? sb.toString() : "/");
            }
        }
        throw m29844("FILE_PATH_NOT_ABSOLUTE", "Path must be absolute.", str2, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29846(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if ("/".equals(str2)) {
            return str.startsWith("/");
        }
        return str.startsWith(str2 + "/");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29845(String str) {
        String strM39859 = C16999.m39859(str);
        if (strM39859 == null) {
            return false;
        }
        return strM39859.equalsIgnoreCase("Android/data") || strM39859.regionMatches(true, 0, "Android/data/", 0, 13);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m29848(String str, String str2) throws C3059 {
        if (str.indexOf(0) >= 0 || str.indexOf(92) >= 0) {
            throw m29844("FILE_INVALID_PATH", "Path contains an unsupported form.", str2, str);
        }
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0) {
            return;
        }
        for (int i = 0; i < iIndexOf; i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    return;
                }
            } else if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '+' && cCharAt != '-' && cCharAt != '.'))) {
                return;
            }
        }
        throw m29844("FILE_URI_UNSUPPORTED", "URI paths are not supported.", str2, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m29844(String str, String str2, String str3, String str4) {
        return C3059.m9369(str, str2, "fatal", null, JSON.object().add("argument", str3).add(MotionUtils.EASING_TYPE_PATH, str4 == null ? JSON.NULL : JSON.value(str4)));
    }
}
