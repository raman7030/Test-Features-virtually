package p067l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ᩳᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19689 implements InterfaceC12984, Serializable, InterfaceC3456 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC12984 f59847;

    /* JADX INFO: renamed from: ᩹ */
    public final C22942 f59848;

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final /* synthetic */ void forEach(Consumer consumer) {
        C21031.m47445(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C4266.m8670(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C19689(InterfaceC12984 interfaceC12984, C22942 c22942) {
        C12826.requireNonNull(interfaceC12984);
        this.f59847 = interfaceC12984;
        this.f59848 = c22942;
    }

    @Override // p067l.InterfaceC12984
    public final boolean add(float f) {
        boolean zAdd;
        synchronized (this.f59848) {
            zAdd = this.f59847.add(f);
        }
        return zAdd;
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo18969(float f) {
        boolean zMo18969;
        synchronized (this.f59848) {
            zMo18969 = this.f59847.mo18969(f);
        }
        return zMo18969;
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6350(float f) {
        boolean zMo6350;
        synchronized (this.f59848) {
            zMo6350 = this.f59847.mo6350(f);
        }
        return zMo6350;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f59848) {
            size = this.f59847.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f59848) {
            zIsEmpty = this.f59847.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f59848) {
            array = this.f59847.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public final boolean add(Float f) {
        boolean zAdd;
        synchronized (this.f59848) {
            zAdd = this.f59847.add(f);
        }
        return zAdd;
    }

    @Override // p067l.InterfaceC12984, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f59848) {
            zContains = this.f59847.contains(obj);
        }
        return zContains;
    }

    @Override // p067l.InterfaceC12984, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f59848) {
            zRemove = this.f59847.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f59848) {
            array = this.f59847.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f59847.iterator();
    }

    @Override // p067l.InterfaceC12984, java.util.Collection, java.lang.Iterable, p067l.InterfaceC2924
    public final InterfaceC3595 iterator() {
        return this.f59847.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return this.f59847.spliterator();
    }

    @Override // p067l.InterfaceC12984, java.util.Collection, java.lang.Iterable
    public final InterfaceC18327 spliterator() {
        return this.f59847.spliterator();
    }

    @Override // p067l.InterfaceC12984, p067l.InterfaceC3456
    @Deprecated
    /* JADX INFO: renamed from: stream, reason: collision with other method in class */
    public final InterfaceC19157 mo56528stream() {
        return this.f59847.mo56528stream();
    }

    @Override // p067l.InterfaceC12984, p067l.InterfaceC3456
    @Deprecated
    /* JADX INFO: renamed from: parallelStream, reason: collision with other method in class */
    public final InterfaceC19157 mo56527parallelStream() {
        return this.f59847.mo56527parallelStream();
    }

    @Override // p067l.InterfaceC2924
    /* JADX INFO: renamed from: ۧ */
    public final void mo4794(InterfaceC6278 interfaceC6278) {
        synchronized (this.f59848) {
            this.f59847.mo4794(interfaceC6278);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f59848) {
            zAddAll = this.f59847.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f59848) {
            zContainsAll = this.f59847.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f59848) {
            zRemoveAll = this.f59847.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f59848) {
            zRetainAll = this.f59847.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14152(InterfaceC24382 interfaceC24382) {
        boolean zMo14152;
        synchronized (this.f59848) {
            zMo14152 = this.f59847.mo14152(interfaceC24382);
        }
        return zMo14152;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f59848) {
            this.f59847.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f59848) {
            string = this.f59847.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f59848) {
            iHashCode = this.f59847.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f59848) {
            zEquals = this.f59847.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f59848) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
