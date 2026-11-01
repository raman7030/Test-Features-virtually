package p067l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20693 extends AbstractC9963 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Set f63894;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Set f63895;

    @Override // p067l.AbstractC9963
    /* JADX INFO: renamed from: ۧ */
    public final int mo23276() {
        Set set = this.f63894;
        int iMo23276 = set instanceof AbstractC9963 ? ((AbstractC9963) set).mo23276() : set.size();
        Set set2 = this.f63895;
        return Math.min(iMo23276, set2 instanceof AbstractC9963 ? ((AbstractC9963) set2).mo23276() : set2.size());
    }

    public C20693(Set set, Set set2) {
        this.f63894 = set;
        this.f63895 = set2;
    }

    @Override // p067l.AbstractC9963, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        return new C20022(this.f63894, this.f63895);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f63894.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f63895.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f63895, this.f63894);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f63894.contains(obj) && this.f63895.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f63894.containsAll(collection) && this.f63895.containsAll(collection);
    }
}
