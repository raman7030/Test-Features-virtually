package p067l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10685 {

    /* JADX INFO: renamed from: ֫ */
    public static Class f29593;

    /* JADX INFO: renamed from: ۧ */
    public static Class f29594;

    /* JADX INFO: renamed from: ܽ */
    public static Method f29595;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f29596;

    /* JADX INFO: renamed from: ᩳ */
    public static Method f29597;

    /* JADX INFO: renamed from: ֫ */
    public static int m24605(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m24611(AbstractC17043 abstractC17043, String str) {
        AbstractC17043 abstractC17044;
        String strSubstring;
        String strConcat;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Relative path can not be empty.");
        }
        if (str.startsWith("/") || str.endsWith("/")) {
            throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(str));
        }
        int iLastIndexOf = str.lastIndexOf(47);
        int i = -1;
        if (iLastIndexOf != -1) {
            String strSubstring2 = str.substring(0, iLastIndexOf);
            if (strSubstring2 != null && !strSubstring2.isEmpty()) {
                if (strSubstring2.startsWith("/") || strSubstring2.endsWith("/")) {
                    throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(strSubstring2));
                }
                if (abstractC17043.mo25094()) {
                    int iIndexOf = strSubstring2.indexOf(47);
                    int i2 = -1;
                    while (iIndexOf != -1) {
                        AbstractC17043 abstractC17043M24610 = m24610(strSubstring2.substring(i2 + 1, iIndexOf), abstractC17043.mo25500(true));
                        if (abstractC17043M24610 == null) {
                            break;
                        }
                        i2 = iIndexOf;
                        iIndexOf = strSubstring2.indexOf(47, iIndexOf + 1);
                        abstractC17043 = abstractC17043M24610;
                    }
                    String strSubstring3 = strSubstring2.substring(i2 + 1);
                    int iIndexOf2 = strSubstring3.indexOf(47);
                    if (iIndexOf2 == -1) {
                        AbstractC17043 abstractC17043M24611 = m24610(strSubstring3, abstractC17043.mo25500(true));
                        if (abstractC17043M24611 == null) {
                            abstractC17043M24611 = abstractC17043.m38684(strSubstring3);
                            while (abstractC17043M24611.mo25094()) {
                                StringBuilder sbM21133 = C9179.m21133(strSubstring3, "-");
                                iIndexOf2++;
                                sbM21133.append(iIndexOf2);
                                abstractC17043M24611 = abstractC17043.m38684(sbM21133.toString());
                            }
                        }
                        abstractC17043 = abstractC17043M24611;
                    } else {
                        String strSubstring4 = strSubstring3.substring(0, iIndexOf2);
                        String strSubstring5 = strSubstring3.substring(iIndexOf2 + 1);
                        AbstractC17043 abstractC17043M24612 = m24610(strSubstring4, abstractC17043.mo25500(true));
                        if (abstractC17043M24612 == null) {
                            abstractC17043M24612 = abstractC17043.m38684(strSubstring4);
                            int i3 = -1;
                            while (abstractC17043M24612.mo25094()) {
                                StringBuilder sbM21134 = C9179.m21133(strSubstring4, "-");
                                i3++;
                                sbM21134.append(i3);
                                abstractC17043M24612 = abstractC17043.m38684(sbM21134.toString());
                            }
                        }
                        abstractC17043 = abstractC17043M24612.m38684(strSubstring5);
                    }
                } else {
                    abstractC17043 = abstractC17043.m38684(strSubstring2);
                }
            }
            str = str.substring(iLastIndexOf + 1);
        }
        Iterator it = abstractC17043.mo25500(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC17044 = null;
                break;
            }
            abstractC17044 = (AbstractC17043) it.next();
            if (abstractC17044.mo25093()) {
                String name = abstractC17044.getName();
                if (!name.equals(str)) {
                    int iLastIndexOf2 = name.lastIndexOf(46);
                    if (iLastIndexOf2 > 0) {
                        int iLastIndexOf3 = name.lastIndexOf(46, iLastIndexOf2 - 1);
                        if (iLastIndexOf3 == -1) {
                            if (m24615(iLastIndexOf2 + 1, name.length(), name) && name.substring(0, iLastIndexOf2).equals(str)) {
                                break;
                            }
                        } else if (m24615(iLastIndexOf3 + 1, iLastIndexOf2, name)) {
                            if ((name.substring(0, iLastIndexOf3) + name.substring(iLastIndexOf2)).equals(str)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            }
        }
        if (abstractC17044 != null) {
            return abstractC17044;
        }
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(str);
        int iLastIndexOf4 = str.lastIndexOf(46);
        if (iLastIndexOf4 == -1) {
            strConcat = str.concat(".");
            strSubstring = "";
        } else {
            String strSubstring6 = str.substring(0, iLastIndexOf4 + 1);
            strSubstring = str.substring(iLastIndexOf4);
            strConcat = strSubstring6;
        }
        while (abstractC17043M38684.mo25094()) {
            StringBuilder sbM17248 = C7470.m17248(strConcat);
            i++;
            sbM17248.append(i);
            sbM17248.append(strSubstring);
            abstractC17043M38684 = abstractC17043.m38684(sbM17248.toString());
        }
        return abstractC17043M38684;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24612(Context context, C22755 c22755) {
        try {
            c22755.getClass();
            if (C24470.m53965(context, "101492915").m53972("Common_ta_enable")) {
                f29597.invoke(f29593, Boolean.TRUE);
            } else {
                f29597.invoke(f29593, Boolean.FALSE);
            }
        } catch (Exception e) {
            C11060.m25467("OpenConfig", "checkStatStatus exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m24622(String str) {
        char cCharAt;
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < '@') {
                    if (((1 << cCharAt2) & 4294957567L) != 0) {
                        return true;
                    }
                } else if (cCharAt2 < 128) {
                    if (cCharAt2 == 127) {
                        return true;
                    }
                } else if (cCharAt2 < 8203 || cCharAt2 > 8303) {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        if ((cCharAt2 >= 57344 && cCharAt2 <= 63743) || cCharAt2 == 65533 || cCharAt2 == 65279) {
                            return true;
                        }
                    } else if (cCharAt2 > 56319 || (i = i + 1) >= length || (cCharAt = str.charAt(i)) < 56320 || cCharAt > 57343 || Character.toCodePoint(cCharAt2, cCharAt) >= 983040) {
                        return true;
                    }
                } else if (cCharAt2 <= 8207 || ((cCharAt2 >= 8232 && cCharAt2 <= 8239) || cCharAt2 >= 8288)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m24619(Context context, C22755 c22755) {
        try {
            f29593 = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f29594 = cls;
            f29595 = cls.getMethod("reportQQ", Context.class, String.class);
            f29594.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class cls2 = f29594;
            Class<?> cls3 = Integer.TYPE;
            cls2.getMethod("commitEvents", Context.class, cls3);
            Class cls4 = f29593;
            Class<?> cls5 = Boolean.TYPE;
            f29597 = cls4.getMethod("setEnableStatService", cls5);
            m24612(context, c22755);
            f29593.getMethod("setAutoExceptionCaught", cls5).invoke(f29593, Boolean.FALSE);
            f29593.getMethod("setEnableSmartReporting", cls5).invoke(f29593, Boolean.TRUE);
            f29593.getMethod("setSendPeriodMinutes", cls3).invoke(f29593, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f29593.getMethod("setStatSendStrategy", cls6).invoke(f29593, cls6.getField("PERIOD").get(null));
            f29594.getMethod("startStatService", Context.class, String.class, String.class).invoke(f29594, context, "Aqc101492915", Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f29596 = true;
        } catch (Exception e) {
            C11060.m25467("OpenConfig", "start4QQConnect exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24614(int i) {
        switch (Character.getType(i)) {
            default:
                if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                    switch (i) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static LinkedHashMap m24618(C9952 c9952) {
        Iterator it;
        C7090 c7090;
        Iterator it2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = c9952.getMethods().iterator();
        while (it3.hasNext()) {
            InterfaceC19897 interfaceC19897 = (InterfaceC19897) it3.next();
            String strM24608 = m24608(interfaceC19897);
            InterfaceC20568 interfaceC20568Mo5857 = interfaceC19897.mo5857();
            if (interfaceC20568Mo5857 == null) {
                c7090 = new C7090(0, 0, 0, 0, new ArrayList(), new ArrayList());
                it = it3;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5857.mo6074()) {
                    i++;
                    EnumC3167 enumC3167Mo6217 = interfaceC23920.mo6217();
                    InterfaceC12777 interfaceC12777 = interfaceC23920 instanceof InterfaceC12777 ? (InterfaceC12777) interfaceC23920 : null;
                    InterfaceC10250 reference = interfaceC12777 != null ? interfaceC12777.getReference() : null;
                    if (interfaceC12777 != null && enumC3167Mo6217.f6092 == 0 && (reference instanceof InterfaceC16954)) {
                        i2++;
                        String string = ((InterfaceC16954) reference).getString();
                        if (linkedHashSet.size() < 5 && string != null && !string.isEmpty() && string.codePointCount(0, string.length()) <= 80) {
                            int iCharCount = 0;
                            while (true) {
                                if (iCharCount >= string.length()) {
                                    it2 = it3;
                                    linkedHashSet.add(string);
                                    break;
                                }
                                int iCodePointAt = string.codePointAt(iCharCount);
                                it2 = it3;
                                if (iCodePointAt == 10 || iCodePointAt == 13 || Character.isISOControl(iCodePointAt)) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt);
                                it3 = it2;
                            }
                        } else {
                            it2 = it3;
                        }
                    } else {
                        it2 = it3;
                        if (interfaceC12777 != null && enumC3167Mo6217.f6092 == 2 && (reference instanceof InterfaceC20309)) {
                            InterfaceC20309 interfaceC20309 = (InterfaceC20309) reference;
                            if ("I".equals(interfaceC20309.getType())) {
                                String strMo10231 = interfaceC20309.mo10231();
                                if (strMo10231.contains("/R$") || strMo10231.startsWith("LR$")) {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (interfaceC23920 instanceof InterfaceC11436) {
                        long jMo7162 = ((InterfaceC11436) interfaceC23920).mo7162();
                        if (jMo7162 >= 0 && jMo7162 <= 4294967295L) {
                            int i5 = (int) jMo7162;
                            int i6 = (i5 >>> 24) & 255;
                            int i7 = (i5 >>> 16) & 255;
                            if ((i6 == 127 || i6 == 1) && i7 != 0) {
                                i3++;
                            }
                        }
                    }
                    if (enumC3167Mo6217.f6089.startsWith("invoke-")) {
                        i4++;
                        if (reference instanceof InterfaceC7568) {
                            InterfaceC7568 interfaceC7568 = (InterfaceC7568) reference;
                            if (linkedHashSet2.size() < 5) {
                                linkedHashSet2.add(interfaceC7568.mo5853() + "->" + interfaceC7568.getName());
                            }
                        }
                    }
                    it3 = it2;
                }
                it = it3;
                c7090 = new C7090(i, i2, i3, i4, linkedHashSet, linkedHashSet2);
            }
            linkedHashMap.put(strM24608, c7090);
            it3 = it;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashMap m24609(C9952 c9952) {
        InterfaceC12262 interfaceC12262Mo13085;
        C23184 c23184;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC5815 interfaceC5815 : c9952.getFields()) {
            int iMo13086 = interfaceC5815.mo13086();
            if (EnumC17248.STATIC.m39032(iMo13086) && EnumC17248.FINAL.m39032(iMo13086) && (interfaceC12262Mo13085 = interfaceC5815.mo13085()) != null) {
                C13220 c13220 = new C13220();
                try {
                    AbstractC13363.m30508(new C5636(new C23948(c13220)), interfaceC12262Mo13085);
                    String string = c13220.toString();
                    boolean z = string.codePointCount(0, string.length()) > 240;
                    if (z) {
                        string = C10127.m23604(0, string.length(), 240, string);
                    }
                    c23184 = new C23184(string, z);
                } catch (IOException unused) {
                    c23184 = null;
                }
                if (c23184 != null) {
                    linkedHashMap.put(interfaceC5815.getName() + ":" + interfaceC5815.getType(), c23184);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24613(InterfaceC22753 interfaceC22753) {
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m24610(String str, List list) {
        int iLastIndexOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
            if (abstractC17043.mo25087()) {
                String name = abstractC17043.getName();
                if (name.equals(str) || ((iLastIndexOf = name.lastIndexOf(45)) != -1 && m24615(iLastIndexOf + 1, name.length(), name) && name.substring(0, iLastIndexOf).equals(str))) {
                    return abstractC17043;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m24621(Context context, C22755 c22755) {
        if (!TextUtils.isEmpty(c22755.m50933())) {
            C9538 c9538M22234 = C9538.m22234();
            String strM50933 = c22755.m50933();
            c9538M22234.getClass();
            C9538.m22236(strM50933, "101492915", "11", "0");
        }
        if (f29596) {
            m24612(context, c22755);
            if (c22755.m50933() != null) {
                try {
                    f29595.invoke(f29594, context, c22755.m50933());
                } catch (Exception e) {
                    C11060.m25467("OpenConfig", "reportQQ exception: " + e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m24620(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24606(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m24616(int i, int i2, CharSequence charSequence) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24615(int i, int i2, String str) {
        if (i >= i2) {
            return false;
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m24608(InterfaceC19897 interfaceC19897) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC19897.getParameters().iterator();
        while (it.hasNext()) {
            sb.append(((InterfaceC2461) it.next()).getType());
        }
        return interfaceC19897.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + interfaceC19897.mo5855();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m24617(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return str;
        }
        int iLastIndexOf2 = str.lastIndexOf(46, iLastIndexOf - 1);
        if (iLastIndexOf2 == -1) {
            return m24615(iLastIndexOf + 1, str.length(), str) ? str.substring(0, iLastIndexOf) : str;
        }
        if (!m24615(iLastIndexOf2 + 1, iLastIndexOf, str)) {
            return str;
        }
        return str.substring(0, iLastIndexOf2) + str.substring(iLastIndexOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m24607(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return (iLastIndexOf == -1 || !m24615(iLastIndexOf + 1, str.length(), str)) ? str : str.substring(0, iLastIndexOf);
    }
}
