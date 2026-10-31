package l;

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
public final class C8751 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class f26667;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class f26668;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f26669;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f26670;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Method f26671;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22635(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m22641(AbstractC15440 abstractC15440, String str) {
        AbstractC15440 abstractC15441;
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
                if (abstractC15440.mo23120()) {
                    int iIndexOf = strSubstring2.indexOf(47);
                    int i2 = -1;
                    while (iIndexOf != -1) {
                        AbstractC15440 abstractC15440M22640 = m22640(strSubstring2.substring(i2 + 1, iIndexOf), abstractC15440.mo23549(true));
                        if (abstractC15440M22640 == null) {
                            break;
                        }
                        i2 = iIndexOf;
                        iIndexOf = strSubstring2.indexOf(47, iIndexOf + 1);
                        abstractC15440 = abstractC15440M22640;
                    }
                    String strSubstring3 = strSubstring2.substring(i2 + 1);
                    int iIndexOf2 = strSubstring3.indexOf(47);
                    if (iIndexOf2 == -1) {
                        AbstractC15440 abstractC15440M22641 = m22640(strSubstring3, abstractC15440.mo23549(true));
                        if (abstractC15440M22641 == null) {
                            abstractC15440M22641 = abstractC15440.m36526(strSubstring3);
                            while (abstractC15440M22641.mo23120()) {
                                StringBuilder sbM19190 = C7166.m19190(strSubstring3, "-");
                                iIndexOf2++;
                                sbM19190.append(iIndexOf2);
                                abstractC15440M22641 = abstractC15440.m36526(sbM19190.toString());
                            }
                        }
                        abstractC15440 = abstractC15440M22641;
                    } else {
                        String strSubstring4 = strSubstring3.substring(0, iIndexOf2);
                        String strSubstring5 = strSubstring3.substring(iIndexOf2 + 1);
                        AbstractC15440 abstractC15440M22642 = m22640(strSubstring4, abstractC15440.mo23549(true));
                        if (abstractC15440M22642 == null) {
                            abstractC15440M22642 = abstractC15440.m36526(strSubstring4);
                            int i3 = -1;
                            while (abstractC15440M22642.mo23120()) {
                                StringBuilder sbM19191 = C7166.m19190(strSubstring4, "-");
                                i3++;
                                sbM19191.append(i3);
                                abstractC15440M22642 = abstractC15440.m36526(sbM19191.toString());
                            }
                        }
                        abstractC15440 = abstractC15440M22642.m36526(strSubstring5);
                    }
                } else {
                    abstractC15440 = abstractC15440.m36526(strSubstring2);
                }
            }
            str = str.substring(iLastIndexOf + 1);
        }
        Iterator it = abstractC15440.mo23549(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC15441 = null;
                break;
            }
            abstractC15441 = (AbstractC15440) it.next();
            if (abstractC15441.mo23119()) {
                String name = abstractC15441.getName();
                if (!name.equals(str)) {
                    int iLastIndexOf2 = name.lastIndexOf(46);
                    if (iLastIndexOf2 > 0) {
                        int iLastIndexOf3 = name.lastIndexOf(46, iLastIndexOf2 - 1);
                        if (iLastIndexOf3 == -1) {
                            if (m22645(iLastIndexOf2 + 1, name.length(), name) && name.substring(0, iLastIndexOf2).equals(str)) {
                                break;
                            }
                        } else if (m22645(iLastIndexOf3 + 1, iLastIndexOf2, name)) {
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
        if (abstractC15441 != null) {
            return abstractC15441;
        }
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(str);
        int iLastIndexOf4 = str.lastIndexOf(46);
        if (iLastIndexOf4 == -1) {
            strConcat = str.concat(".");
            strSubstring = "";
        } else {
            String strSubstring6 = str.substring(0, iLastIndexOf4 + 1);
            strSubstring = str.substring(iLastIndexOf4);
            strConcat = strSubstring6;
        }
        while (abstractC15440M36526.mo23120()) {
            StringBuilder sbM15339 = C5368.m15339(strConcat);
            i++;
            sbM15339.append(i);
            sbM15339.append(strSubstring);
            abstractC15440M36526 = abstractC15440.m36526(sbM15339.toString());
        }
        return abstractC15440M36526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22642(Context context, C21451 c21451) {
        try {
            c21451.getClass();
            if (C23255.m51569(context, "101492915").m51576("Common_ta_enable")) {
                f26671.invoke(f26667, Boolean.TRUE);
            } else {
                f26671.invoke(f26667, Boolean.FALSE);
            }
        } catch (Exception e) {
            C9145.m23516("OpenConfig", "checkStatStatus exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m22652(String str) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22649(Context context, C21451 c21451) {
        try {
            f26667 = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f26668 = cls;
            f26669 = cls.getMethod("reportQQ", Context.class, String.class);
            f26668.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class cls2 = f26668;
            Class<?> cls3 = Integer.TYPE;
            cls2.getMethod("commitEvents", Context.class, cls3);
            Class cls4 = f26667;
            Class<?> cls5 = Boolean.TYPE;
            f26671 = cls4.getMethod("setEnableStatService", cls5);
            m22642(context, c21451);
            f26667.getMethod("setAutoExceptionCaught", cls5).invoke(f26667, Boolean.FALSE);
            f26667.getMethod("setEnableSmartReporting", cls5).invoke(f26667, Boolean.TRUE);
            f26667.getMethod("setSendPeriodMinutes", cls3).invoke(f26667, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f26667.getMethod("setStatSendStrategy", cls6).invoke(f26667, cls6.getField("PERIOD").get(null));
            f26668.getMethod("startStatService", Context.class, String.class, String.class).invoke(f26668, context, "Aqc101492915", Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f26670 = true;
        } catch (Exception e) {
            C9145.m23516("OpenConfig", "start4QQConnect exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22644(int i) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m22648(C7980 c7980) {
        Iterator it;
        C4967 c4967;
        Iterator it2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = c7980.getMethods().iterator();
        while (it3.hasNext()) {
            InterfaceC18444 interfaceC18444 = (InterfaceC18444) it3.next();
            String strM22638 = m22638(interfaceC18444);
            InterfaceC19150 interfaceC19150Mo3570 = interfaceC18444.mo3570();
            if (interfaceC19150Mo3570 == null) {
                c4967 = new C4967(0, 0, 0, 0, new ArrayList(), new ArrayList());
                it = it3;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (InterfaceC22677 interfaceC22677 : interfaceC19150Mo3570.mo3817()) {
                    i++;
                    EnumC0841 enumC0841Mo3975 = interfaceC22677.mo3975();
                    InterfaceC10952 interfaceC10952 = interfaceC22677 instanceof InterfaceC10952 ? (InterfaceC10952) interfaceC22677 : null;
                    InterfaceC8293 reference = interfaceC10952 != null ? interfaceC10952.getReference() : null;
                    if (interfaceC10952 != null && enumC0841Mo3975.f3318 == 0 && (reference instanceof InterfaceC15347)) {
                        i2++;
                        String string = ((InterfaceC15347) reference).getString();
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
                        if (interfaceC10952 != null && enumC0841Mo3975.f3318 == 2 && (reference instanceof InterfaceC18877)) {
                            InterfaceC18877 interfaceC18877 = (InterfaceC18877) reference;
                            if ("I".equals(interfaceC18877.getType())) {
                                String strMo8192 = interfaceC18877.mo8192();
                                if (strMo8192.contains("/R$") || strMo8192.startsWith("LR$")) {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (interfaceC22677 instanceof InterfaceC9541) {
                        long jMo4920 = ((InterfaceC9541) interfaceC22677).mo4920();
                        if (jMo4920 >= 0 && jMo4920 <= 4294967295L) {
                            int i5 = (int) jMo4920;
                            int i6 = (i5 >>> 24) & 255;
                            int i7 = (i5 >>> 16) & 255;
                            if ((i6 == 127 || i6 == 1) && i7 != 0) {
                                i3++;
                            }
                        }
                    }
                    if (enumC0841Mo3975.f3315.startsWith("invoke-")) {
                        i4++;
                        if (reference instanceof InterfaceC5471) {
                            InterfaceC5471 interfaceC5471 = (InterfaceC5471) reference;
                            if (linkedHashSet2.size() < 5) {
                                linkedHashSet2.add(interfaceC5471.mo3566() + "->" + interfaceC5471.getName());
                            }
                        }
                    }
                    it3 = it2;
                }
                it = it3;
                c4967 = new C4967(i, i2, i3, i4, linkedHashSet, linkedHashSet2);
            }
            linkedHashMap.put(strM22638, c4967);
            it3 = it;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m22639(C7980 c7980) {
        InterfaceC10410 interfaceC10410Mo11109;
        C21901 c21901;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC3627 interfaceC3627 : c7980.getFields()) {
            int iMo11110 = interfaceC3627.mo11110();
            if (EnumC15657.STATIC.m36866(iMo11110) && EnumC15657.FINAL.m36866(iMo11110) && (interfaceC10410Mo11109 = interfaceC3627.mo11109()) != null) {
                C11418 c11418 = new C11418();
                try {
                    AbstractC11569.m28462(new C3438(new C22706(c11418)), interfaceC10410Mo11109);
                    String string = c11418.toString();
                    boolean z = string.codePointCount(0, string.length()) > 240;
                    if (z) {
                        string = C8163.m21635(0, string.length(), 240, string);
                    }
                    c21901 = new C21901(string, z);
                } catch (IOException unused) {
                    c21901 = null;
                }
                if (c21901 != null) {
                    linkedHashMap.put(interfaceC3627.getName() + ":" + interfaceC3627.getType(), c21901);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22643(InterfaceC21449 interfaceC21449) {
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m22640(String str, List list) {
        int iLastIndexOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            if (abstractC15440.mo23113()) {
                String name = abstractC15440.getName();
                if (name.equals(str) || ((iLastIndexOf = name.lastIndexOf(45)) != -1 && m22645(iLastIndexOf + 1, name.length(), name) && name.substring(0, iLastIndexOf).equals(str))) {
                    return abstractC15440;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m22651(Context context, C21451 c21451) {
        if (!TextUtils.isEmpty(c21451.m48596())) {
            C7544 c7544M20258 = C7544.m20258();
            String strM48596 = c21451.m48596();
            c7544M20258.getClass();
            C7544.m20260(strM48596, "101492915", "11", "0");
        }
        if (f26670) {
            m22642(context, c21451);
            if (c21451.m48596() != null) {
                try {
                    f26669.invoke(f26668, context, c21451.m48596());
                } catch (Exception e) {
                    C9145.m23516("OpenConfig", "reportQQ exception: " + e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m22650(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22636(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m22646(int i, int i2, CharSequence charSequence) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22645(int i, int i2, String str) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22638(InterfaceC18444 interfaceC18444) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC18444.getParameters().iterator();
        while (it.hasNext()) {
            sb.append(((InterfaceC0098) it.next()).getType());
        }
        return interfaceC18444.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + interfaceC18444.mo3568();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m22647(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return str;
        }
        int iLastIndexOf2 = str.lastIndexOf(46, iLastIndexOf - 1);
        if (iLastIndexOf2 == -1) {
            return m22645(iLastIndexOf + 1, str.length(), str) ? str.substring(0, iLastIndexOf) : str;
        }
        if (!m22645(iLastIndexOf2 + 1, iLastIndexOf, str)) {
            return str;
        }
        return str.substring(0, iLastIndexOf2) + str.substring(iLastIndexOf);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22637(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return (iLastIndexOf == -1 || !m22645(iLastIndexOf + 1, str.length(), str)) ? str : str.substring(0, iLastIndexOf);
    }
}
