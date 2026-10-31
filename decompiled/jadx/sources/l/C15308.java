package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15308 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m36334(C18090 c18090) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c18090.m42210().iterator();
        while (it.hasNext()) {
            String name = ((C3545) it.next()).getName();
            if (m36331(name)) {
                arrayList.add(name);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (String str : arrayList2) {
            String strM24404 = C9523.m24404(str);
            String strM24405 = C9523.m24404(strM24404);
            boolean z = true;
            boolean z2 = !strM24405.startsWith("base-master") || "base-master.apk".equals(strM24405);
            if (!"base.apk".equals(strM24404) && !"base-master.apk".equals(strM24404)) {
                z = false;
            }
            arrayList3.add(new C8254(str, z2, z));
        }
        C6083.sort(arrayList3, new C1198());
        return arrayList3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36328(ArrayList arrayList, boolean[] zArr) {
        ArrayList arrayList2 = new ArrayList();
        int iMin = Math.min(arrayList.size(), zArr.length);
        for (int i = 0; i < iMin; i++) {
            if (zArr[i]) {
                arrayList2.add(((C8254) arrayList.get(i)).m21840());
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36330(C18090 c18090, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        ArrayList arrayListM36329 = m36329(c18090);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(list);
        String strM36327 = m36327(arrayListM36329);
        if (strM36327 != null) {
            linkedHashSet2.add(strM36327);
        }
        ArrayList arrayList = new ArrayList(linkedHashSet2);
        if (arrayList.size() > linkedHashSet.size()) {
            return arrayList;
        }
        String strM36328 = m36327(m36329(c18090));
        if (strM36328 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (C3545 c3545 : c18090.m42210()) {
                if (m36331(c3545.getName())) {
                    arrayList2.add(c3545);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strM36328 = null;
                    break;
                }
                C3545 c3546 = (C3545) it.next();
                try {
                    if (m36332(c3546, c18090)) {
                        strM36328 = c3546.getName();
                        break;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
        }
        if (strM36328 != null) {
            linkedHashSet.add(strM36328);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m36333(C18090 c18090) {
        boolean z;
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null) {
            return false;
        }
        XmlResourceParserC10269 xmlResourceParserC10269M35994 = C15206.m35978(c18090.m42193(entry, (C19277) null)).m35994();
        while (true) {
            try {
                int next = xmlResourceParserC10269M35994.next();
                if (next != 1) {
                    if (next == 2) {
                        z = true;
                        break;
                    }
                    if (next == 3) {
                    }
                }
                z = false;
                break;
            } catch (Throwable th) {
                try {
                    xmlResourceParserC10269M35994.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (z && "manifest".equals(xmlResourceParserC10269M35994.getName())) {
            int attributeCount = xmlResourceParserC10269M35994.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                if ("split".equals(xmlResourceParserC10269M35994.getAttributeName(i))) {
                    xmlResourceParserC10269M35994.close();
                    return false;
                }
            }
            xmlResourceParserC10269M35994.close();
            return true;
        }
        xmlResourceParserC10269M35994.close();
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36331(String str) {
        return str.toLowerCase(Locale.ROOT).endsWith(".apk");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36329(C18090 c18090) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c18090.m42210().iterator();
        while (it.hasNext()) {
            String name = ((C3545) it.next()).getName();
            if (m36331(name)) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36332(C3545 c3545, C18090 c18090) {
        C18090 c18091;
        AbstractC15440 abstractC15440M36535 = null;
        try {
            if (c3545.m10767() == 0) {
                c18091 = c18090.m42204(c3545);
            } else {
                abstractC15440M36535 = C16293.f50111.m36535(".apk");
                abstractC15440M36535.m36493(c18090.m42189(c3545));
                c18091 = new C18090(abstractC15440M36535);
            }
            try {
                boolean zM36333 = m36333(c18091);
                c18091.close();
                if (abstractC15440M36535 != null) {
                    abstractC15440M36535.mo23552();
                }
                return zM36333;
            } catch (Throwable th) {
                try {
                    c18091.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC15440M36535 != null) {
                abstractC15440M36535.mo23552();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36327(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("base.apk".equals(C9523.m24404(str))) {
                return str;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if ("base-master.apk".equals(C9523.m24404(str2))) {
                return str2;
            }
        }
        return null;
    }
}
