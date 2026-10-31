package l;

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
public class C2891 implements InterfaceC19825, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC19825 f9230;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f9231;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C2891(InterfaceC19825 interfaceC19825, Object obj) {
        C11003.requireNonNull(interfaceC19825);
        this.f9230 = interfaceC19825;
        this.f9231 = obj;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f9231) {
            zAdd = this.f9230.add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f9231) {
            zContains = this.f9230.contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f9231) {
            zRemove = this.f9230.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f9231) {
            size = this.f9230.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f9231) {
            zIsEmpty = this.f9230.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f9231) {
            array = this.f9230.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f9231) {
            array = this.f9230.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC12063 iterator() {
        return this.f9230.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC7975 spliterator() {
        return this.f9230.spliterator();
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public InterfaceC17664 mo42464stream() {
        return C5378.stream(this.f9230);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public InterfaceC17664 mo42463parallelStream() {
        return C5378.parallelStream(this.f9230);
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public void forEach(Consumer consumer) {
        synchronized (this.f9231) {
            C19846.forEach(this.f9230, consumer);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f9231) {
            zAddAll = this.f9230.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f9231) {
            zContainsAll = this.f9230.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f9231) {
            zRemoveAll = this.f9230.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f9231) {
            zRetainAll = this.f9230.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public boolean removeIf(Predicate predicate) {
        boolean zRemoveIf;
        synchronized (this.f9231) {
            zRemoveIf = C5378.removeIf(this.f9230, predicate);
        }
        return zRemoveIf;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f9231) {
            this.f9230.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f9231) {
            string = this.f9230.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f9231) {
            iHashCode = this.f9230.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f9231) {
            zEquals = this.f9230.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f9231) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
