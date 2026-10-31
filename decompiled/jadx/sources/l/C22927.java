package l;

import android.content.Context;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35B7 */
/* JADX INFO: loaded from: classes.dex */
public class C22927 implements InterfaceC3860 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Context f73888;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51018(int i, int i2, int[] iArr) {
        int length = iArr.length;
        int length2 = iArr.length - 2;
        int i3 = i;
        while (i3 >= i2 && iArr[i3] % length > i) {
            length2 = i3;
            i3 -= (i - i3) + 1;
        }
        int iMax = Math.max(i2 - 1, i3);
        while (length2 > iMax + 1) {
            int i4 = (iMax + length2) >> 1;
            if (iArr[i4] % length > i) {
                length2 = i4;
            } else {
                iMax = i4;
            }
        }
        return length2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Context m51019() {
        Context context = f73888;
        if (context == null) {
            return null;
        }
        return context;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51027() {
        Context context = f73888;
        if ((context == null ? null : context) == null) {
            return "";
        }
        if (context == null) {
            context = null;
        }
        return context.getPackageName();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static File m51031() {
        File[] externalFilesDirs;
        Context context = f73888;
        if (context == null) {
            context = null;
        }
        if (context == null) {
            return null;
        }
        try {
            externalFilesDirs = context.getExternalFilesDirs(null);
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.Util", "getExternalFilesDirs exception", th);
            externalFilesDirs = null;
        }
        if (externalFilesDirs == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51024(Context context) {
        f73888 = context;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51020(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j < 1048576) {
            return m51022("K", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m51022("M", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m51022("G", j / 1.073741824E9d);
        }
        return m51022("T", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51028(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + " B";
        }
        if (j < 1048576) {
            return m51022(" KB", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m51022(" MB", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m51022(" GB", j / 1.073741824E9d);
        }
        return m51022(" TB", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51022(String str, double d) {
        long jRound = Math.round(d * 100.0d);
        boolean z = jRound < 0;
        if (z) {
            jRound = -jRound;
        }
        long j = jRound / 100;
        long j2 = jRound % 100;
        StringBuilder sb = new StringBuilder(str.length() + 7);
        if (z) {
            sb.append('-');
        }
        sb.append(j);
        sb.append('.');
        if (j2 < 10) {
            sb.append('0');
        }
        return C15942.m37718(sb, j2, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13238 m51023(C13238 c13238, C13238 c13239) {
        if (c13238 == c13239) {
            return c13238;
        }
        int size = c13238.size();
        if (c13239.size() != size) {
            throw new C2698("mismatched stack depths", null);
        }
        C13238 c13238M32110 = null;
        for (int i = 0; i < size; i++) {
            InterfaceC1538 interfaceC1538M32111 = c13238.m32111(i);
            InterfaceC1538 interfaceC1538M32112 = c13239.m32111(i);
            InterfaceC1538 interfaceC1538M51030 = m51030(interfaceC1538M32111, interfaceC1538M32112);
            if (interfaceC1538M51030 != interfaceC1538M32111) {
                if (c13238M32110 == null) {
                    c13238M32110 = c13238.m32110();
                }
                if (interfaceC1538M51030 == null) {
                    throw new C2698("incompatible: " + interfaceC1538M32111 + ", " + interfaceC1538M32112, null);
                }
                try {
                    c13238M32110.m32112(i, interfaceC1538M51030);
                } catch (C2698 e) {
                    e.m21602("...while merging stack[" + C14712.m35006(i) + "]");
                    throw e;
                }
                e.m21602("...while merging stack[" + C14712.m35006(i) + "]");
                throw e;
            }
        }
        if (c13238M32110 == null) {
            return c13238;
        }
        c13238M32110.mo20349();
        return c13238M32110;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51029(String str) {
        String strReplace;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        if (i > 0) {
            str = str.substring(i);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'V') {
            strReplace = ClassTransform.VOID;
        } else if (cCharAt == 'Z') {
            strReplace = ClassTransform.BOOLEAN;
        } else if (cCharAt == 'B') {
            strReplace = ClassTransform.BYTE;
        } else if (cCharAt == 'C') {
            strReplace = ClassTransform.CHARACTER;
        } else if (cCharAt == 'S') {
            strReplace = ClassTransform.SHORT;
        } else if (cCharAt == 'I') {
            strReplace = ClassTransform.INTEGER;
        } else if (cCharAt == 'F') {
            strReplace = ClassTransform.FLOAT;
        } else if (cCharAt == 'J') {
            strReplace = ClassTransform.LONG;
        } else if (cCharAt == 'D') {
            strReplace = ClassTransform.DOUBLE;
        } else if (cCharAt == '%') {
            strReplace = "%";
        } else {
            strReplace = cCharAt == 'L' ? str.substring(1, str.indexOf(59)).replace('/', '.') : null;
        }
        if (strReplace == null) {
            throw new IllegalArgumentException(C4860.m14172("Unknown type [", str, "]"));
        }
        for (int i2 = 0; i2 < i; i2++) {
            strReplace = C16014.m37867(strReplace, "[]");
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1538 m51030(InterfaceC1538 interfaceC1538, InterfaceC1538 interfaceC1539) {
        if (interfaceC1538 == null || interfaceC1538.equals(interfaceC1539)) {
            return interfaceC1538;
        }
        if (interfaceC1539 == null) {
            return null;
        }
        C7573 type = interfaceC1538.getType();
        C7573 type2 = interfaceC1539.getType();
        if (type == type2) {
            return type;
        }
        if (type.m20311() && type2.m20311()) {
            C7573 c7573 = C7573.f23417;
            if (type == c7573) {
                return type2;
            }
            if (type2 == c7573) {
                return type;
            }
            if (type.m20301() && type2.m20301()) {
                InterfaceC1538 interfaceC1538M51030 = m51030(type.m20310(), type2.m20310());
                if (interfaceC1538M51030 == null) {
                    return C7573.f23412;
                }
                return ((C7573) interfaceC1538M51030).m20307();
            }
            return C7573.f23412;
        }
        if (type.m20312() && type2.m20312()) {
            return C7573.f23413;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51025(int[] iArr) {
        int iMin;
        int i;
        int i2;
        int length = iArr.length;
        int i3 = 1;
        if (length != 1) {
            int i4 = 2;
            if (length != 2) {
                int length2 = iArr.length;
                iArr[0] = iArr[0] + iArr[1];
                int i5 = 2;
                int i6 = 0;
                for (int i7 = 1; i7 < length2 - 1; i7++) {
                    if (i5 < length2) {
                        int i8 = iArr[i6];
                        i = iArr[i5];
                        if (i8 < i) {
                            i = iArr[i6];
                            iArr[i6] = i7;
                            i6++;
                        } else {
                            i5++;
                        }
                    } else {
                        i = iArr[i6];
                        iArr[i6] = i7;
                        i6++;
                    }
                    if (i5 >= length2 || (i6 < i7 && iArr[i6] < iArr[i5])) {
                        i2 = i + iArr[i6];
                        iArr[i6] = i7 + length2;
                        i6++;
                    } else {
                        i2 = i + iArr[i5];
                        i5++;
                    }
                    iArr[i7] = i2;
                }
                int length3 = iArr.length - 2;
                for (int i9 = 1; i9 < 19 && length3 > 1; i9++) {
                    length3 = m51018(length3 - 1, 0, iArr);
                }
                if (iArr[0] % iArr.length >= length3) {
                    int length4 = iArr.length - 2;
                    int length5 = iArr.length - 1;
                    while (i4 > 0) {
                        int iM51018 = m51018(length4 - 1, 0, iArr);
                        int i10 = length4 - iM51018;
                        int i11 = i4 - i10;
                        while (i11 > 0) {
                            iArr[length5] = i3;
                            i11--;
                            length5--;
                        }
                        i4 = i10 << 1;
                        i3++;
                        length4 = iM51018;
                    }
                    return;
                }
                int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length3 - 1);
                int i12 = 20 - iNumberOfLeadingZeros;
                int length6 = iArr.length - 2;
                int length7 = iArr.length - 1;
                i4 = i12 != 1 ? 1 : 2;
                int i13 = i12 == 1 ? length3 - 2 : length3;
                int i14 = i4 << 1;
                while (i14 > 0) {
                    int iM51019 = length6 <= length3 ? length6 : m51018(length6 - 1, length3, iArr);
                    if (i4 >= i12) {
                        iMin = Math.min(i13, 1 << (i4 - i12));
                    } else if (i4 == 19 - iNumberOfLeadingZeros) {
                        if (iArr[iM51019] == length6) {
                            iM51019++;
                        }
                        iMin = 1;
                    } else {
                        iMin = 0;
                    }
                    int i15 = (length6 - iM51019) + iMin;
                    int i16 = i14 - i15;
                    while (i16 > 0) {
                        iArr[length7] = i4;
                        i16--;
                        length7--;
                    }
                    i13 -= iMin;
                    i14 = i15 << 1;
                    i4++;
                    length6 = iM51019;
                }
                return;
            }
            iArr[1] = 1;
        }
        iArr[0] = 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51026(InterfaceC1538 interfaceC1538, InterfaceC1538 interfaceC1539) {
        C7573 type = interfaceC1538.getType();
        C7573 type2 = interfaceC1539.getType();
        if (type.equals(type2)) {
            return true;
        }
        int iMo5255 = type.mo5255();
        int iMo5256 = type2.mo5255();
        if (iMo5255 == 10) {
            type = C7573.f23412;
            iMo5255 = 9;
        }
        if (iMo5256 == 10) {
            type2 = C7573.f23412;
            iMo5256 = 9;
        }
        if (iMo5255 != 9 || iMo5256 != 9) {
            return type.m20312() && type2.m20312();
        }
        C7573 c7573 = C7573.f23417;
        if (type == c7573) {
            return false;
        }
        if (type2 == c7573 || type == C7573.f23412) {
            return true;
        }
        if (!type.m20301()) {
            return !type2.m20301() || type == C7573.f23419 || type == C7573.f23415;
        }
        if (!type2.m20301()) {
            return false;
        }
        do {
            type = type.m20310();
            type2 = type2.m20310();
            if (!type.m20301()) {
                break;
            }
        } while (type2.m20301());
        return m51026(type, type2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m51032(String str) {
        return str.equals("<clinit>") || str.equals("<init>");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51021(String str) {
        StringBuilder sb = new StringBuilder();
        C18070 c18070 = new C18070(str);
        while (c18070.m42135()) {
            sb.append(m51029(c18070.m42136()));
            if (c18070.m42135()) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
