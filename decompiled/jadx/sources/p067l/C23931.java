package p067l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.᩺֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D26 */
/* JADX INFO: loaded from: classes.dex */
public class C23931 implements InterfaceC7838, Serializable, InterfaceC3456 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC7838 f76041;

    /* JADX INFO: renamed from: ᩹ */
    public final C12007 f76042;

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final /* synthetic */ void forEach(Consumer consumer) {
        C22176.m49987(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(parallelStream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C11862.m27167(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C23931(InterfaceC13458 interfaceC13458, C12007 c12007) {
        C12826.requireNonNull(interfaceC13458);
        this.f76041 = interfaceC13458;
        this.f76042 = c12007;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ۧ */
    public boolean mo11023(char c) {
        boolean zMo11023;
        synchronized (this.f76042) {
            zMo11023 = this.f76041.mo11023(c);
        }
        return zMo11023;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo11024(char c) {
        boolean zMo11024;
        synchronized (this.f76042) {
            zMo11024 = this.f76041.mo11024(c);
        }
        return zMo11024;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ܿ */
    public boolean mo4382(char c) {
        boolean zMo4382;
        synchronized (this.f76042) {
            zMo4382 = this.f76041.mo4382(c);
        }
        return zMo4382;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f76042) {
            size = this.f76041.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f76042) {
            zIsEmpty = this.f76041.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f76042) {
            array = this.f76041.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public boolean add(Character ch) {
        boolean zAdd;
        synchronized (this.f76042) {
            zAdd = this.f76041.add(ch);
        }
        return zAdd;
    }

    @Override // p067l.InterfaceC7838, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f76042) {
            zContains = this.f76041.contains(obj);
        }
        return zContains;
    }

    @Override // p067l.InterfaceC7838, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f76042) {
            zRemove = this.f76041.remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f76042) {
            array = this.f76041.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC17480 iterator() {
        return this.f76041.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18307 spliterator() {
        return this.f76041.spliterator();
    }

    @Override // p067l.InterfaceC7838, java.util.Collection
    @Deprecated
    public InterfaceC19157 stream() {
        return this.f76041.stream();
    }

    @Override // p067l.InterfaceC7838, java.util.Collection
    @Deprecated
    public InterfaceC19157 parallelStream() {
        return this.f76041.parallelStream();
    }

    @Override // p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public void mo12109(InterfaceC24857 interfaceC24857) {
        synchronized (this.f76042) {
            this.f76041.mo12109(interfaceC24857);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.f76042) {
            zAddAll = this.f76041.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.f76042) {
            zContainsAll = this.f76041.containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.f76042) {
            zRemoveAll = this.f76041.removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.f76042) {
            zRetainAll = this.f76041.retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ֫ */
    public boolean mo18126(InterfaceC8093 interfaceC8093) {
        boolean zMo18126;
        synchronized (this.f76042) {
            zMo18126 = this.f76041.mo18126(interfaceC8093);
        }
        return zMo18126;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f76042) {
            this.f76041.clear();
        }
    }

    public String toString() {
        String string;
        synchronized (this.f76042) {
            string = this.f76041.toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f76042) {
            iHashCode = this.f76041.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f76042) {
            zEquals = this.f76041.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f76042) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
