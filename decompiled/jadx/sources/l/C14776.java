package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ܳ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14776 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f45120;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f45121;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f45122;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int f45123;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f45124;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int f45125;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f45126;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final List f45127;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f45128;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int f45129;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final List f45130;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f45131;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f45132;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int f45133;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int f45134;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f45135;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f45136;

    static {
        int iM35150;
        int iM35151;
        int iM35152;
        int iM35153;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f45134 = m35150(a.D, a.D, arrayList, arrayList2);
        f45120 = m35150(a.D, "UTF-8-BOM", arrayList, arrayList2);
        f45129 = m35150("UTF-16BE", "UTF-16BE", arrayList, arrayList2);
        f45122 = m35150("UTF-16LE", "UTF-16LE", arrayList, arrayList2);
        f45123 = m35150("UTF-32BE", "UTF-32BE", arrayList, arrayList2);
        f45133 = m35150("UTF-32LE", "UTF-32LE", arrayList, arrayList2);
        f45131 = m35150("GB2312", "GB2312", arrayList, arrayList2);
        f45132 = m35150("GB18030", "GB18030", arrayList, arrayList2);
        f45128 = m35150("GBK", "GBK", arrayList, arrayList2);
        int iM35154 = -1;
        try {
            iM35150 = m35150("Big5", "Big5", arrayList, arrayList2);
        } catch (Exception unused) {
            iM35150 = -1;
        }
        f45121 = iM35150;
        try {
            m35150("Big5-HKSCS", "Big5-HKSCS", arrayList, arrayList2);
        } catch (Exception unused2) {
        }
        try {
            m35150("CESU-8", "CESU-8", arrayList, arrayList2);
        } catch (Exception unused3) {
        }
        try {
            m35150("EUC-JP", "EUC-JP", arrayList, arrayList2);
        } catch (Exception unused4) {
        }
        try {
            m35150("EUC-KR", "EUC-KR", arrayList, arrayList2);
        } catch (Exception unused5) {
        }
        try {
            m35150("IBM866", "IBM866", arrayList, arrayList2);
        } catch (Exception unused6) {
        }
        try {
            m35150("IBM850", "IBM850", arrayList, arrayList2);
        } catch (Exception unused7) {
        }
        try {
            iM35151 = m35150("ISO-2022-CN", "ISO-2022-CN", arrayList, arrayList2);
        } catch (Exception unused8) {
            iM35151 = -1;
        }
        f45136 = iM35151;
        try {
            iM35152 = m35150("ISO-2022-JP", "ISO-2022-JP", arrayList, arrayList2);
        } catch (Exception unused9) {
            iM35152 = -1;
        }
        f45124 = iM35152;
        try {
            iM35153 = m35150("ISO-2022-KR", "ISO-2022-KR", arrayList, arrayList2);
        } catch (Exception unused10) {
            iM35153 = -1;
        }
        f45135 = iM35153;
        try {
            m35150(LocalizedMessage.DEFAULT_ENCODING, LocalizedMessage.DEFAULT_ENCODING, arrayList, arrayList2);
        } catch (Exception unused11) {
        }
        try {
            m35150("ISO-8859-2", "ISO-8859-2", arrayList, arrayList2);
        } catch (Exception unused12) {
        }
        try {
            m35150("ISO-8859-3", "ISO-8859-3", arrayList, arrayList2);
        } catch (Exception unused13) {
        }
        try {
            m35150("ISO-8859-4", "ISO-8859-4", arrayList, arrayList2);
        } catch (Exception unused14) {
        }
        try {
            m35150("ISO-8859-5", "ISO-8859-5", arrayList, arrayList2);
        } catch (Exception unused15) {
        }
        try {
            m35150("ISO-8859-6", "ISO-8859-6", arrayList, arrayList2);
        } catch (Exception unused16) {
        }
        try {
            m35150("ISO-8859-7", "ISO-8859-7", arrayList, arrayList2);
        } catch (Exception unused17) {
        }
        try {
            m35150("ISO-8859-8", "ISO-8859-8", arrayList, arrayList2);
        } catch (Exception unused18) {
        }
        try {
            m35150("ISO-8859-9", "ISO-8859-9", arrayList, arrayList2);
        } catch (Exception unused19) {
        }
        try {
            m35150("ISO-8859-10", "ISO-8859-10", arrayList, arrayList2);
        } catch (Exception unused20) {
        }
        try {
            m35150("ISO-8859-13", "ISO-8859-13", arrayList, arrayList2);
        } catch (Exception unused21) {
        }
        try {
            m35150("ISO-8859-14", "ISO-8859-14", arrayList, arrayList2);
        } catch (Exception unused22) {
        }
        try {
            m35150("ISO-8859-15", "ISO-8859-15", arrayList, arrayList2);
        } catch (Exception unused23) {
        }
        try {
            m35150("KOI8-R", "KOI8-R", arrayList, arrayList2);
        } catch (Exception unused24) {
        }
        try {
            m35150("KOI8-U", "KOI8-U", arrayList, arrayList2);
        } catch (Exception unused25) {
        }
        try {
            iM35154 = m35150("ShiftJIS", "ShiftJIS", arrayList, arrayList2);
        } catch (Exception unused26) {
        }
        f45126 = iM35154;
        try {
            m35150("Windows-1250", "Windows-1250", arrayList, arrayList2);
        } catch (Exception unused27) {
        }
        try {
            m35150("Windows-1251", "Windows-1251", arrayList, arrayList2);
        } catch (Exception unused28) {
        }
        try {
            m35150("Windows-1252", "Windows-1252", arrayList, arrayList2);
        } catch (Exception unused29) {
        }
        try {
            m35150("Windows-1253", "Windows-1253", arrayList, arrayList2);
        } catch (Exception unused30) {
        }
        try {
            m35150("Windows-1254", "Windows-1254", arrayList, arrayList2);
        } catch (Exception unused31) {
        }
        try {
            m35150("Windows-1255", "Windows-1255", arrayList, arrayList2);
        } catch (Exception unused32) {
        }
        try {
            m35150("Windows-1256", "Windows-1256", arrayList, arrayList2);
        } catch (Exception unused33) {
        }
        try {
            m35150("Windows-1257", "Windows-1257", arrayList, arrayList2);
        } catch (Exception unused34) {
        }
        try {
            m35150("Windows-1258", "Windows-1258", arrayList, arrayList2);
        } catch (Exception unused35) {
        }
        arrayList.trimToSize();
        arrayList2.trimToSize();
        f45125 = arrayList.size();
        f45127 = C20195.unmodifiableList(arrayList);
        f45130 = C20195.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35150(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Charset.forName(str));
        arrayList2.add(str2);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Charset m35151(int i) {
        return (Charset) f45127.get(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35153(int i) {
        return (String) f45130.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35149(String str) {
        List list = f45130;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((String) list.get(i)).equals(str)) {
                return i;
            }
        }
        List list2 = f45127;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((Charset) list2.get(i2)).name().equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m35152(int i, byte[] bArr) {
        int iM35148 = m35148(i, bArr);
        return iM35148 == -1 ? f45134 : iM35148;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35148(int i, byte[] bArr) {
        Character.UnicodeBlock unicodeBlockOf;
        int i2;
        char cCharAt;
        InterfaceC4194[] interfaceC4194Arr = InterfaceC4194.f13655;
        ArrayList<C17599> arrayList = new ArrayList(14);
        for (int i3 = 0; i3 < 14; i3++) {
            InterfaceC4194 interfaceC4194 = interfaceC4194Arr[i3];
            if (interfaceC4194.mo2710() != -1) {
                int iMo2711 = interfaceC4194.mo2711(i, bArr);
                if (iMo2711 == 100) {
                    return interfaceC4194.mo2710();
                }
                if (iMo2711 >= 50) {
                    int iMo2710 = interfaceC4194.mo2710();
                    C17599 c17599 = new C17599();
                    c17599.f53776 = iMo2711;
                    c17599.f53775 = iMo2710;
                    arrayList.add(c17599);
                }
            }
        }
        Collections.sort(arrayList);
        for (C17599 c175910 : arrayList) {
            String str = new String(bArr, 0, i, m35151(c175910.f53775));
            int length = str.length();
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 >= 55296 && cCharAt2 <= 56319 && (i2 = i4 + 1) < length && (cCharAt = str.charAt(i2)) >= 56320 && cCharAt <= 57343) {
                    i4 = i2;
                } else if ((cCharAt2 >= ' ' || cCharAt2 == '\r' || cCharAt2 == '\n' || cCharAt2 == '\t') && cCharAt2 != 127 && ((cCharAt2 != 65533 || (i5 = i5 + 1) <= 10) && (cCharAt2 <= 127 || ((unicodeBlockOf = Character.UnicodeBlock.of(cCharAt2)) != Character.UnicodeBlock.PRIVATE_USE_AREA && unicodeBlockOf != Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A && unicodeBlockOf != Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B)))) {
                }
                i4++;
            }
            return c175910.f53775;
        }
        return -1;
    }
}
