package l;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ۙܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4714 extends C13098 implements SortedMap {
    public static final long serialVersionUID = -8806743815996713206L;
    public final SortedMap e;

    public C4714(SortedMap sortedMap) {
        super(sortedMap);
        this.e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.e.comparator();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C4714(this.e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C4714(this.e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C4714(this.e.tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.e.firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.e.lastKey();
    }
}
