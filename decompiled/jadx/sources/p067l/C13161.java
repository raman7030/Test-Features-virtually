package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46JS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13161 {
    /* JADX INFO: renamed from: ۧ */
    public static void m30150(String str) {
        if (!str.isEmpty() && !m30149(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        ApplicationC21448.f67649.edit().putString("ais", str).apply();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30149(String str) {
        if (!str.isEmpty() && str.length() < 255) {
            boolean z = true;
            boolean z2 = false;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '.') {
                    if (z) {
                        return false;
                    }
                    z = true;
                    z2 = true;
                } else {
                    if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (z || (cCharAt != '_' && (cCharAt < '0' || cCharAt > '9'))))) {
                        return false;
                    }
                    z = false;
                }
            }
            if (!z && (z2 || str.equals("android"))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m30151(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (!m30149(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        return "-i " + C11164.m25756(str) + " ";
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30148(InterfaceC11953 interfaceC11953, String str, String str2) throws C3924 {
        if (str2.isEmpty()) {
            return;
        }
        StringBuilder sbM11879 = C5410.m11879("pm list packages --user ", str, " ");
        sbM11879.append(C11164.m25756(str2));
        C13964 c13964Mo27363 = interfaceC11953.mo27363(sbM11879.toString(), true);
        if (c13964Mo27363.m31745()) {
            throw new C3924(c13964Mo27363.f39429);
        }
        for (String str3 : c13964Mo27363.f39430) {
            if (str3.trim().equals("package:".concat(str2))) {
                return;
            }
        }
        throw new C3924(C7050.m16203(R.string.MT_Protector, str2));
    }
}
