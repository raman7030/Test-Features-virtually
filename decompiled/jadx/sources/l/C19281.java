package l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19281 extends AbstractC7991 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f60664;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f60665;

    @Override // l.AbstractC7991
    /* JADX INFO: renamed from: ۧ */
    public final int mo21310() {
        Set set = this.f60664;
        int iMo21310 = set instanceof AbstractC7991 ? ((AbstractC7991) set).mo21310() : set.size();
        Set set2 = this.f60665;
        return Math.min(iMo21310, set2 instanceof AbstractC7991 ? ((AbstractC7991) set2).mo21310() : set2.size());
    }

    public C19281(Set set, Set set2) {
        this.f60664 = set;
        this.f60665 = set2;
    }

    @Override // l.AbstractC7991, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        return new C18575(this.f60664, this.f60665);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f60664.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f60665.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f60665, this.f60664);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f60664.contains(obj) && this.f60665.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f60664.containsAll(collection) && this.f60665.containsAll(collection);
    }
}
