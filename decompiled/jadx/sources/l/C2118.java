package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2118 extends AbstractC8447 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC14754 f7074;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2118(ConcurrentMapC14754 concurrentMapC14754) {
        super(concurrentMapC14754);
        this.f7074 = concurrentMapC14754;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7741(this.f7074);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        ConcurrentMapC14754 concurrentMapC14754;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (concurrentMapC14754 = this.f7074).get(key)) != null && concurrentMapC14754.f45059.m27496(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f7074.remove(key, entry.getValue());
    }
}
