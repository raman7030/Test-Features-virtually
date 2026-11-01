package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.math.BigDecimal;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۢ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D66F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11774 {
    /* JADX INFO: renamed from: ֫ */
    public static int m27004(char c) {
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
                            case C0254q.f1216f /* 99 */:
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27006(String str, C9091 c9091) {
        int iM27004;
        int iM27005;
        if (!str.startsWith("#") || !m27005(str.substring(1))) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = str.length();
        if (length == 4) {
            c9091.f24648 = 31;
            iM27004 = (m27004(charArray[1]) << 20) | (-16777216) | (m27004(charArray[1]) << 16) | (m27004(charArray[2]) << 12) | (m27004(charArray[2]) << 8) | (m27004(charArray[3]) << 4);
            iM27005 = m27004(charArray[3]);
        } else if (length == 5) {
            c9091.f24648 = 30;
            iM27004 = (m27004(charArray[1]) << 28) | (m27004(charArray[1]) << 24) | (m27004(charArray[2]) << 20) | (m27004(charArray[2]) << 16) | (m27004(charArray[3]) << 12) | (m27004(charArray[3]) << 8) | (m27004(charArray[4]) << 4);
            iM27005 = m27004(charArray[4]);
        } else if (length == 7) {
            c9091.f24648 = 29;
            iM27004 = (m27004(charArray[1]) << 20) | (-16777216) | (m27004(charArray[2]) << 16) | (m27004(charArray[3]) << 12) | (m27004(charArray[4]) << 8) | (m27004(charArray[5]) << 4);
            iM27005 = m27004(charArray[6]);
        } else {
            if (length != 9) {
                return false;
            }
            c9091.f24648 = 28;
            iM27004 = (m27004(charArray[1]) << 28) | (m27004(charArray[2]) << 24) | (m27004(charArray[3]) << 20) | (m27004(charArray[4]) << 16) | (m27004(charArray[5]) << 12) | (m27004(charArray[6]) << 8) | (m27004(charArray[7]) << 4);
            iM27005 = m27004(charArray[8]);
        }
        c9091.f24647 = iM27004 | iM27005;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[PHI: r6
      0x0023: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v10 java.lang.String) binds: [B:9:0x0016, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: NumberFormatException -> 0x0059, TryCatch #0 {NumberFormatException -> 0x0059, blocks: (B:18:0x0030, B:20:0x0036, B:22:0x0046, B:23:0x004b), top: B:30:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[Catch: NumberFormatException -> 0x0059, TryCatch #0 {NumberFormatException -> 0x0059, blocks: (B:18:0x0030, B:20:0x0036, B:22:0x0046, B:23:0x004b), top: B:30:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX INFO: renamed from: ܽ */
    public static boolean m27013(String str, C9091 c9091) {
        char cCharAt;
        int iM27008;
        if (str.length() != 0) {
            boolean z = str.charAt(0) == '-';
            if (z) {
                str = str.substring(1);
                if (str.length() != 0) {
                    cCharAt = str.charAt(0);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                        try {
                            if (m27009(str)) {
                                iM27008 = m27008(str.substring(2));
                                c9091.f24648 = 17;
                            } else {
                                if (z) {
                                    str = "-".concat(str);
                                    z = false;
                                }
                                iM27008 = Integer.parseInt(str);
                                c9091.f24648 = 16;
                            }
                            if (z) {
                                iM27008 = -iM27008;
                            }
                            c9091.f24647 = iM27008;
                            return true;
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                cCharAt = str.charAt(0);
                if (cCharAt >= '0') {
                    if (m27009(str)) {
                        iM27008 = m27008(str.substring(2));
                        c9091.f24648 = 17;
                    } else {
                        if (z) {
                            str = "-".concat(str);
                            z = false;
                        }
                        iM27008 = Integer.parseInt(str);
                        c9091.f24648 = 16;
                    }
                    if (z) {
                        iM27008 = -iM27008;
                    }
                    c9091.f24647 = iM27008;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX INFO: renamed from: ۧ */
    public static boolean m27010(String str, C9091 c9091) {
        int i;
        char c = 0;
        if (str.length() != 0) {
            for (EnumC22503 enumC22503 : EnumC22503.values()) {
                try {
                    if (str.endsWith(enumC22503.f70965)) {
                        String strSubstring = str.substring(0, str.length() - enumC22503.f70964);
                        c9091.f24646 = strSubstring;
                        c9091.f24648 = enumC22503.f70962;
                        c9091.f24647 = enumC22503.f70961;
                        c9091.f24645 = enumC22503.f70963;
                        if (strSubstring.length() == 0) {
                            break;
                        }
                        try {
                            Float.parseFloat(strSubstring);
                            float f = Float.parseFloat(c9091.f24646) * c9091.f24645;
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
                            c9091.f24647 = (i << 4) | (i2 << 8) | c9091.f24647;
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
                c9091.f24647 = Float.floatToRawIntBits(Float.parseFloat(str));
                c9091.f24648 = 4;
                c9091.f24645 = 1.0f;
                c9091.f24646 = str;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public static int m27008(String str) {
        int iM27004 = 0;
        for (char c : str.toCharArray()) {
            iM27004 = (iM27004 << 4) | m27004(c);
        }
        return iM27004;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m27015(String str) {
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

    /* JADX INFO: renamed from: ۧ */
    public static boolean m27009(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27005(String str) {
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

    /* JADX INFO: renamed from: ܿ */
    public static boolean m27014(String str) {
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

    /* JADX INFO: renamed from: ܳ */
    public static boolean m27011(String str) {
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

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m27017(String str) {
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

    /* JADX INFO: renamed from: ܽ */
    public static boolean m27012(String str) {
        return (str.length() == 3 || str.length() == 4 || str.length() == 6 || str.length() == 8) && m27005(str);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static int m27016(String str) {
        int iM27004;
        int iM27005;
        char[] charArray = str.toCharArray();
        int length = str.length();
        if (length == 3) {
            iM27004 = (m27004(charArray[0]) << 20) | (-16777216) | (m27004(charArray[0]) << 16) | (m27004(charArray[1]) << 12) | (m27004(charArray[1]) << 8) | (m27004(charArray[2]) << 4);
            iM27005 = m27004(charArray[2]);
        } else if (length == 4) {
            iM27004 = (m27004(charArray[0]) << 28) | (m27004(charArray[0]) << 24) | (m27004(charArray[1]) << 20) | (m27004(charArray[1]) << 16) | (m27004(charArray[2]) << 12) | (m27004(charArray[2]) << 8) | (m27004(charArray[3]) << 4);
            iM27005 = m27004(charArray[3]);
        } else if (length == 6) {
            iM27004 = (m27004(charArray[0]) << 20) | (-16777216) | (m27004(charArray[1]) << 16) | (m27004(charArray[2]) << 12) | (m27004(charArray[3]) << 8) | (m27004(charArray[4]) << 4);
            iM27005 = m27004(charArray[5]);
        } else if (length == 8) {
            iM27004 = (m27004(charArray[0]) << 28) | (m27004(charArray[1]) << 24) | (m27004(charArray[2]) << 20) | (m27004(charArray[3]) << 16) | (m27004(charArray[4]) << 12) | (m27004(charArray[5]) << 8) | (m27004(charArray[6]) << 4);
            iM27005 = m27004(charArray[7]);
        } else {
            throw new RuntimeException("Hex color format error: " + ((Object) charArray));
        }
        return iM27004 | iM27005;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m27007(C9091 c9091) {
        String str = c9091.f24646;
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
