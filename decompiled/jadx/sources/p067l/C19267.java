package p067l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19267 {

    /* JADX INFO: renamed from: ֫ */
    public static final ArrayList f57586;

    static {
        ArrayList arrayList = new ArrayList(5);
        f57586 = arrayList;
        arrayList.add(new C17925(".ass", "text/x-ssa"));
        arrayList.add(new C17925(".ssa", "text/x-ssa"));
        arrayList.add(new C17925(".srt", "application/x-subrip"));
        arrayList.add(new C17925(".vtt", "text/vtt"));
        arrayList.add(new C17925(".ttml", "application/ttml+xml"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m43906(InterfaceC19370 interfaceC19370, AbstractC15599 abstractC15599) {
        C17925 c17925M43908;
        boolean zEquals;
        String strM43909 = m43909(interfaceC19370.getName());
        final boolean zMo15799 = abstractC15599.mo15799();
        ArrayList<C12562> arrayList = new ArrayList();
        for (InterfaceC19370 interfaceC19371 : abstractC15599.mo9708(interfaceC19370.getParent(), true)) {
            if (interfaceC19371.mo39135() && !interfaceC19370.getPath().equals(interfaceC19371.getPath()) && (c17925M43908 = m43908(interfaceC19371.getName())) != null) {
                String strM439010 = m43909(interfaceC19371.getName());
                String strM40748 = c17925M43908.m40748();
                if (zMo15799) {
                    zEquals = strM43909.equalsIgnoreCase(strM439010);
                } else {
                    zEquals = strM43909.equals(strM439010);
                }
                arrayList.add(new C12562(interfaceC19371, strM40748, zEquals, c17925M43908.m40749()));
            }
        }
        C8150.sort(arrayList, new Comparator() { // from class: l.۟ۙۜ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C12562 c12562 = (C12562) obj;
                C12562 c12563 = (C12562) obj2;
                if (c12562.m28952() != c12563.m28952()) {
                    return c12562.m28952() ? -1 : 1;
                }
                int iCompare = Integer.compare(c12562.m28954(), c12563.m28954());
                if (iCompare != 0) {
                    return iCompare;
                }
                String name = c12562.m28951().getName();
                boolean z = zMo15799;
                if (z) {
                    name = name.toLowerCase(Locale.ROOT);
                }
                String name2 = c12563.m28951().getName();
                if (z) {
                    name2 = name2.toLowerCase(Locale.ROOT);
                }
                int iCompareTo = name.compareTo(name2);
                return iCompareTo != 0 ? iCompareTo : c12562.m28951().getPath().compareTo(c12563.m28951().getPath());
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (C12562 c12562 : arrayList) {
            arrayList2.add(new C3844(c12562.m28951(), c12562.m28953()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3844 m43907(List list, InterfaceC19370 interfaceC19370, boolean z) {
        boolean zEquals;
        String strM43909 = m43909(interfaceC19370.getName());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3844 c3844 = (C3844) it.next();
            String strM439010 = m43909(c3844.m7540().getName());
            if (z) {
                zEquals = strM43909.equalsIgnoreCase(strM439010);
            } else {
                zEquals = strM43909.equals(strM439010);
            }
            if (zEquals) {
                return c3844;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m43909(String str) {
        String strM38645 = AbstractC17043.m38645(str);
        return strM38645.isEmpty() ? str : str.substring(0, str.length() - strM38645.length());
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17925 m43908(String str) {
        String lowerCase = AbstractC17043.m38645(str).toLowerCase(Locale.ROOT);
        ArrayList arrayList = f57586;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C17925 c17925 = (C17925) arrayList.get(i);
            if (c17925.m40750().equals(lowerCase)) {
                return C17925.m40747(c17925, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m43905(String str) {
        C17925 c17925M43908 = m43908(str);
        if (c17925M43908 == null) {
            return null;
        }
        return c17925M43908.m40748();
    }
}
