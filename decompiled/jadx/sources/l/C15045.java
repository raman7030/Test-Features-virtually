package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܶۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15045 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC6079 m35587(Enum r0, Enum... enumArr) {
        return C7203.m19282(EnumSet.of(r0, enumArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashSet m35585(int i) {
        int iCeil;
        if (i < 3) {
            C22061.m49620(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC7991 m35588(Set set, AbstractC6079 abstractC6079) {
        C4025.m12106(set, "set1");
        C4025.m12106(abstractC6079, "set2");
        return new C19281(set, abstractC6079);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m35586(Set set, InterfaceC18842 interfaceC18842) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof C0229)) {
                return new C5169(collection, interfaceC18842);
            }
            C0229 c0229 = (C0229) collection;
            return new C5169((SortedSet) c0229.f36329, C0496.m2169(c0229.f36328, interfaceC18842));
        }
        if (!(set instanceof C0229)) {
            set.getClass();
            return new C0229(set, interfaceC18842);
        }
        C0229 c02210 = (C0229) set;
        return new C0229((Set) c02210.f36329, C0496.m2169(c02210.f36328, interfaceC18842));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35584(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35589(Set set, Object obj) {
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
