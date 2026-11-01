package p067l;

import java.util.AbstractSet;

/* JADX INFO: renamed from: l.۠᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10397 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ConcurrentMapC16391 f28760;

    public AbstractC10397(ConcurrentMapC16391 concurrentMapC16391) {
        this.f28760 = concurrentMapC16391;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28760.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f28760.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f28760.clear();
    }
}
