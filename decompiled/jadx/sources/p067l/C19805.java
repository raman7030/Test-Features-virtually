package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19805 extends AbstractC10397 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ConcurrentMapC16391 f60234;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19805(ConcurrentMapC16391 concurrentMapC16391) {
        super(concurrentMapC16391);
        this.f60234 = concurrentMapC16391;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C18463(this.f60234);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f60234.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f60234.remove(obj) != null;
    }
}
