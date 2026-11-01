package p067l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۨ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C13710 extends C21757 implements SortedMap {

    /* JADX INFO: renamed from: ۗ */
    public SortedSet f38690;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AbstractC17970 f38691;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13710(AbstractC17970 abstractC17970, SortedMap sortedMap) {
        super(abstractC17970, sortedMap);
        this.f38691 = abstractC17970;
    }

    /* JADX INFO: renamed from: ۧ */
    public SortedMap mo31170() {
        return (SortedMap) this.f68511;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo31170().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo31170().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo31170().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C13710(this.f38691, mo31170().headMap(obj));
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C13710(this.f38691, mo31170().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C13710(this.f38691, mo31170().tailMap(obj));
    }

    @Override // p067l.C21757, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public SortedSet keySet() {
        SortedSet sortedSet = this.f38690;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo31169 = mo31169();
        this.f38690 = sortedSetMo31169;
        return sortedSetMo31169;
    }

    /* JADX INFO: renamed from: ֫ */
    public SortedSet mo31169() {
        return new C24438(this.f38691, mo31170());
    }
}
