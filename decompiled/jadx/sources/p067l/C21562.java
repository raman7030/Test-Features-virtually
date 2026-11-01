package p067l;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.᩶۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C21562 {
    public static Collection unmodifiableCollection(Collection collection) {
        return new C20183(collection);
    }

    public static Set unmodifiableSet(Set set) {
        return new C23613(set);
    }

    public static List unmodifiableList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C3418(list);
        }
        return new C16906(list);
    }

    public static Map unmodifiableMap(Map map) {
        return new C14817(map);
    }

    public static SortedMap unmodifiableSortedMap(SortedMap sortedMap) {
        return new C6849(sortedMap);
    }

    public static Set synchronizedSet(Set set) {
        return new C11466(set);
    }

    public static Set bridge_synchronizedSet(Set set, Object obj) {
        return new C11466(set, obj);
    }

    public static List synchronizedList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C4089(list);
        }
        return new C24876(list);
    }

    public static Map synchronizedMap(Map map) {
        return new C19512(map);
    }
}
