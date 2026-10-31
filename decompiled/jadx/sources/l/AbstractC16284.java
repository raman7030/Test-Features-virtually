package l;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܽ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBI9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16284 extends ArrayList {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo38308();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        mo38308();
        return super.set(i, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        mo38308();
        return super.add(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        mo38308();
        super.add(i, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        mo38308();
        return super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        mo38308();
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        mo38308();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        mo38308();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        mo38308();
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        mo38308();
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        mo38308();
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        mo38308();
        return super.retainAll(collection);
    }
}
