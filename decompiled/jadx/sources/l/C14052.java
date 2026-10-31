package l;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C14052 {
    public static final ConcurrentMapC10942 a = new ConcurrentMapC10942(16, 0.75f, 2);
    public static final C5837 b = new C5837();
    public static final C14052 c = new C14052();

    public String c(InterfaceC10030 interfaceC10030, long j, EnumC20655 enumC20655, Locale locale) {
        Object objA = a(interfaceC10030, locale);
        if (objA instanceof C11937) {
            return ((C11937) objA).a(j, enumC20655);
        }
        return null;
    }

    public String b(InterfaceC2765 interfaceC2765, InterfaceC10030 interfaceC10030, long j, EnumC20655 enumC20655, Locale locale) {
        if (interfaceC2765 == C8409.c || !(interfaceC10030 instanceof EnumC18496)) {
            return c(interfaceC10030, j, enumC20655, locale);
        }
        return null;
    }

    public Iterator e(InterfaceC10030 interfaceC10030, EnumC20655 enumC20655, Locale locale) {
        List list;
        Object objA = a(interfaceC10030, locale);
        if (!(objA instanceof C11937) || (list = (List) ((HashMap) ((C11937) objA).b).get(enumC20655)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(InterfaceC2765 interfaceC2765, InterfaceC10030 interfaceC10030, EnumC20655 enumC20655, Locale locale) {
        if (interfaceC2765 == C8409.c || !(interfaceC10030 instanceof EnumC18496)) {
            return e(interfaceC10030, enumC20655, locale);
        }
        return null;
    }

    public static Object a(InterfaceC10030 interfaceC10030, Locale locale) {
        Object c11937;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(interfaceC10030, locale);
        ConcurrentMapC10942 concurrentMapC10942 = a;
        V v = concurrentMapC10942.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (interfaceC10030 == EnumC18496.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(Long.valueOf(j), eras[i]);
                    Long lValueOf = Long.valueOf(j);
                    String str = eras[i];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(EnumC20655.FULL, map2);
                map.put(EnumC20655.SHORT, map2);
                map.put(EnumC20655.NARROW, map3);
            }
            c11937 = new C11937(map);
        } else if (interfaceC10030 == EnumC18496.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j2 = 1; j2 <= length; j2++) {
                String strI = AbstractC16169.i(j2, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j2), strI);
                linkedHashMap2.put(Long.valueOf(j2), strI.substring(0, Character.charCount(strI.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j2), AbstractC16169.i(j2, "LLL", locale));
            }
            if (length > 0) {
                map.put(EnumC20655.FULL_STANDALONE, linkedHashMap);
                map.put(EnumC20655.NARROW_STANDALONE, linkedHashMap2);
                map.put(EnumC20655.SHORT_STANDALONE, linkedHashMap3);
                map.put(EnumC20655.FULL, linkedHashMap);
                map.put(EnumC20655.NARROW, linkedHashMap2);
                map.put(EnumC20655.SHORT, linkedHashMap3);
            }
            c11937 = new C11937(map);
        } else if (interfaceC10030 == EnumC18496.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j3 = 1; j3 <= length2; j3++) {
                String strH = AbstractC16169.h(j3, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j3), strH);
                Long lValueOf2 = Long.valueOf(j3);
                if (!z) {
                    strSubstring = strH.substring(0, Character.charCount(strH.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strH.codePointBefore(strH.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j3), AbstractC16169.h(j3, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(EnumC20655.FULL_STANDALONE, linkedHashMap4);
                map.put(EnumC20655.NARROW_STANDALONE, linkedHashMap5);
                map.put(EnumC20655.SHORT_STANDALONE, linkedHashMap6);
                map.put(EnumC20655.FULL, linkedHashMap4);
                map.put(EnumC20655.NARROW, linkedHashMap5);
                map.put(EnumC20655.SHORT, linkedHashMap6);
            }
            c11937 = new C11937(map);
        } else if (interfaceC10030 == EnumC18496.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                if (!amPmStrings[i2].isEmpty()) {
                    long j4 = i2;
                    map4.put(Long.valueOf(j4), amPmStrings[i2]);
                    Long lValueOf3 = Long.valueOf(j4);
                    String str2 = amPmStrings[i2];
                    map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(EnumC20655.FULL, map4);
                map.put(EnumC20655.SHORT, map4);
                map.put(EnumC20655.NARROW, map5);
            }
            c11937 = new C11937(map);
        } else {
            c11937 = "";
        }
        concurrentMapC10942.putIfAbsent(simpleImmutableEntry, c11937);
        return concurrentMapC10942.get(simpleImmutableEntry);
    }
}
