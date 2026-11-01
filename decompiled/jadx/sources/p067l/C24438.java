package p067l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩺᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public class C24438 extends C15050 implements SortedSet {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC17970 f77372;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24438(AbstractC17970 abstractC17970, SortedMap sortedMap) {
        super(abstractC17970, sortedMap);
        this.f77372 = abstractC17970;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo28461().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo28461().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C24438(this.f77372, mo28461().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo28461().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C24438(this.f77372, mo28461().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C24438(this.f77372, mo28461().tailMap(obj));
    }

    /* JADX INFO: renamed from: ܽ */
    public SortedMap mo28461() {
        return (SortedMap) this.f29815;
    }
}
