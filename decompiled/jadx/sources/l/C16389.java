package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܽۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6XI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16389 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38586(String str, ArrayList arrayList) throws C13526 {
        int i = 0;
        if (arrayList.size() == 1 && "write_target".equals(((C22699) arrayList.get(0)).f73336)) {
            return ((C22699) arrayList.get(0)).f73337;
        }
        ArrayList<C7177> arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C22699 c22699 = (C22699) arrayList.get(i2);
            String str2 = c22699.f73336;
            String str3 = c22699.f73335;
            if (!"replace_match".equals(str2) && !"insert_before_match".equals(str2) && !"insert_after_match".equals(str2)) {
                throw new C13526(EnumC1573.INVALID_MODE, i2, -1);
            }
            int iIndexOf = str.indexOf(str3);
            if (iIndexOf < 0) {
                throw new C13526(EnumC1573.MATCH_NOT_FOUND, i2, -1);
            }
            if (str.indexOf(str3, iIndexOf + 1) >= 0) {
                throw new C13526(EnumC1573.MATCH_AMBIGUOUS, i2, -1);
            }
            arrayList2.add(new C7177(i2, c22699, iIndexOf, str3.length() + iIndexOf));
        }
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            C7177 c7177 = (C7177) arrayList2.get(i3);
            i3++;
            for (int i4 = i3; i4 < arrayList2.size(); i4++) {
                C7177 c7178 = (C7177) arrayList2.get(i4);
                if (c7177.f21977 < c7178.f21976 && c7178.f21977 < c7177.f21976) {
                    throw new C13526(EnumC1573.MATCH_OVERLAP, c7178.f21975, c7177.f21975);
                }
            }
        }
        ArrayList<C10746> arrayList3 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        for (C7177 c7179 : arrayList2) {
            C22699 c226910 = c7179.f21974;
            String str4 = c226910.f73337;
            String str5 = c226910.f73336;
            int i5 = c7179.f21976;
            int i6 = c7179.f21977;
            if ("replace_match".equals(str5)) {
                arrayList3.add(new C10746(i6, i5, str4));
            } else {
                if ("insert_before_match".equals(str5)) {
                    i5 = i6;
                }
                ((ArrayList) C13843.computeIfAbsent(treeMap, Integer.valueOf(i5), new C13216(2))).add(str4);
            }
        }
        C6083.sort(arrayList3, C8200.comparingInt(new C11411()));
        StringBuilder sb = new StringBuilder(str.length());
        for (C10746 c10746 : arrayList3) {
            m38587(sb, str, i, c10746.f32367, treeMap);
            sb.append(c10746.f32368);
            i = c10746.f32366;
        }
        m38587(sb, str, i, str.length(), treeMap);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38587(StringBuilder sb, String str, int i, int i2, TreeMap treeMap) {
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
