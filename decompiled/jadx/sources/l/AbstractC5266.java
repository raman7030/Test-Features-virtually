package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5266 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Collection f16471;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo7888(int i, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo7889(Object obj);

    public AbstractC5266(Collection collection) {
        this.f16471 = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C19378(this, this.f16471.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f16471.size();
    }
}
