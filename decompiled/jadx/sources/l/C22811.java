package l;

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
public class C22811 implements Collection, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = 3053995032091335093L;
    public final Collection a;
    public final Object b;

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C22811(Collection collection) {
        this.a = (Collection) C11003.requireNonNull(collection);
        this.b = this;
    }

    public C22811(Collection collection, Object obj) {
        this.a = (Collection) C11003.requireNonNull(collection);
        this.b = C11003.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = this.a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.b) {
            zContains = this.a.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.b) {
            array = this.a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.b) {
            array = this.a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.b) {
            zAdd = this.a.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.b) {
            zRemove = this.a.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.b) {
            zContainsAll = this.a.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.b) {
            zAddAll = this.a.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.b) {
            zRemoveAll = this.a.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.b) {
            zRetainAll = this.a.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        synchronized (this.b) {
            C5378.a(this.a, consumer);
        }
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.b) {
            zRemoveIf = C5378.removeIf(this.a, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return C8180.convert(C5378.b(this.a));
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return C5378.b(this.a);
    }

    @Override // java.util.Collection
    public final Stream stream() {
        return C18370.convert(C5378.stream(this.a));
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C5378.stream(this.a);
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return C18370.convert(C5378.parallelStream(this.a));
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public final InterfaceC17664 mo42463parallelStream() {
        return C5378.parallelStream(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
