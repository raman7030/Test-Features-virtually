package l;

import com.alipay.sdk.m.y.q;
import java.math.BigDecimal;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۢ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D66F */
/* JADX INFO: loaded from: classes3.dex */
public final class C9896 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24989(char c) {
        switch (c) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return 6;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case q.f /* 99 */:
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                return 15;
                            default:
                                return 0;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24991(String str, C7073 c7073) {
        int iM24989;
        int iM249810;
        if (!str.startsWith("#") || !m24990(str.substring(1))) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = str.length();
        if (length == 4) {
            c7073.f21767 = 31;
            iM24989 = (m24989(charArray[1]) << 20) | (-16777216) | (m24989(charArray[1]) << 16) | (m24989(charArray[2]) << 12) | (m24989(charArray[2]) << 8) | (m24989(charArray[3]) << 4);
            iM249810 = m24989(charArray[3]);
        } else if (length == 5) {
            c7073.f21767 = 30;
            iM24989 = (m24989(charArray[1]) << 28) | (m24989(charArray[1]) << 24) | (m24989(charArray[2]) << 20) | (m24989(charArray[2]) << 16) | (m24989(charArray[3]) << 12) | (m24989(charArray[3]) << 8) | (m24989(charArray[4]) << 4);
            iM249810 = m24989(charArray[4]);
        } else if (length == 7) {
            c7073.f21767 = 29;
            iM24989 = (m24989(charArray[1]) << 20) | (-16777216) | (m24989(charArray[2]) << 16) | (m24989(charArray[3]) << 12) | (m24989(charArray[4]) << 8) | (m24989(charArray[5]) << 4);
            iM249810 = m24989(charArray[6]);
        } else {
            if (length != 9) {
                return false;
            }
            c7073.f21767 = 28;
            iM24989 = (m24989(charArray[1]) << 28) | (m24989(charArray[2]) << 24) | (m24989(charArray[3]) << 20) | (m24989(charArray[4]) << 16) | (m24989(charArray[5]) << 12) | (m24989(charArray[6]) << 8) | (m24989(charArray[7]) << 4);
            iM249810 = m24989(charArray[8]);
        }
        c7073.f21766 = iM24989 | iM249810;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[PHI: r6
      0x0023: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v10 java.lang.String) binds: [B:9:0x0016, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: NumberFormatException -> 0x0059, TryCatch #0 {NumberFormatException -> 0x0059, blocks: (B:18:0x0030, B:20:0x0036, B:22:0x0046, B:23:0x004b), top: B:30:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[Catch: NumberFormatException -> 0x0059, TryCatch #0 {NumberFormatException -> 0x0059, blocks: (B:18:0x0030, B:20:0x0036, B:22:0x0046, B:23:0x004b), top: B:30:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m24998(String str, C7073 c7073) {
        char cCharAt;
        int iM24993;
        if (str.length() != 0) {
            boolean z = str.charAt(0) == '-';
            if (z) {
                str = str.substring(1);
                if (str.length() != 0) {
                    cCharAt = str.charAt(0);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                        try {
                            if (m24994(str)) {
                                iM24993 = m24993(str.substring(2));
                                c7073.f21767 = 17;
                            } else {
                                if (z) {
                                    str = "-".concat(str);
                                    z = false;
                                }
                                iM24993 = Integer.parseInt(str);
                                c7073.f21767 = 16;
                            }
                            if (z) {
                                iM24993 = -iM24993;
                            }
                            c7073.f21766 = iM24993;
                            return true;
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                cCharAt = str.charAt(0);
                if (cCharAt >= '0') {
                    if (m24994(str)) {
                        iM24993 = m24993(str.substring(2));
                        c7073.f21767 = 17;
                    } else {
                        if (z) {
                            str = "-".concat(str);
                            z = false;
                        }
                        iM24993 = Integer.parseInt(str);
                        c7073.f21767 = 16;
                    }
                    if (z) {
                        iM24993 = -iM24993;
                    }
                    c7073.f21766 = iM24993;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24995(String str, C7073 c7073) {
        int i;
        char c = 0;
        if (str.length() != 0) {
            for (EnumC21185 enumC21185 : EnumC21185.values()) {
                try {
                    if (str.endsWith(enumC21185.f68283)) {
                        String strSubstring = str.substring(0, str.length() - enumC21185.f68282);
                        c7073.f21765 = strSubstring;
                        c7073.f21767 = enumC21185.f68280;
                        c7073.f21766 = enumC21185.f68279;
                        c7073.f21764 = enumC21185.f68281;
                        if (strSubstring.length() == 0) {
                            break;
                        }
                        try {
                            Float.parseFloat(strSubstring);
                            float f = Float.parseFloat(c7073.f21765) * c7073.f21764;
                            boolean z = f < 0.0f;
                            if (z) {
                                f = -f;
                            }
                            long j = (long) ((f * 8388608.0f) + 0.5f);
                            if ((8388607 & j) == 0) {
                                c = 23;
                                i = 0;
                            } else if (((-8388608) & j) == 0) {
                                i = 3;
                            } else if (((-2147483648L) & j) == 0) {
                                c = '\b';
                                i = 2;
                            } else if (((-549755813888L) & j) == 0) {
                                c = 16;
                                i = 1;
                            } else {
                                c = 23;
                                i = 0;
                            }
                            int i2 = (int) ((j >> c) & 16777215);
                            if (z) {
                                i2 = (-i2) & 16777215;
                            }
                            c7073.f21766 = (i << 4) | (i2 << 8) | c7073.f21766;
                            return true;
                        } catch (NumberFormatException unused) {
                            break;
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            if (str.length() != 0) {
                Float.parseFloat(str);
                c7073.f21766 = Float.floatToRawIntBits(Float.parseFloat(str));
                c7073.f21767 = 4;
                c7073.f21764 = 1.0f;
                c7073.f21765 = str;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m24993(String str) {
        int iM24989 = 0;
        for (char c : str.toCharArray()) {
            iM24989 = (iM24989 << 4) | m24989(c);
        }
        return iM24989;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m25000(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && !(i == 0 && cCharAt == '-')) {
                return false;
            }
        }
        if (str.length() < 10) {
            return true;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24994(String str) {
        if (str.length() < 3 || str.length() > 10) {
            return false;
        }
        if (!str.startsWith("0x") && !str.startsWith("0X")) {
            return false;
        }
        for (int i = 2; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && cCharAt < 'a')) || cCharAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24990(String str) {
        if (str.length() < 1 || str.length() > 8) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && cCharAt < 'a')) || cCharAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m24999(String str) {
        if (str.length() < 1 || str.length() > 16) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && cCharAt < 'a')) || cCharAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m24996(String str) {
        String strReplace = str.replace(" ", "").replace("_", "");
        if (strReplace.startsWith("-")) {
            strReplace = strReplace.substring(1);
        }
        if (strReplace.length() != 0) {
            for (int i = 0; i < strReplace.length(); i++) {
                char cCharAt = strReplace.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m25002(String str) {
        String strReplace = str.replace(" ", "").replace("_", "");
        if (strReplace.length() == 0) {
            return false;
        }
        for (int i = 0; i < strReplace.length(); i++) {
            char cCharAt = strReplace.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && (cCharAt < 'a' || cCharAt > 'f'))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m24997(String str) {
        return (str.length() == 3 || str.length() == 4 || str.length() == 6 || str.length() == 8) && m24990(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m25001(String str) {
        int iM24989;
        int iM249810;
        char[] charArray = str.toCharArray();
        int length = str.length();
        if (length == 3) {
            iM24989 = (m24989(charArray[0]) << 20) | (-16777216) | (m24989(charArray[0]) << 16) | (m24989(charArray[1]) << 12) | (m24989(charArray[1]) << 8) | (m24989(charArray[2]) << 4);
            iM249810 = m24989(charArray[2]);
        } else if (length == 4) {
            iM24989 = (m24989(charArray[0]) << 28) | (m24989(charArray[0]) << 24) | (m24989(charArray[1]) << 20) | (m24989(charArray[1]) << 16) | (m24989(charArray[2]) << 12) | (m24989(charArray[2]) << 8) | (m24989(charArray[3]) << 4);
            iM249810 = m24989(charArray[3]);
        } else if (length == 6) {
            iM24989 = (m24989(charArray[0]) << 20) | (-16777216) | (m24989(charArray[1]) << 16) | (m24989(charArray[2]) << 12) | (m24989(charArray[3]) << 8) | (m24989(charArray[4]) << 4);
            iM249810 = m24989(charArray[5]);
        } else if (length == 8) {
            iM24989 = (m24989(charArray[0]) << 28) | (m24989(charArray[1]) << 24) | (m24989(charArray[2]) << 20) | (m24989(charArray[3]) << 16) | (m24989(charArray[4]) << 12) | (m24989(charArray[5]) << 8) | (m24989(charArray[6]) << 4);
            iM249810 = m24989(charArray[7]);
        } else {
            throw new RuntimeException("Hex color format error: " + ((Object) charArray));
        }
        return iM24989 | iM249810;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24992(C7073 c7073) {
        String str = c7073.f21765;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            return new BigDecimal(str).precision() <= 7;
        } catch (Exception unused) {
            return false;
        }
    }
}
