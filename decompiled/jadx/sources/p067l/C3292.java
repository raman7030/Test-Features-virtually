package p067l;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.֨۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUN */
/* JADX INFO: loaded from: classes3.dex */
public final class C3292 extends AbstractC7316 implements List, Cloneable, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ۤ */
    public transient Object f6434;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f6435;

    /* JADX INFO: renamed from: ۬ */
    public transient Type f6436;

    public C3292() {
        this.f6435 = new ArrayList(10);
    }

    public C3292(ArrayList arrayList) {
        this.f6435 = arrayList;
    }

    public C3292(int i) {
        this.f6435 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Object m5742() {
        return this.f6434;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5739(Object obj) {
        this.f6434 = obj;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Type m5741() {
        return this.f6436;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5736(Type type) {
        this.f6436 = type;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f6435.size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f6435.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6435.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f6435.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f6435.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f6435.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f6435.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f6435.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f6435.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f6435.addAll(collection);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f6435.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f6435.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f6435.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f6435.clear();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f6435.set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f6435.add(i, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f6435.remove(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f6435.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f6435.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f6435.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f6435.listIterator(i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f6435.subList(i, i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f6435.get(i);
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m5738(int i) {
        Object obj = this.f6435.get(i);
        int i2 = C20831.f65447;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m5740(int i) {
        Object obj = this.f6435.get(i);
        if (obj == null) {
            return 0;
        }
        return C20831.m47039(obj).intValue();
    }

    /* JADX INFO: renamed from: ֨ */
    public final C22739 m5735(int i) {
        Object obj = this.f6435.get(i);
        if (obj instanceof C22739) {
            return (C22739) obj;
        }
        return (C22739) AbstractC7316.m16892(obj);
    }

    /* JADX INFO: renamed from: ۚ */
    public final C3292 m5737(int i) {
        Object obj = this.f6435.get(i);
        if (obj instanceof C3292) {
            return (C3292) obj;
        }
        return (C3292) AbstractC7316.m16892(obj);
    }

    public final Object clone() {
        return new C3292(new ArrayList(this.f6435));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f6435.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f6435.hashCode();
    }
}
