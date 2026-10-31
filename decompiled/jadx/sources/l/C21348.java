package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X65X */
/* JADX INFO: loaded from: classes4.dex */
public final class C21348 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48379(C5637 c5637) {
        HashSet hashSet = new HashSet();
        ArrayList<C4931> arrayList = c5637.f17418;
        if (arrayList != null) {
            for (C4931 c4931 : arrayList) {
                hashSet.add(c4931.f15561);
                hashSet.add(c4931.f15559);
                for (C13334 c13334 : c4931.f15560) {
                    hashSet.add(c13334);
                }
            }
        }
        ArrayList arrayList2 = c5637.f17412;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((C8459) it.next()).getClass();
                hashSet.add(null);
                hashSet.add(null);
            }
        }
        for (AbstractC1591 first = c5637.f17411.getFirst(); first != null; first = first.m5439()) {
            if (first instanceof InterfaceC3457) {
                hashSet.add(((InterfaceC3457) first).mo10582());
            } else if (first instanceof AbstractC22507) {
                AbstractC22507 abstractC22507 = (AbstractC22507) first;
                hashSet.add(abstractC22507.f72831);
                for (C13334 c13335 : abstractC22507.f72830) {
                    hashSet.add(c13335);
                }
            }
        }
        ArrayList arrayList3 = c5637.f17414;
        if (arrayList3 != null) {
            hashSet.addAll(arrayList3);
        }
        C16407 c16407 = c5637.f17411;
        AbstractC1591 first2 = c16407.getFirst();
        while (first2 != null) {
            if (first2.f5638 == EnumC7690.LABEL && ((C13334) first2).f39896 < 0 && !hashSet.contains(first2)) {
                AbstractC1591 abstractC1591M5439 = first2.m5439();
                c16407.m38667(first2);
                first2 = abstractC1591M5439;
            } else {
                first2 = first2.m5439();
            }
        }
    }
}
