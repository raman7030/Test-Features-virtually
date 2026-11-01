package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAR2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11721 {
    /* JADX INFO: renamed from: ۧ */
    public static HashMap m26927() {
        C15348 c15348M20933;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        List<AbstractC17043> listMo25500 = C17853.f53284.m38684("syntax/custom").mo25500(true);
        HashSet hashSet2 = new HashSet();
        for (AbstractC17043 abstractC17043 : listMo25500) {
            if (abstractC17043.mo25093()) {
                int i = C9038.f24535;
                String name = abstractC17043.getName();
                String str = null;
                if (name.endsWith(".cache")) {
                    String strM38720 = C17073.m38720(6, 0, name);
                    String lowerCase = strM38720.toLowerCase(Locale.ROOT);
                    if (strM38720.equals(lowerCase)) {
                        str = lowerCase;
                    }
                }
                if (str != null) {
                    hashSet2.add(str);
                }
            }
        }
        for (AbstractC17043 abstractC17044 : listMo25500) {
            if (abstractC17044.mo25093() && abstractC17044.getName().endsWith(".cache") && (c15348M20933 = C9038.m20933(abstractC17044)) != null) {
                String str2 = c15348M20933.f43806;
                if (str2 != null) {
                    hashSet.add(str2);
                    map.remove(str2);
                    map2.remove(str2);
                } else {
                    C16689 c16689 = c15348M20933.f43807;
                    String lowerCase2 = c16689.m37815().toLowerCase(Locale.ROOT);
                    if (!hashSet.contains(lowerCase2) && (!hashSet2.contains(lowerCase2) || abstractC17044.getName().equals(C9038.m20913(abstractC17044.m38672(), lowerCase2).getName()))) {
                        C16689 c166810 = (C16689) map.get(lowerCase2);
                        AbstractC17043 abstractC17045 = (AbstractC17043) map2.get(lowerCase2);
                        if (c166810 != null) {
                            int iM26922 = m26922(abstractC17044, c16689);
                            int iM26923 = m26922(abstractC17045, c166810);
                            if (iM26922 != iM26923) {
                                if (iM26922 > iM26923) {
                                }
                            } else if (abstractC17044.getName().compareTo(abstractC17045.getName()) < 0) {
                            }
                        }
                        map.put(lowerCase2, c16689);
                        map2.put(lowerCase2, abstractC17044);
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m26922(AbstractC17043 abstractC17043, C16689 c16689) {
        String name = abstractC17043.getName();
        if (name.equals(C9038.m20913(abstractC17043.m38672(), c16689.m37815()).getName())) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c16689.m37815());
        sb.append(".cache");
        return name.equals(sb.toString()) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m26923() {
        return C9038.m20942();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16689 m26924(String str, String str2) {
        C20597.m46552(str);
        C18425 c18425 = new C18425(str2);
        String strM46558 = C20597.m46558(str2, str);
        C16151 c16151 = new C16151(new C13618(strM46558, new RunnableC3043()));
        c16151.m45725(c18425);
        C16208 c16208 = new C16208(new C4150(c16151));
        c16208.m45725(c18425);
        C16689 c16689 = new C16689(c16208.m36921());
        c16689.m37817();
        C24320.m53658(c16689);
        C9038.m20921(c16689, strM46558);
        return c16689;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26925(AbstractC17043 abstractC17043) {
        C9038.m20923(abstractC17043);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26926(C16689 c16689) {
        return C9038.m20939(c16689);
    }
}
