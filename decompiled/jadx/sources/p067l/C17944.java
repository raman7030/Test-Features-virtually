package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܽۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6XI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17944 {
    /* JADX INFO: renamed from: ֫ */
    public static String m40803(String str, ArrayList arrayList) throws C15223 {
        int i = 0;
        if (arrayList.size() == 1 && "write_target".equals(((C23941) arrayList.get(0)).f76062)) {
            return ((C23941) arrayList.get(0)).f76063;
        }
        ArrayList<C9189> arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C23941 c23941 = (C23941) arrayList.get(i2);
            String str2 = c23941.f76062;
            String str3 = c23941.f76061;
            if (!"replace_match".equals(str2) && !"insert_before_match".equals(str2) && !"insert_after_match".equals(str2)) {
                throw new C15223(EnumC3863.INVALID_MODE, i2, -1);
            }
            int iIndexOf = str.indexOf(str3);
            if (iIndexOf < 0) {
                throw new C15223(EnumC3863.MATCH_NOT_FOUND, i2, -1);
            }
            if (str.indexOf(str3, iIndexOf + 1) >= 0) {
                throw new C15223(EnumC3863.MATCH_AMBIGUOUS, i2, -1);
            }
            arrayList2.add(new C9189(i2, c23941, iIndexOf, str3.length() + iIndexOf));
        }
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            C9189 c9189 = (C9189) arrayList2.get(i3);
            i3++;
            for (int i4 = i3; i4 < arrayList2.size(); i4++) {
                C9189 c91810 = (C9189) arrayList2.get(i4);
                if (c9189.f24857 < c91810.f24856 && c91810.f24857 < c9189.f24856) {
                    throw new C15223(EnumC3863.MATCH_OVERLAP, c91810.f24855, c9189.f24855);
                }
            }
        }
        ArrayList<C12581> arrayList3 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        for (C9189 c91811 : arrayList2) {
            C23941 c23942 = c91811.f24854;
            String str4 = c23942.f76063;
            String str5 = c23942.f76062;
            int i5 = c91811.f24856;
            int i6 = c91811.f24857;
            if ("replace_match".equals(str5)) {
                arrayList3.add(new C12581(i6, i5, str4));
            } else {
                if ("insert_before_match".equals(str5)) {
                    i5 = i6;
                }
                ((ArrayList) C15525.computeIfAbsent(treeMap, Integer.valueOf(i5), new C14929(2))).add(str4);
            }
        }
        C8150.sort(arrayList3, C10162.comparingInt(new C13213()));
        StringBuilder sb = new StringBuilder(str.length());
        for (C12581 c12581 : arrayList3) {
            m40804(sb, str, i, c12581.f35342, treeMap);
            sb.append(c12581.f35343);
            i = c12581.f35341;
        }
        m40804(sb, str, i, str.length(), treeMap);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40804(StringBuilder sb, String str, int i, int i2, TreeMap treeMap) {
        while (i < i2) {
            ArrayList arrayList = (ArrayList) treeMap.remove(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                }
            }
            sb.append(str.charAt(i));
            i++;
        }
        ArrayList arrayList2 = (ArrayList) treeMap.remove(Integer.valueOf(i2));
        if (arrayList2 == null) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
    }
}
