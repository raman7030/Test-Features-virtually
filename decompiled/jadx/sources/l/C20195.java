package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.᩶۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C20195 {
    public static Collection unmodifiableCollection(Collection collection) {
        return new C18744(collection);
    }

    public static Set unmodifiableSet(Set set) {
        return new C22353(set);
    }

    public static List unmodifiableList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C1104(list);
        }
        return new C15296(list);
    }

    public static Map unmodifiableMap(Map map) {
        return new C13098(map);
    }

    public static SortedMap unmodifiableSortedMap(SortedMap sortedMap) {
        return new C4714(sortedMap);
    }

    public static Set synchronizedSet(Set set) {
        return new C9572(set);
    }

    public static Set bridge_synchronizedSet(Set set, Object obj) {
        return new C9572(set, obj);
    }

    public static List synchronizedList(List list) {
        if (!(list instanceof RandomAccess)) {
            return new C1810(list);
        }
        return new C23682(list);
    }

    public static Map synchronizedMap(Map map) {
        return new C18038(map);
    }
}
