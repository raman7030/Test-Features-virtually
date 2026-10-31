package l;

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
public final class C0972 extends AbstractC5206 implements List, Cloneable, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient Object f3659;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f3660;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient Type f3661;

    public C0972() {
        this.f3660 = new ArrayList(10);
    }

    public C0972(ArrayList arrayList) {
        this.f3660 = arrayList;
    }

    public C0972(int i) {
        this.f3660 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m3439() {
        return this.f3659;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3436(Object obj) {
        this.f3659 = obj;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Type m3438() {
        return this.f3661;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3433(Type type) {
        this.f3661 = type;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3660.size();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3660.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3660.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f3660.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f3660.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3660.toArray(objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f3660.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f3660.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f3660.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f3660.addAll(collection);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f3660.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f3660.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f3660.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f3660.clear();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f3660.set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f3660.add(i, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return this.f3660.remove(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f3660.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f3660.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f3660.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f3660.listIterator(i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.f3660.subList(i, i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f3660.get(i);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m3435(int i) {
        Object obj = this.f3660.get(i);
        int i2 = C19426.f62834;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m3437(int i) {
        Object obj = this.f3660.get(i);
        if (obj == null) {
            return 0;
        }
        return C19426.m44745(obj).intValue();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21434 m3432(int i) {
        Object obj = this.f3660.get(i);
        if (obj instanceof C21434) {
            return (C21434) obj;
        }
        return (C21434) AbstractC5206.m14982(obj);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0972 m3434(int i) {
        Object obj = this.f3660.get(i);
        if (obj instanceof C0972) {
            return (C0972) obj;
        }
        return (C0972) AbstractC5206.m14982(obj);
    }

    public final Object clone() {
        return new C0972(new ArrayList(this.f3660));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f3660.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f3660.hashCode();
    }
}
