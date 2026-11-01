package p067l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܶۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16667 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m37745(Enum r0, Enum... enumArr) {
        return C9214.m21229(EnumSet.of(r0, enumArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashSet m37743(int i) {
        int iCeil;
        if (i < 3) {
            C23335.m51956(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC9963 m37746(Set set, AbstractC8146 abstractC8146) {
        C6194.m14026(set, "set1");
        C6194.m14026(abstractC8146, "set2");
        return new C20693(set, abstractC8146);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Set m37744(Set set, InterfaceC20276 interfaceC20276) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof C2586)) {
                return new C7281(collection, interfaceC20276);
            }
            C2586 c2586 = (C2586) collection;
            return new C7281((SortedSet) c2586.f39340, C2840.m4536(c2586.f39339, interfaceC20276));
        }
        if (!(set instanceof C2586)) {
            set.getClass();
            return new C2586(set, interfaceC20276);
        }
        C2586 c2587 = (C2586) set;
        return new C2586((Set) c2587.f39340, C2840.m4536(c2587.f39339, interfaceC20276));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37742(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m37747(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
