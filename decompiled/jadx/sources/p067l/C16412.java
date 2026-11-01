package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ܳ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16412 {

    /* JADX INFO: renamed from: ֡ */
    public static final int f48234;

    /* JADX INFO: renamed from: ֫ */
    public static final int f48235;

    /* JADX INFO: renamed from: ۖ */
    public static final int f48236;

    /* JADX INFO: renamed from: ۘ */
    public static final int f48237;

    /* JADX INFO: renamed from: ۜ */
    public static final int f48238;

    /* JADX INFO: renamed from: ۡ */
    public static final int f48239;

    /* JADX INFO: renamed from: ۢ */
    public static final int f48240;

    /* JADX INFO: renamed from: ۧ */
    public static final List f48241;

    /* JADX INFO: renamed from: ܳ */
    public static final int f48242;

    /* JADX INFO: renamed from: ܺ */
    public static final int f48243;

    /* JADX INFO: renamed from: ܽ */
    public static final List f48244;

    /* JADX INFO: renamed from: ܿ */
    public static final int f48245;

    /* JADX INFO: renamed from: ᩳ */
    public static final int f48246;

    /* JADX INFO: renamed from: ᩴ */
    public static final int f48247;

    /* JADX INFO: renamed from: ᩵ */
    public static final int f48248;

    /* JADX INFO: renamed from: ᩷ */
    public static final int f48249;

    /* JADX INFO: renamed from: ᩻ */
    public static final int f48250;

    static {
        int iM37297;
        int iM37298;
        int iM37299;
        int iM372910;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f48248 = m37297(C0233a.f1077D, C0233a.f1077D, arrayList, arrayList2);
        f48234 = m37297(C0233a.f1077D, "UTF-8-BOM", arrayList, arrayList2);
        f48243 = m37297("UTF-16BE", "UTF-16BE", arrayList, arrayList2);
        f48236 = m37297("UTF-16LE", "UTF-16LE", arrayList, arrayList2);
        f48237 = m37297("UTF-32BE", "UTF-32BE", arrayList, arrayList2);
        f48247 = m37297("UTF-32LE", "UTF-32LE", arrayList, arrayList2);
        f48245 = m37297("GB2312", "GB2312", arrayList, arrayList2);
        f48246 = m37297("GB18030", "GB18030", arrayList, arrayList2);
        f48242 = m37297("GBK", "GBK", arrayList, arrayList2);
        int iM372911 = -1;
        try {
            iM37297 = m37297("Big5", "Big5", arrayList, arrayList2);
        } catch (Exception unused) {
            iM37297 = -1;
        }
        f48235 = iM37297;
        try {
            m37297("Big5-HKSCS", "Big5-HKSCS", arrayList, arrayList2);
        } catch (Exception unused2) {
        }
        try {
            m37297("CESU-8", "CESU-8", arrayList, arrayList2);
        } catch (Exception unused3) {
        }
        try {
            m37297("EUC-JP", "EUC-JP", arrayList, arrayList2);
        } catch (Exception unused4) {
        }
        try {
            m37297("EUC-KR", "EUC-KR", arrayList, arrayList2);
        } catch (Exception unused5) {
        }
        try {
            m37297("IBM866", "IBM866", arrayList, arrayList2);
        } catch (Exception unused6) {
        }
        try {
            m37297("IBM850", "IBM850", arrayList, arrayList2);
        } catch (Exception unused7) {
        }
        try {
            iM37298 = m37297("ISO-2022-CN", "ISO-2022-CN", arrayList, arrayList2);
        } catch (Exception unused8) {
            iM37298 = -1;
        }
        f48250 = iM37298;
        try {
            iM37299 = m37297("ISO-2022-JP", "ISO-2022-JP", arrayList, arrayList2);
        } catch (Exception unused9) {
            iM37299 = -1;
        }
        f48238 = iM37299;
        try {
            iM372910 = m37297("ISO-2022-KR", "ISO-2022-KR", arrayList, arrayList2);
        } catch (Exception unused10) {
            iM372910 = -1;
        }
        f48249 = iM372910;
        try {
            m37297(LocalizedMessage.DEFAULT_ENCODING, LocalizedMessage.DEFAULT_ENCODING, arrayList, arrayList2);
        } catch (Exception unused11) {
        }
        try {
            m37297("ISO-8859-2", "ISO-8859-2", arrayList, arrayList2);
        } catch (Exception unused12) {
        }
        try {
            m37297("ISO-8859-3", "ISO-8859-3", arrayList, arrayList2);
        } catch (Exception unused13) {
        }
        try {
            m37297("ISO-8859-4", "ISO-8859-4", arrayList, arrayList2);
        } catch (Exception unused14) {
        }
        try {
            m37297("ISO-8859-5", "ISO-8859-5", arrayList, arrayList2);
        } catch (Exception unused15) {
        }
        try {
            m37297("ISO-8859-6", "ISO-8859-6", arrayList, arrayList2);
        } catch (Exception unused16) {
        }
        try {
            m37297("ISO-8859-7", "ISO-8859-7", arrayList, arrayList2);
        } catch (Exception unused17) {
        }
        try {
            m37297("ISO-8859-8", "ISO-8859-8", arrayList, arrayList2);
        } catch (Exception unused18) {
        }
        try {
            m37297("ISO-8859-9", "ISO-8859-9", arrayList, arrayList2);
        } catch (Exception unused19) {
        }
        try {
            m37297("ISO-8859-10", "ISO-8859-10", arrayList, arrayList2);
        } catch (Exception unused20) {
        }
        try {
            m37297("ISO-8859-13", "ISO-8859-13", arrayList, arrayList2);
        } catch (Exception unused21) {
        }
        try {
            m37297("ISO-8859-14", "ISO-8859-14", arrayList, arrayList2);
        } catch (Exception unused22) {
        }
        try {
            m37297("ISO-8859-15", "ISO-8859-15", arrayList, arrayList2);
        } catch (Exception unused23) {
        }
        try {
            m37297("KOI8-R", "KOI8-R", arrayList, arrayList2);
        } catch (Exception unused24) {
        }
        try {
            m37297("KOI8-U", "KOI8-U", arrayList, arrayList2);
        } catch (Exception unused25) {
        }
        try {
            iM372911 = m37297("ShiftJIS", "ShiftJIS", arrayList, arrayList2);
        } catch (Exception unused26) {
        }
        f48240 = iM372911;
        try {
            m37297("Windows-1250", "Windows-1250", arrayList, arrayList2);
        } catch (Exception unused27) {
        }
        try {
            m37297("Windows-1251", "Windows-1251", arrayList, arrayList2);
        } catch (Exception unused28) {
        }
        try {
            m37297("Windows-1252", "Windows-1252", arrayList, arrayList2);
        } catch (Exception unused29) {
        }
        try {
            m37297("Windows-1253", "Windows-1253", arrayList, arrayList2);
        } catch (Exception unused30) {
        }
        try {
            m37297("Windows-1254", "Windows-1254", arrayList, arrayList2);
        } catch (Exception unused31) {
        }
        try {
            m37297("Windows-1255", "Windows-1255", arrayList, arrayList2);
        } catch (Exception unused32) {
        }
        try {
            m37297("Windows-1256", "Windows-1256", arrayList, arrayList2);
        } catch (Exception unused33) {
        }
        try {
            m37297("Windows-1257", "Windows-1257", arrayList, arrayList2);
        } catch (Exception unused34) {
        }
        try {
            m37297("Windows-1258", "Windows-1258", arrayList, arrayList2);
        } catch (Exception unused35) {
        }
        arrayList.trimToSize();
        arrayList2.trimToSize();
        f48239 = arrayList.size();
        f48241 = C21562.unmodifiableList(arrayList);
        f48244 = C21562.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37297(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(Charset.forName(str));
        arrayList2.add(str2);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Charset m37298(int i) {
        return (Charset) f48241.get(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m37300(int i) {
        return (String) f48244.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37296(String str) {
        List list = f48244;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((String) list.get(i)).equals(str)) {
                return i;
            }
        }
        List list2 = f48241;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((Charset) list2.get(i2)).name().equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m37299(int i, byte[] bArr) {
        int iM37295 = m37295(i, bArr);
        return iM37295 == -1 ? f48248 : iM37295;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37295(int i, byte[] bArr) {
        Character.UnicodeBlock unicodeBlockOf;
        int i2;
        char cCharAt;
        InterfaceC6355[] interfaceC6355Arr = InterfaceC6355.f16468;
        ArrayList<C19095> arrayList = new ArrayList(14);
        for (int i3 = 0; i3 < 14; i3++) {
            InterfaceC6355 interfaceC6355 = interfaceC6355Arr[i3];
            if (interfaceC6355.mo5049() != -1) {
                int iMo5050 = interfaceC6355.mo5050(i, bArr);
                if (iMo5050 == 100) {
                    return interfaceC6355.mo5049();
                }
                if (iMo5050 >= 50) {
                    int iMo5049 = interfaceC6355.mo5049();
                    C19095 c19095 = new C19095();
                    c19095.f56970 = iMo5050;
                    c19095.f56969 = iMo5049;
                    arrayList.add(c19095);
                }
            }
        }
        Collections.sort(arrayList);
        for (C19095 c19096 : arrayList) {
            String str = new String(bArr, 0, i, m37298(c19096.f56969));
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
            return c19096.f56969;
        }
        return -1;
    }
}
