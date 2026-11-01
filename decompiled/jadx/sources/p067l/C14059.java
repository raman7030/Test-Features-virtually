package p067l;

import bin.p000mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.۫ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6YG */
/* JADX INFO: loaded from: classes3.dex */
public final class C14059 {
    /* JADX INFO: renamed from: ֫ */
    public static String m31903(C9385 c9385, String str, String str2, boolean z) throws C5276 {
        if (str == null || str.isEmpty()) {
            if (!z || str == null) {
                throw m31904("FILE_EMPTY_PATH_NOT_ALLOWED", "Path must not be empty.", str2, str);
            }
            return c9385.f25638;
        }
        m31908(str, str2);
        boolean z2 = str.charAt(0) == '/';
        try {
            String strM31907 = m31907(z2 ? str : C24420.m53894(new StringBuilder(), c9385.f25638, "/", str), str2);
            if (z2 || m31906(strM31907, c9385.f25638)) {
                return strM31907;
            }
            throw m31904("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        } catch (C5276 e) {
            if (z2 || !"FILE_INVALID_PATH".equals(e.f12413)) {
                throw e;
            }
            throw m31904("FILE_RELATIVE_PATH_ESCAPES_HOME", "Relative path resolves outside the current Home folder.", str2, str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m31907(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                m31908(str, str2);
                ArrayDeque<String> arrayDeque = new ArrayDeque();
                for (String str3 : str.split("/", -1)) {
                    if (!str3.isEmpty() && !".".equals(str3)) {
                        if ("..".equals(str3)) {
                            if (arrayDeque.isEmpty()) {
                                throw m31904("FILE_INVALID_PATH", "Path escapes the filesystem root.", str2, str);
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
                return C18524.m42128(sb.length() != 0 ? sb.toString() : "/");
            }
        }
        throw m31904("FILE_PATH_NOT_ABSOLUTE", "Path must be absolute.", str2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31906(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if ("/".equals(str2)) {
            return str.startsWith("/");
        }
        return str.startsWith(str2 + "/");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31905(String str) {
        String strM42102 = C18524.m42102(str);
        if (strM42102 == null) {
            return false;
        }
        return strM42102.equalsIgnoreCase("Android/data") || strM42102.regionMatches(true, 0, "Android/data/", 0, 13);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m31908(String str, String str2) throws C5276 {
        if (str.indexOf(0) >= 0 || str.indexOf(92) >= 0) {
            throw m31904("FILE_INVALID_PATH", "Path contains an unsupported form.", str2, str);
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
        throw m31904("FILE_URI_UNSUPPORTED", "URI paths are not supported.", str2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m31904(String str, String str2, String str3, String str4) {
        return C5276.m11411(str, str2, "fatal", null, JSON.object().add("argument", str3).add(MotionUtils.EASING_TYPE_PATH, str4 == null ? JSON.NULL : JSON.value(str4)));
    }
}
