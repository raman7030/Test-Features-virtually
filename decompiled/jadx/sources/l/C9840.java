package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAR2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9840 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m24912() {
        C13657 c13657M18976;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        List<AbstractC15440> listMo23549 = C16293.f50117.m36526("syntax/custom").mo23549(true);
        HashSet hashSet2 = new HashSet();
        for (AbstractC15440 abstractC15440 : listMo23549) {
            if (abstractC15440.mo23119()) {
                int i = C7017.f21654;
                String name = abstractC15440.getName();
                String str = null;
                if (name.endsWith(".cache")) {
                    String strM36561 = C15472.m36561(6, 0, name);
                    String lowerCase = strM36561.toLowerCase(Locale.ROOT);
                    if (strM36561.equals(lowerCase)) {
                        str = lowerCase;
                    }
                }
                if (str != null) {
                    hashSet2.add(str);
                }
            }
        }
        for (AbstractC15440 abstractC15441 : listMo23549) {
            if (abstractC15441.mo23119() && abstractC15441.getName().endsWith(".cache") && (c13657M18976 = C7017.m18976(abstractC15441)) != null) {
                String str2 = c13657M18976.f40725;
                if (str2 != null) {
                    hashSet.add(str2);
                    map.remove(str2);
                    map2.remove(str2);
                } else {
                    C15068 c15068 = c13657M18976.f40726;
                    String lowerCase2 = c15068.m35657().toLowerCase(Locale.ROOT);
                    if (!hashSet.contains(lowerCase2) && (!hashSet2.contains(lowerCase2) || abstractC15441.getName().equals(C7017.m18956(abstractC15441.m36514(), lowerCase2).getName()))) {
                        C15068 c15069 = (C15068) map.get(lowerCase2);
                        AbstractC15440 abstractC15442 = (AbstractC15440) map2.get(lowerCase2);
                        if (c15069 != null) {
                            int iM24907 = m24907(abstractC15441, c15068);
                            int iM24908 = m24907(abstractC15442, c15069);
                            if (iM24907 != iM24908) {
                                if (iM24907 > iM24908) {
                                }
                            } else if (abstractC15441.getName().compareTo(abstractC15442.getName()) < 0) {
                            }
                        }
                        map.put(lowerCase2, c15068);
                        map2.put(lowerCase2, abstractC15441);
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24907(AbstractC15440 abstractC15440, C15068 c15068) {
        String name = abstractC15440.getName();
        if (name.equals(C7017.m18956(abstractC15440.m36514(), c15068.m35657()).getName())) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c15068.m35657());
        sb.append(".cache");
        return name.equals(sb.toString()) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m24908() {
        return C7017.m18985();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15068 m24909(String str, String str2) {
        C19180.m44257(str);
        C16894 c16894 = new C16894(str2);
        String strM44263 = C19180.m44263(str2, str);
        C14502 c14502 = new C14502(new C11837(strM44263, new RunnableC0709()));
        c14502.m43456(c16894);
        C14562 c14562 = new C14562(new C1875(c14502));
        c14562.m43456(c16894);
        C15068 c15068 = new C15068(c14562.m34772());
        c15068.m35659();
        C23097.m51264(c15068);
        C7017.m18964(c15068, strM44263);
        return c15068;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24910(AbstractC15440 abstractC15440) {
        C7017.m18966(abstractC15440);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24911(C15068 c15068) {
        return C7017.m18982(c15068);
    }
}
