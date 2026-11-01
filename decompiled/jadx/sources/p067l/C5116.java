package p067l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۗ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F5 */
/* JADX INFO: loaded from: classes3.dex */
public class C5116 implements InterfaceC21210, Serializable, InterfaceC3456 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC21210 f12028;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f12029;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
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

    public C5116(InterfaceC21210 interfaceC21210, Object obj) {
        C12826.requireNonNull(interfaceC21210);
        this.f12028 = interfaceC21210;
        this.f12029 = obj;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f12029) {
            zAdd = this.f12028.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f12029) {
            zContains = this.f12028.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f12029) {
            zRemove = this.f12028.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f12029) {
            size = this.f12028.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f12029) {
            zIsEmpty = this.f12028.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f12029) {
            array = this.f12028.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f12029) {
            array = this.f12028.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC13833 iterator() {
        return this.f12028.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC9948 spliterator() {
        return this.f12028.spliterator();
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public InterfaceC19157 mo56528stream() {
        return C7480.stream(this.f12028);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public InterfaceC19157 mo56527parallelStream() {
        return C7480.parallelStream(this.f12028);
    }

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public void forEach(Consumer consumer) {
        synchronized (this.f12029) {
            C21230.forEach(this.f12028, consumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f12029) {
            zAddAll = this.f12028.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f12029) {
            zContainsAll = this.f12028.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f12029) {
            zRemoveAll = this.f12028.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f12029) {
            zRetainAll = this.f12028.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f12029) {
            zRemoveIf = C7480.removeIf(this.f12028, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f12029) {
            this.f12028.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f12029) {
            string = this.f12028.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f12029) {
            iHashCode = this.f12028.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f12029) {
            zEquals = this.f12028.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f12029) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
