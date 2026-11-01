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

/* JADX INFO: renamed from: l.᩺ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C24048 implements Collection, Serializable, InterfaceC3456 {
    public static final long serialVersionUID = 3053995032091335093L;

    /* JADX INFO: renamed from: a */
    public final Collection f76379a;

    /* JADX INFO: renamed from: b */
    public final Object f76380b;

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C24048(Collection collection) {
        this.f76379a = (Collection) C12826.requireNonNull(collection);
        this.f76380b = this;
    }

    public C24048(Collection collection, Object obj) {
        this.f76379a = (Collection) C12826.requireNonNull(collection);
        this.f76380b = C12826.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f76380b) {
            size = this.f76379a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f76380b) {
            zIsEmpty = this.f76379a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f76380b) {
            zContains = this.f76379a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f76380b) {
            array = this.f76379a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f76380b) {
            array = this.f76379a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f76379a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f76380b) {
            zAdd = this.f76379a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f76380b) {
            zRemove = this.f76379a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f76380b) {
            zContainsAll = this.f76379a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f76380b) {
            zAddAll = this.f76379a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f76380b) {
            zRemoveAll = this.f76379a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f76380b) {
            zRetainAll = this.f76379a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f76380b) {
            this.f76379a.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.f76380b) {
            string = this.f76379a.toString();
        }
        return string;
    }

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        synchronized (this.f76380b) {
            C7480.m17260a(this.f76379a, consumer);
        }
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f76380b) {
            zRemoveIf = C7480.removeIf(this.f76379a, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return C10143.convert(C7480.m17261b(this.f76379a));
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return C7480.m17261b(this.f76379a);
    }

    @Override // java.util.Collection
    public final Stream stream() {
        return C19828.convert(C7480.stream(this.f76379a));
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public final InterfaceC19157 mo56528stream() {
        return C7480.stream(this.f76379a);
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return C19828.convert(C7480.parallelStream(this.f76379a));
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC19157 mo56527parallelStream() {
        return C7480.parallelStream(this.f76379a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f76380b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
