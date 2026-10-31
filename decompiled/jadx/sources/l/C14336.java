package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14336 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C23300 f43228 = new C23300(3);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Collection f43231;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43230 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Comparator f43229 = f43228;

    public C14336(Collection collection) {
        this.f43231 = collection;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14336 m34211(Collection collection) {
        return new C14336(collection);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34216(int i) {
        this.f43230 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34217(C3404 c3404) {
        this.f43229 = c3404;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17159 m34215() {
        String[] strArr;
        Collection<String> collection = this.f43231;
        int i = this.f43230;
        Comparator comparator = this.f43229;
        boolean z = i == 1;
        boolean z2 = i == 2;
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                HashMap map = new HashMap();
                C17159 c17159M34212 = m34212("", map, z2);
                for (String str : collection) {
                    int iLastIndexOf = str.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        strArr = new String[]{"", str};
                    } else {
                        strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                    }
                    m34212(strArr[0], map, z2).f52565.add(new C10810(strArr[1], str));
                }
                if (z) {
                    m34213(c17159M34212);
                }
                c17159M34212.m40253(comparator);
                return c17159M34212;
            } catch (ConcurrentModificationException unused) {
                Thread.yield();
            }
        }
        return new C17159(null, "", "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17159 m34212(String str, HashMap map, boolean z) {
        String[] strArr;
        C17159 c17159;
        C17159 c171510;
        C17159 c171511 = (C17159) map.get(str);
        if (c171511 != null) {
            return c171511;
        }
        if (str.isEmpty()) {
            c171510 = new C17159(null, "", str);
        } else {
            if (z) {
                C17159 c17159M34212 = m34212("", map, true);
                c17159 = new C17159(c17159M34212, str.replace('/', '.'), str);
                c17159M34212.f52564.add(c17159);
            } else {
                int iLastIndexOf = str.lastIndexOf(47);
                if (iLastIndexOf == -1) {
                    strArr = new String[]{"", str};
                } else {
                    strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                }
                C17159 c17159M34213 = m34212(strArr[0], map, false);
                c17159 = new C17159(c17159M34213, strArr[1], str);
                c17159M34213.f52564.add(c17159);
            }
            c171510 = c17159;
        }
        map.put(str, c171510);
        return c171510;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34210(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m34214(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34213(C17159 c17159) {
        if (c17159.f52568 != null && c17159.f52564.size() == 1 && c17159.f52565.isEmpty()) {
            C17159 c171510 = (C17159) c17159.f52564.remove(0);
            c17159.f52566 += "." + c171510.f52566;
            c17159.f52567 = c171510.f52567;
            c17159.f52564.addAll(c171510.f52564);
            c17159.f52565.addAll(c171510.f52565);
            Iterator it = c17159.f52564.iterator();
            while (it.hasNext()) {
                ((C17159) it.next()).f52568 = c17159;
            }
            Iterator it2 = c17159.f52565.iterator();
            while (it2.hasNext()) {
                ((C10810) it2.next()).getClass();
            }
            m34213(c17159);
        }
        Iterator it3 = c17159.f52564.iterator();
        while (it3.hasNext()) {
            m34213((C17159) it3.next());
        }
    }
}
