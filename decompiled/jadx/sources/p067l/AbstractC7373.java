package p067l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7373 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸ */
    public final Collection f19308;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9936(int i, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9937(Object obj);

    public AbstractC7373(Collection collection) {
        this.f19308 = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C20785(this, this.f19308.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f19308.size();
    }
}
