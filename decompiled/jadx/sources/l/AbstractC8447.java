package l;

import java.util.AbstractSet;

/* JADX INFO: renamed from: l.۠᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8447 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC14754 f25847;

    public AbstractC8447(ConcurrentMapC14754 concurrentMapC14754) {
        this.f25847 = concurrentMapC14754;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25847.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f25847.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f25847.clear();
    }
}
