package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܶܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16917 {
    /* JADX INFO: renamed from: ܽ */
    public static ArrayList m38496(C19561 c19561) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c19561.m44469().iterator();
        while (it.hasNext()) {
            String name = ((C5738) it.next()).getName();
            if (m38493(name)) {
                arrayList.add(name);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (String str : arrayList2) {
            String strM26414 = C11419.m26414(str);
            String strM26415 = C11419.m26414(strM26414);
            boolean z = true;
            boolean z2 = !strM26415.startsWith("base-master") || "base-master.apk".equals(strM26415);
            if (!"base.apk".equals(strM26414) && !"base-master.apk".equals(strM26414)) {
                z = false;
            }
            arrayList3.add(new C10213(str, z2, z));
        }
        C8150.sort(arrayList3, new C3507());
        return arrayList3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m38490(ArrayList arrayList, boolean[] zArr) {
        ArrayList arrayList2 = new ArrayList();
        int iMin = Math.min(arrayList.size(), zArr.length);
        for (int i = 0; i < iMin; i++) {
            if (zArr[i]) {
                arrayList2.add(((C10213) arrayList.get(i)).m23810());
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m38492(C19561 c19561, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        ArrayList arrayListM38491 = m38491(c19561);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(list);
        String strM38489 = m38489(arrayListM38491);
        if (strM38489 != null) {
            linkedHashSet2.add(strM38489);
        }
        ArrayList arrayList = new ArrayList(linkedHashSet2);
        if (arrayList.size() > linkedHashSet.size()) {
            return arrayList;
        }
        String strM384810 = m38489(m38491(c19561));
        if (strM384810 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (C5738 c5738 : c19561.m44469()) {
                if (m38493(c5738.getName())) {
                    arrayList2.add(c5738);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strM384810 = null;
                    break;
                }
                C5738 c5739 = (C5738) it.next();
                try {
                    if (m38494(c5739, c19561)) {
                        strM384810 = c5739.getName();
                        break;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
        }
        if (strM384810 != null) {
            linkedHashSet.add(strM384810);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m38495(C19561 c19561) {
        boolean z;
        C5738 entry = c19561.getEntry("AndroidManifest.xml");
        if (entry == null) {
            return false;
        }
        XmlResourceParserC12128 xmlResourceParserC12128M38154 = C16820.m38138(c19561.m44452(entry, (C20689) null)).m38154();
        while (true) {
            try {
                int next = xmlResourceParserC12128M38154.next();
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
                    xmlResourceParserC12128M38154.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (z && "manifest".equals(xmlResourceParserC12128M38154.getName())) {
            int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                if ("split".equals(xmlResourceParserC12128M38154.getAttributeName(i))) {
                    xmlResourceParserC12128M38154.close();
                    return false;
                }
            }
            xmlResourceParserC12128M38154.close();
            return true;
        }
        xmlResourceParserC12128M38154.close();
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38493(String str) {
        return str.toLowerCase(Locale.ROOT).endsWith(".apk");
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m38491(C19561 c19561) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c19561.m44469().iterator();
        while (it.hasNext()) {
            String name = ((C5738) it.next()).getName();
            if (m38493(name)) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m38494(C5738 c5738, C19561 c19561) {
        C19561 c19562;
        AbstractC17043 abstractC17043M38693 = null;
        try {
            if (c5738.m12748() == 0) {
                c19562 = c19561.m44463(c5738);
            } else {
                abstractC17043M38693 = C17853.f53278.m38693(".apk");
                abstractC17043M38693.m38651(c19561.m44448(c5738));
                c19562 = new C19561(abstractC17043M38693);
            }
            try {
                boolean zM38495 = m38495(c19562);
                c19562.close();
                if (abstractC17043M38693 != null) {
                    abstractC17043M38693.mo25503();
                }
                return zM38495;
            } catch (Throwable th) {
                try {
                    c19562.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC17043M38693 != null) {
                abstractC17043M38693.mo25503();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38489(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("base.apk".equals(C11419.m26414(str))) {
                return str;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if ("base-master.apk".equals(C11419.m26414(str2))) {
                return str2;
            }
        }
        return null;
    }
}
