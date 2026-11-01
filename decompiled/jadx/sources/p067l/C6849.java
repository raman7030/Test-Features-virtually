package p067l;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ۙܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6849 extends C14817 implements SortedMap {
    public static final long serialVersionUID = -8806743815996713206L;

    /* JADX INFO: renamed from: e */
    public final SortedMap f17787e;

    public C6849(SortedMap sortedMap) {
        super(sortedMap);
        this.f17787e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f17787e.comparator();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C6849(this.f17787e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C6849(this.f17787e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C6849(this.f17787e.tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f17787e.firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f17787e.lastKey();
    }
}
