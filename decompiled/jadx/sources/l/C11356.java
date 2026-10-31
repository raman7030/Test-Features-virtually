package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46JS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11356 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m28106(String str) {
        if (!str.isEmpty() && !m28105(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        ApplicationC20075.f65008.edit().putString("ais", str).apply();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28105(String str) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m28107(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (!m28105(str)) {
            throw new IllegalArgumentException("Invalid installer package name");
        }
        return "-i " + C9255.m23755(str) + " ";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28104(InterfaceC10085 interfaceC10085, String str, String str2) throws C1637 {
        if (str2.isEmpty()) {
            return;
        }
        StringBuilder sbM9834 = C3200.m9834("pm list packages --user ", str, " ");
        sbM9834.append(C9255.m23755(str2));
        C12201 c12201Mo25344 = interfaceC10085.mo25344(sbM9834.toString(), true);
        if (c12201Mo25344.m29683()) {
            throw new C1637(c12201Mo25344.f36414);
        }
        for (String str3 : c12201Mo25344.f36415) {
            if (str3.trim().equals("package:".concat(str2))) {
                return;
            }
        }
        throw new C1637(C4925.m14306(R.string.MT_Protector, str2));
    }
}
