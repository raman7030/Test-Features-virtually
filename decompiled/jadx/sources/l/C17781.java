package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17781 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f54392;

    static {
        ArrayList arrayList = new ArrayList(5);
        f54392 = arrayList;
        arrayList.add(new C16369(".ass", "text/x-ssa"));
        arrayList.add(new C16369(".ssa", "text/x-ssa"));
        arrayList.add(new C16369(".srt", "application/x-subrip"));
        arrayList.add(new C16369(".vtt", "text/vtt"));
        arrayList.add(new C16369(".ttml", "application/ttml+xml"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m41660(InterfaceC17889 interfaceC17889, AbstractC13921 abstractC13921) {
        C16369 c16369M41662;
        boolean zEquals;
        String strM41663 = m41663(interfaceC17889.getName());
        final boolean zMo13919 = abstractC13921.mo13919();
        ArrayList<C10726> arrayList = new ArrayList();
        for (InterfaceC17889 interfaceC178810 : abstractC13921.mo7637(interfaceC17889.getParent(), true)) {
            if (interfaceC178810.mo36969() && !interfaceC17889.getPath().equals(interfaceC178810.getPath()) && (c16369M41662 = m41662(interfaceC178810.getName())) != null) {
                String strM41664 = m41663(interfaceC178810.getName());
                String strM38531 = c16369M41662.m38531();
                if (zMo13919) {
                    zEquals = strM41663.equalsIgnoreCase(strM41664);
                } else {
                    zEquals = strM41663.equals(strM41664);
                }
                arrayList.add(new C10726(interfaceC178810, strM38531, zEquals, c16369M41662.m38532()));
            }
        }
        C6083.sort(arrayList, new Comparator() { // from class: l.۟ۙۜ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C10726 c10726 = (C10726) obj;
                C10726 c10727 = (C10726) obj2;
                if (c10726.m26912() != c10727.m26912()) {
                    return c10726.m26912() ? -1 : 1;
                }
                int iCompare = Integer.compare(c10726.m26914(), c10727.m26914());
                if (iCompare != 0) {
                    return iCompare;
                }
                String name = c10726.m26911().getName();
                boolean z = zMo13919;
                if (z) {
                    name = name.toLowerCase(Locale.ROOT);
                }
                String name2 = c10727.m26911().getName();
                if (z) {
                    name2 = name2.toLowerCase(Locale.ROOT);
                }
                int iCompareTo = name.compareTo(name2);
                return iCompareTo != 0 ? iCompareTo : c10726.m26911().getPath().compareTo(c10727.m26911().getPath());
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C10726 c10726 : arrayList) {
            arrayList2.add(new C1553(c10726.m26911(), c10726.m26913()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1553 m41661(List list, InterfaceC17889 interfaceC17889, boolean z) {
        boolean zEquals;
        String strM41663 = m41663(interfaceC17889.getName());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1553 c1553 = (C1553) it.next();
            String strM41664 = m41663(c1553.m5311().getName());
            if (z) {
                zEquals = strM41663.equalsIgnoreCase(strM41664);
            } else {
                zEquals = strM41663.equals(strM41664);
            }
            if (zEquals) {
                return c1553;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m41663(String str) {
        String strM36487 = AbstractC15440.m36487(str);
        return strM36487.isEmpty() ? str : str.substring(0, str.length() - strM36487.length());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16369 m41662(String str) {
        String lowerCase = AbstractC15440.m36487(str).toLowerCase(Locale.ROOT);
        ArrayList arrayList = f54392;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C16369 c16369 = (C16369) arrayList.get(i);
            if (c16369.m38533().equals(lowerCase)) {
                return C16369.m38530(c16369, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41659(String str) {
        C16369 c16369M41662 = m41662(str);
        if (c16369M41662 == null) {
            return null;
        }
        return c16369M41662.m38531();
    }
}
