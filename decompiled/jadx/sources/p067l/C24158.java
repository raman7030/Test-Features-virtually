package p067l;

import android.content.Context;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35B7 */
/* JADX INFO: loaded from: classes.dex */
public class C24158 implements InterfaceC6037 {

    /* JADX INFO: renamed from: ᩸ */
    public static Context f76618;

    /* JADX INFO: renamed from: ֫ */
    public static int m53409(int i, int i2, int[] iArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static Context m53410() {
        Context context = f76618;
        if (context == null) {
            return null;
        }
        return context;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m53418() {
        Context context = f76618;
        if ((context == null ? null : context) == null) {
            return "";
        }
        if (context == null) {
            context = null;
        }
        return context.getPackageName();
    }

    /* JADX INFO: renamed from: ܽ */
    public static File m53422() {
        File[] externalFilesDirs;
        Context context = f76618;
        if (context == null) {
            context = null;
        }
        if (context == null) {
            return null;
        }
        try {
            externalFilesDirs = context.getExternalFilesDirs(null);
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.Util", "getExternalFilesDirs exception", th);
            externalFilesDirs = null;
        }
        if (externalFilesDirs == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53415(Context context) {
        f76618 = context;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53411(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + "B";
        }
        if (j < 1048576) {
            return m53413("K", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m53413("M", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m53413("G", j / 1.073741824E9d);
        }
        return m53413("T", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m53419(long j) {
        if (j < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return j + " B";
        }
        if (j < 1048576) {
            return m53413(" KB", j / 1024.0d);
        }
        if (j < 1073741824) {
            return m53413(" MB", j / 1048576.0d);
        }
        if (j < 1099511627776L) {
            return m53413(" GB", j / 1.073741824E9d);
        }
        return m53413(" TB", j / 1.099511627776E12d);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53413(String str, double d) {
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
        return C17520.m39893(sb, j2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14950 m53414(C14950 c14950, C14950 c14951) {
        if (c14950 == c14951) {
            return c14950;
        }
        int size = c14950.size();
        if (c14951.size() != size) {
            throw new C4933("mismatched stack depths", null);
        }
        C14950 c14950M34208 = null;
        for (int i = 0; i < size; i++) {
            InterfaceC3830 interfaceC3830M34209 = c14950.m34209(i);
            InterfaceC3830 interfaceC3830M342010 = c14951.m34209(i);
            InterfaceC3830 interfaceC3830M53421 = m53421(interfaceC3830M34209, interfaceC3830M342010);
            if (interfaceC3830M53421 != interfaceC3830M34209) {
                if (c14950M34208 == null) {
                    c14950M34208 = c14950.m34208();
                }
                if (interfaceC3830M53421 == null) {
                    throw new C4933("incompatible: " + interfaceC3830M34209 + ", " + interfaceC3830M342010, null);
                }
                try {
                    c14950M34208.m34210(i, interfaceC3830M53421);
                } catch (C4933 e) {
                    e.m23570("...while merging stack[" + C16351.m37153(i) + "]");
                    throw e;
                }
                e.m23570("...while merging stack[" + C16351.m37153(i) + "]");
                throw e;
            }
        }
        if (c14950M34208 == null) {
            return c14950;
        }
        c14950M34208.mo22326();
        return c14950M34208;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m53420(String str) {
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
            throw new IllegalArgumentException(C6988.m16053("Unknown type [", str, "]"));
        }
        for (int i2 = 0; i2 < i; i2++) {
            strReplace = C17588.m40053(strReplace, "[]");
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC3830 m53421(InterfaceC3830 interfaceC3830, InterfaceC3830 interfaceC3831) {
        if (interfaceC3830 == null || interfaceC3830.equals(interfaceC3831)) {
            return interfaceC3830;
        }
        if (interfaceC3831 == null) {
            return null;
        }
        C9566 type = interfaceC3830.getType();
        C9566 type2 = interfaceC3831.getType();
        if (type == type2) {
            return type;
        }
        if (type.m22288() && type2.m22288()) {
            C9566 c9566 = C9566.f26329;
            if (type == c9566) {
                return type2;
            }
            if (type2 == c9566) {
                return type;
            }
            if (type.m22278() && type2.m22278()) {
                InterfaceC3830 interfaceC3830M53421 = m53421(type.m22287(), type2.m22287());
                if (interfaceC3830M53421 == null) {
                    return C9566.f26324;
                }
                return ((C9566) interfaceC3830M53421).m22284();
            }
            return C9566.f26324;
        }
        if (type.m22289() && type2.m22289()) {
            return C9566.f26325;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: ֫ */
    public static void m53416(int[] iArr) {
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
                    length3 = m53409(length3 - 1, 0, iArr);
                }
                if (iArr[0] % iArr.length >= length3) {
                    int length4 = iArr.length - 2;
                    int length5 = iArr.length - 1;
                    while (i4 > 0) {
                        int iM53409 = m53409(length4 - 1, 0, iArr);
                        int i10 = length4 - iM53409;
                        int i11 = i4 - i10;
                        while (i11 > 0) {
                            iArr[length5] = i3;
                            i11--;
                            length5--;
                        }
                        i4 = i10 << 1;
                        i3++;
                        length4 = iM53409;
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
                    int iM534010 = length6 <= length3 ? length6 : m53409(length6 - 1, length3, iArr);
                    if (i4 >= i12) {
                        iMin = Math.min(i13, 1 << (i4 - i12));
                    } else if (i4 == 19 - iNumberOfLeadingZeros) {
                        if (iArr[iM534010] == length6) {
                            iM534010++;
                        }
                        iMin = 1;
                    } else {
                        iMin = 0;
                    }
                    int i15 = (length6 - iM534010) + iMin;
                    int i16 = i14 - i15;
                    while (i16 > 0) {
                        iArr[length7] = i4;
                        i16--;
                        length7--;
                    }
                    i13 -= iMin;
                    i14 = i15 << 1;
                    i4++;
                    length6 = iM534010;
                }
                return;
            }
            iArr[1] = 1;
        }
        iArr[0] = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m53417(InterfaceC3830 interfaceC3830, InterfaceC3830 interfaceC3831) {
        C9566 type = interfaceC3830.getType();
        C9566 type2 = interfaceC3831.getType();
        if (type.equals(type2)) {
            return true;
        }
        int iMo7484 = type.mo7484();
        int iMo7485 = type2.mo7484();
        if (iMo7484 == 10) {
            type = C9566.f26324;
            iMo7484 = 9;
        }
        if (iMo7485 == 10) {
            type2 = C9566.f26324;
            iMo7485 = 9;
        }
        if (iMo7484 != 9 || iMo7485 != 9) {
            return type.m22289() && type2.m22289();
        }
        C9566 c9566 = C9566.f26329;
        if (type == c9566) {
            return false;
        }
        if (type2 == c9566 || type == C9566.f26324) {
            return true;
        }
        if (!type.m22278()) {
            return !type2.m22278() || type == C9566.f26331 || type == C9566.f26327;
        }
        if (!type2.m22278()) {
            return false;
        }
        do {
            type = type.m22287();
            type2 = type2.m22287();
            if (!type.m22278()) {
                break;
            }
        } while (type2.m22278());
        return m53417(type, type2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m53423(String str) {
        return str.equals("<clinit>") || str.equals("<init>");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53412(String str) {
        StringBuilder sb = new StringBuilder();
        C19542 c19542 = new C19542(str);
        while (c19542.m44387()) {
            sb.append(m53420(c19542.m44388()));
            if (c19542.m44387()) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
