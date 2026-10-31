package l;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7991 extends AbstractSet {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract AbstractC20151 iterator();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo21310();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z = set instanceof AbstractC7991;
                int iMo21310 = z ? ((AbstractC7991) set).mo21310() : set.size();
                if (iMo21310 >= 0) {
                    int size = z ? 0 : set.size();
                    if (mo21310() >= size) {
                        AbstractC20151 it = iterator();
                        int i = 0;
                        while (true) {
                            AbstractC1349 abstractC1349 = (AbstractC1349) it;
                            if (!abstractC1349.hasNext()) {
                                if (i != iMo21310) {
                                    if (i < size) {
                                        break;
                                    }
                                    Iterator it2 = set.iterator();
                                    int i2 = 0;
                                    while (it2.hasNext()) {
                                        it2.next();
                                        i2++;
                                        if (i2 > i) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                try {
                                    if (!set.contains(abstractC1349.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
