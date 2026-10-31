package l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩺᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public class C23221 extends C13343 implements SortedSet {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f74629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23221(AbstractC16416 abstractC16416, SortedMap sortedMap) {
        super(abstractC16416, sortedMap);
        this.f74629 = abstractC16416;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo26428().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo26428().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C23221(this.f74629, mo26428().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo26428().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C23221(this.f74629, mo26428().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C23221(this.f74629, mo26428().tailMap(obj));
    }

    /* JADX INFO: renamed from: ܽ */
    public SortedMap mo26428() {
        return (SortedMap) this.f26890;
    }
}
