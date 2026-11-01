package p067l;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C15110 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ConcurrentMapC16391 f43138;

    public C15110(ConcurrentMapC16391 concurrentMapC16391) {
        this.f43138 = concurrentMapC16391;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f43138.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f43138.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f43138.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7064(this.f43138);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f43138.containsValue(obj);
    }
}
