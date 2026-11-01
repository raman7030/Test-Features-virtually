package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4382 extends AbstractC10397 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ConcurrentMapC16391 f9859;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4382(ConcurrentMapC16391 concurrentMapC16391) {
        super(concurrentMapC16391);
        this.f9859 = concurrentMapC16391;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C9726(this.f9859);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        ConcurrentMapC16391 concurrentMapC16391;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (concurrentMapC16391 = this.f9859).get(key)) != null && concurrentMapC16391.f48172.m29558(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f9859.remove(key, entry.getValue());
    }
}
