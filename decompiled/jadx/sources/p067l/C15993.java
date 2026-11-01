package p067l;

import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15993 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C24513 f46320 = new C24513(3);

    /* JADX INFO: renamed from: ܽ */
    public final Collection f46323;

    /* JADX INFO: renamed from: ۧ */
    public int f46322 = 0;

    /* JADX INFO: renamed from: ֫ */
    public Comparator f46321 = f46320;

    public C15993(Collection collection) {
        this.f46323 = collection;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15993 m36344(Collection collection) {
        return new C15993(collection);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36349(int i) {
        this.f46322 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36350(C5604 c5604) {
        this.f46321 = c5604;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18676 m36348() {
        String[] strArr;
        Collection<String> collection = this.f46323;
        int i = this.f46322;
        Comparator comparator = this.f46321;
        boolean z = i == 1;
        boolean z2 = i == 2;
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                HashMap map = new HashMap();
                C18676 c18676M36345 = m36345("", map, z2);
                for (String str : collection) {
                    int iLastIndexOf = str.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        strArr = new String[]{"", str};
                    } else {
                        strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                    }
                    m36345(strArr[0], map, z2).f55748.add(new C12642(strArr[1], str));
                }
                if (z) {
                    m36346(c18676M36345);
                }
                c18676M36345.m42498(comparator);
                return c18676M36345;
            } catch (ConcurrentModificationException unused) {
                Thread.yield();
            }
        }
        return new C18676(null, "", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18676 m36345(String str, HashMap map, boolean z) {
        String[] strArr;
        C18676 c18676;
        C18676 c18677;
        C18676 c18678 = (C18676) map.get(str);
        if (c18678 != null) {
            return c18678;
        }
        if (str.isEmpty()) {
            c18677 = new C18676(null, "", str);
        } else {
            if (z) {
                C18676 c18676M36345 = m36345("", map, true);
                c18676 = new C18676(c18676M36345, str.replace('/', '.'), str);
                c18676M36345.f55747.add(c18676);
            } else {
                int iLastIndexOf = str.lastIndexOf(47);
                if (iLastIndexOf == -1) {
                    strArr = new String[]{"", str};
                } else {
                    strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                }
                C18676 c18676M36346 = m36345(strArr[0], map, false);
                c18676 = new C18676(c18676M36346, strArr[1], str);
                c18676M36346.f55747.add(c18676);
            }
            c18677 = c18676;
        }
        map.put(str, c18677);
        return c18677;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m36343(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m36347(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36346(C18676 c18676) {
        if (c18676.f55751 != null && c18676.f55747.size() == 1 && c18676.f55748.isEmpty()) {
            C18676 c18677 = (C18676) c18676.f55747.remove(0);
            c18676.f55749 += "." + c18677.f55749;
            c18676.f55750 = c18677.f55750;
            c18676.f55747.addAll(c18677.f55747);
            c18676.f55748.addAll(c18677.f55748);
            Iterator it = c18676.f55747.iterator();
            while (it.hasNext()) {
                ((C18676) it.next()).f55751 = c18676;
            }
            Iterator it2 = c18676.f55748.iterator();
            while (it2.hasNext()) {
                ((C12642) it2.next()).getClass();
            }
            m36346(c18676);
        }
        Iterator it3 = c18676.f55747.iterator();
        while (it3.hasNext()) {
            m36346((C18676) it3.next());
        }
    }
}
