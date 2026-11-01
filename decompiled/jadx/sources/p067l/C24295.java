package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.badge.BadgeDrawable;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import org.bouncycastle.crypto.params.DHParameters;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩺ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1TZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24295 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f76958;

    static {
        HashMap map = new HashMap();
        f76958 = map;
        C14110.m32032(536870934, map, "%i", 536871034, "#2");
        C14110.m32032(536870933, map, "#4", 536871035, "*7");
        C14110.m32032(131, map, "k1", 132, "k2");
        C14110.m32032(133, map, "k3", 134, "k4");
        C14110.m32032(135, map, "k5", 136, "k6");
        C14110.m32032(137, map, "k7", 138, "k8");
        C14110.m32032(139, map, "k9", 140, "k;");
        C14110.m32032(141, map, "F1", 142, "F2");
        C14110.m32032(536871043, map, "F3", 536871044, "F4");
        C14110.m32032(536871045, map, "F5", 536871046, "F6");
        C14110.m32032(536871047, map, "F7", 536871048, "F8");
        C14110.m32032(536871049, map, "F9", 536871050, "FA");
        C14110.m32032(536871051, map, "FB", 536871052, "FC");
        C14110.m32032(536871053, map, "FD", 536871054, "FE");
        C14110.m32032(67, map, "kb", 20, "kd");
        C17520.m39895(map, "kh", 122, 21, "kl");
        map.put("kr", 22);
        map.put("K1", 122);
        map.put("K3", 92);
        map.put("K4", 123);
        C17520.m39895(map, "K5", 93, 19, "ku");
        C14110.m32032(536870973, map, "kB", UMErrorCode.E_UM_BE_DEFLATE_FAILED, "kD");
        map.put("kDN", 536870932);
        map.put("kF", 536870932);
        map.put("kI", 124);
        map.put("kN", 92);
        map.put("kP", 93);
        map.put("kR", 536870931);
        map.put("kUP", 536870931);
        C17520.m39895(map, "@7", 123, DHParameters.DEFAULT_MINIMUM_LENGTH, "@8");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53628(String str, boolean z, boolean z2) {
        Integer num = (Integer) f76958.get(str);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        int i = 536870912;
        if ((iIntValue & 536870912) != 0) {
            iIntValue &= -536870913;
        } else {
            i = 0;
        }
        if ((iIntValue & 1073741824) != 0) {
            i |= 1073741824;
            iIntValue &= -1073741825;
        }
        if ((iIntValue & Integer.MIN_VALUE) != 0) {
            i |= Integer.MIN_VALUE;
            iIntValue &= Integer.MAX_VALUE;
        }
        return m53626(iIntValue, i, z, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53626(int i, int i2, boolean z, boolean z2) {
        if (i != 4) {
            if (i == 61) {
                return (536870912 & i2) == 0 ? "\t" : "\u001b[Z";
            }
            if (i == 62) {
                if ((i2 & 1073741824) == 0) {
                    return null;
                }
                return WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
            }
            if (i == 66) {
                return (i2 & Integer.MIN_VALUE) == 0 ? "\r" : "\u001b\r";
            }
            if (i == 67) {
                return ((i2 & Integer.MIN_VALUE) == 0 ? "" : "\u001b").concat((i2 & 1073741824) == 0 ? "\u007f" : "\b");
            }
            if (i == 92) {
                return "\u001b[5~";
            }
            if (i == 93) {
                return "\u001b[6~";
            }
            if (i != 111) {
                if (i != 112) {
                    switch (i) {
                        case 19:
                            if (i2 == 0) {
                                return z ? "\u001bOA" : "\u001b[A";
                            }
                            return m53627("\u001b[1", i2, 'A');
                        case 20:
                            if (i2 == 0) {
                                return z ? "\u001bOB" : "\u001b[B";
                            }
                            return m53627("\u001b[1", i2, 'B');
                        case 21:
                            if (i2 == 0) {
                                return z ? "\u001bOD" : "\u001b[D";
                            }
                            return m53627("\u001b[1", i2, 'D');
                        case 22:
                            if (i2 == 0) {
                                return z ? "\u001bOC" : "\u001b[C";
                            }
                            return m53627("\u001b[1", i2, 'C');
                        case 23:
                            return "\r";
                        default:
                            switch (i) {
                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    return "\u001b[32~";
                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    return "\u001b[34~";
                                case 122:
                                    if (i2 == 0) {
                                        return z ? "\u001bOH" : "\u001b[H";
                                    }
                                    return m53627("\u001b[1", i2, 'H');
                                case 123:
                                    if (i2 == 0) {
                                        return z ? "\u001bOF" : "\u001b[F";
                                    }
                                    return m53627("\u001b[1", i2, 'F');
                                case 124:
                                    return m53627("\u001b[2", i2, '~');
                                default:
                                    switch (i) {
                                        case 131:
                                            return i2 == 0 ? "\u001bOP" : m53627("\u001b[1", i2, 'P');
                                        case 132:
                                            return i2 == 0 ? "\u001bOQ" : m53627("\u001b[1", i2, 'Q');
                                        case 133:
                                            return i2 == 0 ? "\u001bOR" : m53627("\u001b[1", i2, 'R');
                                        case 134:
                                            return i2 == 0 ? "\u001bOS" : m53627("\u001b[1", i2, 'S');
                                        case 135:
                                            return m53627("\u001b[15", i2, '~');
                                        case 136:
                                            return m53627("\u001b[17", i2, '~');
                                        case 137:
                                            return m53627("\u001b[18", i2, '~');
                                        case 138:
                                            return m53627("\u001b[19", i2, '~');
                                        case 139:
                                            return m53627("\u001b[20", i2, '~');
                                        case 140:
                                            return m53627("\u001b[21", i2, '~');
                                        case 141:
                                            return m53627("\u001b[23", i2, '~');
                                        case 142:
                                            return m53627("\u001b[24", i2, '~');
                                        case 143:
                                            return "\u001bOP";
                                        case 144:
                                            return z2 ? m53627("\u001bO", i2, 'p') : "0";
                                        case 145:
                                            return z2 ? m53627("\u001bO", i2, 'q') : "1";
                                        case 146:
                                            return z2 ? m53627("\u001bO", i2, 'r') : "2";
                                        case 147:
                                            return z2 ? m53627("\u001bO", i2, 's') : "3";
                                        case 148:
                                            return z2 ? m53627("\u001bO", i2, 't') : "4";
                                        case 149:
                                            return z2 ? m53627("\u001bO", i2, 'u') : "5";
                                        case 150:
                                            return z2 ? m53627("\u001bO", i2, 'v') : "6";
                                        case 151:
                                            return z2 ? m53627("\u001bO", i2, 'w') : "7";
                                        case 152:
                                            return z2 ? m53627("\u001bO", i2, 'x') : "8";
                                        case 153:
                                            return z2 ? m53627("\u001bO", i2, 'y') : "9";
                                        case EnumC19222.f57460 /* 154 */:
                                            return z2 ? m53627("\u001bO", i2, 'o') : "/";
                                        case 155:
                                            return z2 ? m53627("\u001bO", i2, 'j') : "*";
                                        case 156:
                                            return z2 ? m53627("\u001bO", i2, 'm') : "-";
                                        case 157:
                                            return z2 ? m53627("\u001bO", i2, 'k') : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                                        case 158:
                                            return z2 ? "\u001bOn" : ".";
                                        case 159:
                                            return ",";
                                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                            return z2 ? m53627("\u001bO", i2, 'M') : "\n";
                                        case 161:
                                            return z2 ? m53627("\u001bO", i2, 'X') : "=";
                                        default:
                                            return null;
                                    }
                            }
                    }
                }
                return m53627("\u001b[3", i2, '~');
            }
        }
        return "\u001b";
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53627(String str, int i, char c) {
        int i2;
        if (i == Integer.MIN_VALUE) {
            i2 = 3;
        } else if (i == -1610612736) {
            i2 = 4;
        } else if (i == -1073741824) {
            i2 = 7;
        } else if (i == -536870912) {
            i2 = 8;
        } else if (i == 536870912) {
            i2 = 2;
        } else if (i == 1073741824) {
            i2 = 5;
        } else {
            if (i != 1610612736) {
                return str + c;
            }
            i2 = 6;
        }
        return str + C0249l.f1196b + i2 + c;
    }
}
