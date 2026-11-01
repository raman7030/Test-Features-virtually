package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9745 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f26908;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f26909;

    public C9745(ArrayList arrayList, ArrayList arrayList2) {
        this.f26909 = arrayList;
        this.f26908 = arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9745 m22781(ArrayList arrayList, HashSet hashSet, Set set) {
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
        return new C9745(arrayList2, arrayList3);
    }
}
