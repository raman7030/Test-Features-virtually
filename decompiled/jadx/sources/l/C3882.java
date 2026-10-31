package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3882 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map f12406;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            Map map = this.f12406;
            for (Map.Entry entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().removeAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            Map map = this.f12406;
            for (Map.Entry entry : map.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return map.keySet().retainAll(hashSet);
        }
    }

    public C3882(Map map) {
        this.f12406 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f12406.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12406.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f12406.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C10938(this.f12406.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f12406.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Map map = this.f12406;
            for (Map.Entry entry : map.entrySet()) {
                if (C11003.equals(obj, entry.getValue())) {
                    map.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }
}
