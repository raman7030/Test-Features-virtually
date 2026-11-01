package p067l;

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
public class C15724 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMapC12768 f45560a = new ConcurrentMapC12768(16, 0.75f, 2);

    /* JADX INFO: renamed from: b */
    public static final C7916 f45561b = new C7916();

    /* JADX INFO: renamed from: c */
    public static final C15724 f45562c = new C15724();

    /* JADX INFO: renamed from: c */
    public String mo35780c(InterfaceC11901 interfaceC11901, long j, EnumC21999 enumC21999, Locale locale) {
        Object objM35778a = m35778a(interfaceC11901, locale);
        if (objM35778a instanceof C13714) {
            return ((C13714) objM35778a).m31181a(j, enumC21999);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public String mo35779b(InterfaceC4997 interfaceC4997, InterfaceC11901 interfaceC11901, long j, EnumC21999 enumC21999, Locale locale) {
        if (interfaceC4997 == C10361.f28676c || !(interfaceC11901 instanceof EnumC19947)) {
            return mo35780c(interfaceC11901, j, enumC21999, locale);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Iterator mo35782e(InterfaceC11901 interfaceC11901, EnumC21999 enumC21999, Locale locale) {
        List list;
        Object objM35778a = m35778a(interfaceC11901, locale);
        if (!(objM35778a instanceof C13714) || (list = (List) ((HashMap) ((C13714) objM35778a).f38708b).get(enumC21999)) == null) {
            return null;
        }
        return list.iterator();
    }

    /* JADX INFO: renamed from: d */
    public Iterator mo35781d(InterfaceC4997 interfaceC4997, InterfaceC11901 interfaceC11901, EnumC21999 enumC21999, Locale locale) {
        if (interfaceC4997 == C10361.f28676c || !(interfaceC11901 instanceof EnumC19947)) {
            return mo35782e(interfaceC11901, enumC21999, locale);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Object m35778a(InterfaceC11901 interfaceC11901, Locale locale) {
        Object c13714;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(interfaceC11901, locale);
        ConcurrentMapC12768 concurrentMapC12768 = f45560a;
        V v = concurrentMapC12768.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (interfaceC11901 == EnumC19947.ERA) {
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
                map.put(EnumC21999.FULL, map2);
                map.put(EnumC21999.SHORT, map2);
                map.put(EnumC21999.NARROW, map3);
            }
            c13714 = new C13714(map);
        } else if (interfaceC11901 == EnumC19947.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j2 = 1; j2 <= length; j2++) {
                String strM40307i = AbstractC17736.m40307i(j2, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j2), strM40307i);
                linkedHashMap2.put(Long.valueOf(j2), strM40307i.substring(0, Character.charCount(strM40307i.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j2), AbstractC17736.m40307i(j2, "LLL", locale));
            }
            if (length > 0) {
                map.put(EnumC21999.FULL_STANDALONE, linkedHashMap);
                map.put(EnumC21999.NARROW_STANDALONE, linkedHashMap2);
                map.put(EnumC21999.SHORT_STANDALONE, linkedHashMap3);
                map.put(EnumC21999.FULL, linkedHashMap);
                map.put(EnumC21999.NARROW, linkedHashMap2);
                map.put(EnumC21999.SHORT, linkedHashMap3);
            }
            c13714 = new C13714(map);
        } else if (interfaceC11901 == EnumC19947.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j3 = 1; j3 <= length2; j3++) {
                String strM40306h = AbstractC17736.m40306h(j3, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j3), strM40306h);
                Long lValueOf2 = Long.valueOf(j3);
                if (!z) {
                    strSubstring = strM40306h.substring(0, Character.charCount(strM40306h.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strM40306h.codePointBefore(strM40306h.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j3), AbstractC17736.m40306h(j3, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(EnumC21999.FULL_STANDALONE, linkedHashMap4);
                map.put(EnumC21999.NARROW_STANDALONE, linkedHashMap5);
                map.put(EnumC21999.SHORT_STANDALONE, linkedHashMap6);
                map.put(EnumC21999.FULL, linkedHashMap4);
                map.put(EnumC21999.NARROW, linkedHashMap5);
                map.put(EnumC21999.SHORT, linkedHashMap6);
            }
            c13714 = new C13714(map);
        } else if (interfaceC11901 == EnumC19947.AMPM_OF_DAY) {
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
                map.put(EnumC21999.FULL, map4);
                map.put(EnumC21999.SHORT, map4);
                map.put(EnumC21999.NARROW, map5);
            }
            c13714 = new C13714(map);
        } else {
            c13714 = "";
        }
        concurrentMapC12768.putIfAbsent(simpleImmutableEntry, c13714);
        return concurrentMapC12768.get(simpleImmutableEntry);
    }
}
