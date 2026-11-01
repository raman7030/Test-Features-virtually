package p067l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.ܺ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17381 {
    /* JADX INFO: renamed from: a */
    public static Set m39424a(Set set) {
        EnumC8112 enumC8112;
        Collector.Characteristics characteristics;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC8112) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC8112 enumC8113 = (EnumC8112) it.next();
                    if (enumC8113 == null) {
                        characteristics = null;
                    } else if (enumC8113 == EnumC8112.CONCURRENT) {
                        characteristics = Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics = enumC8113 == EnumC8112.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics);
                } catch (ClassCastException e) {
                    C18013.m40990a(e, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C18013.m40990a(next.getClass(), "java.util.stream.Collector.Characteristics");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics2 = (Collector.Characteristics) it2.next();
                    if (characteristics2 == null) {
                        enumC8112 = null;
                    } else if (characteristics2 == Collector.Characteristics.CONCURRENT) {
                        enumC8112 = EnumC8112.CONCURRENT;
                    } else {
                        enumC8112 = characteristics2 == Collector.Characteristics.UNORDERED ? EnumC8112.UNORDERED : EnumC8112.IDENTITY_FINISH;
                    }
                    hashSet.add(enumC8112);
                } catch (ClassCastException e2) {
                    C18013.m40990a(e2, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
