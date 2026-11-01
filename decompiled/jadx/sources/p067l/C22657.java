package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X65X */
/* JADX INFO: loaded from: classes4.dex */
public final class C22657 {
    /* JADX INFO: renamed from: ֫ */
    public static void m50714(C7726 c7726) {
        HashSet hashSet = new HashSet();
        ArrayList<C7055> arrayList = c7726.f20264;
        if (arrayList != null) {
            for (C7055 c7055 : arrayList) {
                hashSet.add(c7055.f18393);
                hashSet.add(c7055.f18391);
                for (C15041 c15041 : c7055.f18392) {
                    hashSet.add(c15041);
                }
            }
        }
        ArrayList arrayList2 = c7726.f20258;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((C10408) it.next()).getClass();
                hashSet.add(null);
                hashSet.add(null);
            }
        }
        for (AbstractC3880 first = c7726.f20257.getFirst(); first != null; first = first.m7669()) {
            if (first instanceof InterfaceC5654) {
                hashSet.add(((InterfaceC5654) first).mo12590());
            } else if (first instanceof AbstractC23759) {
                AbstractC23759 abstractC23759 = (AbstractC23759) first;
                hashSet.add(abstractC23759.f75557);
                for (C15041 c15042 : abstractC23759.f75556) {
                    hashSet.add(c15042);
                }
            }
        }
        ArrayList arrayList3 = c7726.f20260;
        if (arrayList3 != null) {
            hashSet.addAll(arrayList3);
        }
        C17961 c17961 = c7726.f20257;
        AbstractC3880 first2 = c17961.getFirst();
        while (first2 != null) {
            if (first2.f8417 == EnumC9677.LABEL && ((C15041) first2).f42962 < 0 && !hashSet.contains(first2)) {
                AbstractC3880 abstractC3880M7669 = first2.m7669();
                c17961.m40883(first2);
                first2 = abstractC3880M7669;
            } else {
                first2 = first2.m7669();
            }
        }
    }
}
