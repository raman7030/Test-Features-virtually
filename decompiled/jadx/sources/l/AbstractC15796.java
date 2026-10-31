package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.ܺ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15796 {
    public static Set a(Set set) {
        EnumC6043 enumC6043;
        Collector.Characteristics characteristics;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC6043) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC6043 enumC6044 = (EnumC6043) it.next();
                    if (enumC6044 == null) {
                        characteristics = null;
                    } else if (enumC6044 == EnumC6043.CONCURRENT) {
                        characteristics = Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics = enumC6044 == EnumC6043.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics);
                } catch (ClassCastException e) {
                    C16461.a(e, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C16461.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics2 = (Collector.Characteristics) it2.next();
                    if (characteristics2 == null) {
                        enumC6043 = null;
                    } else if (characteristics2 == Collector.Characteristics.CONCURRENT) {
                        enumC6043 = EnumC6043.CONCURRENT;
                    } else {
                        enumC6043 = characteristics2 == Collector.Characteristics.UNORDERED ? EnumC6043.UNORDERED : EnumC6043.IDENTITY_FINISH;
                    }
                    hashSet.add(enumC6043);
                } catch (ClassCastException e2) {
                    C16461.a(e2, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
