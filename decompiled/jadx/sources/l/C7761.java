package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7761 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f23994;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23995;

    public C7761(ArrayList arrayList, ArrayList arrayList2) {
        this.f23995 = arrayList;
        this.f23994 = arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7761 m20800(ArrayList arrayList, HashSet hashSet, Set set) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.contains(str)) {
                if (set.contains(str)) {
                    arrayList3.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
        }
        if (!arrayList3.isEmpty() && !set.contains("mo")) {
            arrayList2.add("mo");
        }
        return new C7761(arrayList2, arrayList3);
    }
}
